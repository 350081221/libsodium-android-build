package org.osmdroid.tileprovider;

import android.content.Context;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.INetworkAvailablityCheck;
import org.osmdroid.tileprovider.modules.MapTileApproximater;
import org.osmdroid.tileprovider.modules.MapTileAssetsProvider;
import org.osmdroid.tileprovider.modules.MapTileDownloader;
import org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider;
import org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase;
import org.osmdroid.tileprovider.modules.MapTileFilesystemProvider;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.modules.MapTileSqlCacheProvider;
import org.osmdroid.tileprovider.modules.NetworkAvailabliltyCheck;
import org.osmdroid.tileprovider.modules.SqlTileWriter;
import org.osmdroid.tileprovider.modules.TileWriter;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.SimpleRegisterReceiver;
import org.osmdroid.util.MapTileAreaBorderComputer;
import org.osmdroid.util.MapTileAreaZoomComputer;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class MapTileProviderBasic extends MapTileProviderArray implements IMapTileProviderCallback {
    private final MapTileApproximater mApproximationProvider;
    private final MapTileDownloader mDownloaderProvider;
    private final INetworkAvailablityCheck mNetworkAvailabilityCheck;
    protected IFilesystemCache tileWriter;

    public MapTileProviderBasic(Context context) {
        this(context, TileSourceFactory.DEFAULT_TILE_SOURCE);
    }

    public static MapTileFileStorageProviderBase getMapTileFileStorageProviderBase(IRegisterReceiver iRegisterReceiver, e eVar, IFilesystemCache iFilesystemCache) {
        if (iFilesystemCache instanceof TileWriter) {
            return new MapTileFilesystemProvider(iRegisterReceiver, eVar);
        }
        return new MapTileSqlCacheProvider(iRegisterReceiver, eVar);
    }

    protected MapTileApproximater createApproximater(MapTileFileStorageProviderBase mapTileFileStorageProviderBase, MapTileFileStorageProviderBase mapTileFileStorageProviderBase2, MapTileFileStorageProviderBase mapTileFileStorageProviderBase3) {
        MapTileApproximater mapTileApproximater = new MapTileApproximater();
        mapTileApproximater.addProvider(mapTileFileStorageProviderBase);
        mapTileApproximater.addProvider(mapTileFileStorageProviderBase2);
        mapTileApproximater.addProvider(mapTileFileStorageProviderBase3);
        return mapTileApproximater;
    }

    protected MapTileFileStorageProviderBase createArchiveProvider(IRegisterReceiver iRegisterReceiver, e eVar) {
        return new MapTileFileArchiveProvider(iRegisterReceiver, eVar);
    }

    protected MapTileFileStorageProviderBase createAssetsProvider(IRegisterReceiver iRegisterReceiver, e eVar, Context context) {
        return new MapTileAssetsProvider(iRegisterReceiver, context.getAssets(), eVar);
    }

    protected MapTileDownloader createDownloaderProvider(INetworkAvailablityCheck iNetworkAvailablityCheck, e eVar) {
        return new MapTileDownloader(eVar, this.tileWriter, iNetworkAvailablityCheck);
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray, org.osmdroid.tileprovider.MapTileProviderBase
    public void detach() {
        IFilesystemCache iFilesystemCache = this.tileWriter;
        if (iFilesystemCache != null) {
            iFilesystemCache.onDetach();
        }
        this.tileWriter = null;
        super.detach();
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray, org.osmdroid.tileprovider.MapTileProviderBase
    public IFilesystemCache getTileWriter() {
        return this.tileWriter;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray
    protected boolean isDowngradedMode(long j5) {
        int zoom;
        INetworkAvailablityCheck iNetworkAvailablityCheck = this.mNetworkAvailabilityCheck;
        if ((iNetworkAvailablityCheck != null && !iNetworkAvailablityCheck.getNetworkAvailable()) || !useDataConnection()) {
            return true;
        }
        int i5 = -1;
        int i6 = -1;
        for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
            if (mapTileModuleProviderBase.getUsesDataConnection()) {
                int minimumZoomLevel = mapTileModuleProviderBase.getMinimumZoomLevel();
                if (i5 == -1 || i5 > minimumZoomLevel) {
                    i5 = minimumZoomLevel;
                }
                int maximumZoomLevel = mapTileModuleProviderBase.getMaximumZoomLevel();
                if (i6 == -1 || i6 < maximumZoomLevel) {
                    i6 = maximumZoomLevel;
                }
            }
        }
        if (i5 == -1 || i6 == -1 || (zoom = MapTileIndex.getZoom(j5)) < i5 || zoom > i6) {
            return true;
        }
        return false;
    }

    public boolean setOfflineFirst(boolean z4) {
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
            if (i5 == -1 && mapTileModuleProviderBase == this.mDownloaderProvider) {
                i5 = i7;
            }
            if (i6 == -1 && mapTileModuleProviderBase == this.mApproximationProvider) {
                i6 = i7;
            }
            i7++;
        }
        if (i5 == -1 || i6 == -1) {
            return false;
        }
        if (i6 < i5 && z4) {
            return true;
        }
        if (i6 > i5 && !z4) {
            return true;
        }
        this.mTileProviderList.set(i5, this.mApproximationProvider);
        this.mTileProviderList.set(i6, this.mDownloaderProvider);
        return true;
    }

    public MapTileProviderBasic(Context context, e eVar) {
        this(context, eVar, null);
    }

    public MapTileProviderBasic(Context context, e eVar, IFilesystemCache iFilesystemCache) {
        this(new SimpleRegisterReceiver(context), new NetworkAvailabliltyCheck(context), eVar, context, iFilesystemCache);
    }

    public MapTileProviderBasic(IRegisterReceiver iRegisterReceiver, INetworkAvailablityCheck iNetworkAvailablityCheck, e eVar, Context context, IFilesystemCache iFilesystemCache) {
        super(eVar, iRegisterReceiver);
        this.mNetworkAvailabilityCheck = iNetworkAvailablityCheck;
        if (iFilesystemCache != null) {
            this.tileWriter = iFilesystemCache;
        } else {
            this.tileWriter = new SqlTileWriter();
        }
        MapTileFileStorageProviderBase createAssetsProvider = createAssetsProvider(iRegisterReceiver, eVar, context);
        this.mTileProviderList.add(createAssetsProvider);
        MapTileFileStorageProviderBase mapTileFileStorageProviderBase = getMapTileFileStorageProviderBase(iRegisterReceiver, eVar, this.tileWriter);
        this.mTileProviderList.add(mapTileFileStorageProviderBase);
        MapTileFileStorageProviderBase createArchiveProvider = createArchiveProvider(iRegisterReceiver, eVar);
        this.mTileProviderList.add(createArchiveProvider);
        MapTileApproximater createApproximater = createApproximater(createAssetsProvider, mapTileFileStorageProviderBase, createArchiveProvider);
        this.mApproximationProvider = createApproximater;
        this.mTileProviderList.add(createApproximater);
        MapTileDownloader createDownloaderProvider = createDownloaderProvider(iNetworkAvailablityCheck, eVar);
        this.mDownloaderProvider = createDownloaderProvider;
        this.mTileProviderList.add(createDownloaderProvider);
        getTileCache().getProtectedTileComputers().add(new MapTileAreaZoomComputer(-1));
        getTileCache().getProtectedTileComputers().add(new MapTileAreaBorderComputer(1));
        getTileCache().setAutoEnsureCapacity(false);
        getTileCache().setStressedMemory(false);
        getTileCache().getPreCache().addProvider(createAssetsProvider);
        getTileCache().getPreCache().addProvider(mapTileFileStorageProviderBase);
        getTileCache().getPreCache().addProvider(createArchiveProvider);
        getTileCache().getPreCache().addProvider(createDownloaderProvider);
        getTileCache().getProtectedTileContainers().add(this);
        setOfflineFirst(true);
    }
}

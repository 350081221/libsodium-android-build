package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.MapTileRequestState;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.TileSystem;
import org.osmdroid.util.UrlBackoff;

/* loaded from: classes4.dex */
public class MapTileDownloader extends MapTileModuleProviderBase {
    private final IFilesystemCache mFilesystemCache;
    private final INetworkAvailablityCheck mNetworkAvailablityCheck;
    private TileDownloader mTileDownloader;
    private final TileLoader mTileLoader;
    private final AtomicReference<OnlineTileSourceBase> mTileSource;
    private final UrlBackoff mUrlBackoff;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        protected Drawable downloadTile(long j5, int i5, String str) throws CantContinueException {
            OnlineTileSourceBase onlineTileSourceBase = (OnlineTileSourceBase) MapTileDownloader.this.mTileSource.get();
            if (onlineTileSourceBase == null) {
                return null;
            }
            try {
                onlineTileSourceBase.acquire();
                try {
                    return MapTileDownloader.this.mTileDownloader.downloadTile(j5, i5, str, MapTileDownloader.this.mFilesystemCache, onlineTileSourceBase);
                } finally {
                    onlineTileSourceBase.release();
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j5) throws CantContinueException {
            OnlineTileSourceBase onlineTileSourceBase = (OnlineTileSourceBase) MapTileDownloader.this.mTileSource.get();
            if (onlineTileSourceBase == null) {
                return null;
            }
            if (MapTileDownloader.this.mNetworkAvailablityCheck != null && !MapTileDownloader.this.mNetworkAvailablityCheck.getNetworkAvailable()) {
                if (a.a().M()) {
                    Log.d(IMapView.LOGTAG, "Skipping " + MapTileDownloader.this.getName() + " due to NetworkAvailabliltyCheck.");
                }
                return null;
            }
            String tileURLString = onlineTileSourceBase.getTileURLString(j5);
            if (TextUtils.isEmpty(tileURLString) || MapTileDownloader.this.mUrlBackoff.shouldWait(tileURLString)) {
                return null;
            }
            Drawable downloadTile = downloadTile(j5, 0, tileURLString);
            if (downloadTile == null) {
                MapTileDownloader.this.mUrlBackoff.next(tileURLString);
            } else {
                MapTileDownloader.this.mUrlBackoff.remove(tileURLString);
            }
            return downloadTile;
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        protected void tileLoaded(MapTileRequestState mapTileRequestState, Drawable drawable) {
            MapTileDownloader.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            mapTileRequestState.getCallback().mapTileRequestCompleted(mapTileRequestState, null);
            BitmapPool.getInstance().asyncRecycle(drawable);
        }
    }

    public MapTileDownloader(e eVar) {
        this(eVar, null, null);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        super.detach();
        IFilesystemCache iFilesystemCache = this.mFilesystemCache;
        if (iFilesystemCache != null) {
            iFilesystemCache.onDetach();
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        OnlineTileSourceBase onlineTileSourceBase = this.mTileSource.get();
        if (onlineTileSourceBase != null) {
            return onlineTileSourceBase.getMaximumZoomLevel();
        }
        return TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        OnlineTileSourceBase onlineTileSourceBase = this.mTileSource.get();
        if (onlineTileSourceBase != null) {
            return onlineTileSourceBase.getMinimumZoomLevel();
        }
        return 0;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "Online Tile Download Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "downloader";
    }

    public e getTileSource() {
        return this.mTileSource.get();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return true;
    }

    public void setTileDownloader(TileDownloader tileDownloader) {
        this.mTileDownloader = tileDownloader;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(e eVar) {
        if (eVar instanceof OnlineTileSourceBase) {
            this.mTileSource.set((OnlineTileSourceBase) eVar);
        } else {
            this.mTileSource.set(null);
        }
    }

    public MapTileDownloader(e eVar, IFilesystemCache iFilesystemCache) {
        this(eVar, iFilesystemCache, null);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return this.mTileLoader;
    }

    public MapTileDownloader(e eVar, IFilesystemCache iFilesystemCache, INetworkAvailablityCheck iNetworkAvailablityCheck) {
        this(eVar, iFilesystemCache, iNetworkAvailablityCheck, a.a().J(), a.a().c());
    }

    public MapTileDownloader(e eVar, IFilesystemCache iFilesystemCache, INetworkAvailablityCheck iNetworkAvailablityCheck, int i5, int i6) {
        super(i5, i6);
        this.mTileSource = new AtomicReference<>();
        this.mTileLoader = new TileLoader();
        this.mUrlBackoff = new UrlBackoff();
        this.mTileDownloader = new TileDownloader();
        this.mFilesystemCache = iFilesystemCache;
        this.mNetworkAvailablityCheck = iNetworkAvailablityCheck;
        setTileSource(eVar);
    }
}

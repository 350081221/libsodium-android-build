package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileContainer;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileProviderArray extends MapTileProviderBase implements MapTileContainer {
    private static final int WORKING_STATUS_FOUND = 1;
    private static final int WORKING_STATUS_STARTED = 0;
    private IRegisterReceiver mRegisterReceiver;
    protected final List<MapTileModuleProviderBase> mTileProviderList;
    private final Map<Long, Integer> mWorking;

    /* JADX INFO: Access modifiers changed from: protected */
    public MapTileProviderArray(e eVar, IRegisterReceiver iRegisterReceiver) {
        this(eVar, iRegisterReceiver, new MapTileModuleProviderBase[0]);
    }

    private void remove(long j5) {
        synchronized (this.mWorking) {
            this.mWorking.remove(Long.valueOf(j5));
        }
    }

    private void runAsyncNextProvider(MapTileRequestState mapTileRequestState) {
        Integer num;
        MapTileModuleProviderBase findNextAppropriateProvider = findNextAppropriateProvider(mapTileRequestState);
        if (findNextAppropriateProvider != null) {
            findNextAppropriateProvider.loadMapTileAsync(mapTileRequestState);
            return;
        }
        synchronized (this.mWorking) {
            num = this.mWorking.get(Long.valueOf(mapTileRequestState.getMapTile()));
        }
        if (num != null && num.intValue() == 0) {
            super.mapTileRequestFailed(mapTileRequestState);
        }
        remove(mapTileRequestState.getMapTile());
    }

    @Override // org.osmdroid.util.MapTileContainer
    public boolean contains(long j5) {
        boolean containsKey;
        synchronized (this.mWorking) {
            containsKey = this.mWorking.containsKey(Long.valueOf(j5));
        }
        return containsKey;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public void detach() {
        synchronized (this.mTileProviderList) {
            Iterator<MapTileModuleProviderBase> it = this.mTileProviderList.iterator();
            while (it.hasNext()) {
                it.next().detach();
            }
        }
        synchronized (this.mWorking) {
            this.mWorking.clear();
        }
        IRegisterReceiver iRegisterReceiver = this.mRegisterReceiver;
        if (iRegisterReceiver != null) {
            iRegisterReceiver.destroy();
            this.mRegisterReceiver = null;
        }
        super.detach();
    }

    protected MapTileModuleProviderBase findNextAppropriateProvider(MapTileRequestState mapTileRequestState) {
        MapTileModuleProviderBase nextProvider;
        boolean z4;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (true) {
            nextProvider = mapTileRequestState.getNextProvider();
            if (nextProvider != null) {
                boolean z8 = true;
                z5 = !getProviderExists(nextProvider);
                if (!useDataConnection() && nextProvider.getUsesDataConnection()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int zoom = MapTileIndex.getZoom(mapTileRequestState.getMapTile());
                if (zoom <= nextProvider.getMaximumZoomLevel() && zoom >= nextProvider.getMinimumZoomLevel()) {
                    z8 = false;
                }
                boolean z9 = z4;
                z7 = z8;
                z6 = z9;
            }
            if (nextProvider == null || (!z5 && !z6 && !z7)) {
                break;
            }
        }
        return nextProvider;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public Drawable getMapTile(long j5) {
        Drawable mapTile = this.mTileCache.getMapTile(j5);
        if (mapTile != null) {
            if (ExpirableBitmapDrawable.getState(mapTile) == -1) {
                return mapTile;
            }
            if (isDowngradedMode(j5)) {
                return mapTile;
            }
        }
        synchronized (this.mWorking) {
            if (this.mWorking.containsKey(Long.valueOf(j5))) {
                return mapTile;
            }
            this.mWorking.put(Long.valueOf(j5), 0);
            runAsyncNextProvider(new MapTileRequestState(j5, this.mTileProviderList, this));
            return mapTile;
        }
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public int getMaximumZoomLevel() {
        int i5;
        synchronized (this.mTileProviderList) {
            i5 = 0;
            for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
                if (mapTileModuleProviderBase.getMaximumZoomLevel() > i5) {
                    i5 = mapTileModuleProviderBase.getMaximumZoomLevel();
                }
            }
        }
        return i5;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public int getMinimumZoomLevel() {
        int maximumZoomLevel = TileSystem.getMaximumZoomLevel();
        synchronized (this.mTileProviderList) {
            for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
                if (mapTileModuleProviderBase.getMinimumZoomLevel() < maximumZoomLevel) {
                    maximumZoomLevel = mapTileModuleProviderBase.getMinimumZoomLevel();
                }
            }
        }
        return maximumZoomLevel;
    }

    public boolean getProviderExists(MapTileModuleProviderBase mapTileModuleProviderBase) {
        return this.mTileProviderList.contains(mapTileModuleProviderBase);
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public long getQueueSize() {
        long size;
        synchronized (this.mWorking) {
            size = this.mWorking.size();
        }
        return size;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public IFilesystemCache getTileWriter() {
        return null;
    }

    @Deprecated
    protected boolean isDowngradedMode() {
        return false;
    }

    protected boolean isDowngradedMode(long j5) {
        return false;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase, org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestCompleted(MapTileRequestState mapTileRequestState, Drawable drawable) {
        super.mapTileRequestCompleted(mapTileRequestState, drawable);
        remove(mapTileRequestState.getMapTile());
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase, org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestExpiredTile(MapTileRequestState mapTileRequestState, Drawable drawable) {
        super.mapTileRequestExpiredTile(mapTileRequestState, drawable);
        synchronized (this.mWorking) {
            this.mWorking.put(Long.valueOf(mapTileRequestState.getMapTile()), 1);
        }
        runAsyncNextProvider(mapTileRequestState);
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase, org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailed(MapTileRequestState mapTileRequestState) {
        runAsyncNextProvider(mapTileRequestState);
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase, org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailedExceedsMaxQueueSize(MapTileRequestState mapTileRequestState) {
        super.mapTileRequestFailed(mapTileRequestState);
        remove(mapTileRequestState.getMapTile());
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderBase
    public void setTileSource(e eVar) {
        super.setTileSource(eVar);
        synchronized (this.mTileProviderList) {
            Iterator<MapTileModuleProviderBase> it = this.mTileProviderList.iterator();
            while (it.hasNext()) {
                it.next().setTileSource(eVar);
                clearTileCache();
            }
        }
    }

    public MapTileProviderArray(e eVar, IRegisterReceiver iRegisterReceiver, MapTileModuleProviderBase[] mapTileModuleProviderBaseArr) {
        super(eVar);
        this.mWorking = new HashMap();
        this.mRegisterReceiver = iRegisterReceiver;
        ArrayList arrayList = new ArrayList();
        this.mTileProviderList = arrayList;
        Collections.addAll(arrayList, mapTileModuleProviderBaseArr);
    }
}

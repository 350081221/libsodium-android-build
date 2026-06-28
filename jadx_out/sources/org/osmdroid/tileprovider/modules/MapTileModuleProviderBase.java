package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.MapTileRequestState;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public abstract class MapTileModuleProviderBase {
    private final ExecutorService mExecutor;
    protected final LinkedHashMap<Long, MapTileRequestState> mPending;
    protected final Object mQueueLockObject = new Object();
    protected final HashMap<Long, MapTileRequestState> mWorking;

    /* loaded from: classes4.dex */
    public abstract class TileLoader implements Runnable {
        public TileLoader() {
        }

        public abstract Drawable loadTile(long j5) throws CantContinueException;

        @Deprecated
        protected Drawable loadTile(MapTileRequestState mapTileRequestState) throws CantContinueException {
            return loadTileIfReachable(mapTileRequestState.getMapTile());
        }

        public Drawable loadTileIfReachable(long j5) throws CantContinueException {
            if (!MapTileModuleProviderBase.this.isTileReachable(j5)) {
                return null;
            }
            return loadTile(j5);
        }

        protected MapTileRequestState nextTile() {
            MapTileRequestState mapTileRequestState;
            synchronized (MapTileModuleProviderBase.this.mQueueLockObject) {
                mapTileRequestState = null;
                Long l5 = null;
                for (Long l6 : MapTileModuleProviderBase.this.mPending.keySet()) {
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(l6)) {
                        if (a.a().k()) {
                            Log.d(IMapView.LOGTAG, "TileLoader.nextTile() on provider: " + MapTileModuleProviderBase.this.getName() + " found tile in working queue: " + MapTileIndex.toString(l6.longValue()));
                        }
                        l5 = l6;
                    }
                }
                if (l5 != null) {
                    if (a.a().k()) {
                        Log.d(IMapView.LOGTAG, "TileLoader.nextTile() on provider: " + MapTileModuleProviderBase.this.getName() + " adding tile to working queue: " + l5);
                    }
                    MapTileModuleProviderBase mapTileModuleProviderBase = MapTileModuleProviderBase.this;
                    mapTileModuleProviderBase.mWorking.put(l5, mapTileModuleProviderBase.mPending.get(l5));
                }
                if (l5 != null) {
                    mapTileRequestState = MapTileModuleProviderBase.this.mPending.get(l5);
                }
            }
            return mapTileRequestState;
        }

        protected void onTileLoaderInit() {
        }

        protected void onTileLoaderShutdown() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00a2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r6 = this;
                r6.onTileLoaderInit()
            L3:
                org.osmdroid.tileprovider.MapTileRequestState r0 = r6.nextTile()
                if (r0 == 0) goto Lbf
                org.osmdroid.config.c r1 = org.osmdroid.config.a.a()
                boolean r1 = r1.k()
                java.lang.String r2 = "OsmDroid"
                if (r1 == 0) goto L51
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "TileLoader.run() processing next tile: "
                r1.append(r3)
                long r3 = r0.getMapTile()
                java.lang.String r3 = org.osmdroid.util.MapTileIndex.toString(r3)
                r1.append(r3)
                java.lang.String r3 = ", pending:"
                r1.append(r3)
                org.osmdroid.tileprovider.modules.MapTileModuleProviderBase r3 = org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.this
                java.util.LinkedHashMap<java.lang.Long, org.osmdroid.tileprovider.MapTileRequestState> r3 = r3.mPending
                int r3 = r3.size()
                r1.append(r3)
                java.lang.String r3 = ", working:"
                r1.append(r3)
                org.osmdroid.tileprovider.modules.MapTileModuleProviderBase r3 = org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.this
                java.util.HashMap<java.lang.Long, org.osmdroid.tileprovider.MapTileRequestState> r3 = r3.mWorking
                int r3 = r3.size()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r2, r1)
            L51:
                long r3 = r0.getMapTile()     // Catch: java.lang.Throwable -> L5a org.osmdroid.tileprovider.modules.CantContinueException -> L78
                android.graphics.drawable.Drawable r1 = r6.loadTileIfReachable(r3)     // Catch: java.lang.Throwable -> L5a org.osmdroid.tileprovider.modules.CantContinueException -> L78
                goto L9b
            L5a:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Error downloading tile: "
                r3.append(r4)
                long r4 = r0.getMapTile()
                java.lang.String r4 = org.osmdroid.util.MapTileIndex.toString(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.i(r2, r3, r1)
                goto L9a
            L78:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Tile loader can't continue: "
                r3.append(r4)
                long r4 = r0.getMapTile()
                java.lang.String r4 = org.osmdroid.util.MapTileIndex.toString(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.i(r2, r3, r1)
                org.osmdroid.tileprovider.modules.MapTileModuleProviderBase r1 = org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.this
                org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.access$000(r1)
            L9a:
                r1 = 0
            L9b:
                if (r1 != 0) goto La2
                r6.tileLoadedFailed(r0)
                goto L3
            La2:
                int r2 = org.osmdroid.tileprovider.ExpirableBitmapDrawable.getState(r1)
                r3 = -2
                if (r2 != r3) goto Lae
                r6.tileLoadedExpired(r0, r1)
                goto L3
            Lae:
                int r2 = org.osmdroid.tileprovider.ExpirableBitmapDrawable.getState(r1)
                r3 = -3
                if (r2 != r3) goto Lba
                r6.tileLoadedScaled(r0, r1)
                goto L3
            Lba:
                r6.tileLoaded(r0, r1)
                goto L3
            Lbf:
                r6.onTileLoaderShutdown()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader.run():void");
        }

        protected void tileLoaded(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoaded() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -1);
            mapTileRequestState.getCallback().mapTileRequestCompleted(mapTileRequestState, drawable);
        }

        protected void tileLoadedExpired(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedExpired() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -2);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }

        protected void tileLoadedFailed(MapTileRequestState mapTileRequestState) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedFailed() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            mapTileRequestState.getCallback().mapTileRequestFailed(mapTileRequestState);
        }

        protected void tileLoadedScaled(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "TileLoader.tileLoadedScaled() on provider: " + MapTileModuleProviderBase.this.getName() + " with tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -3);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }
    }

    public MapTileModuleProviderBase(int i5, final int i6) {
        if (i6 < i5) {
            Log.w(IMapView.LOGTAG, "The pending queue size is smaller than the thread pool size. Automatically reducing the thread pool size.");
            i5 = i6;
        }
        this.mExecutor = Executors.newFixedThreadPool(i5, new ConfigurablePriorityThreadFactory(5, getThreadGroupName()));
        this.mWorking = new HashMap<>();
        this.mPending = new LinkedHashMap<Long, MapTileRequestState>(i6 + 2, 0.1f, true) { // from class: org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.1
            private static final long serialVersionUID = 6455337315681858866L;

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Long, MapTileRequestState> entry) {
                MapTileRequestState mapTileRequestState;
                if (size() <= i6) {
                    return false;
                }
                Iterator<Long> it = MapTileModuleProviderBase.this.mPending.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue = it.next().longValue();
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(Long.valueOf(longValue)) && (mapTileRequestState = MapTileModuleProviderBase.this.mPending.get(Long.valueOf(longValue))) != null) {
                        MapTileModuleProviderBase.this.removeTileFromQueues(longValue);
                        mapTileRequestState.getCallback().mapTileRequestFailedExceedsMaxQueueSize(mapTileRequestState);
                        break;
                    }
                }
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueue() {
        synchronized (this.mQueueLockObject) {
            this.mPending.clear();
            this.mWorking.clear();
        }
    }

    public void detach() {
        clearQueue();
        this.mExecutor.shutdown();
    }

    public abstract int getMaximumZoomLevel();

    public abstract int getMinimumZoomLevel();

    protected abstract String getName();

    protected abstract String getThreadGroupName();

    public abstract TileLoader getTileLoader();

    public abstract boolean getUsesDataConnection();

    public boolean isTileReachable(long j5) {
        int zoom = MapTileIndex.getZoom(j5);
        if (zoom >= getMinimumZoomLevel() && zoom <= getMaximumZoomLevel()) {
            return true;
        }
        return false;
    }

    public void loadMapTileAsync(MapTileRequestState mapTileRequestState) {
        if (this.mExecutor.isShutdown()) {
            return;
        }
        synchronized (this.mQueueLockObject) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() on provider: " + getName() + " for tile: " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
                if (this.mPending.containsKey(Long.valueOf(mapTileRequestState.getMapTile()))) {
                    Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() tile already exists in request queue for modular provider. Moving to front of queue.");
                } else {
                    Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.loadMaptileAsync() adding tile to request queue for modular provider.");
                }
            }
            this.mPending.put(Long.valueOf(mapTileRequestState.getMapTile()), mapTileRequestState);
        }
        try {
            this.mExecutor.execute(getTileLoader());
        } catch (RejectedExecutionException e5) {
            Log.w(IMapView.LOGTAG, "RejectedExecutionException", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void removeTileFromQueues(long j5) {
        synchronized (this.mQueueLockObject) {
            if (a.a().k()) {
                Log.d(IMapView.LOGTAG, "MapTileModuleProviderBase.removeTileFromQueues() on provider: " + getName() + " for tile: " + MapTileIndex.toString(j5));
            }
            this.mPending.remove(Long.valueOf(j5));
            this.mWorking.remove(Long.valueOf(j5));
        }
    }

    public abstract void setTileSource(e eVar);
}

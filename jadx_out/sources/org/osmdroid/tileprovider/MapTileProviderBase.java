package org.osmdroid.tileprovider;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.MapTileApproximater;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.PointL;
import org.osmdroid.util.RectL;
import org.osmdroid.util.TileLooper;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public abstract class MapTileProviderBase implements IMapTileProviderCallback {
    public static final int MAPTILE_FAIL_ID = 1;
    public static final int MAPTILE_SUCCESS_ID = 0;
    private static int sApproximationBackgroundColor = -3355444;
    protected final MapTileCache mTileCache;
    protected Drawable mTileNotFoundImage;
    private final Collection<Handler> mTileRequestCompleteHandlers;
    private e mTileSource;
    protected boolean mUseDataConnection;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public abstract class ScaleTileLooper extends TileLooper {
        private boolean isWorth;
        protected Paint mDebugPaint;
        protected Rect mDestRect;
        protected int mDiff;
        protected final HashMap<Long, Bitmap> mNewTiles;
        protected int mOldTileZoomLevel;
        protected Rect mSrcRect;
        protected int mTileSize;
        protected int mTileSize_2;

        private ScaleTileLooper() {
            this.mNewTiles = new HashMap<>();
        }

        protected abstract void computeTile(long j5, int i5, int i6);

        @Override // org.osmdroid.util.TileLooper
        public void finaliseLoop() {
            while (!this.mNewTiles.isEmpty()) {
                long longValue = this.mNewTiles.keySet().iterator().next().longValue();
                putScaledTileIntoCache(longValue, this.mNewTiles.remove(Long.valueOf(longValue)));
            }
        }

        @Override // org.osmdroid.util.TileLooper
        public void handleTile(long j5, int i5, int i6) {
            if (this.isWorth && MapTileProviderBase.this.getMapTile(j5) == null) {
                try {
                    computeTile(j5, i5, i6);
                } catch (OutOfMemoryError unused) {
                    Log.e(IMapView.LOGTAG, "OutOfMemoryError rescaling cache");
                }
            }
        }

        @Override // org.osmdroid.util.TileLooper
        public void initialiseLoop() {
            boolean z4;
            super.initialiseLoop();
            int abs = Math.abs(this.mTileZoomLevel - this.mOldTileZoomLevel);
            this.mDiff = abs;
            this.mTileSize_2 = this.mTileSize >> abs;
            if (abs != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.isWorth = z4;
        }

        public void loop(double d5, RectL rectL, double d6, int i5) {
            this.mSrcRect = new Rect();
            this.mDestRect = new Rect();
            this.mDebugPaint = new Paint();
            this.mOldTileZoomLevel = TileSystem.getInputTileZoomLevel(d6);
            this.mTileSize = i5;
            loop(d5, rectL);
        }

        protected void putScaledTileIntoCache(long j5, Bitmap bitmap) {
            MapTileProviderBase.this.putTileIntoCache(j5, new ReusableBitmapDrawable(bitmap), -3);
            if (a.a().M()) {
                Log.d(IMapView.LOGTAG, "Created scaled tile: " + MapTileIndex.toString(j5));
                this.mDebugPaint.setTextSize(40.0f);
                new Canvas(bitmap).drawText("scaled", 50.0f, 50.0f, this.mDebugPaint);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ZoomInTileLooper extends ScaleTileLooper {
        private ZoomInTileLooper() {
            super();
        }

        @Override // org.osmdroid.tileprovider.MapTileProviderBase.ScaleTileLooper
        public void computeTile(long j5, int i5, int i6) {
            Bitmap approximateTileFromLowerZoom;
            Drawable mapTile = MapTileProviderBase.this.mTileCache.getMapTile(MapTileIndex.getTileIndex(this.mOldTileZoomLevel, MapTileIndex.getX(j5) >> this.mDiff, MapTileIndex.getY(j5) >> this.mDiff));
            if ((mapTile instanceof BitmapDrawable) && (approximateTileFromLowerZoom = MapTileApproximater.approximateTileFromLowerZoom((BitmapDrawable) mapTile, j5, this.mDiff)) != null) {
                this.mNewTiles.put(Long.valueOf(j5), approximateTileFromLowerZoom);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class ZoomOutTileLooper extends ScaleTileLooper {
        private static final int MAX_ZOOM_OUT_DIFF = 4;

        private ZoomOutTileLooper() {
            super();
        }

        @Override // org.osmdroid.tileprovider.MapTileProviderBase.ScaleTileLooper
        protected void computeTile(long j5, int i5, int i6) {
            Bitmap bitmap;
            if (this.mDiff >= 4) {
                return;
            }
            int x4 = MapTileIndex.getX(j5) << this.mDiff;
            int y4 = MapTileIndex.getY(j5);
            int i7 = this.mDiff;
            int i8 = y4 << i7;
            int i9 = 1 << i7;
            Bitmap bitmap2 = null;
            Canvas canvas = null;
            for (int i10 = 0; i10 < i9; i10++) {
                for (int i11 = 0; i11 < i9; i11++) {
                    Drawable mapTile = MapTileProviderBase.this.mTileCache.getMapTile(MapTileIndex.getTileIndex(this.mOldTileZoomLevel, x4 + i10, i8 + i11));
                    if ((mapTile instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) mapTile).getBitmap()) != null) {
                        if (bitmap2 == null) {
                            bitmap2 = MapTileApproximater.getTileBitmap(this.mTileSize);
                            canvas = new Canvas(bitmap2);
                            canvas.drawColor(MapTileProviderBase.sApproximationBackgroundColor);
                        }
                        Rect rect = this.mDestRect;
                        int i12 = this.mTileSize_2;
                        rect.set(i10 * i12, i11 * i12, (i10 + 1) * i12, i12 * (i11 + 1));
                        canvas.drawBitmap(bitmap, (Rect) null, this.mDestRect, (Paint) null);
                    }
                }
            }
            if (bitmap2 != null) {
                this.mNewTiles.put(Long.valueOf(j5), bitmap2);
            }
        }
    }

    public MapTileProviderBase(e eVar) {
        this(eVar, null);
    }

    private void sendMessage(int i5) {
        for (int i6 = 0; i6 < 3 && !sendMessageFailFast(i5); i6++) {
        }
    }

    private boolean sendMessageFailFast(int i5) {
        for (Handler handler : this.mTileRequestCompleteHandlers) {
            try {
                if (handler != null) {
                    handler.sendEmptyMessage(i5);
                }
            } catch (ConcurrentModificationException unused) {
                return false;
            }
        }
        return true;
    }

    public static void setApproximationBackgroundColor(int i5) {
        sApproximationBackgroundColor = i5;
    }

    public void clearTileCache() {
        this.mTileCache.clear();
    }

    public MapTileCache createTileCache() {
        return new MapTileCache();
    }

    public void detach() {
        clearTileCache();
        Drawable drawable = this.mTileNotFoundImage;
        if (drawable != null && (drawable instanceof ReusableBitmapDrawable)) {
            BitmapPool.getInstance().returnDrawableToPool((ReusableBitmapDrawable) this.mTileNotFoundImage);
        }
        this.mTileNotFoundImage = null;
        clearTileCache();
    }

    public void ensureCapacity(int i5) {
        this.mTileCache.ensureCapacity(i5);
    }

    public void expireInMemoryCache(long j5) {
        Drawable mapTile = this.mTileCache.getMapTile(j5);
        if (mapTile != null) {
            ExpirableBitmapDrawable.setState(mapTile, -2);
        }
    }

    public abstract Drawable getMapTile(long j5);

    public abstract int getMaximumZoomLevel();

    public abstract int getMinimumZoomLevel();

    public abstract long getQueueSize();

    public MapTileCache getTileCache() {
        return this.mTileCache;
    }

    public Collection<Handler> getTileRequestCompleteHandlers() {
        return this.mTileRequestCompleteHandlers;
    }

    public e getTileSource() {
        return this.mTileSource;
    }

    public abstract IFilesystemCache getTileWriter();

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestCompleted(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, -1);
        sendMessage(0);
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "MapTileProviderBase.mapTileRequestCompleted(): " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestExpiredTile(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, ExpirableBitmapDrawable.getState(drawable));
        sendMessage(0);
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "MapTileProviderBase.mapTileRequestExpiredTile(): " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailed(MapTileRequestState mapTileRequestState) {
        if (this.mTileNotFoundImage != null) {
            putTileIntoCache(mapTileRequestState.getMapTile(), this.mTileNotFoundImage, -4);
            sendMessage(0);
        } else {
            sendMessage(1);
        }
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "MapTileProviderBase.mapTileRequestFailed(): " + MapTileIndex.toString(mapTileRequestState.getMapTile()));
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailedExceedsMaxQueueSize(MapTileRequestState mapTileRequestState) {
        mapTileRequestFailed(mapTileRequestState);
    }

    @Deprecated
    protected void putExpiredTileIntoCache(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, -2);
    }

    protected void putTileIntoCache(long j5, Drawable drawable, int i5) {
        if (drawable == null) {
            return;
        }
        Drawable mapTile = this.mTileCache.getMapTile(j5);
        if (mapTile != null && ExpirableBitmapDrawable.getState(mapTile) > i5) {
            return;
        }
        ExpirableBitmapDrawable.setState(drawable, i5);
        this.mTileCache.putTile(j5, drawable);
    }

    public void rescaleCache(Projection projection, double d5, double d6, Rect rect) {
        ScaleTileLooper zoomOutTileLooper;
        if (TileSystem.getInputTileZoomLevel(d5) == TileSystem.getInputTileZoomLevel(d6)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a.a().k()) {
            Log.i(IMapView.LOGTAG, "rescale tile cache from " + d6 + " to " + d5);
        }
        PointL mercatorPixels = projection.toMercatorPixels(rect.left, rect.top, null);
        PointL mercatorPixels2 = projection.toMercatorPixels(rect.right, rect.bottom, null);
        RectL rectL = new RectL(mercatorPixels.f21839x, mercatorPixels.f21840y, mercatorPixels2.f21839x, mercatorPixels2.f21840y);
        if (d5 > d6) {
            zoomOutTileLooper = new ZoomInTileLooper();
        } else {
            zoomOutTileLooper = new ZoomOutTileLooper();
        }
        zoomOutTileLooper.loop(d5, rectL, d6, getTileSource().getTileSizePixels());
        long currentTimeMillis2 = System.currentTimeMillis();
        if (a.a().k()) {
            Log.i(IMapView.LOGTAG, "Finished rescale in " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        }
    }

    public void setTileLoadFailureImage(Drawable drawable) {
        this.mTileNotFoundImage = drawable;
    }

    @Deprecated
    public void setTileRequestCompleteHandler(Handler handler) {
        this.mTileRequestCompleteHandlers.clear();
        this.mTileRequestCompleteHandlers.add(handler);
    }

    public void setTileSource(e eVar) {
        this.mTileSource = eVar;
        clearTileCache();
    }

    public void setUseDataConnection(boolean z4) {
        this.mUseDataConnection = z4;
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public boolean useDataConnection() {
        return this.mUseDataConnection;
    }

    public MapTileProviderBase(e eVar, Handler handler) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mTileRequestCompleteHandlers = linkedHashSet;
        this.mUseDataConnection = true;
        this.mTileNotFoundImage = null;
        this.mTileCache = createTileCache();
        linkedHashSet.add(handler);
        this.mTileSource = eVar;
    }
}

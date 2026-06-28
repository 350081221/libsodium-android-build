package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;
import com.android.dx.io.Opcodes;
import java.io.File;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.library.R;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.ReusableBitmapDrawable;
import org.osmdroid.tileprovider.TileStates;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.RectL;
import org.osmdroid.util.TileLooper;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.drawing.a;

/* loaded from: classes4.dex */
public class TilesOverlay extends Overlay implements IOverlayMenuProvider {
    public static final ColorFilter INVERT_COLORS;
    static final float[] negate;
    private Context ctx;
    private ColorFilter currentColorFilter;
    private boolean horizontalWrapEnabled;
    private Rect mCanvasRect;
    protected final Paint mDebugPaint;
    private final Rect mIntersectionRect;
    private int mLoadingBackgroundColor;
    private int mLoadingLineColor;
    private BitmapDrawable mLoadingTile;
    private boolean mOptionsMenuEnabled;
    protected Projection mProjection;
    private final Rect mProtectedTiles;
    private final OverlayTileLooper mTileLooper;
    protected final MapTileProviderBase mTileProvider;
    private final Rect mTileRect;
    private final TileStates mTileStates;
    protected final RectL mViewPort;
    protected Drawable userSelectedLoadingDrawable;
    private boolean verticalWrapEnabled;
    public static final int MENU_MAP_MODE = Overlay.getSafeMenuId();
    public static final int MENU_TILE_SOURCE_STARTING_ID = Overlay.getSafeMenuIdSequence(TileSourceFactory.getTileSources().size());
    public static final int MENU_OFFLINE = Overlay.getSafeMenuId();
    public static final int MENU_SNAPSHOT = Overlay.getSafeMenuId();
    public static final int MENU_STATES = Overlay.getSafeMenuId();

    static {
        float[] fArr = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        negate = fArr;
        INVERT_COLORS = new ColorMatrixColorFilter(fArr);
    }

    public TilesOverlay(MapTileProviderBase mapTileProviderBase, Context context) {
        this(mapTileProviderBase, context, true, true);
    }

    private void clearLoadingTile() {
        BitmapDrawable bitmapDrawable = this.mLoadingTile;
        this.mLoadingTile = null;
        BitmapPool.getInstance().asyncRecycle(bitmapDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable getLoadingTile() {
        int i5;
        Drawable drawable = this.userSelectedLoadingDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (this.mLoadingTile == null && this.mLoadingBackgroundColor != 0) {
            try {
                if (this.mTileProvider.getTileSource() != null) {
                    i5 = this.mTileProvider.getTileSource().getTileSizePixels();
                } else {
                    i5 = 256;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                canvas.drawColor(this.mLoadingBackgroundColor);
                paint.setColor(this.mLoadingLineColor);
                paint.setStrokeWidth(0.0f);
                int i6 = i5 / 16;
                for (int i7 = 0; i7 < i5; i7 += i6) {
                    float f5 = i7;
                    float f6 = i5;
                    canvas.drawLine(0.0f, f5, f6, f5, paint);
                    canvas.drawLine(f5, 0.0f, f5, f6, paint);
                }
                this.mLoadingTile = new BitmapDrawable(createBitmap);
            } catch (NullPointerException unused) {
                Log.e(IMapView.LOGTAG, "NullPointerException getting loading tile");
                System.gc();
            } catch (OutOfMemoryError unused2) {
                Log.e(IMapView.LOGTAG, "OutOfMemoryError getting loading tile");
                System.gc();
            }
        }
        return this.mLoadingTile;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (a.a().k()) {
            Log.d(IMapView.LOGTAG, "onDraw");
        }
        if (!setViewPort(canvas, projection)) {
            return;
        }
        drawTiles(canvas, getProjection(), getProjection().getZoomLevel(), this.mViewPort);
    }

    public void drawTiles(Canvas canvas, Projection projection, double d5, RectL rectL) {
        this.mProjection = projection;
        this.mTileLooper.loop(d5, rectL, canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Rect getCanvasRect() {
        return this.mCanvasRect;
    }

    public int getLoadingBackgroundColor() {
        return this.mLoadingBackgroundColor;
    }

    public int getLoadingLineColor() {
        return this.mLoadingLineColor;
    }

    public int getMaximumZoomLevel() {
        return this.mTileProvider.getMaximumZoomLevel();
    }

    public int getMinimumZoomLevel() {
        return this.mTileProvider.getMinimumZoomLevel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Projection getProjection() {
        return this.mProjection;
    }

    public TileStates getTileStates() {
        return this.mTileStates;
    }

    public boolean isHorizontalWrapEnabled() {
        return this.horizontalWrapEnabled;
    }

    public boolean isOptionsMenuEnabled() {
        return this.mOptionsMenuEnabled;
    }

    public boolean isVerticalWrapEnabled() {
        return this.verticalWrapEnabled;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView) {
        int i6;
        SubMenu icon = menu.addSubMenu(0, 0, 0, R.string.F).setIcon(R.drawable.f21663e);
        for (int i7 = 0; i7 < TileSourceFactory.getTileSources().size(); i7++) {
            icon.add(MENU_MAP_MODE + i5, MENU_TILE_SOURCE_STARTING_ID + i7 + i5, 0, TileSourceFactory.getTileSources().get(i7).name());
        }
        icon.setGroupCheckable(MENU_MAP_MODE + i5, true, true);
        Context context = this.ctx;
        if (context != null) {
            if (mapView.useDataConnection()) {
                i6 = R.string.Q;
            } else {
                i6 = R.string.R;
            }
            menu.add(0, MENU_OFFLINE + i5, 0, context.getString(i6)).setIcon(this.ctx.getResources().getDrawable(R.drawable.f21665g));
            menu.add(0, MENU_SNAPSHOT + i5, 0, R.string.T);
            menu.add(0, MENU_STATES + i5, 0, R.string.U);
        }
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.mTileProvider.detach();
        this.ctx = null;
        BitmapPool.getInstance().asyncRecycle(this.mLoadingTile);
        this.mLoadingTile = null;
        BitmapPool.getInstance().asyncRecycle(this.userSelectedLoadingDrawable);
        this.userSelectedLoadingDrawable = null;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView) {
        int itemId = menuItem.getItemId() - i5;
        int i6 = MENU_TILE_SOURCE_STARTING_ID;
        if (itemId >= i6 && itemId < TileSourceFactory.getTileSources().size() + i6) {
            mapView.setTileSource(TileSourceFactory.getTileSources().get(itemId - i6));
            return true;
        }
        if (itemId == MENU_OFFLINE) {
            mapView.setUseDataConnection(!mapView.useDataConnection());
            return true;
        }
        if (itemId == MENU_STATES) {
            Toast.makeText(mapView.getContext(), this.mTileStates.toString(), 0).show();
            return true;
        }
        if (itemId != MENU_SNAPSHOT) {
            return false;
        }
        Thread thread = new Thread(new org.osmdroid.views.drawing.a(new a.InterfaceC0651a() { // from class: org.osmdroid.views.overlay.TilesOverlay.1
            @Override // org.osmdroid.views.drawing.a.InterfaceC0651a
            public void callback(org.osmdroid.views.drawing.a aVar) {
                if (aVar.c() != a.b.CANVAS_OK) {
                    return;
                }
                aVar.m(new File(org.osmdroid.config.a.a().u(), "snapshot.png"));
                aVar.e();
            }
        }, 1, mapView));
        thread.setName("TilesOverlaySnapShotThread");
        thread.start();
        return true;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView) {
        int i6;
        int indexOf = TileSourceFactory.getTileSources().indexOf(mapView.getTileProvider().getTileSource());
        if (indexOf >= 0) {
            menu.findItem(MENU_TILE_SOURCE_STARTING_ID + indexOf + i5).setChecked(true);
        }
        MenuItem findItem = menu.findItem(MENU_OFFLINE + i5);
        if (mapView.useDataConnection()) {
            i6 = R.string.Q;
        } else {
            i6 = R.string.R;
        }
        findItem.setTitle(i6);
        return true;
    }

    protected void onTileReadyToDraw(Canvas canvas, Drawable drawable, Rect rect) {
        drawable.setColorFilter(this.currentColorFilter);
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        Rect canvasRect = getCanvasRect();
        if (canvasRect == null) {
            drawable.draw(canvas);
        } else {
            if (!this.mIntersectionRect.setIntersect(canvas.getClipBounds(), canvasRect)) {
                return;
            }
            canvas.save();
            canvas.clipRect(this.mIntersectionRect);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public void protectDisplayedTilesForCache(Canvas canvas, Projection projection) {
        if (!setViewPort(canvas, projection)) {
            return;
        }
        TileSystem.getTileFromMercator(this.mViewPort, TileSystem.getTileSize(this.mProjection.getZoomLevel()), this.mProtectedTiles);
        this.mTileProvider.getTileCache().getMapTileArea().set(TileSystem.getInputTileZoomLevel(this.mProjection.getZoomLevel()), this.mProtectedTiles);
        this.mTileProvider.getTileCache().maintenance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setCanvasRect(Rect rect) {
        this.mCanvasRect = rect;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
    }

    public void setHorizontalWrapEnabled(boolean z4) {
        this.horizontalWrapEnabled = z4;
        this.mTileLooper.setHorizontalWrapEnabled(z4);
    }

    public void setLoadingBackgroundColor(int i5) {
        if (this.mLoadingBackgroundColor != i5) {
            this.mLoadingBackgroundColor = i5;
            clearLoadingTile();
        }
    }

    public void setLoadingDrawable(Drawable drawable) {
        this.userSelectedLoadingDrawable = drawable;
    }

    public void setLoadingLineColor(int i5) {
        if (this.mLoadingLineColor != i5) {
            this.mLoadingLineColor = i5;
            clearLoadingTile();
        }
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z4) {
        this.mOptionsMenuEnabled = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setProjection(Projection projection) {
        this.mProjection = projection;
    }

    public void setUseDataConnection(boolean z4) {
        this.mTileProvider.setUseDataConnection(z4);
    }

    public void setVerticalWrapEnabled(boolean z4) {
        this.verticalWrapEnabled = z4;
        this.mTileLooper.setVerticalWrapEnabled(z4);
    }

    protected boolean setViewPort(Canvas canvas, Projection projection) {
        setProjection(projection);
        getProjection().getMercatorViewPort(this.mViewPort);
        return true;
    }

    public boolean useDataConnection() {
        return this.mTileProvider.useDataConnection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class OverlayTileLooper extends TileLooper {
        private Canvas mCanvas;

        public OverlayTileLooper() {
        }

        @Override // org.osmdroid.util.TileLooper
        public void finaliseLoop() {
            TilesOverlay.this.mTileStates.finaliseLoop();
        }

        @Override // org.osmdroid.util.TileLooper
        public void handleTile(long j5, int i5, int i6) {
            ReusableBitmapDrawable reusableBitmapDrawable;
            Drawable mapTile = TilesOverlay.this.mTileProvider.getMapTile(j5);
            TilesOverlay.this.mTileStates.handleTile(mapTile);
            if (this.mCanvas == null) {
                return;
            }
            boolean z4 = mapTile instanceof ReusableBitmapDrawable;
            if (z4) {
                reusableBitmapDrawable = (ReusableBitmapDrawable) mapTile;
            } else {
                reusableBitmapDrawable = null;
            }
            if (mapTile == null) {
                mapTile = TilesOverlay.this.getLoadingTile();
            }
            if (mapTile != null) {
                TilesOverlay tilesOverlay = TilesOverlay.this;
                tilesOverlay.mProjection.getPixelFromTile(i5, i6, tilesOverlay.mTileRect);
                if (z4) {
                    reusableBitmapDrawable.beginUsingDrawable();
                }
                if (z4) {
                    try {
                        if (!reusableBitmapDrawable.isBitmapValid()) {
                            mapTile = TilesOverlay.this.getLoadingTile();
                            z4 = false;
                        }
                    } finally {
                        if (z4) {
                            reusableBitmapDrawable.finishUsingDrawable();
                        }
                    }
                }
                TilesOverlay tilesOverlay2 = TilesOverlay.this;
                tilesOverlay2.onTileReadyToDraw(this.mCanvas, mapTile, tilesOverlay2.mTileRect);
            }
            if (org.osmdroid.config.a.a().k()) {
                TilesOverlay tilesOverlay3 = TilesOverlay.this;
                tilesOverlay3.mProjection.getPixelFromTile(i5, i6, tilesOverlay3.mTileRect);
                this.mCanvas.drawText(MapTileIndex.toString(j5), TilesOverlay.this.mTileRect.left + 1, TilesOverlay.this.mTileRect.top + TilesOverlay.this.mDebugPaint.getTextSize(), TilesOverlay.this.mDebugPaint);
                this.mCanvas.drawLine(TilesOverlay.this.mTileRect.left, TilesOverlay.this.mTileRect.top, TilesOverlay.this.mTileRect.right, TilesOverlay.this.mTileRect.top, TilesOverlay.this.mDebugPaint);
                this.mCanvas.drawLine(TilesOverlay.this.mTileRect.left, TilesOverlay.this.mTileRect.top, TilesOverlay.this.mTileRect.left, TilesOverlay.this.mTileRect.bottom, TilesOverlay.this.mDebugPaint);
            }
        }

        @Override // org.osmdroid.util.TileLooper
        public void initialiseLoop() {
            Rect rect = this.mTiles;
            TilesOverlay.this.mTileProvider.ensureCapacity((((rect.bottom - rect.top) + 1) * ((rect.right - rect.left) + 1)) + org.osmdroid.config.a.a().W());
            TilesOverlay.this.mTileStates.initialiseLoop();
            super.initialiseLoop();
        }

        public void loop(double d5, RectL rectL, Canvas canvas) {
            this.mCanvas = canvas;
            loop(d5, rectL);
        }

        public OverlayTileLooper(boolean z4, boolean z5) {
            super(z4, z5);
        }
    }

    public TilesOverlay(MapTileProviderBase mapTileProviderBase, Context context, boolean z4, boolean z5) {
        this.userSelectedLoadingDrawable = null;
        this.mDebugPaint = new Paint();
        this.mTileRect = new Rect();
        this.mViewPort = new RectL();
        this.mOptionsMenuEnabled = true;
        this.mLoadingTile = null;
        this.mLoadingBackgroundColor = Color.rgb(Opcodes.ADD_INT_LIT8, Opcodes.ADD_INT_LIT16, Opcodes.ADD_INT_LIT16);
        this.mLoadingLineColor = Color.rgb(200, 192, 192);
        this.horizontalWrapEnabled = true;
        this.verticalWrapEnabled = true;
        this.currentColorFilter = null;
        this.mProtectedTiles = new Rect();
        this.mTileStates = new TileStates();
        this.mTileLooper = new OverlayTileLooper();
        this.mIntersectionRect = new Rect();
        this.ctx = context;
        if (mapTileProviderBase != null) {
            this.mTileProvider = mapTileProviderBase;
            setHorizontalWrapEnabled(z4);
            setVerticalWrapEnabled(z5);
            return;
        }
        throw new IllegalArgumentException("You must pass a valid tile provider to the tiles overlay.");
    }
}

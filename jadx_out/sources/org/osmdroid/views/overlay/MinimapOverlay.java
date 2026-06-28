package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class MinimapOverlay extends TilesOverlay {
    private int mHeight;
    private int mPadding;
    private final Paint mPaint;
    private int mWidth;
    private int mZoomDifference;

    public MinimapOverlay(Context context, Handler handler, MapTileProviderBase mapTileProviderBase, int i5) {
        super(mapTileProviderBase, context);
        this.mWidth = 100;
        this.mHeight = 100;
        this.mPadding = 10;
        setZoomDifference(i5);
        this.mTileProvider.getTileRequestCompleteHandlers().add(handler);
        setLoadingLineColor(getLoadingBackgroundColor());
        float f5 = context.getResources().getDisplayMetrics().density;
        this.mWidth = (int) (this.mWidth * f5);
        this.mHeight = (int) (this.mHeight * f5);
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-7829368);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2.0f);
    }

    private boolean contains(MotionEvent motionEvent) {
        Rect canvasRect = getCanvasRect();
        if (canvasRect != null && canvasRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.TilesOverlay, org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (!setViewPort(canvas, projection)) {
            return;
        }
        projection.save(canvas, false, true);
        canvas.drawRect(getCanvasRect().left - 2, getCanvasRect().top - 2, getCanvasRect().right + 2, getCanvasRect().bottom + 2, this.mPaint);
        super.drawTiles(canvas, getProjection(), getProjection().getZoomLevel(), this.mViewPort);
        projection.restore(canvas, true);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getPadding() {
        return this.mPadding;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getZoomDifference() {
        return this.mZoomDifference;
    }

    @Override // org.osmdroid.views.overlay.TilesOverlay, org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onDoubleTap(MotionEvent motionEvent, MapView mapView) {
        return contains(motionEvent);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        return contains(motionEvent);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView) {
        return contains(motionEvent);
    }

    public void setHeight(int i5) {
        this.mHeight = i5;
    }

    public void setPadding(int i5) {
        this.mPadding = i5;
    }

    public void setTileSource(e eVar) {
        this.mTileProvider.setTileSource(eVar);
    }

    @Override // org.osmdroid.views.overlay.TilesOverlay
    protected boolean setViewPort(Canvas canvas, Projection projection) {
        double zoomLevel = projection.getZoomLevel() - getZoomDifference();
        if (zoomLevel < this.mTileProvider.getMinimumZoomLevel()) {
            return false;
        }
        int width = (canvas.getWidth() - getPadding()) - getWidth();
        int height = (canvas.getHeight() - getPadding()) - getHeight();
        setCanvasRect(new Rect(width, height, getWidth() + width, getHeight() + height));
        setProjection(projection.getOffspring(zoomLevel, getCanvasRect()));
        getProjection().getMercatorViewPort(this.mViewPort);
        return true;
    }

    public void setWidth(int i5) {
        this.mWidth = i5;
    }

    public void setZoomDifference(int i5) {
        this.mZoomDifference = i5;
    }

    public MinimapOverlay(Context context, Handler handler, MapTileProviderBase mapTileProviderBase) {
        this(context, handler, mapTileProviderBase, 3);
    }

    public MinimapOverlay(Context context, Handler handler) {
        this(context, handler, new MapTileProviderBasic(context));
    }
}

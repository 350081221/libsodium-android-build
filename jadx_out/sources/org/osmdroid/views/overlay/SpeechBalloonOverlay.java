package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.PointL;
import org.osmdroid.util.RectL;
import org.osmdroid.util.SpeechBalloonHelper;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class SpeechBalloonOverlay extends Overlay {
    private Paint mBackground;
    private Paint mDragBackground;
    private float mDragDeltaX;
    private float mDragDeltaY;
    private Paint mDragForeground;
    private float mDragStartX;
    private float mDragStartY;
    private Paint mForeground;
    private GeoPoint mGeoPoint;
    private boolean mIsDragged;
    private int mMargin;
    private int mOffsetX;
    private int mOffsetY;
    private double mRadius;
    private String mTitle;
    private final SpeechBalloonHelper mHelper = new SpeechBalloonHelper();
    private final RectL mRect = new RectL();
    private final PointL mPoint = new PointL();
    private final PointL mIntersection1 = new PointL();
    private final PointL mIntersection2 = new PointL();
    private final Path mPath = new Path();
    private final Rect mTextRect = new Rect();
    private final Point mPixel = new Point();
    private boolean mDraggable = true;

    private boolean hitTest(MotionEvent motionEvent, MapView mapView) {
        return this.mRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        Paint paint;
        Paint paint2;
        String str;
        if (this.mIsDragged) {
            paint = this.mDragBackground;
            if (paint == null) {
                paint = this.mBackground;
            }
            paint2 = this.mDragForeground;
            if (paint2 == null) {
                paint2 = this.mForeground;
            }
        } else {
            paint = this.mBackground;
            paint2 = this.mForeground;
        }
        Paint paint3 = paint;
        Paint paint4 = paint2;
        if (this.mGeoPoint != null && (str = this.mTitle) != null && str.trim().length() != 0 && paint4 != null && paint3 != null) {
            projection.toPixels(this.mGeoPoint, this.mPixel);
            String str2 = this.mTitle;
            paint4.getTextBounds(str2, 0, str2.length(), this.mTextRect);
            PointL pointL = this.mPoint;
            Point point = this.mPixel;
            pointL.set(point.x, point.y);
            Rect rect = this.mTextRect;
            PointL pointL2 = this.mPoint;
            rect.offset((int) (((float) (pointL2.f21839x + this.mOffsetX)) + this.mDragDeltaX), (int) (((float) (pointL2.f21840y + this.mOffsetY)) + this.mDragDeltaY));
            Rect rect2 = this.mTextRect;
            int i5 = rect2.top;
            int i6 = this.mMargin;
            int i7 = i5 - i6;
            rect2.top = i7;
            int i8 = rect2.left - i6;
            rect2.left = i8;
            int i9 = rect2.right + i6;
            rect2.right = i9;
            int i10 = rect2.bottom + i6;
            rect2.bottom = i10;
            this.mRect.set(i8, i7, i9, i10);
            int compute = this.mHelper.compute(this.mRect, this.mPoint, this.mRadius, this.mIntersection1, this.mIntersection2);
            Rect rect3 = this.mTextRect;
            canvas.drawRect(rect3.left, rect3.top, rect3.right, rect3.bottom, paint3);
            if (compute != -1) {
                this.mPath.reset();
                Path path = this.mPath;
                PointL pointL3 = this.mPoint;
                path.moveTo((float) pointL3.f21839x, (float) pointL3.f21840y);
                Path path2 = this.mPath;
                PointL pointL4 = this.mIntersection1;
                path2.lineTo((float) pointL4.f21839x, (float) pointL4.f21840y);
                Path path3 = this.mPath;
                PointL pointL5 = this.mIntersection2;
                path3.lineTo((float) pointL5.f21839x, (float) pointL5.f21840y);
                this.mPath.close();
                canvas.drawPath(this.mPath, paint3);
            }
            int i11 = this.mTextRect.left;
            int i12 = this.mMargin;
            canvas.drawText(str2, i11 + i12, r1.bottom - i12, paint4);
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        boolean hitTest = hitTest(motionEvent, mapView);
        if (hitTest && this.mDraggable) {
            this.mIsDragged = true;
            this.mDragStartX = motionEvent.getX();
            this.mDragStartY = motionEvent.getY();
            this.mDragDeltaX = 0.0f;
            this.mDragDeltaY = 0.0f;
            mapView.invalidate();
        }
        return hitTest;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        if (this.mDraggable && this.mIsDragged) {
            if (motionEvent.getAction() == 1) {
                this.mDragDeltaX = motionEvent.getX() - this.mDragStartX;
                float y4 = motionEvent.getY() - this.mDragStartY;
                this.mOffsetX = (int) (this.mOffsetX + this.mDragDeltaX);
                this.mOffsetY = (int) (this.mOffsetY + y4);
                this.mDragDeltaX = 0.0f;
                this.mDragDeltaY = 0.0f;
                this.mIsDragged = false;
                mapView.invalidate();
                return true;
            }
            if (motionEvent.getAction() == 2) {
                this.mDragDeltaX = motionEvent.getX() - this.mDragStartX;
                this.mDragDeltaY = motionEvent.getY() - this.mDragStartY;
                mapView.invalidate();
                return true;
            }
        }
        return false;
    }

    public void setBackground(Paint paint) {
        this.mBackground = paint;
    }

    public void setDragBackground(Paint paint) {
        this.mDragBackground = paint;
    }

    public void setDragForeground(Paint paint) {
        this.mDragForeground = paint;
    }

    public void setForeground(Paint paint) {
        this.mForeground = paint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.mGeoPoint = geoPoint;
    }

    public void setMargin(int i5) {
        this.mMargin = i5;
    }

    public void setOffset(int i5, int i6) {
        this.mOffsetX = i5;
        this.mOffsetY = i6;
    }

    public void setRadius(long j5) {
        this.mRadius = j5;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}

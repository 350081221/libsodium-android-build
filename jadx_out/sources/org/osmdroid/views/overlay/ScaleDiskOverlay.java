package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.material.timepicker.TimeModel;
import java.util.Locale;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.constants.GeoConstants;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class ScaleDiskOverlay extends Overlay {
    private Paint mCirclePaint1;
    private Paint mCirclePaint2;
    private int mDisplaySizeMax;
    private int mDisplaySizeMin;
    private final GeoPoint mGeoCenter;
    private final String mLabel;
    private Integer mLabelOffsetBottom;
    private Integer mLabelOffsetLeft;
    private Integer mLabelOffsetRight;
    private Integer mLabelOffsetTop;
    private final double mMeters;
    private Paint mTextPaint;
    private final Point mPixelCenter = new Point();
    private final Rect mLabelRect = new Rect();

    public ScaleDiskOverlay(Context context, GeoPoint geoPoint, int i5, GeoConstants.UnitOfMeasure unitOfMeasure) {
        this.mGeoCenter = geoPoint;
        this.mMeters = i5 * unitOfMeasure.getConversionFactorToMeters();
        this.mLabel = ScaleBarOverlay.getScaleString(context, String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i5)), unitOfMeasure);
    }

    private int getOffsetX() {
        return (-this.mLabelRect.width()) / 2;
    }

    private int getOffsetY() {
        return 0;
    }

    private int getOffsetY(int i5) {
        Rect rect = this.mLabelRect;
        return i5 + (-(i5 >= 0 ? rect.top : rect.bottom));
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        projection.toPixels(this.mGeoCenter, this.mPixelCenter);
        Point point = this.mPixelCenter;
        int i5 = point.x;
        int i6 = point.y;
        int metersToPixels = (int) projection.metersToPixels((float) this.mMeters, this.mGeoCenter.getLatitude(), projection.getZoomLevel());
        int i7 = this.mDisplaySizeMin;
        if (i7 > 0 && metersToPixels * 2 < i7) {
            return;
        }
        int i8 = this.mDisplaySizeMax;
        if (i8 > 0 && metersToPixels * 2 > i8) {
            return;
        }
        Paint paint = this.mCirclePaint1;
        if (paint != null) {
            canvas.drawCircle(i5, i6, metersToPixels, paint);
        }
        Paint paint2 = this.mCirclePaint2;
        if (paint2 != null) {
            canvas.drawCircle(i5, i6, metersToPixels, paint2);
        }
        Paint paint3 = this.mTextPaint;
        if (paint3 != null) {
            String str = this.mLabel;
            paint3.getTextBounds(str, 0, str.length(), this.mLabelRect);
            if (this.mLabelOffsetTop != null) {
                canvas.drawText(this.mLabel, getOffsetX() + i5, (-metersToPixels) + getOffsetY(this.mLabelOffsetTop.intValue()) + i6, this.mTextPaint);
            }
            if (this.mLabelOffsetLeft != null) {
                canvas.drawText(this.mLabel, (-metersToPixels) + getOffsetX(r2.intValue()) + i5, getOffsetY() + i6, this.mTextPaint);
            }
            if (this.mLabelOffsetBottom != null) {
                canvas.drawText(this.mLabel, getOffsetX() + i5, getOffsetY(this.mLabelOffsetBottom.intValue()) + metersToPixels + i6, this.mTextPaint);
            }
            if (this.mLabelOffsetRight != null) {
                canvas.drawText(this.mLabel, i5 + metersToPixels + getOffsetX(r2.intValue()), i6 + getOffsetY(), this.mTextPaint);
            }
        }
    }

    public void setCirclePaint1(Paint paint) {
        this.mCirclePaint1 = paint;
    }

    public void setCirclePaint2(Paint paint) {
        this.mCirclePaint2 = paint;
    }

    public void setDisplaySizeMax(int i5) {
        this.mDisplaySizeMax = i5;
    }

    public void setDisplaySizeMin(int i5) {
        this.mDisplaySizeMin = i5;
    }

    public void setLabelOffsetBottom(Integer num) {
        this.mLabelOffsetBottom = num;
    }

    public void setLabelOffsetLeft(Integer num) {
        this.mLabelOffsetLeft = num;
    }

    public void setLabelOffsetRight(Integer num) {
        this.mLabelOffsetRight = num;
    }

    public void setLabelOffsetTop(Integer num) {
        this.mLabelOffsetTop = num;
    }

    public void setTextPaint(Paint paint) {
        this.mTextPaint = paint;
    }

    private int getOffsetX(int i5) {
        return i5 + (i5 >= 0 ? 0 : -this.mLabelRect.width());
    }
}

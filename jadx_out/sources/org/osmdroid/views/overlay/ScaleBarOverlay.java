package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import java.util.Locale;
import org.osmdroid.api.IGeoPoint;
import org.osmdroid.library.R;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.util.constants.GeoConstants;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class ScaleBarOverlay extends Overlay implements GeoConstants {
    private static final Rect sTextBoundsRect = new Rect();
    private boolean adjustLength;
    protected boolean alignBottom;
    protected boolean alignRight;
    private Paint barPaint;
    protected final Path barPath;
    private Paint bgPaint;
    private boolean centred;
    private Context context;
    private double lastLatitude;
    private double lastZoomLevel;
    boolean latitudeBar;
    protected final Rect latitudeBarRect;
    boolean longitudeBar;
    protected final Rect longitudeBarRect;
    private int mMapHeight;
    private MapView mMapView;
    private int mMapWidth;
    private float maxLength;
    double minZoom;
    public int screenHeight;
    public int screenWidth;
    private Paint textPaint;
    UnitsOfMeasure unitsOfMeasure;
    int xOffset;
    public float xdpi;
    int yOffset;
    public float ydpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.views.overlay.ScaleBarOverlay$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure;

        static {
            int[] iArr = new int[UnitsOfMeasure.values().length];
            $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure = iArr;
            try {
                iArr[UnitsOfMeasure.metric.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[UnitsOfMeasure.imperial.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[UnitsOfMeasure.nautical.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum UnitsOfMeasure {
        metric,
        imperial,
        nautical
    }

    public ScaleBarOverlay(MapView mapView) {
        this(mapView, mapView.getContext(), 0, 0);
    }

    private double adjustScaleBarLength(double d5) {
        double d6;
        double d7;
        UnitsOfMeasure unitsOfMeasure = this.unitsOfMeasure;
        boolean z4 = true;
        long j5 = 0;
        if (unitsOfMeasure == UnitsOfMeasure.imperial) {
            if (d5 >= 321.8688d) {
                d6 = d5 / 1609.344d;
                z4 = false;
            }
            d6 = d5 * 3.2808399d;
        } else {
            if (unitsOfMeasure == UnitsOfMeasure.nautical) {
                if (d5 >= 370.4d) {
                    d6 = d5 / 1852.0d;
                }
                d6 = d5 * 3.2808399d;
            } else {
                d6 = d5;
            }
            z4 = false;
        }
        while (d6 >= 10.0d) {
            j5++;
            d6 /= 10.0d;
        }
        while (true) {
            d7 = 1.0d;
            if (d6 >= 1.0d || d6 <= 0.0d) {
                break;
            }
            j5--;
            d6 *= 10.0d;
        }
        if (d6 >= 2.0d) {
            d7 = 5.0d;
            if (d6 < 5.0d) {
                d7 = 2.0d;
            }
        }
        if (z4) {
            d7 /= 3.2808399d;
        } else {
            UnitsOfMeasure unitsOfMeasure2 = this.unitsOfMeasure;
            if (unitsOfMeasure2 == UnitsOfMeasure.imperial) {
                d7 *= 1609.344d;
            } else if (unitsOfMeasure2 == UnitsOfMeasure.nautical) {
                d7 *= 1852.0d;
            }
        }
        return d7 * Math.pow(10.0d, j5);
    }

    private void drawLatitudeText(Canvas canvas, Projection projection) {
        double d5;
        int height;
        int i5 = (int) (this.maxLength * ((int) (this.xdpi / 2.54d)));
        int i6 = i5 / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels((this.screenWidth / 2) - i6, this.yOffset, null)).distanceToAsDouble(projection.fromPixels((this.screenWidth / 2) + i6, this.yOffset, null));
        if (this.adjustLength) {
            d5 = adjustScaleBarLength(distanceToAsDouble);
        } else {
            d5 = distanceToAsDouble;
        }
        int i7 = (int) ((i5 * d5) / distanceToAsDouble);
        String scaleBarLengthText = scaleBarLengthText(d5);
        Paint paint = this.textPaint;
        int length = scaleBarLengthText.length();
        Rect rect = sTextBoundsRect;
        paint.getTextBounds(scaleBarLengthText, 0, length, rect);
        int height2 = (int) (rect.height() / 5.0d);
        float width = (i7 / 2) - (rect.width() / 2);
        if (this.alignRight) {
            width += this.screenWidth - i7;
        }
        if (this.alignBottom) {
            height = this.screenHeight - (height2 * 2);
        } else {
            height = rect.height() + height2;
        }
        canvas.drawText(scaleBarLengthText, width, height, this.textPaint);
    }

    private void drawLongitudeText(Canvas canvas, Projection projection) {
        double d5;
        int height;
        int i5 = (int) (this.maxLength * ((int) (this.ydpi / 2.54d)));
        int i6 = i5 / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) - i6, null)).distanceToAsDouble(projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) + i6, null));
        if (this.adjustLength) {
            d5 = adjustScaleBarLength(distanceToAsDouble);
        } else {
            d5 = distanceToAsDouble;
        }
        int i7 = (int) ((i5 * d5) / distanceToAsDouble);
        String scaleBarLengthText = scaleBarLengthText(d5);
        Paint paint = this.textPaint;
        int length = scaleBarLengthText.length();
        Rect rect = sTextBoundsRect;
        paint.getTextBounds(scaleBarLengthText, 0, length, rect);
        int height2 = (int) (rect.height() / 5.0d);
        if (this.alignRight) {
            height = this.screenWidth - (height2 * 2);
        } else {
            height = rect.height() + height2;
        }
        float f5 = height;
        float width = (i7 / 2) + (rect.width() / 2);
        if (this.alignBottom) {
            width += this.screenHeight - i7;
        }
        canvas.save();
        canvas.rotate(-90.0f, f5, width);
        canvas.drawText(scaleBarLengthText, f5, width, this.textPaint);
        canvas.restore();
    }

    private String getConvertedScaleString(double d5, GeoConstants.UnitOfMeasure unitOfMeasure, String str) {
        return getScaleString(this.context, String.format(Locale.getDefault(), str, Double.valueOf(d5 / unitOfMeasure.getConversionFactorToMeters())), unitOfMeasure);
    }

    private int getMapHeight() {
        MapView mapView = this.mMapView;
        return mapView != null ? mapView.getHeight() : this.mMapHeight;
    }

    private int getMapWidth() {
        MapView mapView = this.mMapView;
        return mapView != null ? mapView.getWidth() : this.mMapWidth;
    }

    public static String getScaleString(Context context, String str, GeoConstants.UnitOfMeasure unitOfMeasure) {
        return context.getString(R.string.D, str, context.getString(unitOfMeasure.getStringResId()));
    }

    public void disableScaleBar() {
        setEnabled(false);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        boolean z4;
        Paint paint;
        double zoomLevel = projection.getZoomLevel();
        if (zoomLevel < this.minZoom) {
            return;
        }
        Rect intrinsicScreenRect = projection.getIntrinsicScreenRect();
        int width = intrinsicScreenRect.width();
        int height = intrinsicScreenRect.height();
        int i5 = 0;
        if (height == this.screenHeight && width == this.screenWidth) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.screenHeight = height;
        this.screenWidth = width;
        IGeoPoint fromPixels = projection.fromPixels(width / 2, height / 2, null);
        if (zoomLevel != this.lastZoomLevel || fromPixels.getLatitude() != this.lastLatitude || z4) {
            this.lastZoomLevel = zoomLevel;
            this.lastLatitude = fromPixels.getLatitude();
            rebuildBarPath(projection);
        }
        int i6 = this.xOffset;
        int i7 = this.yOffset;
        if (this.alignBottom) {
            i7 *= -1;
        }
        if (this.alignRight) {
            i6 *= -1;
        }
        if (this.centred && this.latitudeBar) {
            i6 += (-this.latitudeBarRect.width()) / 2;
        }
        if (this.centred && this.longitudeBar) {
            i7 += (-this.longitudeBarRect.height()) / 2;
        }
        projection.save(canvas, false, true);
        canvas.translate(i6, i7);
        if (this.latitudeBar && (paint = this.bgPaint) != null) {
            canvas.drawRect(this.latitudeBarRect, paint);
        }
        if (this.longitudeBar && this.bgPaint != null) {
            if (this.latitudeBar) {
                i5 = this.latitudeBarRect.height();
            }
            Rect rect = this.longitudeBarRect;
            canvas.drawRect(rect.left, rect.top + i5, rect.right, rect.bottom, this.bgPaint);
        }
        canvas.drawPath(this.barPath, this.barPaint);
        if (this.latitudeBar) {
            drawLatitudeText(canvas, projection);
        }
        if (this.longitudeBar) {
            drawLongitudeText(canvas, projection);
        }
        projection.restore(canvas, true);
    }

    public void drawLatitudeScale(boolean z4) {
        this.latitudeBar = z4;
        this.lastZoomLevel = -1.0d;
    }

    public void drawLongitudeScale(boolean z4) {
        this.longitudeBar = z4;
        this.lastZoomLevel = -1.0d;
    }

    public void enableScaleBar() {
        setEnabled(true);
    }

    public Paint getBarPaint() {
        return this.barPaint;
    }

    public Paint getTextPaint() {
        return this.textPaint;
    }

    public UnitsOfMeasure getUnitsOfMeasure() {
        return this.unitsOfMeasure;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.context = null;
        this.mMapView = null;
        this.barPaint = null;
        this.bgPaint = null;
        this.textPaint = null;
    }

    protected void rebuildBarPath(Projection projection) {
        double d5;
        double d6;
        int i5;
        float f5 = this.maxLength;
        int i6 = (int) (((int) (this.xdpi / 2.54d)) * f5);
        int i7 = (int) (f5 * ((int) (this.ydpi / 2.54d)));
        int i8 = i6 / 2;
        double distanceToAsDouble = ((GeoPoint) projection.fromPixels((this.screenWidth / 2) - i8, this.yOffset, null)).distanceToAsDouble(projection.fromPixels((this.screenWidth / 2) + i8, this.yOffset, null));
        if (this.adjustLength) {
            d5 = adjustScaleBarLength(distanceToAsDouble);
        } else {
            d5 = distanceToAsDouble;
        }
        int i9 = (int) ((i6 * d5) / distanceToAsDouble);
        int i10 = i7 / 2;
        double distanceToAsDouble2 = ((GeoPoint) projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) - i10, null)).distanceToAsDouble(projection.fromPixels(this.screenWidth / 2, (this.screenHeight / 2) + i10, null));
        if (this.adjustLength) {
            d6 = adjustScaleBarLength(distanceToAsDouble2);
        } else {
            d6 = distanceToAsDouble2;
        }
        int i11 = (int) ((i7 * d6) / distanceToAsDouble2);
        String scaleBarLengthText = scaleBarLengthText(d5);
        Rect rect = new Rect();
        int i12 = 0;
        this.textPaint.getTextBounds(scaleBarLengthText, 0, scaleBarLengthText.length(), rect);
        int height = (int) (rect.height() / 5.0d);
        String scaleBarLengthText2 = scaleBarLengthText(d6);
        Rect rect2 = new Rect();
        this.textPaint.getTextBounds(scaleBarLengthText2, 0, scaleBarLengthText2.length(), rect2);
        int height2 = (int) (rect2.height() / 5.0d);
        int height3 = rect.height();
        int height4 = rect2.height();
        this.barPath.rewind();
        if (this.alignBottom) {
            height *= -1;
            height3 *= -1;
            i5 = getMapHeight();
            i11 = i5 - i11;
        } else {
            i5 = 0;
        }
        if (this.alignRight) {
            height2 *= -1;
            height4 *= -1;
            i12 = getMapWidth();
            i9 = i12 - i9;
        }
        if (this.latitudeBar) {
            float f6 = i9;
            int i13 = height3 + i5 + (height * 2);
            float f7 = i13;
            this.barPath.moveTo(f6, f7);
            float f8 = i5;
            this.barPath.lineTo(f6, f8);
            float f9 = i12;
            this.barPath.lineTo(f9, f8);
            if (!this.longitudeBar) {
                this.barPath.lineTo(f9, f7);
            }
            this.latitudeBarRect.set(i12, i5, i9, i13);
        }
        if (this.longitudeBar) {
            if (!this.latitudeBar) {
                float f10 = i5;
                this.barPath.moveTo(i12 + height4 + (height2 * 2), f10);
                this.barPath.lineTo(i12, f10);
            }
            float f11 = i11;
            this.barPath.lineTo(i12, f11);
            int i14 = height4 + i12 + (height2 * 2);
            this.barPath.lineTo(i14, f11);
            this.longitudeBarRect.set(i12, i5, i14, i11);
        }
    }

    protected String scaleBarLengthText(double d5) {
        int i5 = AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$ScaleBarOverlay$UnitsOfMeasure[this.unitsOfMeasure.ordinal()];
        if (i5 != 2) {
            if (i5 != 3) {
                if (d5 >= 5000.0d) {
                    return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.kilometer, "%.0f");
                }
                if (d5 >= 200.0d) {
                    return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.kilometer, "%.1f");
                }
                if (d5 >= 20.0d) {
                    return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.meter, "%.0f");
                }
                return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.meter, "%.2f");
            }
            if (d5 >= 9260.0d) {
                return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.nauticalMile, "%.0f");
            }
            if (d5 >= 370.4d) {
                return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.nauticalMile, "%.1f");
            }
            return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.foot, "%.0f");
        }
        if (d5 >= 8046.72d) {
            return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.statuteMile, "%.0f");
        }
        if (d5 >= 321.8688d) {
            return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.statuteMile, "%.1f");
        }
        return getConvertedScaleString(d5, GeoConstants.UnitOfMeasure.foot, "%.0f");
    }

    public void setAlignBottom(boolean z4) {
        this.centred = false;
        this.alignBottom = z4;
        this.lastZoomLevel = -1.0d;
    }

    public void setAlignRight(boolean z4) {
        this.centred = false;
        this.alignRight = z4;
        this.lastZoomLevel = -1.0d;
    }

    public void setBackgroundPaint(Paint paint) {
        this.bgPaint = paint;
        this.lastZoomLevel = -1.0d;
    }

    public void setBarPaint(Paint paint) {
        if (paint != null) {
            this.barPaint = paint;
            this.lastZoomLevel = -1.0d;
            return;
        }
        throw new IllegalArgumentException("pBarPaint argument cannot be null");
    }

    public void setCentred(boolean z4) {
        this.centred = z4;
        this.alignBottom = !z4;
        this.alignRight = !z4;
        this.lastZoomLevel = -1.0d;
    }

    public void setEnableAdjustLength(boolean z4) {
        this.adjustLength = z4;
        this.lastZoomLevel = -1.0d;
    }

    public void setLineWidth(float f5) {
        this.barPaint.setStrokeWidth(f5);
    }

    public void setMaxLength(float f5) {
        this.maxLength = f5;
        this.lastZoomLevel = -1.0d;
    }

    public void setMinZoom(double d5) {
        this.minZoom = d5;
    }

    public void setScaleBarOffset(int i5, int i6) {
        this.xOffset = i5;
        this.yOffset = i6;
    }

    public void setTextPaint(Paint paint) {
        if (paint != null) {
            this.textPaint = paint;
            this.lastZoomLevel = -1.0d;
            return;
        }
        throw new IllegalArgumentException("pTextPaint argument cannot be null");
    }

    public void setTextSize(float f5) {
        this.textPaint.setTextSize(f5);
    }

    public void setUnitsOfMeasure(UnitsOfMeasure unitsOfMeasure) {
        this.unitsOfMeasure = unitsOfMeasure;
        this.lastZoomLevel = -1.0d;
    }

    public ScaleBarOverlay(Context context, int i5, int i6) {
        this(null, context, i5, i6);
    }

    private ScaleBarOverlay(MapView mapView, Context context, int i5, int i6) {
        this.xOffset = 10;
        this.yOffset = 10;
        this.minZoom = 0.0d;
        this.unitsOfMeasure = UnitsOfMeasure.metric;
        this.latitudeBar = true;
        this.longitudeBar = false;
        this.alignBottom = false;
        this.alignRight = false;
        this.barPath = new Path();
        this.latitudeBarRect = new Rect();
        this.longitudeBarRect = new Rect();
        this.lastZoomLevel = -1.0d;
        this.lastLatitude = 0.0d;
        this.centred = false;
        this.adjustLength = false;
        this.mMapView = mapView;
        this.context = context;
        this.mMapWidth = i5;
        this.mMapHeight = i6;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Paint paint = new Paint();
        this.barPaint = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.barPaint.setAntiAlias(true);
        this.barPaint.setStyle(Paint.Style.STROKE);
        this.barPaint.setAlpha(255);
        this.barPaint.setStrokeWidth(displayMetrics.density * 2.0f);
        String str = null;
        this.bgPaint = null;
        Paint paint2 = new Paint();
        this.textPaint = paint2;
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setAlpha(255);
        this.textPaint.setTextSize(displayMetrics.density * 10.0f);
        this.xdpi = displayMetrics.xdpi;
        this.ydpi = displayMetrics.ydpi;
        this.screenWidth = displayMetrics.widthPixels;
        this.screenHeight = displayMetrics.heightPixels;
        try {
            str = (String) Build.class.getField("MANUFACTURER").get(null);
        } catch (Exception unused) {
        }
        if ("motorola".equals(str) && "DROIDX".equals(Build.MODEL)) {
            WindowManager windowManager = (WindowManager) this.context.getSystemService("window");
            if (windowManager != null && windowManager.getDefaultDisplay().getOrientation() > 0) {
                this.xdpi = (float) (this.screenWidth / 3.75d);
                this.ydpi = (float) (this.screenHeight / 2.1d);
            } else {
                this.xdpi = (float) (this.screenWidth / 2.1d);
                this.ydpi = (float) (this.screenHeight / 3.75d);
            }
        } else if ("motorola".equals(str) && "Droid".equals(Build.MODEL)) {
            this.xdpi = 264.0f;
            this.ydpi = 264.0f;
        }
        this.maxLength = 2.54f;
    }
}

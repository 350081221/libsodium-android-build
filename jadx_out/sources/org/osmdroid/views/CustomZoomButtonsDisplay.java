package org.osmdroid.views;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import org.osmdroid.library.R;

/* loaded from: classes4.dex */
public class CustomZoomButtonsDisplay {
    private float mAdditionalPixelMarginBottom;
    private float mAdditionalPixelMarginLeft;
    private float mAdditionalPixelMarginRight;
    private float mAdditionalPixelMarginTop;
    private Paint mAlphaPaint;
    private int mBitmapSize;
    private boolean mHorizontalOrVertical;
    private HorizontalPosition mHorizontalPosition;
    private final MapView mMapView;
    private float mMargin;
    private float mPadding;
    private float mPixelMarginBottom;
    private float mPixelMarginLeft;
    private float mPixelMarginRight;
    private float mPixelMarginTop;
    private final Point mUnrotatedPoint = new Point();
    private VerticalPosition mVerticalPosition;
    private Bitmap mZoomInBitmapDisabled;
    private Bitmap mZoomInBitmapEnabled;
    private Bitmap mZoomOutBitmapDisabled;
    private Bitmap mZoomOutBitmapEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.views.CustomZoomButtonsDisplay$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition;
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition;

        static {
            int[] iArr = new int[VerticalPosition.values().length];
            $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition = iArr;
            try {
                iArr[VerticalPosition.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition[VerticalPosition.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition[VerticalPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[HorizontalPosition.values().length];
            $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition = iArr2;
            try {
                iArr2[HorizontalPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition[HorizontalPosition.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition[HorizontalPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum HorizontalPosition {
        LEFT,
        CENTER,
        RIGHT
    }

    /* loaded from: classes4.dex */
    public enum VerticalPosition {
        TOP,
        CENTER,
        BOTTOM
    }

    public CustomZoomButtonsDisplay(MapView mapView) {
        this.mMapView = mapView;
        setPositions(true, HorizontalPosition.CENTER, VerticalPosition.BOTTOM);
        setMarginPadding(0.5f, 0.5f);
    }

    private Bitmap getBitmap(boolean z4, boolean z5) {
        if (this.mZoomInBitmapEnabled == null) {
            setBitmaps(getZoomBitmap(true, true), getZoomBitmap(true, false), getZoomBitmap(false, true), getZoomBitmap(false, false));
        }
        if (z4) {
            if (z5) {
                return this.mZoomInBitmapEnabled;
            }
            return this.mZoomInBitmapDisabled;
        }
        if (z5) {
            return this.mZoomOutBitmapEnabled;
        }
        return this.mZoomOutBitmapDisabled;
    }

    private float getFirstLeft(int i5) {
        float f5;
        float f6;
        int i6 = AnonymousClass1.$SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$HorizontalPosition[this.mHorizontalPosition.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    float f7 = i5 / 2.0f;
                    if (this.mHorizontalOrVertical) {
                        float f8 = this.mPadding;
                        int i7 = this.mBitmapSize;
                        f6 = ((f8 * i7) / 2.0f) + i7;
                    } else {
                        f6 = this.mBitmapSize / 2.0f;
                    }
                    return f7 - f6;
                }
                throw new IllegalArgumentException();
            }
            float f9 = i5 - this.mPixelMarginRight;
            int i8 = this.mBitmapSize;
            float f10 = f9 - i8;
            if (this.mHorizontalOrVertical) {
                f5 = (this.mPadding * i8) + i8;
            } else {
                f5 = 0.0f;
            }
            return f10 - f5;
        }
        return this.mPixelMarginLeft;
    }

    private float getFirstTop(int i5) {
        float f5;
        float f6;
        int i6 = AnonymousClass1.$SwitchMap$org$osmdroid$views$CustomZoomButtonsDisplay$VerticalPosition[this.mVerticalPosition.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    float f7 = i5 / 2.0f;
                    if (this.mHorizontalOrVertical) {
                        f6 = this.mBitmapSize / 2.0f;
                    } else {
                        float f8 = this.mPadding;
                        int i7 = this.mBitmapSize;
                        f6 = ((f8 * i7) / 2.0f) + i7;
                    }
                    return f7 - f6;
                }
                throw new IllegalArgumentException();
            }
            float f9 = i5 - this.mPixelMarginBottom;
            int i8 = this.mBitmapSize;
            float f10 = f9 - i8;
            if (this.mHorizontalOrVertical) {
                f5 = 0.0f;
            } else {
                f5 = i8 + (this.mPadding * i8);
            }
            return f10 - f5;
        }
        return this.mPixelMarginTop;
    }

    private float getTopLeft(boolean z4, boolean z5) {
        int i5;
        float f5;
        float f6;
        if (z5) {
            float firstLeft = getFirstLeft(this.mMapView.getWidth());
            if (!this.mHorizontalOrVertical) {
                return firstLeft;
            }
            if (!z4) {
                return firstLeft;
            }
            i5 = this.mBitmapSize;
            f5 = firstLeft + i5;
            f6 = this.mPadding;
        } else {
            float firstTop = getFirstTop(this.mMapView.getHeight());
            if (this.mHorizontalOrVertical) {
                return firstTop;
            }
            if (z4) {
                return firstTop;
            }
            i5 = this.mBitmapSize;
            f5 = firstTop + i5;
            f6 = this.mPadding;
        }
        return f5 + (f6 * i5);
    }

    private void refreshPixelMargins() {
        float f5 = this.mMargin * this.mBitmapSize;
        this.mPixelMarginLeft = this.mAdditionalPixelMarginLeft + f5;
        this.mPixelMarginTop = this.mAdditionalPixelMarginTop + f5;
        this.mPixelMarginRight = this.mAdditionalPixelMarginRight + f5;
        this.mPixelMarginBottom = f5 + this.mAdditionalPixelMarginBottom;
    }

    public void draw(Canvas canvas, float f5, boolean z4, boolean z5) {
        Paint paint;
        if (f5 == 0.0f) {
            return;
        }
        if (f5 == 1.0f) {
            paint = null;
        } else {
            if (this.mAlphaPaint == null) {
                this.mAlphaPaint = new Paint();
            }
            this.mAlphaPaint.setAlpha((int) (f5 * 255.0f));
            paint = this.mAlphaPaint;
        }
        canvas.drawBitmap(getBitmap(true, z4), getTopLeft(true, true), getTopLeft(true, false), paint);
        canvas.drawBitmap(getBitmap(false, z5), getTopLeft(false, true), getTopLeft(false, false), paint);
    }

    protected Bitmap getIcon(boolean z4) {
        int i5;
        if (z4) {
            i5 = R.drawable.f21679u;
        } else {
            i5 = R.drawable.f21680v;
        }
        return ((BitmapDrawable) this.mMapView.getResources().getDrawable(i5)).getBitmap();
    }

    protected Bitmap getZoomBitmap(boolean z4, boolean z5) {
        int i5;
        Bitmap icon = getIcon(z4);
        this.mBitmapSize = icon.getWidth();
        refreshPixelMargins();
        int i6 = this.mBitmapSize;
        Bitmap createBitmap = Bitmap.createBitmap(i6, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        if (z5) {
            i5 = -1;
        } else {
            i5 = -3355444;
        }
        paint.setColor(i5);
        paint.setStyle(Paint.Style.FILL);
        int i7 = this.mBitmapSize;
        canvas.drawRect(0.0f, 0.0f, i7 - 1, i7 - 1, paint);
        canvas.drawBitmap(icon, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public boolean isTouched(MotionEvent motionEvent, boolean z4) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            return isTouched((int) motionEvent.getX(), (int) motionEvent.getY(), z4);
        }
        return false;
    }

    @Deprecated
    public boolean isTouchedRotated(MotionEvent motionEvent, boolean z4) {
        if (this.mMapView.getMapOrientation() == 0.0f) {
            this.mUnrotatedPoint.set((int) motionEvent.getX(), (int) motionEvent.getY());
        } else {
            this.mMapView.getProjection().rotateAndScalePoint((int) motionEvent.getX(), (int) motionEvent.getY(), this.mUnrotatedPoint);
        }
        Point point = this.mUnrotatedPoint;
        return isTouched(point.x, point.y, z4);
    }

    public void setAdditionalPixelMargins(float f5, float f6, float f7, float f8) {
        this.mAdditionalPixelMarginLeft = f5;
        this.mAdditionalPixelMarginTop = f6;
        this.mAdditionalPixelMarginRight = f7;
        this.mAdditionalPixelMarginBottom = f8;
        refreshPixelMargins();
    }

    public void setBitmaps(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        this.mZoomInBitmapEnabled = bitmap;
        this.mZoomInBitmapDisabled = bitmap2;
        this.mZoomOutBitmapEnabled = bitmap3;
        this.mZoomOutBitmapDisabled = bitmap4;
        this.mBitmapSize = bitmap.getWidth();
        refreshPixelMargins();
    }

    public void setMarginPadding(float f5, float f6) {
        this.mMargin = f5;
        this.mPadding = f6;
        refreshPixelMargins();
    }

    public void setPositions(boolean z4, HorizontalPosition horizontalPosition, VerticalPosition verticalPosition) {
        this.mHorizontalOrVertical = z4;
        this.mHorizontalPosition = horizontalPosition;
        this.mVerticalPosition = verticalPosition;
    }

    private boolean isTouched(int i5, int i6, boolean z4) {
        return isTouched(z4, true, (float) i5) && isTouched(z4, false, (float) i6);
    }

    private boolean isTouched(boolean z4, boolean z5, float f5) {
        float topLeft = getTopLeft(z4, z5);
        return f5 >= topLeft && f5 <= topLeft + ((float) this.mBitmapSize);
    }
}

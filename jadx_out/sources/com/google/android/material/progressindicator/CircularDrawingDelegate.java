package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.math.MathUtils;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes2.dex */
final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    private void drawArc(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, @ColorInt int i5, @Px int i6, @Px int i7) {
        float f7;
        Paint.Cap cap;
        if (f6 >= f5) {
            f7 = f6 - f5;
        } else {
            f7 = (f6 + 1.0f) - f5;
        }
        float f8 = f5 % 1.0f;
        if (this.totalTrackLengthFraction < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                drawArc(canvas, paint, f8, 1.0f, i5, i6, 0);
                drawArc(canvas, paint, 1.0f, f9, i5, 0, i7);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.displayedCornerRadius / this.adjustedRadius);
        if (f8 == 0.0f && f7 >= 0.99f) {
            f7 += ((f7 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float lerp = MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, f8);
        float lerp2 = MathUtils.lerp(0.0f, this.totalTrackLengthFraction, f7);
        float degrees2 = (float) Math.toDegrees(i6 / this.adjustedRadius);
        float degrees3 = ((lerp2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i7 / this.adjustedRadius));
        float f10 = (lerp * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i5);
        paint.setStrokeWidth(this.displayedTrackThickness);
        float f11 = degrees * 2.0f;
        if (degrees3 < f11) {
            float f12 = degrees3 / f11;
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f10 + (degrees * f12), this.displayedCornerRadius * 2.0f, this.displayedTrackThickness, f12);
            return;
        }
        float f13 = this.adjustedRadius;
        RectF rectF = new RectF(-f13, -f13, f13, f13);
        paint.setStyle(Paint.Style.STROKE);
        if (this.useStrokeCap) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
        float f14 = f10 + degrees;
        canvas.drawArc(rectF, f14, degrees3 - f11, false, paint);
        if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            drawRoundedBlock(canvas, paint, f14, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
            drawRoundedBlock(canvas, paint, (f10 + degrees3) - degrees, this.displayedCornerRadius * 2.0f, this.displayedTrackThickness);
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, float f7) {
        drawRoundedBlock(canvas, paint, f5, f6, f7, 1.0f);
    }

    private int getSize() {
        S s5 = this.spec;
        return ((CircularProgressIndicatorSpec) s5).indicatorSize + (((CircularProgressIndicatorSpec) s5).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f5, boolean z4, boolean z5) {
        boolean z6;
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s5 = this.spec;
        float f6 = (((CircularProgressIndicatorSpec) s5).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s5).indicatorInset;
        canvas.translate((f6 * width) + rect.left, (f6 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((CircularProgressIndicatorSpec) this.spec).indicatorDirection != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f7 = -f6;
        canvas.clipRect(f7, f7, f6, f6);
        S s6 = this.spec;
        if (((CircularProgressIndicatorSpec) s6).trackThickness / 2 <= ((CircularProgressIndicatorSpec) s6).trackCornerRadius) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.useStrokeCap = z6;
        this.displayedTrackThickness = ((CircularProgressIndicatorSpec) s6).trackThickness * f5;
        this.displayedCornerRadius = Math.min(((CircularProgressIndicatorSpec) s6).trackThickness / 2, ((CircularProgressIndicatorSpec) s6).trackCornerRadius) * f5;
        S s7 = this.spec;
        float f8 = (((CircularProgressIndicatorSpec) s7).indicatorSize - ((CircularProgressIndicatorSpec) s7).trackThickness) / 2.0f;
        this.adjustedRadius = f8;
        if (z4 || z5) {
            if ((z4 && ((CircularProgressIndicatorSpec) s7).showAnimationBehavior == 2) || (z5 && ((CircularProgressIndicatorSpec) s7).hideAnimationBehavior == 1)) {
                this.adjustedRadius = f8 + (((1.0f - f5) * ((CircularProgressIndicatorSpec) s7).trackThickness) / 2.0f);
            } else if ((z4 && ((CircularProgressIndicatorSpec) s7).showAnimationBehavior == 1) || (z5 && ((CircularProgressIndicatorSpec) s7).hideAnimationBehavior == 2)) {
                this.adjustedRadius = f8 - (((1.0f - f5) * ((CircularProgressIndicatorSpec) s7).trackThickness) / 2.0f);
            }
        }
        if (z5 && ((CircularProgressIndicatorSpec) s7).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f5;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i5) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i5);
        float f5 = activeIndicator.startFraction;
        float f6 = activeIndicator.endFraction;
        int i6 = activeIndicator.gapSize;
        drawArc(canvas, paint, f5, f6, compositeARGBWithAlpha, i6, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, @ColorInt int i5, @IntRange(from = 0, to = 255) int i6, int i7) {
        drawArc(canvas, paint, f5, f6, MaterialColors.compositeARGBWithAlpha(i5, i6), i7, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return getSize();
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, float f7, float f8) {
        float min = (int) Math.min(f7, this.displayedTrackThickness);
        float f9 = f6 / 2.0f;
        float min2 = Math.min(f9, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-min) / 2.0f, (-f6) / 2.0f, min / 2.0f, f9);
        canvas.save();
        double d5 = f5;
        canvas.translate((float) (this.adjustedRadius * Math.cos(Math.toRadians(d5))), (float) (this.adjustedRadius * Math.sin(Math.toRadians(d5))));
        canvas.rotate(f5);
        canvas.scale(f8, f8);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}

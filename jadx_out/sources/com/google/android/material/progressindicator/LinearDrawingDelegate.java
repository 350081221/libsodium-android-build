package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.DrawingDelegate;

/* loaded from: classes2.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    private void drawLine(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, @ColorInt int i5, @Px int i6, @Px int i7) {
        Paint.Cap cap;
        float clamp = MathUtils.clamp(f5, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f6, 0.0f, 1.0f);
        float lerp = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp);
        float lerp2 = com.google.android.material.math.MathUtils.lerp(1.0f - this.totalTrackLengthFraction, 1.0f, clamp2);
        int clamp3 = (int) ((i6 * MathUtils.clamp(lerp, 0.0f, 0.01f)) / 0.01f);
        int clamp4 = (int) ((i7 * (1.0f - MathUtils.clamp(lerp2, 0.99f, 1.0f))) / 0.01f);
        float f7 = this.trackLength;
        int i8 = (int) ((lerp * f7) + clamp3);
        int i9 = (int) ((lerp2 * f7) - clamp4);
        float f8 = (-f7) / 2.0f;
        if (i8 <= i9) {
            float f9 = this.displayedCornerRadius;
            float f10 = i8 + f9;
            float f11 = i9 - f9;
            float f12 = f9 * 2.0f;
            paint.setColor(i5);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.displayedTrackThickness);
            if (f10 >= f11) {
                drawRoundedBlock(canvas, paint, new PointF(f10 + f8, 0.0f), new PointF(f11 + f8, 0.0f), f12, this.displayedTrackThickness);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (this.useStrokeCap) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f13 = f10 + f8;
            float f14 = f11 + f8;
            canvas.drawLine(f13, 0.0f, f14, 0.0f, paint);
            if (!this.useStrokeCap && this.displayedCornerRadius > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                if (f10 > 0.0f) {
                    drawRoundedBlock(canvas, paint, new PointF(f13, 0.0f), f12, this.displayedTrackThickness);
                }
                if (f11 < this.trackLength) {
                    drawRoundedBlock(canvas, paint, new PointF(f14, 0.0f), f12, this.displayedTrackThickness);
                }
            }
        }
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f5, float f6) {
        drawRoundedBlock(canvas, paint, pointF, null, f5, f6);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f5, boolean z4, boolean z5) {
        boolean z6;
        this.trackLength = rect.width();
        float f6 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f6) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f7 = this.trackLength / 2.0f;
        float f8 = f6 / 2.0f;
        canvas.clipRect(-f7, -f8, f7, f8);
        S s5 = this.spec;
        if (((LinearProgressIndicatorSpec) s5).trackThickness / 2 == ((LinearProgressIndicatorSpec) s5).trackCornerRadius) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.useStrokeCap = z6;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s5).trackThickness * f5;
        this.displayedCornerRadius = Math.min(((LinearProgressIndicatorSpec) s5).trackThickness / 2, ((LinearProgressIndicatorSpec) s5).trackCornerRadius) * f5;
        if (z4 || z5) {
            if ((z4 && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 2) || (z5 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z4 || (z5 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.spec).trackThickness * (1.0f - f5)) / 2.0f);
            }
        }
        if (z5 && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 3) {
            this.totalTrackLengthFraction = f5;
        } else {
            this.totalTrackLengthFraction = 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(i5, i6);
        if (((LinearProgressIndicatorSpec) this.spec).trackStopIndicatorSize > 0 && compositeARGBWithAlpha != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(compositeARGBWithAlpha);
            PointF pointF = new PointF((this.trackLength / 2.0f) - (this.displayedTrackThickness / 2.0f), 0.0f);
            S s5 = this.spec;
            drawRoundedBlock(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s5).trackStopIndicatorSize, ((LinearProgressIndicatorSpec) s5).trackStopIndicatorSize);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull DrawingDelegate.ActiveIndicator activeIndicator, int i5) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(activeIndicator.color, i5);
        float f5 = activeIndicator.startFraction;
        float f6 = activeIndicator.endFraction;
        int i6 = activeIndicator.gapSize;
        drawLine(canvas, paint, f5, f6, compositeARGBWithAlpha, i6, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f5, float f6, int i5, int i6, @Px int i7) {
        drawLine(canvas, paint, f5, f6, MaterialColors.compositeARGBWithAlpha(i5, i6), i7, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }

    private void drawRoundedBlock(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f5, float f6) {
        float min = Math.min(f6, this.displayedTrackThickness);
        float f7 = f5 / 2.0f;
        float min2 = Math.min(f7, (this.displayedCornerRadius * min) / this.displayedTrackThickness);
        RectF rectF = new RectF((-f5) / 2.0f, (-min) / 2.0f, f7, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}

package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    /* loaded from: classes2.dex */
    protected static class ActiveIndicator {

        @ColorInt
        int color;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float endFraction;

        @Px
        int gapSize;

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float startFraction;
    }

    public DrawingDelegate(S s5) {
        this.spec = s5;
    }

    abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = -1.0d, to = 1.0d) float f5, boolean z4, boolean z5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i5, @IntRange(from = 0, to = 255) int i6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, @IntRange(from = 0, to = 255) int i5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, @ColorInt int i5, @IntRange(from = 0, to = 255) int i6, @Px int i7);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredHeight();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredWidth();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f5, boolean z4, boolean z5) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f5, z4, z5);
    }
}

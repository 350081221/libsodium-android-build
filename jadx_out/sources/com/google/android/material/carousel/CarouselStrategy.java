package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes2.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr2[i5] = iArr[i5] * 2;
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public static float getChildMaskPercentage(float f5, float f6, float f7) {
        return 1.0f - ((f5 - f7) / (f6 - f7));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initialize(Context context) {
        float f5 = this.smallSizeMin;
        if (f5 <= 0.0f) {
            f5 = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = f5;
        float f6 = this.smallSizeMax;
        if (f6 <= 0.0f) {
            f6 = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isContained() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f5) {
        this.smallSizeMax = f5;
    }

    public void setSmallItemSizeMin(float f5) {
        this.smallSizeMin = f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldRefreshKeylineState(Carousel carousel, int i5) {
        return false;
    }
}

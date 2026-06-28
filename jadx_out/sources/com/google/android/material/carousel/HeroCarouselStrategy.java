package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int[] iArr;
        int i5;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f5;
        float max = Math.max(getSmallItemSizeMax() + f5, smallItemSizeMin);
        float f6 = containerHeight;
        float min = Math.min(measuredWidth + f5, f6);
        float clamp = MathUtils.clamp((measuredWidth / 3.0f) + f5, smallItemSizeMin + f5, max + f5);
        float f7 = (min + clamp) / 2.0f;
        int[] iArr4 = SMALL_COUNTS;
        if (f6 < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        } else {
            iArr = iArr4;
        }
        int max2 = (int) Math.max(1.0d, Math.floor((f6 - (CarouselStrategyHelper.maxValue(iArr4) * max)) / min));
        int ceil = (((int) Math.ceil(f6 / min)) - max2) + 1;
        int[] iArr5 = new int[ceil];
        for (int i7 = 0; i7 < ceil; i7++) {
            iArr5[i7] = max2 + i7;
        }
        if (carousel.getCarouselAlignment() == 1) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (i5 != 0) {
            iArr2 = CarouselStrategy.doubleCounts(iArr);
        } else {
            iArr2 = iArr;
        }
        if (i5 != 0) {
            iArr3 = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArr3 = MEDIUM_COUNTS;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f6, clamp, smallItemSizeMin, max, iArr2, f7, iArr3, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f6, clamp, smallItemSizeMin, max, iArr, f7, MEDIUM_COUNTS, min, iArr5);
            i6 = 0;
        } else {
            i6 = i5;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f5, f6, findLowestCostArrangement, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i5) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i5 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i5 >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}

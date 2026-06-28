package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i5) {
        boolean z4;
        int itemCount = arrangement.getItemCount() - i5;
        if (itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1)) {
            z4 = true;
        } else {
            z4 = false;
        }
        while (itemCount > 0) {
            int i6 = arrangement.smallCount;
            if (i6 > 0) {
                arrangement.smallCount = i6 - 1;
            } else {
                int i7 = arrangement.mediumCount;
                if (i7 > 1) {
                    arrangement.mediumCount = i7 - 1;
                }
            }
            itemCount--;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f6 = f5;
        float smallItemSizeMin = getSmallItemSizeMin() + f6;
        float max = Math.max(getSmallItemSizeMax() + f6, smallItemSizeMin);
        float min = Math.min(measuredHeight + f6, containerHeight);
        float clamp = MathUtils.clamp((measuredHeight / 3.0f) + f6, smallItemSizeMin + f6, max + f6);
        float f7 = (min + clamp) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        if (containerHeight < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((containerHeight - (CarouselStrategyHelper.maxValue(iArr4) * f7)) - (CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(containerHeight / min);
        int i5 = (ceil - max2) + 1;
        int[] iArr5 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            iArr5[i6] = ceil - i6;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, iArr3, f7, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount())) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, clamp, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f7, new int[]{findLowestCostArrangement.mediumCount}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f6, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i5) {
        if ((i5 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i5 >= this.keylineCount && carousel.getItemCount() < this.keylineCount)) {
            return true;
        }
        return false;
    }
}

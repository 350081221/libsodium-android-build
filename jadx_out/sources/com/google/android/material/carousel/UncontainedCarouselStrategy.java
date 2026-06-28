package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

/* loaded from: classes2.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UncontainedCarouselStrategy() {
    }

    private float calculateMediumChildSize(float f5, float f6, float f7) {
        float max = Math.max(1.5f * f7, f5);
        float f8 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f6;
        if (max > f8) {
            max = Math.max(f8, f7 * 1.2f);
        }
        return Math.min(f6, max);
    }

    private KeylineState createCenterAlignedKeylineState(float f5, float f6, float f7, int i5, float f8, float f9, float f10) {
        float min = Math.min(f9, f7);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, f7, f6);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f8, f7, f6);
        float f11 = f8 / 2.0f;
        float f12 = (f10 + 0.0f) - f11;
        float f13 = f12 + f11;
        float f14 = min / 2.0f;
        float f15 = (i5 * f7) + f13;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f7, f5).addAnchorKeyline((f12 - f11) - f14, childMaskPercentage, min).addKeyline(f12, childMaskPercentage2, f8, false).addKeylineRange((f7 / 2.0f) + f13, 0.0f, f7, i5, true);
        addKeylineRange.addKeyline(f11 + f15, childMaskPercentage2, f8, false);
        addKeylineRange.addAnchorKeyline(f15 + f8 + f14, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f5, float f6, float f7, int i5, float f8, int i6, float f9) {
        float min = Math.min(f9, f7);
        float max = Math.max(min, 0.5f * f8);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(max, f7, f5);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(min, f7, f5);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f8, f7, f5);
        float f10 = (i5 * f7) + 0.0f;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f7, f6).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f7 / 2.0f, 0.0f, f7, i5, true);
        if (i6 > 0) {
            float f11 = (f8 / 2.0f) + f10;
            f10 += f8;
            addKeylineRange.addKeyline(f11, childMaskPercentage3, f8, false);
        }
        addKeylineRange.addAnchorKeyline(f10 + (CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f), childMaskPercentage2, min);
        return addKeylineRange.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight;
        float f5;
        boolean z4;
        int i5;
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f6 = containerHeight;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            float f8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
            f5 = f8;
        } else {
            f5 = f7;
        }
        float f9 = measuredHeight + f5;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f5;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f5;
        int max = Math.max(1, (int) Math.floor(f6 / f9));
        float f10 = f6 - (max * f9);
        if (carousel.getCarouselAlignment() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            float f11 = f10 / 2.0f;
            return createCenterAlignedKeylineState(f6, f5, f9, max, Math.max(Math.min(3.0f * f11, f9), getSmallItemSizeMin() + f5), extraSmallSize2, f11);
        }
        if (f10 > 0.0f) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f5, f6, f9, max, calculateMediumChildSize(extraSmallSize, f9, f10), i5, extraSmallSize2);
    }
}

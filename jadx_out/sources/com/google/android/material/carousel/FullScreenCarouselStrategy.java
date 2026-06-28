package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float containerHeight;
        int i5;
        int i6;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i5 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        float f5 = i5 + i6;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f5, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(containerHeight + f5, containerHeight), 1, containerHeight));
    }
}

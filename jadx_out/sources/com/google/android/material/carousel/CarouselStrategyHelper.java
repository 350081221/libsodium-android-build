package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.carousel.KeylineState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CarouselStrategyHelper {
    private CarouselStrategyHelper() {
    }

    static float addEnd(float f5, float f6, int i5) {
        return f5 + (Math.max(0, i5 - 1) * f6);
    }

    static float addStart(float f5, float f6, int i5) {
        return i5 > 0 ? f5 + (f6 / 2.0f) : f5;
    }

    static KeylineState createCenterAlignedKeylineState(@NonNull Context context, float f5, float f6, @NonNull Arrangement arrangement) {
        float f7;
        float f8;
        float min = Math.min(getExtraSmallSize(context) + f5, arrangement.largeSize);
        float f9 = min / 2.0f;
        float f10 = 0.0f - f9;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f11 = f9 + f6;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f5);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f5);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f5);
        KeylineState.Builder addAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, f6).addAnchorKeyline(f10, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f7 = f11;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f7 = f11;
        }
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r4 / 2.0f));
        }
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            f8 = 2.0f;
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r4 / 2.0f));
        } else {
            f8 = 2.0f;
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, childMaskPercentage2, arrangement.smallSize, (int) Math.ceil(r0 / f8));
        }
        addAnchorKeyline.addAnchorKeyline(f7, childMaskPercentage, min);
        return addAnchorKeyline.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState createKeylineState(@NonNull Context context, float f5, float f6, @NonNull Arrangement arrangement, int i5) {
        if (i5 == 1) {
            return createCenterAlignedKeylineState(context, f5, f6, arrangement);
        }
        return createLeftAlignedKeylineState(context, f5, f6, arrangement);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState createLeftAlignedKeylineState(@NonNull Context context, float f5, float f6, @NonNull Arrangement arrangement) {
        float min = Math.min(getExtraSmallSize(context) + f5, arrangement.largeSize);
        float f7 = min / 2.0f;
        float f8 = 0.0f - f7;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f9 = f7 + f6;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f5);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f5);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f5);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(arrangement.largeSize, f6).addAnchorKeyline(f8, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i5 = arrangement.smallCount;
        if (i5 > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, i5);
        }
        addKeylineRange.addAnchorKeyline(f9, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getExtraSmallSize(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getSmallSizeMax(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getSmallSizeMin(@NonNull Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int maxValue(int[] iArr) {
        int i5 = Integer.MIN_VALUE;
        for (int i6 : iArr) {
            if (i6 > i5) {
                i5 = i6;
            }
        }
        return i5;
    }

    static float updateCurPosition(float f5, float f6, float f7, int i5) {
        return i5 > 0 ? f6 + (f7 / 2.0f) : f5;
    }
}

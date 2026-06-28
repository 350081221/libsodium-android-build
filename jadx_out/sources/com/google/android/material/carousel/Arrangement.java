package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

/* loaded from: classes2.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Arrangement(int i5, float f5, float f6, float f7, int i6, float f8, int i7, float f9, int i8, float f10) {
        this.priority = i5;
        this.smallSize = MathUtils.clamp(f5, f6, f7);
        this.smallCount = i6;
        this.mediumSize = f8;
        this.mediumCount = i7;
        this.largeSize = f9;
        this.largeCount = i8;
        fit(f10, f6, f7, f9);
        this.cost = cost(f9);
    }

    private float calculateLargeSize(float f5, int i5, float f6, int i6, int i7) {
        if (i5 <= 0) {
            f6 = 0.0f;
        }
        float f7 = i6 / 2.0f;
        return (f5 - ((i5 + f7) * f6)) / (i7 + f7);
    }

    private float cost(float f5) {
        if (!isValid()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f5 - this.largeSize) * this.priority;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Arrangement findLowestCostArrangement(float f5, float f6, float f7, float f8, int[] iArr, float f9, int[] iArr2, float f10, int[] iArr3) {
        Arrangement arrangement = null;
        int i5 = 1;
        for (int i6 : iArr3) {
            int length = iArr2.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = iArr2[i7];
                int length2 = iArr.length;
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = i9;
                    int i11 = length2;
                    int i12 = i7;
                    int i13 = length;
                    Arrangement arrangement2 = new Arrangement(i5, f6, f7, f8, iArr[i9], f9, i8, f10, i6, f5);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i5++;
                    i9 = i10 + 1;
                    length2 = i11;
                    i7 = i12;
                    length = i13;
                }
                i7++;
            }
        }
        return arrangement;
    }

    private void fit(float f5, float f6, float f7, float f8) {
        float f9;
        float space = f5 - getSpace();
        int i5 = this.smallCount;
        if (i5 > 0 && space > 0.0f) {
            float f10 = this.smallSize;
            this.smallSize = f10 + Math.min(space / i5, f7 - f10);
        } else if (i5 > 0 && space < 0.0f) {
            float f11 = this.smallSize;
            this.smallSize = f11 + Math.max(space / i5, f6 - f11);
        }
        int i6 = this.smallCount;
        if (i6 > 0) {
            f9 = this.smallSize;
        } else {
            f9 = 0.0f;
        }
        this.smallSize = f9;
        float calculateLargeSize = calculateLargeSize(f5, i6, f9, this.mediumCount, this.largeCount);
        this.largeSize = calculateLargeSize;
        float f12 = (this.smallSize + calculateLargeSize) / 2.0f;
        this.mediumSize = f12;
        int i7 = this.mediumCount;
        if (i7 > 0 && calculateLargeSize != f8) {
            float f13 = (f8 - calculateLargeSize) * this.largeCount;
            float min = Math.min(Math.abs(f13), f12 * 0.1f * i7);
            if (f13 > 0.0f) {
                this.mediumSize -= min / this.mediumCount;
                this.largeSize += min / this.largeCount;
            } else {
                this.mediumSize += min / this.mediumCount;
                this.largeSize -= min / this.largeCount;
            }
        }
    }

    private float getSpace() {
        return (this.largeSize * this.largeCount) + (this.mediumSize * this.mediumCount) + (this.smallSize * this.smallCount);
    }

    private boolean isValid() {
        int i5 = this.largeCount;
        if (i5 > 0 && this.smallCount > 0 && this.mediumCount > 0) {
            float f5 = this.largeSize;
            float f6 = this.mediumSize;
            if (f5 <= f6 || f6 <= this.smallSize) {
                return false;
            }
            return true;
        }
        if (i5 > 0 && this.smallCount > 0 && this.largeSize <= this.smallSize) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }

    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }
}

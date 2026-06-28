package androidx.compose.material3.carousel;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", LogFactory.PRIORITY_KEY, "", "smallSize", "", "smallCount", "mediumSize", "mediumCount", "largeSize", "largeCount", "(IFIFIFI)V", "getLargeSize", "()F", "getMediumSize", "getSmallSize", "cost", "targetLargeSize", "isValid", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002JH\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012JP\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "()V", "MediumItemFlexPercentage", "", "calculateLargeSize", "availableSpace", "smallCount", "", "smallSize", "mediumCount", "largeCount", "findLowestCostArrangement", "Landroidx/compose/material3/carousel/Arrangement;", "targetSmallSize", "smallSizeRange", "Landroidx/annotation/FloatRange;", "smallCounts", "", "targetMediumSize", "mediumCounts", "targetLargeSize", "largeCounts", "fit", LogFactory.PRIORITY_KEY, "mediumSize", "largeSize", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final float calculateLargeSize(float f5, int i5, float f6, int i6, int i7) {
            float f7 = i6 / 2.0f;
            return (f5 - ((i5 + f7) * f6)) / (i7 + f7);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r14, float r15, int r16, float r17, androidx.annotation.FloatRange r18, int r19, float r20, int r21, float r22) {
            /*
                r13 = this;
                r6 = r16
                r7 = r19
                double r0 = r18.from()
                float r0 = (float) r0
                double r1 = r18.to()
                float r1 = (float) r1
                r2 = r17
                float r0 = kotlin.ranges.s.H(r2, r0, r1)
                r8 = r21
                float r9 = (float) r8
                float r1 = r22 * r9
                float r10 = (float) r7
                float r2 = r20 * r10
                float r1 = r1 + r2
                float r2 = (float) r6
                float r3 = r0 * r2
                float r1 = r1 + r3
                float r1 = r15 - r1
                r11 = 0
                if (r6 <= 0) goto L37
                int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r3 <= 0) goto L37
                float r1 = r1 / r2
                double r2 = r18.to()
                float r2 = (float) r2
                float r2 = r2 - r0
                float r1 = java.lang.Math.min(r1, r2)
            L35:
                float r0 = r0 + r1
                goto L49
            L37:
                if (r6 <= 0) goto L49
                int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r3 >= 0) goto L49
                float r1 = r1 / r2
                double r2 = r18.from()
                float r2 = (float) r2
                float r2 = r2 - r0
                float r1 = java.lang.Math.max(r1, r2)
                goto L35
            L49:
                if (r6 <= 0) goto L4d
                r12 = r0
                goto L4e
            L4d:
                r12 = r11
            L4e:
                r0 = r13
                r1 = r15
                r2 = r16
                r3 = r12
                r4 = r19
                r5 = r21
                float r0 = r0.calculateLargeSize(r1, r2, r3, r4, r5)
                float r1 = r0 + r12
                r2 = 1073741824(0x40000000, float:2.0)
                float r1 = r1 / r2
                if (r7 <= 0) goto L8a
                int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
                if (r2 != 0) goto L68
                r2 = 1
                goto L69
            L68:
                r2 = 0
            L69:
                if (r2 != 0) goto L8a
                float r2 = r22 - r0
                float r2 = r2 * r9
                r3 = 1036831949(0x3dcccccd, float:0.1)
                float r3 = r3 * r1
                float r3 = r3 * r10
                float r4 = java.lang.Math.abs(r2)
                float r3 = java.lang.Math.min(r4, r3)
                int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r2 <= 0) goto L85
                float r2 = r3 / r10
                float r1 = r1 - r2
                float r3 = r3 / r9
                float r0 = r0 + r3
                goto L8a
            L85:
                float r2 = r3 / r10
                float r1 = r1 + r2
                float r3 = r3 / r9
                float r0 = r0 - r3
            L8a:
                r9 = r0
                r4 = r1
                androidx.compose.material3.carousel.Arrangement r10 = new androidx.compose.material3.carousel.Arrangement
                r0 = r10
                r1 = r14
                r2 = r12
                r3 = r16
                r5 = r19
                r6 = r9
                r7 = r21
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, int, float, androidx.annotation.FloatRange, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }

        @m
        public final Arrangement findLowestCostArrangement(float f5, float f6, @l FloatRange floatRange, @l int[] iArr, float f7, @l int[] iArr2, float f8, @l int[] iArr3) {
            boolean z4;
            int length = iArr3.length;
            Arrangement arrangement = null;
            int i5 = 0;
            int i6 = 1;
            while (i5 < length) {
                int i7 = iArr3[i5];
                int length2 = iArr2.length;
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = iArr2[i8];
                    int length3 = iArr.length;
                    Arrangement arrangement2 = arrangement;
                    int i10 = i6;
                    int i11 = 0;
                    while (i11 < length3) {
                        int i12 = i11;
                        Arrangement arrangement3 = arrangement2;
                        int i13 = length3;
                        int i14 = i8;
                        int i15 = length2;
                        int i16 = i5;
                        Arrangement fit = fit(i10, f5, iArr[i11], f6, floatRange, i9, f7, i7, f8);
                        if (arrangement3 != null && fit.cost(f8) >= arrangement3.cost(f8)) {
                            arrangement2 = arrangement3;
                        } else {
                            if (fit.cost(f8) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return fit;
                            }
                            arrangement2 = fit;
                        }
                        i10++;
                        i11 = i12 + 1;
                        length3 = i13;
                        i8 = i14;
                        length2 = i15;
                        i5 = i16;
                    }
                    i8++;
                    arrangement = arrangement2;
                    i6 = i10;
                }
                i5++;
            }
            return arrangement;
        }
    }

    public Arrangement(int i5, float f5, int i6, float f6, int i7, float f7, int i8) {
        this.priority = i5;
        this.smallSize = f5;
        this.smallCount = i6;
        this.mediumSize = f6;
        this.mediumCount = i7;
        this.largeSize = f7;
        this.largeCount = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f5) {
        if (!isValid()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f5 - this.largeSize) * this.priority;
    }

    private final boolean isValid() {
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

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }
}

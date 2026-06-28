package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@ExperimentalMaterial3Api
@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0088\u0001\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\u0013\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020\u001fH\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010#R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b)\u0010#R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b*\u0010#R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b+\u0010#R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b,\u0010#R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b-\u0010#R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b.\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "copy", "", "enabled", "active", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "borderColor", "checked", "contentColor-WaAFU9c$material3_release", "contentColor", "containerColor-WaAFU9c$material3_release", "containerColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "getActiveContainerColor-0d7_KjU", "()J", "getActiveContentColor-0d7_KjU", "getActiveBorderColor-0d7_KjU", "getInactiveContainerColor-0d7_KjU", "getInactiveContentColor-0d7_KjU", "getInactiveBorderColor-0d7_KjU", "getDisabledActiveContainerColor-0d7_KjU", "getDisabledActiveContentColor-0d7_KjU", "getDisabledActiveBorderColor-0d7_KjU", "getDisabledInactiveContainerColor-0d7_KjU", "getDisabledInactiveContentColor-0d7_KjU", "getDisabledInactiveBorderColor-0d7_KjU", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,786:1\n658#2:787\n646#2:788\n658#2:789\n646#2:790\n658#2:791\n646#2:792\n658#2:793\n646#2:794\n658#2:795\n646#2:796\n658#2:797\n646#2:798\n658#2:799\n646#2:800\n658#2:801\n646#2:802\n658#2:803\n646#2:804\n658#2:805\n646#2:806\n658#2:807\n646#2:808\n658#2:809\n646#2:810\n*S KotlinDebug\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonColors\n*L\n664#1:787\n664#1:788\n665#1:789\n665#1:790\n666#1:791\n666#1:792\n667#1:793\n667#1:794\n668#1:795\n668#1:796\n669#1:797\n669#1:798\n670#1:799\n670#1:800\n671#1:801\n671#1:802\n672#1:803\n672#1:804\n673#1:805\n673#1:806\n674#1:807\n674#1:808\n675#1:809\n675#1:810\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    private SegmentedButtonColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.activeContainerColor = j5;
        this.activeContentColor = j6;
        this.activeBorderColor = j7;
        this.inactiveContainerColor = j8;
        this.inactiveContentColor = j9;
        this.inactiveBorderColor = j10;
        this.disabledActiveContainerColor = j11;
        this.disabledActiveContentColor = j12;
        this.disabledActiveBorderColor = j13;
        this.disabledInactiveContainerColor = j14;
        this.disabledInactiveContentColor = j15;
        this.disabledInactiveBorderColor = j16;
    }

    public /* synthetic */ SegmentedButtonColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m2130copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i5, Object obj) {
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        if ((i5 & 1) != 0) {
            j17 = segmentedButtonColors.activeContainerColor;
        } else {
            j17 = j5;
        }
        if ((i5 & 2) != 0) {
            j18 = segmentedButtonColors.activeContentColor;
        } else {
            j18 = j6;
        }
        if ((i5 & 4) != 0) {
            j19 = segmentedButtonColors.activeBorderColor;
        } else {
            j19 = j7;
        }
        if ((i5 & 8) != 0) {
            j20 = segmentedButtonColors.inactiveContainerColor;
        } else {
            j20 = j8;
        }
        if ((i5 & 16) != 0) {
            j21 = segmentedButtonColors.inactiveContentColor;
        } else {
            j21 = j9;
        }
        if ((i5 & 32) != 0) {
            j22 = segmentedButtonColors.inactiveBorderColor;
        } else {
            j22 = j10;
        }
        if ((i5 & 64) != 0) {
            j23 = segmentedButtonColors.disabledActiveContainerColor;
        } else {
            j23 = j11;
        }
        long j29 = j23;
        if ((i5 & 128) != 0) {
            j24 = segmentedButtonColors.disabledActiveContentColor;
        } else {
            j24 = j12;
        }
        long j30 = j24;
        if ((i5 & 256) != 0) {
            j25 = segmentedButtonColors.disabledActiveBorderColor;
        } else {
            j25 = j13;
        }
        long j31 = j25;
        if ((i5 & 512) != 0) {
            j26 = segmentedButtonColors.disabledInactiveContainerColor;
        } else {
            j26 = j14;
        }
        long j32 = j26;
        if ((i5 & 1024) != 0) {
            j27 = segmentedButtonColors.disabledInactiveContentColor;
        } else {
            j27 = j15;
        }
        long j33 = j27;
        if ((i5 & 2048) != 0) {
            j28 = segmentedButtonColors.disabledInactiveBorderColor;
        } else {
            j28 = j16;
        }
        return segmentedButtonColors.m2134copy2qZNXz8(j17, j18, j19, j20, j21, j22, j29, j30, j31, j32, j33, j28);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2131borderColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4 && z5) {
            return this.activeBorderColor;
        }
        if (z4 && !z5) {
            return this.inactiveBorderColor;
        }
        if (!z4 && z5) {
            return this.disabledActiveBorderColor;
        }
        return this.disabledInactiveBorderColor;
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2132containerColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4 && z5) {
            return this.activeContainerColor;
        }
        if (z4 && !z5) {
            return this.inactiveContainerColor;
        }
        if (!z4 && z5) {
            return this.disabledActiveContainerColor;
        }
        return this.disabledInactiveContainerColor;
    }

    @Stable
    /* renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2133contentColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (z4 && z5) {
            return this.activeContentColor;
        }
        if (z4 && !z5) {
            return this.inactiveContentColor;
        }
        if (!z4 && z5) {
            return this.disabledActiveContentColor;
        }
        return this.disabledInactiveContentColor;
    }

    @p4.l
    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2134copy2qZNXz8(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        boolean z4;
        long j17;
        boolean z5;
        long j18;
        boolean z6;
        long j19;
        boolean z7;
        long j20;
        boolean z8;
        long j21;
        boolean z9;
        long j22;
        boolean z10;
        long j23;
        boolean z11;
        long j24;
        boolean z12;
        long j25;
        boolean z13;
        long j26;
        boolean z14;
        long j27;
        long j28;
        Color.Companion companion = Color.Companion;
        boolean z15 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j17 = j5;
        } else {
            j17 = this.activeContainerColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j18 = j6;
        } else {
            j18 = this.activeContentColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j19 = j7;
        } else {
            j19 = this.activeBorderColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j20 = j8;
        } else {
            j20 = this.inactiveContainerColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j21 = j9;
        } else {
            j21 = this.inactiveContentColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j22 = j10;
        } else {
            j22 = this.inactiveBorderColor;
        }
        if (j11 != companion.m3770getUnspecified0d7_KjU()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j23 = j11;
        } else {
            j23 = this.disabledActiveContainerColor;
        }
        if (j12 != companion.m3770getUnspecified0d7_KjU()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j24 = j12;
        } else {
            j24 = this.disabledActiveContentColor;
        }
        if (j13 != companion.m3770getUnspecified0d7_KjU()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j25 = j13;
        } else {
            j25 = this.disabledActiveBorderColor;
        }
        if (j14 != companion.m3770getUnspecified0d7_KjU()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            j26 = j14;
        } else {
            j26 = this.disabledInactiveContainerColor;
        }
        if (j15 != companion.m3770getUnspecified0d7_KjU()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            j27 = j15;
        } else {
            j27 = this.disabledInactiveContentColor;
        }
        if (j16 == companion.m3770getUnspecified0d7_KjU()) {
            z15 = false;
        }
        if (z15) {
            j28 = j16;
        } else {
            j28 = this.disabledInactiveBorderColor;
        }
        return new SegmentedButtonColors(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        if (Color.m3735equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m3735equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m3735equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m3735equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m3735equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m3735equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m3735equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m3735equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m3735equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m3735equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m3735equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m3735equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2135getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2136getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2137getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2138getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2139getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2140getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2141getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2142getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2143getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m2144getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m2145getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m2146getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m3741hashCodeimpl(this.activeBorderColor) * 31) + Color.m3741hashCodeimpl(this.activeContentColor)) * 31) + Color.m3741hashCodeimpl(this.activeContainerColor)) * 31) + Color.m3741hashCodeimpl(this.inactiveBorderColor)) * 31) + Color.m3741hashCodeimpl(this.inactiveContentColor)) * 31) + Color.m3741hashCodeimpl(this.inactiveContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledActiveBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledActiveContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledActiveContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledInactiveBorderColor)) * 31) + Color.m3741hashCodeimpl(this.disabledInactiveContentColor)) * 31) + Color.m3741hashCodeimpl(this.disabledInactiveContainerColor);
    }
}

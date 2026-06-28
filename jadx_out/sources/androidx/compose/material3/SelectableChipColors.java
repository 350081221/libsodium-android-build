package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0092\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ%\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0013\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\"\u001a\u00020!H\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010#R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u0010#R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010#R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010#R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/SelectableChipColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "copy-daRQuJA", "(JJJJJJJJJJJJJ)Landroidx/compose/material3/SelectableChipColors;", "copy", "", "enabled", "selected", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "labelColor-WaAFU9c$material3_release", "(ZZ)J", "leadingIconContentColor-WaAFU9c$material3_release", "leadingIconContentColor", "trailingIconContentColor-WaAFU9c$material3_release", "trailingIconContentColor", "other", "equals", "", TTDownloadField.TT_HASHCODE, "J", "<init>", "(JJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2741:1\n658#2:2742\n646#2:2743\n658#2:2744\n646#2:2745\n658#2:2746\n646#2:2747\n658#2:2748\n646#2:2749\n658#2:2750\n646#2:2751\n658#2:2752\n646#2:2753\n658#2:2754\n646#2:2755\n658#2:2756\n646#2:2757\n658#2:2758\n646#2:2759\n658#2:2760\n646#2:2761\n658#2:2762\n646#2:2763\n658#2:2764\n646#2:2765\n658#2:2766\n646#2:2767\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/SelectableChipColors\n*L\n2545#1:2742\n2545#1:2743\n2546#1:2744\n2546#1:2745\n2547#1:2746\n2547#1:2747\n2548#1:2748\n2548#1:2749\n2549#1:2750\n2549#1:2751\n2550#1:2752\n2550#1:2753\n2551#1:2754\n2551#1:2755\n2552#1:2756\n2552#1:2757\n2553#1:2758\n2553#1:2759\n2554#1:2760\n2554#1:2761\n2555#1:2762\n2555#1:2763\n2556#1:2764\n2556#1:2765\n2557#1:2766\n2557#1:2767\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    private SelectableChipColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.containerColor = j5;
        this.labelColor = j6;
        this.leadingIconColor = j7;
        this.trailingIconColor = j8;
        this.disabledContainerColor = j9;
        this.disabledLabelColor = j10;
        this.disabledLeadingIconColor = j11;
        this.disabledTrailingIconColor = j12;
        this.selectedContainerColor = j13;
        this.disabledSelectedContainerColor = j14;
        this.selectedLabelColor = j15;
        this.selectedLeadingIconColor = j16;
        this.selectedTrailingIconColor = j17;
    }

    public /* synthetic */ SelectableChipColors(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.w wVar) {
        this(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m2155copydaRQuJA$default(SelectableChipColors selectableChipColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i5, Object obj) {
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
        long j29;
        long j30;
        if ((i5 & 1) != 0) {
            j18 = selectableChipColors.containerColor;
        } else {
            j18 = j5;
        }
        if ((i5 & 2) != 0) {
            j19 = selectableChipColors.labelColor;
        } else {
            j19 = j6;
        }
        if ((i5 & 4) != 0) {
            j20 = selectableChipColors.leadingIconColor;
        } else {
            j20 = j7;
        }
        if ((i5 & 8) != 0) {
            j21 = selectableChipColors.trailingIconColor;
        } else {
            j21 = j8;
        }
        if ((i5 & 16) != 0) {
            j22 = selectableChipColors.disabledContainerColor;
        } else {
            j22 = j9;
        }
        if ((i5 & 32) != 0) {
            j23 = selectableChipColors.disabledLabelColor;
        } else {
            j23 = j10;
        }
        if ((i5 & 64) != 0) {
            j24 = selectableChipColors.disabledLeadingIconColor;
        } else {
            j24 = j11;
        }
        long j31 = j24;
        if ((i5 & 128) != 0) {
            j25 = selectableChipColors.disabledTrailingIconColor;
        } else {
            j25 = j12;
        }
        long j32 = j25;
        if ((i5 & 256) != 0) {
            j26 = selectableChipColors.selectedContainerColor;
        } else {
            j26 = j13;
        }
        long j33 = j26;
        if ((i5 & 512) != 0) {
            j27 = selectableChipColors.disabledSelectedContainerColor;
        } else {
            j27 = j14;
        }
        long j34 = j27;
        if ((i5 & 1024) != 0) {
            j28 = selectableChipColors.selectedLabelColor;
        } else {
            j28 = j15;
        }
        long j35 = j28;
        if ((i5 & 2048) != 0) {
            j29 = selectableChipColors.selectedLeadingIconColor;
        } else {
            j29 = j16;
        }
        long j36 = j29;
        if ((i5 & 4096) != 0) {
            j30 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j30 = j17;
        }
        return selectableChipColors.m2156copydaRQuJA(j18, j19, j20, j21, j22, j23, j31, j32, j33, j34, j35, j36, j30);
    }

    @p4.l
    @Composable
    public final State<Color> containerColor$material3_release(boolean z4, boolean z5, @p4.m Composer composer, int i5) {
        long j5;
        composer.startReplaceableGroup(-2126903408);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126903408, i5, -1, "androidx.compose.material3.SelectableChipColors.containerColor (Chip.kt:2566)");
        }
        if (!z4) {
            if (z5) {
                j5 = this.disabledSelectedContainerColor;
            } else {
                j5 = this.disabledContainerColor;
            }
        } else if (!z5) {
            j5 = this.containerColor;
        } else {
            j5 = this.selectedContainerColor;
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3724boximpl(j5), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @p4.l
    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m2156copydaRQuJA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        boolean z4;
        long j18;
        boolean z5;
        long j19;
        boolean z6;
        long j20;
        boolean z7;
        long j21;
        boolean z8;
        long j22;
        boolean z9;
        long j23;
        boolean z10;
        long j24;
        boolean z11;
        long j25;
        boolean z12;
        long j26;
        boolean z13;
        long j27;
        boolean z14;
        long j28;
        boolean z15;
        long j29;
        long j30;
        Color.Companion companion = Color.Companion;
        boolean z16 = true;
        if (j5 != companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            j18 = j5;
        } else {
            j18 = this.containerColor;
        }
        if (j6 != companion.m3770getUnspecified0d7_KjU()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            j19 = j6;
        } else {
            j19 = this.labelColor;
        }
        if (j7 != companion.m3770getUnspecified0d7_KjU()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            j20 = j7;
        } else {
            j20 = this.leadingIconColor;
        }
        if (j8 != companion.m3770getUnspecified0d7_KjU()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j21 = j8;
        } else {
            j21 = this.trailingIconColor;
        }
        if (j9 != companion.m3770getUnspecified0d7_KjU()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j22 = j9;
        } else {
            j22 = this.disabledContainerColor;
        }
        if (j10 != companion.m3770getUnspecified0d7_KjU()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j23 = j10;
        } else {
            j23 = this.disabledLabelColor;
        }
        if (j11 != companion.m3770getUnspecified0d7_KjU()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j24 = j11;
        } else {
            j24 = this.disabledLeadingIconColor;
        }
        if (j12 != companion.m3770getUnspecified0d7_KjU()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j25 = j12;
        } else {
            j25 = this.disabledTrailingIconColor;
        }
        if (j13 != companion.m3770getUnspecified0d7_KjU()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            j26 = j13;
        } else {
            j26 = this.selectedContainerColor;
        }
        if (j14 != companion.m3770getUnspecified0d7_KjU()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            j27 = j14;
        } else {
            j27 = this.disabledSelectedContainerColor;
        }
        if (j15 != companion.m3770getUnspecified0d7_KjU()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            j28 = j15;
        } else {
            j28 = this.selectedLabelColor;
        }
        if (j16 != companion.m3770getUnspecified0d7_KjU()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            j29 = j16;
        } else {
            j29 = this.selectedLeadingIconColor;
        }
        if (j17 == companion.m3770getUnspecified0d7_KjU()) {
            z16 = false;
        }
        if (z16) {
            j30 = j17;
        } else {
            j30 = this.selectedTrailingIconColor;
        }
        return new SelectableChipColors(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, null);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        if (Color.m3735equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m3735equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m3735equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m3735equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m3735equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m3735equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m3735equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m3735equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m3735equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m3735equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m3735equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m3735equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m3735equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Color.m3741hashCodeimpl(this.containerColor) * 31) + Color.m3741hashCodeimpl(this.labelColor)) * 31) + Color.m3741hashCodeimpl(this.leadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.trailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m3741hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m3741hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.disabledSelectedContainerColor)) * 31) + Color.m3741hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m3741hashCodeimpl(this.selectedLeadingIconColor)) * 31) + Color.m3741hashCodeimpl(this.selectedTrailingIconColor);
    }

    /* renamed from: labelColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2157labelColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (!z4) {
            return this.disabledLabelColor;
        }
        if (!z5) {
            return this.labelColor;
        }
        return this.selectedLabelColor;
    }

    /* renamed from: leadingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2158leadingIconContentColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (!z4) {
            return this.disabledLeadingIconColor;
        }
        if (!z5) {
            return this.leadingIconColor;
        }
        return this.selectedLeadingIconColor;
    }

    /* renamed from: trailingIconContentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2159trailingIconContentColorWaAFU9c$material3_release(boolean z4, boolean z5) {
        if (!z4) {
            return this.disabledTrailingIconColor;
        }
        if (!z5) {
            return this.trailingIconColor;
        }
        return this.selectedTrailingIconColor;
    }
}

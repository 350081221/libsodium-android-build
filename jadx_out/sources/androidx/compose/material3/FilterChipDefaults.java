package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\b\u0002\u00105\u001a\u00020\u00182\b\b\u0002\u00106\u001a\u00020\u00182\b\b\u0002\u00107\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\u00182\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0016J\u008a\u0001\u0010=\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010%JN\u0010?\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010/R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/material3/FilterChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedFilterChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedFilterChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "defaultFilterChipColors", "getDefaultFilterChipColors$material3_release", "elevatedFilterChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "elevatedFilterChipColors-XqyqHi0", "(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "elevatedFilterChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedFilterChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "filterChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "filterChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "filterChipColors", "filterChipColors-XqyqHi0", "filterChipElevation", "filterChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @p4.l
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float IconSize;

    static {
        FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
        Height = filterChipTokens.m2901getContainerHeightD9Ej5fM();
        IconSize = filterChipTokens.m2917getIconSizeD9Ej5fM();
    }

    private FilterChipDefaults() {
    }

    @p4.l
    @Composable
    public final SelectableChipColors elevatedFilterChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1082953289);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i5, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1345)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3_release = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedFilterChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1887elevatedFilterChipColorsXqyqHi0(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @p4.m Composer composer, int i5, int i6, int i7) {
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
        composer.startReplaceableGroup(-915841711);
        if ((i7 & 1) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i7 & 2) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i7 & 4) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i7 & 8) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i7 & 16) != 0) {
            j21 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i7 & 32) != 0) {
            j22 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i7 & 64) != 0) {
            j23 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i7 & 128) != 0) {
            j24 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i7 & 256) != 0) {
            j25 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i7 & 512) != 0) {
            j26 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j26 = j14;
        }
        if ((i7 & 1024) != 0) {
            j27 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i7 & 2048) != 0) {
            j28 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j28 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915841711, i5, i6, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:1379)");
        }
        SelectableChipColors m2156copydaRQuJA = getDefaultElevatedFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2156copydaRQuJA(j17, j18, j19, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2156copydaRQuJA;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1888elevatedFilterChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(684803697);
        if ((i6 & 1) != 0) {
            f11 = FilterChipTokens.INSTANCE.m2903getElevatedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = FilterChipTokens.INSTANCE.m2907getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = FilterChipTokens.INSTANCE.m2905getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = FilterChipTokens.INSTANCE.m2906getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = FilterChipTokens.INSTANCE.m2902getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = FilterChipTokens.INSTANCE.m2904getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i5, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:1442)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @p4.l
    @Composable
    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m1889filterChipBorder_7El2pE(boolean z4, boolean z5, long j5, long j6, long j7, long j8, float f5, float f6, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        float f7;
        float f8;
        composer.startReplaceableGroup(-1138342447);
        if ((i6 & 4) != 0) {
            j9 = ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6);
        } else {
            j9 = j5;
        }
        if ((i6 & 8) != 0) {
            j10 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 16) != 0) {
            j11 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j7;
        }
        if ((i6 & 32) != 0) {
            j12 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i6 & 64) != 0) {
            f7 = FilterChipTokens.INSTANCE.m2915getFlatUnselectedOutlineWidthD9Ej5fM();
        } else {
            f7 = f5;
        }
        if ((i6 & 128) != 0) {
            f8 = FilterChipTokens.INSTANCE.m2911getFlatSelectedOutlineWidthD9Ej5fM();
        } else {
            f8 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i5, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:1331)");
        }
        if (z4) {
            if (z5) {
                j9 = j10;
            }
        } else if (z5) {
            j9 = j12;
        } else {
            j9 = j11;
        }
        if (z5) {
            f7 = f8;
        }
        BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(f7, j9);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m228BorderStrokecXLIe8U;
    }

    @p4.l
    @Composable
    public final SelectableChipColors filterChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1743772077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i5, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1197)");
        }
        SelectableChipColors defaultFilterChipColors$material3_release = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFilterChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m1890filterChipColorsXqyqHi0(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, @p4.m Composer composer, int i5, int i6, int i7) {
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
        composer.startReplaceableGroup(-1831479801);
        if ((i7 & 1) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j5;
        }
        if ((i7 & 2) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j6;
        }
        if ((i7 & 4) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j7;
        }
        if ((i7 & 8) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j8;
        }
        if ((i7 & 16) != 0) {
            j21 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j21 = j9;
        }
        if ((i7 & 32) != 0) {
            j22 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j22 = j10;
        }
        if ((i7 & 64) != 0) {
            j23 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j23 = j11;
        }
        if ((i7 & 128) != 0) {
            j24 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j24 = j12;
        }
        if ((i7 & 256) != 0) {
            j25 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j25 = j13;
        }
        if ((i7 & 512) != 0) {
            j26 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j26 = j14;
        }
        if ((i7 & 1024) != 0) {
            j27 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j27 = j15;
        }
        if ((i7 & 2048) != 0) {
            j28 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j28 = j16;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831479801, i5, i6, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:1231)");
        }
        SelectableChipColors m2156copydaRQuJA = getDefaultFilterChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2156copydaRQuJA(j17, j18, j19, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2156copydaRQuJA;
    }

    @p4.l
    @Composable
    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1891filterChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(-757972185);
        if ((i6 & 1) != 0) {
            f11 = FilterChipTokens.INSTANCE.m2908getFlatContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = FilterChipTokens.INSTANCE.m2912getFlatSelectedPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = FilterChipTokens.INSTANCE.m2909getFlatSelectedFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = FilterChipTokens.INSTANCE.m2910getFlatSelectedHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = FilterChipTokens.INSTANCE.m2902getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = f11;
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i5, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:1294)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }

    @p4.l
    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached$material3_release = colorScheme.getDefaultElevatedFilterChipColorsCached$material3_release();
        if (defaultElevatedFilterChipColorsCached$material3_release == null) {
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
            colorScheme.setDefaultElevatedFilterChipColorsCached$material3_release(selectableChipColors);
            return selectableChipColors;
        }
        return defaultElevatedFilterChipColorsCached$material3_release;
    }

    @p4.l
    public final SelectableChipColors getDefaultFilterChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached$material3_release = colorScheme.getDefaultFilterChipColorsCached$material3_release();
        if (defaultFilterChipColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            FilterChipTokens filterChipTokens = FilterChipTokens.INSTANCE;
            SelectableChipColors selectableChipColors = new SelectableChipColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getLeadingIconUnselectedColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getFlatDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filterChipTokens.getSelectedLeadingIconColor()), null);
            colorScheme.setDefaultFilterChipColorsCached$material3_release(selectableChipColors);
            return selectableChipColors;
        }
        return defaultFilterChipColorsCached$material3_release;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1892getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1893getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1598643637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i5, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:1452)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}

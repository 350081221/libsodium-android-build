package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010$J\u0094\u0001\u0010#\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103JN\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/material3/InputChipDefaults;", "", "()V", "AvatarSize", "Landroidx/compose/ui/unit/Dp;", "getAvatarSize-D9Ej5fM", "()F", "F", "Height", "getHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultInputChipColors", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultInputChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SelectableChipColors;", "inputChipBorder", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "selected", "borderColor", "Landroidx/compose/ui/graphics/Color;", "selectedBorderColor", "disabledBorderColor", "disabledSelectedBorderColor", "borderWidth", "selectedBorderWidth", "inputChipBorder-_7El2pE", "(ZZJJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "inputChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SelectableChipColors;", "containerColor", "labelColor", "leadingIconColor", "trailingIconColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "selectedContainerColor", "disabledSelectedContainerColor", "selectedLabelColor", "selectedLeadingIconColor", "selectedTrailingIconColor", "inputChipColors-kwJvTHA", "(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;", "inputChipElevation", "Landroidx/compose/material3/SelectableChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "inputChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    private static final float AvatarSize;
    private static final float Height;

    @p4.l
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float IconSize;

    static {
        InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
        Height = inputChipTokens.m2922getContainerHeightD9Ej5fM();
        IconSize = inputChipTokens.m2924getLeadingIconSizeD9Ej5fM();
        AvatarSize = inputChipTokens.m2920getAvatarSizeD9Ej5fM();
    }

    private InputChipDefaults() {
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m1933getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    @p4.l
    public final SelectableChipColors getDefaultInputChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached$material3_release = colorScheme.getDefaultInputChipColorsCached$material3_release();
        if (defaultInputChipColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            InputChipTokens inputChipTokens = InputChipTokens.INSTANCE;
            SelectableChipColors selectableChipColors = new SelectableChipColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getUnselectedTrailingIconColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedContainerColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getDisabledSelectedContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, inputChipTokens.getSelectedTrailingIconColor()), null);
            colorScheme.setDefaultInputChipColorsCached$material3_release(selectableChipColors);
            return selectableChipColors;
        }
        return defaultInputChipColorsCached$material3_release;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1934getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1935getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1052444143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i5, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:1626)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    /* renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m1936inputChipBorder_7El2pE(boolean z4, boolean z5, long j5, long j6, long j7, long j8, float f5, float f6, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        float f7;
        float f8;
        composer.startReplaceableGroup(2050575347);
        if ((i6 & 4) != 0) {
            j9 = ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6);
        } else {
            j9 = j5;
        }
        if ((i6 & 8) != 0) {
            j10 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 16) != 0) {
            j11 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j11 = j7;
        }
        if ((i6 & 32) != 0) {
            j12 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j12 = j8;
        }
        if ((i6 & 64) != 0) {
            f7 = InputChipTokens.INSTANCE.m2927getUnselectedOutlineWidthD9Ej5fM();
        } else {
            f7 = f5;
        }
        if ((i6 & 128) != 0) {
            f8 = InputChipTokens.INSTANCE.m2925getSelectedOutlineWidthD9Ej5fM();
        } else {
            f8 = f6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i5, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:1616)");
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
    public final SelectableChipColors inputChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-770375587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i5, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1480)");
        }
        SelectableChipColors defaultInputChipColors$material3_release = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultInputChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m1937inputChipColorskwJvTHA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, @p4.m Composer composer, int i5, int i6, int i7) {
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
        composer.startReplaceableGroup(1312840646);
        if ((i7 & 1) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j5;
        }
        if ((i7 & 2) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j6;
        }
        if ((i7 & 4) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j7;
        }
        if ((i7 & 8) != 0) {
            j21 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j21 = j8;
        }
        if ((i7 & 16) != 0) {
            j22 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j22 = j9;
        }
        if ((i7 & 32) != 0) {
            j23 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j23 = j10;
        }
        if ((i7 & 64) != 0) {
            j24 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j24 = j11;
        }
        if ((i7 & 128) != 0) {
            j25 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j25 = j12;
        }
        if ((i7 & 256) != 0) {
            j26 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j26 = j13;
        }
        if ((i7 & 512) != 0) {
            j27 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j27 = j14;
        }
        if ((i7 & 1024) != 0) {
            j28 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j28 = j15;
        }
        if ((i7 & 2048) != 0) {
            j29 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j29 = j16;
        }
        if ((i7 & 4096) != 0) {
            j30 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j30 = j17;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1312840646, i5, i6, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:1516)");
        }
        SelectableChipColors m2156copydaRQuJA = getDefaultInputChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2156copydaRQuJA(j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2156copydaRQuJA;
    }

    @p4.l
    @Composable
    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m1938inputChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(1745270109);
        if ((i6 & 1) != 0) {
            f11 = InputChipTokens.INSTANCE.m2921getContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = f11;
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = f11;
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = f11;
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = InputChipTokens.INSTANCE.m2923getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = f11;
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i5, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:1580)");
        }
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectableChipElevation;
    }
}

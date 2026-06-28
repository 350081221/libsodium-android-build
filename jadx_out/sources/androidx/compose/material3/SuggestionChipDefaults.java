package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.b1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.J8\u0010(\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u00162\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0014JN\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001dJN\u00106\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010'R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material3/SuggestionChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultElevatedSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultElevatedSuggestionChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledIconContentColor", "elevatedSuggestionChipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "elevatedSuggestionChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "elevatedSuggestionChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "suggestionChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "disabledBorderColor", "borderWidth", "suggestionChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "suggestionChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "suggestionChipColors", "suggestionChipColors-5tl4gsc", "suggestionChipElevation", "suggestionChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @p4.l
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float IconSize;

    static {
        SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
        Height = suggestionChipTokens.m3128getContainerHeightD9Ej5fM();
        IconSize = suggestionChipTokens.m3137getLeadingIconSizeD9Ej5fM();
    }

    private SuggestionChipDefaults() {
    }

    @p4.l
    @Composable
    public final ChipColors elevatedSuggestionChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1671233087);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1758)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedSuggestionChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2296elevatedSuggestionChipColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(1269423125);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:1779)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3_release = getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors m1649copyFD3wquc = defaultElevatedSuggestionChipColors$material3_release.m1649copyFD3wquc(j11, j12, j13, companion.m3770getUnspecified0d7_KjU(), j14, j15, j16, companion.m3770getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1649copyFD3wquc;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2297elevatedSuggestionChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(1118088467);
        if ((i6 & 1) != 0) {
            f11 = SuggestionChipTokens.INSTANCE.m3130getElevatedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = SuggestionChipTokens.INSTANCE.m3134getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = SuggestionChipTokens.INSTANCE.m3132getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = SuggestionChipTokens.INSTANCE.m3133getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = SuggestionChipTokens.INSTANCE.m3129getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = SuggestionChipTokens.INSTANCE.m3131getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:1831)");
        }
        ChipElevation chipElevation = new ChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @p4.l
    public final ChipColors getDefaultElevatedSuggestionChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached$material3_release = colorScheme.getDefaultElevatedSuggestionChipColorsCached$material3_release();
        if (defaultElevatedSuggestionChipColorsCached$material3_release == null) {
            SuggestionChipTokens suggestionChipTokens = SuggestionChipTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedContainerColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLabelTextColor());
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getLeadingIconColor());
            Color.Companion companion = Color.Companion;
            ChipColors chipColors = new ChipColors(fromToken, fromToken2, fromToken3, companion.m3770getUnspecified0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, suggestionChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), companion.m3770getUnspecified0d7_KjU(), null);
            colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3_release(chipColors);
            return chipColors;
        }
        return defaultElevatedSuggestionChipColorsCached$material3_release;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m2298getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2299getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(641188183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:1841)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    @kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the suggestChipBorder functions instead", replaceWith = @b1(expression = "suggestionChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m2300suggestionChipBorderd_3_b6Q(long j5, long j6, float f5, @p4.m Composer composer, int i5, int i6) {
        long j7;
        long j8;
        float f6;
        composer.startReplaceableGroup(439283919);
        if ((i6 & 1) != 0) {
            j7 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j7 = j5;
        }
        if ((i6 & 2) != 0) {
            j8 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j6;
        }
        if ((i6 & 4) != 0) {
            f6 = SuggestionChipTokens.INSTANCE.m3136getFlatOutlineWidthD9Ej5fM();
        } else {
            f6 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1746)");
        }
        ChipBorder chipBorder = new ChipBorder(j7, j8, f6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    @p4.l
    @Composable
    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m2301suggestionChipBorderh1eTWw(boolean z4, long j5, long j6, float f5, @p4.m Composer composer, int i5, int i6) {
        long j7;
        long j8;
        float f6;
        composer.startReplaceableGroup(-637354809);
        if ((i6 & 2) != 0) {
            j7 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j7 = j5;
        }
        if ((i6 & 4) != 0) {
            j8 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j6;
        }
        if ((i6 & 8) != 0) {
            f6 = SuggestionChipTokens.INSTANCE.m3136getFlatOutlineWidthD9Ej5fM();
        } else {
            f6 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:1724)");
        }
        if (!z4) {
            j7 = j8;
        }
        BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(f6, j7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m228BorderStrokecXLIe8U;
    }

    @p4.l
    @Composable
    public final ChipColors suggestionChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1918570697);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1649)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSuggestionChipColors;
    }

    @p4.l
    @Composable
    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m2302suggestionChipColors5tl4gsc(long j5, long j6, long j7, long j8, long j9, long j10, @p4.m Composer composer, int i5, int i6) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        composer.startReplaceableGroup(1882647883);
        if ((i6 & 1) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j8;
        }
        if ((i6 & 16) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j9;
        }
        if ((i6 & 32) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:1670)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        Color.Companion companion = Color.Companion;
        ChipColors m1649copyFD3wquc = defaultSuggestionChipColors.m1649copyFD3wquc(j11, j12, j13, companion.m3770getUnspecified0d7_KjU(), j14, j15, j16, companion.m3770getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1649copyFD3wquc;
    }

    @p4.l
    @Composable
    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m2303suggestionChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(1929994057);
        if ((i6 & 1) != 0) {
            f11 = SuggestionChipTokens.INSTANCE.m3135getFlatContainerElevationD9Ej5fM();
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
            f15 = SuggestionChipTokens.INSTANCE.m3129getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = f11;
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i5, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:1700)");
        }
        ChipElevation chipElevation = new ChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }
}

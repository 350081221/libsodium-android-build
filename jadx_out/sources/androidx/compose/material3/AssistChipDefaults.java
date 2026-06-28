package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.b1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010#Jb\u00108\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u00182\b\b\u0002\u0010)\u001a\u00020\u00182\b\b\u0002\u0010*\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010-JN\u0010:\u001a\u00020/2\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00107R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000f*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultAssistChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultAssistChipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "defaultElevatedAssistChipColors", "getDefaultElevatedAssistChipColors$material3_release", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "Landroidx/compose/foundation/BorderStroke;", "enabled", "", "assistChipBorder-h1eT-Ww", "(ZJJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/BorderStroke;", "assistChipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    private static final float Height;

    @p4.l
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float IconSize;

    static {
        AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
        Height = assistChipTokens.m2628getContainerHeightD9Ej5fM();
        IconSize = assistChipTokens.m2637getIconSizeD9Ej5fM();
    }

    private AssistChipDefaults() {
    }

    @p4.l
    @Composable
    @kotlin.k(level = kotlin.m.WARNING, message = "Maintained for binary compatibility. Use the assistChipBorder function that returns BorderStroke instead", replaceWith = @b1(expression = "assistChipBorder(enabled, borderColor, disabledBorderColor, borderWidth)", imports = {}))
    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m1564assistChipBorderd_3_b6Q(long j5, long j6, float f5, @p4.m Composer composer, int i5, int i6) {
        long j7;
        long j8;
        float f6;
        composer.startReplaceableGroup(382372847);
        if ((i6 & 1) != 0) {
            j7 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j7 = j5;
        }
        if ((i6 & 2) != 0) {
            j8 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j6;
        }
        if ((i6 & 4) != 0) {
            f6 = AssistChipTokens.INSTANCE.m2636getFlatOutlineWidthD9Ej5fM();
        } else {
            f6 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i5, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1076)");
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
    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m1565assistChipBorderh1eTWw(boolean z4, long j5, long j6, float f5, @p4.m Composer composer, int i5, int i6) {
        long j7;
        long j8;
        float f6;
        composer.startReplaceableGroup(-1458649561);
        if ((i6 & 2) != 0) {
            j7 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        } else {
            j7 = j5;
        }
        if ((i6 & 4) != 0) {
            j8 = Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j8 = j6;
        }
        if ((i6 & 8) != 0) {
            f6 = AssistChipTokens.INSTANCE.m2636getFlatOutlineWidthD9Ej5fM();
        } else {
            f6 = f5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i5, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:1053)");
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
    public final ChipColors assistChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1961061417);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i5, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:952)");
        }
        ChipColors defaultAssistChipColors$material3_release = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultAssistChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1566assistChipColorsoq7We08(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @p4.m Composer composer, int i5, int i6) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        composer.startReplaceableGroup(-391745725);
        if ((i6 & 1) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j5;
        }
        if ((i6 & 2) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j6;
        }
        if ((i6 & 4) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j7;
        }
        if ((i6 & 8) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j8;
        }
        if ((i6 & 16) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j9;
        }
        if ((i6 & 32) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j10;
        }
        if ((i6 & 64) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j11;
        }
        if ((i6 & 128) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i5, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:977)");
        }
        ChipColors m1649copyFD3wquc = getDefaultAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1649copyFD3wquc(j13, j14, j15, j16, j17, j18, j19, j20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1649copyFD3wquc;
    }

    @p4.l
    @Composable
    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1567assistChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(245366099);
        if ((i6 & 1) != 0) {
            f11 = AssistChipTokens.INSTANCE.m2635getFlatContainerElevationD9Ej5fM();
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
            f15 = AssistChipTokens.INSTANCE.m2629getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = f11;
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i5, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:1029)");
        }
        ChipElevation chipElevation = new ChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @p4.l
    @Composable
    public final ChipColors elevatedAssistChipColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(655175583);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i5, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1087)");
        }
        ChipColors defaultElevatedAssistChipColors$material3_release = getDefaultElevatedAssistChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedAssistChipColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m1568elevatedAssistChipColorsoq7We08(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, @p4.m Composer composer, int i5, int i6) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        composer.startReplaceableGroup(-535762675);
        if ((i6 & 1) != 0) {
            j13 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j13 = j5;
        }
        if ((i6 & 2) != 0) {
            j14 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j14 = j6;
        }
        if ((i6 & 4) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j7;
        }
        if ((i6 & 8) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j8;
        }
        if ((i6 & 16) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j9;
        }
        if ((i6 & 32) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j10;
        }
        if ((i6 & 64) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j11;
        }
        if ((i6 & 128) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i5, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:1112)");
        }
        ChipColors m1649copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1649copyFD3wquc(j13, j14, j15, j16, j17, j18, j19, j20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1649copyFD3wquc;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m1569elevatedAssistChipElevationaqJV_2Y(float f5, float f6, float f7, float f8, float f9, float f10, @p4.m Composer composer, int i5, int i6) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        composer.startReplaceableGroup(1457698077);
        if ((i6 & 1) != 0) {
            f11 = AssistChipTokens.INSTANCE.m2630getElevatedContainerElevationD9Ej5fM();
        } else {
            f11 = f5;
        }
        if ((i6 & 2) != 0) {
            f12 = AssistChipTokens.INSTANCE.m2634getElevatedPressedContainerElevationD9Ej5fM();
        } else {
            f12 = f6;
        }
        if ((i6 & 4) != 0) {
            f13 = AssistChipTokens.INSTANCE.m2632getElevatedFocusContainerElevationD9Ej5fM();
        } else {
            f13 = f7;
        }
        if ((i6 & 8) != 0) {
            f14 = AssistChipTokens.INSTANCE.m2633getElevatedHoverContainerElevationD9Ej5fM();
        } else {
            f14 = f8;
        }
        if ((i6 & 16) != 0) {
            f15 = AssistChipTokens.INSTANCE.m2629getDraggedContainerElevationD9Ej5fM();
        } else {
            f15 = f9;
        }
        if ((i6 & 32) != 0) {
            f16 = AssistChipTokens.INSTANCE.m2631getElevatedDisabledContainerElevationD9Ej5fM();
        } else {
            f16 = f10;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i5, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:1164)");
        }
        ChipElevation chipElevation = new ChipElevation(f11, f12, f13, f14, f15, f16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    @p4.l
    public final ChipColors getDefaultAssistChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached$material3_release = colorScheme.getDefaultAssistChipColorsCached$material3_release();
        if (defaultAssistChipColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            ChipColors chipColors = new ChipColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultAssistChipColorsCached$material3_release(chipColors);
            return chipColors;
        }
        return defaultAssistChipColorsCached$material3_release;
    }

    @p4.l
    public final ChipColors getDefaultElevatedAssistChipColors$material3_release(@p4.l ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached$material3_release = colorScheme.getDefaultElevatedAssistChipColorsCached$material3_release();
        if (defaultElevatedAssistChipColorsCached$material3_release == null) {
            AssistChipTokens assistChipTokens = AssistChipTokens.INSTANCE;
            ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getElevatedDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, assistChipTokens.getDisabledIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultElevatedAssistChipColorsCached$material3_release(chipColors);
            return chipColors;
        }
        return defaultElevatedAssistChipColorsCached$material3_release;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m1570getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1571getIconSizeD9Ej5fM() {
        return IconSize;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1988153916);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i5, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:1174)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }
}

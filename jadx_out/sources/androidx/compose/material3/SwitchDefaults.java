package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000eJ²\u0001\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u00020\t*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/SwitchDefaults;", "", "()V", "IconSize", "Landroidx/compose/ui/unit/Dp;", "getIconSize-D9Ej5fM", "()F", "F", "defaultSwitchColors", "Landroidx/compose/material3/SwitchColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSwitchColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SwitchColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedBorderColor", "checkedIconColor", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedBorderColor", "uncheckedIconColor", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledCheckedBorderColor", "disabledCheckedIconColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "disabledUncheckedBorderColor", "disabledUncheckedIconColor", "colors-V1nXRL4", "(JJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SwitchColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,573:1\n154#2:574\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchDefaults\n*L\n387#1:574\n*E\n"})
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = Dp.m6044constructorimpl(16);

    private SwitchDefaults() {
    }

    @p4.l
    @Composable
    public final SwitchColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(435552781);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i5, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:269)");
        }
        SwitchColors defaultSwitchColors$material3_release = getDefaultSwitchColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m2335colorsV1nXRL4(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, @p4.m Composer composer, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1937926421);
        long value = (i7 & 1) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j5;
        long value2 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j6;
        long m3769getTransparent0d7_KjU = (i7 & 4) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j7;
        long value3 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j8;
        long value4 = (i7 & 16) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j9;
        long value5 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j10;
        long value6 = (i7 & 64) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j11;
        long value7 = (i7 & 128) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j12;
        long m3779compositeOverOWjLjI = (i7 & 256) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j13;
        long m3779compositeOverOWjLjI2 = (i7 & 512) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j14;
        long m3769getTransparent0d7_KjU2 = (i7 & 1024) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j15;
        long m3779compositeOverOWjLjI3 = (i7 & 2048) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j16;
        long m3779compositeOverOWjLjI4 = (i7 & 4096) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j17;
        long m3779compositeOverOWjLjI5 = (i7 & 8192) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j18;
        long m3779compositeOverOWjLjI6 = (i7 & 16384) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j19;
        long m3779compositeOverOWjLjI7 = (i7 & 32768) != 0 ? ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1706getSurface0d7_KjU()) : j20;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i5, i6, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:325)");
        }
        SwitchColors switchColors = new SwitchColors(value, value2, m3769getTransparent0d7_KjU, value3, value4, value5, value6, value7, m3779compositeOverOWjLjI, m3779compositeOverOWjLjI2, m3769getTransparent0d7_KjU2, m3779compositeOverOWjLjI3, m3779compositeOverOWjLjI4, m3779compositeOverOWjLjI5, m3779compositeOverOWjLjI6, m3779compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return switchColors;
    }

    @p4.l
    public final SwitchColors getDefaultSwitchColors$material3_release(@p4.l ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3_release = colorScheme.getDefaultSwitchColorsCached$material3_release();
        if (defaultSwitchColorsCached$material3_release == null) {
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedHandleColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedTrackColor());
            Color.Companion companion = Color.Companion;
            SwitchColors switchColors = new SwitchColors(fromToken, fromToken2, companion.m3769getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, switchTokens.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, switchTokens.getUnselectedIconColor()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedHandleColor()), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), companion.m3769getTransparent0d7_KjU(), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedHandleColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedTrackOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, switchTokens.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), null);
            colorScheme.setDefaultSwitchColorsCached$material3_release(switchColors);
            return switchColors;
        }
        return defaultSwitchColorsCached$material3_release;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m2336getIconSizeD9Ej5fM() {
        return IconSize;
    }
}

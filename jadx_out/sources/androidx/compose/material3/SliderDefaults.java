package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;

@Stable
@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106JN\u0010\u0010\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jv\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J5\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b)\u0010*J5\u0010)\u001a\u00020\r2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b)\u0010-J5\u0010)\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b)\u00100R\u0018\u00104\u001a\u00020\u0011*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "tickFractions", "", "activeRangeStart", "activeRangeEnd", "Landroidx/compose/ui/graphics/Color;", "inactiveTrackColor", "activeTrackColor", "inactiveTickColor", "activeTickColor", "Lkotlin/r2;", "drawTrack-LUBghH0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJ)V", "drawTrack", "Landroidx/compose/material3/SliderColors;", "colors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/unit/DpSize;", "thumbSize", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Thumb", "Landroidx/compose/material3/SliderPositions;", "sliderPositions", "Track", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "sliderState", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/RangeSliderState;", "rangeSliderState", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "defaultSliderColors", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2166\n1116#2,6:2172\n1116#2,6:2178\n75#3:2164\n154#4:2165\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n988#1:2152,6\n989#1:2158,6\n1055#1:2166,6\n1133#1:2172,6\n1173#1:2178,6\n1017#1:2164\n1021#1:2165\n*E\n"})
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-LUBghH0, reason: not valid java name */
    public final void m2194drawTrackLUBghH0(DrawScope drawScope, float[] fArr, float f5, float f6, long j5, long j6, long j7, long j8) {
        boolean z4;
        long j9;
        long j10;
        float f7;
        boolean z5;
        long j11;
        if (drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            z4 = true;
        } else {
            z4 = false;
        }
        long Offset = OffsetKt.Offset(0.0f, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        if (z4) {
            j9 = Offset2;
        } else {
            j9 = Offset;
        }
        if (z4) {
            j10 = Offset;
        } else {
            j10 = Offset2;
        }
        f7 = SliderKt.TickSize;
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f7);
        float mo304toPx0680j_42 = drawScope.mo304toPx0680j_4(SliderKt.getTrackHeight());
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j12 = j10;
        long j13 = j9;
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j5, j9, j10, mo304toPx0680j_42, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j6, OffsetKt.Offset(Offset.m3493getXimpl(j13) + ((Offset.m3493getXimpl(j12) - Offset.m3493getXimpl(j13)) * f5), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3493getXimpl(j13) + ((Offset.m3493getXimpl(j12) - Offset.m3493getXimpl(j13)) * f6), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), mo304toPx0680j_42, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        int length = fArr.length;
        int i5 = 0;
        while (i5 < length) {
            float f8 = fArr[i5];
            if (f8 <= f6 && f8 >= f5) {
                z5 = false;
            } else {
                z5 = true;
            }
            long j14 = j12;
            if (z5) {
                j11 = j7;
            } else {
                j11 = j8;
            }
            long j15 = j13;
            DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, j11, mo304toPx0680j_4 / 2.0f, OffsetKt.Offset(Offset.m3493getXimpl(OffsetKt.m3516lerpWko1d7g(j15, j14, f8)), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), 0.0f, null, null, 0, 120, null);
            i5++;
            j12 = j14;
            j13 = j15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0064  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2195Thumb9LiSoMs(@p4.l androidx.compose.foundation.interaction.MutableInteractionSource r30, @p4.m androidx.compose.ui.Modifier r31, @p4.m androidx.compose.material3.SliderColors r32, boolean r33, long r34, @p4.m androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m2195Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @kotlin.k(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Track(@p4.l androidx.compose.material3.SliderPositions r22, @p4.m androidx.compose.ui.Modifier r23, @p4.m androidx.compose.material3.SliderColors r24, boolean r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @p4.l
    @Composable
    public final SliderColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1376295968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i5, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:886)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2196colorsq0g_0yA(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m Composer composer, int i5, int i6, int i7) {
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        composer.startReplaceableGroup(885588574);
        if ((i7 & 1) != 0) {
            j15 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j15 = j5;
        }
        if ((i7 & 2) != 0) {
            j16 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j16 = j6;
        }
        if ((i7 & 4) != 0) {
            j17 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j17 = j7;
        }
        if ((i7 & 8) != 0) {
            j18 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j18 = j8;
        }
        if ((i7 & 16) != 0) {
            j19 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j19 = j9;
        }
        if ((i7 & 32) != 0) {
            j20 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j20 = j10;
        }
        if ((i7 & 64) != 0) {
            j21 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j21 = j11;
        }
        if ((i7 & 128) != 0) {
            j22 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j22 = j12;
        }
        if ((i7 & 256) != 0) {
            j23 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j23 = j13;
        }
        if ((i7 & 512) != 0) {
            j24 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j24 = j14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i5, i6, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:927)");
        }
        SliderColors m2179copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2179copyK518z4(j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2179copyK518z4;
    }

    @p4.l
    public final SliderColors getDefaultSliderColors$material3_release(@p4.l ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached$material3_release = colorScheme.getDefaultSliderColorsCached$material3_release();
        if (defaultSliderColorsCached$material3_release == null) {
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksActiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksInactiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1706getSurface0d7_KjU()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
            return sliderColors;
        }
        return defaultSliderColorsCached$material3_release;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Track(@p4.l androidx.compose.material3.SliderState r22, @p4.m androidx.compose.ui.Modifier r23, @p4.m androidx.compose.material3.SliderColors r24, boolean r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Track(@p4.l androidx.compose.material3.RangeSliderState r22, @p4.m androidx.compose.ui.Modifier r23, @p4.m androidx.compose.material3.SliderColors r24, boolean r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}

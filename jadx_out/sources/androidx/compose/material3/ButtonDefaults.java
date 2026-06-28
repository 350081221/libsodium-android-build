package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 1)
@kotlin.i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010:\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010:\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJD\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010L\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010BJD\u0010N\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ\r\u0010P\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010P\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010BJD\u0010R\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010KJ\r\u0010T\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010T\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010BJ\r\u0010V\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010V\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010BR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0016\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010-\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00104\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00106\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u00108\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconHorizontalEndPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "defaultButtonColors", "Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultTextButtonColors", "getDefaultTextButtonColors$material3_release", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1068:1\n154#2:1069\n154#2:1070\n154#2:1071\n154#2:1072\n154#2:1073\n154#2:1074\n154#2:1075\n154#2:1076\n154#2:1077\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n825#1:1069\n450#1:1070\n451#1:1071\n470#1:1072\n481#1:1073\n496#1:1074\n511#1:1075\n517#1:1076\n525#1:1077\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @p4.l
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;

    @p4.l
    private static final PaddingValues ContentPadding;

    @p4.l
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;

    @p4.l
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    @p4.l
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(24);
        ButtonHorizontalPadding = m6044constructorimpl;
        float f5 = 8;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(f5);
        ButtonVerticalPadding = m6044constructorimpl2;
        PaddingValues m549PaddingValuesa9UjIt4 = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl, m6044constructorimpl2, m6044constructorimpl, m6044constructorimpl2);
        ContentPadding = m549PaddingValuesa9UjIt4;
        float f6 = 16;
        float m6044constructorimpl3 = Dp.m6044constructorimpl(f6);
        ButtonWithIconHorizontalStartPadding = m6044constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl3, m6044constructorimpl2, m6044constructorimpl, m6044constructorimpl2);
        float m6044constructorimpl4 = Dp.m6044constructorimpl(12);
        TextButtonHorizontalPadding = m6044constructorimpl4;
        TextButtonContentPadding = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl4, m549PaddingValuesa9UjIt4.mo506calculateTopPaddingD9Ej5fM(), m6044constructorimpl4, m549PaddingValuesa9UjIt4.mo503calculateBottomPaddingD9Ej5fM());
        float m6044constructorimpl5 = Dp.m6044constructorimpl(f6);
        TextButtonWithIconHorizontalEndPadding = m6044constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl4, m549PaddingValuesa9UjIt4.mo506calculateTopPaddingD9Ej5fM(), m6044constructorimpl5, m549PaddingValuesa9UjIt4.mo503calculateBottomPaddingD9Ej5fM());
        MinWidth = Dp.m6044constructorimpl(58);
        MinHeight = Dp.m6044constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m2874getIconSizeD9Ej5fM();
        IconSpacing = Dp.m6044constructorimpl(f5);
    }

    private ButtonDefaults() {
    }

    @p4.l
    @Composable
    public final ButtonColors buttonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1449248637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i5, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1594buttonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-339300779);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i5, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        ButtonColors m1589copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1589copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1589copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1595buttonElevationR_JCAzs(float f5, float f6, float f7, float f8, float f9, @p4.m Composer composer, int i5, int i6) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        composer.startReplaceableGroup(1827791191);
        if ((i6 & 1) != 0) {
            f10 = FilledButtonTokens.INSTANCE.m2869getContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if ((i6 & 2) != 0) {
            f11 = FilledButtonTokens.INSTANCE.m2875getPressedContainerElevationD9Ej5fM();
        } else {
            f11 = f6;
        }
        if ((i6 & 4) != 0) {
            f12 = FilledButtonTokens.INSTANCE.m2872getFocusContainerElevationD9Ej5fM();
        } else {
            f12 = f7;
        }
        if ((i6 & 8) != 0) {
            f13 = FilledButtonTokens.INSTANCE.m2873getHoverContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i6 & 16) != 0) {
            f14 = FilledButtonTokens.INSTANCE.m2871getDisabledContainerElevationD9Ej5fM();
        } else {
            f14 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i5, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f12, f13, f14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @p4.l
    @Composable
    public final ButtonColors elevatedButtonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2025043443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i5, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:589)");
        }
        ButtonColors defaultElevatedButtonColors$material3_release = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1596elevatedButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(1507908383);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i5, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:606)");
        }
        ButtonColors m1589copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1589copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1589copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1597elevatedButtonElevationR_JCAzs(float f5, float f6, float f7, float f8, float f9, @p4.m Composer composer, int i5, int i6) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        composer.startReplaceableGroup(1065482445);
        if ((i6 & 1) != 0) {
            f10 = ElevatedButtonTokens.INSTANCE.m2785getContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if ((i6 & 2) != 0) {
            f11 = ElevatedButtonTokens.INSTANCE.m2791getPressedContainerElevationD9Ej5fM();
        } else {
            f11 = f6;
        }
        if ((i6 & 4) != 0) {
            f12 = ElevatedButtonTokens.INSTANCE.m2788getFocusContainerElevationD9Ej5fM();
        } else {
            f12 = f7;
        }
        if ((i6 & 8) != 0) {
            f13 = ElevatedButtonTokens.INSTANCE.m2789getHoverContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i6 & 16) != 0) {
            f14 = ElevatedButtonTokens.INSTANCE.m2787getDisabledContainerElevationD9Ej5fM();
        } else {
            f14 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i5, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:798)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f12, f13, f14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @p4.l
    @Composable
    public final ButtonColors filledTonalButtonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(824987837);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i5, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:632)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3_release = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFilledTonalButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1598filledTonalButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(1670757653);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i5, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:649)");
        }
        ButtonColors m1589copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1589copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1589copyjRlVdoo;
    }

    @p4.l
    @Composable
    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1599filledTonalButtonElevationR_JCAzs(float f5, float f6, float f7, float f8, float f9, @p4.m Composer composer, int i5, int i6) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        composer.startReplaceableGroup(5982871);
        if ((i6 & 1) != 0) {
            f10 = FilledTonalButtonTokens.INSTANCE.m2892getContainerElevationD9Ej5fM();
        } else {
            f10 = f5;
        }
        if ((i6 & 2) != 0) {
            f11 = FilledTonalButtonTokens.INSTANCE.m2898getPressedContainerElevationD9Ej5fM();
        } else {
            f11 = f6;
        }
        if ((i6 & 4) != 0) {
            f12 = FilledTonalButtonTokens.INSTANCE.m2895getFocusContainerElevationD9Ej5fM();
        } else {
            f12 = f7;
        }
        if ((i6 & 8) != 0) {
            f13 = FilledTonalButtonTokens.INSTANCE.m2896getHoverContainerElevationD9Ej5fM();
        } else {
            f13 = f8;
        }
        if ((i6 & 16) != 0) {
            f14 = Dp.m6044constructorimpl(0);
        } else {
            f14 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i5, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:825)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(f10, f11, f12, f13, f14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @p4.l
    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    @p4.l
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @p4.l
    public final ButtonColors getDefaultButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3_release = colorScheme.getDefaultButtonColorsCached$material3_release();
        if (defaultButtonColorsCached$material3_release == null) {
            FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultButtonColorsCached$material3_release;
    }

    @p4.l
    public final ButtonColors getDefaultElevatedButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached$material3_release = colorScheme.getDefaultElevatedButtonColorsCached$material3_release();
        if (defaultElevatedButtonColorsCached$material3_release == null) {
            ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultElevatedButtonColorsCached$material3_release;
    }

    @p4.l
    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached$material3_release = colorScheme.getDefaultFilledTonalButtonColorsCached$material3_release();
        if (defaultFilledTonalButtonColorsCached$material3_release == null) {
            FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultFilledTonalButtonColorsCached$material3_release;
    }

    @p4.l
    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached$material3_release = colorScheme.getDefaultOutlinedButtonColorsCached$material3_release();
        if (defaultOutlinedButtonColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultOutlinedButtonColorsCached$material3_release;
    }

    @p4.l
    public final ButtonColors getDefaultTextButtonColors$material3_release(@p4.l ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3_release = colorScheme.getDefaultTextButtonColorsCached$material3_release();
        if (defaultTextButtonColorsCached$material3_release == null) {
            Color.Companion companion = Color.Companion;
            long m3769getTransparent0d7_KjU = companion.m3769getTransparent0d7_KjU();
            TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
            ButtonColors buttonColors = new ButtonColors(m3769getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m3769getTransparent0d7_KjU(), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
            colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
            return buttonColors;
        }
        return defaultTextButtonColorsCached$material3_release;
    }

    @p4.l
    @u3.h(name = "getElevatedShape")
    @Composable
    public final Shape getElevatedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:530)");
        }
        Shape value = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getFilledTonalShape")
    @Composable
    public final Shape getFilledTonalShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:533)");
        }
        Shape value = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1600getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1601getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1602getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1603getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @p4.l
    @u3.h(name = "getOutlinedButtonBorder")
    @Composable
    public final BorderStroke getOutlinedButtonBorder(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:836)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(outlinedButtonTokens.m2977getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m228BorderStrokecXLIe8U;
    }

    @p4.l
    @u3.h(name = "getOutlinedShape")
    @Composable
    public final Shape getOutlinedShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:536)");
        }
        Shape value = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @p4.l
    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    @p4.l
    @u3.h(name = "getTextShape")
    @Composable
    public final Shape getTextShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i5, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:539)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @p4.l
    @Composable
    public final ButtonColors outlinedButtonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1344886725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i5, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:675)");
        }
        ButtonColors defaultOutlinedButtonColors$material3_release = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1604outlinedButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1778526249);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i5, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:692)");
        }
        ButtonColors m1589copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1589copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1589copyjRlVdoo;
    }

    @p4.l
    @Composable
    public final ButtonColors textButtonColors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(1880341584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i5, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:717)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextButtonColors$material3_release;
    }

    @p4.l
    @Composable
    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1605textButtonColorsro_MJ88(long j5, long j6, long j7, long j8, @p4.m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(-1402274782);
        if ((i6 & 1) != 0) {
            j9 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            j11 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i5, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:734)");
        }
        ButtonColors m1589copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m1589copyjRlVdoo(j9, j10, j11, j12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1589copyjRlVdoo;
    }
}

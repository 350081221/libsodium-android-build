package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;
import u3.h;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.JD\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J0\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105J0\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0016\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,617:1\n154#2:618\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:637\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n83#3,3:628\n1116#4,6:631\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n346#1:618\n347#1:619\n348#1:620\n353#1:621\n354#1:622\n372#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n294#1:637\n295#1:638\n311#1:639\n317#1:640\n324#1:641\n331#1:642\n469#1:643\n480#1:644\n378#1:628,3\n378#1:631,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @l
    private static final PaddingValues ContentPadding;

    @l
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;

    @l
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(16);
        ButtonHorizontalPadding = m6044constructorimpl;
        float f5 = 8;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(f5);
        ButtonVerticalPadding = m6044constructorimpl2;
        PaddingValues m549PaddingValuesa9UjIt4 = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl, m6044constructorimpl2, m6044constructorimpl, m6044constructorimpl2);
        ContentPadding = m549PaddingValuesa9UjIt4;
        MinWidth = Dp.m6044constructorimpl(64);
        MinHeight = Dp.m6044constructorimpl(36);
        IconSize = Dp.m6044constructorimpl(18);
        IconSpacing = Dp.m6044constructorimpl(f5);
        OutlinedBorderSize = Dp.m6044constructorimpl(1);
        float m6044constructorimpl3 = Dp.m6044constructorimpl(f5);
        TextButtonHorizontalPadding = m6044constructorimpl3;
        TextButtonContentPadding = PaddingKt.m549PaddingValuesa9UjIt4(m6044constructorimpl3, m549PaddingValuesa9UjIt4.mo506calculateTopPaddingD9Ej5fM(), m6044constructorimpl3, m549PaddingValuesa9UjIt4.mo503calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @l
    @Composable
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1240buttonColorsro_MJ88(long j5, long j6, long j7, long j8, @m Composer composer, int i5, int i6) {
        long j9;
        long j10;
        long j11;
        long j12;
        composer.startReplaceableGroup(1870371134);
        if ((i6 & 1) != 0) {
            j9 = MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU();
        } else {
            j9 = j5;
        }
        if ((i6 & 2) != 0) {
            j10 = ColorsKt.m1293contentColorForek8zF_U(j9, composer, i5 & 14);
        } else {
            j10 = j6;
        }
        if ((i6 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j11 = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(materialTheme.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1279getSurface0d7_KjU());
        } else {
            j11 = j7;
        }
        if ((i6 & 8) != 0) {
            j12 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j12 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i5, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j9, j10, j11, j12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @l
    @Composable
    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1241elevationR_JCAzs(float f5, float f6, float f7, float f8, float f9, @m Composer composer, int i5, int i6) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        composer.startReplaceableGroup(-737170518);
        if ((i6 & 1) != 0) {
            f10 = Dp.m6044constructorimpl(2);
        } else {
            f10 = f5;
        }
        if ((i6 & 2) != 0) {
            f11 = Dp.m6044constructorimpl(8);
        } else {
            f11 = f6;
        }
        if ((i6 & 4) != 0) {
            f12 = Dp.m6044constructorimpl(0);
        } else {
            f12 = f7;
        }
        if ((i6 & 8) != 0) {
            f13 = Dp.m6044constructorimpl(4);
        } else {
            f13 = f8;
        }
        if ((i6 & 16) != 0) {
            f14 = Dp.m6044constructorimpl(4);
        } else {
            f14 = f9;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i5, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] objArr = {Dp.m6042boximpl(f10), Dp.m6042boximpl(f11), Dp.m6042boximpl(f12), Dp.m6042boximpl(f13), Dp.m6042boximpl(f14)};
        composer.startReplaceableGroup(-568225417);
        boolean z4 = false;
        for (int i7 = 0; i7 < 5; i7++) {
            z4 |= composer.changed(objArr[i7]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(f10, f11, f12, f13, f14, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1242elevationyajeYGU(float f5, float f6, float f7, Composer composer, int i5, int i6) {
        float f8;
        float f9;
        float f10;
        composer.startReplaceableGroup(1428576874);
        if ((i6 & 1) != 0) {
            f8 = Dp.m6044constructorimpl(2);
        } else {
            f8 = f5;
        }
        if ((i6 & 2) != 0) {
            f9 = Dp.m6044constructorimpl(8);
        } else {
            f9 = f6;
        }
        if ((i6 & 4) != 0) {
            f10 = Dp.m6044constructorimpl(0);
        } else {
            f10 = f7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i5, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:348)");
        }
        float f11 = 4;
        ButtonElevation m1241elevationR_JCAzs = m1241elevationR_JCAzs(f8, f9, f10, Dp.m6044constructorimpl(f11), Dp.m6044constructorimpl(f11), composer, (i5 & 14) | 27648 | (i5 & 112) | (i5 & 896) | ((i5 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1241elevationR_JCAzs;
    }

    @l
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1243getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1244getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1245getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1246getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @l
    @h(name = "getOutlinedBorder")
    @Composable
    public final BorderStroke getOutlinedBorder(@m Composer composer, int i5) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i5, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:475)");
        }
        BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(OutlinedBorderSize, Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m228BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1247getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @l
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @l
    @Composable
    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1248outlinedButtonColorsRGew2ao(long j5, long j6, long j7, @m Composer composer, int i5, int i6) {
        long j8;
        long j9;
        long j10;
        composer.startReplaceableGroup(-2124406093);
        if ((i6 & 1) != 0) {
            j8 = MaterialTheme.INSTANCE.getColors(composer, 6).m1279getSurface0d7_KjU();
        } else {
            j8 = j5;
        }
        if ((i6 & 2) != 0) {
            j9 = MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU();
        } else {
            j9 = j6;
        }
        if ((i6 & 4) != 0) {
            j10 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j10 = j7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i5, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:432)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j8, j9, j8, j10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @l
    @Composable
    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1249textButtonColorsRGew2ao(long j5, long j6, long j7, @m Composer composer, int i5, int i6) {
        long j8;
        long j9;
        long j10;
        composer.startReplaceableGroup(182742216);
        if ((i6 & 1) != 0) {
            j8 = Color.Companion.m3769getTransparent0d7_KjU();
        } else {
            j8 = j5;
        }
        if ((i6 & 2) != 0) {
            j9 = MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU();
        } else {
            j9 = j6;
        }
        if ((i6 & 4) != 0) {
            j10 = Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j10 = j7;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i5, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(j8, j9, j8, j10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }
}

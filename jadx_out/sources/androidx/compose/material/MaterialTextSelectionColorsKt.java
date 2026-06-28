package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", ForeAndBackgroundEvent.FOREGROUND, ForeAndBackgroundEvent.BACKGROUND, "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n74#3:245\n67#4,3:246\n66#4:249\n1116#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j5, long j6, long j7) {
        float f5 = 0.2f;
        float f6 = 0.4f;
        float f7 = 0.4f;
        for (int i5 = 0; i5 < 7; i5++) {
            float m1372calculateContrastRationb2GgbA = (m1372calculateContrastRationb2GgbA(j5, f6, j6, j7) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1372calculateContrastRationb2GgbA && m1372calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1372calculateContrastRationb2GgbA < 0.0f) {
                f7 = f6;
            } else {
                f5 = f6;
            }
            f6 = (f7 + f5) / 2.0f;
        }
        return f6;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1371calculateContrastRatioOWjLjI(long j5, long j6) {
        float m3786luminance8_81llA = ColorKt.m3786luminance8_81llA(j5) + 0.05f;
        float m3786luminance8_81llA2 = ColorKt.m3786luminance8_81llA(j6) + 0.05f;
        return Math.max(m3786luminance8_81llA, m3786luminance8_81llA2) / Math.min(m3786luminance8_81llA, m3786luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1372calculateContrastRationb2GgbA(long j5, float f5, long j6, long j7) {
        long m3779compositeOverOWjLjI = ColorKt.m3779compositeOverOWjLjI(Color.m3733copywmQWz5c$default(j5, f5, 0.0f, 0.0f, 0.0f, 14, null), j7);
        return m1371calculateContrastRatioOWjLjI(ColorKt.m3779compositeOverOWjLjI(j6, m3779compositeOverOWjLjI), m3779compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1373calculateSelectionBackgroundColorysEtTa8(long j5, long j6, long j7) {
        float m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1372calculateContrastRationb2GgbA = m1372calculateContrastRationb2GgbA(j5, 0.4f, j6, j7);
        float m1372calculateContrastRationb2GgbA2 = m1372calculateContrastRationb2GgbA(j5, 0.2f, j6, j7);
        if (m1372calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else if (m1372calculateContrastRationb2GgbA2 < DesiredContrastRatio) {
            m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.2f;
        } else {
            m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8(j5, j6, j7);
        }
        return Color.m3733copywmQWz5c$default(j5, m1370binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @l
    @Composable
    public static final TextSelectionColors rememberTextSelectionColors(@l Colors colors, @m Composer composer, int i5) {
        boolean z4;
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i5, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1275getPrimary0d7_KjU = colors.m1275getPrimary0d7_KjU();
        long m1268getBackground0d7_KjU = colors.m1268getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m1292contentColorFor4WTKRHQ = ColorsKt.m1292contentColorFor4WTKRHQ(colors, m1268getBackground0d7_KjU);
        if (m1292contentColorFor4WTKRHQ != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m1292contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl();
        }
        composer.endReplaceableGroup();
        long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(m1292contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m3724boximpl = Color.m3724boximpl(m1275getPrimary0d7_KjU);
        Color m3724boximpl2 = Color.m3724boximpl(m1268getBackground0d7_KjU);
        Color m3724boximpl3 = Color.m3724boximpl(m3733copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m3724boximpl) | composer.changed(m3724boximpl2) | composer.changed(m3724boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m1275getPrimary0d7_KjU(), m1373calculateSelectionBackgroundColorysEtTa8(m1275getPrimary0d7_KjU, m3733copywmQWz5c$default, m1268getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}

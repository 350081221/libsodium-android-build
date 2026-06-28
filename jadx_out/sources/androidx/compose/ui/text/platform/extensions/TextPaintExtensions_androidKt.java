package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aP\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000\u001a6\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010\u001c\u001a\u00020\f*\u00020\u0001H\u0000\u001a\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "Landroidx/compose/ui/unit/Density;", "density", "", "requiresLetterSpacing", "applySpanStyle", "Landroidx/compose/ui/unit/TextUnit;", "letterSpacing", "Landroidx/compose/ui/graphics/Color;", ForeAndBackgroundEvent.BACKGROUND, "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/style/TextMotion;", "textMotion", "Lkotlin/r2;", "setTextMotion", "hasFontAttributes", "", "blurRadius", "correctBlurRadius", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    @m
    public static final SpanStyle applySpanStyle(@l AndroidTextPaint androidTextPaint, @l SpanStyle spanStyle, @l r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar, @l Density density, boolean z4) {
        boolean z5;
        int m5661getNormal_LCdwA;
        int m5671getAllGVVA2EU;
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(spanStyle.m5505getFontSizeXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo303toPxR2X_6o(spanStyle.m5505getFontSizeXSAIIZE()));
        } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
            androidTextPaint.setTextSize(androidTextPaint.getTextSize() * TextUnit.m6235getValueimpl(spanStyle.m5505getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(spanStyle)) {
            FontFamily fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m5506getFontStyle4Lr2A7w = spanStyle.m5506getFontStyle4Lr2A7w();
            if (m5506getFontStyle4Lr2A7w != null) {
                m5661getNormal_LCdwA = m5506getFontStyle4Lr2A7w.m5657unboximpl();
            } else {
                m5661getNormal_LCdwA = FontStyle.Companion.m5661getNormal_LCdwA();
            }
            FontStyle m5651boximpl = FontStyle.m5651boximpl(m5661getNormal_LCdwA);
            FontSynthesis m5507getFontSynthesisZQGJjVo = spanStyle.m5507getFontSynthesisZQGJjVo();
            if (m5507getFontSynthesisZQGJjVo != null) {
                m5671getAllGVVA2EU = m5507getFontSynthesisZQGJjVo.m5670unboximpl();
            } else {
                m5671getAllGVVA2EU = FontSynthesis.Companion.m5671getAllGVVA2EU();
            }
            androidTextPaint.setTypeface(rVar.invoke(fontFamily, fontWeight, m5651boximpl, FontSynthesis.m5662boximpl(m5671getAllGVVA2EU)));
        }
        if (spanStyle.getLocaleList() != null && !l0.g(spanStyle.getLocaleList(), LocaleList.Companion.getCurrent())) {
            LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !l0.g(spanStyle.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !l0.g(spanStyle.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint.m5801setColor8_81llA(spanStyle.m5504getColor0d7_KjU());
        androidTextPaint.m5800setBrush12SF9DM(spanStyle.getBrush(), Size.Companion.m3570getUnspecifiedNHjbRc(), spanStyle.getAlpha());
        androidTextPaint.setShadow(spanStyle.getShadow());
        androidTextPaint.setTextDecoration(spanStyle.getTextDecoration());
        androidTextPaint.setDrawStyle(spanStyle.getDrawStyle());
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(spanStyle.m5508getLetterSpacingXSAIIZE()), companion.m6268getSpUIouoOA())) {
            boolean z6 = true;
            if (TextUnit.m6235getValueimpl(spanStyle.m5508getLetterSpacingXSAIIZE()) == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                float textSize = androidTextPaint.getTextSize() * androidTextPaint.getTextScaleX();
                float mo303toPxR2X_6o = density.mo303toPxR2X_6o(spanStyle.m5508getLetterSpacingXSAIIZE());
                if (textSize != 0.0f) {
                    z6 = false;
                }
                if (!z6) {
                    androidTextPaint.setLetterSpacing(mo303toPxR2X_6o / textSize);
                }
                return m5815generateFallbackSpanStyle62GTOB8(spanStyle.m5508getLetterSpacingXSAIIZE(), z4, spanStyle.m5502getBackground0d7_KjU(), spanStyle.m5503getBaselineShift5SSeXJ0());
            }
        }
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(spanStyle.m5508getLetterSpacingXSAIIZE()), companion.m6267getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m6235getValueimpl(spanStyle.m5508getLetterSpacingXSAIIZE()));
        }
        return m5815generateFallbackSpanStyle62GTOB8(spanStyle.m5508getLetterSpacingXSAIIZE(), z4, spanStyle.m5502getBackground0d7_KjU(), spanStyle.m5503getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, r rVar, Density density, boolean z4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, rVar, density, z4);
    }

    public static final float correctBlurRadius(float f5) {
        if (f5 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (androidx.compose.ui.text.style.BaselineShift.m5823equalsimpl0(r37.m5826unboximpl(), androidx.compose.ui.text.style.BaselineShift.Companion.m5830getNoney9eOQZs()) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.ui.text.SpanStyle m5815generateFallbackSpanStyle62GTOB8(long r32, boolean r34, long r35, androidx.compose.ui.text.style.BaselineShift r37) {
        /*
            r0 = r35
            r2 = 1
            r3 = 0
            if (r34 == 0) goto L26
            long r4 = androidx.compose.ui.unit.TextUnit.m6234getTypeUIouoOA(r32)
            androidx.compose.ui.unit.TextUnitType$Companion r6 = androidx.compose.ui.unit.TextUnitType.Companion
            long r6 = r6.m6268getSpUIouoOA()
            boolean r4 = androidx.compose.ui.unit.TextUnitType.m6263equalsimpl0(r4, r6)
            if (r4 == 0) goto L26
            float r4 = androidx.compose.ui.unit.TextUnit.m6235getValueimpl(r32)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L21
            r4 = r2
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L26
            r4 = r2
            goto L27
        L26:
            r4 = r3
        L27:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.Companion
            long r6 = r5.m3770getUnspecified0d7_KjU()
            boolean r6 = androidx.compose.ui.graphics.Color.m3735equalsimpl0(r0, r6)
            if (r6 != 0) goto L3f
            long r6 = r5.m3769getTransparent0d7_KjU()
            boolean r6 = androidx.compose.ui.graphics.Color.m3735equalsimpl0(r0, r6)
            if (r6 != 0) goto L3f
            r6 = r2
            goto L40
        L3f:
            r6 = r3
        L40:
            if (r37 == 0) goto L53
            androidx.compose.ui.text.style.BaselineShift$Companion r7 = androidx.compose.ui.text.style.BaselineShift.Companion
            float r7 = r7.m5830getNoney9eOQZs()
            float r8 = r37.m5826unboximpl()
            boolean r7 = androidx.compose.ui.text.style.BaselineShift.m5823equalsimpl0(r8, r7)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r2 = r3
        L54:
            r3 = 0
            if (r4 != 0) goto L5c
            if (r6 != 0) goto L5c
            if (r2 != 0) goto L5c
            goto L9c
        L5c:
            if (r4 == 0) goto L61
            r19 = r32
            goto L69
        L61:
            androidx.compose.ui.unit.TextUnit$Companion r4 = androidx.compose.ui.unit.TextUnit.Companion
            long r7 = r4.m6246getUnspecifiedXSAIIZE()
            r19 = r7
        L69:
            if (r6 == 0) goto L6c
            goto L70
        L6c:
            long r0 = r5.m3770getUnspecified0d7_KjU()
        L70:
            r24 = r0
            if (r2 == 0) goto L77
            r21 = r37
            goto L79
        L77:
            r21 = r3
        L79:
            androidx.compose.ui.text.SpanStyle r3 = new androidx.compose.ui.text.SpanStyle
            r9 = r3
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63103(0xf67f, float:8.8426E-41)
            r31 = 0
            r9.<init>(r10, r12, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31)
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.m5815generateFallbackSpanStyle62GTOB8(long, boolean, long, androidx.compose.ui.text.style.BaselineShift):androidx.compose.ui.text.SpanStyle");
    }

    public static final boolean hasFontAttributes(@l SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.m5506getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@l AndroidTextPaint androidTextPaint, @m TextMotion textMotion) {
        int flags;
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        if (textMotion.getSubpixelTextPositioning$ui_text_release()) {
            flags = androidTextPaint.getFlags() | 128;
        } else {
            flags = androidTextPaint.getFlags() & (-129);
        }
        androidTextPaint.setFlags(flags);
        int m5964getLinearity4e0Vf04$ui_text_release = textMotion.m5964getLinearity4e0Vf04$ui_text_release();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.Companion;
        if (TextMotion.Linearity.m5968equalsimpl0(m5964getLinearity4e0Vf04$ui_text_release, companion.m5973getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m5968equalsimpl0(m5964getLinearity4e0Vf04$ui_text_release, companion.m5972getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (TextMotion.Linearity.m5968equalsimpl0(m5964getLinearity4e0Vf04$ui_text_release, companion.m5974getNone4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        } else {
            androidTextPaint.getFlags();
        }
    }
}

package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a*\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001aÀ\u0001\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u00012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u00010\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0000ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0018\u0010;\u001a\u0004\u0018\u00010\u0013*\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0013H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", bi.ay, "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", bi.aL, "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", TypedValues.Custom.S_COLOR, "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", ForeAndBackgroundEvent.BACKGROUND, "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,951:1\n658#2:952\n646#2:953\n646#2:955\n646#2:957\n658#2:958\n646#2:959\n250#3:954\n250#3:956\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n849#1:952\n849#1:953\n891#1:955\n906#1:957\n938#1:958\n938#1:959\n890#1:954\n896#1:956\n*E\n"})
/* loaded from: classes.dex */
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m3769getTransparent0d7_KjU();
        DefaultColor = companion.m3760getBlack0d7_KjU();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m6232equalsimpl0(r26, r21.m5505getFontSizeXSAIIZE()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0062, code lost:
    
        if (androidx.compose.ui.graphics.Color.m3735equalsimpl0(r22, r21.getTextForegroundStyle$ui_text_release().mo5834getColor0d7_KjU()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        if (kotlin.jvm.internal.l0.g(r6, r21.m5506getFontStyle4Lr2A7w()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007a, code lost:
    
        if (kotlin.jvm.internal.l0.g(r5, r21.getFontWeight()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0082, code lost:
    
        if (r31 != r21.getFontFamily()) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0096, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m6232equalsimpl0(r33, r21.m5508getLetterSpacingXSAIIZE()) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c8, code lost:
    
        if ((r25 == r21.getTextForegroundStyle$ui_text_release().getAlpha()) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x015a  */
    @p4.l
    /* renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.SpanStyle m5509fastMergedSHsh3o(@p4.l androidx.compose.ui.text.SpanStyle r21, long r22, @p4.m androidx.compose.ui.graphics.Brush r24, float r25, long r26, @p4.m androidx.compose.ui.text.font.FontWeight r28, @p4.m androidx.compose.ui.text.font.FontStyle r29, @p4.m androidx.compose.ui.text.font.FontSynthesis r30, @p4.m androidx.compose.ui.text.font.FontFamily r31, @p4.m java.lang.String r32, long r33, @p4.m androidx.compose.ui.text.style.BaselineShift r35, @p4.m androidx.compose.ui.text.style.TextGeometricTransform r36, @p4.m androidx.compose.ui.text.intl.LocaleList r37, long r38, @p4.m androidx.compose.ui.text.style.TextDecoration r40, @p4.m androidx.compose.ui.graphics.Shadow r41, @p4.m androidx.compose.ui.text.PlatformSpanStyle r42, @p4.m androidx.compose.ui.graphics.drawscope.DrawStyle r43) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.SpanStyleKt.m5509fastMergedSHsh3o(androidx.compose.ui.text.SpanStyle, long, androidx.compose.ui.graphics.Brush, float, long, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontSynthesis, androidx.compose.ui.text.font.FontFamily, java.lang.String, long, androidx.compose.ui.text.style.BaselineShift, androidx.compose.ui.text.style.TextGeometricTransform, androidx.compose.ui.text.intl.LocaleList, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.graphics.Shadow, androidx.compose.ui.text.PlatformSpanStyle, androidx.compose.ui.graphics.drawscope.DrawStyle):androidx.compose.ui.text.SpanStyle");
    }

    @l
    public static final SpanStyle lerp(@l SpanStyle spanStyle, @l SpanStyle spanStyle2, float f5) {
        float m5821constructorimpl;
        float m5821constructorimpl2;
        TextForegroundStyle lerp = TextDrawStyleKt.lerp(spanStyle.getTextForegroundStyle$ui_text_release(), spanStyle2.getTextForegroundStyle$ui_text_release(), f5);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f5);
        long m5510lerpTextUnitInheritableC3pnCVY = m5510lerpTextUnitInheritableC3pnCVY(spanStyle.m5505getFontSizeXSAIIZE(), spanStyle2.m5505getFontSizeXSAIIZE(), f5);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp2 = FontWeightKt.lerp(fontWeight, fontWeight2, f5);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(spanStyle.m5506getFontStyle4Lr2A7w(), spanStyle2.m5506getFontStyle4Lr2A7w(), f5);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(spanStyle.m5507getFontSynthesisZQGJjVo(), spanStyle2.m5507getFontSynthesisZQGJjVo(), f5);
        String str = (String) lerpDiscrete(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f5);
        long m5510lerpTextUnitInheritableC3pnCVY2 = m5510lerpTextUnitInheritableC3pnCVY(spanStyle.m5508getLetterSpacingXSAIIZE(), spanStyle2.m5508getLetterSpacingXSAIIZE(), f5);
        BaselineShift m5503getBaselineShift5SSeXJ0 = spanStyle.m5503getBaselineShift5SSeXJ0();
        if (m5503getBaselineShift5SSeXJ0 != null) {
            m5821constructorimpl = m5503getBaselineShift5SSeXJ0.m5826unboximpl();
        } else {
            m5821constructorimpl = BaselineShift.m5821constructorimpl(0.0f);
        }
        BaselineShift m5503getBaselineShift5SSeXJ02 = spanStyle2.m5503getBaselineShift5SSeXJ0();
        if (m5503getBaselineShift5SSeXJ02 != null) {
            m5821constructorimpl2 = m5503getBaselineShift5SSeXJ02.m5826unboximpl();
        } else {
            m5821constructorimpl2 = BaselineShift.m5821constructorimpl(0.0f);
        }
        float m5833lerpjWV1Mfo = BaselineShiftKt.m5833lerpjWV1Mfo(m5821constructorimpl, m5821constructorimpl2, f5);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp3 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f5);
        LocaleList localeList = (LocaleList) lerpDiscrete(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f5);
        long m3785lerpjxsXWHM = ColorKt.m3785lerpjxsXWHM(spanStyle.m5502getBackground0d7_KjU(), spanStyle2.m5502getBackground0d7_KjU(), f5);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f5);
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = spanStyle2.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(lerp, m5510lerpTextUnitInheritableC3pnCVY, lerp2, fontStyle, fontSynthesis, fontFamily, str, m5510lerpTextUnitInheritableC3pnCVY2, BaselineShift.m5820boximpl(m5833lerpjWV1Mfo), lerp3, localeList, m3785lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f5), lerpPlatformStyle(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f5), (DrawStyle) lerpDiscrete(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f5), (w) null);
    }

    public static final <T> T lerpDiscrete(T t5, T t6, float f5) {
        return ((double) f5) < 0.5d ? t5 : t6;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f5) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Companion.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f5);
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m5510lerpTextUnitInheritableC3pnCVY(long j5, long j6, float f5) {
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(j5) && !TextUnitKt.m6253isUnspecifiedR2X_6o(j6)) {
            return TextUnitKt.m6255lerpC3pnCVY(j5, j6, f5);
        }
        return ((TextUnit) lerpDiscrete(TextUnit.m6225boximpl(j5), TextUnit.m6225boximpl(j6), f5)).m6244unboximpl();
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        if (platformSpanStyle == null) {
            return spanStyle.getPlatformStyle();
        }
        return spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    @l
    public static final SpanStyle resolveSpanStyleDefaults(@l SpanStyle spanStyle) {
        long m5505getFontSizeXSAIIZE;
        int m5661getNormal_LCdwA;
        int m5671getAllGVVA2EU;
        long m5508getLetterSpacingXSAIIZE;
        float m5830getNoney9eOQZs;
        boolean z4;
        TextForegroundStyle takeOrElse = spanStyle.getTextForegroundStyle$ui_text_release().takeOrElse(SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE);
        if (TextUnitKt.m6253isUnspecifiedR2X_6o(spanStyle.m5505getFontSizeXSAIIZE())) {
            m5505getFontSizeXSAIIZE = DefaultFontSize;
        } else {
            m5505getFontSizeXSAIIZE = spanStyle.m5505getFontSizeXSAIIZE();
        }
        long j5 = m5505getFontSizeXSAIIZE;
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
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
        FontSynthesis m5662boximpl = FontSynthesis.m5662boximpl(m5671getAllGVVA2EU);
        FontFamily fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        if (TextUnitKt.m6253isUnspecifiedR2X_6o(spanStyle.m5508getLetterSpacingXSAIIZE())) {
            m5508getLetterSpacingXSAIIZE = DefaultLetterSpacing;
        } else {
            m5508getLetterSpacingXSAIIZE = spanStyle.m5508getLetterSpacingXSAIIZE();
        }
        long j6 = m5508getLetterSpacingXSAIIZE;
        BaselineShift m5503getBaselineShift5SSeXJ0 = spanStyle.m5503getBaselineShift5SSeXJ0();
        if (m5503getBaselineShift5SSeXJ0 != null) {
            m5830getNoney9eOQZs = m5503getBaselineShift5SSeXJ0.m5826unboximpl();
        } else {
            m5830getNoney9eOQZs = BaselineShift.Companion.m5830getNoney9eOQZs();
        }
        BaselineShift m5820boximpl = BaselineShift.m5820boximpl(m5830getNoney9eOQZs);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m5502getBackground0d7_KjU = spanStyle.m5502getBackground0d7_KjU();
        if (m5502getBackground0d7_KjU != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            m5502getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j7 = m5502getBackground0d7_KjU;
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = spanStyle.getPlatformStyle();
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(takeOrElse, j5, fontWeight2, m5651boximpl, m5662boximpl, fontFamily2, str, j6, m5820boximpl, textGeometricTransform2, localeList2, j7, textDecoration2, shadow2, platformStyle, drawStyle, (w) null);
    }
}

package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a&\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001af\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u0004\u0018\u00010\n*\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,538:1\n250#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n500#1:539\n*E\n"})
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    private static final long DefaultLineHeight = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
    
        if (androidx.compose.ui.unit.TextUnit.m6232equalsimpl0(r14, r24.m5458getLineHeightXSAIIZE()) != false) goto L14;
     */
    @p4.l
    /* renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.text.ParagraphStyle m5463fastMergej5T8yCg(@p4.l androidx.compose.ui.text.ParagraphStyle r24, int r25, int r26, long r27, @p4.m androidx.compose.ui.text.style.TextIndent r29, @p4.m androidx.compose.ui.text.PlatformParagraphStyle r30, @p4.m androidx.compose.ui.text.style.LineHeightStyle r31, int r32, int r33, @p4.m androidx.compose.ui.text.style.TextMotion r34) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.ParagraphStyleKt.m5463fastMergej5T8yCg(androidx.compose.ui.text.ParagraphStyle, int, int, long, androidx.compose.ui.text.style.TextIndent, androidx.compose.ui.text.PlatformParagraphStyle, androidx.compose.ui.text.style.LineHeightStyle, int, int, androidx.compose.ui.text.style.TextMotion):androidx.compose.ui.text.ParagraphStyle");
    }

    @Stable
    @l
    public static final ParagraphStyle lerp(@l ParagraphStyle paragraphStyle, @l ParagraphStyle paragraphStyle2, float f5) {
        int m5935unboximpl = ((TextAlign) SpanStyleKt.lerpDiscrete(TextAlign.m5929boximpl(paragraphStyle.m5460getTextAligne0LSkKk()), TextAlign.m5929boximpl(paragraphStyle2.m5460getTextAligne0LSkKk()), f5)).m5935unboximpl();
        int m5949unboximpl = ((TextDirection) SpanStyleKt.lerpDiscrete(TextDirection.m5943boximpl(paragraphStyle.m5462getTextDirections_7Xco()), TextDirection.m5943boximpl(paragraphStyle2.m5462getTextDirections_7Xco()), f5)).m5949unboximpl();
        long m5510lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m5510lerpTextUnitInheritableC3pnCVY(paragraphStyle.m5458getLineHeightXSAIIZE(), paragraphStyle2.m5458getLineHeightXSAIIZE(), f5);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.Companion.getNone();
        }
        return new ParagraphStyle(m5935unboximpl, m5949unboximpl, m5510lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f5), lerpPlatformStyle(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f5), (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f5), ((LineBreak) SpanStyleKt.lerpDiscrete(LineBreak.m5849boximpl(paragraphStyle.m5457getLineBreakrAG3T2k()), LineBreak.m5849boximpl(paragraphStyle2.m5457getLineBreakrAG3T2k()), f5)).m5861unboximpl(), ((Hyphens) SpanStyleKt.lerpDiscrete(Hyphens.m5839boximpl(paragraphStyle.m5455getHyphensvmbZdU8()), Hyphens.m5839boximpl(paragraphStyle2.m5455getHyphensvmbZdU8()), f5)).m5845unboximpl(), (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f5), (w) null);
    }

    private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f5) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.Companion.getDefault();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.Companion.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformParagraphStyle, platformParagraphStyle2, f5);
    }

    private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        if (platformParagraphStyle == null) {
            return paragraphStyle.getPlatformStyle();
        }
        return paragraphStyle.getPlatformStyle().merge(platformParagraphStyle);
    }

    @l
    public static final ParagraphStyle resolveParagraphStyleDefaults(@l ParagraphStyle paragraphStyle, @l LayoutDirection layoutDirection) {
        int m5460getTextAligne0LSkKk;
        long m5458getLineHeightXSAIIZE;
        int m5457getLineBreakrAG3T2k;
        int m5455getHyphensvmbZdU8;
        int m5460getTextAligne0LSkKk2 = paragraphStyle.m5460getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5932equalsimpl0(m5460getTextAligne0LSkKk2, companion.m5942getUnspecifiede0LSkKk())) {
            m5460getTextAligne0LSkKk = companion.m5941getStarte0LSkKk();
        } else {
            m5460getTextAligne0LSkKk = paragraphStyle.m5460getTextAligne0LSkKk();
        }
        int i5 = m5460getTextAligne0LSkKk;
        int m5591resolveTextDirectionIhaHGbI = TextStyleKt.m5591resolveTextDirectionIhaHGbI(layoutDirection, paragraphStyle.m5462getTextDirections_7Xco());
        if (TextUnitKt.m6253isUnspecifiedR2X_6o(paragraphStyle.m5458getLineHeightXSAIIZE())) {
            m5458getLineHeightXSAIIZE = DefaultLineHeight;
        } else {
            m5458getLineHeightXSAIIZE = paragraphStyle.m5458getLineHeightXSAIIZE();
        }
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int m5457getLineBreakrAG3T2k2 = paragraphStyle.m5457getLineBreakrAG3T2k();
        LineBreak.Companion companion2 = LineBreak.Companion;
        if (LineBreak.m5855equalsimpl0(m5457getLineBreakrAG3T2k2, companion2.m5869getUnspecifiedrAG3T2k())) {
            m5457getLineBreakrAG3T2k = companion2.m5868getSimplerAG3T2k();
        } else {
            m5457getLineBreakrAG3T2k = paragraphStyle.m5457getLineBreakrAG3T2k();
        }
        int i6 = m5457getLineBreakrAG3T2k;
        int m5455getHyphensvmbZdU82 = paragraphStyle.m5455getHyphensvmbZdU8();
        Hyphens.Companion companion3 = Hyphens.Companion;
        if (Hyphens.m5842equalsimpl0(m5455getHyphensvmbZdU82, companion3.m5848getUnspecifiedvmbZdU8())) {
            m5455getHyphensvmbZdU8 = companion3.m5847getNonevmbZdU8();
        } else {
            m5455getHyphensvmbZdU8 = paragraphStyle.m5455getHyphensvmbZdU8();
        }
        int i7 = m5455getHyphensvmbZdU8;
        TextMotion textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = TextMotion.Companion.getStatic();
        }
        return new ParagraphStyle(i5, m5591resolveTextDirectionIhaHGbI, m5458getLineHeightXSAIIZE, textIndent2, platformStyle, lineHeightStyle, i6, i7, textMotion, (w) null);
    }
}

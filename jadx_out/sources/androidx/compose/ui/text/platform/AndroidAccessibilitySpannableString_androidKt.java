package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a4\u0010\u000f\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroid/text/SpannableString;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "Lkotlin/r2;", "setSpanStyle", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,182:1\n33#2,6:183\n33#2,6:189\n33#2,6:195\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n59#1:183,6\n66#1:189,6\n75#1:195,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i5, int i6, Density density, FontFamily.Resolver resolver) {
        int m5661getNormal_LCdwA;
        int m5671getAllGVVA2EU;
        SpannableExtensions_androidKt.m5811setColorRPmYEkk(spannableString, spanStyle.m5504getColor0d7_KjU(), i5, i6);
        SpannableExtensions_androidKt.m5812setFontSizeKmRG4DE(spannableString, spanStyle.m5505getFontSizeXSAIIZE(), density, i5, i6);
        if (spanStyle.getFontWeight() != null || spanStyle.m5506getFontStyle4Lr2A7w() != null) {
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
            spannableString.setSpan(new StyleSpan(AndroidFontUtils_androidKt.m5608getAndroidTypefaceStyleFO1MlWM(fontWeight, m5661getNormal_LCdwA)), i5, i6, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                spannableString.setSpan(new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName()), i5, i6, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m5507getFontSynthesisZQGJjVo = spanStyle.m5507getFontSynthesisZQGJjVo();
                if (m5507getFontSynthesisZQGJjVo != null) {
                    m5671getAllGVVA2EU = m5507getFontSynthesisZQGJjVo.m5670unboximpl();
                } else {
                    m5671getAllGVVA2EU = FontSynthesis.Companion.m5671getAllGVVA2EU();
                }
                Object value = FontFamily.Resolver.m5628resolveDPcqOEQ$default(resolver, fontFamily, null, 0, m5671getAllGVVA2EU, 6, null).getValue();
                l0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(Api28Impl.INSTANCE.createTypefaceSpan((Typeface) value), i5, i6, 33);
            }
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i5, i6, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i5, i6, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i5, i6, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i5, i6);
        SpannableExtensions_androidKt.m5809setBackgroundRPmYEkk(spannableString, spanStyle.m5502getBackground0d7_KjU(), i5, i6);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(@l AnnotatedString annotatedString, @l Density density, @l FontFamily.Resolver resolver, @l URLSpanCache uRLSpanCache) {
        SpanStyle m5499copyGSF8kmg;
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i5 = 0; i5 < size; i5++) {
                AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i5);
                SpanStyle component1 = range.component1();
                int component2 = range.component2();
                int component3 = range.component3();
                m5499copyGSF8kmg = component1.m5499copyGSF8kmg((r38 & 1) != 0 ? component1.m5504getColor0d7_KjU() : 0L, (r38 & 2) != 0 ? component1.fontSize : 0L, (r38 & 4) != 0 ? component1.fontWeight : null, (r38 & 8) != 0 ? component1.fontStyle : null, (r38 & 16) != 0 ? component1.fontSynthesis : null, (r38 & 32) != 0 ? component1.fontFamily : null, (r38 & 64) != 0 ? component1.fontFeatureSettings : null, (r38 & 128) != 0 ? component1.letterSpacing : 0L, (r38 & 256) != 0 ? component1.baselineShift : null, (r38 & 512) != 0 ? component1.textGeometricTransform : null, (r38 & 1024) != 0 ? component1.localeList : null, (r38 & 2048) != 0 ? component1.background : 0L, (r38 & 4096) != 0 ? component1.textDecoration : null, (r38 & 8192) != 0 ? component1.shadow : null, (r38 & 16384) != 0 ? component1.platformStyle : null, (r38 & 32768) != 0 ? component1.drawStyle : null);
                setSpanStyle(spannableString, m5499copyGSF8kmg, component2, component3, density, resolver);
            }
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i6 = 0; i6 < size2; i6++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i6);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        List<AnnotatedString.Range<UrlAnnotation>> urlAnnotations = annotatedString.getUrlAnnotations(0, annotatedString.length());
        int size3 = urlAnnotations.size();
        for (int i7 = 0; i7 < size3; i7++) {
            AnnotatedString.Range<UrlAnnotation> range3 = urlAnnotations.get(i7);
            spannableString.setSpan(uRLSpanCache.toURLSpan(range3.component1()), range3.component2(), range3.component3(), 33);
        }
        return spannableString;
    }
}

package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import kotlin.r2;
import kotlin.text.h0;
import p4.l;
import p4.m;
import v3.q;
import v3.r;

@i0(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010\u000e\u001a\u00020\u0006*\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a.\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0002\u001aX\u0010*\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\r\u001a\u00020\f2&\u0010)\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0#H\u0000\u001a\"\u0010,\u001a\u00020\u0006*\u00020\u00002\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\r\u001a\u00020\fH\u0002\u001aP\u0010-\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2&\u0010)\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0#H\u0002\u001aF\u00101\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010!2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u001e\u00100\u001a\u001a\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060/H\u0000\u001a$\u00106\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a&\u00109\u001a\u00020\u0006*\u00020\u00002\b\u00108\u001a\u0004\u0018\u0001072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010<\u001a\u00020\u0006*\u00020\u00002\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a.\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a&\u0010D\u001a\u00020\u0006*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a&\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a&\u0010J\u001a\u00020\u0006*\u00020\u00002\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a6\u0010N\u001a\u00020\u0006*\u00020\u00002\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a&\u0010Q\u001a\u00020\u0006*\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a.\u0010S\u001a\u00020\u0006*\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010@\u001a0\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a.\u0010\\\u001a\u00020\u0006*\u00020\u00002\b\u0010Z\u001a\u0004\u0018\u00010Y2\u0006\u0010[\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\f\u0010]\u001a\u00020\u001b*\u00020\u001dH\u0002\u001a\u0016\u0010_\u001a\u00020!*\u0004\u0018\u00010!2\u0006\u0010^\u001a\u00020!H\u0002\"\u0018\u0010b\u001a\u00020\u001b*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006c"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lkotlin/r2;", "setSpan", "Landroidx/compose/ui/text/style/TextIndent;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/Density;", "density", "setTextIndent", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineHeightStyle", "setLineHeight-KmRG4DE", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/LineHeightStyle;)V", "setLineHeight", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "resolveLineHeightInPx-o2QH7mI", "(JFLandroidx/compose/ui/unit/Density;)F", "resolveLineHeightInPx", "", "isNonLinearFontScalingActive", "Landroidx/compose/ui/text/TextStyle;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "resolveTypeface", "setSpanStyles", "spanStyleRange", "setSpanStyle", "setFontAttributes", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "flattenFontStylesAndApply", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "createLetterSpacingSpan", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBackground", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "setLocaleList", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "setGeometricTransform", "", "fontFeatureSettings", "setFontFeatureSettings", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setFontSize", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "setTextDecoration", "setColor-RPmYEkk", "setColor", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "setBaselineShift-0ocSgnM", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/BaselineShift;II)V", "setBaselineShift", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "setBrush", "hasFontAttributes", "spanStyle", "merge", "getNeedsLetterSpacingSpan", "(Landroidx/compose/ui/text/SpanStyle;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,566:1\n1#2:567\n235#3,3:568\n33#3,4:571\n238#3,2:575\n38#3:577\n240#3:578\n69#3,6:579\n33#3,6:585\n646#4:591\n646#4:592\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n296#1:568,3\n296#1:571,4\n296#1:575,2\n296#1:577\n296#1:578\n364#1:579,6\n384#1:585,6\n448#1:591\n521#1:592\n*E\n"})
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m5807createLetterSpacingSpaneAf_CNQ(long j5, Density density) {
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(j5);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo303toPxR2X_6o(j5));
        }
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m6235getValueimpl(j5));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@m SpanStyle spanStyle, @l List<AnnotatedString.Range<SpanStyle>> list, @l q<? super SpanStyle, ? super Integer, ? super Integer, r2> qVar) {
        Object Rb;
        if (list.size() <= 1) {
            if (!list.isEmpty()) {
                qVar.invoke(merge(spanStyle, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = list.size();
        int i5 = size * 2;
        Integer[] numArr = new Integer[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            numArr[i6] = 0;
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i7);
            numArr[i7] = Integer.valueOf(range.getStart());
            numArr[i7 + size] = Integer.valueOf(range.getEnd());
        }
        o.U3(numArr);
        Rb = p.Rb(numArr);
        int intValue = ((Number) Rb).intValue();
        for (int i8 = 0; i8 < i5; i8++) {
            int intValue2 = numArr[i8].intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                SpanStyle spanStyle2 = spanStyle;
                for (int i9 = 0; i9 < size3; i9++) {
                    AnnotatedString.Range<SpanStyle> range2 = list.get(i9);
                    if (range2.getStart() != range2.getEnd() && AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                }
                if (spanStyle2 != null) {
                    qVar.invoke(spanStyle2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(SpanStyle spanStyle) {
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(spanStyle.m5508getLetterSpacingXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        return TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA()) || TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(spanStyle.m5508getLetterSpacingXSAIIZE()), companion.m6267getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m5578getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(Density density) {
        return ((double) density.getFontScale()) > 1.05d;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m5808resolveLineHeightInPxo2QH7mI(long j5, float f5, Density density) {
        float m6235getValueimpl;
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(j5);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(density)) {
                return density.mo303toPxR2X_6o(j5);
            }
            m6235getValueimpl = TextUnit.m6235getValueimpl(j5) / TextUnit.m6235getValueimpl(density.mo307toSpkPz2Gy4(f5));
        } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
            m6235getValueimpl = TextUnit.m6235getValueimpl(j5);
        } else {
            return Float.NaN;
        }
        return m6235getValueimpl * f5;
    }

    /* renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m5809setBackgroundRPmYEkk(@l Spannable spannable, long j5, int i5, int i6) {
        boolean z4;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setSpan(spannable, new BackgroundColorSpan(ColorKt.m3788toArgb8_81llA(j5)), i5, i6);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m5810setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i5, int i6) {
        if (baselineShift != null) {
            setSpan(spannable, new BaselineShiftSpan(baselineShift.m5826unboximpl()), i5, i6);
        }
    }

    private static final void setBrush(Spannable spannable, Brush brush, float f5, int i5, int i6) {
        if (brush != null) {
            if (brush instanceof SolidColor) {
                m5811setColorRPmYEkk(spannable, ((SolidColor) brush).m4067getValue0d7_KjU(), i5, i6);
            } else if (brush instanceof ShaderBrush) {
                setSpan(spannable, new ShaderBrushSpan((ShaderBrush) brush, f5), i5, i6);
            }
        }
    }

    /* renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m5811setColorRPmYEkk(@l Spannable spannable, long j5, int i5, int i6) {
        boolean z4;
        if (j5 != Color.Companion.m3770getUnspecified0d7_KjU()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setSpan(spannable, new ForegroundColorSpan(ColorKt.m3788toArgb8_81llA(j5)), i5, i6);
        }
    }

    private static final void setDrawStyle(Spannable spannable, DrawStyle drawStyle, int i5, int i6) {
        if (drawStyle != null) {
            setSpan(spannable, new DrawStyleSpan(drawStyle), i5, i6);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        SpanStyle spanStyle;
        boolean z4;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i5);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (!TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) && range2.getItem().m5507getFontSynthesisZQGJjVo() == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                arrayList.add(range);
            }
        }
        if (hasFontAttributes(textStyle)) {
            spanStyle = new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m5577getFontStyle4Lr2A7w(), textStyle.m5578getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65475, (w) null);
        } else {
            spanStyle = null;
        }
        flattenFontStylesAndApply(spanStyle, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, rVar));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i5, int i6) {
        if (str != null) {
            setSpan(spannable, new FontFeatureSpan(str), i5, i6);
        }
    }

    /* renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m5812setFontSizeKmRG4DE(@l Spannable spannable, long j5, @l Density density, int i5, int i6) {
        int L0;
        long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(j5);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
            L0 = d.L0(density.mo303toPxR2X_6o(j5));
            setSpan(spannable, new AbsoluteSizeSpan(L0, false), i5, i6);
        } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(TextUnit.m6235getValueimpl(j5)), i5, i6);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i5, int i6) {
        if (textGeometricTransform != null) {
            setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i5, i6);
            setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i5, i6);
        }
    }

    /* renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m5813setLineHeightKmRG4DE(@l Spannable spannable, long j5, float f5, @l Density density, @l LineHeightStyle lineHeightStyle) {
        boolean z4;
        int length;
        char r7;
        float m5808resolveLineHeightInPxo2QH7mI = m5808resolveLineHeightInPxo2QH7mI(j5, f5, density);
        if (!Float.isNaN(m5808resolveLineHeightInPxo2QH7mI)) {
            if (spannable.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                r7 = h0.r7(spannable);
                if (r7 != '\n') {
                    length = spannable.length();
                    setSpan(spannable, new LineHeightStyleSpan(m5808resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m5921isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m5904getTrimEVpEnUU()), LineHeightStyle.Trim.m5922isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m5904getTrimEVpEnUU()), lineHeightStyle.m5903getAlignmentPIaL0Z0()), 0, spannable.length());
                }
            }
            length = spannable.length() + 1;
            setSpan(spannable, new LineHeightStyleSpan(m5808resolveLineHeightInPxo2QH7mI, 0, length, LineHeightStyle.Trim.m5921isTrimFirstLineTopimpl$ui_text_release(lineHeightStyle.m5904getTrimEVpEnUU()), LineHeightStyle.Trim.m5922isTrimLastLineBottomimpl$ui_text_release(lineHeightStyle.m5904getTrimEVpEnUU()), lineHeightStyle.m5903getAlignmentPIaL0Z0()), 0, spannable.length());
        }
    }

    /* renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m5814setLineHeightr9BaKPg(@l Spannable spannable, long j5, float f5, @l Density density) {
        float m5808resolveLineHeightInPxo2QH7mI = m5808resolveLineHeightInPxo2QH7mI(j5, f5, density);
        if (!Float.isNaN(m5808resolveLineHeightInPxo2QH7mI)) {
            setSpan(spannable, new LineHeightSpan(m5808resolveLineHeightInPxo2QH7mI), 0, spannable.length());
        }
    }

    public static final void setLocaleList(@l Spannable spannable, @m LocaleList localeList, int i5, int i6) {
        if (localeList != null) {
            setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i5, i6);
        }
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i5, int i6) {
        if (shadow != null) {
            setSpan(spannable, new ShadowSpan(ColorKt.m3788toArgb8_81llA(shadow.m4057getColor0d7_KjU()), Offset.m3493getXimpl(shadow.m4058getOffsetF1C5BW0()), Offset.m3494getYimpl(shadow.m4058getOffsetF1C5BW0()), TextPaintExtensions_androidKt.correctBlurRadius(shadow.getBlurRadius())), i5, i6);
        }
    }

    public static final void setSpan(@l Spannable spannable, @l Object obj, int i5, int i6) {
        spannable.setSpan(obj, i5, i6, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m5810setBaselineShift0ocSgnM(spannable, item.m5503getBaselineShift5SSeXJ0(), start, end);
        m5811setColorRPmYEkk(spannable, item.m5504getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m5812setFontSizeKmRG4DE(spannable, item.m5505getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m5809setBackgroundRPmYEkk(spannable, item.m5502getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(@l Spannable spannable, @l TextStyle textStyle, @l List<AnnotatedString.Range<SpanStyle>> list, @l Density density, @l r<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> rVar) {
        MetricAffectingSpan m5807createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, textStyle, list, rVar);
        int size = list.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            AnnotatedString.Range<SpanStyle> range = list.get(i5);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density);
                if (getNeedsLetterSpacingSpan(range.getItem())) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                AnnotatedString.Range<SpanStyle> range2 = list.get(i6);
                int start2 = range2.getStart();
                int end2 = range2.getEnd();
                SpanStyle item = range2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (m5807createLetterSpacingSpaneAf_CNQ = m5807createLetterSpacingSpaneAf_CNQ(item.m5508getLetterSpacingXSAIIZE(), density)) != null) {
                    setSpan(spannable, m5807createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(@l Spannable spannable, @m TextDecoration textDecoration, int i5, int i6) {
        if (textDecoration != null) {
            TextDecoration.Companion companion = TextDecoration.Companion;
            setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i5, i6);
        }
    }

    public static final void setTextIndent(@l Spannable spannable, @m TextIndent textIndent, float f5, @l Density density) {
        float f6;
        if (textIndent != null) {
            if ((!TextUnit.m6232equalsimpl0(textIndent.m5960getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) || !TextUnit.m6232equalsimpl0(textIndent.m5961getRestLineXSAIIZE(), TextUnitKt.getSp(0))) && !TextUnitKt.m6253isUnspecifiedR2X_6o(textIndent.m5960getFirstLineXSAIIZE()) && !TextUnitKt.m6253isUnspecifiedR2X_6o(textIndent.m5961getRestLineXSAIIZE())) {
                long m6234getTypeUIouoOA = TextUnit.m6234getTypeUIouoOA(textIndent.m5960getFirstLineXSAIIZE());
                TextUnitType.Companion companion = TextUnitType.Companion;
                float f7 = 0.0f;
                if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6268getSpUIouoOA())) {
                    f6 = density.mo303toPxR2X_6o(textIndent.m5960getFirstLineXSAIIZE());
                } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA, companion.m6267getEmUIouoOA())) {
                    f6 = TextUnit.m6235getValueimpl(textIndent.m5960getFirstLineXSAIIZE()) * f5;
                } else {
                    f6 = 0.0f;
                }
                long m6234getTypeUIouoOA2 = TextUnit.m6234getTypeUIouoOA(textIndent.m5961getRestLineXSAIIZE());
                if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA2, companion.m6268getSpUIouoOA())) {
                    f7 = density.mo303toPxR2X_6o(textIndent.m5961getRestLineXSAIIZE());
                } else if (TextUnitType.m6263equalsimpl0(m6234getTypeUIouoOA2, companion.m6267getEmUIouoOA())) {
                    f7 = TextUnit.m6235getValueimpl(textIndent.m5961getRestLineXSAIIZE()) * f5;
                }
                setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(f6), (int) Math.ceil(f7)), 0, spannable.length());
            }
        }
    }
}

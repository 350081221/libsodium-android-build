package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0000\u001a1\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u0003*\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0003*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006!"}, d2 = {"SharedTextAndroidCanvas", "Landroidx/compose/ui/text/android/TextAndroidCanvas;", "ZeroVerticalPadding", "Landroidx/compose/ui/text/android/VerticalPaddings;", "J", "VerticalPaddings", "topPadding", "", "bottomPadding", "(II)J", "getTextDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "textDirectionHeuristic", "getLastLineMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "Landroidx/compose/ui/text/android/TextLayout;", "textPaint", "Landroid/text/TextPaint;", "frameworkTextDir", "lineHeightSpans", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)Landroid/graphics/Paint$FontMetricsInt;", "getLineHeightPaddings", "(Landroidx/compose/ui/text/android/TextLayout;[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;)J", "getLineHeightSpans", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "getVerticalPaddings", "(Landroidx/compose/ui/text/android/TextLayout;)J", "isLineEllipsized", "", "Landroid/text/Layout;", "lineIndex", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 InlineClassUtils.kt\nandroidx/compose/ui/text/android/InlineClassUtilsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1031:1\n25#2:1032\n26#3:1033\n26#3:1034\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n884#1:1032\n1022#1:1033\n1026#1:1034\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutKt {

    @p4.l
    private static final TextAndroidCanvas SharedTextAndroidCanvas = new TextAndroidCanvas();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i5, int i6) {
        return VerticalPaddings.m5593constructorimpl((i6 & 4294967295L) | (i5 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        boolean z4;
        Object Rb;
        boolean trimLastLineBottom;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount)) {
            if (lineHeightStyleSpanArr.length == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (true ^ z4) {
                SpannableString spannableString = new SpannableString("\u200b");
                Rb = kotlin.collections.p.Rb(lineHeightStyleSpanArr);
                LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) Rb;
                int length = spannableString.length();
                if (lineCount != 0 && lineHeightStyleSpan.getTrimLastLineBottom()) {
                    trimLastLineBottom = false;
                } else {
                    trimLastLineBottom = lineHeightStyleSpan.getTrimLastLineBottom();
                }
                spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, length, trimLastLineBottom), 0, spannableString.length(), 33);
                StaticLayout create$default = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout.getIncludePadding(), textLayout.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 2072512, null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = create$default.getLineAscent(0);
                fontMetricsInt.descent = create$default.getLineDescent(0);
                fontMetricsInt.top = create$default.getLineTop(0);
                fontMetricsInt.bottom = create$default.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(TextLayout textLayout, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i5 = 0;
        int i6 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i5 = Math.max(i5, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i6 = Math.max(i5, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i5 == 0 && i6 == 0) {
            return ZeroVerticalPadding;
        }
        return VerticalPaddings(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        boolean z4;
        if (!(textLayout.getText() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        CharSequence text = textLayout.getText();
        l0.n(text, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
        if (lineHeightStyleSpanArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return new LineHeightStyleSpan[0];
        }
        return lineHeightStyleSpanArr;
    }

    @p4.l
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (!textLayout.getIncludePadding() && !textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            TextPaint paint = textLayout.getLayout().getPaint();
            CharSequence text = textLayout.getLayout().getText();
            Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
            int lineAscent = textLayout.getLayout().getLineAscent(0);
            int i5 = charSequenceBounds.top;
            if (i5 < lineAscent) {
                topPadding = lineAscent - i5;
            } else {
                topPadding = textLayout.getLayout().getTopPadding();
            }
            if (textLayout.getLineCount() != 1) {
                int lineCount = textLayout.getLineCount() - 1;
                charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
            }
            int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
            int i6 = charSequenceBounds.bottom;
            if (i6 > lineDescent) {
                bottomPadding = i6 - lineDescent;
            } else {
                bottomPadding = textLayout.getLayout().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return ZeroVerticalPadding;
            }
            return VerticalPaddings(topPadding, bottomPadding);
        }
        return ZeroVerticalPadding;
    }

    public static final boolean isLineEllipsized(@p4.l Layout layout, int i5) {
        return layout.getEllipsisCount(i5) > 0;
    }
}

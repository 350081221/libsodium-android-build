package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.i0;

@i0(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        boolean z4;
        Spannable spannableString;
        if (charSequence.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i5) {
        int lineCount = textLayout.getLineCount();
        for (int i6 = 0; i6 < lineCount; i6++) {
            if (textLayout.getLineBottom(i6) > i5) {
                return i6;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z4) {
        if (!z4 || TextUnit.m6232equalsimpl0(textStyle.m5581getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m6232equalsimpl0(textStyle.m5581getLetterSpacingXSAIIZE(), TextUnit.Companion.m6246getUnspecifiedXSAIIZE())) {
            return false;
        }
        int m5586getTextAligne0LSkKk = textStyle.m5586getTextAligne0LSkKk();
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5932equalsimpl0(m5586getTextAligne0LSkKk, companion.m5942getUnspecifiede0LSkKk()) || TextAlign.m5932equalsimpl0(textStyle.m5586getTextAligne0LSkKk(), companion.m5941getStarte0LSkKk()) || TextAlign.m5932equalsimpl0(textStyle.m5586getTextAligne0LSkKk(), companion.m5938getJustifye0LSkKk())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m5403toLayoutAlignaXe7zB0(int i5) {
        TextAlign.Companion companion = TextAlign.Companion;
        if (TextAlign.m5932equalsimpl0(i5, companion.m5939getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m5932equalsimpl0(i5, companion.m5940getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m5932equalsimpl0(i5, companion.m5936getCentere0LSkKk())) {
            return 2;
        }
        if (TextAlign.m5932equalsimpl0(i5, companion.m5941getStarte0LSkKk()) || !TextAlign.m5932equalsimpl0(i5, companion.m5937getEnde0LSkKk())) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m5404toLayoutBreakStrategyxImikfE(int i5) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        if (LineBreak.Strategy.m5873equalsimpl0(i5, companion.m5879getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m5873equalsimpl0(i5, companion.m5878getHighQualityfcGXIks())) {
            return 1;
        }
        if (!LineBreak.Strategy.m5873equalsimpl0(i5, companion.m5877getBalancedfcGXIks())) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m5405toLayoutHyphenationFrequency3fSNIE(int i5) {
        Hyphens.Companion companion = Hyphens.Companion;
        if (Hyphens.m5842equalsimpl0(i5, companion.m5846getAutovmbZdU8())) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        Hyphens.m5842equalsimpl0(i5, companion.m5847getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m5406toLayoutLineBreakStylehpcqdu8(int i5) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        if (LineBreak.Strictness.m5884equalsimpl0(i5, companion.m5888getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m5884equalsimpl0(i5, companion.m5889getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m5884equalsimpl0(i5, companion.m5890getNormalusljTpc())) {
            return 2;
        }
        if (!LineBreak.Strictness.m5884equalsimpl0(i5, companion.m5891getStrictusljTpc())) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m5407toLayoutLineBreakWordStylewPN0Rpw(int i5) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        if (LineBreak.WordBreak.m5896equalsimpl0(i5, companion.m5900getDefaultjp8hJ3c()) || !LineBreak.WordBreak.m5896equalsimpl0(i5, companion.m5901getPhrasejp8hJ3c())) {
            return 0;
        }
        return 1;
    }
}

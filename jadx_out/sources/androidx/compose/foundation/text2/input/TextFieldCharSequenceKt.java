package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.text.TextRange;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a.\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0013\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u0015\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000eH\u0000\u001a\f\u0010\u0017\u001a\u00020\b*\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "TextFieldCharSequence-FDrldGo", "(Ljava/lang/String;J)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "TextFieldCharSequence", "", "composition", "TextFieldCharSequence-3r_uNRQ", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "", "destination", "", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "Lkotlin/r2;", "toCharArray", "maxChars", "getTextBeforeSelection", "getTextAfterSelection", "getSelectedText", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    @l
    /* renamed from: TextFieldCharSequence-3r_uNRQ, reason: not valid java name */
    public static final TextFieldCharSequence m1077TextFieldCharSequence3r_uNRQ(@l CharSequence charSequence, long j5, @m TextRange textRange) {
        return new TextFieldCharSequenceWrapper(charSequence, j5, textRange, null);
    }

    /* renamed from: TextFieldCharSequence-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1078TextFieldCharSequence3r_uNRQ$default(CharSequence charSequence, long j5, TextRange textRange, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            textRange = null;
        }
        return m1077TextFieldCharSequence3r_uNRQ(charSequence, j5, textRange);
    }

    @l
    @ExperimentalFoundationApi
    /* renamed from: TextFieldCharSequence-FDrldGo, reason: not valid java name */
    public static final TextFieldCharSequence m1079TextFieldCharSequenceFDrldGo(@l String str, long j5) {
        return new TextFieldCharSequenceWrapper(str, j5, null, null);
    }

    /* renamed from: TextFieldCharSequence-FDrldGo$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1080TextFieldCharSequenceFDrldGo$default(String str, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "";
        }
        if ((i5 & 2) != 0) {
            j5 = TextRange.Companion.m5550getZerod9O1mEE();
        }
        return m1079TextFieldCharSequenceFDrldGo(str, j5);
    }

    @l
    public static final CharSequence getSelectedText(@l TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m5543getMinimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()), TextRange.m5542getMaximpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()));
    }

    @l
    public static final CharSequence getTextAfterSelection(@l TextFieldCharSequence textFieldCharSequence, int i5) {
        return textFieldCharSequence.subSequence(TextRange.m5542getMaximpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()), Math.min(TextRange.m5542getMaximpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()) + i5, textFieldCharSequence.length()));
    }

    @l
    public static final CharSequence getTextBeforeSelection(@l TextFieldCharSequence textFieldCharSequence, int i5) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m5543getMinimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()) - i5), TextRange.m5543getMinimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()));
    }

    public static final void toCharArray(@l TextFieldCharSequence textFieldCharSequence, @l char[] cArr, int i5, int i6, int i7) {
        l0.n(textFieldCharSequence, "null cannot be cast to non-null type androidx.compose.foundation.text2.input.TextFieldCharSequenceWrapper");
        ((TextFieldCharSequenceWrapper) textFieldCharSequence).toCharArray(cArr, i5, i6, i7);
    }
}

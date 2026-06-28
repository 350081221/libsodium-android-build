package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\f\u0010\n\u001a\u00020\u0005*\u00020\u0000H\u0007\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0000H\u0007\u001aE\u0010\u0014\u001a\u00020\u0005*\u00020\f26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0087\b\u001aE\u0010\u0015\u001a\u00020\u0005*\u00020\f26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050\rH\u0087\b\u001a{\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162`\u0010\u001e\u001a\\\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00050\u0019H\u0080\b¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "", "index", "", "text", "Lkotlin/r2;", "insert", "start", "end", "delete", "placeCursorAtEnd", "selectAll", "Landroidx/compose/foundation/text2/input/TextFieldBuffer$ChangeList;", "Lkotlin/Function2;", "Landroidx/compose/ui/text/TextRange;", "Lkotlin/v0;", "name", "range", "originalRange", "block", "forEachChange", "forEachChangeReversed", "", bi.ay, "b", "Lkotlin/Function4;", "aPrefixStart", "aSuffixStart", "bPrefixStart", "bSuffixStart", "onFound", "findCommonPrefixAndSuffix", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldBufferKt {
    @ExperimentalFoundationApi
    public static final void delete(@l TextFieldBuffer textFieldBuffer, int i5, int i6) {
        textFieldBuffer.replace(i5, i6, "");
    }

    public static final void findCommonPrefixAndSuffix(@l CharSequence charSequence, @l CharSequence charSequence2, @l r<? super Integer, ? super Integer, ? super Integer, ? super Integer, r2> rVar) {
        boolean z4;
        int i5;
        boolean z5;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i6 = 0;
        if (charSequence.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (charSequence2.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i7 = 0;
                i5 = 0;
                boolean z6 = false;
                while (true) {
                    if (i6 == 0) {
                        if (charSequence.charAt(i7) == charSequence2.charAt(i5)) {
                            i7++;
                            i5++;
                        } else {
                            i6 = 1;
                        }
                    }
                    if (!z6) {
                        if (charSequence.charAt(length - 1) == charSequence2.charAt(length2 - 1)) {
                            length--;
                            length2--;
                        } else {
                            z6 = true;
                        }
                    }
                    if (i7 >= length || i5 >= length2 || (i6 != 0 && z6)) {
                        break;
                    }
                }
                i6 = i7;
                if (i6 < length && i5 >= length2) {
                    return;
                }
                rVar.invoke(Integer.valueOf(i6), Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(length2));
            }
        }
        i5 = 0;
        if (i6 < length) {
        }
        rVar.invoke(Integer.valueOf(i6), Integer.valueOf(length), Integer.valueOf(i5), Integer.valueOf(length2));
    }

    @ExperimentalFoundationApi
    public static final void forEachChange(@l TextFieldBuffer.ChangeList changeList, @l p<? super TextRange, ? super TextRange, r2> pVar) {
        for (int i5 = 0; i5 < changeList.getChangeCount(); i5++) {
            pVar.invoke(TextRange.m5533boximpl(changeList.mo1065getRangejx7JFs(i5)), TextRange.m5533boximpl(changeList.mo1064getOriginalRangejx7JFs(i5)));
        }
    }

    @ExperimentalFoundationApi
    public static final void forEachChangeReversed(@l TextFieldBuffer.ChangeList changeList, @l p<? super TextRange, ? super TextRange, r2> pVar) {
        for (int changeCount = changeList.getChangeCount() - 1; changeCount >= 0; changeCount--) {
            pVar.invoke(TextRange.m5533boximpl(changeList.mo1065getRangejx7JFs(changeCount)), TextRange.m5533boximpl(changeList.mo1064getOriginalRangejx7JFs(changeCount)));
        }
    }

    @ExperimentalFoundationApi
    public static final void insert(@l TextFieldBuffer textFieldBuffer, int i5, @l String str) {
        textFieldBuffer.replace(i5, i5, str);
    }

    @ExperimentalFoundationApi
    public static final void placeCursorAtEnd(@l TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.placeCursorBeforeCharAt(textFieldBuffer.getLength());
    }

    @ExperimentalFoundationApi
    public static final void selectAll(@l TextFieldBuffer textFieldBuffer) {
        textFieldBuffer.m1072selectCharsIn5zctL8(TextRangeKt.TextRange(0, textFieldBuffer.getLength()));
    }
}

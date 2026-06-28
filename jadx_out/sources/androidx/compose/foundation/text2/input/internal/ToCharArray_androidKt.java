package androidx.compose.foundation.text2.input.internal;

import android.text.TextUtils;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "Lkotlin/r2;", "toCharArray", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ToCharArray_androidKt {
    public static final void toCharArray(@l CharSequence charSequence, @l char[] cArr, int i5, int i6, int i7) {
        if (charSequence instanceof TextFieldCharSequence) {
            TextFieldCharSequenceKt.toCharArray((TextFieldCharSequence) charSequence, cArr, i5, i6, i7);
        } else {
            TextUtils.getChars(charSequence, i6, i7, cArr, i5);
        }
    }
}

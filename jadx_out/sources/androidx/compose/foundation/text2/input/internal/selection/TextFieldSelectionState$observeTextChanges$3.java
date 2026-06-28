package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import p4.l;
import v3.p;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends h0 implements p<TextFieldCharSequence, CharSequence, Boolean> {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    TextFieldSelectionState$observeTextChanges$3() {
        super(2, TextFieldCharSequence.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // v3.p
    @l
    public final Boolean invoke(@l TextFieldCharSequence textFieldCharSequence, @l CharSequence charSequence) {
        return Boolean.valueOf(textFieldCharSequence.contentEquals(charSequence));
    }
}

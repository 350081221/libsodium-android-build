package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$observeTextChanges$2 extends n0 implements a<TextFieldCharSequence> {
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$observeTextChanges$2(TextFieldSelectionState textFieldSelectionState) {
        super(0);
        this.this$0 = textFieldSelectionState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final TextFieldCharSequence invoke() {
        TransformedTextFieldState transformedTextFieldState;
        transformedTextFieldState = this.this$0.textFieldState;
        return transformedTextFieldState.getText();
    }
}

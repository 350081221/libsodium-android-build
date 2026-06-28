package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Lkotlin/r2;", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldState$onImeActionPerformed$1 extends n0 implements l<ImeAction, r2> {
    final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldState$onImeActionPerformed$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ImeAction imeAction) {
        m925invokeKlQnJC8(imeAction.m5712unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-KlQnJC8, reason: not valid java name */
    public final void m925invokeKlQnJC8(int i5) {
        KeyboardActionRunner keyboardActionRunner;
        keyboardActionRunner = this.this$0.keyboardActionRunner;
        keyboardActionRunner.m853runActionKlQnJC8(i5);
    }
}

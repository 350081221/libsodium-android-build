package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$onKeyEvent$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onKeyEvent$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        l lVar;
        lVar = this.this$0.onImeActionPerformed;
        lVar.invoke(ImeAction.m5706boximpl(this.this$0.getKeyboardOptions().m859getImeActioneUduSuo()));
    }
}

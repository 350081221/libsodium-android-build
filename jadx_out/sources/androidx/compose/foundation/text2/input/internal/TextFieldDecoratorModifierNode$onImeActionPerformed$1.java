package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Lkotlin/r2;", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$onImeActionPerformed$1 extends n0 implements l<ImeAction, r2> {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$onImeActionPerformed$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ImeAction imeAction) {
        m1119invokeKlQnJC8(imeAction.m5712unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-KlQnJC8, reason: not valid java name */
    public final void m1119invokeKlQnJC8(int i5) {
        boolean m5709equalsimpl0;
        l<KeyboardActionScope, r2> lVar;
        TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$1;
        TextFieldDecoratorModifierNode$keyboardActionScope$1 textFieldDecoratorModifierNode$keyboardActionScope$12;
        ImeAction.Companion companion = ImeAction.Companion;
        r2 r2Var = null;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5722getDoneeUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnDone();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5723getGoeUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnGo();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5724getNexteUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnNext();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5726getPreviouseUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5727getSearcheUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnSearch();
        } else if (ImeAction.m5709equalsimpl0(i5, companion.m5728getSendeUduSuo())) {
            lVar = this.this$0.getKeyboardActions().getOnSend();
        } else {
            if (ImeAction.m5709equalsimpl0(i5, companion.m5721getDefaulteUduSuo())) {
                m5709equalsimpl0 = true;
            } else {
                m5709equalsimpl0 = ImeAction.m5709equalsimpl0(i5, companion.m5725getNoneeUduSuo());
            }
            if (m5709equalsimpl0) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (lVar != null) {
            textFieldDecoratorModifierNode$keyboardActionScope$12 = this.this$0.keyboardActionScope;
            lVar.invoke(textFieldDecoratorModifierNode$keyboardActionScope$12);
            r2Var = r2.f19517a;
        }
        if (r2Var == null) {
            textFieldDecoratorModifierNode$keyboardActionScope$1 = this.this$0.keyboardActionScope;
            textFieldDecoratorModifierNode$keyboardActionScope$1.mo852defaultKeyboardActionKlQnJC8(i5);
        }
    }
}

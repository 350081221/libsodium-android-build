package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$applySemantics$6 extends n0 implements v3.a<Boolean> {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Boolean invoke() {
        boolean isFocused;
        SoftwareKeyboardController requireKeyboardController;
        isFocused = this.this$0.isFocused();
        if (!isFocused) {
            FocusRequesterModifierNodeKt.requestFocus(this.this$0);
        } else if (!this.this$0.getReadOnly()) {
            requireKeyboardController = this.this$0.requireKeyboardController();
            requireKeyboardController.show();
        }
        return Boolean.TRUE;
    }
}

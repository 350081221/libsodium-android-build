package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.i0;

@i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Lkotlin/r2;", "defaultKeyboardAction-KlQnJC8", "(I)V", "defaultKeyboardAction", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "focusManager", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.this$0 = textFieldDecoratorModifierNode;
    }

    private final FocusManager getFocusManager() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalFocusManager());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo852defaultKeyboardActionKlQnJC8(int i5) {
        boolean m5709equalsimpl0;
        boolean m5709equalsimpl02;
        SoftwareKeyboardController requireKeyboardController;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5724getNexteUduSuo())) {
            getFocusManager().mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3423getNextdhqQ8s());
            return;
        }
        if (ImeAction.m5709equalsimpl0(i5, companion.m5726getPreviouseUduSuo())) {
            getFocusManager().mo3427moveFocus3ESFkO8(FocusDirection.Companion.m3424getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m5709equalsimpl0(i5, companion.m5722getDoneeUduSuo())) {
            requireKeyboardController = this.this$0.requireKeyboardController();
            requireKeyboardController.hide();
            return;
        }
        boolean z4 = true;
        if (ImeAction.m5709equalsimpl0(i5, companion.m5723getGoeUduSuo())) {
            m5709equalsimpl0 = true;
        } else {
            m5709equalsimpl0 = ImeAction.m5709equalsimpl0(i5, companion.m5727getSearcheUduSuo());
        }
        if (m5709equalsimpl0) {
            m5709equalsimpl02 = true;
        } else {
            m5709equalsimpl02 = ImeAction.m5709equalsimpl0(i5, companion.m5728getSendeUduSuo());
        }
        if (!m5709equalsimpl02) {
            z4 = ImeAction.m5709equalsimpl0(i5, companion.m5721getDefaulteUduSuo());
        }
        if (!z4) {
            ImeAction.m5709equalsimpl0(i5, companion.m5725getNoneeUduSuo());
        }
    }
}

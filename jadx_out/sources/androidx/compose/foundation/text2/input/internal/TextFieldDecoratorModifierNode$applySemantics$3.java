package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.selection.TextToolbarState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "start", "", "end", "relativeToOriginal", "invoke", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldDecoratorModifierNode$applySemantics$3 extends n0 implements q<Integer, Integer, Boolean, Boolean> {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(3);
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
        return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
    }

    @l
    public final Boolean invoke(int i5, int i6, boolean z4) {
        TextFieldCharSequence text;
        if (z4) {
            text = this.this$0.getTextFieldState().getUntransformedText();
        } else {
            text = this.this$0.getTextFieldState().getText();
        }
        long mo1076getSelectionInCharsd9O1mEE = text.mo1076getSelectionInCharsd9O1mEE();
        if (this.this$0.getEnabled() && Math.min(i5, i6) >= 0 && Math.max(i5, i6) <= text.length()) {
            if (i5 == TextRange.m5545getStartimpl(mo1076getSelectionInCharsd9O1mEE) && i6 == TextRange.m5540getEndimpl(mo1076getSelectionInCharsd9O1mEE)) {
                return Boolean.TRUE;
            }
            long TextRange = TextRangeKt.TextRange(i5, i6);
            if (!z4 && i5 != i6) {
                this.this$0.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
            } else {
                this.this$0.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
            }
            if (z4) {
                this.this$0.getTextFieldState().m1147selectUntransformedCharsIn5zctL8(TextRange);
            } else {
                this.this$0.getTextFieldState().m1146selectCharsIn5zctL8(TextRange);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

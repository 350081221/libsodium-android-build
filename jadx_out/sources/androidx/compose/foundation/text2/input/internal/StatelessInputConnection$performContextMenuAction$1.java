package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text2/input/internal/EditingBuffer;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class StatelessInputConnection$performContextMenuAction$1 extends n0 implements l<EditingBuffer, r2> {
    final /* synthetic */ StatelessInputConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatelessInputConnection$performContextMenuAction$1(StatelessInputConnection statelessInputConnection) {
        super(1);
        this.this$0 = statelessInputConnection;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(EditingBuffer editingBuffer) {
        invoke2(editingBuffer);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l EditingBuffer editingBuffer) {
        TextFieldCharSequence text;
        text = this.this$0.getText();
        editingBuffer.setSelection(0, text.length());
    }
}

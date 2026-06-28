package androidx.compose.foundation.text.selection;

import androidx.compose.ui.focus.FocusState;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusState;", "focusState", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/focus/FocusState;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectionManager$modifier$3 extends n0 implements l<FocusState, r2> {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$3(SelectionManager selectionManager) {
        super(1);
        this.this$0 = selectionManager;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(FocusState focusState) {
        invoke2(focusState);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l FocusState focusState) {
        if (!focusState.isFocused() && this.this$0.getHasFocus()) {
            this.this$0.onRelease();
        }
        this.this$0.setHasFocus(focusState.isFocused());
    }
}

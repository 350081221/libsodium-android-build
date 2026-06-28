package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusEventNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "Lkotlin/r2;", "onFocusEvent", "Lkotlin/Function1;", "Lv3/l;", "getOnFocusEvent", "()Lv3/l;", "setOnFocusEvent", "(Lv3/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {

    @l
    private v3.l<? super FocusState, r2> onFocusEvent;

    public FocusEventNode(@l v3.l<? super FocusState, r2> lVar) {
        this.onFocusEvent = lVar;
    }

    @l
    public final v3.l<FocusState, r2> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@l FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(@l v3.l<? super FocusState, r2> lVar) {
        this.onFocusEvent = lVar;
    }
}

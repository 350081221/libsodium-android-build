package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusState;", "focusState", "Lkotlin/r2;", "onFocusEvent", "Lkotlin/Function1;", "onFocusChanged", "Lv3/l;", "getOnFocusChanged", "()Lv3/l;", "setOnFocusChanged", "(Lv3/l;)V", "Landroidx/compose/ui/focus/FocusState;", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {

    @m
    private FocusState focusState;

    @l
    private v3.l<? super FocusState, r2> onFocusChanged;

    public FocusChangedNode(@l v3.l<? super FocusState, r2> lVar) {
        this.onFocusChanged = lVar;
    }

    @l
    public final v3.l<FocusState, r2> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@l FocusState focusState) {
        if (!l0.g(this.focusState, focusState)) {
            this.focusState = focusState;
            this.onFocusChanged.invoke(focusState);
        }
    }

    public final void setOnFocusChanged(@l v3.l<? super FocusState, r2> lVar) {
        this.onFocusChanged = lVar;
    }
}

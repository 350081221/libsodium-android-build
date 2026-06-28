package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/r2;", "onGloballyPositioned", "Lkotlin/Function1;", "callback", "Lv3/l;", "getCallback", "()Lv3/l;", "setCallback", "(Lv3/l;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {

    @l
    private v3.l<? super LayoutCoordinates, r2> callback;

    public OnGloballyPositionedNode(@l v3.l<? super LayoutCoordinates, r2> lVar) {
        this.callback = lVar;
    }

    @l
    public final v3.l<LayoutCoordinates, r2> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(@l v3.l<? super LayoutCoordinates, r2> lVar) {
        this.callback = lVar;
    }
}

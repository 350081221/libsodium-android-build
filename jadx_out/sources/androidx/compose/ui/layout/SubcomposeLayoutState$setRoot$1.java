package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeLayoutState;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setRoot$1 extends n0 implements p<LayoutNode, SubcomposeLayoutState, r2> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, SubcomposeLayoutState subcomposeLayoutState) {
        invoke2(layoutNode, subcomposeLayoutState);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l LayoutNode layoutNode, @l SubcomposeLayoutState subcomposeLayoutState) {
        LayoutNodeSubcompositionsState state;
        LayoutNodeSubcompositionsState state2;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2;
        SubcomposeLayoutState subcomposeLayoutState2 = this.this$0;
        LayoutNodeSubcompositionsState subcompositionsState$ui_release = layoutNode.getSubcompositionsState$ui_release();
        if (subcompositionsState$ui_release == null) {
            subcomposeSlotReusePolicy2 = this.this$0.slotReusePolicy;
            subcompositionsState$ui_release = new LayoutNodeSubcompositionsState(layoutNode, subcomposeSlotReusePolicy2);
            layoutNode.setSubcompositionsState$ui_release(subcompositionsState$ui_release);
        }
        subcomposeLayoutState2._state = subcompositionsState$ui_release;
        state = this.this$0.getState();
        state.makeSureStateIsConsistent();
        state2 = this.this$0.getState();
        subcomposeSlotReusePolicy = this.this$0.slotReusePolicy;
        state2.setSlotReusePolicy(subcomposeSlotReusePolicy);
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Lv3/p;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState$setMeasurePolicy$1 extends n0 implements p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, r2> {
    final /* synthetic */ SubcomposeLayoutState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setMeasurePolicy$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.this$0 = subcomposeLayoutState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(LayoutNode layoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        invoke2(layoutNode, pVar);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l LayoutNode layoutNode, @l p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        LayoutNodeSubcompositionsState state;
        state = this.this$0.getState();
        layoutNode.setMeasurePolicy(state.createMeasurePolicy(pVar));
    }
}

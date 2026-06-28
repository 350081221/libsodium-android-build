package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ LayoutNodeLayoutDelegate this$0;
    final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.this$0 = layoutNodeLayoutDelegate;
        this.this$1 = measurePassDelegate;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Placeable.PlacementScope placementScope;
        l<? super GraphicsLayerScope, r2> lVar;
        long j5;
        float f5;
        long j6;
        float f6;
        NodeCoordinator wrappedBy$ui_release = this.this$0.getOuterCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (placementScope = wrappedBy$ui_release.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this.this$0.layoutNode).getPlacementScope();
        }
        Placeable.PlacementScope placementScope2 = placementScope;
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.this$1;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.this$0;
        lVar = measurePassDelegate.placeOuterCoordinatorLayerBlock;
        if (lVar == null) {
            NodeCoordinator outerCoordinator = layoutNodeLayoutDelegate.getOuterCoordinator();
            j6 = measurePassDelegate.placeOuterCoordinatorPosition;
            f6 = measurePassDelegate.placeOuterCoordinatorZIndex;
            placementScope2.m5053place70tqf50(outerCoordinator, j6, f6);
            return;
        }
        NodeCoordinator outerCoordinator2 = layoutNodeLayoutDelegate.getOuterCoordinator();
        j5 = measurePassDelegate.placeOuterCoordinatorPosition;
        f5 = measurePassDelegate.placeOuterCoordinatorZIndex;
        placementScope2.m5058placeWithLayeraW9wM(outerCoordinator2, j5, f5, lVar);
    }
}

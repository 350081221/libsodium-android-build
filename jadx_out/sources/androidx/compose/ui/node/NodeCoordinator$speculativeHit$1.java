package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1329:1\n72#2:1330\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n642#1:1330\n*E\n"})
/* loaded from: classes.dex */
public final class NodeCoordinator$speculativeHit$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ HitTestResult $hitTestResult;
    final /* synthetic */ NodeCoordinator.HitTestSource $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ boolean $isTouchEvent;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ Modifier.Node $this_speculativeHit;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$speculativeHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j5, HitTestResult hitTestResult, boolean z4, boolean z5, float f5) {
        super(0);
        this.this$0 = nodeCoordinator;
        this.$this_speculativeHit = node;
        this.$hitTestSource = hitTestSource;
        this.$pointerPosition = j5;
        this.$hitTestResult = hitTestResult;
        this.$isTouchEvent = z4;
        this.$isInLayer = z5;
        this.$distanceFromEdge = f5;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Modifier.Node m5202nextUntilhw7D004;
        NodeCoordinator nodeCoordinator = this.this$0;
        m5202nextUntilhw7D004 = NodeCoordinatorKt.m5202nextUntilhw7D004(this.$this_speculativeHit, this.$hitTestSource.mo5200entityTypeOLwlOKw(), NodeKind.m5204constructorimpl(2));
        nodeCoordinator.m5182speculativeHitJHbHoSQ(m5202nextUntilhw7D004, this.$hitTestSource, this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, this.$isInLayer, this.$distanceFromEdge);
    }
}

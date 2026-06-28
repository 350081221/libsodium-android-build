package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "canvas", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/Canvas;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NodeCoordinator$drawBlock$1 extends n0 implements l<Canvas, r2> {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$drawBlock$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ NodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NodeCoordinator nodeCoordinator, Canvas canvas) {
            super(0);
            this.this$0 = nodeCoordinator;
            this.$canvas = canvas;
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.drawContainedDrawModifiers(this.$canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator) {
        super(1);
        this.this$0 = nodeCoordinator;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Canvas canvas) {
        invoke2(canvas);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Canvas canvas) {
        OwnerSnapshotObserver snapshotObserver;
        l lVar;
        if (this.this$0.getLayoutNode().isPlaced()) {
            snapshotObserver = this.this$0.getSnapshotObserver();
            NodeCoordinator nodeCoordinator = this.this$0;
            lVar = NodeCoordinator.onCommitAffectingLayer;
            snapshotObserver.observeReads$ui_release(nodeCoordinator, lVar, new AnonymousClass1(this.this$0, canvas));
            this.this$0.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.this$0.lastLayerDrawingWasSkipped = true;
    }
}

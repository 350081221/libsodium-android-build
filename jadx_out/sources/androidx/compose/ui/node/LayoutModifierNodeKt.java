package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNode;", "Lkotlin/r2;", "remeasureSync", "invalidateLayer", "invalidatePlacement", "invalidateMeasurement", "requestRemeasure", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,309:1\n72#2:310\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n145#1:310\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(@l LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m5101requireCoordinator64DMado(layoutModifierNode, NodeKind.m5204constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(@l LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    public static final void invalidatePlacement(@l LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(@l LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void requestRemeasure(@l LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, 3, null);
    }
}

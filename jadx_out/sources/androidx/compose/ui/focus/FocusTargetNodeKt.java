package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusTransactionManager;", "requireTransactionManager", "Lkotlin/r2;", "invalidateFocusTarget", "getFocusTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusTargetNodeKt {
    public static final FocusTransactionManager getFocusTransactionManager(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        FocusOwner focusOwner;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner$ui_release = layoutNode.getOwner$ui_release()) == null || (focusOwner = owner$ui_release.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(@l FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }

    @l
    public static final FocusTransactionManager requireTransactionManager(@l FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}

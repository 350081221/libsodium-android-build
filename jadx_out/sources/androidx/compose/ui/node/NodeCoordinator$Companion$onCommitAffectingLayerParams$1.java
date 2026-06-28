package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends n0 implements l<NodeCoordinator, r2> {
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 INSTANCE = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1();

    NodeCoordinator$Companion$onCommitAffectingLayerParams$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(NodeCoordinator nodeCoordinator) {
        invoke2(nodeCoordinator);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l NodeCoordinator nodeCoordinator) {
        LayerPositionalProperties layerPositionalProperties;
        LayerPositionalProperties layerPositionalProperties2;
        LayerPositionalProperties layerPositionalProperties3;
        if (nodeCoordinator.isValidOwnerScope()) {
            layerPositionalProperties = nodeCoordinator.layerPositionalProperties;
            if (layerPositionalProperties == null) {
                NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                return;
            }
            layerPositionalProperties2 = NodeCoordinator.tmpLayerPositionalProperties;
            layerPositionalProperties2.copyFrom(layerPositionalProperties);
            NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
            layerPositionalProperties3 = NodeCoordinator.tmpLayerPositionalProperties;
            if (layerPositionalProperties3.hasSameValuesAs(layerPositionalProperties)) {
                return;
            }
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            LayoutNodeLayoutDelegate layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
            if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                    LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                }
                layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            }
            Owner owner$ui_release = layoutNode.getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.requestOnPositionedCallback(layoutNode);
            }
        }
    }
}

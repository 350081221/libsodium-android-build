package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"rootLookaheadDelegate", "Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    @l
    public static final LookaheadDelegate getRootLookaheadDelegate(@l LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode2.getParent$ui_release();
            LayoutNode layoutNode3 = null;
            if (parent$ui_release != null) {
                layoutNode = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode = null;
            }
            if (layoutNode != null) {
                LayoutNode parent$ui_release2 = layoutNode2.getParent$ui_release();
                if (parent$ui_release2 != null) {
                    layoutNode3 = parent$ui_release2.getLookaheadRoot$ui_release();
                }
                l0.m(layoutNode3);
                if (layoutNode3.isVirtualLookaheadRoot$ui_release()) {
                    layoutNode2 = layoutNode2.getParent$ui_release();
                    l0.m(layoutNode2);
                } else {
                    LayoutNode parent$ui_release3 = layoutNode2.getParent$ui_release();
                    l0.m(parent$ui_release3);
                    layoutNode2 = parent$ui_release3.getLookaheadRoot$ui_release();
                    l0.m(layoutNode2);
                }
            } else {
                LookaheadDelegate lookaheadDelegate2 = layoutNode2.getOuterCoordinator$ui_release().getLookaheadDelegate();
                l0.m(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}

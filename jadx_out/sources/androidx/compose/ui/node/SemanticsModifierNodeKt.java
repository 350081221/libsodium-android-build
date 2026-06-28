package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u0018\u0010\u0005\u001a\u00020\u0004*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Lkotlin/r2;", "invalidateSemantics", "Landroidx/compose/ui/Modifier$Node;", "", "useMinimumTouchTarget", "Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUseMinimumTouchTarget", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,107:1\n76#2:108\n76#2:109\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n102#1:108\n105#1:109\n*E\n"})
/* loaded from: classes.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(@l SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@l SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    @l
    public static final Rect touchBoundsInRoot(@l Modifier.Node node, boolean z4) {
        if (!node.getNode().isAttached()) {
            return Rect.Companion.getZero();
        }
        if (!z4) {
            return LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m5101requireCoordinator64DMado(node, NodeKind.m5204constructorimpl(8)));
        }
        return DelegatableNodeKt.m5101requireCoordinator64DMado(node, NodeKind.m5204constructorimpl(8)).touchBoundsInRoot();
    }
}

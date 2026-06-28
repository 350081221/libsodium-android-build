package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"isAttached", "", "Landroidx/compose/ui/node/PointerInputModifierNode;", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Z", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "(Landroidx/compose/ui/node/PointerInputModifierNode;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,127:1\n78#2:128\n*S KotlinDebug\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n*L\n126#1:128\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputModifierNodeKt {
    @l
    public static final LayoutCoordinates getLayoutCoordinates(@l PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m5101requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m5204constructorimpl(16));
    }

    public static final boolean isAttached(@l PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}

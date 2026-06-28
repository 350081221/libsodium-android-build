package androidx.compose.ui.node;

import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/DrawModifierNode;", "Lkotlin/r2;", "invalidateDraw", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,44:1\n70#2:45\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n41#1:45\n*E\n"})
/* loaded from: classes.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(@l DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m5101requireCoordinator64DMado(drawModifierNode, NodeKind.m5204constructorimpl(1)).invalidateLayer();
        }
    }
}

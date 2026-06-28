package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,128:1\n74#2:129\n72#2:130\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScopeKt\n*L\n114#1:129\n115#1:130\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        int m5204constructorimpl = NodeKind.m5204constructorimpl(4);
        int m5204constructorimpl2 = NodeKind.m5204constructorimpl(2);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & m5204constructorimpl) == 0) {
            return null;
        }
        while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & m5204constructorimpl2) == 0) {
            if ((child$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}

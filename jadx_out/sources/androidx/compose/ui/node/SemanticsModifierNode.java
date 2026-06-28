package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "applySemantics", "", "getShouldClearDescendantSemantics", "()Z", "shouldClearDescendantSemantics", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SemanticsModifierNode extends DelegatableNode {
    void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver);

    default boolean getShouldClearDescendantSemantics() {
        return false;
    }

    default boolean getShouldMergeDescendantSemantics() {
        return false;
    }
}

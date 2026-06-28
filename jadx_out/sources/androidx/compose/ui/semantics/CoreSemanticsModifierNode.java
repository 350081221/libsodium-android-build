package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR3\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\n¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "applySemantics", "", "mergeDescendants", "Z", "getMergeDescendants", "()Z", "setMergeDescendants", "(Z)V", "isClearingSemantics", "setClearingSemantics", "Lkotlin/Function1;", "Lkotlin/u;", "properties", "Lv3/l;", "getProperties", "()Lv3/l;", "setProperties", "(Lv3/l;)V", "getShouldClearDescendantSemantics", "shouldClearDescendantSemantics", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "<init>", "(ZZLv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;

    @l
    private v3.l<? super SemanticsPropertyReceiver, r2> properties;

    public CoreSemanticsModifierNode(boolean z4, boolean z5, @l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        this.mergeDescendants = z4;
        this.isClearingSemantics = z5;
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @l
    public final v3.l<SemanticsPropertyReceiver, r2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z4) {
        this.isClearingSemantics = z4;
    }

    public final void setMergeDescendants(boolean z4) {
        this.mergeDescendants = z4;
    }

    public final void setProperties(@l v3.l<? super SemanticsPropertyReceiver, r2> lVar) {
        this.properties = lVar;
    }
}

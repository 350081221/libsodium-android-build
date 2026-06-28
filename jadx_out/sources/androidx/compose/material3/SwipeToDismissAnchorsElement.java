package androidx.compose.material3;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/SwipeToDismissAnchorsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/SwipeToDismissAnchorsNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "enableDismissFromStartToEnd", "Z", "enableDismissFromEndToStart", "<init>", "(Landroidx/compose/material3/SwipeToDismissBoxState;ZZ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,480:1\n135#2:481\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n*L\n427#1:481\n*E\n"})
/* loaded from: classes.dex */
final class SwipeToDismissAnchorsElement extends ModifierNodeElement<SwipeToDismissAnchorsNode> {
    private final boolean enableDismissFromEndToStart;
    private final boolean enableDismissFromStartToEnd;

    @p4.l
    private final SwipeToDismissBoxState state;

    public SwipeToDismissAnchorsElement(@p4.l SwipeToDismissBoxState swipeToDismissBoxState, boolean z4, boolean z5) {
        this.state = swipeToDismissBoxState;
        this.enableDismissFromStartToEnd = z4;
        this.enableDismissFromEndToStart = z5;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.material3.SwipeToDismissAnchorsElement");
        SwipeToDismissAnchorsElement swipeToDismissAnchorsElement = (SwipeToDismissAnchorsElement) obj;
        if (kotlin.jvm.internal.l0.g(this.state, swipeToDismissAnchorsElement.state) && this.enableDismissFromStartToEnd == swipeToDismissAnchorsElement.enableDismissFromStartToEnd && this.enableDismissFromEndToStart == swipeToDismissAnchorsElement.enableDismissFromEndToStart) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.enableDismissFromStartToEnd)) * 31) + Boolean.hashCode(this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@p4.l InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new SwipeToDismissAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1(this);
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @p4.l
    public SwipeToDismissAnchorsNode create() {
        return new SwipeToDismissAnchorsNode(this.state, this.enableDismissFromStartToEnd, this.enableDismissFromEndToStart);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@p4.l SwipeToDismissAnchorsNode swipeToDismissAnchorsNode) {
        swipeToDismissAnchorsNode.setState(this.state);
        swipeToDismissAnchorsNode.setEnableDismissFromStartToEnd(this.enableDismissFromStartToEnd);
        swipeToDismissAnchorsNode.setEnableDismissFromEndToStart(this.enableDismissFromEndToStart);
    }
}

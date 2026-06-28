package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\u000b*\u00020\rH\u0016R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/OnGloballyPositionedNode;", "create", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onGloballyPositioned", "Lv3/l;", "getOnGloballyPositioned", "()Lv3/l;", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {

    @l
    private final v3.l<LayoutCoordinates, r2> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@l v3.l<? super LayoutCoordinates, r2> lVar) {
        this.onGloballyPositioned = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        return l0.g(this.onGloballyPositioned, ((OnGloballyPositionedElement) obj).onGloballyPositioned);
    }

    @l
    public final v3.l<LayoutCoordinates, r2> getOnGloballyPositioned() {
        return this.onGloballyPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onGloballyPositioned");
        inspectorInfo.getProperties().set("onGloballyPositioned", this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public OnGloballyPositionedNode create() {
        return new OnGloballyPositionedNode(this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l OnGloballyPositionedNode onGloballyPositionedNode) {
        onGloballyPositionedNode.setCallback(this.onGloballyPositioned);
    }
}

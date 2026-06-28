package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\f\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0002\b\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "create", "node", "Lkotlin/r2;", "update", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/foundation/layout/IntrinsicSize;", "height", "Landroidx/compose/foundation/layout/IntrinsicSize;", "getHeight", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "enforceIncoming", "Z", "getEnforceIncoming", "()Z", "Lkotlin/Function1;", "Lkotlin/u;", "inspectorInfo", "Lv3/l;", "getInspectorInfo", "()Lv3/l;", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;ZLv3/l;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    private final boolean enforceIncoming;

    @l
    private final IntrinsicSize height;

    @l
    private final v3.l<InspectorInfo, r2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(@l IntrinsicSize intrinsicSize, boolean z4, @l v3.l<? super InspectorInfo, r2> lVar) {
        this.height = intrinsicSize;
        this.enforceIncoming = z4;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement == null) {
            return false;
        }
        if (this.height == intrinsicHeightElement.height && this.enforceIncoming == intrinsicHeightElement.enforceIncoming) {
            return true;
        }
        return false;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @l
    public final IntrinsicSize getHeight() {
        return this.height;
    }

    @l
    public final v3.l<InspectorInfo, r2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public IntrinsicHeightNode create() {
        return new IntrinsicHeightNode(this.height, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.setHeight(this.height);
        intrinsicHeightNode.setEnforceIncoming(this.enforceIncoming);
    }
}

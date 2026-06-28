package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/ZIndexNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "", "component1", "zIndex", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "F", "getZIndex", "()F", "<init>", "(F)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public ZIndexElement(float f5) {
        this.zIndex = f5;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f5);
    }

    public final float component1() {
        return this.zIndex;
    }

    @l
    public final ZIndexElement copy(float f5) {
        return new ZIndexElement(f5);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    @l
    public String toString() {
        return "ZIndexElement(zIndex=" + this.zIndex + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}

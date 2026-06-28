package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\f\u0010\n\u001a\u00020\u0007*\u00020\tH\u0016J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutIdModifier;", "", "component1", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "layoutId", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "", "equals", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    @l
    private final Object layoutId;

    public LayoutIdElement(@l Object obj) {
        this.layoutId = obj;
    }

    private final Object component1() {
        return this.layoutId;
    }

    public static /* synthetic */ LayoutIdElement copy$default(LayoutIdElement layoutIdElement, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = layoutIdElement.layoutId;
        }
        return layoutIdElement.copy(obj);
    }

    @l
    public final LayoutIdElement copy(@l Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && l0.g(this.layoutId, ((LayoutIdElement) obj).layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    @l
    public String toString() {
        return "LayoutIdElement(layoutId=" + this.layoutId + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.setLayoutId$ui_release(this.layoutId);
    }
}

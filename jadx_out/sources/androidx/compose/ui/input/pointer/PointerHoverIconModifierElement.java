package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/pointer/PointerHoverIconModifierNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/ui/input/pointer/PointerIcon;", "component1", "", "component2", "icon", "overrideDescendants", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "equals", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Z", "getOverrideDescendants", "()Z", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    public static final int $stable = 0;

    @l
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    public /* synthetic */ PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z4, int i5, w wVar) {
        this(pointerIcon, (i5 & 2) != 0 ? false : z4);
    }

    public static /* synthetic */ PointerHoverIconModifierElement copy$default(PointerHoverIconModifierElement pointerHoverIconModifierElement, PointerIcon pointerIcon, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            pointerIcon = pointerHoverIconModifierElement.icon;
        }
        if ((i5 & 2) != 0) {
            z4 = pointerHoverIconModifierElement.overrideDescendants;
        }
        return pointerHoverIconModifierElement.copy(pointerIcon, z4);
    }

    @l
    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    @l
    public final PointerHoverIconModifierElement copy(@l PointerIcon pointerIcon, boolean z4) {
        return new PointerHoverIconModifierElement(pointerIcon, z4);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return l0.g(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    @l
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    @l
    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }

    public PointerHoverIconModifierElement(@l PointerIcon pointerIcon, boolean z4) {
        this.icon = pointerIcon;
        this.overrideDescendants = z4;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.icon, this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.setIcon(this.icon);
        pointerHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
    }
}

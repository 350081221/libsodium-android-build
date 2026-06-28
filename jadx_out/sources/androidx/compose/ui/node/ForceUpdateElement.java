package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\r\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0001HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0001HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001b\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/ForceUpdateElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "create", "node", "Lkotlin/r2;", "update", "component1", "original", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/node/ModifierNodeElement;", "getOriginal", "()Landroidx/compose/ui/node/ModifierNodeElement;", "<init>", "(Landroidx/compose/ui/node/ModifierNodeElement;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ForceUpdateElement extends ModifierNodeElement<Modifier.Node> {

    @l
    private final ModifierNodeElement<?> original;

    public ForceUpdateElement(@l ModifierNodeElement<?> modifierNodeElement) {
        this.original = modifierNodeElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ForceUpdateElement copy$default(ForceUpdateElement forceUpdateElement, ModifierNodeElement modifierNodeElement, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            modifierNodeElement = forceUpdateElement.original;
        }
        return forceUpdateElement.copy(modifierNodeElement);
    }

    @l
    public final ModifierNodeElement<?> component1() {
        return this.original;
    }

    @l
    public final ForceUpdateElement copy(@l ModifierNodeElement<?> modifierNodeElement) {
        return new ForceUpdateElement(modifierNodeElement);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public Modifier.Node create() {
        throw new IllegalStateException("Shouldn't be called");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateElement) && l0.g(this.original, ((ForceUpdateElement) obj).original);
    }

    @l
    public final ModifierNodeElement<?> getOriginal() {
        return this.original;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.original.hashCode();
    }

    @l
    public String toString() {
        return "ForceUpdateElement(original=" + this.original + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l Modifier.Node node) {
        throw new IllegalStateException("Shouldn't be called");
    }
}

package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimationSpecsNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/AnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "component1", "placementSpec", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getPlacementSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {

    @l
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public AnimateItemElement(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateItemElement copy$default(AnimateItemElement animateItemElement, FiniteAnimationSpec finiteAnimationSpec, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = animateItemElement.placementSpec;
        }
        return animateItemElement.copy(finiteAnimationSpec);
    }

    @l
    public final FiniteAnimationSpec<IntOffset> component1() {
        return this.placementSpec;
    }

    @l
    public final AnimateItemElement copy(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new AnimateItemElement(finiteAnimationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnimateItemElement) && l0.g(this.placementSpec, ((AnimateItemElement) obj).placementSpec);
    }

    @l
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.placementSpec.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.placementSpec);
    }

    @l
    public String toString() {
        return "AnimateItemElement(placementSpec=" + this.placementSpec + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(null, this.placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
    }
}

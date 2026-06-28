package androidx.compose.foundation.lazy;

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

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/AnimateItemElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "component1", "Landroidx/compose/ui/unit/IntOffset;", "component2", "appearanceSpec", "placementSpec", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAppearanceSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "getPlacementSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {

    @m
    private final FiniteAnimationSpec<Float> appearanceSpec;

    @m
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public AnimateItemElement(@m FiniteAnimationSpec<Float> finiteAnimationSpec, @m FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        this.appearanceSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimateItemElement copy$default(AnimateItemElement animateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = animateItemElement.appearanceSpec;
        }
        if ((i5 & 2) != 0) {
            finiteAnimationSpec2 = animateItemElement.placementSpec;
        }
        return animateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2);
    }

    @m
    public final FiniteAnimationSpec<Float> component1() {
        return this.appearanceSpec;
    }

    @m
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    @l
    public final AnimateItemElement copy(@m FiniteAnimationSpec<Float> finiteAnimationSpec, @m FiniteAnimationSpec<IntOffset> finiteAnimationSpec2) {
        return new AnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimateItemElement)) {
            return false;
        }
        AnimateItemElement animateItemElement = (AnimateItemElement) obj;
        return l0.g(this.appearanceSpec, animateItemElement.appearanceSpec) && l0.g(this.placementSpec, animateItemElement.placementSpec);
    }

    @m
    public final FiniteAnimationSpec<Float> getAppearanceSpec() {
        return this.appearanceSpec;
    }

    @m
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.appearanceSpec;
        int hashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        return hashCode + (finiteAnimationSpec2 != null ? finiteAnimationSpec2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.placementSpec);
    }

    @l
    public String toString() {
        return "AnimateItemElement(appearanceSpec=" + this.appearanceSpec + ", placementSpec=" + this.placementSpec + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.appearanceSpec, this.placementSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setAppearanceSpec(this.appearanceSpec);
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
    }
}

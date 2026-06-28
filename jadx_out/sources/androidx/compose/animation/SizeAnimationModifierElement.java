package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00128\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J;\u0010\u0011\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003JU\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2:\b\u0002\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fRI\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "component1", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "initialValue", "targetValue", "component2", "animationSpec", "finishedListener", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lv3/p;", "getFinishedListener", "()Lv3/p;", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lv3/p;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {

    @l
    private final FiniteAnimationSpec<IntSize> animationSpec;

    @m
    private final p<IntSize, IntSize, r2> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @m p<? super IntSize, ? super IntSize, r2> pVar) {
        this.animationSpec = finiteAnimationSpec;
        this.finishedListener = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeAnimationModifierElement copy$default(SizeAnimationModifierElement sizeAnimationModifierElement, FiniteAnimationSpec finiteAnimationSpec, p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = sizeAnimationModifierElement.animationSpec;
        }
        if ((i5 & 2) != 0) {
            pVar = sizeAnimationModifierElement.finishedListener;
        }
        return sizeAnimationModifierElement.copy(finiteAnimationSpec, pVar);
    }

    @l
    public final FiniteAnimationSpec<IntSize> component1() {
        return this.animationSpec;
    }

    @m
    public final p<IntSize, IntSize, r2> component2() {
        return this.finishedListener;
    }

    @l
    public final SizeAnimationModifierElement copy(@l FiniteAnimationSpec<IntSize> finiteAnimationSpec, @m p<? super IntSize, ? super IntSize, r2> pVar) {
        return new SizeAnimationModifierElement(finiteAnimationSpec, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return l0.g(this.animationSpec, sizeAnimationModifierElement.animationSpec) && l0.g(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    @l
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    @m
    public final p<IntSize, IntSize, r2> getFinishedListener() {
        return this.finishedListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.animationSpec.hashCode() * 31;
        p<IntSize, IntSize, r2> pVar = this.finishedListener;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
        inspectorInfo.getProperties().set("finishedListener", this.finishedListener);
    }

    @l
    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", finishedListener=" + this.finishedListener + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
    }
}

package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012A\u0010\u0014\u001a=\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0002\b\u0012¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016JD\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0002\b\u0012HÆ\u0003JN\u0010\u0015\u001a\u00020\u00002C\b\u0002\u0010\u0014\u001a=\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0002\b\u0012HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003RR\u0010\u0014\u001a=\u0012\u0004\u0012\u00020\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0002\b\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/ui/layout/IntermediateLayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/IntermediateLayoutModifierNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Lkotlin/v0;", "name", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "component1", "measure", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/q;", "getMeasure", "()Lv3/q;", "<init>", "(Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IntermediateLayoutElement extends ModifierNodeElement<IntermediateLayoutModifierNode> {

    @l
    private final q<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public IntermediateLayoutElement(@l q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measure = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntermediateLayoutElement copy$default(IntermediateLayoutElement intermediateLayoutElement, q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qVar = intermediateLayoutElement.measure;
        }
        return intermediateLayoutElement.copy(qVar);
    }

    @l
    public final q<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    @l
    public final IntermediateLayoutElement copy(@l q<? super IntermediateMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return new IntermediateLayoutElement(qVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntermediateLayoutElement) && l0.g(this.measure, ((IntermediateLayoutElement) obj).measure);
    }

    @l
    public final q<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("intermediateLayout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    @l
    public String toString() {
        return "IntermediateLayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public IntermediateLayoutModifierNode create() {
        return new IntermediateLayoutModifierNode(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l IntermediateLayoutModifierNode intermediateLayoutModifierNode) {
        intermediateLayoutModifierNode.setMeasureBlock$ui_release(this.measure);
    }
}

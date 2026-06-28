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

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B,\u0012#\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J&\u0010\u000f\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eHÆ\u0003J0\u0010\u0011\u001a\u00020\u00002%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000eHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R4\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/layout/LayoutModifierImpl;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "component1", "measure", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Lv3/q;", "getMeasure", "()Lv3/q;", "<init>", "(Lv3/q;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    @l
    private final q<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@l q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measure = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            qVar = layoutElement.measure;
        }
        return layoutElement.copy(qVar);
    }

    @l
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    @l
    public final LayoutElement copy(@l q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return new LayoutElement(qVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && l0.g(this.measure, ((LayoutElement) obj).measure);
    }

    @l
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    @l
    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}

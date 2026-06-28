package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import p4.l;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B,\u0012#\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0016R?\u0010\u0010\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/layout/LayoutModifierImpl;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "Lkotlin/Function3;", "Lkotlin/u;", "measureBlock", "Lv3/q;", "getMeasureBlock", "()Lv3/q;", "setMeasureBlock", "(Lv3/q;)V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @l
    private q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public LayoutModifierImpl(@l q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }

    @l
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        return this.measureBlock.invoke(measureScope, measurable, Constraints.m5988boximpl(j5));
    }

    public final void setMeasureBlock(@l q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }

    @l
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}

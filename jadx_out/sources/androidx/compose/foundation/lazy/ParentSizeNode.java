package androidx.compose.foundation.lazy;

import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.math.d;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ&\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "fraction", "", "widthState", "Landroidx/compose/runtime/State;", "", "heightState", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getFraction", "()F", "setFraction", "(F)V", "getHeightState", "()Landroidx/compose/runtime/State;", "setHeightState", "(Landroidx/compose/runtime/State;)V", "getWidthState", "setWidthState", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {
    private float fraction;

    @m
    private State<Integer> heightState;

    @m
    private State<Integer> widthState;

    public /* synthetic */ ParentSizeNode(float f5, State state, State state2, int i5, w wVar) {
        this(f5, (i5 & 2) != 0 ? null : state, (i5 & 4) != 0 ? null : state2);
    }

    public final float getFraction() {
        return this.fraction;
    }

    @m
    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    @m
    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int i5;
        int i6;
        int m6002getMinWidthimpl;
        int m6001getMinHeightimpl;
        State<Integer> state = this.widthState;
        if (state != null && state.getValue().intValue() != Integer.MAX_VALUE) {
            i5 = d.L0(state.getValue().floatValue() * this.fraction);
        } else {
            i5 = Integer.MAX_VALUE;
        }
        State<Integer> state2 = this.heightState;
        if (state2 != null && state2.getValue().intValue() != Integer.MAX_VALUE) {
            i6 = d.L0(state2.getValue().floatValue() * this.fraction);
        } else {
            i6 = Integer.MAX_VALUE;
        }
        if (i5 != Integer.MAX_VALUE) {
            m6002getMinWidthimpl = i5;
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        }
        if (i6 != Integer.MAX_VALUE) {
            m6001getMinHeightimpl = i6;
        } else {
            m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        }
        if (i5 == Integer.MAX_VALUE) {
            i5 = Constraints.m6000getMaxWidthimpl(j5);
        }
        if (i6 == Integer.MAX_VALUE) {
            i6 = Constraints.m5999getMaxHeightimpl(j5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.Constraints(m6002getMinWidthimpl, i5, m6001getMinHeightimpl, i6));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new ParentSizeNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    public final void setFraction(float f5) {
        this.fraction = f5;
    }

    public final void setHeightState(@m State<Integer> state) {
        this.heightState = state;
    }

    public final void setWidthState(@m State<Integer> state) {
        this.widthState = state;
    }

    public ParentSizeNode(float f5, @m State<Integer> state, @m State<Integer> state2) {
        this.fraction = f5;
        this.widthState = state;
        this.heightState = state2;
    }
}

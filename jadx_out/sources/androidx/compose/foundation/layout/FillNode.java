package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "(Landroidx/compose/foundation/layout/Direction;F)V", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "getFraction", "()F", "setFraction", "(F)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {

    @l
    private Direction direction;
    private float fraction;

    public FillNode(@l Direction direction, float f5) {
        this.direction = direction;
        this.fraction = f5;
    }

    @l
    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int m6002getMinWidthimpl;
        int m6000getMaxWidthimpl;
        int m5999getMaxHeightimpl;
        int i5;
        int L0;
        int L02;
        if (Constraints.m5996getHasBoundedWidthimpl(j5) && this.direction != Direction.Vertical) {
            L02 = kotlin.math.d.L0(Constraints.m6000getMaxWidthimpl(j5) * this.fraction);
            m6002getMinWidthimpl = u.I(L02, Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
            m6000getMaxWidthimpl = m6002getMinWidthimpl;
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        }
        if (Constraints.m5995getHasBoundedHeightimpl(j5) && this.direction != Direction.Horizontal) {
            L0 = kotlin.math.d.L0(Constraints.m5999getMaxHeightimpl(j5) * this.fraction);
            i5 = u.I(L0, Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
            m5999getMaxHeightimpl = i5;
        } else {
            int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
            m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
            i5 = m6001getMinHeightimpl;
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.Constraints(m6002getMinWidthimpl, m6000getMaxWidthimpl, i5, m5999getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new FillNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    public final void setDirection(@l Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f5) {
        this.fraction = f5;
    }
}

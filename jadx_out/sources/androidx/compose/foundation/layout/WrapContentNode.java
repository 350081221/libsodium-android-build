package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0004\b$\u0010%J&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R4\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/layout/Direction;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "", "unbounded", "Z", "getUnbounded", "()Z", "setUnbounded", "(Z)V", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "Lv3/p;", "getAlignmentCallback", "()Lv3/p;", "setAlignmentCallback", "(Lv3/p;)V", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLv3/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    @l
    private p<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback;

    @l
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(@l Direction direction, boolean z4, @l p<? super IntSize, ? super LayoutDirection, IntOffset> pVar) {
        this.direction = direction;
        this.unbounded = z4;
        this.alignmentCallback = pVar;
    }

    @l
    public final p<IntSize, LayoutDirection, IntOffset> getAlignmentCallback() {
        return this.alignmentCallback;
    }

    @l
    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int m6002getMinWidthimpl;
        int m6000getMaxWidthimpl;
        int I;
        int I2;
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int i5 = 0;
        if (direction != direction2) {
            m6002getMinWidthimpl = 0;
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        }
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i5 = Constraints.m6001getMinHeightimpl(j5);
        }
        int i6 = Integer.MAX_VALUE;
        if (this.direction != direction2 && this.unbounded) {
            m6000getMaxWidthimpl = Integer.MAX_VALUE;
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        }
        if (this.direction == direction4 || !this.unbounded) {
            i6 = Constraints.m5999getMaxHeightimpl(j5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.Constraints(m6002getMinWidthimpl, m6000getMaxWidthimpl, i5, i6));
        I = u.I(mo4998measureBRTryo0.getWidth(), Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(j5));
        I2 = u.I(mo4998measureBRTryo0.getHeight(), Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(j5));
        return MeasureScope.layout$default(measureScope, I, I2, null, new WrapContentNode$measure$1(this, I, mo4998measureBRTryo0, I2, measureScope), 4, null);
    }

    public final void setAlignmentCallback(@l p<? super IntSize, ? super LayoutDirection, IntOffset> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void setDirection(@l Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z4) {
        this.unbounded = z4;
    }
}

package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.ranges.u;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J&\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\"\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\f\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "scrollerState", "Landroidx/compose/foundation/ScrollState;", "isReversed", "", "isVertical", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "()Z", "setReversed", "(Z)V", "setVertical", "getScrollerState", "()Landroidx/compose/foundation/ScrollState;", "setScrollerState", "(Landroidx/compose/foundation/ScrollState;)V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLayoutNode extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private boolean isReversed;
    private boolean isVertical;

    @p4.l
    private ScrollState scrollerState;

    public ScrollingLayoutNode(@p4.l ScrollState scrollState, boolean z4, boolean z5) {
        this.scrollerState = scrollState;
        this.isReversed = z4;
        this.isVertical = z5;
    }

    @p4.l
    public final ScrollState getScrollerState() {
        return this.scrollerState;
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicHeight(i5);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (this.isVertical) {
            return intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        Orientation orientation;
        int m5999getMaxHeightimpl;
        int B;
        int B2;
        int i5;
        if (this.isVertical) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m229checkScrollableContainerConstraintsK40F9xA(j5, orientation);
        int i6 = Integer.MAX_VALUE;
        if (this.isVertical) {
            m5999getMaxHeightimpl = Integer.MAX_VALUE;
        } else {
            m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        }
        if (this.isVertical) {
            i6 = Constraints.m6000getMaxWidthimpl(j5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, i6, 0, m5999getMaxHeightimpl, 5, null));
        B = u.B(mo4998measureBRTryo0.getWidth(), Constraints.m6000getMaxWidthimpl(j5));
        B2 = u.B(mo4998measureBRTryo0.getHeight(), Constraints.m5999getMaxHeightimpl(j5));
        int height = mo4998measureBRTryo0.getHeight() - B2;
        int width = mo4998measureBRTryo0.getWidth() - B;
        if (!this.isVertical) {
            height = width;
        }
        this.scrollerState.setMaxValue$foundation_release(height);
        ScrollState scrollState = this.scrollerState;
        if (this.isVertical) {
            i5 = B2;
        } else {
            i5 = B;
        }
        scrollState.setViewportSize$foundation_release(i5);
        return MeasureScope.layout$default(measureScope, B, B2, null, new ScrollingLayoutNode$measure$1(this, height, mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicHeight(i5);
        }
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        if (this.isVertical) {
            return intrinsicMeasurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i5);
    }

    public final void setReversed(boolean z4) {
        this.isReversed = z4;
    }

    public final void setScrollerState(@p4.l ScrollState scrollState) {
        this.scrollerState = scrollState;
    }

    public final void setVertical(boolean z4) {
        this.isVertical = z4;
    }
}

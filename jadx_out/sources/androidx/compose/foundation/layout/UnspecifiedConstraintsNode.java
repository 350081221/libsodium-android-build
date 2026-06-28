package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "getMinWidth-D9Ej5fM", "()F", "setMinWidth-0680j_4", "(F)V", "minHeight", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "<init>", "(FFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f5, float f6, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f5, (i5 & 2) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, null);
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f5, float f6, w wVar) {
        this(f5, f6);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m621getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m622getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int i6;
        int u4;
        int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i5);
        if (!Dp.m6049equalsimpl0(this.minHeight, Dp.Companion.m6064getUnspecifiedD9Ej5fM())) {
            i6 = intrinsicMeasureScope.mo298roundToPx0680j_4(this.minHeight);
        } else {
            i6 = 0;
        }
        u4 = u.u(maxIntrinsicHeight, i6);
        return u4;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int i6;
        int u4;
        int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i5);
        if (!Dp.m6049equalsimpl0(this.minWidth, Dp.Companion.m6064getUnspecifiedD9Ej5fM())) {
            i6 = intrinsicMeasureScope.mo298roundToPx0680j_4(this.minWidth);
        } else {
            i6 = 0;
        }
        u4 = u.u(maxIntrinsicWidth, i6);
        return u4;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int m6002getMinWidthimpl;
        int m6001getMinHeightimpl;
        int B;
        int B2;
        float f5 = this.minWidth;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m6049equalsimpl0(f5, companion.m6064getUnspecifiedD9Ej5fM()) && Constraints.m6002getMinWidthimpl(j5) == 0) {
            B2 = u.B(measureScope.mo298roundToPx0680j_4(this.minWidth), Constraints.m6000getMaxWidthimpl(j5));
            m6002getMinWidthimpl = u.u(B2, 0);
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        }
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        if (!Dp.m6049equalsimpl0(this.minHeight, companion.m6064getUnspecifiedD9Ej5fM()) && Constraints.m6001getMinHeightimpl(j5) == 0) {
            B = u.B(measureScope.mo298roundToPx0680j_4(this.minHeight), Constraints.m5999getMaxHeightimpl(j5));
            m6001getMinHeightimpl = u.u(B, 0);
        } else {
            m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.Constraints(m6002getMinWidthimpl, m6000getMaxWidthimpl, m6001getMinHeightimpl, Constraints.m5999getMaxHeightimpl(j5)));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int i6;
        int u4;
        int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i5);
        if (!Dp.m6049equalsimpl0(this.minHeight, Dp.Companion.m6064getUnspecifiedD9Ej5fM())) {
            i6 = intrinsicMeasureScope.mo298roundToPx0680j_4(this.minHeight);
        } else {
            i6 = 0;
        }
        u4 = u.u(minIntrinsicHeight, i6);
        return u4;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int i6;
        int u4;
        int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i5);
        if (!Dp.m6049equalsimpl0(this.minWidth, Dp.Companion.m6064getUnspecifiedD9Ej5fM())) {
            i6 = intrinsicMeasureScope.mo298roundToPx0680j_4(this.minWidth);
        } else {
            i6 = 0;
        }
        u4 = u.u(minIntrinsicWidth, i6);
        return u4;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m623setMinHeight0680j_4(float f5) {
        this.minHeight = f5;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m624setMinWidth0680j_4(float f5) {
        this.minWidth = f5;
    }

    private UnspecifiedConstraintsNode(float f5, float f6) {
        this.minWidth = f5;
        this.minHeight = f6;
    }
}

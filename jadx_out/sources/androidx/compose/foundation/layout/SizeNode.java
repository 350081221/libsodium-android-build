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

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u0015\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b0\u00101J&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0010\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R(\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010\"\u001a\u00020\u00158\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010/\u001a\u00020\u0006*\u00020,8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/unit/Dp;", "minWidth", "F", "getMinWidth-D9Ej5fM", "()F", "setMinWidth-0680j_4", "(F)V", "minHeight", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "maxWidth", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "maxHeight", "getMaxHeight-D9Ej5fM", "setMaxHeight-0680j_4", "", "enforceIncoming", "Z", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "targetConstraints", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f5, float f6, float f7, float f8, boolean z4, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f5, (i5 & 2) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f6, (i5 & 4) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f7, (i5 & 8) != 0 ? Dp.Companion.m6064getUnspecifiedD9Ej5fM() : f8, z4, null);
    }

    public /* synthetic */ SizeNode(float f5, float f6, float f7, float f8, boolean z4, w wVar) {
        this(f5, f6, f7, f8, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L16;
     */
    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m610getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r8) {
        /*
            r7 = this;
            float r0 = r7.maxWidth
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.Companion
            float r2 = r1.m6064getUnspecifiedD9Ej5fM()
            boolean r0 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L1d
            float r0 = r7.maxWidth
            int r0 = r8.mo298roundToPx0680j_4(r0)
            int r0 = kotlin.ranges.s.u(r0, r3)
            goto L1e
        L1d:
            r0 = r2
        L1e:
            float r4 = r7.maxHeight
            float r5 = r1.m6064getUnspecifiedD9Ej5fM()
            boolean r4 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r4, r5)
            if (r4 != 0) goto L35
            float r4 = r7.maxHeight
            int r4 = r8.mo298roundToPx0680j_4(r4)
            int r4 = kotlin.ranges.s.u(r4, r3)
            goto L36
        L35:
            r4 = r2
        L36:
            float r5 = r7.minWidth
            float r6 = r1.m6064getUnspecifiedD9Ej5fM()
            boolean r5 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r5, r6)
            if (r5 != 0) goto L53
            float r5 = r7.minWidth
            int r5 = r8.mo298roundToPx0680j_4(r5)
            int r5 = kotlin.ranges.s.B(r5, r0)
            int r5 = kotlin.ranges.s.u(r5, r3)
            if (r5 == r2) goto L53
            goto L54
        L53:
            r5 = r3
        L54:
            float r6 = r7.minHeight
            float r1 = r1.m6064getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r6, r1)
            if (r1 != 0) goto L71
            float r1 = r7.minHeight
            int r8 = r8.mo298roundToPx0680j_4(r1)
            int r8 = kotlin.ranges.s.B(r8, r4)
            int r8 = kotlin.ranges.s.u(r8, r3)
            if (r8 == r2) goto L71
            r3 = r8
        L71:
            long r0 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeNode.m610getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m611getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m612getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m613getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m614getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        long m610getTargetConstraintsOenEA2s = m610getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5997getHasFixedHeightimpl(m610getTargetConstraintsOenEA2s)) {
            return Constraints.m5999getMaxHeightimpl(m610getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m6013constrainHeightK40F9xA(m610getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i5));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        long m610getTargetConstraintsOenEA2s = m610getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5998getHasFixedWidthimpl(m610getTargetConstraintsOenEA2s)) {
            return Constraints.m6000getMaxWidthimpl(m610getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m6014constrainWidthK40F9xA(m610getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i5));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int B;
        int u4;
        int B2;
        int u5;
        long Constraints;
        long m610getTargetConstraintsOenEA2s = m610getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m6012constrainN9IONVI(j5, m610getTargetConstraintsOenEA2s);
        } else {
            float f5 = this.minWidth;
            Dp.Companion companion = Dp.Companion;
            if (!Dp.m6049equalsimpl0(f5, companion.m6064getUnspecifiedD9Ej5fM())) {
                B = Constraints.m6002getMinWidthimpl(m610getTargetConstraintsOenEA2s);
            } else {
                B = u.B(Constraints.m6002getMinWidthimpl(j5), Constraints.m6000getMaxWidthimpl(m610getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6049equalsimpl0(this.maxWidth, companion.m6064getUnspecifiedD9Ej5fM())) {
                u4 = Constraints.m6000getMaxWidthimpl(m610getTargetConstraintsOenEA2s);
            } else {
                u4 = u.u(Constraints.m6000getMaxWidthimpl(j5), Constraints.m6002getMinWidthimpl(m610getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6049equalsimpl0(this.minHeight, companion.m6064getUnspecifiedD9Ej5fM())) {
                B2 = Constraints.m6001getMinHeightimpl(m610getTargetConstraintsOenEA2s);
            } else {
                B2 = u.B(Constraints.m6001getMinHeightimpl(j5), Constraints.m5999getMaxHeightimpl(m610getTargetConstraintsOenEA2s));
            }
            if (!Dp.m6049equalsimpl0(this.maxHeight, companion.m6064getUnspecifiedD9Ej5fM())) {
                u5 = Constraints.m5999getMaxHeightimpl(m610getTargetConstraintsOenEA2s);
            } else {
                u5 = u.u(Constraints.m5999getMaxHeightimpl(j5), Constraints.m6001getMinHeightimpl(m610getTargetConstraintsOenEA2s));
            }
            Constraints = ConstraintsKt.Constraints(B, u4, B2, u5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new SizeNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        long m610getTargetConstraintsOenEA2s = m610getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5997getHasFixedHeightimpl(m610getTargetConstraintsOenEA2s)) {
            return Constraints.m5999getMaxHeightimpl(m610getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m6013constrainHeightK40F9xA(m610getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i5));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        long m610getTargetConstraintsOenEA2s = m610getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        if (Constraints.m5998getHasFixedWidthimpl(m610getTargetConstraintsOenEA2s)) {
            return Constraints.m6000getMaxWidthimpl(m610getTargetConstraintsOenEA2s);
        }
        return ConstraintsKt.m6014constrainWidthK40F9xA(m610getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i5));
    }

    public final void setEnforceIncoming(boolean z4) {
        this.enforceIncoming = z4;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m615setMaxHeight0680j_4(float f5) {
        this.maxHeight = f5;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m616setMaxWidth0680j_4(float f5) {
        this.maxWidth = f5;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m617setMinHeight0680j_4(float f5) {
        this.minHeight = f5;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m618setMinWidth0680j_4(float f5) {
        this.minWidth = f5;
    }

    private SizeNode(float f5, float f6, float f7, float f8, boolean z4) {
        this.minWidth = f5;
        this.minHeight = f6;
        this.maxWidth = f7;
        this.maxHeight = f8;
        this.enforceIncoming = z4;
    }
}

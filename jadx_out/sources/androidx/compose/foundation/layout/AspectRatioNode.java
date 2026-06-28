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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J \u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J \u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f5, boolean z4) {
        this.aspectRatio = f5;
        this.matchHeightConstraintsFirst = z4;
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m479findSizeToXhtMw(long j5) {
        if (!this.matchHeightConstraintsFirst) {
            long m483tryMaxWidthJN0ABg$default = m483tryMaxWidthJN0ABg$default(this, j5, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m6212equalsimpl0(m483tryMaxWidthJN0ABg$default, companion.m6219getZeroYbymL2g())) {
                return m483tryMaxWidthJN0ABg$default;
            }
            long m481tryMaxHeightJN0ABg$default = m481tryMaxHeightJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m481tryMaxHeightJN0ABg$default, companion.m6219getZeroYbymL2g())) {
                return m481tryMaxHeightJN0ABg$default;
            }
            long m487tryMinWidthJN0ABg$default = m487tryMinWidthJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m487tryMinWidthJN0ABg$default, companion.m6219getZeroYbymL2g())) {
                return m487tryMinWidthJN0ABg$default;
            }
            long m485tryMinHeightJN0ABg$default = m485tryMinHeightJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m485tryMinHeightJN0ABg$default, companion.m6219getZeroYbymL2g())) {
                return m485tryMinHeightJN0ABg$default;
            }
            long m482tryMaxWidthJN0ABg = m482tryMaxWidthJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m482tryMaxWidthJN0ABg, companion.m6219getZeroYbymL2g())) {
                return m482tryMaxWidthJN0ABg;
            }
            long m480tryMaxHeightJN0ABg = m480tryMaxHeightJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m480tryMaxHeightJN0ABg, companion.m6219getZeroYbymL2g())) {
                return m480tryMaxHeightJN0ABg;
            }
            long m486tryMinWidthJN0ABg = m486tryMinWidthJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m486tryMinWidthJN0ABg, companion.m6219getZeroYbymL2g())) {
                return m486tryMinWidthJN0ABg;
            }
            long m484tryMinHeightJN0ABg = m484tryMinHeightJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m484tryMinHeightJN0ABg, companion.m6219getZeroYbymL2g())) {
                return m484tryMinHeightJN0ABg;
            }
        } else {
            long m481tryMaxHeightJN0ABg$default2 = m481tryMaxHeightJN0ABg$default(this, j5, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m6212equalsimpl0(m481tryMaxHeightJN0ABg$default2, companion2.m6219getZeroYbymL2g())) {
                return m481tryMaxHeightJN0ABg$default2;
            }
            long m483tryMaxWidthJN0ABg$default2 = m483tryMaxWidthJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m483tryMaxWidthJN0ABg$default2, companion2.m6219getZeroYbymL2g())) {
                return m483tryMaxWidthJN0ABg$default2;
            }
            long m485tryMinHeightJN0ABg$default2 = m485tryMinHeightJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m485tryMinHeightJN0ABg$default2, companion2.m6219getZeroYbymL2g())) {
                return m485tryMinHeightJN0ABg$default2;
            }
            long m487tryMinWidthJN0ABg$default2 = m487tryMinWidthJN0ABg$default(this, j5, false, 1, null);
            if (!IntSize.m6212equalsimpl0(m487tryMinWidthJN0ABg$default2, companion2.m6219getZeroYbymL2g())) {
                return m487tryMinWidthJN0ABg$default2;
            }
            long m480tryMaxHeightJN0ABg2 = m480tryMaxHeightJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m480tryMaxHeightJN0ABg2, companion2.m6219getZeroYbymL2g())) {
                return m480tryMaxHeightJN0ABg2;
            }
            long m482tryMaxWidthJN0ABg2 = m482tryMaxWidthJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m482tryMaxWidthJN0ABg2, companion2.m6219getZeroYbymL2g())) {
                return m482tryMaxWidthJN0ABg2;
            }
            long m484tryMinHeightJN0ABg2 = m484tryMinHeightJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m484tryMinHeightJN0ABg2, companion2.m6219getZeroYbymL2g())) {
                return m484tryMinHeightJN0ABg2;
            }
            long m486tryMinWidthJN0ABg2 = m486tryMinWidthJN0ABg(j5, false);
            if (!IntSize.m6212equalsimpl0(m486tryMinWidthJN0ABg2, companion2.m6219getZeroYbymL2g())) {
                return m486tryMinWidthJN0ABg2;
            }
        }
        return IntSize.Companion.m6219getZeroYbymL2g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r1 = kotlin.math.d.L0(r0 * r3.aspectRatio);
     */
    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m480tryMaxHeightJN0ABg(long r4, boolean r6) {
        /*
            r3 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m5999getMaxHeightimpl(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r3.aspectRatio
            float r1 = r1 * r2
            int r1 = kotlin.math.b.L0(r1)
            if (r1 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r1, r0)
            if (r6 == 0) goto L1f
            boolean r4 = androidx.compose.ui.unit.ConstraintsKt.m6015isSatisfiedBy4WqzIAM(r4, r0)
            if (r4 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r4 = androidx.compose.ui.unit.IntSize.Companion
            long r4 = r4.m6219getZeroYbymL2g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.m480tryMaxHeightJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m481tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return aspectRatioNode.m480tryMaxHeightJN0ABg(j5, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r1 = kotlin.math.d.L0(r0 / r3.aspectRatio);
     */
    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m482tryMaxWidthJN0ABg(long r4, boolean r6) {
        /*
            r3 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m6000getMaxWidthimpl(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r3.aspectRatio
            float r1 = r1 / r2
            int r1 = kotlin.math.b.L0(r1)
            if (r1 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r1)
            if (r6 == 0) goto L1f
            boolean r4 = androidx.compose.ui.unit.ConstraintsKt.m6015isSatisfiedBy4WqzIAM(r4, r0)
            if (r4 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r4 = androidx.compose.ui.unit.IntSize.Companion
            long r4 = r4.m6219getZeroYbymL2g()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioNode.m482tryMaxWidthJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m483tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return aspectRatioNode.m482tryMaxWidthJN0ABg(j5, z4);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m484tryMinHeightJN0ABg(long j5, boolean z4) {
        int L0;
        int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        L0 = kotlin.math.d.L0(m6001getMinHeightimpl * this.aspectRatio);
        if (L0 > 0) {
            long IntSize = IntSizeKt.IntSize(L0, m6001getMinHeightimpl);
            if (!z4 || ConstraintsKt.m6015isSatisfiedBy4WqzIAM(j5, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m6219getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m485tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return aspectRatioNode.m484tryMinHeightJN0ABg(j5, z4);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m486tryMinWidthJN0ABg(long j5, boolean z4) {
        int L0;
        int m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        L0 = kotlin.math.d.L0(m6002getMinWidthimpl / this.aspectRatio);
        if (L0 > 0) {
            long IntSize = IntSizeKt.IntSize(m6002getMinWidthimpl, L0);
            if (!z4 || ConstraintsKt.m6015isSatisfiedBy4WqzIAM(j5, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m6219getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m487tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j5, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        return aspectRatioNode.m486tryMinWidthJN0ABg(j5, z4);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int L0;
        if (i5 != Integer.MAX_VALUE) {
            L0 = kotlin.math.d.L0(i5 / this.aspectRatio);
            return L0;
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int L0;
        if (i5 != Integer.MAX_VALUE) {
            L0 = kotlin.math.d.L0(i5 * this.aspectRatio);
            return L0;
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        long m479findSizeToXhtMw = m479findSizeToXhtMw(j5);
        if (!IntSize.m6212equalsimpl0(m479findSizeToXhtMw, IntSize.Companion.m6219getZeroYbymL2g())) {
            j5 = Constraints.Companion.m6008fixedJhjzzOo(IntSize.m6214getWidthimpl(m479findSizeToXhtMw), IntSize.m6213getHeightimpl(m479findSizeToXhtMw));
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int L0;
        if (i5 != Integer.MAX_VALUE) {
            L0 = kotlin.math.d.L0(i5 / this.aspectRatio);
            return L0;
        }
        return intrinsicMeasurable.minIntrinsicHeight(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        int L0;
        if (i5 != Integer.MAX_VALUE) {
            L0 = kotlin.math.d.L0(i5 * this.aspectRatio);
            return L0;
        }
        return intrinsicMeasurable.minIntrinsicWidth(i5);
    }

    public final void setAspectRatio(float f5) {
        this.aspectRatio = f5;
    }

    public final void setMatchHeightConstraintsFirst(boolean z4) {
        this.matchHeightConstraintsFirst = z4;
    }
}

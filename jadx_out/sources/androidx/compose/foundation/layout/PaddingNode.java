package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R(\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/PaddingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/Dp;", "start", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "top", "getTop-D9Ej5fM", "setTop-0680j_4", "end", "getEnd-D9Ej5fM", "setEnd-0680j_4", "bottom", "getBottom-D9Ej5fM", "setBottom-0680j_4", "", "rtlAware", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n382#1:468\n383#1:469\n384#1:470\n385#1:471\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;
    private float top;

    private PaddingNode(float f5, float f6, float f7, float f8, boolean z4) {
        this.start = f5;
        this.top = f6;
        this.end = f7;
        this.bottom = f8;
        this.rtlAware = z4;
    }

    public /* synthetic */ PaddingNode(float f5, float f6, float f7, float f8, boolean z4, w wVar) {
        this(f5, f6, f7, f8, z4);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m558getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m559getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m560getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m561getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.start) + measureScope.mo298roundToPx0680j_4(this.end);
        int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.top) + measureScope.mo298roundToPx0680j_4(this.bottom);
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(ConstraintsKt.m6016offsetNN6EwU(j5, -mo298roundToPx0680j_4, -mo298roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo4998measureBRTryo0.getWidth() + mo298roundToPx0680j_4), ConstraintsKt.m6013constrainHeightK40F9xA(j5, mo4998measureBRTryo0.getHeight() + mo298roundToPx0680j_42), null, new PaddingNode$measure$1(this, mo4998measureBRTryo0, measureScope), 4, null);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m562setBottom0680j_4(float f5) {
        this.bottom = f5;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m563setEnd0680j_4(float f5) {
        this.end = f5;
    }

    public final void setRtlAware(boolean z4) {
        this.rtlAware = z4;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m564setStart0680j_4(float f5) {
        this.start = f5;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m565setTop0680j_4(float f5) {
        this.top = f5;
    }

    public /* synthetic */ PaddingNode(float f5, float f6, float f7, float f8, boolean z4, int i5, w wVar) {
        this((i5 & 1) != 0 ? Dp.m6044constructorimpl(0) : f5, (i5 & 2) != 0 ? Dp.m6044constructorimpl(0) : f6, (i5 & 4) != 0 ? Dp.m6044constructorimpl(0) : f7, (i5 & 8) != 0 ? Dp.m6044constructorimpl(0) : f8, z4, null);
    }
}

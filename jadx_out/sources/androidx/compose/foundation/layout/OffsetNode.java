package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/OffsetNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/unit/Dp;", "x", "F", "getX-D9Ej5fM", "()F", "setX-0680j_4", "(F)V", "y", "getY-D9Ej5fM", "setY-0680j_4", "", "rtlAware", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "<init>", "(FFZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;

    /* renamed from: x, reason: collision with root package name */
    private float f246x;

    /* renamed from: y, reason: collision with root package name */
    private float f247y;

    private OffsetNode(float f5, float f6, boolean z4) {
        this.f246x = f5;
        this.f247y = f6;
        this.rtlAware = z4;
    }

    public /* synthetic */ OffsetNode(float f5, float f6, boolean z4, w wVar) {
        this(f5, f6, z4);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m515getXD9Ej5fM() {
        return this.f246x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m516getYD9Ej5fM() {
        return this.f247y;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new OffsetNode$measure$1(this, mo4998measureBRTryo0, measureScope), 4, null);
    }

    public final void setRtlAware(boolean z4) {
        this.rtlAware = z4;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m517setX0680j_4(float f5) {
        this.f246x = f5;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m518setY0680j_4(float f5) {
        this.f247y = f5;
    }
}

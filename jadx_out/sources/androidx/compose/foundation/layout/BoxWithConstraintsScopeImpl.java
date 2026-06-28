package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\t\u0010\u0004\u001a\u00020\u0003HÂ\u0003J\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\r\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0097\u0001J\u0016\u0010\r\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0014\u0010\u000e\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR \u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u001a\u0010%\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010'\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b&\u0010 \u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Density;", "component1", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/Alignment;", "alignment", "align", "matchParentSize", "Landroidx/compose/ui/unit/Constraints;", "component2-msEJaDk", "()J", "component2", "density", "constraints", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/ui/unit/Density;", "J", "getConstraints-msEJaDk", "Landroidx/compose/ui/unit/Dp;", "getMinWidth-D9Ej5fM", "()F", "minWidth", "getMaxWidth-D9Ej5fM", "maxWidth", "getMinHeight-D9Ej5fM", "minHeight", "getMaxHeight-D9Ej5fM", "maxHeight", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: classes.dex */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;

    @l
    private final Density density;

    private BoxWithConstraintsScopeImpl(Density density, long j5) {
        this.density = density;
        this.constraints = j5;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density, long j5, w wVar) {
        this(density, j5);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m494copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            density = boxWithConstraintsScopeImpl.density;
        }
        if ((i5 & 2) != 0) {
            j5 = boxWithConstraintsScopeImpl.constraints;
        }
        return boxWithConstraintsScopeImpl.m496copy0kLqBqw(density, j5);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier align(@l Modifier modifier, @l Alignment alignment) {
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk, reason: not valid java name */
    public final long m495component2msEJaDk() {
        return this.constraints;
    }

    @l
    /* renamed from: copy-0kLqBqw, reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m496copy0kLqBqw(@l Density density, long j5) {
        return new BoxWithConstraintsScopeImpl(density, j5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        return l0.g(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m5993equalsimpl0(this.constraints, boxWithConstraintsScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getConstraints-msEJaDk */
    public long mo489getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo490getMaxHeightD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5995getHasBoundedHeightimpl(mo489getConstraintsmsEJaDk())) {
            return density.mo301toDpu2uoSUM(Constraints.m5999getMaxHeightimpl(mo489getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m6063getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo491getMaxWidthD9Ej5fM() {
        Density density = this.density;
        if (Constraints.m5996getHasBoundedWidthimpl(mo489getConstraintsmsEJaDk())) {
            return density.mo301toDpu2uoSUM(Constraints.m6000getMaxWidthimpl(mo489getConstraintsmsEJaDk()));
        }
        return Dp.Companion.m6063getInfinityD9Ej5fM();
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinHeight-D9Ej5fM */
    public float mo492getMinHeightD9Ej5fM() {
        return this.density.mo301toDpu2uoSUM(Constraints.m6001getMinHeightimpl(mo489getConstraintsmsEJaDk()));
    }

    @Override // androidx.compose.foundation.layout.BoxWithConstraintsScope
    /* renamed from: getMinWidth-D9Ej5fM */
    public float mo493getMinWidthD9Ej5fM() {
        return this.density.mo301toDpu2uoSUM(Constraints.m6002getMinWidthimpl(mo489getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m6003hashCodeimpl(this.constraints);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier matchParentSize(@l Modifier modifier) {
        return this.$$delegate_0.matchParentSize(modifier);
    }

    @l
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m6005toStringimpl(this.constraints)) + ')';
    }
}

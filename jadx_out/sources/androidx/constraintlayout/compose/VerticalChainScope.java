package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@LayoutScopeMarker
@Stable
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R,\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/VerticalChainScope;", "", "id", "Ljava/lang/Object;", "getId$compose_release", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "Lkotlin/r2;", "tasks", "Ljava/util/List;", "getTasks$compose_release", "()Ljava/util/List;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "getParent", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "top", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "getTop", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "bottom", "getBottom", "<init>", "(Ljava/lang/Object;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class VerticalChainScope {

    @l
    private final HorizontalAnchorable bottom;

    @l
    private final Object id;

    @l
    private final ConstrainedLayoutReference parent;

    @l
    private final List<v3.l<State, r2>> tasks;

    @l
    private final HorizontalAnchorable top;

    public VerticalChainScope(@l Object id) {
        l0.p(id, "id");
        this.id = id;
        ArrayList arrayList = new ArrayList();
        this.tasks = arrayList;
        Integer PARENT = androidx.constraintlayout.core.state.State.PARENT;
        l0.o(PARENT, "PARENT");
        this.parent = new ConstrainedLayoutReference(PARENT);
        this.top = new ChainHorizontalAnchorable(arrayList, id, 0);
        this.bottom = new ChainHorizontalAnchorable(arrayList, id, 1);
    }

    @l
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    @l
    public final Object getId$compose_release() {
        return this.id;
    }

    @l
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    @l
    public final List<v3.l<State, r2>> getTasks$compose_release() {
        return this.tasks;
    }

    @l
    public final HorizontalAnchorable getTop() {
        return this.top;
    }
}

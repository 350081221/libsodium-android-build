package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00110\u0010¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00070\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "Lkotlin/r2;", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "linkTo", "", "id", "Ljava/lang/Object;", "getId", "()Ljava/lang/Object;", "", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "tasks", "Ljava/util/List;", "getTasks", "()Ljava/util/List;", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstraintBaselineAnchorable implements BaselineAnchorable {

    @l
    private final Object id;

    @l
    private final List<v3.l<State, r2>> tasks;

    public ConstraintBaselineAnchorable(@l Object id, @l List<v3.l<State, r2>> tasks) {
        l0.p(id, "id");
        l0.p(tasks, "tasks");
        this.id = id;
        this.tasks = tasks;
    }

    @l
    public final Object getId() {
        return this.id;
    }

    @l
    public final List<v3.l<State, r2>> getTasks() {
        return this.tasks;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public void mo6301linkToVpY3zN4(@l ConstraintLayoutBaseScope.BaselineAnchor anchor, float f5, float f6) {
        l0.p(anchor, "anchor");
        this.tasks.add(new ConstraintBaselineAnchorable$linkTo$1(this, anchor, f5, f6));
    }
}

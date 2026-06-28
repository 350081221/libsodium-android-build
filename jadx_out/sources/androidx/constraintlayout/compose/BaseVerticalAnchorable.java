package androidx.constraintlayout.compose;

import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00100\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J+\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/ConstraintReference;", "getConstraintReference", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "anchor", "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "Lkotlin/r2;", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "linkTo", "", "Lkotlin/Function1;", "tasks", "Ljava/util/List;", "", "index", "I", "<init>", "(Ljava/util/List;I)V", "compose_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class BaseVerticalAnchorable implements VerticalAnchorable {
    private final int index;

    @l
    private final List<v3.l<State, r2>> tasks;

    public BaseVerticalAnchorable(@l List<v3.l<State, r2>> tasks, int i5) {
        l0.p(tasks, "tasks");
        this.tasks = tasks;
        this.index = i5;
    }

    @l
    public abstract ConstraintReference getConstraintReference(@l State state);

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo6300linkToVpY3zN4(@l ConstraintLayoutBaseScope.VerticalAnchor anchor, float f5, float f6) {
        l0.p(anchor, "anchor");
        this.tasks.add(new BaseVerticalAnchorable$linkTo$1(this, anchor, f5, f6));
    }
}

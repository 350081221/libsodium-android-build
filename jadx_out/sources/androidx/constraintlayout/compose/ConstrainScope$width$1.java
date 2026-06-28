package androidx.constraintlayout.compose;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstrainScope$width$1 extends n0 implements l<State, r2> {
    final /* synthetic */ Dimension $value;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainScope$width$1(ConstrainScope constrainScope, Dimension dimension) {
        super(1);
        this.this$0 = constrainScope;
        this.$value = dimension;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(State state) {
        invoke2(state);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l State state) {
        l0.p(state, "state");
        state.constraints(this.this$0.getId$compose_release()).width(((DimensionDescription) this.$value).toSolverDimension$compose_release(state));
    }
}

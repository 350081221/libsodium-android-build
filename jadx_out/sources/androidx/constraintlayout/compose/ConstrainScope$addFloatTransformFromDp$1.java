package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstrainScope$addFloatTransformFromDp$1 extends n0 implements l<State, r2> {
    final /* synthetic */ p<ConstraintReference, Float, r2> $change;
    final /* synthetic */ float $dpValue;
    final /* synthetic */ ConstrainScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstrainScope$addFloatTransformFromDp$1(p<? super ConstraintReference, ? super Float, r2> pVar, ConstrainScope constrainScope, float f5) {
        super(1);
        this.$change = pVar;
        this.this$0 = constrainScope;
        this.$dpValue = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(State state) {
        invoke2(state);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l State state) {
        l0.p(state, "state");
        if (state == null) {
            return;
        }
        p<ConstraintReference, Float, r2> pVar = this.$change;
        ConstrainScope constrainScope = this.this$0;
        float f5 = this.$dpValue;
        ConstraintReference constraints = state.constraints(constrainScope.getId$compose_release());
        l0.o(constraints, "state.constraints(id)");
        pVar.invoke(constraints, Float.valueOf(state.convertDimension(Dp.m6042boximpl(f5))));
    }
}

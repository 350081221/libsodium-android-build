package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstraintBaselineAnchorable$linkTo$1 extends n0 implements l<State, r2> {
    final /* synthetic */ ConstraintLayoutBaseScope.BaselineAnchor $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ ConstraintBaselineAnchorable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintBaselineAnchorable$linkTo$1(ConstraintBaselineAnchorable constraintBaselineAnchorable, ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f5, float f6) {
        super(1);
        this.this$0 = constraintBaselineAnchorable;
        this.$anchor = baselineAnchor;
        this.$margin = f5;
        this.$goneMargin = f6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(State state) {
        invoke2(state);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l State state) {
        l0.p(state, "state");
        if (state != null) {
            ConstraintBaselineAnchorable constraintBaselineAnchorable = this.this$0;
            ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor = this.$anchor;
            state.baselineNeededFor$compose_release(constraintBaselineAnchorable.getId());
            state.baselineNeededFor$compose_release(baselineAnchor.getId$compose_release());
        }
        ConstraintReference constraints = state.constraints(this.this$0.getId());
        ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor2 = this.$anchor;
        float f5 = this.$margin;
        float f6 = this.$goneMargin;
        p<ConstraintReference, Object, ConstraintReference> baselineAnchorFunction = AnchorFunctions.INSTANCE.getBaselineAnchorFunction();
        l0.o(constraints, "this");
        baselineAnchorFunction.invoke(constraints, baselineAnchor2.getId$compose_release()).margin(Dp.m6042boximpl(f5)).marginGone(Dp.m6042boximpl(f6));
    }
}

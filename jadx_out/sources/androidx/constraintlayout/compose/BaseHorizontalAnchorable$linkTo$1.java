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
final class BaseHorizontalAnchorable$linkTo$1 extends n0 implements l<State, r2> {
    final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseHorizontalAnchorable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHorizontalAnchorable$linkTo$1(BaseHorizontalAnchorable baseHorizontalAnchorable, ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f5, float f6) {
        super(1);
        this.this$0 = baseHorizontalAnchorable;
        this.$anchor = horizontalAnchor;
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
        int i5;
        l0.p(state, "state");
        ConstraintReference constraintReference = this.this$0.getConstraintReference(state);
        BaseHorizontalAnchorable baseHorizontalAnchorable = this.this$0;
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = this.$anchor;
        float f5 = this.$margin;
        float f6 = this.$goneMargin;
        p<ConstraintReference, Object, ConstraintReference>[][] horizontalAnchorFunctions = AnchorFunctions.INSTANCE.getHorizontalAnchorFunctions();
        i5 = baseHorizontalAnchorable.index;
        horizontalAnchorFunctions[i5][horizontalAnchor.getIndex$compose_release()].invoke(constraintReference, horizontalAnchor.getId$compose_release()).margin(Dp.m6042boximpl(f5)).marginGone(Dp.m6042boximpl(f6));
    }
}

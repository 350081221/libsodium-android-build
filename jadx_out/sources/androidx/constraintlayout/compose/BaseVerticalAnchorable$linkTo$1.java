package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class BaseVerticalAnchorable$linkTo$1 extends n0 implements l<State, r2> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $anchor;
    final /* synthetic */ float $goneMargin;
    final /* synthetic */ float $margin;
    final /* synthetic */ BaseVerticalAnchorable this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerticalAnchorable$linkTo$1(BaseVerticalAnchorable baseVerticalAnchorable, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f5, float f6) {
        super(1);
        this.this$0 = baseVerticalAnchorable;
        this.$anchor = verticalAnchor;
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
        LayoutDirection layoutDirection = state.getLayoutDirection();
        AnchorFunctions anchorFunctions = AnchorFunctions.INSTANCE;
        i5 = this.this$0.index;
        int verticalAnchorIndexToFunctionIndex = anchorFunctions.verticalAnchorIndexToFunctionIndex(i5, layoutDirection);
        int verticalAnchorIndexToFunctionIndex2 = anchorFunctions.verticalAnchorIndexToFunctionIndex(this.$anchor.getIndex$compose_release(), layoutDirection);
        anchorFunctions.getVerticalAnchorFunctions()[verticalAnchorIndexToFunctionIndex][verticalAnchorIndexToFunctionIndex2].invoke(this.this$0.getConstraintReference(state), this.$anchor.getId$compose_release(), state.getLayoutDirection()).margin(Dp.m6042boximpl(this.$margin)).marginGone(Dp.m6042boximpl(this.$goneMargin));
    }
}

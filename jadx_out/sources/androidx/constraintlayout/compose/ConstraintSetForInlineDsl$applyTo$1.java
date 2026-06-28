package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstraintSetForInlineDsl$applyTo$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ State $state;
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintSetForInlineDsl$applyTo$1(List<? extends Measurable> list, State state, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.$measurables = list;
        this.$state = state;
        this.this$0 = constraintSetForInlineDsl;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List list;
        List<Measurable> list2 = this.$measurables;
        State state = this.$state;
        ConstraintSetForInlineDsl constraintSetForInlineDsl = this.this$0;
        int size = list2.size() - 1;
        if (size < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            Object parentData = list2.get(i5).getParentData();
            ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null;
            if (constraintLayoutParentData != null) {
                ConstrainScope constrainScope = new ConstrainScope(constraintLayoutParentData.getRef().getId());
                constraintLayoutParentData.getConstrain().invoke(constrainScope);
                constrainScope.applyTo$compose_release(state);
            }
            list = constraintSetForInlineDsl.previousDatas;
            list.add(constraintLayoutParentData);
            if (i6 > size) {
                return;
            } else {
                i5 = i6;
            }
        }
    }
}

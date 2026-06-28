package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstrainScope$rotationX$1 extends n0 implements l<ConstraintReference, r2> {
    final /* synthetic */ float $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstrainScope$rotationX$1(float f5) {
        super(1);
        this.$value = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ConstraintReference constraintReference) {
        invoke2(constraintReference);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ConstraintReference addTransform) {
        l0.p(addTransform, "$this$addTransform");
        addTransform.rotationX(this.$value);
    }
}

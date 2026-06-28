package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "floatValue", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class ConstrainScope$translationZ$1 extends n0 implements p<ConstraintReference, Float, r2> {
    public static final ConstrainScope$translationZ$1 INSTANCE = new ConstrainScope$translationZ$1();

    ConstrainScope$translationZ$1() {
        super(2);
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(ConstraintReference constraintReference, Float f5) {
        invoke(constraintReference, f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(@l ConstraintReference addFloatTransformFromDp, float f5) {
        l0.p(addFloatTransformFromDp, "$this$addFloatTransformFromDp");
        addFloatTransformFromDp.translationZ(f5);
    }
}

package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class AnchorFunctions$horizontalAnchorFunctions$1 extends n0 implements p<ConstraintReference, Object, ConstraintReference> {
    public static final AnchorFunctions$horizontalAnchorFunctions$1 INSTANCE = new AnchorFunctions$horizontalAnchorFunctions$1();

    AnchorFunctions$horizontalAnchorFunctions$1() {
        super(2);
    }

    @Override // v3.p
    public final ConstraintReference invoke(@l ConstraintReference arrayOf, @l Object other) {
        l0.p(arrayOf, "$this$arrayOf");
        l0.p(other, "other");
        arrayOf.topToBottom(null);
        arrayOf.baselineToBaseline(null);
        ConstraintReference constraintReference = arrayOf.topToTop(other);
        l0.o(constraintReference, "topToTop(other)");
        return constraintReference;
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.state.ConstraintReference;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00000\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroidx/constraintlayout/core/state/ConstraintReference;", "", "other", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class AnchorFunctions$verticalAnchorFunctions$2 extends n0 implements q<ConstraintReference, Object, LayoutDirection, ConstraintReference> {
    public static final AnchorFunctions$verticalAnchorFunctions$2 INSTANCE = new AnchorFunctions$verticalAnchorFunctions$2();

    AnchorFunctions$verticalAnchorFunctions$2() {
        super(3);
    }

    @Override // v3.q
    public final ConstraintReference invoke(@l ConstraintReference arrayOf, @l Object other, @l LayoutDirection layoutDirection) {
        l0.p(arrayOf, "$this$arrayOf");
        l0.p(other, "other");
        l0.p(layoutDirection, "layoutDirection");
        AnchorFunctions.INSTANCE.clearLeft(arrayOf, layoutDirection);
        ConstraintReference leftToRight = arrayOf.leftToRight(other);
        l0.o(leftToRight, "leftToRight(other)");
        return leftToRight;
    }
}

package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "state", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class Dimension$Companion$value$1 extends n0 implements l<State, androidx.constraintlayout.core.state.Dimension> {
    final /* synthetic */ float $dp;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dimension$Companion$value$1(float f5) {
        super(1);
        this.$dp = f5;
    }

    @Override // v3.l
    @p4.l
    public final androidx.constraintlayout.core.state.Dimension invoke(@p4.l State state) {
        l0.p(state, "state");
        androidx.constraintlayout.core.state.Dimension Fixed = androidx.constraintlayout.core.state.Dimension.Fixed(state.convertDimension(Dp.m6042boximpl(this.$dp)));
        l0.o(Fixed, "Fixed(state.convertDimension(dp))");
        return Fixed;
    }
}

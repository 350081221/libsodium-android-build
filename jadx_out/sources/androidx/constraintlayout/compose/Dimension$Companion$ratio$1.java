package androidx.constraintlayout.compose;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/constraintlayout/compose/State;", "it", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class Dimension$Companion$ratio$1 extends n0 implements l<State, androidx.constraintlayout.core.state.Dimension> {
    final /* synthetic */ String $ratio;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dimension$Companion$ratio$1(String str) {
        super(1);
        this.$ratio = str;
    }

    @Override // v3.l
    @p4.l
    public final androidx.constraintlayout.core.state.Dimension invoke(@p4.l State it) {
        l0.p(it, "it");
        androidx.constraintlayout.core.state.Dimension suggested = androidx.constraintlayout.core.state.Dimension.Ratio(this.$ratio).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
        l0.o(suggested, "Ratio(ratio).suggested(SPREAD_DIMENSION)");
        return suggested;
    }
}

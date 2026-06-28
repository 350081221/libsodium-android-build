package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.math.d;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Constraints;", "it", "invoke-ZezNO4M", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends n0 implements l<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f5) {
        super(1);
        this.$headerHeightPx = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m5988boximpl(m1215invokeZezNO4M(constraints.m6006unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M, reason: not valid java name */
    public final long m1215invokeZezNO4M(long j5) {
        int L0;
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        L0 = d.L0(this.$headerHeightPx);
        return ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, 0, -L0, 1, null);
    }
}

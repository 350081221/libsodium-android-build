package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(D)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnapshotMutableDoubleStateImpl$component2$1 extends n0 implements l<Double, r2> {
    final /* synthetic */ SnapshotMutableDoubleStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableDoubleStateImpl$component2$1(SnapshotMutableDoubleStateImpl snapshotMutableDoubleStateImpl) {
        super(1);
        this.this$0 = snapshotMutableDoubleStateImpl;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Double d5) {
        invoke(d5.doubleValue());
        return r2.f19517a;
    }

    public final void invoke(double d5) {
        this.this$0.setDoubleValue(d5);
    }
}

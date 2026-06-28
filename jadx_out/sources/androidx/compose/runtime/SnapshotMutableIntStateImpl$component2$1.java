package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnapshotMutableIntStateImpl$component2$1 extends n0 implements l<Integer, r2> {
    final /* synthetic */ SnapshotMutableIntStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotMutableIntStateImpl$component2$1(SnapshotMutableIntStateImpl snapshotMutableIntStateImpl) {
        super(1);
        this.this$0 = snapshotMutableIntStateImpl;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Integer num) {
        invoke(num.intValue());
        return r2.f19517a;
    }

    public final void invoke(int i5) {
        this.this$0.setIntValue(i5);
    }
}

package androidx.compose.ui.platform;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GlobalSnapshotManager$ensureStarted$2 extends kotlin.jvm.internal.n0 implements v3.l<Object, r2> {
    final /* synthetic */ kotlinx.coroutines.channels.l<r2> $channel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(kotlinx.coroutines.channels.l<r2> lVar) {
        super(1);
        this.$channel = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke2(obj);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Object obj) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = GlobalSnapshotManager.sent;
        if (atomicBoolean.compareAndSet(false, true)) {
            this.$channel.p(r2.f19517a);
        }
    }
}

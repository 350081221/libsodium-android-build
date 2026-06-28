package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/Snapshot;", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotStateObserver$applyObserver$1 extends n0 implements p<Set<? extends Object>, Snapshot, r2> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.this$0 = snapshotStateObserver;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Set<? extends Object> set, Snapshot snapshot) {
        invoke2(set, snapshot);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@l Set<? extends Object> set, @l Snapshot snapshot) {
        boolean drainChanges;
        this.this$0.addChanges(set);
        drainChanges = this.this$0.drainChanges();
        if (drainChanges) {
            this.this$0.sendNotifications();
        }
    }
}

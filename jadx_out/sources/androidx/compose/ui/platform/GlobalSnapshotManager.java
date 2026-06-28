package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "Lkotlin/r2;", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sent", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GlobalSnapshotManager {

    @p4.l
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();

    @p4.l
    private static final AtomicBoolean started = new AtomicBoolean(false);

    @p4.l
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(1, null, null, 6, null);
            kotlinx.coroutines.k.f(kotlinx.coroutines.t0.a(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(d5, null), 3, null);
            Snapshot.Companion.registerGlobalWriteObserver(new GlobalSnapshotManager$ensureStarted$2(d5));
        }
    }
}

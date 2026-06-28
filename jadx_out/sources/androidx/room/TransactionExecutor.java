package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "Lkotlin/r2;", "execute", "scheduleNext", "executor", "Ljava/util/concurrent/Executor;", "Ljava/util/ArrayDeque;", "tasks", "Ljava/util/ArrayDeque;", "active", "Ljava/lang/Runnable;", "", "syncLock", "Ljava/lang/Object;", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
/* loaded from: classes2.dex */
public final class TransactionExecutor implements Executor {

    @p4.m
    private Runnable active;

    @p4.l
    private final Executor executor;

    @p4.l
    private final Object syncLock;

    @p4.l
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(@p4.l Executor executor) {
        l0.p(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable command, TransactionExecutor this$0) {
        l0.p(command, "$command");
        l0.p(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@p4.l final Runnable command) {
        l0.p(command, "command");
        synchronized (this.syncLock) {
            this.tasks.offer(new Runnable() { // from class: androidx.room.a0
                @Override // java.lang.Runnable
                public final void run() {
                    TransactionExecutor.execute$lambda$1$lambda$0(command, this);
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            Runnable poll = this.tasks.poll();
            Runnable runnable = poll;
            this.active = runnable;
            if (poll != null) {
                this.executor.execute(runnable);
            }
            r2 r2Var = r2.f19517a;
        }
    }
}

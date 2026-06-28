package okhttp3.internal.concurrent;

import com.lody.virtual.server.content.SyncStorageEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import okhttp3.internal.Util;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001:B\u0019\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086\bø\u0001\u0000J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006J\u000f\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\bH\u0016R\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00102\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010&R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "Lkotlin/r2;", "schedule", "", "name", "Lkotlin/Function0;", "block", "", "cancelable", "execute", "Ljava/util/concurrent/CountDownLatch;", "idleLatch", "recurrence", "scheduleAndDecide$okhttp", "(Lokhttp3/internal/concurrent/Task;JZ)Z", "scheduleAndDecide", "cancelAll", "shutdown", "cancelAllAndDecide$okhttp", "()Z", "cancelAllAndDecide", "toString", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/lang/String;", "getName$okhttp", "()Ljava/lang/String;", "Z", "getShutdown$okhttp", "setShutdown$okhttp", "(Z)V", "activeTask", "Lokhttp3/internal/concurrent/Task;", "getActiveTask$okhttp", "()Lokhttp3/internal/concurrent/Task;", "setActiveTask$okhttp", "(Lokhttp3/internal/concurrent/Task;)V", "", "futureTasks", "Ljava/util/List;", "getFutureTasks$okhttp", "()Ljava/util/List;", "cancelActiveTask", "getCancelActiveTask$okhttp", "setCancelActiveTask$okhttp", "", "getScheduledTasks", "scheduledTasks", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskQueue {

    @m
    private Task activeTask;
    private boolean cancelActiveTask;

    @l
    private final List<Task> futureTasks;

    @l
    private final String name;
    private boolean shutdown;

    @l
    private final TaskRunner taskRunner;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "()V", "latch", "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class AwaitIdleTask extends Task {

        @l
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(Util.okHttpName + " awaitIdle", false);
            this.latch = new CountDownLatch(1);
        }

        @l
        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    public TaskQueue(@l TaskRunner taskRunner, @l String name) {
        l0.p(taskRunner, "taskRunner");
        l0.p(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String name, long j5, boolean z4, a block, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        l0.p(name, "name");
        l0.p(block, "block");
        taskQueue.schedule(new TaskQueue$execute$1(name, z4, block), j5);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        taskQueue.schedule(task, j5);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            l0.m(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z4 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task2, this, SyncStorageEngine.MESG_CANCELED);
                }
                this.futureTasks.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void execute(@l String name, long j5, boolean z4, @l a<r2> block) {
        l0.p(name, "name");
        l0.p(block, "block");
        schedule(new TaskQueue$execute$1(name, z4, block), j5);
    }

    @m
    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    @l
    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    @l
    public final String getName$okhttp() {
        return this.name;
    }

    @l
    public final List<Task> getScheduledTasks() {
        List<Task> S5;
        synchronized (this.taskRunner) {
            S5 = e0.S5(this.futureTasks);
        }
        return S5;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    @l
    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    @l
    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) task).getLatch();
            }
            for (Task task2 : this.futureTasks) {
                if (task2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task2).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(@l Task task, long j5) {
        l0.p(task, "task");
        synchronized (this.taskRunner) {
            if (this.shutdown) {
                if (task.getCancelable()) {
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (scheduleAndDecide$okhttp(task, j5, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public final boolean scheduleAndDecide$okhttp(@l Task task, long j5, boolean z4) {
        boolean z5;
        String str;
        l0.p(task, "task");
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j6 = nanoTime + j5;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j6) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j6);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z4) {
                str = "run again after " + TaskLoggerKt.formatDuration(j6 - nanoTime);
            } else {
                str = "scheduled after " + TaskLoggerKt.formatDuration(j6 - nanoTime);
            }
            TaskLoggerKt.access$log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int i5 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getNextExecuteNanoTime$okhttp() - nanoTime > j5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    break;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 == -1) {
            i5 = this.futureTasks.size();
        }
        this.futureTasks.add(i5, task);
        if (i5 != 0) {
            return false;
        }
        return true;
    }

    public final void setActiveTask$okhttp(@m Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z4) {
        this.cancelActiveTask = z4;
    }

    public final void setShutdown$okhttp(boolean z4) {
        this.shutdown = z4;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            r2 r2Var = r2.f19517a;
        }
    }

    @l
    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String name, long j5, a block, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = 0;
        }
        l0.p(name, "name");
        l0.p(block, "block");
        taskQueue.schedule(new TaskQueue$schedule$2(name, block), j5);
    }

    public final void schedule(@l String name, long j5, @l a<Long> block) {
        l0.p(name, "name");
        l0.p(block, "block");
        schedule(new TaskQueue$schedule$2(name, block), j5);
    }
}

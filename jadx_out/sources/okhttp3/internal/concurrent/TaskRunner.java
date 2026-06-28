package okhttp3.internal.concurrent;

import androidx.compose.animation.core.AnimationKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import okhttp3.internal.Util;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0003+*,B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0010\u001a\u00020\nJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u0006\u0010\u0013\u001a\u00020\u0004R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/Task;", "task", "Lkotlin/r2;", "beforeRun", "runTask", "", "delayNanos", "afterRun", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "kickCoordinator$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "kickCoordinator", "awaitTaskToRun", "newQueue", "", "activeQueues", "cancelAll", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "nextQueueName", "I", "", "coordinatorWaiting", "Z", "coordinatorWakeUpAt", "J", "", "busyQueues", "Ljava/util/List;", "readyQueues", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Runnable;", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "Companion", "Backend", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
/* loaded from: classes4.dex */
public final class TaskRunner {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(Util.okHttpName + " TaskRunner", true)));

    @l
    private static final Logger logger;

    @l
    private final Backend backend;

    @l
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;

    @l
    private final List<TaskQueue> readyQueues;

    @l
    private final Runnable runnable;

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lkotlin/r2;", "beforeTask", "", "nanoTime", "coordinatorNotify", "nanos", "coordinatorWait", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public interface Backend {
        void beforeTask(@l TaskRunner taskRunner);

        void coordinatorNotify(@l TaskRunner taskRunner);

        void coordinatorWait(@l TaskRunner taskRunner, long j5);

        void execute(@l Runnable runnable);

        long nanoTime();
    }

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "()V", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lkotlin/r2;", "beforeTask", "", "nanoTime", "coordinatorNotify", "nanos", "coordinatorWait", "Ljava/lang/Runnable;", "runnable", "execute", "shutdown", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class RealBackend implements Backend {

        @l
        private final ThreadPoolExecutor executor;

        public RealBackend(@l ThreadFactory threadFactory) {
            l0.p(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(@l TaskRunner taskRunner) {
            l0.p(taskRunner, "taskRunner");
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@l TaskRunner taskRunner) {
            l0.p(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@l TaskRunner taskRunner, long j5) throws InterruptedException {
            l0.p(taskRunner, "taskRunner");
            long j6 = j5 / AnimationKt.MillisToNanos;
            long j7 = j5 - (AnimationKt.MillisToNanos * j6);
            if (j6 > 0 || j5 > 0) {
                taskRunner.wait(j6, (int) j7);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@l Runnable runnable) {
            l0.p(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        l0.o(logger2, "getLogger(TaskRunner::class.java.name)");
        logger = logger2;
    }

    public TaskRunner(@l Backend backend) {
        l0.p(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task awaitTaskToRun;
                long j5;
                while (true) {
                    TaskRunner taskRunner = TaskRunner.this;
                    synchronized (taskRunner) {
                        awaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (awaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue$okhttp = awaitTaskToRun.getQueue$okhttp();
                    l0.m(queue$okhttp);
                    TaskRunner taskRunner2 = TaskRunner.this;
                    boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j5 = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "starting");
                    } else {
                        j5 = -1;
                    }
                    try {
                        try {
                            taskRunner2.runTask(awaitTaskToRun);
                            r2 r2Var = r2.f19517a;
                            if (isLoggable) {
                                TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j5));
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            TaskLoggerKt.access$log(awaitTaskToRun, queue$okhttp, "failed a run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j5));
                        }
                        throw th;
                    }
                }
            }
        };
    }

    private final void afterRun(Task task, long j5) {
        boolean z4;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        l0.m(queue$okhttp);
        if (queue$okhttp.getActiveTask$okhttp() == task) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
            queue$okhttp.setCancelActiveTask$okhttp(false);
            queue$okhttp.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue$okhttp);
            if (j5 != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
                queue$okhttp.scheduleAndDecide$okhttp(task, j5, true);
            }
            if (!queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.add(queue$okhttp);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void beforeRun(Task task) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        l0.m(queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(task);
        this.busyQueues.add(queue$okhttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(Task task) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(task.getName());
        try {
            long runOnce = task.runOnce();
            synchronized (this) {
                afterRun(task, runOnce);
                r2 r2Var = r2.f19517a;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                afterRun(task, -1L);
                r2 r2Var2 = r2.f19517a;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    @l
    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> A4;
        synchronized (this) {
            A4 = e0.A4(this.busyQueues, this.readyQueues);
        }
        return A4;
    }

    @m
    public final Task awaitTaskToRun() {
        boolean z4;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long j5 = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (it.hasNext()) {
                    Task task2 = it.next().getFutureTasks$okhttp().get(0);
                    long max = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - nanoTime);
                    if (max > 0) {
                        j5 = Math.min(max, j5);
                    } else {
                        if (task != null) {
                            z4 = true;
                            break;
                        }
                        task = task2;
                    }
                } else {
                    z4 = false;
                    break;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z4 || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                    this.backend.execute(this.runnable);
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (j5 < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = nanoTime + j5;
            try {
                try {
                    this.backend.coordinatorWait(this, j5);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void cancelAll() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    @l
    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(@l TaskQueue taskQueue) {
        l0.p(taskQueue, "taskQueue");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                Util.addIfAbsent(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    @l
    public final TaskQueue newQueue() {
        int i5;
        synchronized (this) {
            i5 = this.nextQueueName;
            this.nextQueueName = i5 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i5);
        return new TaskQueue(this, sb.toString());
    }
}

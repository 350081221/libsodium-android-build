package okhttp3.internal.concurrent;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\"\u0010\u0019\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", "runOnce", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/r2;", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "", "toString", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "cancelable", "Z", "getCancelable", "()Z", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes4.dex */
public abstract class Task {
    private final boolean cancelable;

    @l
    private final String name;
    private long nextExecuteNanoTime;

    @m
    private TaskQueue queue;

    public Task(@l String name, boolean z4) {
        l0.p(name, "name");
        this.name = name;
        this.cancelable = z4;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    @m
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(@l TaskQueue queue) {
        boolean z4;
        l0.p(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.queue = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j5) {
        this.nextExecuteNanoTime = j5;
    }

    public final void setQueue$okhttp(@m TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @l
    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z4, int i5, w wVar) {
        this(str, (i5 & 2) != 0 ? true : z4);
    }
}

package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\fH\u0014J%\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "access$newTimeoutException", "Ljava/io/IOException;", "cause", "enter", "", com.alipay.sdk.m.x.d.f3034z, "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "withTimeout", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class j extends p1 {

    @p4.l
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @p4.l
    private static final Condition condition;

    @p4.m
    private static j head;

    @p4.l
    private static final ReentrantLock lock;
    private boolean inQueue;

    @p4.m
    private j next;
    private long timeoutAt;

    @kotlin.i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "()V", "IDLE_TIMEOUT_MILLIS", "", "IDLE_TIMEOUT_NANOS", "TIMEOUT_WRITE_SIZE", "", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "head", "Lokio/AsyncTimeout;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "awaitTimeout", "awaitTimeout$okio", "cancelScheduledTimeout", "", "node", "scheduleTimeout", "", "timeoutNanos", "hasDeadline", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1#2:332\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(j jVar) {
            ReentrantLock f5 = j.Companion.f();
            f5.lock();
            try {
                if (!jVar.inQueue) {
                    return false;
                }
                jVar.inQueue = false;
                for (j jVar2 = j.head; jVar2 != null; jVar2 = jVar2.next) {
                    if (jVar2.next == jVar) {
                        jVar2.next = jVar.next;
                        jVar.next = null;
                        return false;
                    }
                }
                f5.unlock();
                return true;
            } finally {
                f5.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(j jVar, long j5, boolean z4) {
            ReentrantLock f5 = j.Companion.f();
            f5.lock();
            try {
                if (!jVar.inQueue) {
                    jVar.inQueue = true;
                    if (j.head == null) {
                        j.head = new j();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j5 != 0 && z4) {
                        jVar.timeoutAt = Math.min(j5, jVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j5 != 0) {
                        jVar.timeoutAt = j5 + nanoTime;
                    } else if (z4) {
                        jVar.timeoutAt = jVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = jVar.remainingNanos(nanoTime);
                    j jVar2 = j.head;
                    kotlin.jvm.internal.l0.m(jVar2);
                    while (jVar2.next != null) {
                        j jVar3 = jVar2.next;
                        kotlin.jvm.internal.l0.m(jVar3);
                        if (remainingNanos < jVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        jVar2 = jVar2.next;
                        kotlin.jvm.internal.l0.m(jVar2);
                    }
                    jVar.next = jVar2.next;
                    jVar2.next = jVar;
                    if (jVar2 == j.head) {
                        j.Companion.e().signal();
                    }
                    r2 r2Var = r2.f19517a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                f5.unlock();
            }
        }

        @p4.m
        public final j c() throws InterruptedException {
            j jVar = j.head;
            kotlin.jvm.internal.l0.m(jVar);
            j jVar2 = jVar.next;
            if (jVar2 == null) {
                long nanoTime = System.nanoTime();
                e().await(j.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                j jVar3 = j.head;
                kotlin.jvm.internal.l0.m(jVar3);
                if (jVar3.next != null || System.nanoTime() - nanoTime < j.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return j.head;
            }
            long remainingNanos = jVar2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                e().await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            j jVar4 = j.head;
            kotlin.jvm.internal.l0.m(jVar4);
            jVar4.next = jVar2.next;
            jVar2.next = null;
            return jVar2;
        }

        @p4.l
        public final Condition e() {
            return j.condition;
        }

        @p4.l
        public final ReentrantLock f() {
            return j.lock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "()V", "run", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f5;
            j c5;
            while (true) {
                try {
                    a aVar = j.Companion;
                    f5 = aVar.f();
                    f5.lock();
                    try {
                        c5 = aVar.c();
                    } finally {
                        f5.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c5 == j.head) {
                    j.head = null;
                    return;
                }
                r2 r2Var = r2.f19517a;
                f5.unlock();
                if (c5 != null) {
                    c5.timedOut();
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"okio/AsyncTimeout$sink$1", "Lokio/Sink;", ILivePush.ClickType.CLOSE, "", "flush", m0.a.Z, "Lokio/AsyncTimeout;", "toString", "", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n146#2,11:354\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$sink$1\n*L\n102#1:332,11\n108#1:343,11\n112#1:354,11\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c implements l1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l1 f20979b;

        c(l1 l1Var) {
            this.f20979b = l1Var;
        }

        @Override // okio.l1
        @p4.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            j jVar = j.this;
            l1 l1Var = this.f20979b;
            jVar.enter();
            try {
                l1Var.close();
                r2 r2Var = r2.f19517a;
                if (!jVar.exit()) {
                } else {
                    throw jVar.access$newTimeoutException(null);
                }
            } catch (IOException e5) {
                if (!jVar.exit()) {
                    throw e5;
                }
                throw jVar.access$newTimeoutException(e5);
            } finally {
                jVar.exit();
            }
        }

        @Override // okio.l1, java.io.Flushable
        public void flush() {
            j jVar = j.this;
            l1 l1Var = this.f20979b;
            jVar.enter();
            try {
                l1Var.flush();
                r2 r2Var = r2.f19517a;
                if (!jVar.exit()) {
                } else {
                    throw jVar.access$newTimeoutException(null);
                }
            } catch (IOException e5) {
                if (!jVar.exit()) {
                    throw e5;
                }
                throw jVar.access$newTimeoutException(e5);
            } finally {
                jVar.exit();
            }
        }

        @p4.l
        public String toString() {
            return "AsyncTimeout.sink(" + this.f20979b + ')';
        }

        @Override // okio.l1
        public void write(@p4.l l source, long j5) {
            kotlin.jvm.internal.l0.p(source, "source");
            i.e(source.M0(), 0L, j5);
            while (true) {
                long j6 = 0;
                if (j5 > 0) {
                    i1 i1Var = source.f20987a;
                    kotlin.jvm.internal.l0.m(i1Var);
                    while (true) {
                        if (j6 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                            break;
                        }
                        j6 += i1Var.f20930c - i1Var.f20929b;
                        if (j6 >= j5) {
                            j6 = j5;
                            break;
                        } else {
                            i1Var = i1Var.f20933f;
                            kotlin.jvm.internal.l0.m(i1Var);
                        }
                    }
                    j jVar = j.this;
                    l1 l1Var = this.f20979b;
                    jVar.enter();
                    try {
                        l1Var.write(source, j6);
                        r2 r2Var = r2.f19517a;
                        if (!jVar.exit()) {
                            j5 -= j6;
                        } else {
                            throw jVar.access$newTimeoutException(null);
                        }
                    } catch (IOException e5) {
                        if (!jVar.exit()) {
                            throw e5;
                        }
                        throw jVar.access$newTimeoutException(e5);
                    } finally {
                        jVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"okio/AsyncTimeout$source$1", "Lokio/Source;", ILivePush.ClickType.CLOSE, "", "read", "", "sink", "Lokio/Buffer;", "byteCount", m0.a.Z, "Lokio/AsyncTimeout;", "toString", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n+ 2 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,331:1\n146#2,11:332\n146#2,11:343\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/AsyncTimeout$source$1\n*L\n128#1:332,11\n132#1:343,11\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d implements n1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1 f20981b;

        d(n1 n1Var) {
            this.f20981b = n1Var;
        }

        @Override // okio.n1
        @p4.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j timeout() {
            return j.this;
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            j jVar = j.this;
            n1 n1Var = this.f20981b;
            jVar.enter();
            try {
                n1Var.close();
                r2 r2Var = r2.f19517a;
                if (!jVar.exit()) {
                } else {
                    throw jVar.access$newTimeoutException(null);
                }
            } catch (IOException e5) {
                if (!jVar.exit()) {
                    throw e5;
                }
                throw jVar.access$newTimeoutException(e5);
            } finally {
                jVar.exit();
            }
        }

        @Override // okio.n1
        public long read(@p4.l l sink, long j5) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            j jVar = j.this;
            n1 n1Var = this.f20981b;
            jVar.enter();
            try {
                long read = n1Var.read(sink, j5);
                if (!jVar.exit()) {
                    return read;
                }
                throw jVar.access$newTimeoutException(null);
            } catch (IOException e5) {
                if (!jVar.exit()) {
                    throw e5;
                }
                throw jVar.access$newTimeoutException(e5);
            } finally {
                jVar.exit();
            }
        }

        @p4.l
        public String toString() {
            return "AsyncTimeout.source(" + this.f20981b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l0.o(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j5) {
        return this.timeoutAt - j5;
    }

    @p4.l
    @kotlin.a1
    public final IOException access$newTimeoutException(@p4.m IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        Companion.g(this, timeoutNanos, hasDeadline);
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    @p4.l
    protected IOException newTimeoutException(@p4.m IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(m0.a.Z);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @p4.l
    public final l1 sink(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return new c(sink);
    }

    @p4.l
    public final n1 source(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        return new d(source);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(@p4.l v3.a<? extends T> block) {
        kotlin.jvm.internal.l0.p(block, "block");
        enter();
        try {
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.i0.d(1);
                if (!exit()) {
                    kotlin.jvm.internal.i0.c(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e5) {
                if (!exit()) {
                    throw e5;
                }
                throw access$newTimeoutException(e5);
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.i0.d(1);
            exit();
            kotlin.jvm.internal.i0.c(1);
            throw th;
        }
    }
}

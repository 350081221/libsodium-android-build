package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u0014J\r\u0010\u001f\u001a\u00020\u0014H\u0007¢\u0006\u0002\b,J\r\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\b-J&\u0010.\u001a\u00020**\u00020\u00142\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020*00¢\u0006\u0002\b1H\u0082\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u0013\u0010#\u001a\u00020$8G¢\u0006\b\n\u0000\u001a\u0004\b#\u0010%R\u001a\u0010&\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000e¨\u00062"}, d2 = {"Lokio/Pipe;", "", "maxBufferSize", "", "(J)V", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", SyncStorageEngine.MESG_CANCELED, "", "getCanceled$okio", "()Z", "setCanceled$okio", "(Z)V", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "()Lokio/Sink;", "setFoldedSink$okio", "(Lokio/Sink;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getMaxBufferSize$okio", "()J", "sink", "sinkClosed", "getSinkClosed$okio", "setSinkClosed$okio", "source", "Lokio/Source;", "()Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "cancel", "", "fold", "-deprecated_sink", "-deprecated_source", "forward", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n268#3,26:259\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe\n*L\n217#1:259,26\n*E\n"})
/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f20892a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final l f20893b = new l();

    /* renamed from: c, reason: collision with root package name */
    private boolean f20894c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20895d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20896e;

    /* renamed from: f, reason: collision with root package name */
    @p4.m
    private l1 f20897f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final ReentrantLock f20898g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final Condition f20899h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final l1 f20900i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final n1 f20901j;

    @kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"okio/Pipe$sink$1", "Lokio/Sink;", m0.a.Z, "Lokio/Timeout;", ILivePush.ClickType.CLOSE, "", "flush", "write", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Pipe.kt\nokio/Pipe\n+ 4 Timeout.kt\nokio/Timeout\n*L\n1#1,257:1\n1#2:258\n217#3:259\n218#3:286\n217#3:287\n218#3:314\n217#3:315\n218#3:342\n268#4,26:260\n268#4,26:288\n268#4,26:316\n*S KotlinDebug\n*F\n+ 1 Pipe.kt\nokio/Pipe$sink$1\n*L\n87#1:259\n87#1:286\n106#1:287\n106#1:314\n124#1:315\n124#1:342\n87#1:260,26\n106#1:288,26\n124#1:316,26\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements l1 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final p1 f20902a = new p1();

        a() {
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j5 = f1.this.j();
            f1 f1Var = f1.this;
            j5.lock();
            try {
                if (f1Var.l()) {
                    return;
                }
                l1 i5 = f1Var.i();
                if (i5 == null) {
                    if (f1Var.m() && f1Var.f().M0() > 0) {
                        throw new IOException("source is closed");
                    }
                    f1Var.p(true);
                    f1Var.h().signalAll();
                    i5 = null;
                }
                r2 r2Var = r2.f19517a;
                if (i5 != null) {
                    f1 f1Var2 = f1.this;
                    p1 timeout = i5.timeout();
                    p1 timeout2 = f1Var2.r().timeout();
                    long timeoutNanos = timeout.timeoutNanos();
                    long a5 = p1.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a5, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            i5.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th;
                        }
                    }
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                    }
                    try {
                        i5.close();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } finally {
                j5.unlock();
            }
        }

        @Override // okio.l1, java.io.Flushable
        public void flush() {
            ReentrantLock j5 = f1.this.j();
            f1 f1Var = f1.this;
            j5.lock();
            try {
                if (!f1Var.l()) {
                    if (!f1Var.g()) {
                        l1 i5 = f1Var.i();
                        if (i5 == null) {
                            if (f1Var.m() && f1Var.f().M0() > 0) {
                                throw new IOException("source is closed");
                            }
                            i5 = null;
                        }
                        r2 r2Var = r2.f19517a;
                        if (i5 != null) {
                            f1 f1Var2 = f1.this;
                            p1 timeout = i5.timeout();
                            p1 timeout2 = f1Var2.r().timeout();
                            long timeoutNanos = timeout.timeoutNanos();
                            long a5 = p1.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeout.timeout(a5, timeUnit);
                            if (timeout.hasDeadline()) {
                                long deadlineNanoTime = timeout.deadlineNanoTime();
                                if (timeout2.hasDeadline()) {
                                    timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                                }
                                try {
                                    i5.flush();
                                    timeout.timeout(timeoutNanos, timeUnit);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                    if (timeout2.hasDeadline()) {
                                        timeout.deadlineNanoTime(deadlineNanoTime);
                                    }
                                    throw th;
                                }
                            }
                            if (timeout2.hasDeadline()) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                i5.flush();
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.hasDeadline()) {
                                    timeout.clearDeadline();
                                }
                                throw th2;
                            }
                        }
                        return;
                    }
                    throw new IOException(SyncStorageEngine.MESG_CANCELED);
                }
                throw new IllegalStateException("closed".toString());
            } finally {
                j5.unlock();
            }
        }

        @Override // okio.l1
        @p4.l
        public p1 timeout() {
            return this.f20902a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        
            r1 = kotlin.r2.f19517a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
        
            if (r2 == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
        
            r0 = r12.f20903b;
            r1 = r2.timeout();
            r0 = r0.r().timeout();
            r3 = r1.timeoutNanos();
            r5 = okio.p1.Companion.a(r0.timeoutNanos(), r1.timeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.timeout(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
        
            if (r1.hasDeadline() == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        
            r5 = r1.deadlineNanoTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
        
            if (r0.hasDeadline() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        
            r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
        
            if (r0.hasDeadline() == false) goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        
            if (r0.hasDeadline() != false) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        
            if (r0.hasDeadline() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
        
            r1.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00f9, code lost:
        
            if (r0.hasDeadline() == false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00fb, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0109, code lost:
        
            if (r0.hasDeadline() != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x010b, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010e, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
        
            return;
         */
        @Override // okio.l1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void write(@p4.l okio.l r13, long r14) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.f1.a.write(okio.l, long):void");
        }
    }

    @kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"okio/Pipe$source$1", "Lokio/Source;", m0.a.Z, "Lokio/Timeout;", ILivePush.ClickType.CLOSE, "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nPipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipe.kt\nokio/Pipe$source$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b implements n1 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final p1 f20904a = new p1();

        b() {
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            ReentrantLock j5 = f1.this.j();
            f1 f1Var = f1.this;
            j5.lock();
            try {
                f1Var.q(true);
                f1Var.h().signalAll();
                r2 r2Var = r2.f19517a;
            } finally {
                j5.unlock();
            }
        }

        @Override // okio.n1
        public long read(@p4.l l sink, long j5) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            ReentrantLock j6 = f1.this.j();
            f1 f1Var = f1.this;
            j6.lock();
            try {
                if (!f1Var.m()) {
                    if (!f1Var.g()) {
                        while (f1Var.f().M0() == 0) {
                            if (f1Var.l()) {
                                j6.unlock();
                                return -1L;
                            }
                            this.f20904a.awaitSignal(f1Var.h());
                            if (f1Var.g()) {
                                throw new IOException(SyncStorageEngine.MESG_CANCELED);
                            }
                        }
                        long read = f1Var.f().read(sink, j5);
                        f1Var.h().signalAll();
                        return read;
                    }
                    throw new IOException(SyncStorageEngine.MESG_CANCELED);
                }
                throw new IllegalStateException("closed".toString());
            } finally {
                j6.unlock();
            }
        }

        @Override // okio.n1
        @p4.l
        public p1 timeout() {
            return this.f20904a;
        }
    }

    public f1(long j5) {
        boolean z4;
        this.f20892a = j5;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f20898g = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l0.o(newCondition, "newCondition(...)");
        this.f20899h = newCondition;
        if (j5 >= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f20900i = new a();
            this.f20901j = new b();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j5).toString());
        }
    }

    private final void e(l1 l1Var, v3.l<? super l1, r2> lVar) {
        p1 timeout = l1Var.timeout();
        p1 timeout2 = r().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long a5 = p1.Companion.a(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(a5, timeUnit);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                lVar.invoke(l1Var);
                r2 r2Var = r2.f19517a;
                kotlin.jvm.internal.i0.d(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.i0.c(1);
                return;
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
        }
        try {
            lVar.invoke(l1Var);
            r2 r2Var2 = r2.f19517a;
            kotlin.jvm.internal.i0.d(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            kotlin.jvm.internal.i0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.i0.d(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.clearDeadline();
            }
            kotlin.jvm.internal.i0.c(1);
            throw th2;
        }
    }

    @p4.l
    @u3.h(name = "-deprecated_sink")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "sink", imports = {}))
    public final l1 a() {
        return this.f20900i;
    }

    @p4.l
    @u3.h(name = "-deprecated_source")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "source", imports = {}))
    public final n1 b() {
        return this.f20901j;
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f20898g;
        reentrantLock.lock();
        try {
            this.f20894c = true;
            this.f20893b.c();
            this.f20899h.signalAll();
            r2 r2Var = r2.f19517a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(@p4.l l1 sink) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        while (true) {
            this.f20898g.lock();
            try {
                if (this.f20897f == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (!this.f20894c) {
                        if (this.f20893b.e0()) {
                            this.f20896e = true;
                            this.f20897f = sink;
                            return;
                        }
                        boolean z5 = this.f20895d;
                        l lVar = new l();
                        l lVar2 = this.f20893b;
                        lVar.write(lVar2, lVar2.M0());
                        this.f20899h.signalAll();
                        r2 r2Var = r2.f19517a;
                        try {
                            sink.write(lVar, lVar.M0());
                            if (z5) {
                                sink.close();
                            } else {
                                sink.flush();
                            }
                        } catch (Throwable th) {
                            this.f20898g.lock();
                            try {
                                this.f20896e = true;
                                this.f20899h.signalAll();
                                r2 r2Var2 = r2.f19517a;
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        this.f20897f = sink;
                        throw new IOException(SyncStorageEngine.MESG_CANCELED);
                    }
                } else {
                    throw new IllegalStateException("sink already folded".toString());
                }
            } finally {
            }
        }
    }

    @p4.l
    public final l f() {
        return this.f20893b;
    }

    public final boolean g() {
        return this.f20894c;
    }

    @p4.l
    public final Condition h() {
        return this.f20899h;
    }

    @p4.m
    public final l1 i() {
        return this.f20897f;
    }

    @p4.l
    public final ReentrantLock j() {
        return this.f20898g;
    }

    public final long k() {
        return this.f20892a;
    }

    public final boolean l() {
        return this.f20895d;
    }

    public final boolean m() {
        return this.f20896e;
    }

    public final void n(boolean z4) {
        this.f20894c = z4;
    }

    public final void o(@p4.m l1 l1Var) {
        this.f20897f = l1Var;
    }

    public final void p(boolean z4) {
        this.f20895d = z4;
    }

    public final void q(boolean z4) {
        this.f20896e = z4;
    }

    @p4.l
    @u3.h(name = "sink")
    public final l1 r() {
        return this.f20900i;
    }

    @p4.l
    @u3.h(name = "source")
    public final n1 s() {
        return this.f20901j;
    }
}

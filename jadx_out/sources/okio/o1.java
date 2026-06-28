package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J$\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001bJ\f\u0010\u001c\u001a\u00020\u0004*\u00020\u0004H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokio/Throttler;", "", "()V", "allocatedUntil", "", "(J)V", "bytesPerSecond", "condition", "Ljava/util/concurrent/locks/Condition;", "getCondition", "()Ljava/util/concurrent/locks/Condition;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "maxByteCount", "waitByteCount", "byteCountOrWaitNanos", "now", "byteCount", "byteCountOrWaitNanos$okio", "", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "take", "take$okio", "bytesToNanos", "nanosToBytes", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    private long f21003a;

    /* renamed from: b, reason: collision with root package name */
    private long f21004b;

    /* renamed from: c, reason: collision with root package name */
    private long f21005c;

    /* renamed from: d, reason: collision with root package name */
    private long f21006d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final ReentrantLock f21007e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final Condition f21008f;

    @kotlin.i0(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"okio/Throttler$sink$1", "Lokio/ForwardingSink;", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1 f21009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l1 l1Var, o1 o1Var) {
            super(l1Var);
            this.f21009a = o1Var;
        }

        @Override // okio.w, okio.l1
        public void write(@p4.l l source, long j5) throws IOException {
            kotlin.jvm.internal.l0.p(source, "source");
            while (j5 > 0) {
                try {
                    long l5 = this.f21009a.l(j5);
                    super.write(source, l5);
                    j5 -= l5;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"okio/Throttler$source$1", "Lokio/ForwardingSource;", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends x {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o1 f21010a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n1 n1Var, o1 o1Var) {
            super(n1Var);
            this.f21010a = o1Var;
        }

        @Override // okio.x, okio.n1
        public long read(@p4.l l sink, long j5) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            try {
                return super.read(sink, this.f21010a.l(j5));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public o1(long j5) {
        this.f21003a = j5;
        this.f21005c = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        this.f21006d = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f21007e = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l0.o(newCondition, "newCondition(...)");
        this.f21008f = newCondition;
    }

    public static /* synthetic */ void e(o1 o1Var, long j5, long j6, long j7, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = o1Var.f21005c;
        }
        long j8 = j6;
        if ((i5 & 4) != 0) {
            j7 = o1Var.f21006d;
        }
        o1Var.d(j5, j8, j7);
    }

    private final long f(long j5) {
        return (j5 * 1000000000) / this.f21004b;
    }

    private final long i(long j5) {
        return (j5 * this.f21004b) / 1000000000;
    }

    public final long a(long j5, long j6) {
        if (this.f21004b == 0) {
            return j6;
        }
        long max = Math.max(this.f21003a - j5, 0L);
        long i5 = this.f21006d - i(max);
        if (i5 >= j6) {
            this.f21003a = j5 + max + f(j6);
            return j6;
        }
        long j7 = this.f21005c;
        if (i5 >= j7) {
            this.f21003a = j5 + f(this.f21006d);
            return i5;
        }
        long min = Math.min(j7, j6);
        long f5 = max + f(min - this.f21006d);
        if (f5 == 0) {
            this.f21003a = j5 + f(this.f21006d);
            return min;
        }
        return -f5;
    }

    @u3.i
    public final void b(long j5) {
        e(this, j5, 0L, 0L, 6, null);
    }

    @u3.i
    public final void c(long j5, long j6) {
        e(this, j5, j6, 0L, 4, null);
    }

    @u3.i
    public final void d(long j5, long j6, long j7) {
        boolean z4;
        boolean z5;
        ReentrantLock reentrantLock = this.f21007e;
        reentrantLock.lock();
        boolean z6 = true;
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        try {
            if (z4) {
                if (j6 > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (j7 < j6) {
                        z6 = false;
                    }
                    if (z6) {
                        this.f21004b = j5;
                        this.f21005c = j6;
                        this.f21006d = j7;
                        this.f21008f.signalAll();
                        r2 r2Var = r2.f19517a;
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    @p4.l
    public final Condition g() {
        return this.f21008f;
    }

    @p4.l
    public final ReentrantLock h() {
        return this.f21007e;
    }

    @p4.l
    public final l1 j(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return new a(sink, this);
    }

    @p4.l
    public final n1 k(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        return new b(source, this);
    }

    public final long l(long j5) {
        boolean z4;
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            ReentrantLock reentrantLock = this.f21007e;
            reentrantLock.lock();
            while (true) {
                try {
                    long a5 = a(System.nanoTime(), j5);
                    if (a5 >= 0) {
                        return a5;
                    }
                    this.f21008f.awaitNanos(-a5);
                } finally {
                    reentrantLock.unlock();
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public o1() {
        this(System.nanoTime());
    }
}

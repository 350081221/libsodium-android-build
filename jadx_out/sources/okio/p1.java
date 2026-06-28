package okio;

import androidx.compose.animation.core.AnimationKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u0000H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "awaitSignal", "", "condition", "Ljava/util/concurrent/locks/Condition;", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "T", "other", "block", "Lkotlin/Function0;", "(Lokio/Timeout;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "throwIfReached", m0.a.Z, "waitUntilNotified", "monitor", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/* loaded from: classes4.dex */
public class p1 {

    @p4.l
    public static final b Companion = new b(null);

    @p4.l
    @u3.e
    public static final p1 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    @kotlin.i0(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"okio/Timeout$Companion$NONE$1", "Lokio/Timeout;", "deadlineNanoTime", "", "throwIfReached", "", m0.a.Z, "unit", "Ljava/util/concurrent/TimeUnit;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends p1 {
        a() {
        }

        @Override // okio.p1
        @p4.l
        public p1 deadlineNanoTime(long j5) {
            return this;
        }

        @Override // okio.p1
        public void throwIfReached() {
        }

        @Override // okio.p1
        @p4.l
        public p1 timeout(long j5, @p4.l TimeUnit unit) {
            kotlin.jvm.internal.l0.p(unit, "unit");
            return this;
        }
    }

    @kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lokio/Timeout$Companion;", "", "()V", "NONE", "Lokio/Timeout;", "minTimeout", "", "aNanos", "bNanos", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        public final long a(long j5, long j6) {
            return (j5 != 0 && (j6 == 0 || j5 < j6)) ? j5 : j6;
        }
    }

    public final void awaitSignal(@p4.l Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.l0.p(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j5 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j5 = System.nanoTime() - nanoTime;
            }
            if (j5 < timeoutNanos) {
            } else {
                throw new InterruptedIOException(m0.a.Z);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @p4.l
    public p1 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @p4.l
    public p1 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @p4.l
    public final p1 deadline(long j5, @p4.l TimeUnit unit) {
        boolean z4;
        kotlin.jvm.internal.l0.p(unit, "unit");
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j5));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j5).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(@p4.l p1 other, @p4.l v3.a<? extends T> block) {
        kotlin.jvm.internal.l0.p(other, "other");
        kotlin.jvm.internal.l0.p(block, "block");
        long timeoutNanos = timeoutNanos();
        long a5 = Companion.a(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a5, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (other.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
            }
            try {
                T invoke = block.invoke();
                kotlin.jvm.internal.i0.d(1);
                timeout(timeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.i0.c(1);
                return invoke;
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        if (other.hasDeadline()) {
            deadlineNanoTime(other.deadlineNanoTime());
        }
        try {
            T invoke2 = block.invoke();
            kotlin.jvm.internal.i0.d(1);
            timeout(timeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.i0.c(1);
            return invoke2;
        } catch (Throwable th2) {
            kotlin.jvm.internal.i0.d(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                clearDeadline();
            }
            kotlin.jvm.internal.i0.c(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @p4.l
    public p1 timeout(long j5, @p4.l TimeUnit unit) {
        boolean z4;
        kotlin.jvm.internal.l0.p(unit, "unit");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.timeoutNanos = unit.toNanos(j5);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j5).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@p4.l Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.l0.p(monitor, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j5 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j6 = timeoutNanos / AnimationKt.MillisToNanos;
                monitor.wait(j6, (int) (timeoutNanos - (AnimationKt.MillisToNanos * j6)));
                j5 = System.nanoTime() - nanoTime;
            }
            if (j5 < timeoutNanos) {
            } else {
                throw new InterruptedIOException(m0.a.Z);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @p4.l
    public p1 deadlineNanoTime(long j5) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j5;
        return this;
    }
}

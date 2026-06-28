package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class d {
    private d() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(@l3.f AtomicLong atomicLong, long j5) {
        long j6;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, c(j6, j5)));
        return j6;
    }

    public static long b(@l3.f AtomicLong atomicLong, long j5) {
        long j6;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, c(j6, j5)));
        return j6;
    }

    public static long c(long j5, long j6) {
        long j7 = j5 + j6;
        if (j7 < 0) {
            return Long.MAX_VALUE;
        }
        return j7;
    }

    public static long d(long j5, long j6) {
        long j7 = j5 * j6;
        if (((j5 | j6) >>> 31) == 0 || j7 / j5 == j6) {
            return j7;
        }
        return Long.MAX_VALUE;
    }

    public static long e(@l3.f AtomicLong atomicLong, long j5) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j7 = j6 - j5;
            if (j7 < 0) {
                io.reactivex.rxjava3.plugins.a.Y(new IllegalStateException("More produced than requested: " + j7));
                j7 = 0L;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        return j7;
    }

    public static long f(@l3.f AtomicLong atomicLong, long j5) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j7 = j6 - j5;
            if (j7 < 0) {
                io.reactivex.rxjava3.plugins.a.Y(new IllegalStateException("More produced than requested: " + j7));
                j7 = 0L;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        return j7;
    }
}

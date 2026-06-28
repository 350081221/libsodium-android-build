package kotlin.internal;

import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.i0;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", bi.ay, "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {
    private static final int a(int i5, int i6, int i7) {
        return e(e(i5, i7) - e(i6, i7), i7);
    }

    private static final long b(long j5, long j6, long j7) {
        return f(f(j5, j7) - f(j6, j7), j7);
    }

    @a1
    public static final int c(int i5, int i6, int i7) {
        if (i7 > 0) {
            if (i5 < i6) {
                return i6 - a(i6, i5, i7);
            }
            return i6;
        }
        if (i7 < 0) {
            if (i5 > i6) {
                return i6 + a(i5, i6, -i7);
            }
            return i6;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @a1
    public static final long d(long j5, long j6, long j7) {
        if (j7 > 0) {
            if (j5 < j6) {
                return j6 - b(j6, j5, j7);
            }
            return j6;
        }
        if (j7 < 0) {
            if (j5 > j6) {
                return j6 + b(j5, j6, -j7);
            }
            return j6;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int e(int i5, int i6) {
        int i7 = i5 % i6;
        return i7 >= 0 ? i7 : i7 + i6;
    }

    private static final long f(long j5, long j6) {
        long j7 = j5 % j6;
        return j7 >= 0 ? j7 : j7 + j6;
    }
}

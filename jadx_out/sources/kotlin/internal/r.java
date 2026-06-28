package kotlin.internal;

import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.t1;
import kotlin.w1;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", bi.ay, "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {
    private static final int a(int i5, int i6, int i7) {
        int compare;
        int a5 = t1.a(i5, i7);
        int a6 = t1.a(i6, i7);
        compare = Integer.compare(a5 ^ Integer.MIN_VALUE, a6 ^ Integer.MIN_VALUE);
        int l5 = c2.l(a5 - a6);
        if (compare < 0) {
            return c2.l(l5 + i7);
        }
        return l5;
    }

    private static final long b(long j5, long j6, long j7) {
        int compare;
        long a5 = w1.a(j5, j7);
        long a6 = w1.a(j6, j7);
        compare = Long.compare(a5 ^ Long.MIN_VALUE, a6 ^ Long.MIN_VALUE);
        long l5 = g2.l(a5 - a6);
        if (compare < 0) {
            return g2.l(l5 + j7);
        }
        return l5;
    }

    @g1(version = "1.3")
    @a1
    public static final long c(long j5, long j6, long j7) {
        int compare;
        int compare2;
        if (j7 > 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return g2.l(j6 - b(j6, j5, g2.l(j7)));
            }
            return j6;
        }
        if (j7 < 0) {
            compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare > 0) {
                return g2.l(j6 + b(j5, j6, g2.l(-j7)));
            }
            return j6;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @g1(version = "1.3")
    @a1
    public static final int d(int i5, int i6, int i7) {
        int compare;
        int compare2;
        if (i7 > 0) {
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return c2.l(i6 - a(i6, i5, c2.l(i7)));
            }
            return i6;
        }
        if (i7 < 0) {
            compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return c2.l(i6 + a(i5, i6, c2.l(-i7)));
            }
            return i6;
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}

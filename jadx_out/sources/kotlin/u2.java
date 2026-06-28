package kotlin;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", com.alipay.sdk.m.x.c.f3016c, com.alipay.sdk.m.x.c.f3017d, "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", "base", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "UnsignedKt")
/* loaded from: classes3.dex */
public final class u2 {
    @a1
    public static final int a(double d5) {
        if (Double.isNaN(d5) || d5 <= f(0)) {
            return 0;
        }
        if (d5 >= f(-1)) {
            return -1;
        }
        if (d5 <= 2.147483647E9d) {
            return c2.l((int) d5);
        }
        return c2.l(c2.l((int) (d5 - Integer.MAX_VALUE)) + c2.l(Integer.MAX_VALUE));
    }

    @a1
    public static final long b(double d5) {
        if (Double.isNaN(d5) || d5 <= j(0L)) {
            return 0L;
        }
        if (d5 >= j(-1L)) {
            return -1L;
        }
        if (d5 < 9.223372036854776E18d) {
            return g2.l((long) d5);
        }
        return g2.l(g2.l((long) (d5 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @a1
    public static final int c(int i5, int i6) {
        return kotlin.jvm.internal.l0.t(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
    }

    @a1
    public static final int d(int i5, int i6) {
        return c2.l((int) ((i5 & 4294967295L) / (i6 & 4294967295L)));
    }

    @a1
    public static final int e(int i5, int i6) {
        return c2.l((int) ((i5 & 4294967295L) % (i6 & 4294967295L)));
    }

    @a1
    public static final double f(int i5) {
        return (Integer.MAX_VALUE & i5) + (((i5 >>> 31) << 30) * 2);
    }

    @a1
    public static final int g(long j5, long j6) {
        return kotlin.jvm.internal.l0.u(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
    }

    @a1
    public static final long h(long j5, long j6) {
        int compare;
        int compare2;
        if (j6 < 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return g2.l(0L);
            }
            return g2.l(1L);
        }
        if (j5 >= 0) {
            return g2.l(j5 / j6);
        }
        int i5 = 1;
        long j7 = ((j5 >>> 1) / j6) << 1;
        compare = Long.compare(g2.l(j5 - (j7 * j6)) ^ Long.MIN_VALUE, g2.l(j6) ^ Long.MIN_VALUE);
        if (compare < 0) {
            i5 = 0;
        }
        return g2.l(j7 + i5);
    }

    @a1
    public static final long i(long j5, long j6) {
        int compare;
        int compare2;
        if (j6 < 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 >= 0) {
                return g2.l(j5 - j6);
            }
            return j5;
        }
        if (j5 >= 0) {
            return g2.l(j5 % j6);
        }
        long j7 = j5 - ((((j5 >>> 1) / j6) << 1) * j6);
        compare = Long.compare(g2.l(j7) ^ Long.MIN_VALUE, g2.l(j6) ^ Long.MIN_VALUE);
        if (compare < 0) {
            j6 = 0;
        }
        return g2.l(j7 - j6);
    }

    @a1
    public static final double j(long j5) {
        return ((j5 >>> 11) * 2048) + (j5 & 2047);
    }

    @p4.l
    public static final String k(long j5) {
        return l(j5, 10);
    }

    @p4.l
    public static final String l(long j5, int i5) {
        int a5;
        int a6;
        int a7;
        if (j5 >= 0) {
            a7 = kotlin.text.d.a(i5);
            String l5 = Long.toString(j5, a7);
            kotlin.jvm.internal.l0.o(l5, "toString(this, checkRadix(radix))");
            return l5;
        }
        long j6 = i5;
        long j7 = ((j5 >>> 1) / j6) << 1;
        long j8 = j5 - (j7 * j6);
        if (j8 >= j6) {
            j8 -= j6;
            j7++;
        }
        StringBuilder sb = new StringBuilder();
        a5 = kotlin.text.d.a(i5);
        String l6 = Long.toString(j7, a5);
        kotlin.jvm.internal.l0.o(l6, "toString(this, checkRadix(radix))");
        sb.append(l6);
        a6 = kotlin.text.d.a(i5);
        String l7 = Long.toString(j8, a6);
        kotlin.jvm.internal.l0.o(l7, "toString(this, checkRadix(radix))");
        sb.append(l7);
        return sb.toString();
    }
}

package kotlin.comparisons;

import com.umeng.analytics.pro.bi;
import kotlin.d2;
import kotlin.g1;
import kotlin.h2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.n2;
import kotlin.t;
import kotlin.v2;
import kotlin.y1;
import kotlin.z1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\"\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\"\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a&\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0005\u001a+\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010\b\u001a&\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010\f\u001a\"\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010\u000f\u001a+\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u0011\u001a&\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u0014\u001a\"\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0017\u001a+\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\bø\u0001\u0000¢\u0006\u0004\b-\u0010\u0019\u001a&\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001c\u001a\"\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001f\u001a+\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u0010!\u001a&\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", bi.ay, "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes3.dex */
public class n {
    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final short a(short s5, short s6) {
        return l0.t(s5 & m2.f19496d, 65535 & s6) >= 0 ? s5 : s6;
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static int b(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i5 : i6;
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final byte c(byte b5, byte b6) {
        return l0.t(b5 & y1.f19838d, b6 & y1.f19838d) >= 0 ? b5 : b6;
    }

    @g1(version = "1.4")
    @t
    public static final int d(int i5, @p4.l int... other) {
        l0.p(other, "other");
        int p5 = d2.p(other);
        for (int i6 = 0; i6 < p5; i6++) {
            i5 = b(i5, d2.n(other, i6));
        }
        return i5;
    }

    @g1(version = "1.4")
    @t
    public static final long e(long j5, @p4.l long... other) {
        l0.p(other, "other");
        int p5 = h2.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            j5 = j(j5, h2.n(other, i5));
        }
        return j5;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final short f(short s5, short s6, short s7) {
        return a(s5, a(s6, s7));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final int g(int i5, int i6, int i7) {
        int b5;
        int b6;
        b5 = b(i6, i7);
        b6 = b(i5, b5);
        return b6;
    }

    @g1(version = "1.4")
    @t
    public static final byte h(byte b5, @p4.l byte... other) {
        l0.p(other, "other");
        int p5 = z1.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            b5 = c(b5, z1.n(other, i5));
        }
        return b5;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final byte i(byte b5, byte b6, byte b7) {
        return c(b5, c(b6, b7));
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static long j(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare >= 0 ? j5 : j6;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final long k(long j5, long j6, long j7) {
        long j8;
        long j9;
        j8 = j(j6, j7);
        j9 = j(j5, j8);
        return j9;
    }

    @g1(version = "1.4")
    @t
    public static final short l(short s5, @p4.l short... other) {
        l0.p(other, "other");
        int p5 = n2.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            s5 = a(s5, n2.n(other, i5));
        }
        return s5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final short m(short s5, short s6) {
        return l0.t(s5 & m2.f19496d, 65535 & s6) <= 0 ? s5 : s6;
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static int n(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i5 : i6;
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final byte o(byte b5, byte b6) {
        return l0.t(b5 & y1.f19838d, b6 & y1.f19838d) <= 0 ? b5 : b6;
    }

    @g1(version = "1.4")
    @t
    public static final int p(int i5, @p4.l int... other) {
        l0.p(other, "other");
        int p5 = d2.p(other);
        for (int i6 = 0; i6 < p5; i6++) {
            i5 = n(i5, d2.n(other, i6));
        }
        return i5;
    }

    @g1(version = "1.4")
    @t
    public static final long q(long j5, @p4.l long... other) {
        l0.p(other, "other");
        int p5 = h2.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            j5 = v(j5, h2.n(other, i5));
        }
        return j5;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final short r(short s5, short s6, short s7) {
        return m(s5, m(s6, s7));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final int s(int i5, int i6, int i7) {
        int n5;
        int n6;
        n5 = n(i6, i7);
        n6 = n(i5, n5);
        return n6;
    }

    @g1(version = "1.4")
    @t
    public static final byte t(byte b5, @p4.l byte... other) {
        l0.p(other, "other");
        int p5 = z1.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            b5 = o(b5, z1.n(other, i5));
        }
        return b5;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final byte u(byte b5, byte b6, byte b7) {
        return o(b5, o(b6, b7));
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static long v(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare <= 0 ? j5 : j6;
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {t.class})
    private static final long w(long j5, long j6, long j7) {
        long v4;
        long v5;
        v4 = v(j6, j7);
        v5 = v(j5, v4);
        return v5;
    }

    @g1(version = "1.4")
    @t
    public static final short x(short s5, @p4.l short... other) {
        l0.p(other, "other");
        int p5 = n2.p(other);
        for (int i5 = 0; i5 < p5; i5++) {
            s5 = m(s5, n2.n(other, i5));
        }
        return s5;
    }
}

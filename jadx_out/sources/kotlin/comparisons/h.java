package kotlin.comparisons;

import com.umeng.analytics.pro.bi;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", bi.ay, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes3.dex */
public class h extends g {
    @g1(version = "1.1")
    @kotlin.internal.f
    private static final byte I(byte b5, byte b6) {
        return (byte) Math.max((int) b5, (int) b6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final byte J(byte b5, byte b6, byte b7) {
        return (byte) Math.max((int) b5, Math.max((int) b6, (int) b7));
    }

    @g1(version = "1.4")
    public static final byte K(byte b5, @p4.l byte... other) {
        l0.p(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.max((int) b5, (int) b6);
        }
        return b5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final double L(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final double M(double d5, double d6, double d7) {
        return Math.max(d5, Math.max(d6, d7));
    }

    @g1(version = "1.4")
    public static final double N(double d5, @p4.l double... other) {
        l0.p(other, "other");
        for (double d6 : other) {
            d5 = Math.max(d5, d6);
        }
        return d5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final float O(float f5, float f6) {
        return Math.max(f5, f6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final float P(float f5, float f6, float f7) {
        return Math.max(f5, Math.max(f6, f7));
    }

    @g1(version = "1.4")
    public static float Q(float f5, @p4.l float... other) {
        l0.p(other, "other");
        for (float f6 : other) {
            f5 = Math.max(f5, f6);
        }
        return f5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final int R(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final int S(int i5, int i6, int i7) {
        return Math.max(i5, Math.max(i6, i7));
    }

    @g1(version = "1.4")
    public static int T(int i5, @p4.l int... other) {
        l0.p(other, "other");
        for (int i6 : other) {
            i5 = Math.max(i5, i6);
        }
        return i5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final long U(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final long V(long j5, long j6, long j7) {
        return Math.max(j5, Math.max(j6, j7));
    }

    @g1(version = "1.4")
    public static final long W(long j5, @p4.l long... other) {
        l0.p(other, "other");
        for (long j6 : other) {
            j5 = Math.max(j5, j6);
        }
        return j5;
    }

    @p4.l
    @g1(version = "1.1")
    public static <T extends Comparable<? super T>> T X(@p4.l T a5, @p4.l T b5) {
        l0.p(a5, "a");
        l0.p(b5, "b");
        if (a5.compareTo(b5) < 0) {
            return b5;
        }
        return a5;
    }

    @p4.l
    @g1(version = "1.1")
    public static final <T extends Comparable<? super T>> T Y(@p4.l T a5, @p4.l T b5, @p4.l T c5) {
        l0.p(a5, "a");
        l0.p(b5, "b");
        l0.p(c5, "c");
        return (T) a.X(a5, a.X(b5, c5));
    }

    @p4.l
    @g1(version = "1.4")
    public static final <T extends Comparable<? super T>> T Z(@p4.l T a5, @p4.l T... other) {
        l0.p(a5, "a");
        l0.p(other, "other");
        for (T t5 : other) {
            a5 = (T) a.X(a5, t5);
        }
        return a5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final short a0(short s5, short s6) {
        return (short) Math.max((int) s5, (int) s6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final short b0(short s5, short s6, short s7) {
        return (short) Math.max((int) s5, Math.max((int) s6, (int) s7));
    }

    @g1(version = "1.4")
    public static final short c0(short s5, @p4.l short... other) {
        l0.p(other, "other");
        for (short s6 : other) {
            s5 = (short) Math.max((int) s5, (int) s6);
        }
        return s5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final byte d0(byte b5, byte b6) {
        return (byte) Math.min((int) b5, (int) b6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final byte e0(byte b5, byte b6, byte b7) {
        return (byte) Math.min((int) b5, Math.min((int) b6, (int) b7));
    }

    @g1(version = "1.4")
    public static final byte f0(byte b5, @p4.l byte... other) {
        l0.p(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.min((int) b5, (int) b6);
        }
        return b5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final double g0(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final double h0(double d5, double d6, double d7) {
        return Math.min(d5, Math.min(d6, d7));
    }

    @g1(version = "1.4")
    public static final double i0(double d5, @p4.l double... other) {
        l0.p(other, "other");
        for (double d6 : other) {
            d5 = Math.min(d5, d6);
        }
        return d5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final float j0(float f5, float f6) {
        return Math.min(f5, f6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final float k0(float f5, float f6, float f7) {
        return Math.min(f5, Math.min(f6, f7));
    }

    @g1(version = "1.4")
    public static float l0(float f5, @p4.l float... other) {
        l0.p(other, "other");
        for (float f6 : other) {
            f5 = Math.min(f5, f6);
        }
        return f5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final int m0(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final int n0(int i5, int i6, int i7) {
        return Math.min(i5, Math.min(i6, i7));
    }

    @g1(version = "1.4")
    public static final int o0(int i5, @p4.l int... other) {
        l0.p(other, "other");
        for (int i6 : other) {
            i5 = Math.min(i5, i6);
        }
        return i5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final long p0(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final long q0(long j5, long j6, long j7) {
        return Math.min(j5, Math.min(j6, j7));
    }

    @g1(version = "1.4")
    public static final long r0(long j5, @p4.l long... other) {
        l0.p(other, "other");
        for (long j6 : other) {
            j5 = Math.min(j5, j6);
        }
        return j5;
    }

    @p4.l
    @g1(version = "1.1")
    public static final <T extends Comparable<? super T>> T s0(@p4.l T a5, @p4.l T b5) {
        l0.p(a5, "a");
        l0.p(b5, "b");
        if (a5.compareTo(b5) > 0) {
            return b5;
        }
        return a5;
    }

    @p4.l
    @g1(version = "1.1")
    public static final <T extends Comparable<? super T>> T t0(@p4.l T a5, @p4.l T b5, @p4.l T c5) {
        l0.p(a5, "a");
        l0.p(b5, "b");
        l0.p(c5, "c");
        return (T) s0(a5, s0(b5, c5));
    }

    @p4.l
    @g1(version = "1.4")
    public static final <T extends Comparable<? super T>> T u0(@p4.l T a5, @p4.l T... other) {
        l0.p(a5, "a");
        l0.p(other, "other");
        for (T t5 : other) {
            a5 = (T) s0(a5, t5);
        }
        return a5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final short v0(short s5, short s6) {
        return (short) Math.min((int) s5, (int) s6);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final short w0(short s5, short s6, short s7) {
        return (short) Math.min((int) s5, Math.min((int) s6, (int) s7));
    }

    @g1(version = "1.4")
    public static final short x0(short s5, @p4.l short... other) {
        l0.p(other, "other");
        for (short s6 : other) {
            s5 = (short) Math.min((int) s5, (int) s6);
        }
        return s5;
    }
}

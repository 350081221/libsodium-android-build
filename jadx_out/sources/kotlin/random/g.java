package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.o;
import p4.l;

@i0(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", TypedValues.TransitionType.S_FROM, "", "until", "checkRangeBounds", "", "", "fastLog2", t0.b.f22420d, "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes4.dex */
public final class g {
    @l
    @g1(version = "1.3")
    public static final f a(int i5) {
        return new i(i5, i5 >> 31);
    }

    @l
    @g1(version = "1.3")
    public static final f b(long j5) {
        return new i((int) j5, (int) (j5 >> 32));
    }

    @l
    public static final String c(@l Object from, @l Object until) {
        l0.p(from, "from");
        l0.p(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void d(double d5, double d6) {
        if (!(d6 > d5)) {
            throw new IllegalArgumentException(c(Double.valueOf(d5), Double.valueOf(d6)).toString());
        }
    }

    public static final void e(int i5, int i6) {
        if (!(i6 > i5)) {
            throw new IllegalArgumentException(c(Integer.valueOf(i5), Integer.valueOf(i6)).toString());
        }
    }

    public static final void f(long j5, long j6) {
        if (!(j6 > j5)) {
            throw new IllegalArgumentException(c(Long.valueOf(j5), Long.valueOf(j6)).toString());
        }
    }

    public static final int g(int i5) {
        return 31 - Integer.numberOfLeadingZeros(i5);
    }

    @g1(version = "1.3")
    public static final int h(@l f fVar, @l kotlin.ranges.l range) {
        l0.p(fVar, "<this>");
        l0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.g() < Integer.MAX_VALUE) {
                return fVar.nextInt(range.e(), range.g() + 1);
            }
            if (range.e() > Integer.MIN_VALUE) {
                return fVar.nextInt(range.e() - 1, range.g()) + 1;
            }
            return fVar.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @g1(version = "1.3")
    public static final long i(@l f fVar, @l o range) {
        l0.p(fVar, "<this>");
        l0.p(range, "range");
        if (!range.isEmpty()) {
            if (range.g() < Long.MAX_VALUE) {
                return fVar.nextLong(range.e(), range.g() + 1);
            }
            if (range.e() > Long.MIN_VALUE) {
                return fVar.nextLong(range.e() - 1, range.g()) + 1;
            }
            return fVar.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i5, int i6) {
        return (i5 >>> (32 - i6)) & ((-i6) >> 31);
    }
}

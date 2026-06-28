package kotlin.time;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.time.e;

@i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", t0.b.f22420d, "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes4.dex */
public final class m {
    private static final long a(long j5, long j6, long j7) {
        if (!e.d0(j6) || (j5 ^ j7) >= 0) {
            return j5;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long b(long j5) {
        return j5 < 0 ? e.f19812b.J() : e.f19812b.q();
    }

    public static final boolean c(long j5) {
        return ((j5 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j5, @p4.l h unit, long j6) {
        boolean z4;
        l0.p(unit, "unit");
        long r02 = e.r0(j6, unit);
        boolean z5 = true;
        if (((j5 - 1) | 1) == Long.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return a(j5, j6, r02);
        }
        if ((1 | (r02 - 1)) != Long.MAX_VALUE) {
            z5 = false;
        }
        if (z5) {
            return e(j5, unit, j6);
        }
        long j7 = j5 + r02;
        if (((j5 ^ j7) & (r02 ^ j7)) < 0) {
            if (j5 >= 0) {
                return Long.MAX_VALUE;
            }
            return Long.MIN_VALUE;
        }
        return j7;
    }

    private static final long e(long j5, h hVar, long j6) {
        boolean z4;
        long p5 = e.p(j6, 2);
        long r02 = e.r0(p5, hVar);
        if ((1 | (r02 - 1)) == Long.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return r02;
        }
        return d(d(j5, hVar, p5), hVar, e.g0(j6, p5));
    }

    public static final long f(long j5, long j6, @p4.l h unit) {
        boolean z4;
        l0.p(unit, "unit");
        if ((1 | (j6 - 1)) == Long.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return e.y0(b(j6));
        }
        return g(j5, j6, unit);
    }

    private static final long g(long j5, long j6, h hVar) {
        long j7 = j5 - j6;
        if (((j7 ^ j5) & (~(j7 ^ j6))) < 0) {
            h hVar2 = h.MILLISECONDS;
            if (hVar.compareTo(hVar2) < 0) {
                long b5 = j.b(1L, hVar2, hVar);
                long j8 = (j5 / b5) - (j6 / b5);
                long j9 = (j5 % b5) - (j6 % b5);
                e.a aVar = e.f19812b;
                return e.h0(g.n0(j8, hVar2), g.n0(j9, hVar));
            }
            return e.y0(b(j7));
        }
        return g.n0(j7, hVar);
    }

    public static final long h(long j5, long j6, @p4.l h unit) {
        boolean z4;
        l0.p(unit, "unit");
        boolean z5 = true;
        if (((j6 - 1) | 1) == Long.MAX_VALUE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (j5 == j6) {
                return e.f19812b.W();
            }
            return e.y0(b(j6));
        }
        if ((1 | (j5 - 1)) != Long.MAX_VALUE) {
            z5 = false;
        }
        if (z5) {
            return b(j5);
        }
        return g(j5, j6, unit);
    }
}

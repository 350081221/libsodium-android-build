package kotlin.random;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.a0;
import kotlin.ranges.x;
import kotlin.t;
import kotlin.v2;
import kotlin.z1;
import p4.l;

@i0(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a2\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001e\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a&\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010 \u001a\u0014\u0010!\u001a\u00020\b*\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u001e\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a&\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0002\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", TypedValues.TransitionType.S_FROM, "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes4.dex */
public final class h {
    public static final void a(int i5, int i6) {
        int compare;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(g.c(c2.e(i5), c2.e(i6)).toString());
        }
    }

    public static final void b(long j5, long j6) {
        int compare;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
        if (!(compare > 0)) {
            throw new IllegalArgumentException(g.c(g2.e(j5), g2.e(j6)).toString());
        }
    }

    @l
    @g1(version = "1.3")
    @t
    public static final byte[] c(@l f fVar, int i5) {
        l0.p(fVar, "<this>");
        return z1.g(fVar.nextBytes(i5));
    }

    @l
    @g1(version = "1.3")
    @t
    public static final byte[] d(@l f nextUBytes, @l byte[] array) {
        l0.p(nextUBytes, "$this$nextUBytes");
        l0.p(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @l
    @g1(version = "1.3")
    @t
    public static final byte[] e(@l f nextUBytes, @l byte[] array, int i5, int i6) {
        l0.p(nextUBytes, "$this$nextUBytes");
        l0.p(array, "array");
        nextUBytes.nextBytes(array, i5, i6);
        return array;
    }

    public static /* synthetic */ byte[] f(f fVar, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = z1.p(bArr);
        }
        return e(fVar, bArr, i5, i6);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final int g(@l f fVar) {
        l0.p(fVar, "<this>");
        return c2.l(fVar.nextInt());
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final int h(@l f fVar, @l x range) {
        int compare;
        int compare2;
        l0.p(fVar, "<this>");
        l0.p(range, "range");
        if (!range.isEmpty()) {
            compare = Integer.compare(range.g() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
            if (compare < 0) {
                return i(fVar, range.e(), c2.l(range.g() + 1));
            }
            compare2 = Integer.compare(range.e() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
            if (compare2 > 0) {
                return c2.l(i(fVar, c2.l(range.e() - 1), range.g()) + 1);
            }
            return g(fVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final int i(@l f nextUInt, int i5, int i6) {
        l0.p(nextUInt, "$this$nextUInt");
        a(i5, i6);
        return c2.l(nextUInt.nextInt(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final int j(@l f nextUInt, int i5) {
        l0.p(nextUInt, "$this$nextUInt");
        return i(nextUInt, 0, i5);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final long k(@l f fVar) {
        l0.p(fVar, "<this>");
        return g2.l(fVar.nextLong());
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final long l(@l f fVar, @l a0 range) {
        int compare;
        int compare2;
        l0.p(fVar, "<this>");
        l0.p(range, "range");
        if (!range.isEmpty()) {
            compare = Long.compare(range.g() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
            if (compare < 0) {
                return n(fVar, range.e(), g2.l(range.g() + g2.l(1 & 4294967295L)));
            }
            compare2 = Long.compare(range.e() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
            if (compare2 > 0) {
                long j5 = 1 & 4294967295L;
                return g2.l(n(fVar, g2.l(range.e() - g2.l(j5)), range.g()) + g2.l(j5));
            }
            return k(fVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final long m(@l f nextULong, long j5) {
        l0.p(nextULong, "$this$nextULong");
        return n(nextULong, 0L, j5);
    }

    @g1(version = "1.5")
    @v2(markerClass = {t.class})
    public static final long n(@l f nextULong, long j5, long j6) {
        l0.p(nextULong, "$this$nextULong");
        b(j5, j6);
        return g2.l(nextULong.nextLong(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}

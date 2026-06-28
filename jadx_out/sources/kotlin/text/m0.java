package kotlin.text;

import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.m2;
import kotlin.u1;
import kotlin.u2;
import kotlin.v2;
import kotlin.x1;
import kotlin.y1;

@kotlin.i0(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "UStringsKt")
/* loaded from: classes4.dex */
public final class m0 {
    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final String a(long j5, int i5) {
        int a5;
        a5 = d.a(i5);
        return u2.l(j5, a5);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final String b(byte b5, int i5) {
        int a5;
        int i6 = b5 & y1.f19838d;
        a5 = d.a(i5);
        String num = Integer.toString(i6, a5);
        kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final String c(int i5, int i6) {
        int a5;
        long j5 = i5 & 4294967295L;
        a5 = d.a(i6);
        String l5 = Long.toString(j5, a5);
        kotlin.jvm.internal.l0.o(l5, "toString(this, checkRadix(radix))");
        return l5;
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final String d(short s5, int i5) {
        int a5;
        int i6 = s5 & m2.f19496d;
        a5 = d.a(i5);
        String num = Integer.toString(i6, a5);
        kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final byte e(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        y1 g5 = g(str);
        if (g5 != null) {
            return g5.j0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final byte f(@p4.l String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        y1 h5 = h(str, i5);
        if (h5 != null) {
            return h5.j0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final y1 g(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return h(str, 10);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final y1 h(@p4.l String str, int i5) {
        int compare;
        kotlin.jvm.internal.l0.p(str, "<this>");
        c2 l5 = l(str, i5);
        if (l5 == null) {
            return null;
        }
        int l02 = l5.l0();
        compare = Integer.compare(l02 ^ Integer.MIN_VALUE, c2.l(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return y1.e(y1.l((byte) l02));
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int i(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        c2 k5 = k(str);
        if (k5 != null) {
            return k5.l0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int j(@p4.l String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        c2 l5 = l(str, i5);
        if (l5 != null) {
            return l5.l0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final c2 k(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return l(str, 10);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final c2 l(@p4.l String str, int i5) {
        int i6;
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i7 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i6 = 0;
        }
        int l5 = c2.l(i5);
        int i8 = 119304647;
        while (i6 < length) {
            int b5 = d.b(str.charAt(i6), i5);
            if (b5 < 0) {
                return null;
            }
            compare = Integer.compare(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                if (i8 == 119304647) {
                    i8 = u1.a(-1, l5);
                    compare3 = Integer.compare(i7 ^ Integer.MIN_VALUE, i8 ^ Integer.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            int l6 = c2.l(i7 * l5);
            int l7 = c2.l(c2.l(b5) + l6);
            compare2 = Integer.compare(l7 ^ Integer.MIN_VALUE, l6 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i6++;
            i7 = l7;
        }
        return c2.e(i7);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long m(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        g2 o5 = o(str);
        if (o5 != null) {
            return o5.l0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long n(@p4.l String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        g2 p5 = p(str, i5);
        if (p5 != null) {
            return p5.l0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final g2 o(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return p(str, 10);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final g2 p(@p4.l String str, int i5) {
        int compare;
        int compare2;
        int compare3;
        kotlin.jvm.internal.l0.p(str, "<this>");
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long l5 = g2.l(i5);
        long j5 = 0;
        long j6 = 512409557603043100L;
        while (i6 < length) {
            if (d.b(str.charAt(i6), i5) < 0) {
                return null;
            }
            compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare > 0) {
                if (j6 == 512409557603043100L) {
                    j6 = x1.a(-1L, l5);
                    compare3 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
                    if (compare3 > 0) {
                    }
                }
                return null;
            }
            long l6 = g2.l(j5 * l5);
            long l7 = g2.l(g2.l(c2.l(r13) & 4294967295L) + l6);
            compare2 = Long.compare(l7 ^ Long.MIN_VALUE, l6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return null;
            }
            i6++;
            j5 = l7;
        }
        return g2.e(j5);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final short q(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        m2 s5 = s(str);
        if (s5 != null) {
            return s5.j0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final short r(@p4.l String str, int i5) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        m2 t5 = t(str, i5);
        if (t5 != null) {
            return t5.j0();
        }
        d0.U0(str);
        throw new kotlin.y();
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final m2 s(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return t(str, 10);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    @p4.m
    public static final m2 t(@p4.l String str, int i5) {
        int compare;
        kotlin.jvm.internal.l0.p(str, "<this>");
        c2 l5 = l(str, i5);
        if (l5 == null) {
            return null;
        }
        int l02 = l5.l0();
        compare = Integer.compare(l02 ^ Integer.MIN_VALUE, c2.l(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return m2.e(m2.l((short) l02));
    }
}

package kotlin.text;

import kotlin.g1;
import kotlin.jvm.internal.r1;
import kotlin.v2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", "", "", "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", "", "other", "ignoreCase", "isSurrogate", "plus", "", "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
@r1({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes4.dex */
public class e extends d {
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static final char D(int i5) {
        if (new kotlin.ranges.l(0, 9).l(i5)) {
            return (char) (i5 + 48);
        }
        throw new IllegalArgumentException("Int " + i5 + " is not a decimal digit");
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static final char E(int i5, int i6) {
        int i7;
        if (new kotlin.ranges.l(2, 36).l(i6)) {
            if (i5 >= 0 && i5 < i6) {
                if (i5 < 10) {
                    i7 = i5 + 48;
                } else {
                    i7 = ((char) (i5 + 65)) - '\n';
                }
                return (char) i7;
            }
            throw new IllegalArgumentException("Digit " + i5 + " does not represent a valid digit in radix " + i6);
        }
        throw new IllegalArgumentException("Invalid radix: " + i6 + ". Valid radix values are in range 2..36");
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static int F(char c5) {
        int b5 = d.b(c5, 10);
        if (b5 >= 0) {
            return b5;
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a decimal digit");
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    public static final int G(char c5, int i5) {
        Integer I;
        I = I(c5, i5);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a digit in the given radix=" + i5);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static final Integer H(char c5) {
        Integer valueOf = Integer.valueOf(d.b(c5, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class})
    @p4.m
    public static Integer I(char c5, int i5) {
        boolean z4;
        d.a(i5);
        Integer valueOf = Integer.valueOf(d.b(c5, i5));
        if (valueOf.intValue() >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return null;
        }
        return valueOf;
    }

    public static final boolean J(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (!z4) {
            return false;
        }
        char upperCase = Character.toUpperCase(c5);
        char upperCase2 = Character.toUpperCase(c6);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean K(char c5, char c6, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return J(c5, c6, z4);
    }

    public static final boolean L(char c5) {
        return new kotlin.ranges.c((char) 55296, (char) 57343).l(c5);
    }

    @kotlin.internal.f
    private static final String M(char c5, String other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return c5 + other;
    }

    @p4.l
    @g1(version = "1.5")
    public static final String N(char c5) {
        return n0.a(c5);
    }
}

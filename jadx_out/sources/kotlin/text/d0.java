package kotlin.text;

import kotlin.g1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"numberFormatError", "", "input", "", "toByteOrNull", "", "(Ljava/lang/String;)Ljava/lang/Byte;", "radix", "", "(Ljava/lang/String;I)Ljava/lang/Byte;", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)Ljava/lang/Integer;", "toLongOrNull", "", "(Ljava/lang/String;)Ljava/lang/Long;", "(Ljava/lang/String;I)Ljava/lang/Long;", "toShortOrNull", "", "(Ljava/lang/String;)Ljava/lang/Short;", "(Ljava/lang/String;I)Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes4.dex */
public class d0 extends c0 {
    @p4.l
    public static final Void U0(@p4.l String input) {
        kotlin.jvm.internal.l0.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @g1(version = "1.1")
    @p4.m
    public static final Byte V0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return W0(str, 10);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Byte W0(@p4.l String str, int i5) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, "<this>");
        Integer Y0 = Y0(str, i5);
        if (Y0 == null || (intValue = Y0.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @g1(version = "1.1")
    @p4.m
    public static Integer X0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Y0(str, 10);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Integer Y0(@p4.l String str, int i5) {
        boolean z4;
        int i6;
        int i7;
        kotlin.jvm.internal.l0.p(str, "<this>");
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char charAt = str.charAt(0);
        int i9 = -2147483647;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            i6 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i9 = Integer.MIN_VALUE;
                z4 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
            }
        } else {
            z4 = false;
            i6 = 0;
        }
        int i10 = -59652323;
        while (i6 < length) {
            int b5 = d.b(str.charAt(i6), i5);
            if (b5 < 0) {
                return null;
            }
            if ((i8 < i10 && (i10 != -59652323 || i8 < (i10 = i9 / i5))) || (i7 = i8 * i5) < i9 + b5) {
                return null;
            }
            i8 = i7 - b5;
            i6++;
        }
        if (z4) {
            return Integer.valueOf(i8);
        }
        return Integer.valueOf(-i8);
    }

    @g1(version = "1.1")
    @p4.m
    public static Long Z0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return a1(str, 10);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Long a1(@p4.l String str, int i5) {
        boolean z4;
        kotlin.jvm.internal.l0.p(str, "<this>");
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        long j5 = -9223372036854775807L;
        if (kotlin.jvm.internal.l0.t(charAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j5 = Long.MIN_VALUE;
                i6 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
                i6 = 1;
            }
        } else {
            z4 = false;
        }
        long j6 = -256204778801521550L;
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i6 < length) {
            int b5 = d.b(str.charAt(i6), i5);
            if (b5 < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 == j6) {
                    j8 = j5 / i5;
                    if (j7 < j8) {
                    }
                }
                return null;
            }
            long j9 = j7 * i5;
            long j10 = b5;
            if (j9 < j5 + j10) {
                return null;
            }
            j7 = j9 - j10;
            i6++;
            j6 = -256204778801521550L;
        }
        if (z4) {
            return Long.valueOf(j7);
        }
        return Long.valueOf(-j7);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Short b1(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return c1(str, 10);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Short c1(@p4.l String str, int i5) {
        int intValue;
        kotlin.jvm.internal.l0.p(str, "<this>");
        Integer Y0 = Y0(str, i5);
        if (Y0 == null || (intValue = Y0.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}

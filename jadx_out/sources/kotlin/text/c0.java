package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.g1;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000X\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u000f\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0003H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001e\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u001f\u001a\u00020 *\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010!\u001a\u00020\"*\u00020\u0003H\u0087\b\u001a\u0015\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006$"}, d2 = {"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
/* loaded from: classes4.dex */
public class c0 extends b0 {
    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger A0(String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        a5 = d.a(i5);
        return new BigInteger(str, a5);
    }

    @g1(version = "1.2")
    @p4.m
    public static final BigInteger B0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return C0(str, 10);
    }

    @g1(version = "1.2")
    @p4.m
    public static final BigInteger C0(@p4.l String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        d.a(i5);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i6 = 1;
            }
            while (i6 < length) {
                if (d.b(str.charAt(i6), i5) < 0) {
                    return null;
                }
                i6++;
            }
        } else if (d.b(str.charAt(0), i5) < 0) {
            return null;
        }
        a5 = d.a(i5);
        return new BigInteger(str, a5);
    }

    @g1(version = "1.4")
    @kotlin.internal.f
    private static final boolean D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @kotlin.internal.f
    private static final byte E0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final byte F0(String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        a5 = d.a(i5);
        return Byte.parseByte(str, a5);
    }

    @kotlin.internal.f
    private static final double G0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Double H0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        try {
            if (!u.f19800b.matches(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final float I0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @g1(version = "1.1")
    @p4.m
    public static final Float J0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        try {
            if (!u.f19800b.matches(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @kotlin.internal.f
    private static final int K0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final int L0(String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        a5 = d.a(i5);
        return Integer.parseInt(str, a5);
    }

    @kotlin.internal.f
    private static final long M0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Long.parseLong(str);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final long N0(String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        a5 = d.a(i5);
        return Long.parseLong(str, a5);
    }

    @kotlin.internal.f
    private static final short O0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return Short.parseShort(str);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final short P0(String str, int i5) {
        int a5;
        kotlin.jvm.internal.l0.p(str, "<this>");
        a5 = d.a(i5);
        return Short.parseShort(str, a5);
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final String Q0(byte b5, int i5) {
        int a5;
        int a6;
        a5 = d.a(i5);
        a6 = d.a(a5);
        String num = Integer.toString(b5, a6);
        kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final String R0(int i5, int i6) {
        int a5;
        a5 = d.a(i6);
        String num = Integer.toString(i5, a5);
        kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final String S0(long j5, int i5) {
        int a5;
        a5 = d.a(i5);
        String l5 = Long.toString(j5, a5);
        kotlin.jvm.internal.l0.o(l5, "toString(this, checkRadix(radix))");
        return l5;
    }

    @g1(version = "1.1")
    @kotlin.internal.f
    private static final String T0(short s5, int i5) {
        int a5;
        int a6;
        a5 = d.a(i5);
        a6 = d.a(a5);
        String num = Integer.toString(s5, a6);
        kotlin.jvm.internal.l0.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    private static final <T> T u0(String str, v3.l<? super String, ? extends T> lVar) {
        try {
            if (!u.f19800b.matches(str)) {
                return null;
            }
            return lVar.invoke(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal v0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return new BigDecimal(str);
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal w0(String str, MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @g1(version = "1.2")
    @p4.m
    public static final BigDecimal x0(@p4.l String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        try {
            if (!u.f19800b.matches(str)) {
                return null;
            }
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @p4.m
    public static final BigDecimal y0(@p4.l String str, @p4.l MathContext mathContext) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(mathContext, "mathContext");
        try {
            if (!u.f19800b.matches(str)) {
                return null;
            }
            return new BigDecimal(str, mathContext);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @g1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z0(String str) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        return new BigInteger(str);
    }
}

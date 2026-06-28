package kotlin.text;

import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.m2;
import kotlin.y1;
import kotlin.z1;

@kotlin.i0(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u001a\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\n*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u0012\u001a\u00020\u0002*\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u0012\u001a\u00020\u0002*\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u0012\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\u0012\u001a\u00020\u0002*\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"hexToUByte", "Lkotlin/UByte;", "", "format", "Lkotlin/text/HexFormat;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "hexToUByteArray", "Lkotlin/UByteArray;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "hexToUInt", "Lkotlin/UInt;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "hexToULong", "Lkotlin/ULong;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "hexToUShort", "Lkotlin/UShort;", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "toHexString", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "startIndex", "", "endIndex", "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l0 {
    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final byte a(String str, k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return y1.l(j.i(str, format));
    }

    static /* synthetic */ byte b(String str, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return y1.l(j.i(str, format));
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.t
    @kotlin.internal.f
    private static final byte[] c(String str, k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return z1.g(j.m(str, format));
    }

    static /* synthetic */ byte[] d(String str, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return z1.g(j.m(str, format));
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final int e(String str, k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return c2.l(j.q(str, format));
    }

    static /* synthetic */ int f(String str, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return c2.l(j.q(str, format));
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final long g(String str, k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return g2.l(j.u(str, format));
    }

    static /* synthetic */ long h(String str, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return g2.l(j.u(str, format));
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final short i(String str, k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return m2.l(j.A(str, format));
    }

    static /* synthetic */ short j(String str, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return m2.l(j.A(str, format));
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final String k(int i5, k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return j.F(i5, format);
    }

    static /* synthetic */ String l(int i5, k format, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(format, "format");
        return j.F(i5, format);
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final String m(long j5, k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return j.G(j5, format);
    }

    static /* synthetic */ String n(long j5, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(format, "format");
        return j.G(j5, format);
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final String o(byte b5, k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return j.E(b5, format);
    }

    static /* synthetic */ String p(byte b5, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(format, "format");
        return j.E(b5, format);
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.t
    @kotlin.internal.f
    private static final String q(byte[] toHexString, int i5, int i6, k format) {
        kotlin.jvm.internal.l0.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.l0.p(format, "format");
        return j.I(toHexString, i5, i6, format);
    }

    static /* synthetic */ String r(byte[] toHexString, int i5, int i6, k format, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = z1.p(toHexString);
        }
        if ((i7 & 4) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.l0.p(format, "format");
        return j.I(toHexString, i5, i6, format);
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.internal.f
    private static final String s(short s5, k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return j.H(s5, format);
    }

    static /* synthetic */ String t(short s5, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(format, "format");
        return j.H(s5, format);
    }

    @kotlin.r
    @g1(version = "1.9")
    @kotlin.t
    @kotlin.internal.f
    private static final String u(byte[] toHexString, k format) {
        kotlin.jvm.internal.l0.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.l0.p(format, "format");
        return j.J(toHexString, format);
    }

    static /* synthetic */ String v(byte[] toHexString, k format, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            format = k.f19733d.a();
        }
        kotlin.jvm.internal.l0.p(toHexString, "$this$toHexString");
        kotlin.jvm.internal.l0.p(format, "format");
        return j.J(toHexString, format);
    }
}

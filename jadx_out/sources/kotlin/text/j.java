package kotlin.text;

import java.util.Arrays;
import kotlin.g1;
import kotlin.g2;
import kotlin.jvm.internal.r1;
import kotlin.text.k;

@kotlin.i0(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a@\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a,\u0010\u0018\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002\u001a,\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u001c\u0010#\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002\u001a\u0014\u0010$\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a*\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a0\u0010-\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000bH\u0003\u001a*\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020/2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u001c\u00101\u001a\u00020\u0005*\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u000bH\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "getHEX_DIGITS_TO_DECIMAL$annotations", "()V", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", "index", "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,594:1\n1#2:595\n1183#3,3:596\n1183#3,3:599\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n16#1:596,3\n17#1:599,3\n*E\n"})
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final String f19730a = "0123456789abcdef";

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final String f19731b = "0123456789ABCDEF";

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final int[] f19732c;

    static {
        int[] iArr = new int[128];
        int i5 = 0;
        for (int i6 = 0; i6 < 128; i6++) {
            iArr[i6] = -1;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < f19730a.length()) {
            iArr[f19730a.charAt(i7)] = i8;
            i7++;
            i8++;
        }
        int i9 = 0;
        while (i5 < f19731b.length()) {
            iArr[f19731b.charAt(i5)] = i9;
            i5++;
            i9++;
        }
        f19732c = iArr;
    }

    @kotlin.r
    @g1(version = "1.9")
    public static final short A(@p4.l String str, @p4.l k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return z(str, 0, str.length(), format);
    }

    static /* synthetic */ short B(String str, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return z(str, i5, i6, kVar);
    }

    public static /* synthetic */ short C(String str, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return A(str, kVar);
    }

    public static final int D(int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        boolean z4;
        long a5;
        int i12;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j5 = i10 + 2 + i11;
            long a6 = a(j5, i7, i9);
            if (i6 <= i7) {
                a5 = a(j5, i6, i9);
            } else {
                a5 = a(a6, i6 / i7, i8);
                int i13 = i6 % i7;
                if (i13 != 0) {
                    a5 = a5 + i8 + a(j5, i13, i9);
                }
            }
            long j6 = i5;
            long R = R(j6, a5, 1);
            long j7 = j6 - ((a5 + 1) * R);
            long R2 = R(j7, a6, i8);
            long j8 = j7 - ((a6 + i8) * R2);
            long R3 = R(j8, j5, i9);
            if (j8 - ((j5 + i9) * R3) > 0) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            return (int) (i12 + (R * i6) + (R2 * i7) + R3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final String E(byte b5, @p4.l k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return Q(b5, format, 8);
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final String F(int i5, @p4.l k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return Q(i5, format, 32);
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final String G(long j5, @p4.l k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return Q(j5, format, 64);
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final String H(short s5, @p4.l k format) {
        kotlin.jvm.internal.l0.p(format, "format");
        return Q(s5, format, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[SYNTHETIC] */
    @kotlin.r
    @p4.l
    @kotlin.g1(version = "1.9")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String I(@p4.l byte[] r17, int r18, int r19, @p4.l kotlin.text.k r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.l0.p(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            kotlin.jvm.internal.l0.p(r4, r3)
            kotlin.collections.c$a r3 = kotlin.collections.c.Companion
            int r5 = r0.length
            r3.a(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.e()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.k$b r4 = r20.c()
            int r12 = r4.g()
            int r13 = r4.f()
            java.lang.String r14 = r4.c()
            java.lang.String r15 = r4.e()
            java.lang.String r11 = r4.d()
            java.lang.String r4 = r4.h()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = f(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r7 = r0[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r11 = r7 >> 4
            char r11 = r3.charAt(r11)
            r6.append(r11)
            r7 = r7 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            r7 = 1
            int r9 = r9 + r7
            int r8 = r8 + 1
            goto L68
        La2:
            r7 = 1
            int r0 = r6.length()
            if (r5 != r0) goto Laa
            goto Lab
        Laa:
            r7 = 0
        Lab:
            if (r7 == 0) goto Lb7
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        Lb7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.j.I(byte[], int, int, kotlin.text.k):java.lang.String");
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final String J(@p4.l byte[] bArr, @p4.l k format) {
        kotlin.jvm.internal.l0.p(bArr, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return I(bArr, 0, bArr.length, format);
    }

    public static /* synthetic */ String K(byte b5, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return E(b5, kVar);
    }

    public static /* synthetic */ String L(int i5, k kVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return F(i5, kVar);
    }

    public static /* synthetic */ String M(long j5, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return G(j5, kVar);
    }

    public static /* synthetic */ String N(short s5, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return H(s5, kVar);
    }

    public static /* synthetic */ String O(byte[] bArr, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return I(bArr, i5, i6, kVar);
    }

    public static /* synthetic */ String P(byte[] bArr, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return J(bArr, kVar);
    }

    @kotlin.r
    private static final String Q(long j5, k kVar, int i5) {
        boolean z4;
        String str;
        if ((i5 & 3) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (kVar.e()) {
                str = f19731b;
            } else {
                str = f19730a;
            }
            String c5 = kVar.d().c();
            String e5 = kVar.d().e();
            int length = c5.length() + (i5 >> 2) + e5.length();
            boolean d5 = kVar.d().d();
            StringBuilder sb = new StringBuilder(length);
            sb.append(c5);
            while (i5 > 0) {
                i5 -= 4;
                int i6 = (int) ((j5 >> i5) & 15);
                if (d5 && i6 == 0 && i5 > 0) {
                    d5 = true;
                } else {
                    d5 = false;
                }
                if (!d5) {
                    sb.append(str.charAt(i6));
                }
            }
            sb.append(e5);
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
            return sb2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long R(long j5, long j6, int i5) {
        if (j5 <= 0 || j6 <= 0) {
            return 0L;
        }
        long j7 = i5;
        return (j5 + j7) / (j6 + j7);
    }

    private static final long a(long j5, int i5, int i6) {
        if (!(i5 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long j6 = i5;
        return (j5 * j6) + (i6 * (j6 - 1));
    }

    private static final int b(String str, String str2, int i5, int i6, String str3) {
        int B;
        boolean b22;
        int length = str2.length() + i5;
        if (length <= i6) {
            b22 = e0.b2(str, i5, str2, 0, str2.length(), true);
            if (b22) {
                return length;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str3);
        sb.append(" \"");
        sb.append(str2);
        sb.append("\" at index ");
        sb.append(i5);
        sb.append(", but was ");
        B = kotlin.ranges.u.B(length, i6);
        kotlin.jvm.internal.l0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i5, B);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    private static final void c(String str, int i5, int i6, int i7, boolean z4) {
        String str2;
        int i8 = i6 - i5;
        boolean z5 = true;
        if (!z4 ? i8 > i7 : i8 != i7) {
            z5 = false;
        }
        if (!z5) {
            if (z4) {
                str2 = "exactly";
            } else {
                str2 = "at most";
            }
            kotlin.jvm.internal.l0.n(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(i5, i6);
            kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            throw new NumberFormatException("Expected " + str2 + ' ' + i7 + " hexadecimal digits at index " + i5 + ", but was " + substring + " of length " + i8);
        }
    }

    private static final int d(String str, int i5, int i6) {
        if (str.charAt(i5) == '\r') {
            int i7 = i5 + 1;
            if (i7 < i6 && str.charAt(i7) == '\n') {
                return i5 + 2;
            }
            return i7;
        }
        if (str.charAt(i5) == '\n') {
            return i5 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i5 + ", but was " + str.charAt(i5));
    }

    private static final int e(String str, int i5) {
        int i6;
        char charAt = str.charAt(i5);
        if (charAt <= 127 && (i6 = f19732c[charAt]) >= 0) {
            return i6;
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i5 + ", but was " + str.charAt(i5));
    }

    public static final int f(int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        boolean z4;
        boolean K0;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int i12 = (i5 - 1) / i6;
            int i13 = (i6 - 1) / i7;
            int i14 = i5 % i6;
            if (i14 != 0) {
                i6 = i14;
            }
            long j5 = i12 + (((i13 * i12) + ((i6 - 1) / i7)) * i8) + (((r2 - i12) - r4) * i9) + (i5 * (i10 + 2 + i11));
            K0 = kotlin.ranges.u.K0(new kotlin.ranges.l(0, Integer.MAX_VALUE), j5);
            if (K0) {
                return (int) j5;
            }
            throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) g2.g0(g2.l(j5))));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static /* synthetic */ void g() {
    }

    @kotlin.r
    private static final byte h(String str, int i5, int i6, k kVar) {
        return (byte) x(str, i5, i6, kVar, 2);
    }

    @kotlin.r
    @g1(version = "1.9")
    public static final byte i(@p4.l String str, @p4.l k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return h(str, 0, str.length(), format);
    }

    static /* synthetic */ byte j(String str, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return h(str, i5, i6, kVar);
    }

    public static /* synthetic */ byte k(String str, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return i(str, kVar);
    }

    @kotlin.r
    private static final byte[] l(String str, int i5, int i6, k kVar) {
        int B;
        int i7 = i5;
        kotlin.collections.c.Companion.a(i7, i6, str.length());
        if (i7 == i6) {
            return new byte[0];
        }
        k.b c5 = kVar.c();
        int g5 = c5.g();
        int f5 = c5.f();
        String c6 = c5.c();
        String e5 = c5.e();
        String d5 = c5.d();
        String h5 = c5.h();
        String str2 = d5;
        int D = D(i6 - i7, g5, f5, h5.length(), d5.length(), c6.length(), e5.length());
        byte[] bArr = new byte[D];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i6) {
            if (i9 == g5) {
                i7 = d(str, i7, i6);
                i9 = 0;
            } else if (i10 == f5) {
                i7 = b(str, h5, i7, i6, "group separator");
            } else {
                if (i10 != 0) {
                    i7 = b(str, str2, i7, i6, "byte separator");
                }
                i9++;
                i10++;
                int b5 = b(str, c6, i7, i6, "byte prefix");
                B = kotlin.ranges.u.B(b5 + 2, i6);
                c(str, b5, B, 2, true);
                int i11 = b5 + 1;
                bArr[i8] = (byte) ((e(str, b5) << 4) | e(str, i11));
                i7 = b(str, e5, i11 + 1, i6, "byte suffix");
                i8++;
                str2 = str2;
            }
            i10 = 0;
            i9++;
            i10++;
            int b52 = b(str, c6, i7, i6, "byte prefix");
            B = kotlin.ranges.u.B(b52 + 2, i6);
            c(str, b52, B, 2, true);
            int i112 = b52 + 1;
            bArr[i8] = (byte) ((e(str, b52) << 4) | e(str, i112));
            i7 = b(str, e5, i112 + 1, i6, "byte suffix");
            i8++;
            str2 = str2;
        }
        if (i8 != D) {
            byte[] copyOf = Arrays.copyOf(bArr, i8);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            return copyOf;
        }
        return bArr;
    }

    @kotlin.r
    @p4.l
    @g1(version = "1.9")
    public static final byte[] m(@p4.l String str, @p4.l k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return l(str, 0, str.length(), format);
    }

    static /* synthetic */ byte[] n(String str, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return l(str, i5, i6, kVar);
    }

    public static /* synthetic */ byte[] o(String str, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return m(str, kVar);
    }

    @kotlin.r
    private static final int p(String str, int i5, int i6, k kVar) {
        return (int) x(str, i5, i6, kVar, 8);
    }

    @kotlin.r
    @g1(version = "1.9")
    public static final int q(@p4.l String str, @p4.l k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return p(str, 0, str.length(), format);
    }

    static /* synthetic */ int r(String str, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return p(str, i5, i6, kVar);
    }

    public static /* synthetic */ int s(String str, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return q(str, kVar);
    }

    @kotlin.r
    private static final long t(String str, int i5, int i6, k kVar) {
        return x(str, i5, i6, kVar, 16);
    }

    @kotlin.r
    @g1(version = "1.9")
    public static final long u(@p4.l String str, @p4.l k format) {
        kotlin.jvm.internal.l0.p(str, "<this>");
        kotlin.jvm.internal.l0.p(format, "format");
        return t(str, 0, str.length(), format);
    }

    static /* synthetic */ long v(String str, int i5, int i6, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            kVar = k.f19733d.a();
        }
        return t(str, i5, i6, kVar);
    }

    public static /* synthetic */ long w(String str, k kVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            kVar = k.f19733d.a();
        }
        return u(str, kVar);
    }

    @kotlin.r
    private static final long x(String str, int i5, int i6, k kVar, int i7) {
        kotlin.collections.c.Companion.a(i5, i6, str.length());
        String c5 = kVar.d().c();
        String e5 = kVar.d().e();
        if (c5.length() + e5.length() < i6 - i5) {
            int b5 = b(str, c5, i5, i6, "prefix");
            int length = i6 - e5.length();
            b(str, e5, length, i6, "suffix");
            c(str, b5, length, i7, false);
            long j5 = 0;
            while (b5 < length) {
                j5 = (j5 << 4) | e(str, b5);
                b5++;
            }
            return j5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected a hexadecimal number with prefix \"");
        sb.append(c5);
        sb.append("\" and suffix \"");
        sb.append(e5);
        sb.append("\", but was ");
        kotlin.jvm.internal.l0.n(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        throw new NumberFormatException(sb.toString());
    }

    static /* synthetic */ long y(String str, int i5, int i6, k kVar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i5 = 0;
        }
        if ((i8 & 2) != 0) {
            i6 = str.length();
        }
        return x(str, i5, i6, kVar, i7);
    }

    @kotlin.r
    private static final short z(String str, int i5, int i6, k kVar) {
        return (short) x(str, i5, i6, kVar, 4);
    }
}

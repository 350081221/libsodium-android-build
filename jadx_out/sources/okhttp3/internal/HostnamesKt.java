package okhttp3.internal;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.f0;
import okio.l;

@i0(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int o32;
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return true;
            }
            o32 = f0.o3(" #%/:?@[\\]", charAt, 0, false, 6, null);
            if (o32 != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i5, int i6, byte[] bArr, int i7) {
        int i8 = i7;
        while (i5 < i6) {
            if (i8 == bArr.length) {
                return false;
            }
            if (i8 != i7) {
                if (str.charAt(i5) != '.') {
                    return false;
                }
                i5++;
            }
            int i9 = i5;
            int i10 = 0;
            while (i9 < i6) {
                char charAt = str.charAt(i9);
                if (l0.t(charAt, 48) < 0 || l0.t(charAt, 57) > 0) {
                    break;
                }
                if ((i10 == 0 && i5 != i9) || (i10 = ((i10 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i9++;
            }
            if (i9 - i5 == 0) {
                return false;
            }
            bArr[i8] = (byte) i10;
            i8++;
            i5 = i9;
        }
        if (i8 != i7 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r13 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r14 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r18, int r19, int r20) {
        /*
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r14 = r11
            r15 = r14
            r13 = 0
        Le:
            r16 = 0
            if (r12 >= r7) goto L96
            if (r13 != r8) goto L15
            return r16
        L15:
            int r5 = r12 + 2
            if (r5 > r7) goto L38
            java.lang.String r1 = "::"
            r3 = 0
            r4 = 4
            r17 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = kotlin.text.v.r2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L38
            if (r14 == r11) goto L2e
            return r16
        L2e:
            int r13 = r13 + 2
            if (r10 != r7) goto L35
            r14 = r13
            goto L96
        L35:
            r15 = r10
            r14 = r13
            goto L67
        L38:
            if (r13 == 0) goto L66
            java.lang.String r1 = ":"
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r18
            r2 = r12
            boolean r0 = kotlin.text.v.r2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4b
            int r12 = r12 + 1
            goto L66
        L4b:
            java.lang.String r1 = "."
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r18
            r2 = r12
            boolean r0 = kotlin.text.v.r2(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L65
            int r0 = r13 + (-2)
            boolean r0 = decodeIpv4Suffix(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L62
            return r16
        L62:
            int r13 = r13 + 2
            goto L96
        L65:
            return r16
        L66:
            r15 = r12
        L67:
            r12 = r15
            r0 = 0
        L69:
            if (r12 >= r7) goto L7b
            char r1 = r6.charAt(r12)
            int r1 = okhttp3.internal.Util.parseHexDigit(r1)
            if (r1 == r11) goto L7b
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L69
        L7b:
            int r1 = r12 - r15
            if (r1 == 0) goto L95
            r2 = 4
            if (r1 <= r2) goto L83
            goto L95
        L83:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r1 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto Le
        L95:
            return r16
        L96:
            if (r13 == r8) goto La8
            if (r14 != r11) goto L9b
            return r16
        L9b:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        La8:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < bArr.length) {
            int i9 = i7;
            while (i9 < 16 && bArr[i9] == 0 && bArr[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i5 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        l lVar = new l();
        while (i6 < bArr.length) {
            if (i6 == i5) {
                lVar.writeByte(58);
                i6 += i8;
                if (i6 == 16) {
                    lVar.writeByte(58);
                }
            } else {
                if (i6 > 0) {
                    lVar.writeByte(58);
                }
                lVar.l0((Util.and(bArr[i6], 255) << 8) | Util.and(bArr[i6 + 1], 255));
                i6 += 2;
            }
        }
        return lVar.s0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[RETURN] */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String toCanonicalHost(@p4.l java.lang.String r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.v.T2(r5, r0, r1, r2, r3)
            r4 = 1
            if (r0 == 0) goto L6e
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.v.s2(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.v.J1(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r5.length()
            int r0 = r0 - r4
            java.net.InetAddress r0 = decodeIpv6(r5, r4, r0)
            goto L33
        L2b:
            int r0 = r5.length()
            java.net.InetAddress r0 = decodeIpv6(r5, r1, r0)
        L33:
            if (r0 != 0) goto L36
            return r3
        L36:
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L49
            java.lang.String r5 = "address"
            kotlin.jvm.internal.l0.o(r1, r5)
            java.lang.String r5 = inet6AddressToAscii(r1)
            return r5
        L49:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L52
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L52:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6e:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> L99
            java.lang.String r0 = "toASCII(host)"
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L99
            java.lang.String r2 = "US"
            kotlin.jvm.internal.l0.o(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L99
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L99
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.lang.IllegalArgumentException -> L99
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> L99
            if (r0 != 0) goto L8e
            r1 = r4
        L8e:
            if (r1 == 0) goto L91
            return r3
        L91:
            boolean r0 = containsInvalidHostnameAsciiCodes(r5)     // Catch: java.lang.IllegalArgumentException -> L99
            if (r0 == 0) goto L98
            goto L99
        L98:
            r3 = r5
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.toCanonicalHost(java.lang.String):java.lang.String");
    }
}

package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.c;
import java.io.EOFException;
import java.io.IOException;
import okio.BufferedSource;
import okio.l;
import okio.n;
import org.apache.http.message.BasicHeaderValueFormatter;

/* loaded from: classes2.dex */
final class e extends c {
    private static final int A = 7;
    private static final int B = 8;
    private static final int C = 9;
    private static final int D = 10;
    private static final int E = 11;
    private static final int F = 12;
    private static final int G = 13;
    private static final int H = 14;
    private static final int I = 15;
    private static final int J = 16;
    private static final int K = 17;
    private static final int L = 18;
    private static final int M = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private static final int Z = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final long f1649n = -922337203685477580L;

    /* renamed from: o, reason: collision with root package name */
    private static final n f1650o = n.encodeUtf8("'\\");

    /* renamed from: p, reason: collision with root package name */
    private static final n f1651p = n.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: q, reason: collision with root package name */
    private static final n f1652q = n.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: r, reason: collision with root package name */
    private static final n f1653r = n.encodeUtf8("\n\r");

    /* renamed from: s, reason: collision with root package name */
    private static final n f1654s = n.encodeUtf8("*/");

    /* renamed from: s0, reason: collision with root package name */
    private static final int f1655s0 = 4;

    /* renamed from: t, reason: collision with root package name */
    private static final int f1656t = 0;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f1657t0 = 5;

    /* renamed from: u, reason: collision with root package name */
    private static final int f1658u = 1;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f1659u0 = 6;

    /* renamed from: v, reason: collision with root package name */
    private static final int f1660v = 2;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f1661v0 = 7;

    /* renamed from: w, reason: collision with root package name */
    private static final int f1662w = 3;

    /* renamed from: x, reason: collision with root package name */
    private static final int f1663x = 4;

    /* renamed from: y, reason: collision with root package name */
    private static final int f1664y = 5;

    /* renamed from: z, reason: collision with root package name */
    private static final int f1665z = 6;

    /* renamed from: h, reason: collision with root package name */
    private final BufferedSource f1666h;

    /* renamed from: i, reason: collision with root package name */
    private final l f1667i;

    /* renamed from: j, reason: collision with root package name */
    private int f1668j = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f1669k;

    /* renamed from: l, reason: collision with root package name */
    private int f1670l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private String f1671m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f1666h = bufferedSource;
            this.f1667i = bufferedSource.f();
            I(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    private String A0() throws IOException {
        long v4 = this.f1666h.v(f1652q);
        if (v4 != -1) {
            return this.f1667i.X(v4);
        }
        return this.f1667i.s0();
    }

    private int C0() throws IOException {
        String str;
        String str2;
        int i5;
        byte P = this.f1667i.P(0L);
        if (P != 116 && P != 84) {
            if (P != 102 && P != 70) {
                if (P != 110 && P != 78) {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i5 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i5 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i5 = 5;
        }
        int length = str.length();
        int i6 = 1;
        while (i6 < length) {
            int i7 = i6 + 1;
            if (!this.f1666h.request(i7)) {
                return 0;
            }
            byte P2 = this.f1667i.P(i6);
            if (P2 != str.charAt(i6) && P2 != str2.charAt(i6)) {
                return 0;
            }
            i6 = i7;
        }
        if (this.f1666h.request(length + 1) && p0(this.f1667i.P(length))) {
            return 0;
        }
        this.f1667i.skip(length);
        this.f1668j = i5;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0081, code lost:
    
        if (p0(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0099, code lost:
    
        r16.f1669k = r8;
        r16.f1667i.skip(r5);
        r16.f1668j = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b0, code lost:
    
        r16.f1670l = r5;
        r16.f1668j = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int D0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.e.D0():int");
    }

    private char E0() throws IOException {
        int i5;
        int i6;
        if (this.f1666h.request(1L)) {
            byte readByte = this.f1667i.readByte();
            if (readByte != 10 && readByte != 34 && readByte != 39 && readByte != 47 && readByte != 92) {
                if (readByte != 98) {
                    if (readByte != 102) {
                        if (readByte == 110) {
                            return '\n';
                        }
                        if (readByte != 114) {
                            if (readByte != 116) {
                                if (readByte != 117) {
                                    if (this.f1637e) {
                                        return (char) readByte;
                                    }
                                    throw a0("Invalid escape sequence: \\" + ((char) readByte));
                                }
                                if (this.f1666h.request(4L)) {
                                    char c5 = 0;
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        byte P = this.f1667i.P(i7);
                                        char c6 = (char) (c5 << 4);
                                        if (P >= 48 && P <= 57) {
                                            i6 = P - 48;
                                        } else {
                                            if (P >= 97 && P <= 102) {
                                                i5 = P - 97;
                                            } else {
                                                if (P < 65 || P > 70) {
                                                    throw a0("\\u" + this.f1667i.X(4L));
                                                }
                                                i5 = P - 65;
                                            }
                                            i6 = i5 + 10;
                                        }
                                        c5 = (char) (c6 + i6);
                                    }
                                    this.f1667i.skip(4L);
                                    return c5;
                                }
                                throw new EOFException("Unterminated escape sequence at path " + getPath());
                            }
                            return '\t';
                        }
                        return external.org.apache.commons.lang3.c.f15956c;
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) readByte;
        }
        throw a0("Unterminated escape sequence");
    }

    private void F0(n nVar) throws IOException {
        while (true) {
            long v4 = this.f1666h.v(nVar);
            if (v4 != -1) {
                if (this.f1667i.P(v4) == 92) {
                    this.f1667i.skip(v4 + 1);
                    E0();
                } else {
                    this.f1667i.skip(v4 + 1);
                    return;
                }
            } else {
                throw a0("Unterminated string");
            }
        }
    }

    private boolean G0() throws IOException {
        boolean z4;
        long M0;
        long r5 = this.f1666h.r(f1654s);
        if (r5 != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        l lVar = this.f1667i;
        if (z4) {
            M0 = r5 + r1.size();
        } else {
            M0 = lVar.M0();
        }
        lVar.skip(M0);
        return z4;
    }

    private void H0() throws IOException {
        long M0;
        long v4 = this.f1666h.v(f1653r);
        l lVar = this.f1667i;
        if (v4 != -1) {
            M0 = v4 + 1;
        } else {
            M0 = lVar.M0();
        }
        lVar.skip(M0);
    }

    private void I0() throws IOException {
        long v4 = this.f1666h.v(f1652q);
        l lVar = this.f1667i;
        if (v4 == -1) {
            v4 = lVar.M0();
        }
        lVar.skip(v4);
    }

    private void b0() throws IOException {
        if (this.f1637e) {
        } else {
            throw a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int f0() throws IOException {
        int[] iArr = this.f1634b;
        int i5 = this.f1633a;
        int i6 = iArr[i5 - 1];
        if (i6 == 1) {
            iArr[i5 - 1] = 2;
        } else if (i6 == 2) {
            int r02 = r0(true);
            this.f1667i.readByte();
            if (r02 != 44) {
                if (r02 != 59) {
                    if (r02 == 93) {
                        this.f1668j = 4;
                        return 4;
                    }
                    throw a0("Unterminated array");
                }
                b0();
            }
        } else if (i6 != 3 && i6 != 5) {
            if (i6 == 4) {
                iArr[i5 - 1] = 5;
                int r03 = r0(true);
                this.f1667i.readByte();
                if (r03 != 58) {
                    if (r03 == 61) {
                        b0();
                        if (this.f1666h.request(1L) && this.f1667i.P(0L) == 62) {
                            this.f1667i.readByte();
                        }
                    } else {
                        throw a0("Expected ':'");
                    }
                }
            } else if (i6 == 6) {
                iArr[i5 - 1] = 7;
            } else if (i6 == 7) {
                if (r0(false) == -1) {
                    this.f1668j = 18;
                    return 18;
                }
                b0();
            } else if (i6 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i5 - 1] = 4;
            if (i6 == 5) {
                int r04 = r0(true);
                this.f1667i.readByte();
                if (r04 != 44) {
                    if (r04 != 59) {
                        if (r04 == 125) {
                            this.f1668j = 2;
                            return 2;
                        }
                        throw a0("Unterminated object");
                    }
                    b0();
                }
            }
            int r05 = r0(true);
            if (r05 != 34) {
                if (r05 != 39) {
                    if (r05 != 125) {
                        b0();
                        if (p0((char) r05)) {
                            this.f1668j = 14;
                            return 14;
                        }
                        throw a0("Expected name");
                    }
                    if (i6 != 5) {
                        this.f1667i.readByte();
                        this.f1668j = 2;
                        return 2;
                    }
                    throw a0("Expected name");
                }
                this.f1667i.readByte();
                b0();
                this.f1668j = 12;
                return 12;
            }
            this.f1667i.readByte();
            this.f1668j = 13;
            return 13;
        }
        int r06 = r0(true);
        if (r06 != 34) {
            if (r06 != 39) {
                if (r06 != 44 && r06 != 59) {
                    if (r06 != 91) {
                        if (r06 != 93) {
                            if (r06 != 123) {
                                int C0 = C0();
                                if (C0 != 0) {
                                    return C0;
                                }
                                int D0 = D0();
                                if (D0 != 0) {
                                    return D0;
                                }
                                if (p0(this.f1667i.P(0L))) {
                                    b0();
                                    this.f1668j = 10;
                                    return 10;
                                }
                                throw a0("Expected value");
                            }
                            this.f1667i.readByte();
                            this.f1668j = 1;
                            return 1;
                        }
                        if (i6 == 1) {
                            this.f1667i.readByte();
                            this.f1668j = 4;
                            return 4;
                        }
                    } else {
                        this.f1667i.readByte();
                        this.f1668j = 3;
                        return 3;
                    }
                }
                if (i6 != 1 && i6 != 2) {
                    throw a0("Unexpected value");
                }
                b0();
                this.f1668j = 7;
                return 7;
            }
            b0();
            this.f1667i.readByte();
            this.f1668j = 8;
            return 8;
        }
        this.f1667i.readByte();
        this.f1668j = 9;
        return 9;
    }

    private int i0(String str, c.a aVar) {
        int length = aVar.f1639a.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(aVar.f1639a[i5])) {
                this.f1668j = 0;
                this.f1635c[this.f1633a - 1] = str;
                return i5;
            }
        }
        return -1;
    }

    private boolean p0(int i5) throws IOException {
        if (i5 == 9 || i5 == 10 || i5 == 12 || i5 == 13 || i5 == 32) {
            return false;
        }
        if (i5 != 35) {
            if (i5 == 44) {
                return false;
            }
            if (i5 != 47 && i5 != 61) {
                if (i5 == 123 || i5 == 125 || i5 == 58) {
                    return false;
                }
                if (i5 != 59) {
                    switch (i5) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r6.f1667i.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1 != 47) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r1 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        b0();
        H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0039, code lost:
    
        if (r6.f1666h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        b0();
        r3 = r6.f1667i.P(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 42) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r6.f1667i.readByte();
        r6.f1667i.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (G0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        throw a0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        r6.f1667i.readByte();
        r6.f1667i.readByte();
        H0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int r0(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            okio.BufferedSource r2 = r6.f1666h
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L82
            okio.l r2 = r6.f1667i
            long r4 = (long) r1
            byte r1 = r2.P(r4)
            r2 = 10
            if (r1 == r2) goto L80
            r2 = 32
            if (r1 == r2) goto L80
            r2 = 13
            if (r1 == r2) goto L80
            r2 = 9
            if (r1 != r2) goto L25
            goto L80
        L25:
            okio.l r2 = r6.f1667i
            int r3 = r3 + (-1)
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L74
            okio.BufferedSource r3 = r6.f1666h
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L3c
            return r1
        L3c:
            r6.b0()
            okio.l r3 = r6.f1667i
            r4 = 1
            byte r3 = r3.P(r4)
            r4 = 42
            if (r3 == r4) goto L5c
            if (r3 == r2) goto L4e
            return r1
        L4e:
            okio.l r1 = r6.f1667i
            r1.readByte()
            okio.l r1 = r6.f1667i
            r1.readByte()
            r6.H0()
            goto L1
        L5c:
            okio.l r1 = r6.f1667i
            r1.readByte()
            okio.l r1 = r6.f1667i
            r1.readByte()
            boolean r1 = r6.G0()
            if (r1 == 0) goto L6d
            goto L1
        L6d:
            java.lang.String r7 = "Unterminated comment"
            com.airbnb.lottie.parser.moshi.b r7 = r6.a0(r7)
            throw r7
        L74:
            r2 = 35
            if (r1 != r2) goto L7f
            r6.b0()
            r6.H0()
            goto L1
        L7f:
            return r1
        L80:
            r1 = r3
            goto L2
        L82:
            if (r7 != 0) goto L86
            r7 = -1
            return r7
        L86:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.e.r0(boolean):int");
    }

    private String t0(n nVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long v4 = this.f1666h.v(nVar);
            if (v4 != -1) {
                if (this.f1667i.P(v4) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f1667i.X(v4));
                    this.f1667i.readByte();
                    sb.append(E0());
                } else {
                    if (sb == null) {
                        String X2 = this.f1667i.X(v4);
                        this.f1667i.readByte();
                        return X2;
                    }
                    sb.append(this.f1667i.X(v4));
                    this.f1667i.readByte();
                    return sb.toString();
                }
            } else {
                throw a0("Unterminated string");
            }
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public c.b H() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        switch (i5) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int J(c.a aVar) throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 < 12 || i5 > 15) {
            return -1;
        }
        if (i5 == 15) {
            return i0(this.f1671m, aVar);
        }
        int B0 = this.f1666h.B0(aVar.f1640b);
        if (B0 != -1) {
            this.f1668j = 0;
            this.f1635c[this.f1633a - 1] = aVar.f1639a[B0];
            return B0;
        }
        String str = this.f1635c[this.f1633a - 1];
        String q5 = q();
        int i02 = i0(q5, aVar);
        if (i02 == -1) {
            this.f1668j = 15;
            this.f1671m = q5;
            this.f1635c[this.f1633a - 1] = str;
        }
        return i02;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void M() throws IOException {
        if (!this.f1638f) {
            int i5 = this.f1668j;
            if (i5 == 0) {
                i5 = f0();
            }
            if (i5 == 14) {
                I0();
            } else if (i5 == 13) {
                F0(f1651p);
            } else if (i5 == 12) {
                F0(f1650o);
            } else if (i5 != 15) {
                throw new a("Expected a name but was " + H() + " at path " + getPath());
            }
            this.f1668j = 0;
            this.f1635c[this.f1633a - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + H() + " at " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void O() throws IOException {
        if (!this.f1638f) {
            int i5 = 0;
            do {
                int i6 = this.f1668j;
                if (i6 == 0) {
                    i6 = f0();
                }
                if (i6 == 3) {
                    I(1);
                } else if (i6 == 1) {
                    I(3);
                } else {
                    if (i6 == 4) {
                        i5--;
                        if (i5 >= 0) {
                            this.f1633a--;
                        } else {
                            throw new a("Expected a value but was " + H() + " at path " + getPath());
                        }
                    } else if (i6 == 2) {
                        i5--;
                        if (i5 >= 0) {
                            this.f1633a--;
                        } else {
                            throw new a("Expected a value but was " + H() + " at path " + getPath());
                        }
                    } else if (i6 != 14 && i6 != 10) {
                        if (i6 != 9 && i6 != 13) {
                            if (i6 != 8 && i6 != 12) {
                                if (i6 == 17) {
                                    this.f1667i.skip(this.f1670l);
                                } else if (i6 == 18) {
                                    throw new a("Expected a value but was " + H() + " at path " + getPath());
                                }
                            } else {
                                F0(f1650o);
                            }
                        } else {
                            F0(f1651p);
                        }
                    } else {
                        I0();
                    }
                    this.f1668j = 0;
                }
                i5++;
                this.f1668j = 0;
            } while (i5 != 0);
            int[] iArr = this.f1636d;
            int i7 = this.f1633a;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
            this.f1635c[i7 - 1] = "null";
            return;
        }
        throw new a("Cannot skip unexpected " + H() + " at " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void b() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 3) {
            I(1);
            this.f1636d[this.f1633a - 1] = 0;
            this.f1668j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + H() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void c() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 1) {
            I(3);
            this.f1668j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + H() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1668j = 0;
        this.f1634b[0] = 8;
        this.f1633a = 1;
        this.f1667i.c();
        this.f1666h.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void d() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 4) {
            int i6 = this.f1633a - 1;
            this.f1633a = i6;
            int[] iArr = this.f1636d;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f1668j = 0;
            return;
        }
        throw new a("Expected END_ARRAY but was " + H() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public void h() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 2) {
            int i6 = this.f1633a - 1;
            this.f1633a = i6;
            this.f1635c[i6] = null;
            int[] iArr = this.f1636d;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            this.f1668j = 0;
            return;
        }
        throw new a("Expected END_OBJECT but was " + H() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean j() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 != 2 && i5 != 4 && i5 != 18) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public boolean m() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 5) {
            this.f1668j = 0;
            int[] iArr = this.f1636d;
            int i6 = this.f1633a - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (i5 == 6) {
            this.f1668j = 0;
            int[] iArr2 = this.f1636d;
            int i7 = this.f1633a - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + H() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public double o() throws IOException {
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 16) {
            this.f1668j = 0;
            int[] iArr = this.f1636d;
            int i6 = this.f1633a - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f1669k;
        }
        if (i5 == 17) {
            this.f1671m = this.f1667i.X(this.f1670l);
        } else if (i5 == 9) {
            this.f1671m = t0(f1651p);
        } else if (i5 == 8) {
            this.f1671m = t0(f1650o);
        } else if (i5 == 10) {
            this.f1671m = A0();
        } else if (i5 != 11) {
            throw new a("Expected a double but was " + H() + " at path " + getPath());
        }
        this.f1668j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f1671m);
            if (!this.f1637e && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
            }
            this.f1671m = null;
            this.f1668j = 0;
            int[] iArr2 = this.f1636d;
            int i7 = this.f1633a - 1;
            iArr2[i7] = iArr2[i7] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f1671m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public int p() throws IOException {
        String t02;
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 16) {
            long j5 = this.f1669k;
            int i6 = (int) j5;
            if (j5 == i6) {
                this.f1668j = 0;
                int[] iArr = this.f1636d;
                int i7 = this.f1633a - 1;
                iArr[i7] = iArr[i7] + 1;
                return i6;
            }
            throw new a("Expected an int but was " + this.f1669k + " at path " + getPath());
        }
        if (i5 == 17) {
            this.f1671m = this.f1667i.X(this.f1670l);
        } else if (i5 != 9 && i5 != 8) {
            if (i5 != 11) {
                throw new a("Expected an int but was " + H() + " at path " + getPath());
            }
        } else {
            if (i5 == 9) {
                t02 = t0(f1651p);
            } else {
                t02 = t0(f1650o);
            }
            this.f1671m = t02;
            try {
                int parseInt = Integer.parseInt(t02);
                this.f1668j = 0;
                int[] iArr2 = this.f1636d;
                int i8 = this.f1633a - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1668j = 11;
        try {
            double parseDouble = Double.parseDouble(this.f1671m);
            int i9 = (int) parseDouble;
            if (i9 == parseDouble) {
                this.f1671m = null;
                this.f1668j = 0;
                int[] iArr3 = this.f1636d;
                int i10 = this.f1633a - 1;
                iArr3[i10] = iArr3[i10] + 1;
                return i9;
            }
            throw new a("Expected an int but was " + this.f1671m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f1671m + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String q() throws IOException {
        String str;
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 14) {
            str = A0();
        } else if (i5 == 13) {
            str = t0(f1651p);
        } else if (i5 == 12) {
            str = t0(f1650o);
        } else if (i5 == 15) {
            str = this.f1671m;
        } else {
            throw new a("Expected a name but was " + H() + " at path " + getPath());
        }
        this.f1668j = 0;
        this.f1635c[this.f1633a - 1] = str;
        return str;
    }

    public String toString() {
        return "JsonReader(" + this.f1666h + ")";
    }

    @Override // com.airbnb.lottie.parser.moshi.c
    public String y() throws IOException {
        String X2;
        int i5 = this.f1668j;
        if (i5 == 0) {
            i5 = f0();
        }
        if (i5 == 10) {
            X2 = A0();
        } else if (i5 == 9) {
            X2 = t0(f1651p);
        } else if (i5 == 8) {
            X2 = t0(f1650o);
        } else if (i5 == 11) {
            X2 = this.f1671m;
            this.f1671m = null;
        } else if (i5 == 16) {
            X2 = Long.toString(this.f1669k);
        } else if (i5 == 17) {
            X2 = this.f1667i.X(this.f1670l);
        } else {
            throw new a("Expected a string but was " + H() + " at path " + getPath());
        }
        this.f1668j = 0;
        int[] iArr = this.f1636d;
        int i6 = this.f1633a - 1;
        iArr[i6] = iArr[i6] + 1;
        return X2;
    }
}

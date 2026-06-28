package com.bytedance.sdk.openadsdk.api.plugin.b;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4837a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4838b;

    /* renamed from: c, reason: collision with root package name */
    private int f4839c;

    /* renamed from: d, reason: collision with root package name */
    private int f4840d;

    /* renamed from: e, reason: collision with root package name */
    private int f4841e;

    /* renamed from: f, reason: collision with root package name */
    private int f4842f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f4843g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f4837a = name;
        this.f4838b = name.length();
    }

    private String a() {
        int i5;
        int i6;
        int i7;
        int i8;
        char c5;
        int i9;
        int i10;
        char c6;
        char c7;
        while (true) {
            i5 = this.f4839c;
            i6 = this.f4838b;
            if (i5 >= i6 || this.f4843g[i5] != ' ') {
                break;
            }
            this.f4839c = i5 + 1;
        }
        if (i5 == i6) {
            return null;
        }
        this.f4840d = i5;
        this.f4839c = i5 + 1;
        while (true) {
            i7 = this.f4839c;
            i8 = this.f4838b;
            if (i7 >= i8 || (c7 = this.f4843g[i7]) == '=' || c7 == ' ') {
                break;
            }
            this.f4839c = i7 + 1;
        }
        if (i7 < i8) {
            this.f4841e = i7;
            if (this.f4843g[i7] == ' ') {
                while (true) {
                    i9 = this.f4839c;
                    i10 = this.f4838b;
                    if (i9 >= i10 || (c6 = this.f4843g[i9]) == '=' || c6 != ' ') {
                        break;
                    }
                    this.f4839c = i9 + 1;
                }
                if (this.f4843g[i9] != '=' || i9 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
                }
            }
            this.f4839c++;
            while (true) {
                int i11 = this.f4839c;
                if (i11 >= this.f4838b || this.f4843g[i11] != ' ') {
                    break;
                }
                this.f4839c = i11 + 1;
            }
            int i12 = this.f4841e;
            int i13 = this.f4840d;
            if (i12 - i13 > 4) {
                char[] cArr = this.f4843g;
                if (cArr[i13 + 3] == '.' && (((c5 = cArr[i13]) == 'O' || c5 == 'o') && ((cArr[i13 + 1] == 'I' || cArr[i13 + 1] == 'i') && (cArr[i13 + 2] == 'D' || cArr[i13 + 2] == 'd')))) {
                    this.f4840d = i13 + 4;
                }
            }
            char[] cArr2 = this.f4843g;
            int i14 = this.f4840d;
            return new String(cArr2, i14, i12 - i14);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
    }

    private String b() {
        int i5 = this.f4839c + 1;
        this.f4839c = i5;
        this.f4840d = i5;
        this.f4841e = i5;
        while (true) {
            int i6 = this.f4839c;
            if (i6 != this.f4838b) {
                char[] cArr = this.f4843g;
                char c5 = cArr[i6];
                if (c5 == '\"') {
                    this.f4839c = i6 + 1;
                    while (true) {
                        int i7 = this.f4839c;
                        if (i7 >= this.f4838b || this.f4843g[i7] != ' ') {
                            break;
                        }
                        this.f4839c = i7 + 1;
                    }
                    char[] cArr2 = this.f4843g;
                    int i8 = this.f4840d;
                    return new String(cArr2, i8, this.f4841e - i8);
                }
                if (c5 == '\\') {
                    cArr[this.f4841e] = e();
                } else {
                    cArr[this.f4841e] = c5;
                }
                this.f4839c++;
                this.f4841e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
            }
        }
    }

    private String c() {
        int i5;
        char[] cArr;
        char c5;
        int i6 = this.f4839c;
        if (i6 + 4 < this.f4838b) {
            this.f4840d = i6;
            this.f4839c = i6 + 1;
            while (true) {
                i5 = this.f4839c;
                if (i5 == this.f4838b || (c5 = (cArr = this.f4843g)[i5]) == '+' || c5 == ',' || c5 == ';') {
                    break;
                }
                if (c5 == ' ') {
                    this.f4841e = i5;
                    this.f4839c = i5 + 1;
                    while (true) {
                        int i7 = this.f4839c;
                        if (i7 >= this.f4838b || this.f4843g[i7] != ' ') {
                            break;
                        }
                        this.f4839c = i7 + 1;
                    }
                } else {
                    if (c5 >= 'A' && c5 <= 'F') {
                        cArr[i5] = (char) (c5 + ' ');
                    }
                    this.f4839c = i5 + 1;
                }
            }
            this.f4841e = i5;
            int i8 = this.f4841e;
            int i9 = this.f4840d;
            int i10 = i8 - i9;
            if (i10 >= 5 && (i10 & 1) != 0) {
                int i11 = i10 / 2;
                byte[] bArr = new byte[i11];
                int i12 = i9 + 1;
                for (int i13 = 0; i13 < i11; i13++) {
                    bArr[i13] = (byte) a(i12);
                    i12 += 2;
                }
                return new String(this.f4843g, this.f4840d, i10);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f4842f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String d() {
        /*
            r8 = this;
            int r0 = r8.f4839c
            r8.f4840d = r0
            r8.f4841e = r0
        L6:
            int r0 = r8.f4839c
            int r1 = r8.f4838b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f4843g
            int r2 = r8.f4840d
            int r3 = r8.f4841e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f4843g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f4841e
            int r4 = r3 + 1
            r8.f4841e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f4839c = r0
            goto L6
        L3e:
            int r0 = r8.f4841e
            int r2 = r0 + 1
            r8.f4841e = r2
            char r2 = r8.e()
            r1[r0] = r2
            int r0 = r8.f4839c
            int r0 = r0 + 1
            r8.f4839c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f4840d
            int r3 = r8.f4841e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f4841e
            r8.f4842f = r2
            int r0 = r0 + 1
            r8.f4839c = r0
            int r0 = r2 + 1
            r8.f4841e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f4839c
            int r1 = r8.f4838b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f4843g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f4841e
            int r7 = r1 + 1
            r8.f4841e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f4839c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f4843g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f4843g
            int r2 = r8.f4840d
            int r3 = r8.f4842f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.api.plugin.b.b.d():java.lang.String");
    }

    private char e() {
        int i5 = this.f4839c + 1;
        this.f4839c = i5;
        if (i5 != this.f4838b) {
            char c5 = this.f4843g[i5];
            if (c5 == ' ' || c5 == '%' || c5 == '\\' || c5 == '_' || c5 == '\"' || c5 == '#') {
                return c5;
            }
            switch (c5) {
                case '*':
                case '+':
                case ',':
                    return c5;
                default:
                    switch (c5) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c5;
                        default:
                            return f();
                    }
            }
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f4837a);
    }

    private char f() {
        int i5;
        int i6;
        int a5 = a(this.f4839c);
        this.f4839c++;
        if (a5 < 128) {
            return (char) a5;
        }
        if (a5 < 192 || a5 > 247) {
            return '?';
        }
        if (a5 <= 223) {
            i5 = a5 & 31;
            i6 = 1;
        } else if (a5 <= 239) {
            i5 = a5 & 15;
            i6 = 2;
        } else {
            i5 = a5 & 7;
            i6 = 3;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = this.f4839c + 1;
            this.f4839c = i8;
            if (i8 == this.f4838b || this.f4843g[i8] != '\\') {
                return '?';
            }
            int i9 = i8 + 1;
            this.f4839c = i9;
            int a6 = a(i9);
            this.f4839c++;
            if ((a6 & 192) != 128) {
                return '?';
            }
            i5 = (i5 << 6) + (a6 & 63);
        }
        return (char) i5;
    }

    private int a(int i5) {
        int i6;
        int i7;
        int i8 = i5 + 1;
        if (i8 < this.f4838b) {
            char[] cArr = this.f4843g;
            char c5 = cArr[i5];
            if (c5 >= '0' && c5 <= '9') {
                i6 = c5 - '0';
            } else if (c5 >= 'a' && c5 <= 'f') {
                i6 = c5 - 'W';
            } else {
                if (c5 < 'A' || c5 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f4837a);
                }
                i6 = c5 - '7';
            }
            char c6 = cArr[i8];
            if (c6 >= '0' && c6 <= '9') {
                i7 = c6 - '0';
            } else if (c6 >= 'a' && c6 <= 'f') {
                i7 = c6 - 'W';
            } else {
                if (c6 < 'A' || c6 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.f4837a);
                }
                i7 = c6 - '7';
            }
            return (i6 << 4) + i7;
        }
        throw new IllegalStateException("Malformed DN: " + this.f4837a);
    }

    public String a(String str) {
        String b5;
        this.f4839c = 0;
        this.f4840d = 0;
        this.f4841e = 0;
        this.f4842f = 0;
        this.f4843g = this.f4837a.toCharArray();
        String a5 = a();
        if (a5 == null) {
            return null;
        }
        do {
            int i5 = this.f4839c;
            if (i5 == this.f4838b) {
                return null;
            }
            char c5 = this.f4843g[i5];
            if (c5 == '\"') {
                b5 = b();
            } else if (c5 != '#') {
                b5 = (c5 == '+' || c5 == ',' || c5 == ';') ? "" : d();
            } else {
                b5 = c();
            }
            if (str.equalsIgnoreCase(a5)) {
                return b5;
            }
            int i6 = this.f4839c;
            if (i6 >= this.f4838b) {
                return null;
            }
            char c6 = this.f4843g[i6];
            if (c6 != ',' && c6 != ';' && c6 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f4837a);
            }
            this.f4839c = i6 + 1;
            a5 = a();
        } while (a5 != null);
        throw new IllegalStateException("Malformed DN: " + this.f4837a);
    }
}

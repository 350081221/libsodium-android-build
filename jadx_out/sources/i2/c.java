package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16199a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16200b;

    /* renamed from: c, reason: collision with root package name */
    private int f16201c;

    /* renamed from: d, reason: collision with root package name */
    private int f16202d;

    /* renamed from: e, reason: collision with root package name */
    private int f16203e;

    /* renamed from: f, reason: collision with root package name */
    private int f16204f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f16205g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f16199a = name;
        this.f16200b = name.length();
    }

    private int a(int i5) {
        int i6;
        int i7;
        int i8 = i5 + 1;
        if (i8 < this.f16200b) {
            char[] cArr = this.f16205g;
            char c5 = cArr[i5];
            if (c5 >= '0' && c5 <= '9') {
                i6 = c5 - '0';
            } else if (c5 >= 'a' && c5 <= 'f') {
                i6 = c5 - 'W';
            } else if (c5 >= 'A' && c5 <= 'F') {
                i6 = c5 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f16199a);
            }
            char c6 = cArr[i8];
            if (c6 >= '0' && c6 <= '9') {
                i7 = c6 - '0';
            } else if (c6 >= 'a' && c6 <= 'f') {
                i7 = c6 - 'W';
            } else if (c6 >= 'A' && c6 <= 'F') {
                i7 = c6 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.f16199a);
            }
            return (i6 << 4) + i7;
        }
        throw new IllegalStateException("Malformed DN: " + this.f16199a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f16204f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b() {
        /*
            r8 = this;
            int r0 = r8.f16201c
            r8.f16202d = r0
            r8.f16203e = r0
        L6:
            int r0 = r8.f16201c
            int r1 = r8.f16200b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f16205g
            int r2 = r8.f16202d
            int r3 = r8.f16203e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f16205g
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
            int r3 = r8.f16203e
            int r4 = r3 + 1
            r8.f16203e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f16201c = r0
            goto L6
        L3e:
            int r0 = r8.f16203e
            int r2 = r0 + 1
            r8.f16203e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f16201c
            int r0 = r0 + 1
            r8.f16201c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f16202d
            int r3 = r8.f16203e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f16203e
            r8.f16204f = r2
            int r0 = r0 + 1
            r8.f16201c = r0
            int r0 = r2 + 1
            r8.f16203e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f16201c
            int r1 = r8.f16200b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f16205g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f16203e
            int r7 = r1 + 1
            r8.f16203e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f16201c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f16205g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f16205g
            int r2 = r8.f16202d
            int r3 = r8.f16204f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.b():java.lang.String");
    }

    private char d() {
        int i5 = this.f16201c + 1;
        this.f16201c = i5;
        if (i5 != this.f16200b) {
            char c5 = this.f16205g[i5];
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
        throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
    }

    private char f() {
        int i5;
        int i6;
        int a5 = a(this.f16201c);
        this.f16201c++;
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
            int i8 = this.f16201c + 1;
            this.f16201c = i8;
            if (i8 == this.f16200b || this.f16205g[i8] != '\\') {
                return '?';
            }
            int i9 = i8 + 1;
            this.f16201c = i9;
            int a6 = a(i9);
            this.f16201c++;
            if ((a6 & 192) != 128) {
                return '?';
            }
            i5 = (i5 << 6) + (a6 & 63);
        }
        return (char) i5;
    }

    private String g() {
        int i5;
        char[] cArr;
        char c5;
        int i6 = this.f16201c;
        if (i6 + 4 < this.f16200b) {
            this.f16202d = i6;
            this.f16201c = i6 + 1;
            while (true) {
                i5 = this.f16201c;
                if (i5 == this.f16200b || (c5 = (cArr = this.f16205g)[i5]) == '+' || c5 == ',' || c5 == ';') {
                    break;
                }
                if (c5 == ' ') {
                    this.f16203e = i5;
                    this.f16201c = i5 + 1;
                    while (true) {
                        int i7 = this.f16201c;
                        if (i7 >= this.f16200b || this.f16205g[i7] != ' ') {
                            break;
                        }
                        this.f16201c = i7 + 1;
                    }
                } else {
                    if (c5 >= 'A' && c5 <= 'F') {
                        cArr[i5] = (char) (c5 + ' ');
                    }
                    this.f16201c = i5 + 1;
                }
            }
            this.f16203e = i5;
            int i8 = this.f16203e;
            int i9 = this.f16202d;
            int i10 = i8 - i9;
            if (i10 >= 5 && (i10 & 1) != 0) {
                int i11 = i10 / 2;
                byte[] bArr = new byte[i11];
                int i12 = i9 + 1;
                for (int i13 = 0; i13 < i11; i13++) {
                    bArr[i13] = (byte) a(i12);
                    i12 += 2;
                }
                return new String(this.f16205g, this.f16202d, i10);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
    }

    private String h() {
        int i5;
        int i6;
        int i7;
        int i8;
        char c5;
        char c6;
        char c7;
        int i9;
        int i10;
        char c8;
        char c9;
        while (true) {
            i5 = this.f16201c;
            i6 = this.f16200b;
            if (i5 >= i6 || this.f16205g[i5] != ' ') {
                break;
            }
            this.f16201c = i5 + 1;
        }
        if (i5 == i6) {
            return null;
        }
        this.f16202d = i5;
        this.f16201c = i5 + 1;
        while (true) {
            i7 = this.f16201c;
            i8 = this.f16200b;
            if (i7 >= i8 || (c9 = this.f16205g[i7]) == '=' || c9 == ' ') {
                break;
            }
            this.f16201c = i7 + 1;
        }
        if (i7 < i8) {
            this.f16203e = i7;
            if (this.f16205g[i7] == ' ') {
                while (true) {
                    i9 = this.f16201c;
                    i10 = this.f16200b;
                    if (i9 >= i10 || (c8 = this.f16205g[i9]) == '=' || c8 != ' ') {
                        break;
                    }
                    this.f16201c = i9 + 1;
                }
                if (this.f16205g[i9] != '=' || i9 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
                }
            }
            this.f16201c++;
            while (true) {
                int i11 = this.f16201c;
                if (i11 >= this.f16200b || this.f16205g[i11] != ' ') {
                    break;
                }
                this.f16201c = i11 + 1;
            }
            int i12 = this.f16203e;
            int i13 = this.f16202d;
            if (i12 - i13 > 4) {
                char[] cArr = this.f16205g;
                if (cArr[i13 + 3] == '.' && (((c5 = cArr[i13]) == 'O' || c5 == 'o') && (((c6 = cArr[i13 + 1]) == 'I' || c6 == 'i') && ((c7 = cArr[i13 + 2]) == 'D' || c7 == 'd')))) {
                    this.f16202d = i13 + 4;
                }
            }
            char[] cArr2 = this.f16205g;
            int i14 = this.f16202d;
            return new String(cArr2, i14, i12 - i14);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
    }

    private String i() {
        int i5 = this.f16201c + 1;
        this.f16201c = i5;
        this.f16202d = i5;
        this.f16203e = i5;
        while (true) {
            int i6 = this.f16201c;
            if (i6 != this.f16200b) {
                char[] cArr = this.f16205g;
                char c5 = cArr[i6];
                if (c5 == '\"') {
                    this.f16201c = i6 + 1;
                    while (true) {
                        int i7 = this.f16201c;
                        if (i7 >= this.f16200b || this.f16205g[i7] != ' ') {
                            break;
                        }
                        this.f16201c = i7 + 1;
                    }
                    char[] cArr2 = this.f16205g;
                    int i8 = this.f16202d;
                    return new String(cArr2, i8, this.f16203e - i8);
                }
                if (c5 == '\\') {
                    cArr[this.f16203e] = d();
                } else {
                    cArr[this.f16203e] = c5;
                }
                this.f16201c++;
                this.f16203e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f16199a);
            }
        }
    }

    public String c(String str) {
        String i5;
        this.f16201c = 0;
        this.f16202d = 0;
        this.f16203e = 0;
        this.f16204f = 0;
        this.f16205g = this.f16199a.toCharArray();
        String h5 = h();
        if (h5 == null) {
            return null;
        }
        do {
            int i6 = this.f16201c;
            if (i6 == this.f16200b) {
                return null;
            }
            char c5 = this.f16205g[i6];
            if (c5 != '\"') {
                if (c5 != '#') {
                    if (c5 != '+' && c5 != ',' && c5 != ';') {
                        i5 = b();
                    } else {
                        i5 = "";
                    }
                } else {
                    i5 = g();
                }
            } else {
                i5 = i();
            }
            if (str.equalsIgnoreCase(h5)) {
                return i5;
            }
            int i7 = this.f16201c;
            if (i7 >= this.f16200b) {
                return null;
            }
            char c6 = this.f16205g[i7];
            if (c6 != ',' && c6 != ';' && c6 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f16199a);
            }
            this.f16201c = i7 + 1;
            h5 = h();
        } while (h5 != null);
        throw new IllegalStateException("Malformed DN: " + this.f16199a);
    }

    public List<String> e(String str) {
        String i5;
        this.f16201c = 0;
        this.f16202d = 0;
        this.f16203e = 0;
        this.f16204f = 0;
        this.f16205g = this.f16199a.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String h5 = h();
        if (h5 == null) {
            return emptyList;
        }
        do {
            int i6 = this.f16201c;
            if (i6 < this.f16200b) {
                char c5 = this.f16205g[i6];
                if (c5 != '\"') {
                    if (c5 != '#') {
                        if (c5 != '+' && c5 != ',' && c5 != ';') {
                            i5 = b();
                        } else {
                            i5 = "";
                        }
                    } else {
                        i5 = g();
                    }
                } else {
                    i5 = i();
                }
                if (str.equalsIgnoreCase(h5)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(i5);
                }
                int i7 = this.f16201c;
                if (i7 < this.f16200b) {
                    char c6 = this.f16205g[i7];
                    if (c6 != ',' && c6 != ';' && c6 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.f16199a);
                    }
                    this.f16201c = i7 + 1;
                    h5 = h();
                }
            }
            return emptyList;
        } while (h5 != null);
        throw new IllegalStateException("Malformed DN: " + this.f16199a);
    }
}

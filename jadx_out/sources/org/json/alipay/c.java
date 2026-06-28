package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f21626a;

    /* renamed from: b, reason: collision with root package name */
    public Reader f21627b;

    /* renamed from: c, reason: collision with root package name */
    public char f21628c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21629d;

    public c(Reader reader) {
        this.f21627b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.f21629d = false;
        this.f21626a = 0;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    private String a(int i5) {
        if (i5 == 0) {
            return "";
        }
        char[] cArr = new char[i5];
        int i6 = 0;
        if (this.f21629d) {
            this.f21629d = false;
            cArr[0] = this.f21628c;
            i6 = 1;
        }
        while (i6 < i5) {
            try {
                int read = this.f21627b.read(cArr, i6, i5 - i6);
                if (read == -1) {
                    break;
                }
                i6 += read;
            } catch (IOException e5) {
                throw new JSONException(e5);
            }
        }
        this.f21626a += i6;
        if (i6 < i5) {
            throw a("Substring bounds error");
        }
        this.f21628c = cArr[i5 - 1];
        return new String(cArr);
    }

    public final JSONException a(String str) {
        return new JSONException(str + toString());
    }

    public final void a() {
        int i5;
        if (this.f21629d || (i5 = this.f21626a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.f21626a = i5 - 1;
        this.f21629d = true;
    }

    public final char b() {
        if (this.f21629d) {
            this.f21629d = false;
            char c5 = this.f21628c;
            if (c5 != 0) {
                this.f21626a++;
            }
            return c5;
        }
        try {
            int read = this.f21627b.read();
            if (read <= 0) {
                this.f21628c = (char) 0;
                return (char) 0;
            }
            this.f21626a++;
            char c6 = (char) read;
            this.f21628c = c6;
            return c6;
        } catch (IOException e5) {
            throw new JSONException(e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final char c() {
        /*
            r5 = this;
        L0:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L3e
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1a
            r5.a()
            return r3
        L1a:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L1a
            goto L0
        L25:
            char r0 = r5.b()
            if (r0 == 0) goto L37
            if (r0 != r4) goto L25
            char r0 = r5.b()
            if (r0 == r3) goto L0
            r5.a()
            goto L25
        L37:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.JSONException r0 = r5.a(r0)
            throw r0
        L3e:
            r3 = 35
            if (r0 != r3) goto L4d
        L42:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L42
            goto L0
        L4d:
            if (r0 == 0) goto L53
            r1 = 32
            if (r0 <= r1) goto L0
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.c():char");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0146, code lost:
    
        throw a("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.d():java.lang.Object");
    }

    public final String toString() {
        return " at character " + this.f21626a;
    }
}

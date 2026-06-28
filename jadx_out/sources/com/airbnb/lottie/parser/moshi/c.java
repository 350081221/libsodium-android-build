package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSource;
import okio.b1;
import okio.l;
import okio.n;

/* loaded from: classes2.dex */
public abstract class c implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f1632g = new String[128];

    /* renamed from: a, reason: collision with root package name */
    int f1633a;

    /* renamed from: b, reason: collision with root package name */
    int[] f1634b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f1635c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f1636d = new int[32];

    /* renamed from: e, reason: collision with root package name */
    boolean f1637e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1638f;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String[] f1639a;

        /* renamed from: b, reason: collision with root package name */
        final b1 f1640b;

        private a(String[] strArr, b1 b1Var) {
            this.f1639a = strArr;
            this.f1640b = b1Var;
        }

        public static a a(String... strArr) {
            try {
                n[] nVarArr = new n[strArr.length];
                l lVar = new l();
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    c.P(lVar, strArr[i5]);
                    lVar.readByte();
                    nVarArr[i5] = lVar.m0();
                }
                return new a((String[]) strArr.clone(), b1.k(nVarArr));
            } catch (IOException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f1632g[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f1632g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static c A(BufferedSource bufferedSource) {
        return new e(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(okio.m r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.c.f1632g
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.F(r8, r4, r3)
        L2e:
            r7.C(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.F(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.c.P(okio.m, java.lang.String):void");
    }

    public abstract b H() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(int i5) {
        int i6 = this.f1633a;
        int[] iArr = this.f1634b;
        if (i6 == iArr.length) {
            if (i6 != 256) {
                this.f1634b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f1635c;
                this.f1635c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f1636d;
                this.f1636d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new com.airbnb.lottie.parser.moshi.a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f1634b;
        int i7 = this.f1633a;
        this.f1633a = i7 + 1;
        iArr3[i7] = i5;
    }

    public abstract int J(a aVar) throws IOException;

    public abstract void M() throws IOException;

    public abstract void O() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.airbnb.lottie.parser.moshi.b a0(String str) throws com.airbnb.lottie.parser.moshi.b {
        throw new com.airbnb.lottie.parser.moshi.b(str + " at path " + getPath());
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public final String getPath() {
        return d.a(this.f1633a, this.f1634b, this.f1635c, this.f1636d);
    }

    public abstract void h() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract boolean m() throws IOException;

    public abstract double o() throws IOException;

    public abstract int p() throws IOException;

    public abstract String q() throws IOException;

    public abstract String y() throws IOException;
}

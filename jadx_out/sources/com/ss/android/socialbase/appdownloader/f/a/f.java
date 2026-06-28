package com.ss.android.socialbase.appdownloader.f.a;

import java.io.IOException;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int[] f10338a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f10339b;

    private f() {
    }

    public static f a(d dVar) throws IOException {
        b.a(dVar, 1835009);
        int b5 = dVar.b();
        int b6 = dVar.b();
        int b7 = dVar.b();
        dVar.b();
        int b8 = dVar.b();
        int b9 = dVar.b();
        f fVar = new f();
        fVar.f10338a = dVar.b(b6);
        if (b7 != 0) {
            dVar.b(b7);
        }
        int i5 = (b9 == 0 ? b5 : b9) - b8;
        if (i5 % 4 == 0) {
            fVar.f10339b = dVar.b(i5 / 4);
            if (b9 != 0) {
                int i6 = b5 - b9;
                if (i6 % 4 == 0) {
                    dVar.b(i6 / 4);
                } else {
                    throw new IOException("Style data size is not multiple of 4 (" + i6 + ").");
                }
            }
            return fVar;
        }
        throw new IOException("String data size is not multiple of 4 (" + i5 + ").");
    }

    public String a(int i5) {
        int[] iArr;
        if (i5 < 0 || (iArr = this.f10338a) == null || i5 >= iArr.length) {
            return null;
        }
        int i6 = iArr[i5];
        int a5 = a(this.f10339b, i6);
        StringBuilder sb = new StringBuilder(a5);
        while (a5 != 0) {
            i6 += 2;
            sb.append((char) a(this.f10339b, i6));
            a5--;
        }
        return sb.toString();
    }

    private static final int a(int[] iArr, int i5) {
        int i6 = iArr[i5 / 4];
        return (i5 % 4) / 2 == 0 ? i6 & 65535 : i6 >>> 16;
    }
}

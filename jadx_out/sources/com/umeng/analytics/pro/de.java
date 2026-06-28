package com.umeng.analytics.pro;

/* loaded from: classes3.dex */
public abstract class de {
    public abstract int a(byte[] bArr, int i5, int i6) throws df;

    public void a(int i5) {
    }

    public abstract boolean a();

    public abstract void b() throws df;

    public void b(byte[] bArr) throws df {
        b(bArr, 0, bArr.length);
    }

    public abstract void b(byte[] bArr, int i5, int i6) throws df;

    public abstract void c();

    public int d(byte[] bArr, int i5, int i6) throws df {
        int i7 = 0;
        while (i7 < i6) {
            int a5 = a(bArr, i5 + i7, i6 - i7);
            if (a5 > 0) {
                i7 += a5;
            } else {
                throw new df("Cannot read. Remote side has closed. Tried to read " + i6 + " bytes, but only got " + i7 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
        }
        return i7;
    }

    public void d() throws df {
    }

    public byte[] f() {
        return null;
    }

    public int g() {
        return 0;
    }

    public int h() {
        return -1;
    }

    public boolean i() {
        return a();
    }
}

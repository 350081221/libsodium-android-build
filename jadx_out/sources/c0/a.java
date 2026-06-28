package c0;

import kotlin.y1;

/* loaded from: classes2.dex */
public class a extends a0.a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f683d = true;

    public a(byte[] bArr) {
        super(bArr);
    }

    public static a c(String str, long j5, b bVar, short s5, e eVar) throws Exception {
        byte[] c5 = a0.c.c((byte) 1);
        boolean z4 = f683d;
        if (!z4 && c5.length != 1) {
            throw new AssertionError();
        }
        byte[] e5 = a0.c.e(str.charAt(0), str.charAt(1));
        if (!z4 && e5.length != 2) {
            throw new AssertionError();
        }
        byte[] g5 = a0.c.g(j5);
        if (!z4 && g5.length != 8) {
            throw new AssertionError();
        }
        byte[] k5 = a0.c.k();
        if (!z4 && k5.length != 2) {
            throw new AssertionError();
        }
        bVar.a();
        byte[] c6 = a0.c.c(bVar.f686a);
        if (!z4 && c6.length != 1) {
            throw new AssertionError();
        }
        byte[] c7 = a0.c.c(bVar.f687b);
        if (!z4 && c7.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr = (byte[]) bVar.f688c.clone();
        if (!z4 && bArr.length != (bVar.f687b & y1.f19838d)) {
            throw new AssertionError();
        }
        byte[] h5 = a0.c.h(s5);
        if (!z4 && h5.length != 2) {
            throw new AssertionError();
        }
        byte[] k6 = a0.c.k();
        if (!z4 && k6.length != 2) {
            throw new AssertionError();
        }
        eVar.a();
        byte[] c8 = a0.c.c(eVar.f690a);
        if (!z4 && c8.length != 1) {
            throw new AssertionError();
        }
        byte[] bArr2 = (byte[]) eVar.f691b.clone();
        if (!z4 && bArr2.length != (eVar.f690a & y1.f19838d)) {
            throw new AssertionError();
        }
        byte[] l5 = a0.c.l();
        if (!z4 && l5.length != 4) {
            throw new AssertionError();
        }
        return new a(a0.c.i(c5, e5, g5, k5, c6, c7, bArr, h5, k6, c8, bArr2, l5));
    }

    public static a d() {
        try {
            return c(a0.a.f78c, 0L, new c(""), (short) 0, new f());
        } catch (Exception unused) {
            return null;
        }
    }
}

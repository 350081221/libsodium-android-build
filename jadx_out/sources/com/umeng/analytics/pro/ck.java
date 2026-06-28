package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ck extends cq {

    /* renamed from: d, reason: collision with root package name */
    private static final cv f12407d = new cv("");

    /* renamed from: e, reason: collision with root package name */
    private static final cl f12408e = new cl("", (byte) 0, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f12409f;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f12410h = -126;

    /* renamed from: i, reason: collision with root package name */
    private static final byte f12411i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final byte f12412j = 31;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f12413k = -32;

    /* renamed from: l, reason: collision with root package name */
    private static final int f12414l = 5;

    /* renamed from: a, reason: collision with root package name */
    byte[] f12415a;

    /* renamed from: b, reason: collision with root package name */
    byte[] f12416b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f12417c;

    /* renamed from: m, reason: collision with root package name */
    private bp f12418m;

    /* renamed from: n, reason: collision with root package name */
    private short f12419n;

    /* renamed from: o, reason: collision with root package name */
    private cl f12420o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f12421p;

    /* renamed from: q, reason: collision with root package name */
    private final long f12422q;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f12423r;

    /* loaded from: classes3.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final byte f12425a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final byte f12426b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final byte f12427c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final byte f12428d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final byte f12429e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final byte f12430f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final byte f12431g = 7;

        /* renamed from: h, reason: collision with root package name */
        public static final byte f12432h = 8;

        /* renamed from: i, reason: collision with root package name */
        public static final byte f12433i = 9;

        /* renamed from: j, reason: collision with root package name */
        public static final byte f12434j = 10;

        /* renamed from: k, reason: collision with root package name */
        public static final byte f12435k = 11;

        /* renamed from: l, reason: collision with root package name */
        public static final byte f12436l = 12;

        private b() {
        }
    }

    static {
        f12409f = r0;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    }

    public ck(de deVar, long j5) {
        super(deVar);
        this.f12418m = new bp(15);
        this.f12419n = (short) 0;
        this.f12420o = null;
        this.f12421p = null;
        this.f12415a = new byte[5];
        this.f12416b = new byte[10];
        this.f12423r = new byte[1];
        this.f12417c = new byte[1];
        this.f12422q = j5;
    }

    private int E() throws bx {
        int i5 = 0;
        if (this.f12452g.h() >= 5) {
            byte[] f5 = this.f12452g.f();
            int g5 = this.f12452g.g();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                byte b5 = f5[g5 + i5];
                i6 |= (b5 & kotlin.jvm.internal.o.f19428c) << i7;
                if ((b5 & kotlin.jvm.internal.o.f19427b) != 128) {
                    this.f12452g.a(i5 + 1);
                    return i6;
                }
                i7 += 7;
                i5++;
            }
        } else {
            int i8 = 0;
            while (true) {
                byte u4 = u();
                i5 |= (u4 & kotlin.jvm.internal.o.f19428c) << i8;
                if ((u4 & kotlin.jvm.internal.o.f19427b) != 128) {
                    return i5;
                }
                i8 += 7;
            }
        }
    }

    private long F() throws bx {
        int i5 = 0;
        long j5 = 0;
        if (this.f12452g.h() >= 10) {
            byte[] f5 = this.f12452g.f();
            int g5 = this.f12452g.g();
            long j6 = 0;
            int i6 = 0;
            while (true) {
                j6 |= (r7 & kotlin.jvm.internal.o.f19428c) << i6;
                if ((f5[g5 + i5] & kotlin.jvm.internal.o.f19427b) != 128) {
                    this.f12452g.a(i5 + 1);
                    return j6;
                }
                i6 += 7;
                i5++;
            }
        } else {
            while (true) {
                j5 |= (r0 & kotlin.jvm.internal.o.f19428c) << i5;
                if ((u() & kotlin.jvm.internal.o.f19427b) != 128) {
                    return j5;
                }
                i5 += 7;
            }
        }
    }

    private int c(int i5) {
        return (i5 >> 31) ^ (i5 << 1);
    }

    private long c(long j5) {
        return (j5 >> 63) ^ (j5 << 1);
    }

    private boolean c(byte b5) {
        int i5 = b5 & cx.f12477m;
        return i5 == 1 || i5 == 2;
    }

    private long d(long j5) {
        return (-(j5 & 1)) ^ (j5 >>> 1);
    }

    private byte[] e(int i5) throws bx {
        if (i5 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5];
        this.f12452g.d(bArr, 0, i5);
        return bArr;
    }

    private void f(int i5) throws cr {
        if (i5 >= 0) {
            long j5 = this.f12422q;
            if (j5 != -1 && i5 > j5) {
                throw new cr("Length exceeded max allowed: " + i5);
            }
            return;
        }
        throw new cr("Negative length: " + i5);
    }

    private int g(int i5) {
        return (-(i5 & 1)) ^ (i5 >>> 1);
    }

    @Override // com.umeng.analytics.pro.cq
    public ByteBuffer A() throws bx {
        int E = E();
        f(E);
        if (E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[E];
        this.f12452g.d(bArr, 0, E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cq
    public void B() {
        this.f12418m.c();
        this.f12419n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.cq
    public void a() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(co coVar) throws bx {
        b(f12410h);
        d(((coVar.f12446b << 5) & (-32)) | 1);
        b(coVar.f12447c);
        a(coVar.f12445a);
    }

    @Override // com.umeng.analytics.pro.cq
    public void b() throws bx {
        this.f12419n = this.f12418m.a();
    }

    @Override // com.umeng.analytics.pro.cq
    public void c() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public void d() throws bx {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cq
    public void e() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public void f() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public void g() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public co h() throws bx {
        byte u4 = u();
        if (u4 == -126) {
            byte u5 = u();
            byte b5 = (byte) (u5 & f12412j);
            if (b5 == 1) {
                return new co(z(), (byte) ((u5 >> 5) & 3), E());
            }
            throw new cr("Expected version 1 but got " + ((int) b5));
        }
        throw new cr("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(u4));
    }

    @Override // com.umeng.analytics.pro.cq
    public void i() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public cv j() throws bx {
        this.f12418m.a(this.f12419n);
        this.f12419n = (short) 0;
        return f12407d;
    }

    @Override // com.umeng.analytics.pro.cq
    public void k() throws bx {
        this.f12419n = this.f12418m.a();
    }

    @Override // com.umeng.analytics.pro.cq
    public cl l() throws bx {
        short s5;
        Boolean bool;
        byte u4 = u();
        if (u4 == 0) {
            return f12408e;
        }
        short s6 = (short) ((u4 & 240) >> 4);
        if (s6 == 0) {
            s5 = v();
        } else {
            s5 = (short) (this.f12419n + s6);
        }
        byte b5 = (byte) (u4 & cx.f12477m);
        cl clVar = new cl("", d(b5), s5);
        if (c(u4)) {
            if (b5 == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.f12421p = bool;
        }
        this.f12419n = clVar.f12439c;
        return clVar;
    }

    @Override // com.umeng.analytics.pro.cq
    public void m() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public cn n() throws bx {
        byte u4;
        int E = E();
        if (E == 0) {
            u4 = 0;
        } else {
            u4 = u();
        }
        return new cn(d((byte) (u4 >> 4)), d((byte) (u4 & cx.f12477m)), E);
    }

    @Override // com.umeng.analytics.pro.cq
    public void o() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public cm p() throws bx {
        byte u4 = u();
        int i5 = (u4 >> 4) & 15;
        if (i5 == 15) {
            i5 = E();
        }
        return new cm(d(u4), i5);
    }

    @Override // com.umeng.analytics.pro.cq
    public void q() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public cu r() throws bx {
        return new cu(p());
    }

    @Override // com.umeng.analytics.pro.cq
    public void s() throws bx {
    }

    @Override // com.umeng.analytics.pro.cq
    public boolean t() throws bx {
        Boolean bool = this.f12421p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f12421p = null;
            return booleanValue;
        }
        if (u() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.cq
    public byte u() throws bx {
        if (this.f12452g.h() > 0) {
            byte b5 = this.f12452g.f()[this.f12452g.g()];
            this.f12452g.a(1);
            return b5;
        }
        this.f12452g.d(this.f12417c, 0, 1);
        return this.f12417c[0];
    }

    @Override // com.umeng.analytics.pro.cq
    public short v() throws bx {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.cq
    public int w() throws bx {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.cq
    public long x() throws bx {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.cq
    public double y() throws bx {
        byte[] bArr = new byte[8];
        this.f12452g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.cq
    public String z() throws bx {
        int E = E();
        f(E);
        if (E == 0) {
            return "";
        }
        try {
            if (this.f12452g.h() >= E) {
                String str = new String(this.f12452g.f(), this.f12452g.g(), E, "UTF-8");
                this.f12452g.a(E);
                return str;
            }
            return new String(e(E), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new bx("UTF-8 not supported!");
        }
    }

    /* loaded from: classes3.dex */
    public static class a implements cs {

        /* renamed from: a, reason: collision with root package name */
        private final long f12424a;

        public a() {
            this.f12424a = -1L;
        }

        @Override // com.umeng.analytics.pro.cs
        public cq a(de deVar) {
            return new ck(deVar, this.f12424a);
        }

        public a(int i5) {
            this.f12424a = i5;
        }
    }

    private void b(int i5) throws bx {
        int i6 = 0;
        while ((i5 & o0.a.f20834g) != 0) {
            this.f12415a[i6] = (byte) ((i5 & 127) | 128);
            i5 >>>= 7;
            i6++;
        }
        byte[] bArr = this.f12415a;
        bArr[i6] = (byte) i5;
        this.f12452g.b(bArr, 0, i6 + 1);
    }

    private void d(int i5) throws bx {
        b((byte) i5);
    }

    private byte d(byte b5) throws cr {
        byte b6 = (byte) (b5 & cx.f12477m);
        switch (b6) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return cx.f12477m;
            case 10:
                return cx.f12476l;
            case 11:
                return cx.f12475k;
            case 12:
                return (byte) 12;
            default:
                throw new cr("don't know what type: " + ((int) b6));
        }
    }

    private byte e(byte b5) {
        return f12409f[b5];
    }

    private void b(long j5) throws bx {
        int i5 = 0;
        while (((-128) & j5) != 0) {
            this.f12416b[i5] = (byte) ((127 & j5) | 128);
            j5 >>>= 7;
            i5++;
        }
        byte[] bArr = this.f12416b;
        bArr[i5] = (byte) j5;
        this.f12452g.b(bArr, 0, i5 + 1);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cv cvVar) throws bx {
        this.f12418m.a(this.f12419n);
        this.f12419n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cl clVar) throws bx {
        if (clVar.f12438b == 2) {
            this.f12420o = clVar;
        } else {
            a(clVar, (byte) -1);
        }
    }

    private void b(byte b5) throws bx {
        byte[] bArr = this.f12423r;
        bArr[0] = b5;
        this.f12452g.b(bArr);
    }

    private void a(cl clVar, byte b5) throws bx {
        if (b5 == -1) {
            b5 = e(clVar.f12438b);
        }
        short s5 = clVar.f12439c;
        short s6 = this.f12419n;
        if (s5 > s6 && s5 - s6 <= 15) {
            d(b5 | ((s5 - s6) << 4));
        } else {
            b(b5);
            a(clVar.f12439c);
        }
        this.f12419n = clVar.f12439c;
    }

    public ck(de deVar) {
        this(deVar, -1L);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cn cnVar) throws bx {
        int i5 = cnVar.f12444c;
        if (i5 == 0) {
            d(0);
            return;
        }
        b(i5);
        d(e(cnVar.f12443b) | (e(cnVar.f12442a) << 4));
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cm cmVar) throws bx {
        a(cmVar.f12440a, cmVar.f12441b);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cu cuVar) throws bx {
        a(cuVar.f12462a, cuVar.f12463b);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(boolean z4) throws bx {
        cl clVar = this.f12420o;
        if (clVar != null) {
            a(clVar, z4 ? (byte) 1 : (byte) 2);
            this.f12420o = null;
        } else {
            b(z4 ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(byte b5) throws bx {
        b(b5);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(short s5) throws bx {
        b(c((int) s5));
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(int i5) throws bx {
        b(c(i5));
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(long j5) throws bx {
        b(c(j5));
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(double d5) throws bx {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d5), bArr, 0);
        this.f12452g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(String str) throws bx {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new bx("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(ByteBuffer byteBuffer) throws bx {
        a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    private void a(byte[] bArr, int i5, int i6) throws bx {
        b(i6);
        this.f12452g.b(bArr, i5, i6);
    }

    protected void a(byte b5, int i5) throws bx {
        if (i5 <= 14) {
            d(e(b5) | (i5 << 4));
        } else {
            d(e(b5) | 240);
            b(i5);
        }
    }

    private void a(long j5, byte[] bArr, int i5) {
        bArr[i5 + 0] = (byte) (j5 & 255);
        bArr[i5 + 1] = (byte) ((j5 >> 8) & 255);
        bArr[i5 + 2] = (byte) ((j5 >> 16) & 255);
        bArr[i5 + 3] = (byte) ((j5 >> 24) & 255);
        bArr[i5 + 4] = (byte) ((j5 >> 32) & 255);
        bArr[i5 + 5] = (byte) ((j5 >> 40) & 255);
        bArr[i5 + 6] = (byte) ((j5 >> 48) & 255);
        bArr[i5 + 7] = (byte) ((j5 >> 56) & 255);
    }

    private long a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }
}

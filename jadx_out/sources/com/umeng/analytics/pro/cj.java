package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.y1;

/* loaded from: classes3.dex */
public class cj extends cq {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f12389a = -65536;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f12390b = -2147418112;

    /* renamed from: h, reason: collision with root package name */
    private static final cv f12391h = new cv();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f12392c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f12393d;

    /* renamed from: e, reason: collision with root package name */
    protected int f12394e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f12395f;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f12396i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f12397j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f12398k;

    /* renamed from: l, reason: collision with root package name */
    private byte[] f12399l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f12400m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f12401n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f12402o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f12403p;

    /* loaded from: classes3.dex */
    public static class a implements cs {

        /* renamed from: a, reason: collision with root package name */
        protected boolean f12404a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f12405b;

        /* renamed from: c, reason: collision with root package name */
        protected int f12406c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.cs
        public cq a(de deVar) {
            cj cjVar = new cj(deVar, this.f12404a, this.f12405b);
            int i5 = this.f12406c;
            if (i5 != 0) {
                cjVar.c(i5);
            }
            return cjVar;
        }

        public a(boolean z4, boolean z5) {
            this(z4, z5, 0);
        }

        public a(boolean z4, boolean z5, int i5) {
            this.f12404a = z4;
            this.f12405b = z5;
            this.f12406c = i5;
        }
    }

    public cj(de deVar) {
        this(deVar, false, true);
    }

    @Override // com.umeng.analytics.pro.cq
    public ByteBuffer A() throws bx {
        int w4 = w();
        d(w4);
        if (this.f12452g.h() >= w4) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f12452g.f(), this.f12452g.g(), w4);
            this.f12452g.a(w4);
            return wrap;
        }
        byte[] bArr = new byte[w4];
        this.f12452g.d(bArr, 0, w4);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a() {
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(co coVar) throws bx {
        if (this.f12393d) {
            a(coVar.f12446b | f12390b);
            a(coVar.f12445a);
            a(coVar.f12447c);
        } else {
            a(coVar.f12445a);
            a(coVar.f12446b);
            a(coVar.f12447c);
        }
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cv cvVar) {
    }

    public String b(int i5) throws bx {
        try {
            d(i5);
            byte[] bArr = new byte[i5];
            this.f12452g.d(bArr, 0, i5);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new bx("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.cq
    public void b() {
    }

    @Override // com.umeng.analytics.pro.cq
    public void c() {
    }

    public void c(int i5) {
        this.f12394e = i5;
        this.f12395f = true;
    }

    @Override // com.umeng.analytics.pro.cq
    public void d() throws bx {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.cq
    public void e() {
    }

    @Override // com.umeng.analytics.pro.cq
    public void f() {
    }

    @Override // com.umeng.analytics.pro.cq
    public void g() {
    }

    @Override // com.umeng.analytics.pro.cq
    public co h() throws bx {
        int w4 = w();
        if (w4 < 0) {
            if (((-65536) & w4) == f12390b) {
                return new co(z(), (byte) (w4 & 255), w());
            }
            throw new cr(4, "Bad version in readMessageBegin");
        }
        if (!this.f12392c) {
            return new co(b(w4), u(), w());
        }
        throw new cr(4, "Missing version in readMessageBegin, old client?");
    }

    @Override // com.umeng.analytics.pro.cq
    public void i() {
    }

    @Override // com.umeng.analytics.pro.cq
    public cv j() {
        return f12391h;
    }

    @Override // com.umeng.analytics.pro.cq
    public void k() {
    }

    @Override // com.umeng.analytics.pro.cq
    public cl l() throws bx {
        short v4;
        byte u4 = u();
        if (u4 == 0) {
            v4 = 0;
        } else {
            v4 = v();
        }
        return new cl("", u4, v4);
    }

    @Override // com.umeng.analytics.pro.cq
    public void m() {
    }

    @Override // com.umeng.analytics.pro.cq
    public cn n() throws bx {
        return new cn(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.cq
    public void o() {
    }

    @Override // com.umeng.analytics.pro.cq
    public cm p() throws bx {
        return new cm(u(), w());
    }

    @Override // com.umeng.analytics.pro.cq
    public void q() {
    }

    @Override // com.umeng.analytics.pro.cq
    public cu r() throws bx {
        return new cu(u(), w());
    }

    @Override // com.umeng.analytics.pro.cq
    public void s() {
    }

    @Override // com.umeng.analytics.pro.cq
    public boolean t() throws bx {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.cq
    public byte u() throws bx {
        if (this.f12452g.h() >= 1) {
            byte b5 = this.f12452g.f()[this.f12452g.g()];
            this.f12452g.a(1);
            return b5;
        }
        a(this.f12400m, 0, 1);
        return this.f12400m[0];
    }

    @Override // com.umeng.analytics.pro.cq
    public short v() throws bx {
        int i5;
        byte[] bArr = this.f12401n;
        if (this.f12452g.h() >= 2) {
            bArr = this.f12452g.f();
            i5 = this.f12452g.g();
            this.f12452g.a(2);
        } else {
            a(this.f12401n, 0, 2);
            i5 = 0;
        }
        return (short) ((bArr[i5 + 1] & y1.f19838d) | ((bArr[i5] & y1.f19838d) << 8));
    }

    @Override // com.umeng.analytics.pro.cq
    public int w() throws bx {
        int i5;
        byte[] bArr = this.f12402o;
        if (this.f12452g.h() >= 4) {
            bArr = this.f12452g.f();
            i5 = this.f12452g.g();
            this.f12452g.a(4);
        } else {
            a(this.f12402o, 0, 4);
            i5 = 0;
        }
        return (bArr[i5 + 3] & y1.f19838d) | ((bArr[i5] & y1.f19838d) << 24) | ((bArr[i5 + 1] & y1.f19838d) << 16) | ((bArr[i5 + 2] & y1.f19838d) << 8);
    }

    @Override // com.umeng.analytics.pro.cq
    public long x() throws bx {
        int i5;
        byte[] bArr = this.f12403p;
        if (this.f12452g.h() >= 8) {
            bArr = this.f12452g.f();
            i5 = this.f12452g.g();
            this.f12452g.a(8);
        } else {
            a(this.f12403p, 0, 8);
            i5 = 0;
        }
        return (bArr[i5 + 7] & y1.f19838d) | ((bArr[i5] & y1.f19838d) << 56) | ((bArr[i5 + 1] & y1.f19838d) << 48) | ((bArr[i5 + 2] & y1.f19838d) << 40) | ((bArr[i5 + 3] & y1.f19838d) << 32) | ((bArr[i5 + 4] & y1.f19838d) << 24) | ((bArr[i5 + 5] & y1.f19838d) << 16) | ((bArr[i5 + 6] & y1.f19838d) << 8);
    }

    @Override // com.umeng.analytics.pro.cq
    public double y() throws bx {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.cq
    public String z() throws bx {
        int w4 = w();
        if (this.f12452g.h() >= w4) {
            try {
                String str = new String(this.f12452g.f(), this.f12452g.g(), w4, "UTF-8");
                this.f12452g.a(w4);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new bx("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(w4);
    }

    public cj(de deVar, boolean z4, boolean z5) {
        super(deVar);
        this.f12395f = false;
        this.f12396i = new byte[1];
        this.f12397j = new byte[2];
        this.f12398k = new byte[4];
        this.f12399l = new byte[8];
        this.f12400m = new byte[1];
        this.f12401n = new byte[2];
        this.f12402o = new byte[4];
        this.f12403p = new byte[8];
        this.f12392c = z4;
        this.f12393d = z5;
    }

    protected void d(int i5) throws bx {
        if (i5 >= 0) {
            if (this.f12395f) {
                int i6 = this.f12394e - i5;
                this.f12394e = i6;
                if (i6 >= 0) {
                    return;
                }
                throw new cr("Message length exceeded: " + i5);
            }
            return;
        }
        throw new cr("Negative length: " + i5);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cl clVar) throws bx {
        a(clVar.f12438b);
        a(clVar.f12439c);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cn cnVar) throws bx {
        a(cnVar.f12442a);
        a(cnVar.f12443b);
        a(cnVar.f12444c);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cm cmVar) throws bx {
        a(cmVar.f12440a);
        a(cmVar.f12441b);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(cu cuVar) throws bx {
        a(cuVar.f12462a);
        a(cuVar.f12463b);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(boolean z4) throws bx {
        a(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(byte b5) throws bx {
        byte[] bArr = this.f12396i;
        bArr[0] = b5;
        this.f12452g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(short s5) throws bx {
        byte[] bArr = this.f12397j;
        bArr[0] = (byte) ((s5 >> 8) & 255);
        bArr[1] = (byte) (s5 & 255);
        this.f12452g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(int i5) throws bx {
        byte[] bArr = this.f12398k;
        bArr[0] = (byte) ((i5 >> 24) & 255);
        bArr[1] = (byte) ((i5 >> 16) & 255);
        bArr[2] = (byte) ((i5 >> 8) & 255);
        bArr[3] = (byte) (i5 & 255);
        this.f12452g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(long j5) throws bx {
        byte[] bArr = this.f12399l;
        bArr[0] = (byte) ((j5 >> 56) & 255);
        bArr[1] = (byte) ((j5 >> 48) & 255);
        bArr[2] = (byte) ((j5 >> 40) & 255);
        bArr[3] = (byte) ((j5 >> 32) & 255);
        bArr[4] = (byte) ((j5 >> 24) & 255);
        bArr[5] = (byte) ((j5 >> 16) & 255);
        bArr[6] = (byte) ((j5 >> 8) & 255);
        bArr[7] = (byte) (j5 & 255);
        this.f12452g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(double d5) throws bx {
        a(Double.doubleToLongBits(d5));
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(String str) throws bx {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.f12452g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new bx("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.cq
    public void a(ByteBuffer byteBuffer) throws bx {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.f12452g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    private int a(byte[] bArr, int i5, int i6) throws bx {
        d(i6);
        return this.f12452g.d(bArr, i5, i6);
    }
}

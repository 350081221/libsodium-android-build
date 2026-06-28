package com.umeng.analytics.pro;

/* loaded from: classes3.dex */
public final class dd extends de {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f12507a;

    /* renamed from: b, reason: collision with root package name */
    private int f12508b;

    /* renamed from: c, reason: collision with root package name */
    private int f12509c;

    public dd() {
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.de
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.de
    public void b() throws df {
    }

    @Override // com.umeng.analytics.pro.de
    public void b(byte[] bArr, int i5, int i6) throws df {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.de
    public void c() {
    }

    public void c(byte[] bArr, int i5, int i6) {
        this.f12507a = bArr;
        this.f12508b = i5;
        this.f12509c = i5 + i6;
    }

    public void e() {
        this.f12507a = null;
    }

    @Override // com.umeng.analytics.pro.de
    public byte[] f() {
        return this.f12507a;
    }

    @Override // com.umeng.analytics.pro.de
    public int g() {
        return this.f12508b;
    }

    @Override // com.umeng.analytics.pro.de
    public int h() {
        return this.f12509c - this.f12508b;
    }

    public dd(byte[] bArr) {
        a(bArr);
    }

    @Override // com.umeng.analytics.pro.de
    public int a(byte[] bArr, int i5, int i6) throws df {
        int h5 = h();
        if (i6 > h5) {
            i6 = h5;
        }
        if (i6 > 0) {
            System.arraycopy(this.f12507a, this.f12508b, bArr, i5, i6);
            a(i6);
        }
        return i6;
    }

    public dd(byte[] bArr, int i5, int i6) {
        c(bArr, i5, i6);
    }

    @Override // com.umeng.analytics.pro.de
    public void a(int i5) {
        this.f12508b += i5;
    }
}

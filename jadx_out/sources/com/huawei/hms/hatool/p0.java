package com.huawei.hms.hatool;

/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8663a;

    /* renamed from: b, reason: collision with root package name */
    public int f8664b = 0;

    public p0(int i5) {
        this.f8663a = null;
        this.f8663a = new byte[i5];
    }

    public void a(byte[] bArr, int i5) {
        if (i5 <= 0) {
            return;
        }
        byte[] bArr2 = this.f8663a;
        int length = bArr2.length;
        int i6 = this.f8664b;
        if (length - i6 >= i5) {
            System.arraycopy(bArr, 0, bArr2, i6, i5);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i5) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i6);
            System.arraycopy(bArr, 0, bArr3, this.f8664b, i5);
            this.f8663a = bArr3;
        }
        this.f8664b += i5;
    }

    public byte[] a() {
        int i5 = this.f8664b;
        if (i5 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5];
        System.arraycopy(this.f8663a, 0, bArr, 0, i5);
        return bArr;
    }

    public int b() {
        return this.f8664b;
    }
}

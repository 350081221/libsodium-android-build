package com.umeng.analytics.pro;

/* loaded from: classes3.dex */
public class bp {

    /* renamed from: a, reason: collision with root package name */
    private short[] f12346a;

    /* renamed from: b, reason: collision with root package name */
    private int f12347b = -1;

    public bp(int i5) {
        this.f12346a = new short[i5];
    }

    private void d() {
        short[] sArr = this.f12346a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f12346a = sArr2;
    }

    public short a() {
        short[] sArr = this.f12346a;
        int i5 = this.f12347b;
        this.f12347b = i5 - 1;
        return sArr[i5];
    }

    public short b() {
        return this.f12346a[this.f12347b];
    }

    public void c() {
        this.f12347b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i5 = 0; i5 < this.f12346a.length; i5++) {
            if (i5 != 0) {
                sb.append(" ");
            }
            if (i5 == this.f12347b) {
                sb.append(">>");
            }
            sb.append((int) this.f12346a[i5]);
            if (i5 == this.f12347b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    public void a(short s5) {
        if (this.f12346a.length == this.f12347b + 1) {
            d();
        }
        short[] sArr = this.f12346a;
        int i5 = this.f12347b + 1;
        this.f12347b = i5;
        sArr[i5] = s5;
    }
}

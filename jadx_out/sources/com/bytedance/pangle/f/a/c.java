package com.bytedance.pangle.f.a;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    int[] f4399a = new int[32];

    /* renamed from: b, reason: collision with root package name */
    int f4400b;

    /* renamed from: c, reason: collision with root package name */
    int f4401c;

    public final void a() {
        b();
        int i5 = this.f4400b;
        int[] iArr = this.f4399a;
        iArr[i5] = 0;
        iArr[i5 + 1] = 0;
        this.f4400b = i5 + 2;
        this.f4401c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int[] iArr = this.f4399a;
        int length = iArr.length;
        int i5 = this.f4400b;
        int i6 = length - i5;
        if (i6 <= 2) {
            int[] iArr2 = new int[(iArr.length + i6) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f4399a = iArr2;
        }
    }
}

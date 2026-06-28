package com.bytedance.pangle.f.a;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    int[] f4404a;

    /* renamed from: b, reason: collision with root package name */
    int[] f4405b;

    public final String a(int i5) {
        int[] iArr;
        if (i5 < 0 || (iArr = this.f4404a) == null || i5 >= iArr.length) {
            return null;
        }
        int i6 = iArr[i5];
        int a5 = a(this.f4405b, i6);
        StringBuilder sb = new StringBuilder(a5);
        while (a5 != 0) {
            i6 += 2;
            sb.append((char) a(this.f4405b, i6));
            a5--;
        }
        return sb.toString();
    }

    private static final int a(int[] iArr, int i5) {
        int i6 = iArr[i5 / 4];
        return (i5 % 4) / 2 == 0 ? i6 & 65535 : i6 >>> 16;
    }
}

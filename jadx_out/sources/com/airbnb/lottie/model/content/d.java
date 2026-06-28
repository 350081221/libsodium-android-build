package com.airbnb.lottie.model.content;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f1407a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1408b;

    public d(float[] fArr, int[] iArr) {
        this.f1407a = fArr;
        this.f1408b = iArr;
    }

    private void a(d dVar) {
        int i5 = 0;
        while (true) {
            int[] iArr = dVar.f1408b;
            if (i5 < iArr.length) {
                this.f1407a[i5] = dVar.f1407a[i5];
                this.f1408b[i5] = iArr[i5];
                i5++;
            } else {
                return;
            }
        }
    }

    private int c(float f5) {
        int binarySearch = Arrays.binarySearch(this.f1407a, f5);
        if (binarySearch >= 0) {
            return this.f1408b[binarySearch];
        }
        int i5 = -(binarySearch + 1);
        if (i5 == 0) {
            return this.f1408b[0];
        }
        int[] iArr = this.f1408b;
        if (i5 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f1407a;
        int i6 = i5 - 1;
        float f6 = fArr[i6];
        return com.airbnb.lottie.utils.d.c((f5 - f6) / (fArr[i5] - f6), iArr[i6], iArr[i5]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            iArr[i5] = c(fArr[i5]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f1408b;
    }

    public float[] e() {
        return this.f1407a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Arrays.equals(this.f1407a, dVar.f1407a) && Arrays.equals(this.f1408b, dVar.f1408b)) {
            return true;
        }
        return false;
    }

    public int f() {
        return this.f1408b.length;
    }

    public void g(d dVar, d dVar2, float f5) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f5 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f5 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f1408b.length == dVar2.f1408b.length) {
            int i5 = 0;
            while (true) {
                iArr = dVar.f1408b;
                if (i5 >= iArr.length) {
                    break;
                }
                this.f1407a[i5] = com.airbnb.lottie.utils.k.k(dVar.f1407a[i5], dVar2.f1407a[i5], f5);
                this.f1408b[i5] = com.airbnb.lottie.utils.d.c(f5, dVar.f1408b[i5], dVar2.f1408b[i5]);
                i5++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f1407a;
                if (length < fArr.length) {
                    int[] iArr2 = dVar.f1408b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.f1408b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f1408b.length + " vs " + dVar2.f1408b.length + ")");
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f1407a) * 31) + Arrays.hashCode(this.f1408b);
    }
}

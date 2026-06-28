package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class o implements n0<com.airbnb.lottie.model.content.d> {

    /* renamed from: a, reason: collision with root package name */
    private int f1695a;

    public o(int i5) {
        this.f1695a = i5;
    }

    private com.airbnb.lottie.model.content.d b(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i5 = this.f1695a * 4;
        if (list.size() <= i5) {
            return dVar;
        }
        float[] e5 = dVar.e();
        int[] d5 = dVar.d();
        int size = (list.size() - i5) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i6 = 0;
        while (i5 < list.size()) {
            if (i5 % 2 == 0) {
                fArr[i6] = list.get(i5).floatValue();
            } else {
                fArr2[i6] = list.get(i5).floatValue();
                i6++;
            }
            i5++;
        }
        float[] e6 = e(dVar.e(), fArr);
        int length = e6.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            float f5 = e6[i7];
            int binarySearch = Arrays.binarySearch(e5, f5);
            int binarySearch2 = Arrays.binarySearch(fArr, f5);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i7] = d(f5, d5[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i7] = c(f5, fArr2[binarySearch2], e5, d5);
            }
        }
        return new com.airbnb.lottie.model.content.d(e6, iArr);
    }

    private int d(float f5, int i5, float[] fArr, float[] fArr2) {
        float k5;
        if (fArr2.length >= 2 && f5 > fArr[0]) {
            for (int i6 = 1; i6 < fArr.length; i6++) {
                float f6 = fArr[i6];
                if (f6 >= f5 || i6 == fArr.length - 1) {
                    if (f6 <= f5) {
                        k5 = fArr2[i6];
                    } else {
                        int i7 = i6 - 1;
                        float f7 = fArr[i7];
                        k5 = com.airbnb.lottie.utils.k.k(fArr2[i7], fArr2[i6], (f5 - f7) / (f6 - f7));
                    }
                    return Color.argb((int) (k5 * 255.0f), Color.red(i5), Color.green(i5), Color.blue(i5));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        float f5;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            float f6 = Float.NaN;
            if (i6 < fArr.length) {
                f5 = fArr[i6];
            } else {
                f5 = Float.NaN;
            }
            if (i7 < fArr2.length) {
                f6 = fArr2[i7];
            }
            if (!Float.isNaN(f6) && f5 >= f6) {
                if (!Float.isNaN(f5) && f6 >= f5) {
                    fArr3[i8] = f5;
                    i6++;
                    i7++;
                    i5++;
                } else {
                    fArr3[i8] = f6;
                    i7++;
                }
            } else {
                fArr3[i8] = f5;
                i6++;
            }
        }
        if (i5 == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i5);
    }

    int c(float f5, float f6, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f5 != fArr[0]) {
            for (int i5 = 1; i5 < fArr.length; i5++) {
                float f7 = fArr[i5];
                if (f7 >= f5 || i5 == fArr.length - 1) {
                    if (i5 == fArr.length - 1 && f5 >= f7) {
                        return Color.argb((int) (f6 * 255.0f), Color.red(iArr[i5]), Color.green(iArr[i5]), Color.blue(iArr[i5]));
                    }
                    int i6 = i5 - 1;
                    float f8 = fArr[i6];
                    int c5 = com.airbnb.lottie.utils.d.c((f5 - f8) / (f7 - f8), iArr[i6], iArr[i5]);
                    return Color.argb((int) (f6 * 255.0f), Color.red(c5), Color.green(c5), Color.blue(c5));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        if (cVar.H() == c.b.BEGIN_ARRAY) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            cVar.b();
        }
        while (cVar.j()) {
            arrayList.add(Float.valueOf((float) cVar.o()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f1695a = 2;
        }
        if (z4) {
            cVar.d();
        }
        if (this.f1695a == -1) {
            this.f1695a = arrayList.size() / 4;
        }
        int i5 = this.f1695a;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < this.f1695a * 4; i8++) {
            int i9 = i8 / 4;
            double floatValue = arrayList.get(i8).floatValue();
            int i10 = i8 % 4;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            iArr[i9] = Color.argb(255, i6, i7, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i7 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i6 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i9 > 0) {
                    float f6 = (float) floatValue;
                    if (fArr[i9 - 1] >= f6) {
                        fArr[i9] = f6 + 0.01f;
                    }
                }
                fArr[i9] = (float) floatValue;
            }
        }
        return b(new com.airbnb.lottie.model.content.d(fArr, iArr), arrayList);
    }
}

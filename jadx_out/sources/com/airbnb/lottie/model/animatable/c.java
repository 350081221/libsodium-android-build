package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends n<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> {
    public c(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super((List) e(list));
    }

    private static com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> d(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar) {
        com.airbnb.lottie.model.content.d dVar = aVar.f1782b;
        com.airbnb.lottie.model.content.d dVar2 = aVar.f1783c;
        if (dVar != null && dVar2 != null && dVar.e().length != dVar2.e().length) {
            float[] f5 = f(dVar.e(), dVar2.e());
            return aVar.b(dVar.b(f5), dVar2.b(f5));
        }
        return aVar;
    }

    private static List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.set(i5, d(list.get(i5)));
        }
        return list;
    }

    static float[] f(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f5 = Float.NaN;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            float f6 = fArr3[i6];
            if (f6 != f5) {
                fArr3[i5] = f6;
                i5++;
                f5 = fArr3[i6];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i5);
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a() {
        return new com.airbnb.lottie.animation.keyframe.e(this.f1382a);
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // com.airbnb.lottie.model.animatable.n, com.airbnb.lottie.model.animatable.m
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // com.airbnb.lottie.model.animatable.n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

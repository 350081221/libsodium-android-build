package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes2.dex */
public class d extends g<Float> {
    public d(List<com.airbnb.lottie.value.a<Float>> list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    float r(com.airbnb.lottie.value.a<Float> aVar, float f5) {
        Float f6;
        if (aVar.f1782b != null && aVar.f1783c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f1073e;
            if (jVar != 0 && (f6 = (Float) jVar.b(aVar.f1787g, aVar.f1788h.floatValue(), aVar.f1782b, aVar.f1783c, f5, e(), f())) != null) {
                return f6.floatValue();
            }
            return com.airbnb.lottie.utils.k.k(aVar.g(), aVar.d(), f5);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(com.airbnb.lottie.value.a<Float> aVar, float f5) {
        return Float.valueOf(r(aVar, f5));
    }
}

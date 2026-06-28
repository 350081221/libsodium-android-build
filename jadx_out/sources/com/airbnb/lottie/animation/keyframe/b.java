package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes2.dex */
public class b extends g<Integer> {
    public b(List<com.airbnb.lottie.value.a<Integer>> list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(com.airbnb.lottie.value.a<Integer> aVar, float f5) {
        Float f6;
        Integer num;
        if (aVar.f1782b != null && aVar.f1783c != null) {
            com.airbnb.lottie.value.j<A> jVar = this.f1073e;
            if (jVar != 0 && (f6 = aVar.f1788h) != null && (num = (Integer) jVar.b(aVar.f1787g, f6.floatValue(), aVar.f1782b, aVar.f1783c, f5, e(), f())) != null) {
                return num.intValue();
            }
            return com.airbnb.lottie.utils.d.c(com.airbnb.lottie.utils.k.c(f5, 0.0f, 1.0f), aVar.f1782b.intValue(), aVar.f1783c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(com.airbnb.lottie.value.a<Integer> aVar, float f5) {
        return Integer.valueOf(r(aVar, f5));
    }
}

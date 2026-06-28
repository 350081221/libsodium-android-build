package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes2.dex */
public class l extends g<com.airbnb.lottie.value.k> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.value.k f1104i;

    public l(List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>> list) {
        super(list);
        this.f1104i = new com.airbnb.lottie.value.k();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k i(com.airbnb.lottie.value.a<com.airbnb.lottie.value.k> aVar, float f5) {
        com.airbnb.lottie.value.k kVar;
        com.airbnb.lottie.value.k kVar2;
        com.airbnb.lottie.value.k kVar3 = aVar.f1782b;
        if (kVar3 != null && (kVar = aVar.f1783c) != null) {
            com.airbnb.lottie.value.k kVar4 = kVar3;
            com.airbnb.lottie.value.k kVar5 = kVar;
            com.airbnb.lottie.value.j<A> jVar = this.f1073e;
            if (jVar != 0 && (kVar2 = (com.airbnb.lottie.value.k) jVar.b(aVar.f1787g, aVar.f1788h.floatValue(), kVar4, kVar5, f5, e(), f())) != null) {
                return kVar2;
            }
            this.f1104i.d(com.airbnb.lottie.utils.k.k(kVar4.b(), kVar5.b(), f5), com.airbnb.lottie.utils.k.k(kVar4.c(), kVar5.c(), f5));
            return this.f1104i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

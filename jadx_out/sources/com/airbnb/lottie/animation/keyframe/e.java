package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes2.dex */
public class e extends g<com.airbnb.lottie.model.content.d> {

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.d f1093i;

    public e(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d>> list) {
        super(list);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.airbnb.lottie.model.content.d dVar = list.get(i6).f1782b;
            if (dVar != null) {
                i5 = Math.max(i5, dVar.f());
            }
        }
        this.f1093i = new com.airbnb.lottie.model.content.d(new float[i5], new int[i5]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.d> aVar, float f5) {
        this.f1093i.g(aVar.f1782b, aVar.f1783c, f5);
        return this.f1093i;
    }
}

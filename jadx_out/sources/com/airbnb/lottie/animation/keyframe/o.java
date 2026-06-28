package com.airbnb.lottie.animation.keyframe;

import java.util.List;

/* loaded from: classes2.dex */
public class o extends g<com.airbnb.lottie.model.b> {

    /* loaded from: classes2.dex */
    class a extends com.airbnb.lottie.value.j<com.airbnb.lottie.model.b> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.b f1116d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f1117e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.model.b f1118f;

        a(com.airbnb.lottie.value.b bVar, com.airbnb.lottie.value.j jVar, com.airbnb.lottie.model.b bVar2) {
            this.f1116d = bVar;
            this.f1117e = jVar;
            this.f1118f = bVar2;
        }

        @Override // com.airbnb.lottie.value.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.airbnb.lottie.model.b a(com.airbnb.lottie.value.b<com.airbnb.lottie.model.b> bVar) {
            com.airbnb.lottie.model.b g5;
            this.f1116d.h(bVar.f(), bVar.a(), bVar.g().f1383a, bVar.b().f1383a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f1117e.a(this.f1116d);
            if (bVar.c() == 1.0f) {
                g5 = bVar.b();
            } else {
                g5 = bVar.g();
            }
            com.airbnb.lottie.model.b bVar2 = g5;
            this.f1118f.a(str, bVar2.f1384b, bVar2.f1385c, bVar2.f1386d, bVar2.f1387e, bVar2.f1388f, bVar2.f1389g, bVar2.f1390h, bVar2.f1391i, bVar2.f1392j, bVar2.f1393k, bVar2.f1394l, bVar2.f1395m);
            return this.f1118f;
        }
    }

    public o(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.b i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.b> aVar, float f5) {
        com.airbnb.lottie.model.b bVar;
        float floatValue;
        com.airbnb.lottie.model.b bVar2;
        com.airbnb.lottie.value.j<A> jVar = this.f1073e;
        if (jVar != 0) {
            float f6 = aVar.f1787g;
            Float f7 = aVar.f1788h;
            if (f7 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f7.floatValue();
            }
            com.airbnb.lottie.model.b bVar3 = aVar.f1782b;
            com.airbnb.lottie.model.b bVar4 = bVar3;
            com.airbnb.lottie.model.b bVar5 = aVar.f1783c;
            if (bVar5 == null) {
                bVar2 = bVar3;
            } else {
                bVar2 = bVar5;
            }
            return (com.airbnb.lottie.model.b) jVar.b(f6, floatValue, bVar4, bVar2, f5, d(), f());
        }
        if (f5 == 1.0f && (bVar = aVar.f1783c) != null) {
            return bVar;
        }
        return aVar.f1782b;
    }

    public void r(com.airbnb.lottie.value.j<String> jVar) {
        super.o(new a(new com.airbnb.lottie.value.b(), jVar, new com.airbnb.lottie.model.b()));
    }
}

package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static c.a f1709a = c.a.a("k");

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f5, n0<T> n0Var, boolean z4) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.H() == c.b.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.j()) {
            if (cVar.J(f1709a) != 0) {
                cVar.O();
            } else if (cVar.H() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.H() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, kVar, f5, n0Var, false, z4));
                } else {
                    while (cVar.j()) {
                        arrayList.add(t.c(cVar, kVar, f5, n0Var, true, z4));
                    }
                }
                cVar.d();
            } else {
                arrayList.add(t.c(cVar, kVar, f5, n0Var, false, z4));
            }
        }
        cVar.h();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends com.airbnb.lottie.value.a<T>> list) {
        int i5;
        T t5;
        int size = list.size();
        int i6 = 0;
        while (true) {
            i5 = size - 1;
            if (i6 >= i5) {
                break;
            }
            com.airbnb.lottie.value.a<T> aVar = list.get(i6);
            i6++;
            com.airbnb.lottie.value.a<T> aVar2 = list.get(i6);
            aVar.f1788h = Float.valueOf(aVar2.f1787g);
            if (aVar.f1783c == null && (t5 = aVar2.f1782b) != null) {
                aVar.f1783c = t5;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).j();
                }
            }
        }
        com.airbnb.lottie.value.a<T> aVar3 = list.get(i5);
        if ((aVar3.f1782b == null || aVar3.f1783c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}

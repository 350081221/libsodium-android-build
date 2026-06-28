package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class h0 implements n0<com.airbnb.lottie.model.content.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f1607a = new h0();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1608b = c.a.a("c", "v", "i", "o");

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.o a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        if (cVar.H() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z4 = false;
        while (cVar.j()) {
            int J = cVar.J(f1608b);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            cVar.M();
                            cVar.O();
                        } else {
                            list3 = s.f(cVar, f5);
                        }
                    } else {
                        list2 = s.f(cVar, f5);
                    }
                } else {
                    list = s.f(cVar, f5);
                }
            } else {
                z4 = cVar.m();
            }
        }
        cVar.h();
        if (cVar.H() == c.b.END_ARRAY) {
            cVar.d();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new com.airbnb.lottie.model.content.o(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i5 = 1; i5 < size; i5++) {
                PointF pointF2 = list.get(i5);
                int i6 = i5 - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.k.a(list.get(i6), list3.get(i6)), com.airbnb.lottie.utils.k.a(pointF2, list2.get(i5)), pointF2));
            }
            if (z4) {
                PointF pointF3 = list.get(0);
                int i7 = size - 1;
                arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.k.a(list.get(i7), list3.get(i7)), com.airbnb.lottie.utils.k.a(pointF3, list2.get(0)), pointF3));
            }
            return new com.airbnb.lottie.model.content.o(pointF, z4, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}

package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1592a = c.a.a(bi.ay);

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1593b = c.a.a("fc", "sc", "sw", bi.aL);

    private b() {
    }

    public static com.airbnb.lottie.model.animatable.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.k kVar2 = null;
        while (cVar.j()) {
            if (cVar.J(f1592a) != 0) {
                cVar.M();
                cVar.O();
            } else {
                kVar2 = b(cVar, kVar);
            }
        }
        cVar.h();
        if (kVar2 == null) {
            return new com.airbnb.lottie.model.animatable.k(null, null, null, null);
        }
        return kVar2;
    }

    private static com.airbnb.lottie.model.animatable.k b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.a aVar = null;
        com.airbnb.lottie.model.animatable.a aVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (cVar.j()) {
            int J = cVar.J(f1593b);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            cVar.M();
                            cVar.O();
                        } else {
                            bVar2 = d.e(cVar, kVar);
                        }
                    } else {
                        bVar = d.e(cVar, kVar);
                    }
                } else {
                    aVar2 = d.c(cVar, kVar);
                }
            } else {
                aVar = d.c(cVar, kVar);
            }
        }
        cVar.h();
        return new com.airbnb.lottie.model.animatable.k(aVar, aVar2, bVar, bVar2);
    }
}

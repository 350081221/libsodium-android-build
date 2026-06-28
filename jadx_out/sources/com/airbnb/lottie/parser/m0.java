package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1631a = c.a.a(bi.aE, "e", "o", "nm", "m", "hd");

    private m0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.t a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        t.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z4 = false;
        while (cVar.j()) {
            int J = cVar.J(f1631a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                if (J != 5) {
                                    cVar.O();
                                } else {
                                    z4 = cVar.m();
                                }
                            } else {
                                aVar = t.a.forId(cVar.p());
                            }
                        } else {
                            str = cVar.y();
                        }
                    } else {
                        bVar3 = d.f(cVar, kVar, false);
                    }
                } else {
                    bVar2 = d.f(cVar, kVar, false);
                }
            } else {
                bVar = d.f(cVar, kVar, false);
            }
        }
        return new com.airbnb.lottie.model.content.t(str, aVar, bVar, bVar2, bVar3, z4);
    }
}

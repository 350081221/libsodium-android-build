package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1601a = c.a.a("nm", "c", "o", "tr", "hd");

    private e0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.m a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        boolean z4 = false;
        while (cVar.j()) {
            int J = cVar.J(f1601a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                cVar.O();
                            } else {
                                z4 = cVar.m();
                            }
                        } else {
                            lVar = c.g(cVar, kVar);
                        }
                    } else {
                        bVar2 = d.f(cVar, kVar, false);
                    }
                } else {
                    bVar = d.f(cVar, kVar, false);
                }
            } else {
                str = cVar.y();
            }
        }
        return new com.airbnb.lottie.model.content.m(str, bVar, bVar2, lVar, z4);
    }
}

package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.io.IOException;

/* loaded from: classes2.dex */
class k0 {

    /* renamed from: a, reason: collision with root package name */
    static c.a f1625a = c.a.a("nm", "ind", MediationConstant.ADN_KS, "hd");

    private k0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.r a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        int i5 = 0;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.h hVar = null;
        while (cVar.j()) {
            int J = cVar.J(f1625a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            cVar.O();
                        } else {
                            z4 = cVar.m();
                        }
                    } else {
                        hVar = d.k(cVar, kVar);
                    }
                } else {
                    i5 = cVar.p();
                }
            } else {
                str = cVar.y();
            }
        }
        return new com.airbnb.lottie.model.content.r(str, i5, hVar, z4);
    }
}

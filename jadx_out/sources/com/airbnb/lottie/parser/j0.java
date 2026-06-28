package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1617a = c.a.a("nm", "hd", "it");

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.q a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z4 = false;
        while (cVar.j()) {
            int J = cVar.J(f1617a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        cVar.O();
                    } else {
                        cVar.b();
                        while (cVar.j()) {
                            com.airbnb.lottie.model.content.c a5 = h.a(cVar, kVar);
                            if (a5 != null) {
                                arrayList.add(a5);
                            }
                        }
                        cVar.d();
                    }
                } else {
                    z4 = cVar.m();
                }
            } else {
                str = cVar.y();
            }
        }
        return new com.airbnb.lottie.model.content.q(str, arrayList, z4);
    }
}

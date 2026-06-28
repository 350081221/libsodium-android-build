package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1718a = c.a.a("nm", "mm", "hd");

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.j a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        String str = null;
        boolean z4 = false;
        j.a aVar = null;
        while (cVar.j()) {
            int J = cVar.J(f1718a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        cVar.M();
                        cVar.O();
                    } else {
                        z4 = cVar.m();
                    }
                } else {
                    aVar = j.a.forId(cVar.p());
                }
            } else {
                str = cVar.y();
            }
        }
        return new com.airbnb.lottie.model.content.j(str, aVar, z4);
    }
}

package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1599a = c.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1600b = c.a.a(y0.a.f22651s, "v");

    e() {
    }

    @Nullable
    private static com.airbnb.lottie.model.content.a a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.content.a aVar = null;
        while (true) {
            boolean z4 = false;
            while (cVar.j()) {
                int J = cVar.J(f1600b);
                if (J != 0) {
                    if (J != 1) {
                        cVar.M();
                        cVar.O();
                    } else if (z4) {
                        aVar = new com.airbnb.lottie.model.content.a(d.e(cVar, kVar));
                    } else {
                        cVar.O();
                    }
                } else if (cVar.p() == 0) {
                    z4 = true;
                }
            }
            cVar.h();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static com.airbnb.lottie.model.content.a b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.content.a aVar = null;
        while (cVar.j()) {
            if (cVar.J(f1599a) != 0) {
                cVar.M();
                cVar.O();
            } else {
                cVar.b();
                while (cVar.j()) {
                    com.airbnb.lottie.model.content.a a5 = a(cVar, kVar);
                    if (a5 != null) {
                        aVar = a5;
                    }
                }
                cVar.d();
            }
        }
        return aVar;
    }
}

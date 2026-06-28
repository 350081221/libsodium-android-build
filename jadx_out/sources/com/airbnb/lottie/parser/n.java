package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1694a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.c a(com.airbnb.lottie.parser.moshi.c cVar) throws IOException {
        cVar.c();
        String str = null;
        String str2 = null;
        float f5 = 0.0f;
        String str3 = null;
        while (cVar.j()) {
            int J = cVar.J(f1694a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            cVar.M();
                            cVar.O();
                        } else {
                            f5 = (float) cVar.o();
                        }
                    } else {
                        str2 = cVar.y();
                    }
                } else {
                    str3 = cVar.y();
                }
            } else {
                str = cVar.y();
            }
        }
        cVar.h();
        return new com.airbnb.lottie.model.c(str, str3, str2, f5);
    }
}

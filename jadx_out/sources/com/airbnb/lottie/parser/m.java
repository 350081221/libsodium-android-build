package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1629a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1630b = c.a.a("shapes");

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.d a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double d5 = 0.0d;
        String str = null;
        String str2 = null;
        char c5 = 0;
        double d6 = 0.0d;
        while (cVar.j()) {
            int J = cVar.J(f1629a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                if (J != 5) {
                                    cVar.M();
                                    cVar.O();
                                } else {
                                    cVar.c();
                                    while (cVar.j()) {
                                        if (cVar.J(f1630b) != 0) {
                                            cVar.M();
                                            cVar.O();
                                        } else {
                                            cVar.b();
                                            while (cVar.j()) {
                                                arrayList.add((com.airbnb.lottie.model.content.q) h.a(cVar, kVar));
                                            }
                                            cVar.d();
                                        }
                                    }
                                    cVar.h();
                                }
                            } else {
                                str2 = cVar.y();
                            }
                        } else {
                            str = cVar.y();
                        }
                    } else {
                        d5 = cVar.o();
                    }
                } else {
                    d6 = cVar.o();
                }
            } else {
                c5 = cVar.y().charAt(0);
            }
        }
        cVar.h();
        return new com.airbnb.lottie.model.d(arrayList, c5, d6, d5, str, str2);
    }
}

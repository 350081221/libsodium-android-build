package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1590a = c.a.a("k", "x", "y");

    private a() {
    }

    public static com.airbnb.lottie.model.animatable.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.H() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.j()) {
                arrayList.add(z.a(cVar, kVar));
            }
            cVar.d();
            u.b(arrayList);
        } else {
            arrayList.add(new com.airbnb.lottie.value.a(s.e(cVar, com.airbnb.lottie.utils.l.e())));
        }
        return new com.airbnb.lottie.model.animatable.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.m<PointF, PointF> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        cVar.c();
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        while (cVar.H() != c.b.END_OBJECT) {
            int J = cVar.J(f1590a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        cVar.M();
                        cVar.O();
                    } else if (cVar.H() == c.b.STRING) {
                        cVar.O();
                        z4 = true;
                    } else {
                        bVar = d.e(cVar, kVar);
                    }
                } else if (cVar.H() == c.b.STRING) {
                    cVar.O();
                    z4 = true;
                } else {
                    bVar2 = d.e(cVar, kVar);
                }
            } else {
                eVar = a(cVar, kVar);
            }
        }
        cVar.h();
        if (z4) {
            kVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new com.airbnb.lottie.model.animatable.i(bVar2, bVar);
    }
}

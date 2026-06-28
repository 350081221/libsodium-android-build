package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes2.dex */
class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1611a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.p a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        Path.FillType fillType;
        com.airbnb.lottie.model.animatable.d dVar = null;
        String str = null;
        com.airbnb.lottie.model.animatable.a aVar = null;
        boolean z4 = false;
        boolean z5 = false;
        int i5 = 1;
        while (cVar.j()) {
            int J = cVar.J(f1611a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                if (J != 5) {
                                    cVar.M();
                                    cVar.O();
                                } else {
                                    z5 = cVar.m();
                                }
                            } else {
                                i5 = cVar.p();
                            }
                        } else {
                            z4 = cVar.m();
                        }
                    } else {
                        dVar = d.h(cVar, kVar);
                    }
                } else {
                    aVar = d.c(cVar, kVar);
                }
            } else {
                str = cVar.y();
            }
        }
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        com.airbnb.lottie.model.animatable.d dVar2 = dVar;
        if (i5 == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new com.airbnb.lottie.model.content.p(str, z4, fillType, aVar, dVar2, z5);
    }
}

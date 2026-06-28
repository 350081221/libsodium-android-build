package com.airbnb.lottie.parser;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1696a = c.a.a("nm", socket.g.f22386a, "o", bi.aL, bi.aE, "e", "r", "hd");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1697b = c.a.a(bi.aA, "k");

    private p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.e a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        com.airbnb.lottie.model.animatable.d dVar;
        com.airbnb.lottie.model.content.g gVar;
        Path.FillType fillType;
        com.airbnb.lottie.model.animatable.d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        com.airbnb.lottie.model.content.g gVar2 = null;
        com.airbnb.lottie.model.animatable.c cVar2 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        boolean z4 = false;
        while (cVar.j()) {
            switch (cVar.J(f1696a)) {
                case 0:
                    str = cVar.y();
                    break;
                case 1:
                    cVar.c();
                    int i5 = -1;
                    while (cVar.j()) {
                        int J = cVar.J(f1697b);
                        if (J != 0) {
                            if (J != 1) {
                                cVar.M();
                                cVar.O();
                            } else {
                                cVar2 = d.g(cVar, kVar, i5);
                            }
                        } else {
                            i5 = cVar.p();
                        }
                    }
                    cVar.h();
                    break;
                case 2:
                    dVar2 = d.h(cVar, kVar);
                    break;
                case 3:
                    if (cVar.p() == 1) {
                        gVar = com.airbnb.lottie.model.content.g.LINEAR;
                    } else {
                        gVar = com.airbnb.lottie.model.content.g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = d.i(cVar, kVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, kVar);
                    break;
                case 6:
                    if (cVar.p() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z4 = cVar.m();
                    break;
                default:
                    cVar.M();
                    cVar.O();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        } else {
            dVar = dVar2;
        }
        return new com.airbnb.lottie.model.content.e(str, gVar2, fillType2, cVar2, dVar, fVar, fVar2, null, null, z4);
    }
}

package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1698a = c.a.a("nm", socket.g.f22386a, "o", bi.aL, bi.aE, "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1699b = c.a.a(bi.aA, "k");

    /* renamed from: c, reason: collision with root package name */
    private static final c.a f1700c = c.a.a("n", "v");

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.f a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str;
        com.airbnb.lottie.model.animatable.c cVar2;
        com.airbnb.lottie.model.content.g gVar;
        ArrayList arrayList = new ArrayList();
        float f5 = 0.0f;
        String str2 = null;
        com.airbnb.lottie.model.content.g gVar2 = null;
        com.airbnb.lottie.model.animatable.c cVar3 = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.f fVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        s.b bVar2 = null;
        s.c cVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        boolean z4 = false;
        com.airbnb.lottie.model.animatable.d dVar = null;
        while (cVar.j()) {
            switch (cVar.J(f1698a)) {
                case 0:
                    str2 = cVar.y();
                    continue;
                case 1:
                    str = str2;
                    cVar.c();
                    int i5 = -1;
                    while (cVar.j()) {
                        int J = cVar.J(f1699b);
                        if (J != 0) {
                            cVar2 = cVar3;
                            if (J != 1) {
                                cVar.M();
                                cVar.O();
                            } else {
                                cVar3 = d.g(cVar, kVar, i5);
                            }
                        } else {
                            cVar2 = cVar3;
                            i5 = cVar.p();
                        }
                        cVar3 = cVar2;
                    }
                    cVar.h();
                    break;
                case 2:
                    dVar = d.h(cVar, kVar);
                    continue;
                case 3:
                    str = str2;
                    if (cVar.p() == 1) {
                        gVar = com.airbnb.lottie.model.content.g.LINEAR;
                    } else {
                        gVar = com.airbnb.lottie.model.content.g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = d.i(cVar, kVar);
                    continue;
                case 5:
                    fVar2 = d.i(cVar, kVar);
                    continue;
                case 6:
                    bVar = d.e(cVar, kVar);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = s.b.values()[cVar.p() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar4 = s.c.values()[cVar.p() - 1];
                    break;
                case 9:
                    str = str2;
                    f5 = (float) cVar.o();
                    break;
                case 10:
                    z4 = cVar.m();
                    continue;
                case 11:
                    cVar.b();
                    while (cVar.j()) {
                        cVar.c();
                        String str3 = null;
                        com.airbnb.lottie.model.animatable.b bVar4 = null;
                        while (cVar.j()) {
                            int J2 = cVar.J(f1700c);
                            if (J2 != 0) {
                                com.airbnb.lottie.model.animatable.b bVar5 = bVar3;
                                if (J2 != 1) {
                                    cVar.M();
                                    cVar.O();
                                } else {
                                    bVar4 = d.e(cVar, kVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str3 = cVar.y();
                            }
                        }
                        com.airbnb.lottie.model.animatable.b bVar6 = bVar3;
                        cVar.h();
                        if (str3.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str3.equals("d") || str3.equals(socket.g.f22386a)) {
                                kVar.y(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    com.airbnb.lottie.model.animatable.b bVar7 = bVar3;
                    cVar.d();
                    if (arrayList.size() == 1) {
                        arrayList.add((com.airbnb.lottie.model.animatable.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    continue;
                default:
                    cVar.M();
                    cVar.O();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (dVar == null) {
            dVar = new com.airbnb.lottie.model.animatable.d(Collections.singletonList(new com.airbnb.lottie.value.a(100)));
        }
        return new com.airbnb.lottie.model.content.f(str4, gVar2, cVar3, dVar, fVar, fVar2, bVar, bVar2, cVar4, f5, arrayList, bVar3, z4);
    }
}

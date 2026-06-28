package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1595a = c.a.a(bi.ay, bi.aA, bi.aE, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1596b = c.a.a("k");

    private c() {
    }

    private static boolean a(com.airbnb.lottie.model.animatable.e eVar) {
        return eVar == null || (eVar.c() && eVar.b().get(0).f1782b.equals(0.0f, 0.0f));
    }

    private static boolean b(com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar) {
        if (mVar != null && ((mVar instanceof com.airbnb.lottie.model.animatable.i) || !mVar.c() || !mVar.b().get(0).f1782b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f1782b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(com.airbnb.lottie.model.animatable.g gVar) {
        return gVar == null || (gVar.c() && ((com.airbnb.lottie.value.k) ((com.airbnb.lottie.value.a) gVar.b().get(0)).f1782b).a(1.0f, 1.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f1782b).floatValue() == 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean f(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.c() && ((Float) ((com.airbnb.lottie.value.a) bVar.b().get(0)).f1782b).floatValue() == 0.0f);
    }

    public static com.airbnb.lottie.model.animatable.l g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4;
        com.airbnb.lottie.model.animatable.e eVar;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar;
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        boolean z5;
        boolean z6 = false;
        if (cVar.H() == c.b.BEGIN_OBJECT) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            cVar.c();
        }
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.e eVar2 = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar2 = null;
        com.airbnb.lottie.model.animatable.g gVar = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.b bVar7 = null;
        com.airbnb.lottie.model.animatable.b bVar8 = null;
        while (cVar.j()) {
            switch (cVar.J(f1595a)) {
                case 0:
                    boolean z7 = z6;
                    cVar.c();
                    while (cVar.j()) {
                        if (cVar.J(f1596b) != 0) {
                            cVar.M();
                            cVar.O();
                        } else {
                            eVar2 = a.a(cVar, kVar);
                        }
                    }
                    cVar.h();
                    z6 = z7;
                    continue;
                case 1:
                    mVar2 = a.b(cVar, kVar);
                    continue;
                case 2:
                    gVar = d.j(cVar, kVar);
                    continue;
                case 3:
                    kVar.a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = d.h(cVar, kVar);
                    continue;
                case 6:
                    bVar7 = d.f(cVar, kVar, z6);
                    continue;
                case 7:
                    bVar8 = d.f(cVar, kVar, z6);
                    continue;
                case 8:
                    bVar5 = d.f(cVar, kVar, z6);
                    continue;
                case 9:
                    bVar6 = d.f(cVar, kVar, z6);
                    continue;
                default:
                    cVar.M();
                    cVar.O();
                    continue;
            }
            com.airbnb.lottie.model.animatable.b f5 = d.f(cVar, kVar, z6);
            if (f5.b().isEmpty()) {
                f5.b().add(new com.airbnb.lottie.value.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(kVar.f())));
            } else if (((com.airbnb.lottie.value.a) f5.b().get(0)).f1782b == 0) {
                z5 = false;
                f5.b().set(0, new com.airbnb.lottie.value.a(kVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(kVar.f())));
                z6 = z5;
                bVar4 = f5;
            }
            z5 = false;
            z6 = z5;
            bVar4 = f5;
        }
        if (z4) {
            cVar.h();
        }
        if (a(eVar2)) {
            eVar = null;
        } else {
            eVar = eVar2;
        }
        if (b(mVar2)) {
            mVar = null;
        } else {
            mVar = mVar2;
        }
        if (c(bVar4)) {
            bVar = null;
        } else {
            bVar = bVar4;
        }
        if (d(gVar)) {
            gVar = null;
        }
        if (f(bVar5)) {
            bVar2 = null;
        } else {
            bVar2 = bVar5;
        }
        if (e(bVar6)) {
            bVar3 = null;
        } else {
            bVar3 = bVar6;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar, mVar, gVar, bVar, dVar, bVar7, bVar8, bVar2, bVar3);
    }
}

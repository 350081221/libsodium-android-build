package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1597a = c.a.a("nm", "sy", "pt", bi.aA, "r", "or", bi.f12278x, "ir", bi.ae, "hd", "d");

    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.k a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i5) throws IOException {
        boolean z4;
        if (i5 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = false;
        boolean z6 = z4;
        String str = null;
        k.a aVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        com.airbnb.lottie.model.animatable.b bVar6 = null;
        while (cVar.j()) {
            switch (cVar.J(f1597a)) {
                case 0:
                    str = cVar.y();
                    break;
                case 1:
                    aVar = k.a.forValue(cVar.p());
                    break;
                case 2:
                    bVar = d.f(cVar, kVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, kVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, kVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, kVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, kVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, kVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, kVar, false);
                    break;
                case 9:
                    z5 = cVar.m();
                    break;
                case 10:
                    if (cVar.p() == 3) {
                        z6 = true;
                        break;
                    } else {
                        z6 = false;
                        break;
                    }
                default:
                    cVar.M();
                    cVar.O();
                    break;
            }
        }
        return new com.airbnb.lottie.model.content.k(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z5, z6);
    }
}

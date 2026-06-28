package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1598a = c.a.a("nm", bi.aA, bi.aE, "r", "hd");

    private d0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.l a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        boolean z4 = false;
        while (cVar.j()) {
            int J = cVar.J(f1598a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                cVar.O();
                            } else {
                                z4 = cVar.m();
                            }
                        } else {
                            bVar = d.e(cVar, kVar);
                        }
                    } else {
                        fVar = d.i(cVar, kVar);
                    }
                } else {
                    mVar = a.b(cVar, kVar);
                }
            } else {
                str = cVar.y();
            }
        }
        return new com.airbnb.lottie.model.content.l(str, mVar, fVar, bVar, z4);
    }
}

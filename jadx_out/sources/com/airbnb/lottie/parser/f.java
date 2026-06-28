package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1602a = c.a.a("nm", bi.aA, bi.aE, "hd", "d");

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.content.b a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i5) throws IOException {
        boolean z4;
        if (i5 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = z4;
        boolean z6 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar = null;
        com.airbnb.lottie.model.animatable.f fVar = null;
        while (cVar.j()) {
            int J = cVar.J(f1602a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        if (J != 3) {
                            if (J != 4) {
                                cVar.M();
                                cVar.O();
                            } else if (cVar.p() == 3) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        } else {
                            z6 = cVar.m();
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
        return new com.airbnb.lottie.model.content.b(str, mVar, fVar, z5, z6);
    }
}

package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;

/* loaded from: classes2.dex */
public class i implements n0<com.airbnb.lottie.model.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1609a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f1610b = c.a.a(bi.aL, "f", bi.aE, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private i() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.b a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z4 = true;
        while (cVar.j()) {
            switch (cVar.J(f1610b)) {
                case 0:
                    str = cVar.y();
                    break;
                case 1:
                    str2 = cVar.y();
                    break;
                case 2:
                    f6 = (float) cVar.o();
                    break;
                case 3:
                    int p5 = cVar.p();
                    aVar2 = b.a.CENTER;
                    if (p5 <= aVar2.ordinal() && p5 >= 0) {
                        aVar2 = b.a.values()[p5];
                        break;
                    }
                    break;
                case 4:
                    i5 = cVar.p();
                    break;
                case 5:
                    f7 = (float) cVar.o();
                    break;
                case 6:
                    f8 = (float) cVar.o();
                    break;
                case 7:
                    i6 = s.d(cVar);
                    break;
                case 8:
                    i7 = s.d(cVar);
                    break;
                case 9:
                    f9 = (float) cVar.o();
                    break;
                case 10:
                    z4 = cVar.m();
                    break;
                case 11:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.o()) * f5, ((float) cVar.o()) * f5);
                    cVar.d();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.o()) * f5, ((float) cVar.o()) * f5);
                    cVar.d();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.M();
                    cVar.O();
                    break;
            }
        }
        cVar.h();
        return new com.airbnb.lottie.model.b(str, str2, f6, aVar2, i5, f7, f8, i6, i7, f9, z4, pointF, pointF2);
    }
}

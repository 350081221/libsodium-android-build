package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f1594a = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        c.b H = cVar.H();
        if (H == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f5);
        }
        if (H == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f5);
        }
        if (H == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.o()) * f5, ((float) cVar.o()) * f5);
            while (cVar.j()) {
                cVar.O();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + H);
    }
}

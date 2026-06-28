package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
public class g0 implements n0<com.airbnb.lottie.value.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f1605a = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.value.k a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        boolean z4;
        if (cVar.H() == c.b.BEGIN_ARRAY) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            cVar.b();
        }
        float o5 = (float) cVar.o();
        float o6 = (float) cVar.o();
        while (cVar.j()) {
            cVar.O();
        }
        if (z4) {
            cVar.d();
        }
        return new com.airbnb.lottie.value.k((o5 / 100.0f) * f5, (o6 / 100.0f) * f5);
    }
}

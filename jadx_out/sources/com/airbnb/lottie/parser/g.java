package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
public class g implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1604a = new g();

    private g() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        boolean z4;
        double d5;
        if (cVar.H() == c.b.BEGIN_ARRAY) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            cVar.b();
        }
        double o5 = cVar.o();
        double o6 = cVar.o();
        double o7 = cVar.o();
        if (cVar.H() == c.b.NUMBER) {
            d5 = cVar.o();
        } else {
            d5 = 1.0d;
        }
        if (z4) {
            cVar.d();
        }
        if (o5 <= 1.0d && o6 <= 1.0d && o7 <= 1.0d) {
            o5 *= 255.0d;
            o6 *= 255.0d;
            o7 *= 255.0d;
            if (d5 <= 1.0d) {
                d5 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d5, (int) o5, (int) o6, (int) o7));
    }
}

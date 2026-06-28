package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
class z {
    private z() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.animation.keyframe.i a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4;
        if (cVar.H() == c.b.BEGIN_OBJECT) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new com.airbnb.lottie.animation.keyframe.i(kVar, t.c(cVar, kVar, com.airbnb.lottie.utils.l.e(), a0.f1591a, z4, false));
    }
}

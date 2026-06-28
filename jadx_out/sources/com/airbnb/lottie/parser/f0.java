package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.c;
import java.io.IOException;

/* loaded from: classes2.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final c.a f1603a = c.a.a("nm", "r", "hd");

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static com.airbnb.lottie.model.content.n a(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        boolean z4 = false;
        String str = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        while (cVar.j()) {
            int J = cVar.J(f1603a);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        cVar.O();
                    } else {
                        z4 = cVar.m();
                    }
                } else {
                    bVar = d.f(cVar, kVar, true);
                }
            } else {
                str = cVar.y();
            }
        }
        if (z4) {
            return null;
        }
        return new com.airbnb.lottie.model.content.n(str, bVar);
    }
}

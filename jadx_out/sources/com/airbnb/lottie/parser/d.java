package com.airbnb.lottie.parser;

import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> a(com.airbnb.lottie.parser.moshi.c cVar, float f5, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, f5, n0Var, false);
    }

    private static <T> List<com.airbnb.lottie.value.a<T>> b(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(cVar, kVar, 1.0f, n0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.a c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.a(b(cVar, kVar, g.f1604a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.j d(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.j(a(cVar, com.airbnb.lottie.utils.l.e(), kVar, i.f1609a));
    }

    public static com.airbnb.lottie.model.animatable.b e(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return f(cVar, kVar, true);
    }

    public static com.airbnb.lottie.model.animatable.b f(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, boolean z4) throws IOException {
        float f5;
        if (z4) {
            f5 = com.airbnb.lottie.utils.l.e();
        } else {
            f5 = 1.0f;
        }
        return new com.airbnb.lottie.model.animatable.b(a(cVar, f5, kVar, l.f1626a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.c g(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, int i5) throws IOException {
        return new com.airbnb.lottie.model.animatable.c(b(cVar, kVar, new o(i5)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.d h(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.d(b(cVar, kVar, r.f1701a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.f i(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.f(u.a(cVar, kVar, com.airbnb.lottie.utils.l.e(), b0.f1594a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.g j(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.g((List<com.airbnb.lottie.value.a<com.airbnb.lottie.value.k>>) b(cVar, kVar, g0.f1605a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.airbnb.lottie.model.animatable.h k(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar) throws IOException {
        return new com.airbnb.lottie.model.animatable.h(a(cVar, com.airbnb.lottie.utils.l.e(), kVar, h0.f1607a));
    }
}

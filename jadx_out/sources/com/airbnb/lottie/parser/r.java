package com.airbnb.lottie.parser;

import java.io.IOException;

/* loaded from: classes2.dex */
public class r implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1701a = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(com.airbnb.lottie.parser.moshi.c cVar, float f5) throws IOException {
        return Integer.valueOf(Math.round(s.g(cVar) * f5));
    }
}

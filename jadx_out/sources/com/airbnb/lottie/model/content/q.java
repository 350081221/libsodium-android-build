package com.airbnb.lottie.model.content;

import com.airbnb.lottie.x0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1472a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f1473b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1474c;

    public q(String str, List<c> list, boolean z4) {
        this.f1472a = str;
        this.f1473b = list;
        this.f1474c = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.d(x0Var, bVar, this, kVar);
    }

    public List<c> b() {
        return this.f1473b;
    }

    public String c() {
        return this.f1472a;
    }

    public boolean d() {
        return this.f1474c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f1472a + "' Shapes: " + Arrays.toString(this.f1473b.toArray()) + '}';
    }
}

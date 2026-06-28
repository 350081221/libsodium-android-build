package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1419a;

    /* renamed from: b, reason: collision with root package name */
    private final g f1420b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f1421c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f1422d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f1423e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f1424f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1425g;

    /* renamed from: h, reason: collision with root package name */
    private final s.b f1426h;

    /* renamed from: i, reason: collision with root package name */
    private final s.c f1427i;

    /* renamed from: j, reason: collision with root package name */
    private final float f1428j;

    /* renamed from: k, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f1429k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.b f1430l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1431m;

    public f(String str, g gVar, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, s.b bVar2, s.c cVar2, float f5, List<com.airbnb.lottie.model.animatable.b> list, @Nullable com.airbnb.lottie.model.animatable.b bVar3, boolean z4) {
        this.f1419a = str;
        this.f1420b = gVar;
        this.f1421c = cVar;
        this.f1422d = dVar;
        this.f1423e = fVar;
        this.f1424f = fVar2;
        this.f1425g = bVar;
        this.f1426h = bVar2;
        this.f1427i = cVar2;
        this.f1428j = f5;
        this.f1429k = list;
        this.f1430l = bVar3;
        this.f1431m = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(x0Var, bVar, this);
    }

    public s.b b() {
        return this.f1426h;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f1430l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f1424f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f1421c;
    }

    public g f() {
        return this.f1420b;
    }

    public s.c g() {
        return this.f1427i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f1429k;
    }

    public float i() {
        return this.f1428j;
    }

    public String j() {
        return this.f1419a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f1422d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f1423e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f1425g;
    }

    public boolean n() {
        return this.f1431m;
    }
}

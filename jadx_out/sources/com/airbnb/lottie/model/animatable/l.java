package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final e f1372a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final m<PointF, PointF> f1373b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final g f1374c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final b f1375d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final d f1376e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final b f1377f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final b f1378g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final b f1379h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final b f1380i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1381j;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @Nullable
    public e c() {
        return this.f1372a;
    }

    @Nullable
    public b d() {
        return this.f1380i;
    }

    @Nullable
    public d e() {
        return this.f1376e;
    }

    @Nullable
    public m<PointF, PointF> f() {
        return this.f1373b;
    }

    @Nullable
    public b g() {
        return this.f1375d;
    }

    @Nullable
    public g h() {
        return this.f1374c;
    }

    @Nullable
    public b i() {
        return this.f1377f;
    }

    @Nullable
    public b j() {
        return this.f1378g;
    }

    @Nullable
    public b k() {
        return this.f1379h;
    }

    public boolean l() {
        return this.f1381j;
    }

    public void m(boolean z4) {
        this.f1381j = z4;
    }

    public l(@Nullable e eVar, @Nullable m<PointF, PointF> mVar, @Nullable g gVar, @Nullable b bVar, @Nullable d dVar, @Nullable b bVar2, @Nullable b bVar3, @Nullable b bVar4, @Nullable b bVar5) {
        this.f1381j = false;
        this.f1372a = eVar;
        this.f1373b = mVar;
        this.f1374c = gVar;
        this.f1375d = bVar;
        this.f1376e = dVar;
        this.f1379h = bVar2;
        this.f1380i = bVar3;
        this.f1377f = bVar4;
        this.f1378g = bVar5;
    }
}

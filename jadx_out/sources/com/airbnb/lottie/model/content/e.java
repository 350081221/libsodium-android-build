package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f1409a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f1410b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f1411c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f1412d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f1413e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f1414f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1415g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.b f1416h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.b f1417i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1418j;

    public e(String str, g gVar, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z4) {
        this.f1409a = gVar;
        this.f1410b = fillType;
        this.f1411c = cVar;
        this.f1412d = dVar;
        this.f1413e = fVar;
        this.f1414f = fVar2;
        this.f1415g = str;
        this.f1416h = bVar;
        this.f1417i = bVar2;
        this.f1418j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(x0Var, kVar, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f1414f;
    }

    public Path.FillType c() {
        return this.f1410b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f1411c;
    }

    public g e() {
        return this.f1409a;
    }

    public String f() {
        return this.f1415g;
    }

    public com.airbnb.lottie.model.animatable.d g() {
        return this.f1412d;
    }

    public com.airbnb.lottie.model.animatable.f h() {
        return this.f1413e;
    }

    public boolean i() {
        return this.f1418j;
    }
}

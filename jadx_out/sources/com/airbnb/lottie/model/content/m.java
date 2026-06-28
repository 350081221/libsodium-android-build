package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1456a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1457b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1458c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.l f1459d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1460e;

    public m(String str, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.l lVar, boolean z4) {
        this.f1456a = str;
        this.f1457b = bVar;
        this.f1458c = bVar2;
        this.f1459d = lVar;
        this.f1460e = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    @Nullable
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.q(x0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f1457b;
    }

    public String c() {
        return this.f1456a;
    }

    public com.airbnb.lottie.model.animatable.b d() {
        return this.f1458c;
    }

    public com.airbnb.lottie.model.animatable.l e() {
        return this.f1459d;
    }

    public boolean f() {
        return this.f1460e;
    }
}

package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1466a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f1467b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1468c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.a f1469d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.model.animatable.d f1470e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1471f;

    public p(String str, boolean z4, Path.FillType fillType, @Nullable com.airbnb.lottie.model.animatable.a aVar, @Nullable com.airbnb.lottie.model.animatable.d dVar, boolean z5) {
        this.f1468c = str;
        this.f1466a = z4;
        this.f1467b = fillType;
        this.f1469d = aVar;
        this.f1470e = dVar;
        this.f1471f = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(x0Var, bVar, this);
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.a b() {
        return this.f1469d;
    }

    public Path.FillType c() {
        return this.f1467b;
    }

    public String d() {
        return this.f1468c;
    }

    @Nullable
    public com.airbnb.lottie.model.animatable.d e() {
        return this.f1470e;
    }

    public boolean f() {
        return this.f1471f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f1466a + '}';
    }
}

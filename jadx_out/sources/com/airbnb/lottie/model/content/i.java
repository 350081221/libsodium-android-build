package com.airbnb.lottie.model.content;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f1433a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.h f1434b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f1435c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1436d;

    /* loaded from: classes2.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z4) {
        this.f1433a = aVar;
        this.f1434b = hVar;
        this.f1435c = dVar;
        this.f1436d = z4;
    }

    public a a() {
        return this.f1433a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f1434b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f1435c;
    }

    public boolean d() {
        return this.f1436d;
    }
}

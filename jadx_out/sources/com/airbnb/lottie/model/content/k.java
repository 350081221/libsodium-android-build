package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f1440a;

    /* renamed from: b, reason: collision with root package name */
    private final a f1441b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1442c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f1443d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1444e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1445f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1446g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1447h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f1448i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1449j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f1450k;

    /* loaded from: classes2.dex */
    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i5) {
            this.value = i5;
        }

        public static a forValue(int i5) {
            for (a aVar : values()) {
                if (aVar.value == i5) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z4, boolean z5) {
        this.f1440a = str;
        this.f1441b = aVar;
        this.f1442c = bVar;
        this.f1443d = mVar;
        this.f1444e = bVar2;
        this.f1445f = bVar3;
        this.f1446g = bVar4;
        this.f1447h = bVar5;
        this.f1448i = bVar6;
        this.f1449j = z4;
        this.f1450k = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.o(x0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f1445f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f1447h;
    }

    public String d() {
        return this.f1440a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f1446g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f1448i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f1442c;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f1443d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f1444e;
    }

    public a j() {
        return this.f1441b;
    }

    public boolean k() {
        return this.f1449j;
    }

    public boolean l() {
        return this.f1450k;
    }
}

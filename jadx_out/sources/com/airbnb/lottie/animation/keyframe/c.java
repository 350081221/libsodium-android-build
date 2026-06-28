package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;

/* loaded from: classes2.dex */
public class c implements a.b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f1083h = 0.017453292519943295d;

    /* renamed from: a, reason: collision with root package name */
    private final a.b f1084a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f1085b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1086c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1087d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1088e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1089f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1090g = true;

    /* loaded from: classes2.dex */
    class a extends com.airbnb.lottie.value.j<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f1091d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f1091d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f5 = (Float) this.f1091d.a(bVar);
            if (f5 == null) {
                return null;
            }
            return Float.valueOf(f5.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, com.airbnb.lottie.parser.j jVar) {
        this.f1084a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = jVar.a().a();
        this.f1085b = a5;
        a5.a(this);
        bVar2.i(a5);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = jVar.d().a();
        this.f1086c = a6;
        a6.a(this);
        bVar2.i(a6);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = jVar.b().a();
        this.f1087d = a7;
        a7.a(this);
        bVar2.i(a7);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = jVar.c().a();
        this.f1088e = a8;
        a8.a(this);
        bVar2.i(a8);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = jVar.e().a();
        this.f1089f = a9;
        a9.a(this);
        bVar2.i(a9);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f1090g = true;
        this.f1084a.a();
    }

    public void b(Paint paint) {
        if (!this.f1090g) {
            return;
        }
        this.f1090g = false;
        double floatValue = this.f1087d.h().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.f1088e.h().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = this.f1085b.h().intValue();
        paint.setShadowLayer(this.f1089f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f1086c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public void c(@Nullable com.airbnb.lottie.value.j<Integer> jVar) {
        this.f1085b.o(jVar);
    }

    public void d(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f1087d.o(jVar);
    }

    public void e(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f1088e.o(jVar);
    }

    public void f(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f1086c.o(null);
        } else {
            this.f1086c.o(new a(jVar));
        }
    }

    public void g(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        this.f1089f.o(jVar);
    }
}

package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class v implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f1062a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1063b;

    /* renamed from: c, reason: collision with root package name */
    private final List<a.b> f1064c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final t.a f1065d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1066e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1067f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1068g;

    public v(com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.t tVar) {
        this.f1062a = tVar.c();
        this.f1063b = tVar.g();
        this.f1065d = tVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = tVar.e().a();
        this.f1066e = a5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = tVar.b().a();
        this.f1067f = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = tVar.d().a();
        this.f1068g = a7;
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        a5.a(this);
        a6.a(this);
        a7.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        for (int i5 = 0; i5 < this.f1064c.size(); i5++) {
            this.f1064c.get(i5).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(a.b bVar) {
        this.f1064c.add(bVar);
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> e() {
        return this.f1067f;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> g() {
        return this.f1068g;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1062a;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> i() {
        return this.f1066e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t.a j() {
        return this.f1065d;
    }

    public boolean k() {
        return this.f1063b;
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class f implements n, a.b, k {

    /* renamed from: i, reason: collision with root package name */
    private static final float f942i = 0.55228f;

    /* renamed from: b, reason: collision with root package name */
    private final String f944b;

    /* renamed from: c, reason: collision with root package name */
    private final x0 f945c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f946d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f947e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f948f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f950h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f943a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f949g = new b();

    public f(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f944b = bVar2.b();
        this.f945c = x0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = bVar2.d().a();
        this.f946d = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = bVar2.c().a();
        this.f947e = a6;
        this.f948f = bVar2;
        bVar.i(a5);
        bVar.i(a6);
        a5.a(this);
        a6.a(this);
    }

    private void g() {
        this.f950h = false;
        this.f945c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            c cVar = list.get(i5);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f949g.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t5 == c1.f1151k) {
            this.f946d.o(jVar);
        } else if (t5 == c1.f1154n) {
            this.f947e.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f944b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f950h) {
            return this.f943a;
        }
        this.f943a.reset();
        if (this.f948f.e()) {
            this.f950h = true;
            return this.f943a;
        }
        PointF h5 = this.f946d.h();
        float f5 = h5.x / 2.0f;
        float f6 = h5.y / 2.0f;
        float f7 = f5 * f942i;
        float f8 = f942i * f6;
        this.f943a.reset();
        if (this.f948f.f()) {
            float f9 = -f6;
            this.f943a.moveTo(0.0f, f9);
            float f10 = 0.0f - f7;
            float f11 = -f5;
            float f12 = 0.0f - f8;
            this.f943a.cubicTo(f10, f9, f11, f12, f11, 0.0f);
            float f13 = f8 + 0.0f;
            this.f943a.cubicTo(f11, f13, f10, f6, 0.0f, f6);
            float f14 = f7 + 0.0f;
            this.f943a.cubicTo(f14, f6, f5, f13, f5, 0.0f);
            this.f943a.cubicTo(f5, f12, f14, f9, 0.0f, f9);
        } else {
            float f15 = -f6;
            this.f943a.moveTo(0.0f, f15);
            float f16 = f7 + 0.0f;
            float f17 = 0.0f - f8;
            this.f943a.cubicTo(f16, f15, f5, f17, f5, 0.0f);
            float f18 = f8 + 0.0f;
            this.f943a.cubicTo(f5, f18, f16, f6, 0.0f, f6);
            float f19 = 0.0f - f7;
            float f20 = -f5;
            this.f943a.cubicTo(f19, f6, f20, f18, f20, 0.0f);
            this.f943a.cubicTo(f20, f17, f19, f15, 0.0f, f15);
        }
        PointF h6 = this.f947e.h();
        this.f943a.offset(h6.x, h6.y);
        this.f943a.close();
        this.f949g.b(this.f943a);
        this.f950h = true;
        return this.f943a;
    }
}

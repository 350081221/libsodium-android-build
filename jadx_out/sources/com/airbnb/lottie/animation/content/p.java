package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class p implements a.b, k, n {

    /* renamed from: c, reason: collision with root package name */
    private final String f1025c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1026d;

    /* renamed from: e, reason: collision with root package name */
    private final x0 f1027e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f1028f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f1029g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1030h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1033k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1023a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f1024b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f1031i = new b();

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f1032j = null;

    public p(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this.f1025c = lVar.c();
        this.f1026d = lVar.f();
        this.f1027e = x0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = lVar.d().a();
        this.f1028f = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = lVar.e().a();
        this.f1029g = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = lVar.b().a();
        this.f1030h = a7;
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        a5.a(this);
        a6.a(this);
        a7.a(this);
    }

    private void g() {
        this.f1033k = false;
        this.f1027e.invalidateSelf();
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
                    this.f1031i.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof r) {
                this.f1032j = ((r) cVar).g();
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t5 == c1.f1152l) {
            this.f1029g.o(jVar);
        } else if (t5 == c1.f1154n) {
            this.f1028f.o(jVar);
        } else if (t5 == c1.f1153m) {
            this.f1030h.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1025c;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        float q5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar;
        if (this.f1033k) {
            return this.f1023a;
        }
        this.f1023a.reset();
        if (this.f1026d) {
            this.f1033k = true;
            return this.f1023a;
        }
        PointF h5 = this.f1029g.h();
        float f5 = h5.x / 2.0f;
        float f6 = h5.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f1030h;
        if (aVar2 == null) {
            q5 = 0.0f;
        } else {
            q5 = ((com.airbnb.lottie.animation.keyframe.d) aVar2).q();
        }
        if (q5 == 0.0f && (aVar = this.f1032j) != null) {
            q5 = Math.min(aVar.h().floatValue(), Math.min(f5, f6));
        }
        float min = Math.min(f5, f6);
        if (q5 > min) {
            q5 = min;
        }
        PointF h6 = this.f1028f.h();
        this.f1023a.moveTo(h6.x + f5, (h6.y - f6) + q5);
        this.f1023a.lineTo(h6.x + f5, (h6.y + f6) - q5);
        if (q5 > 0.0f) {
            RectF rectF = this.f1024b;
            float f7 = h6.x;
            float f8 = q5 * 2.0f;
            float f9 = h6.y;
            rectF.set((f7 + f5) - f8, (f9 + f6) - f8, f7 + f5, f9 + f6);
            this.f1023a.arcTo(this.f1024b, 0.0f, 90.0f, false);
        }
        this.f1023a.lineTo((h6.x - f5) + q5, h6.y + f6);
        if (q5 > 0.0f) {
            RectF rectF2 = this.f1024b;
            float f10 = h6.x;
            float f11 = h6.y;
            float f12 = q5 * 2.0f;
            rectF2.set(f10 - f5, (f11 + f6) - f12, (f10 - f5) + f12, f11 + f6);
            this.f1023a.arcTo(this.f1024b, 90.0f, 90.0f, false);
        }
        this.f1023a.lineTo(h6.x - f5, (h6.y - f6) + q5);
        if (q5 > 0.0f) {
            RectF rectF3 = this.f1024b;
            float f13 = h6.x;
            float f14 = h6.y;
            float f15 = q5 * 2.0f;
            rectF3.set(f13 - f5, f14 - f6, (f13 - f5) + f15, (f14 - f6) + f15);
            this.f1023a.arcTo(this.f1024b, 180.0f, 90.0f, false);
        }
        this.f1023a.lineTo((h6.x + f5) - q5, h6.y - f6);
        if (q5 > 0.0f) {
            RectF rectF4 = this.f1024b;
            float f16 = h6.x;
            float f17 = q5 * 2.0f;
            float f18 = h6.y;
            rectF4.set((f16 + f5) - f17, f18 - f6, f16 + f5, (f18 - f6) + f17);
            this.f1023a.arcTo(this.f1024b, 270.0f, 90.0f, false);
        }
        this.f1023a.close();
        this.f1031i.b(this.f1023a);
        this.f1033k = true;
        return this.f1023a;
    }
}

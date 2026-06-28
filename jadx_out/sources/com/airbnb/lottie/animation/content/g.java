package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f951a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f952b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f953c;

    /* renamed from: d, reason: collision with root package name */
    private final String f954d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f955e;

    /* renamed from: f, reason: collision with root package name */
    private final List<n> f956f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f957g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f958h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f959i;

    /* renamed from: j, reason: collision with root package name */
    private final x0 f960j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f961k;

    /* renamed from: l, reason: collision with root package name */
    float f962l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.c f963m;

    public g(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.p pVar) {
        Path path = new Path();
        this.f951a = path;
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f952b = aVar;
        this.f956f = new ArrayList();
        this.f953c = bVar;
        this.f954d = pVar.d();
        this.f955e = pVar.f();
        this.f960j = x0Var;
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = bVar.w().a().a();
            this.f961k = a5;
            a5.a(this);
            bVar.i(this.f961k);
        }
        if (bVar.y() != null) {
            this.f963m = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
        if (pVar.b() != null && pVar.e() != null) {
            PaintCompat.setBlendMode(aVar, bVar.v().toNativeBlendMode());
            path.setFillType(pVar.c());
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = pVar.b().a();
            this.f957g = a6;
            a6.a(this);
            bVar.i(a6);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a7 = pVar.e().a();
            this.f958h = a7;
            a7.a(this);
            bVar.i(a7);
            return;
        }
        this.f957g = null;
        this.f958h = null;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f960j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i5 = 0; i5 < list2.size(); i5++) {
            c cVar = list2.get(i5);
            if (cVar instanceof n) {
                this.f956f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t5 == c1.f1141a) {
            this.f957g.o(jVar);
            return;
        }
        if (t5 == c1.f1144d) {
            this.f958h.o(jVar);
            return;
        }
        if (t5 == c1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f959i;
            if (aVar != null) {
                this.f953c.H(aVar);
            }
            if (jVar == null) {
                this.f959i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f959i = qVar;
            qVar.a(this);
            this.f953c.i(this.f959i);
            return;
        }
        if (t5 == c1.f1150j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f961k;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f961k = qVar2;
            qVar2.a(this);
            this.f953c.i(this.f961k);
            return;
        }
        if (t5 == c1.f1145e && (cVar5 = this.f963m) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t5 == c1.G && (cVar4 = this.f963m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t5 == c1.H && (cVar3 = this.f963m) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t5 == c1.I && (cVar2 = this.f963m) != null) {
            cVar2.e(jVar);
        } else if (t5 == c1.J && (cVar = this.f963m) != null) {
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f951a.reset();
        for (int i5 = 0; i5 < this.f956f.size(); i5++) {
            this.f951a.addPath(this.f956f.get(i5).getPath(), matrix);
        }
        this.f951a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f954d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        if (this.f955e) {
            return;
        }
        com.airbnb.lottie.f.b("FillContent#draw");
        this.f952b.setColor((com.airbnb.lottie.utils.k.d((int) ((((i5 / 255.0f) * this.f958h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.b) this.f957g).q() & ViewCompat.MEASURED_SIZE_MASK));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f959i;
        if (aVar != null) {
            this.f952b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f961k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f952b.setMaskFilter(null);
            } else if (floatValue != this.f962l) {
                this.f952b.setMaskFilter(this.f953c.x(floatValue));
            }
            this.f962l = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f963m;
        if (cVar != null) {
            cVar.b(this.f952b);
        }
        this.f951a.reset();
        for (int i6 = 0; i6 < this.f956f.size(); i6++) {
            this.f951a.addPath(this.f956f.get(i6).getPath(), matrix);
        }
        canvas.drawPath(this.f951a, this.f952b);
        com.airbnb.lottie.f.c("FillContent#draw");
    }
}

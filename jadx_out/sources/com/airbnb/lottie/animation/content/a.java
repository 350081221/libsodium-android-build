package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final x0 f915e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f916f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f918h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f919i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f920j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f921k;

    /* renamed from: l, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f922l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f923m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f924n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f925o;

    /* renamed from: p, reason: collision with root package name */
    float f926p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.c f927q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f911a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f912b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f913c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f914d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f917g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<n> f928a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        private final v f929b;

        private b(@Nullable v vVar) {
            this.f928a = new ArrayList();
            this.f929b = vVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f5, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f919i = aVar;
        this.f926p = 0.0f;
        this.f915e = x0Var;
        this.f916f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f5);
        this.f921k = dVar.a();
        this.f920j = bVar2.a();
        if (bVar3 == null) {
            this.f923m = null;
        } else {
            this.f923m = bVar3.a();
        }
        this.f922l = new ArrayList(list.size());
        this.f918h = new float[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f922l.add(list.get(i5).a());
        }
        bVar.i(this.f921k);
        bVar.i(this.f920j);
        for (int i6 = 0; i6 < this.f922l.size(); i6++) {
            bVar.i(this.f922l.get(i6));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f923m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f921k.a(this);
        this.f920j.a(this);
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.f922l.get(i7).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f923m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = bVar.w().a().a();
            this.f925o = a5;
            a5.a(this);
            bVar.i(this.f925o);
        }
        if (bVar.y() != null) {
            this.f927q = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
    }

    private void g(Matrix matrix) {
        float floatValue;
        com.airbnb.lottie.f.b("StrokeContent#applyDashPattern");
        if (this.f922l.isEmpty()) {
            com.airbnb.lottie.f.c("StrokeContent#applyDashPattern");
            return;
        }
        float g5 = com.airbnb.lottie.utils.l.g(matrix);
        for (int i5 = 0; i5 < this.f922l.size(); i5++) {
            this.f918h[i5] = this.f922l.get(i5).h().floatValue();
            if (i5 % 2 == 0) {
                float[] fArr = this.f918h;
                if (fArr[i5] < 1.0f) {
                    fArr[i5] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f918h;
                if (fArr2[i5] < 0.1f) {
                    fArr2[i5] = 0.1f;
                }
            }
            float[] fArr3 = this.f918h;
            fArr3[i5] = fArr3[i5] * g5;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f923m;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = g5 * aVar.h().floatValue();
        }
        this.f919i.setPathEffect(new DashPathEffect(this.f918h, floatValue));
        com.airbnb.lottie.f.c("StrokeContent#applyDashPattern");
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        float f5;
        float f6;
        float f7;
        com.airbnb.lottie.f.b("StrokeContent#applyTrimPath");
        if (bVar.f929b == null) {
            com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f912b.reset();
        for (int size = bVar.f928a.size() - 1; size >= 0; size--) {
            this.f912b.addPath(((n) bVar.f928a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.f929b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f929b.e().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f929b.g().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f912b, this.f919i);
            com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f911a.setPath(this.f912b, false);
        float length = this.f911a.getLength();
        while (this.f911a.nextContour()) {
            length += this.f911a.getLength();
        }
        float f8 = floatValue3 * length;
        float f9 = (floatValue * length) + f8;
        float min = Math.min((floatValue2 * length) + f8, (f9 + length) - 1.0f);
        float f10 = 0.0f;
        for (int size2 = bVar.f928a.size() - 1; size2 >= 0; size2--) {
            this.f913c.set(((n) bVar.f928a.get(size2)).getPath());
            this.f913c.transform(matrix);
            this.f911a.setPath(this.f913c, false);
            float length2 = this.f911a.getLength();
            if (min > length) {
                float f11 = min - length;
                if (f11 < f10 + length2 && f10 < f11) {
                    if (f9 > length) {
                        f7 = (f9 - length) / length2;
                    } else {
                        f7 = 0.0f;
                    }
                    com.airbnb.lottie.utils.l.a(this.f913c, f7, Math.min(f11 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f913c, this.f919i);
                    f10 += length2;
                }
            }
            float f12 = f10 + length2;
            if (f12 >= f9 && f10 <= min) {
                if (f12 <= min && f9 < f10) {
                    canvas.drawPath(this.f913c, this.f919i);
                } else {
                    if (f9 < f10) {
                        f5 = 0.0f;
                    } else {
                        f5 = (f9 - f10) / length2;
                    }
                    if (min > f12) {
                        f6 = 1.0f;
                    } else {
                        f6 = (min - f10) / length2;
                    }
                    com.airbnb.lottie.utils.l.a(this.f913c, f5, f6, 0.0f);
                    canvas.drawPath(this.f913c, this.f919i);
                }
            }
            f10 += length2;
        }
        com.airbnb.lottie.f.c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f915e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        v vVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.j() == t.a.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.j() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f917g.add(bVar);
                    }
                    bVar = new b(vVar3);
                    vVar3.d(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(vVar);
                }
                bVar.f928a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f917g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    @CallSuper
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t5 == c1.f1144d) {
            this.f921k.o(jVar);
            return;
        }
        if (t5 == c1.f1159s) {
            this.f920j.o(jVar);
            return;
        }
        if (t5 == c1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f924n;
            if (aVar != null) {
                this.f916f.H(aVar);
            }
            if (jVar == null) {
                this.f924n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f924n = qVar;
            qVar.a(this);
            this.f916f.i(this.f924n);
            return;
        }
        if (t5 == c1.f1150j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f925o;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f925o = qVar2;
            qVar2.a(this);
            this.f916f.i(this.f925o);
            return;
        }
        if (t5 == c1.f1145e && (cVar5 = this.f927q) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t5 == c1.G && (cVar4 = this.f927q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t5 == c1.H && (cVar3 = this.f927q) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t5 == c1.I && (cVar2 = this.f927q) != null) {
            cVar2.e(jVar);
        } else if (t5 == c1.J && (cVar = this.f927q) != null) {
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        com.airbnb.lottie.f.b("StrokeContent#getBounds");
        this.f912b.reset();
        for (int i5 = 0; i5 < this.f917g.size(); i5++) {
            b bVar = this.f917g.get(i5);
            for (int i6 = 0; i6 < bVar.f928a.size(); i6++) {
                this.f912b.addPath(((n) bVar.f928a.get(i6)).getPath(), matrix);
            }
        }
        this.f912b.computeBounds(this.f914d, false);
        float q5 = ((com.airbnb.lottie.animation.keyframe.d) this.f920j).q();
        RectF rectF2 = this.f914d;
        float f5 = q5 / 2.0f;
        rectF2.set(rectF2.left - f5, rectF2.top - f5, rectF2.right + f5, rectF2.bottom + f5);
        rectF.set(this.f914d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.f.c("StrokeContent#getBounds");
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        com.airbnb.lottie.f.b("StrokeContent#draw");
        if (com.airbnb.lottie.utils.l.h(matrix)) {
            com.airbnb.lottie.f.c("StrokeContent#draw");
            return;
        }
        this.f919i.setAlpha(com.airbnb.lottie.utils.k.d((int) ((((i5 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f921k).q()) / 100.0f) * 255.0f), 0, 255));
        this.f919i.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.d) this.f920j).q() * com.airbnb.lottie.utils.l.g(matrix));
        if (this.f919i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.f.c("StrokeContent#draw");
            return;
        }
        g(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f924n;
        if (aVar != null) {
            this.f919i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f925o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f919i.setMaskFilter(null);
            } else if (floatValue != this.f926p) {
                this.f919i.setMaskFilter(this.f916f.x(floatValue));
            }
            this.f926p = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f927q;
        if (cVar != null) {
            cVar.b(this.f919i);
        }
        for (int i6 = 0; i6 < this.f917g.size(); i6++) {
            b bVar = this.f917g.get(i6);
            if (bVar.f929b != null) {
                i(canvas, bVar, matrix);
            } else {
                com.airbnb.lottie.f.b("StrokeContent#buildPath");
                this.f912b.reset();
                for (int size = bVar.f928a.size() - 1; size >= 0; size--) {
                    this.f912b.addPath(((n) bVar.f928a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.f.c("StrokeContent#buildPath");
                com.airbnb.lottie.f.b("StrokeContent#drawPath");
                canvas.drawPath(this.f912b, this.f919i);
                com.airbnb.lottie.f.c("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.f.c("StrokeContent#draw");
    }
}

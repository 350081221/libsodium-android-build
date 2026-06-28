package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class h implements e, a.b, k {

    /* renamed from: v, reason: collision with root package name */
    private static final int f964v = 32;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f965a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f966b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f967c;

    /* renamed from: d, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f968d = new LongSparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f969e = new LongSparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f970f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f971g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f972h;

    /* renamed from: i, reason: collision with root package name */
    private final List<n> f973i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f974j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f975k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f976l;

    /* renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f977m;

    /* renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f978n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f979o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.q f980p;

    /* renamed from: q, reason: collision with root package name */
    private final x0 f981q;

    /* renamed from: r, reason: collision with root package name */
    private final int f982r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f983s;

    /* renamed from: t, reason: collision with root package name */
    float f984t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.c f985u;

    public h(x0 x0Var, com.airbnb.lottie.k kVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f970f = path;
        this.f971g = new com.airbnb.lottie.animation.a(1);
        this.f972h = new RectF();
        this.f973i = new ArrayList();
        this.f984t = 0.0f;
        this.f967c = bVar;
        this.f965a = eVar.f();
        this.f966b = eVar.i();
        this.f981q = x0Var;
        this.f974j = eVar.e();
        path.setFillType(eVar.c());
        this.f982r = (int) (kVar.d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a5 = eVar.d().a();
        this.f975k = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = eVar.g().a();
        this.f976l = a6;
        a6.a(this);
        bVar.i(a6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a7 = eVar.h().a();
        this.f977m = a7;
        a7.a(this);
        bVar.i(a7);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a8 = eVar.b().a();
        this.f978n = a8;
        a8.a(this);
        bVar.i(a8);
        if (bVar.w() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = bVar.w().a().a();
            this.f983s = a9;
            a9.a(this);
            bVar.i(this.f983s);
        }
        if (bVar.y() != null) {
            this.f985u = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.y());
        }
    }

    private int[] g(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f980p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i5 = 0;
            if (iArr.length == numArr.length) {
                while (i5 < iArr.length) {
                    iArr[i5] = numArr[i5].intValue();
                    i5++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i5 < numArr.length) {
                    iArr[i5] = numArr[i5].intValue();
                    i5++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int i5;
        int round = Math.round(this.f977m.f() * this.f982r);
        int round2 = Math.round(this.f978n.f() * this.f982r);
        int round3 = Math.round(this.f975k.f() * this.f982r);
        if (round != 0) {
            i5 = 527 * round;
        } else {
            i5 = 17;
        }
        if (round2 != 0) {
            i5 = i5 * 31 * round2;
        }
        if (round3 != 0) {
            return i5 * 31 * round3;
        }
        return i5;
    }

    private LinearGradient j() {
        long i5 = i();
        LinearGradient linearGradient = this.f968d.get(i5);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h5 = this.f977m.h();
        PointF h6 = this.f978n.h();
        com.airbnb.lottie.model.content.d h7 = this.f975k.h();
        LinearGradient linearGradient2 = new LinearGradient(h5.x, h5.y, h6.x, h6.y, g(h7.d()), h7.e(), Shader.TileMode.CLAMP);
        this.f968d.put(i5, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i5 = i();
        RadialGradient radialGradient = this.f969e.get(i5);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h5 = this.f977m.h();
        PointF h6 = this.f978n.h();
        com.airbnb.lottie.model.content.d h7 = this.f975k.h();
        int[] g5 = g(h7.d());
        float[] e5 = h7.e();
        float f5 = h5.x;
        float f6 = h5.y;
        float hypot = (float) Math.hypot(h6.x - f5, h6.y - f6);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f5, f6, hypot, g5, e5, Shader.TileMode.CLAMP);
        this.f969e.put(i5, radialGradient2);
        return radialGradient2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f981q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i5 = 0; i5 < list2.size(); i5++) {
            c cVar = list2.get(i5);
            if (cVar instanceof n) {
                this.f973i.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t5 == c1.f1144d) {
            this.f976l.o(jVar);
            return;
        }
        if (t5 == c1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f979o;
            if (aVar != null) {
                this.f967c.H(aVar);
            }
            if (jVar == null) {
                this.f979o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f979o = qVar;
            qVar.a(this);
            this.f967c.i(this.f979o);
            return;
        }
        if (t5 == c1.L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f980p;
            if (qVar2 != null) {
                this.f967c.H(qVar2);
            }
            if (jVar == null) {
                this.f980p = null;
                return;
            }
            this.f968d.clear();
            this.f969e.clear();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f980p = qVar3;
            qVar3.a(this);
            this.f967c.i(this.f980p);
            return;
        }
        if (t5 == c1.f1150j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f983s;
            if (aVar2 != null) {
                aVar2.o(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f983s = qVar4;
            qVar4.a(this);
            this.f967c.i(this.f983s);
            return;
        }
        if (t5 == c1.f1145e && (cVar5 = this.f985u) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t5 == c1.G && (cVar4 = this.f985u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t5 == c1.H && (cVar3 = this.f985u) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t5 == c1.I && (cVar2 = this.f985u) != null) {
            cVar2.e(jVar);
        } else if (t5 == c1.J && (cVar = this.f985u) != null) {
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        this.f970f.reset();
        for (int i5 = 0; i5 < this.f973i.size(); i5++) {
            this.f970f.addPath(this.f973i.get(i5).getPath(), matrix);
        }
        this.f970f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f965a;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        Shader k5;
        if (this.f966b) {
            return;
        }
        com.airbnb.lottie.f.b("GradientFillContent#draw");
        this.f970f.reset();
        for (int i6 = 0; i6 < this.f973i.size(); i6++) {
            this.f970f.addPath(this.f973i.get(i6).getPath(), matrix);
        }
        this.f970f.computeBounds(this.f972h, false);
        if (this.f974j == com.airbnb.lottie.model.content.g.LINEAR) {
            k5 = j();
        } else {
            k5 = k();
        }
        k5.setLocalMatrix(matrix);
        this.f971g.setShader(k5);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f979o;
        if (aVar != null) {
            this.f971g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f983s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f971g.setMaskFilter(null);
            } else if (floatValue != this.f984t) {
                this.f971g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f984t = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f985u;
        if (cVar != null) {
            cVar.b(this.f971g);
        }
        this.f971g.setAlpha(com.airbnb.lottie.utils.k.d((int) ((((i5 / 255.0f) * this.f976l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f970f, this.f971g);
        com.airbnb.lottie.f.c("GradientFillContent#draw");
    }
}

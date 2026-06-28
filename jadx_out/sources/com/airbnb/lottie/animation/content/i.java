package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class i extends a {
    private static final int C = 32;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> A;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.q B;

    /* renamed from: r, reason: collision with root package name */
    private final String f986r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f987s;

    /* renamed from: t, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f988t;

    /* renamed from: u, reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f989u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f990v;

    /* renamed from: w, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f991w;

    /* renamed from: x, reason: collision with root package name */
    private final int f992x;

    /* renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f993y;

    /* renamed from: z, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f994z;

    public i(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(x0Var, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f988t = new LongSparseArray<>();
        this.f989u = new LongSparseArray<>();
        this.f990v = new RectF();
        this.f986r = fVar.j();
        this.f991w = fVar.f();
        this.f987s = fVar.n();
        this.f992x = (int) (x0Var.R().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> a5 = fVar.e().a();
        this.f993y = a5;
        a5.a(this);
        bVar.i(a5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = fVar.l().a();
        this.f994z = a6;
        a6.a(this);
        bVar.i(a6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a7 = fVar.d().a();
        this.A = a7;
        a7.a(this);
        bVar.i(a7);
    }

    private int[] j(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.B;
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

    private int k() {
        int i5;
        int round = Math.round(this.f994z.f() * this.f992x);
        int round2 = Math.round(this.A.f() * this.f992x);
        int round3 = Math.round(this.f993y.f() * this.f992x);
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

    private LinearGradient l() {
        long k5 = k();
        LinearGradient linearGradient = this.f988t.get(k5);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF h5 = this.f994z.h();
        PointF h6 = this.A.h();
        com.airbnb.lottie.model.content.d h7 = this.f993y.h();
        LinearGradient linearGradient2 = new LinearGradient(h5.x, h5.y, h6.x, h6.y, j(h7.d()), h7.e(), Shader.TileMode.CLAMP);
        this.f988t.put(k5, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient m() {
        long k5 = k();
        RadialGradient radialGradient = this.f989u.get(k5);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF h5 = this.f994z.h();
        PointF h6 = this.A.h();
        com.airbnb.lottie.model.content.d h7 = this.f993y.h();
        int[] j5 = j(h7.d());
        float[] e5 = h7.e();
        RadialGradient radialGradient2 = new RadialGradient(h5.x, h5.y, (float) Math.hypot(h6.x - r7, h6.y - r8), j5, e5, Shader.TileMode.CLAMP);
        this.f989u.put(k5, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.B;
            if (qVar != null) {
                this.f916f.H(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.B = qVar2;
            qVar2.a(this);
            this.f916f.i(this.B);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f986r;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        Shader m5;
        if (this.f987s) {
            return;
        }
        f(this.f990v, matrix, false);
        if (this.f991w == com.airbnb.lottie.model.content.g.LINEAR) {
            m5 = l();
        } else {
            m5 = m();
        }
        m5.setLocalMatrix(matrix);
        this.f919i.setShader(m5);
        super.h(canvas, matrix, i5);
    }
}

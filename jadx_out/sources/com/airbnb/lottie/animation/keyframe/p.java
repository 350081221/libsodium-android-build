package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import java.util.Collections;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1120a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f1121b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1122c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f1123d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f1124e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private a<PointF, PointF> f1125f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private a<?, PointF> f1126g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f1127h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private a<Float, Float> f1128i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private a<Integer, Integer> f1129j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private d f1130k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private d f1131l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private a<?, Float> f1132m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private a<?, Float> f1133n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f1134o;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        a<PointF, PointF> a5;
        a<PointF, PointF> a6;
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> a7;
        a<Float, Float> a8;
        d dVar;
        d dVar2;
        if (lVar.c() == null) {
            a5 = null;
        } else {
            a5 = lVar.c().a();
        }
        this.f1125f = a5;
        if (lVar.f() == null) {
            a6 = null;
        } else {
            a6 = lVar.f().a();
        }
        this.f1126g = a6;
        if (lVar.h() == null) {
            a7 = null;
        } else {
            a7 = lVar.h().a();
        }
        this.f1127h = a7;
        if (lVar.g() == null) {
            a8 = null;
        } else {
            a8 = lVar.g().a();
        }
        this.f1128i = a8;
        if (lVar.i() == null) {
            dVar = null;
        } else {
            dVar = (d) lVar.i().a();
        }
        this.f1130k = dVar;
        this.f1134o = lVar.l();
        if (this.f1130k != null) {
            this.f1121b = new Matrix();
            this.f1122c = new Matrix();
            this.f1123d = new Matrix();
            this.f1124e = new float[9];
        } else {
            this.f1121b = null;
            this.f1122c = null;
            this.f1123d = null;
            this.f1124e = null;
        }
        if (lVar.j() == null) {
            dVar2 = null;
        } else {
            dVar2 = (d) lVar.j().a();
        }
        this.f1131l = dVar2;
        if (lVar.e() != null) {
            this.f1129j = lVar.e().a();
        }
        if (lVar.k() != null) {
            this.f1132m = lVar.k().a();
        } else {
            this.f1132m = null;
        }
        if (lVar.d() != null) {
            this.f1133n = lVar.d().a();
        } else {
            this.f1133n = null;
        }
    }

    private void d() {
        for (int i5 = 0; i5 < 9; i5++) {
            this.f1124e[i5] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.f1129j);
        bVar.i(this.f1132m);
        bVar.i(this.f1133n);
        bVar.i(this.f1125f);
        bVar.i(this.f1126g);
        bVar.i(this.f1127h);
        bVar.i(this.f1128i);
        bVar.i(this.f1130k);
        bVar.i(this.f1131l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f1129j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f1132m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f1133n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f1125f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f1126g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f1127h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f1128i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f1130k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f1131l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        if (t5 == c1.f1146f) {
            a<PointF, PointF> aVar = this.f1125f;
            if (aVar == null) {
                this.f1125f = new q(jVar, new PointF());
                return true;
            }
            aVar.o(jVar);
            return true;
        }
        if (t5 == c1.f1147g) {
            a<?, PointF> aVar2 = this.f1126g;
            if (aVar2 == null) {
                this.f1126g = new q(jVar, new PointF());
                return true;
            }
            aVar2.o(jVar);
            return true;
        }
        if (t5 == c1.f1148h) {
            a<?, PointF> aVar3 = this.f1126g;
            if (aVar3 instanceof n) {
                ((n) aVar3).s(jVar);
                return true;
            }
        }
        if (t5 == c1.f1149i) {
            a<?, PointF> aVar4 = this.f1126g;
            if (aVar4 instanceof n) {
                ((n) aVar4).t(jVar);
                return true;
            }
        }
        if (t5 == c1.f1155o) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f1127h;
            if (aVar5 == null) {
                this.f1127h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar5.o(jVar);
            return true;
        }
        if (t5 == c1.f1156p) {
            a<Float, Float> aVar6 = this.f1128i;
            if (aVar6 == null) {
                this.f1128i = new q(jVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.o(jVar);
            return true;
        }
        if (t5 == c1.f1143c) {
            a<Integer, Integer> aVar7 = this.f1129j;
            if (aVar7 == null) {
                this.f1129j = new q(jVar, 100);
                return true;
            }
            aVar7.o(jVar);
            return true;
        }
        if (t5 == c1.C) {
            a<?, Float> aVar8 = this.f1132m;
            if (aVar8 == null) {
                this.f1132m = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.o(jVar);
            return true;
        }
        if (t5 == c1.D) {
            a<?, Float> aVar9 = this.f1133n;
            if (aVar9 == null) {
                this.f1133n = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.o(jVar);
            return true;
        }
        if (t5 == c1.f1157q) {
            if (this.f1130k == null) {
                this.f1130k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f1130k.o(jVar);
            return true;
        }
        if (t5 == c1.f1158r) {
            if (this.f1131l == null) {
                this.f1131l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f1131l.o(jVar);
            return true;
        }
        return false;
    }

    @Nullable
    public a<?, Float> e() {
        return this.f1133n;
    }

    public Matrix f() {
        float q5;
        PointF h5;
        com.airbnb.lottie.value.k h6;
        float cos;
        float sin;
        PointF h7;
        this.f1120a.reset();
        a<?, PointF> aVar = this.f1126g;
        if (aVar != null && (h7 = aVar.h()) != null) {
            float f5 = h7.x;
            if (f5 != 0.0f || h7.y != 0.0f) {
                this.f1120a.preTranslate(f5, h7.y);
            }
        }
        if (this.f1134o) {
            if (aVar != null) {
                float f6 = aVar.f();
                PointF h8 = aVar.h();
                float f7 = h8.x;
                float f8 = h8.y;
                aVar.n(1.0E-4f + f6);
                PointF h9 = aVar.h();
                aVar.n(f6);
                this.f1120a.preRotate((float) Math.toDegrees(Math.atan2(h9.y - f8, h9.x - f7)));
            }
        } else {
            a<Float, Float> aVar2 = this.f1128i;
            if (aVar2 != null) {
                if (aVar2 instanceof q) {
                    q5 = aVar2.h().floatValue();
                } else {
                    q5 = ((d) aVar2).q();
                }
                if (q5 != 0.0f) {
                    this.f1120a.preRotate(q5);
                }
            }
        }
        if (this.f1130k != null) {
            if (this.f1131l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.q()) + 90.0f));
            }
            if (this.f1131l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.q()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.q()));
            d();
            float[] fArr = this.f1124e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f9 = -sin;
            fArr[3] = f9;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f1121b.setValues(fArr);
            d();
            float[] fArr2 = this.f1124e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f1122c.setValues(fArr2);
            d();
            float[] fArr3 = this.f1124e;
            fArr3[0] = cos;
            fArr3[1] = f9;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f1123d.setValues(fArr3);
            this.f1122c.preConcat(this.f1121b);
            this.f1123d.preConcat(this.f1122c);
            this.f1120a.preConcat(this.f1123d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f1127h;
        if (aVar3 != null && (h6 = aVar3.h()) != null && (h6.b() != 1.0f || h6.c() != 1.0f)) {
            this.f1120a.preScale(h6.b(), h6.c());
        }
        a<PointF, PointF> aVar4 = this.f1125f;
        if (aVar4 != null && (h5 = aVar4.h()) != null) {
            float f10 = h5.x;
            if (f10 != 0.0f || h5.y != 0.0f) {
                this.f1120a.preTranslate(-f10, -h5.y);
            }
        }
        return this.f1120a;
    }

    public Matrix g(float f5) {
        PointF h5;
        com.airbnb.lottie.value.k h6;
        float f6;
        a<?, PointF> aVar = this.f1126g;
        PointF pointF = null;
        if (aVar == null) {
            h5 = null;
        } else {
            h5 = aVar.h();
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f1127h;
        if (aVar2 == null) {
            h6 = null;
        } else {
            h6 = aVar2.h();
        }
        this.f1120a.reset();
        if (h5 != null) {
            this.f1120a.preTranslate(h5.x * f5, h5.y * f5);
        }
        if (h6 != null) {
            double d5 = f5;
            this.f1120a.preScale((float) Math.pow(h6.b(), d5), (float) Math.pow(h6.c(), d5));
        }
        a<Float, Float> aVar3 = this.f1128i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f1125f;
            if (aVar4 != null) {
                pointF = aVar4.h();
            }
            Matrix matrix = this.f1120a;
            float f7 = floatValue * f5;
            float f8 = 0.0f;
            if (pointF == null) {
                f6 = 0.0f;
            } else {
                f6 = pointF.x;
            }
            if (pointF != null) {
                f8 = pointF.y;
            }
            matrix.preRotate(f7, f6, f8);
        }
        return this.f1120a;
    }

    @Nullable
    public a<?, Integer> h() {
        return this.f1129j;
    }

    @Nullable
    public a<?, Float> i() {
        return this.f1132m;
    }

    public void j(float f5) {
        a<Integer, Integer> aVar = this.f1129j;
        if (aVar != null) {
            aVar.n(f5);
        }
        a<?, Float> aVar2 = this.f1132m;
        if (aVar2 != null) {
            aVar2.n(f5);
        }
        a<?, Float> aVar3 = this.f1133n;
        if (aVar3 != null) {
            aVar3.n(f5);
        }
        a<PointF, PointF> aVar4 = this.f1125f;
        if (aVar4 != null) {
            aVar4.n(f5);
        }
        a<?, PointF> aVar5 = this.f1126g;
        if (aVar5 != null) {
            aVar5.n(f5);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f1127h;
        if (aVar6 != null) {
            aVar6.n(f5);
        }
        a<Float, Float> aVar7 = this.f1128i;
        if (aVar7 != null) {
            aVar7.n(f5);
        }
        d dVar = this.f1130k;
        if (dVar != null) {
            dVar.n(f5);
        }
        d dVar2 = this.f1131l;
        if (dVar2 != null) {
            dVar2.n(f5);
        }
    }
}

package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.model.content.t;
import com.airbnb.lottie.x0;
import java.util.List;

/* loaded from: classes2.dex */
public class o implements n, a.b, k {

    /* renamed from: s, reason: collision with root package name */
    private static final float f1002s = 0.47829f;

    /* renamed from: t, reason: collision with root package name */
    private static final float f1003t = 0.25f;

    /* renamed from: e, reason: collision with root package name */
    private final String f1008e;

    /* renamed from: f, reason: collision with root package name */
    private final x0 f1009f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f1010g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1011h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1012i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1013j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f1014k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1015l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1016m;

    /* renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1017n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1018o;

    /* renamed from: p, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f1019p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1021r;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1004a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f1005b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final PathMeasure f1006c = new PathMeasure();

    /* renamed from: d, reason: collision with root package name */
    private final float[] f1007d = new float[2];

    /* renamed from: q, reason: collision with root package name */
    private final b f1020q = new b();

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1022a;

        static {
            int[] iArr = new int[k.a.values().length];
            f1022a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1022a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this.f1009f = x0Var;
        this.f1008e = kVar.d();
        k.a j5 = kVar.j();
        this.f1010g = j5;
        this.f1011h = kVar.k();
        this.f1012i = kVar.l();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = kVar.g().a();
        this.f1013j = a5;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a6 = kVar.h().a();
        this.f1014k = a6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a7 = kVar.i().a();
        this.f1015l = a7;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = kVar.e().a();
        this.f1017n = a8;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = kVar.f().a();
        this.f1019p = a9;
        k.a aVar = k.a.STAR;
        if (j5 == aVar) {
            this.f1016m = kVar.b().a();
            this.f1018o = kVar.c().a();
        } else {
            this.f1016m = null;
            this.f1018o = null;
        }
        bVar.i(a5);
        bVar.i(a6);
        bVar.i(a7);
        bVar.i(a8);
        bVar.i(a9);
        if (j5 == aVar) {
            bVar.i(this.f1016m);
            bVar.i(this.f1018o);
        }
        a5.a(this);
        a6.a(this);
        a7.a(this);
        a8.a(this);
        a9.a(this);
        if (j5 == aVar) {
            this.f1016m.a(this);
            this.f1018o.a(this);
        }
    }

    private void g() {
        double floatValue;
        double d5;
        float f5;
        o oVar;
        o oVar2 = this;
        int floor = (int) Math.floor(oVar2.f1013j.h().floatValue());
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = oVar2.f1015l;
        if (aVar == null) {
            floatValue = 0.0d;
        } else {
            floatValue = aVar.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d6 = floor;
        float floatValue2 = oVar2.f1019p.h().floatValue() / 100.0f;
        float floatValue3 = oVar2.f1017n.h().floatValue();
        double d7 = floatValue3;
        float cos = (float) (Math.cos(radians) * d7);
        float sin = (float) (Math.sin(radians) * d7);
        oVar2.f1004a.moveTo(cos, sin);
        double d8 = (float) (6.283185307179586d / d6);
        double ceil = Math.ceil(d6);
        double d9 = radians + d8;
        int i5 = 0;
        while (true) {
            double d10 = i5;
            if (d10 < ceil) {
                int i6 = i5;
                float cos2 = (float) (d7 * Math.cos(d9));
                double d11 = d8;
                float sin2 = (float) (d7 * Math.sin(d9));
                if (floatValue2 != 0.0f) {
                    d5 = d7;
                    double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f5 = sin2;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f6 = floatValue3 * floatValue2 * f1003t;
                    float f7 = cos3 * f6;
                    float f8 = sin3 * f6;
                    float f9 = cos4 * f6;
                    float f10 = f6 * sin4;
                    if (d10 == ceil - 1.0d) {
                        oVar = this;
                        oVar.f1005b.reset();
                        oVar.f1005b.moveTo(cos, sin);
                        float f11 = cos - f7;
                        float f12 = sin - f8;
                        float f13 = cos2 + f9;
                        float f14 = f10 + f5;
                        oVar.f1005b.cubicTo(f11, f12, f13, f14, cos2, f5);
                        oVar.f1006c.setPath(oVar.f1005b, false);
                        PathMeasure pathMeasure = oVar.f1006c;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, oVar.f1007d, null);
                        Path path = oVar.f1004a;
                        float[] fArr = oVar.f1007d;
                        path.cubicTo(f11, f12, f13, f14, fArr[0], fArr[1]);
                    } else {
                        oVar = this;
                        oVar.f1004a.cubicTo(cos - f7, sin - f8, cos2 + f9, f5 + f10, cos2, f5);
                    }
                } else {
                    d5 = d7;
                    f5 = sin2;
                    oVar = oVar2;
                    if (d10 != ceil - 1.0d) {
                        oVar.f1004a.lineTo(cos2, f5);
                    } else {
                        sin = f5;
                        cos = cos2;
                        d8 = d11;
                        i5 = i6 + 1;
                        oVar2 = oVar;
                        d7 = d5;
                    }
                }
                d9 += d11;
                sin = f5;
                cos = cos2;
                d8 = d11;
                i5 = i6 + 1;
                oVar2 = oVar;
                d7 = d5;
            } else {
                o oVar3 = oVar2;
                PointF h5 = oVar3.f1014k.h();
                oVar3.f1004a.offset(h5.x, h5.y);
                oVar3.f1004a.close();
                return;
            }
        }
    }

    private void i() {
        double floatValue;
        float f5;
        float f6;
        int i5;
        float f7;
        float f8;
        double d5;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        double d6;
        float f14;
        float f15;
        float f16;
        double d7;
        float f17;
        float f18;
        float f19;
        float f20;
        float floatValue2 = this.f1013j.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f1015l;
        if (aVar == null) {
            floatValue = 0.0d;
        } else {
            floatValue = aVar.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d8 = floatValue2;
        float f21 = (float) (6.283185307179586d / d8);
        if (this.f1012i) {
            f21 *= -1.0f;
        }
        float f22 = f21 / 2.0f;
        float f23 = floatValue2 - ((int) floatValue2);
        int i6 = (f23 > 0.0f ? 1 : (f23 == 0.0f ? 0 : -1));
        if (i6 != 0) {
            radians += (1.0f - f23) * f22;
        }
        float floatValue3 = this.f1017n.h().floatValue();
        float floatValue4 = this.f1016m.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f1018o;
        if (aVar2 != null) {
            f5 = aVar2.h().floatValue() / 100.0f;
        } else {
            f5 = 0.0f;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f1019p;
        if (aVar3 != null) {
            f6 = aVar3.h().floatValue() / 100.0f;
        } else {
            f6 = 0.0f;
        }
        if (i6 != 0) {
            f10 = ((floatValue3 - floatValue4) * f23) + floatValue4;
            i5 = i6;
            double d9 = f10;
            float cos = (float) (d9 * Math.cos(radians));
            f9 = (float) (d9 * Math.sin(radians));
            this.f1004a.moveTo(cos, f9);
            d5 = radians + ((f21 * f23) / 2.0f);
            f7 = cos;
            f8 = f22;
        } else {
            i5 = i6;
            double d10 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d10);
            float sin = (float) (d10 * Math.sin(radians));
            this.f1004a.moveTo(cos2, sin);
            f7 = cos2;
            f8 = f22;
            d5 = radians + f8;
            f9 = sin;
            f10 = 0.0f;
        }
        double ceil = Math.ceil(d8) * 2.0d;
        int i7 = 0;
        float f24 = f8;
        float f25 = f7;
        boolean z4 = false;
        while (true) {
            double d11 = i7;
            if (d11 < ceil) {
                if (z4) {
                    f11 = floatValue3;
                } else {
                    f11 = floatValue4;
                }
                if (f10 != 0.0f && d11 == ceil - 2.0d) {
                    f12 = f21;
                    f13 = (f21 * f23) / 2.0f;
                } else {
                    f12 = f21;
                    f13 = f24;
                }
                if (f10 != 0.0f && d11 == ceil - 1.0d) {
                    d6 = d11;
                    f14 = f10;
                } else {
                    d6 = d11;
                    f14 = f10;
                    f10 = f11;
                }
                double d12 = f10;
                double d13 = ceil;
                float cos3 = (float) (d12 * Math.cos(d5));
                float sin2 = (float) (d12 * Math.sin(d5));
                if (f5 == 0.0f && f6 == 0.0f) {
                    this.f1004a.lineTo(cos3, sin2);
                    d7 = d5;
                    f15 = f5;
                    f16 = f6;
                } else {
                    f15 = f5;
                    double atan2 = (float) (Math.atan2(f9, f25) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f16 = f6;
                    d7 = d5;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z4) {
                        f17 = f15;
                    } else {
                        f17 = f16;
                    }
                    if (z4) {
                        f18 = f16;
                    } else {
                        f18 = f15;
                    }
                    if (z4) {
                        f19 = floatValue4;
                    } else {
                        f19 = floatValue3;
                    }
                    if (z4) {
                        f20 = floatValue3;
                    } else {
                        f20 = floatValue4;
                    }
                    float f26 = f19 * f17 * f1002s;
                    float f27 = cos4 * f26;
                    float f28 = f26 * sin3;
                    float f29 = f20 * f18 * f1002s;
                    float f30 = cos5 * f29;
                    float f31 = f29 * sin4;
                    if (i5 != 0) {
                        if (i7 == 0) {
                            f27 *= f23;
                            f28 *= f23;
                        } else if (d6 == d13 - 1.0d) {
                            f30 *= f23;
                            f31 *= f23;
                        }
                    }
                    this.f1004a.cubicTo(f25 - f27, f9 - f28, cos3 + f30, sin2 + f31, cos3, sin2);
                }
                d5 = d7 + f13;
                z4 = !z4;
                i7++;
                f25 = cos3;
                f9 = sin2;
                f6 = f16;
                f5 = f15;
                f10 = f14;
                f21 = f12;
                ceil = d13;
            } else {
                PointF h5 = this.f1014k.h();
                this.f1004a.offset(h5.x, h5.y);
                this.f1004a.close();
                return;
            }
        }
    }

    private void j() {
        this.f1021r = false;
        this.f1009f.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        j();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            c cVar = list.get(i5);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f1020q.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t5 == c1.f1163w) {
            this.f1013j.o(jVar);
            return;
        }
        if (t5 == c1.f1164x) {
            this.f1015l.o(jVar);
            return;
        }
        if (t5 == c1.f1154n) {
            this.f1014k.o(jVar);
            return;
        }
        if (t5 == c1.f1165y && (aVar2 = this.f1016m) != null) {
            aVar2.o(jVar);
            return;
        }
        if (t5 == c1.f1166z) {
            this.f1017n.o(jVar);
            return;
        }
        if (t5 == c1.A && (aVar = this.f1018o) != null) {
            aVar.o(jVar);
        } else if (t5 == c1.B) {
            this.f1019p.o(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i5, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.k.m(eVar, i5, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1008e;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f1021r) {
            return this.f1004a;
        }
        this.f1004a.reset();
        if (this.f1011h) {
            this.f1021r = true;
            return this.f1004a;
        }
        int i5 = a.f1022a[this.f1010g.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                g();
            }
        } else {
            i();
        }
        this.f1004a.close();
        this.f1020q.b(this.f1004a);
        this.f1021r = true;
        return this.f1004a;
    }
}

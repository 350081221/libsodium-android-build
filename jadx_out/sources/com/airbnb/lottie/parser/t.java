package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.c;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private static final float f1704a = 100.0f;

    /* renamed from: c, reason: collision with root package name */
    private static SparseArrayCompat<WeakReference<Interpolator>> f1706c;

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f1705b = new LinearInterpolator();

    /* renamed from: d, reason: collision with root package name */
    static c.a f1707d = c.a.a(bi.aL, bi.aE, "e", "o", "i", bi.aJ, TypedValues.TransitionType.S_TO, "ti");

    /* renamed from: e, reason: collision with root package name */
    static c.a f1708e = c.a.a("x", "y");

    t() {
    }

    @Nullable
    private static WeakReference<Interpolator> a(int i5) {
        WeakReference<Interpolator> weakReference;
        synchronized (t.class) {
            weakReference = g().get(i5);
        }
        return weakReference;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> a5;
        Interpolator linearInterpolator;
        pointF.x = com.airbnb.lottie.utils.k.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.k.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.k.c(pointF2.x, -1.0f, 1.0f);
        float c5 = com.airbnb.lottie.utils.k.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c5;
        int i5 = com.airbnb.lottie.utils.l.i(pointF.x, pointF.y, pointF2.x, c5);
        Interpolator interpolator = null;
        if (com.airbnb.lottie.f.e()) {
            a5 = null;
        } else {
            a5 = a(i5);
        }
        if (a5 != null) {
            interpolator = a5.get();
        }
        if (a5 == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e5) {
                if ("The Path cannot loop back on itself.".equals(e5.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.airbnb.lottie.f.e()) {
                try {
                    h(i5, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> com.airbnb.lottie.value.a<T> c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f5, n0<T> n0Var, boolean z4, boolean z5) throws IOException {
        if (z4 && z5) {
            return e(kVar, cVar, f5, n0Var);
        }
        if (z4) {
            return d(kVar, cVar, f5, n0Var);
        }
        return f(cVar, f5, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f5, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t5;
        cVar.c();
        PointF pointF = null;
        T t6 = null;
        T t7 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f6 = 0.0f;
        boolean z4 = false;
        PointF pointF4 = null;
        while (cVar.j()) {
            switch (cVar.J(f1707d)) {
                case 0:
                    f6 = (float) cVar.o();
                    break;
                case 1:
                    t7 = n0Var.a(cVar, f5);
                    break;
                case 2:
                    t6 = n0Var.a(cVar, f5);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.p() == 1) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f5);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f5);
                    break;
                default:
                    cVar.O();
                    break;
            }
        }
        cVar.h();
        if (z4) {
            interpolator2 = f1705b;
            t5 = t7;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = b(pointF, pointF4);
            } else {
                interpolator = f1705b;
            }
            interpolator2 = interpolator;
            t5 = t6;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(kVar, t7, t5, interpolator2, f6, null);
        aVar.f1795o = pointF2;
        aVar.f1796p = pointF3;
        return aVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f5, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b5;
        Interpolator b6;
        T t5;
        PointF pointF;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF2;
        float f6;
        PointF pointF3;
        float f7;
        cVar.c();
        PointF pointF4 = null;
        boolean z4 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t6 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f8 = 0.0f;
        PointF pointF11 = null;
        T t7 = null;
        while (cVar.j()) {
            switch (cVar.J(f1707d)) {
                case 0:
                    pointF2 = pointF4;
                    f8 = (float) cVar.o();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    t6 = n0Var.a(cVar, f5);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    t7 = n0Var.a(cVar, f5);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f6 = f8;
                    PointF pointF12 = pointF11;
                    if (cVar.H() == c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (cVar.j()) {
                            int J = cVar.J(f1708e);
                            if (J != 0) {
                                if (J != 1) {
                                    cVar.O();
                                } else {
                                    c.b H = cVar.H();
                                    c.b bVar = c.b.NUMBER;
                                    if (H == bVar) {
                                        f12 = (float) cVar.o();
                                        f10 = f12;
                                    } else {
                                        cVar.b();
                                        f10 = (float) cVar.o();
                                        if (cVar.H() == bVar) {
                                            f12 = (float) cVar.o();
                                        } else {
                                            f12 = f10;
                                        }
                                        cVar.d();
                                    }
                                }
                            } else {
                                c.b H2 = cVar.H();
                                c.b bVar2 = c.b.NUMBER;
                                if (H2 == bVar2) {
                                    f11 = (float) cVar.o();
                                    f9 = f11;
                                } else {
                                    cVar.b();
                                    f9 = (float) cVar.o();
                                    if (cVar.H() == bVar2) {
                                        f11 = (float) cVar.o();
                                    } else {
                                        f11 = f9;
                                    }
                                    cVar.d();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f9, f10);
                        PointF pointF14 = new PointF(f11, f12);
                        cVar.h();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f8 = f6;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = s.e(cVar, f5);
                        f8 = f6;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (cVar.H() == c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.j()) {
                            PointF pointF15 = pointF11;
                            int J2 = cVar.J(f1708e);
                            if (J2 != 0) {
                                pointF3 = pointF4;
                                if (J2 != 1) {
                                    cVar.O();
                                } else {
                                    c.b H3 = cVar.H();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (H3 == bVar3) {
                                        f16 = (float) cVar.o();
                                        f8 = f8;
                                        f14 = f16;
                                    } else {
                                        float f17 = f8;
                                        cVar.b();
                                        float o5 = (float) cVar.o();
                                        if (cVar.H() == bVar3) {
                                            f7 = (float) cVar.o();
                                        } else {
                                            f7 = o5;
                                        }
                                        cVar.d();
                                        f8 = f17;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f16 = f7;
                                        f14 = o5;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f18 = f8;
                                c.b H4 = cVar.H();
                                c.b bVar4 = c.b.NUMBER;
                                if (H4 == bVar4) {
                                    f15 = (float) cVar.o();
                                    f8 = f18;
                                    f13 = f15;
                                } else {
                                    cVar.b();
                                    f13 = (float) cVar.o();
                                    if (cVar.H() == bVar4) {
                                        f15 = (float) cVar.o();
                                    } else {
                                        f15 = f13;
                                    }
                                    cVar.d();
                                    f8 = f18;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f6 = f8;
                        PointF pointF16 = new PointF(f13, f14);
                        PointF pointF17 = new PointF(f15, f16);
                        cVar.h();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f8 = f6;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(cVar, f5);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (cVar.p() == 1) {
                        z4 = true;
                        break;
                    } else {
                        z4 = false;
                        break;
                    }
                case 6:
                    pointF11 = s.e(cVar, f5);
                    break;
                case 7:
                    pointF4 = s.e(cVar, f5);
                    break;
                default:
                    pointF2 = pointF4;
                    cVar.O();
                    pointF4 = pointF2;
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f19 = f8;
        PointF pointF19 = pointF11;
        cVar.h();
        if (z4) {
            interpolator = f1705b;
            t5 = t6;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    b5 = b(pointF7, pointF9);
                    b6 = b(pointF8, pointF10);
                    t5 = t7;
                    interpolator = null;
                    if (b5 == null && b6 != null) {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(kVar, t6, t5, b5, b6, f19, null);
                    } else {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(kVar, t6, t5, interpolator, f19, null);
                    }
                    aVar.f1795o = pointF;
                    aVar.f1796p = pointF18;
                    return aVar;
                }
                interpolator = f1705b;
            }
            t5 = t7;
        }
        b5 = null;
        b6 = null;
        if (b5 == null) {
        }
        pointF = pointF19;
        aVar = new com.airbnb.lottie.value.a<>(kVar, t6, t5, interpolator, f19, null);
        aVar.f1795o = pointF;
        aVar.f1796p = pointF18;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(com.airbnb.lottie.parser.moshi.c cVar, float f5, n0<T> n0Var) throws IOException {
        return new com.airbnb.lottie.value.a<>(n0Var.a(cVar, f5));
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (f1706c == null) {
            f1706c = new SparseArrayCompat<>();
        }
        return f1706c;
    }

    private static void h(int i5, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f1706c.put(i5, weakReference);
        }
    }
}

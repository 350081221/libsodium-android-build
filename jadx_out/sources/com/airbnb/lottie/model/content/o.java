package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.a> f1463a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f1464b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1465c;

    public o(PointF pointF, boolean z4, List<com.airbnb.lottie.model.a> list) {
        this.f1464b = pointF;
        this.f1465c = z4;
        this.f1463a = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> a() {
        return this.f1463a;
    }

    public PointF b() {
        return this.f1464b;
    }

    public void c(o oVar, o oVar2, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        boolean z4;
        if (this.f1464b == null) {
            this.f1464b = new PointF();
        }
        if (!oVar.d() && !oVar2.d()) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f1465c = z4;
        if (oVar.a().size() != oVar2.a().size()) {
            com.airbnb.lottie.utils.f.e("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f1463a.size() < min) {
            for (int size = this.f1463a.size(); size < min; size++) {
                this.f1463a.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.f1463a.size() > min) {
            for (int size2 = this.f1463a.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.f1463a;
                list.remove(list.size() - 1);
            }
        }
        PointF b5 = oVar.b();
        PointF b6 = oVar2.b();
        f(com.airbnb.lottie.utils.k.k(b5.x, b6.x, f5), com.airbnb.lottie.utils.k.k(b5.y, b6.y, f5));
        for (int size3 = this.f1463a.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = oVar.a().get(size3);
            com.airbnb.lottie.model.a aVar2 = oVar2.a().get(size3);
            PointF a5 = aVar.a();
            PointF b7 = aVar.b();
            PointF c5 = aVar.c();
            PointF a6 = aVar2.a();
            PointF b8 = aVar2.b();
            PointF c6 = aVar2.c();
            this.f1463a.get(size3).d(com.airbnb.lottie.utils.k.k(a5.x, a6.x, f5), com.airbnb.lottie.utils.k.k(a5.y, a6.y, f5));
            this.f1463a.get(size3).e(com.airbnb.lottie.utils.k.k(b7.x, b8.x, f5), com.airbnb.lottie.utils.k.k(b7.y, b8.y, f5));
            this.f1463a.get(size3).g(com.airbnb.lottie.utils.k.k(c5.x, c6.x, f5), com.airbnb.lottie.utils.k.k(c5.y, c6.y, f5));
        }
    }

    public boolean d() {
        return this.f1465c;
    }

    public void e(boolean z4) {
        this.f1465c = z4;
    }

    public void f(float f5, float f6) {
        if (this.f1464b == null) {
            this.f1464b = new PointF();
        }
        this.f1464b.set(f5, f6);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f1463a.size() + "closed=" + this.f1465c + '}';
    }

    public o() {
        this.f1463a = new ArrayList();
    }
}

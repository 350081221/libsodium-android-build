package com.airbnb.lottie.animation.content;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class r implements t, a.b {

    /* renamed from: e, reason: collision with root package name */
    private static final float f1044e = 0.5519f;

    /* renamed from: a, reason: collision with root package name */
    private final x0 f1045a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1046b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f1047c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.model.content.o f1048d;

    public r(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.n nVar) {
        this.f1045a = x0Var;
        this.f1046b = nVar.c();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = nVar.b().a();
        this.f1047c = a5;
        bVar.i(a5);
        a5.a(this);
    }

    private static int d(int i5, int i6) {
        int i7 = i5 / i6;
        return ((i5 ^ i6) >= 0 || i6 * i7 == i5) ? i7 : i7 - 1;
    }

    private static int e(int i5, int i6) {
        return i5 - (d(i5, i6) * i6);
    }

    @NonNull
    private com.airbnb.lottie.model.content.o i(com.airbnb.lottie.model.content.o oVar) {
        PointF c5;
        PointF b5;
        boolean z4;
        List<com.airbnb.lottie.model.a> a5 = oVar.a();
        boolean d5 = oVar.d();
        int i5 = 0;
        for (int size = a5.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.model.a aVar = a5.get(size);
            com.airbnb.lottie.model.a aVar2 = a5.get(e(size - 1, a5.size()));
            if (size == 0 && !d5) {
                c5 = oVar.b();
            } else {
                c5 = aVar2.c();
            }
            if (size == 0 && !d5) {
                b5 = c5;
            } else {
                b5 = aVar2.b();
            }
            PointF a6 = aVar.a();
            if (!oVar.d() && (size == 0 || size == a5.size() - 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b5.equals(c5) && a6.equals(c5) && !z4) {
                i5 += 2;
            } else {
                i5++;
            }
        }
        com.airbnb.lottie.model.content.o oVar2 = this.f1048d;
        if (oVar2 == null || oVar2.a().size() != i5) {
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(new com.airbnb.lottie.model.a());
            }
            this.f1048d = new com.airbnb.lottie.model.content.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f1048d.e(d5);
        return this.f1048d;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f1045a.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    @Override // com.airbnb.lottie.animation.content.t
    public com.airbnb.lottie.model.content.o c(com.airbnb.lottie.model.content.o oVar) {
        PointF c5;
        PointF b5;
        boolean z4;
        List<com.airbnb.lottie.model.a> list;
        List<com.airbnb.lottie.model.a> a5 = oVar.a();
        if (a5.size() <= 2) {
            return oVar;
        }
        float floatValue = this.f1047c.h().floatValue();
        if (floatValue == 0.0f) {
            return oVar;
        }
        com.airbnb.lottie.model.content.o i5 = i(oVar);
        i5.f(oVar.b().x, oVar.b().y);
        List<com.airbnb.lottie.model.a> a6 = i5.a();
        boolean d5 = oVar.d();
        int i6 = 0;
        int i7 = 0;
        while (i6 < a5.size()) {
            com.airbnb.lottie.model.a aVar = a5.get(i6);
            com.airbnb.lottie.model.a aVar2 = a5.get(e(i6 - 1, a5.size()));
            com.airbnb.lottie.model.a aVar3 = a5.get(e(i6 - 2, a5.size()));
            if (i6 == 0 && !d5) {
                c5 = oVar.b();
            } else {
                c5 = aVar2.c();
            }
            if (i6 == 0 && !d5) {
                b5 = c5;
            } else {
                b5 = aVar2.b();
            }
            PointF a7 = aVar.a();
            PointF c6 = aVar3.c();
            PointF c7 = aVar.c();
            if (!oVar.d() && (i6 == 0 || i6 == a5.size() - 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b5.equals(c5) && a7.equals(c5) && !z4) {
                float f5 = c5.x;
                float f6 = f5 - c6.x;
                float f7 = c5.y;
                float f8 = f7 - c6.y;
                float f9 = c7.x - f5;
                float f10 = c7.y - f7;
                list = a5;
                float hypot = (float) Math.hypot(f6, f8);
                float hypot2 = (float) Math.hypot(f9, f10);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f11 = c5.x;
                float f12 = ((c6.x - f11) * min) + f11;
                float f13 = c5.y;
                float f14 = ((c6.y - f13) * min) + f13;
                float f15 = ((c7.x - f11) * min2) + f11;
                float f16 = ((c7.y - f13) * min2) + f13;
                float f17 = f12 - ((f12 - f11) * f1044e);
                float f18 = f14 - ((f14 - f13) * f1044e);
                float f19 = f15 - ((f15 - f11) * f1044e);
                float f20 = f16 - ((f16 - f13) * f1044e);
                com.airbnb.lottie.model.a aVar4 = a6.get(e(i7 - 1, a6.size()));
                com.airbnb.lottie.model.a aVar5 = a6.get(i7);
                aVar4.e(f12, f14);
                aVar4.g(f12, f14);
                if (i6 == 0) {
                    i5.f(f12, f14);
                }
                aVar5.d(f17, f18);
                i7++;
                com.airbnb.lottie.model.a aVar6 = a6.get(i7);
                aVar5.e(f19, f20);
                aVar5.g(f15, f16);
                aVar6.d(f15, f16);
            } else {
                list = a5;
                com.airbnb.lottie.model.a aVar7 = a6.get(e(i7 - 1, a6.size()));
                com.airbnb.lottie.model.a aVar8 = a6.get(i7);
                aVar7.e(aVar2.b().x, aVar2.b().y);
                aVar7.g(aVar2.c().x, aVar2.c().y);
                aVar8.d(aVar.a().x, aVar.a().y);
            }
            i7++;
            i6++;
            a5 = list;
        }
        return i5;
    }

    public com.airbnb.lottie.animation.keyframe.a<Float, Float> g() {
        return this.f1047c;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1046b;
    }
}

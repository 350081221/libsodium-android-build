package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.x0;

/* loaded from: classes2.dex */
public class u extends a {

    /* renamed from: r, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f1057r;

    /* renamed from: s, reason: collision with root package name */
    private final String f1058s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f1059t;

    /* renamed from: u, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f1060u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f1061v;

    public u(x0 x0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.s sVar) {
        super(x0Var, bVar, sVar.b().toPaintCap(), sVar.e().toPaintJoin(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f1057r = bVar;
        this.f1058s = sVar.h();
        this.f1059t = sVar.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a5 = sVar.c().a();
        this.f1060u = a5;
        a5.a(this);
        bVar.i(a5);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.f1142b) {
            this.f1060u.o(jVar);
            return;
        }
        if (t5 == c1.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f1061v;
            if (aVar != null) {
                this.f1057r.H(aVar);
            }
            if (jVar == null) {
                this.f1061v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f1061v = qVar;
            qVar.a(this);
            this.f1057r.i(this.f1060u);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f1058s;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i5) {
        if (this.f1059t) {
            return;
        }
        this.f919i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f1060u).q());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f1061v;
        if (aVar != null) {
            this.f919i.setColorFilter(aVar.h());
        }
        super.h(canvas, matrix, i5);
    }
}

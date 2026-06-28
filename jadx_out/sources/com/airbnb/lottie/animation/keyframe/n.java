package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* loaded from: classes2.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f1110i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f1111j;

    /* renamed from: k, reason: collision with root package name */
    private final a<Float, Float> f1112k;

    /* renamed from: l, reason: collision with root package name */
    private final a<Float, Float> f1113l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    protected com.airbnb.lottie.value.j<Float> f1114m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    protected com.airbnb.lottie.value.j<Float> f1115n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f1110i = new PointF();
        this.f1111j = new PointF();
        this.f1112k = aVar;
        this.f1113l = aVar2;
        n(f());
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    public void n(float f5) {
        this.f1112k.n(f5);
        this.f1113l.n(f5);
        this.f1110i.set(this.f1112k.h().floatValue(), this.f1113l.h().floatValue());
        for (int i5 = 0; i5 < this.f1069a.size(); i5++) {
            this.f1069a.get(i5).a();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        Float f6;
        com.airbnb.lottie.value.a<Float> b5;
        float floatValue;
        com.airbnb.lottie.value.a<Float> b6;
        float floatValue2;
        Float f7 = null;
        if (this.f1114m != null && (b6 = this.f1112k.b()) != null) {
            float d5 = this.f1112k.d();
            Float f8 = b6.f1788h;
            com.airbnb.lottie.value.j<Float> jVar = this.f1114m;
            float f9 = b6.f1787g;
            if (f8 == null) {
                floatValue2 = f9;
            } else {
                floatValue2 = f8.floatValue();
            }
            f6 = jVar.b(f9, floatValue2, b6.f1782b, b6.f1783c, f5, f5, d5);
        } else {
            f6 = null;
        }
        if (this.f1115n != null && (b5 = this.f1113l.b()) != null) {
            float d6 = this.f1113l.d();
            Float f10 = b5.f1788h;
            com.airbnb.lottie.value.j<Float> jVar2 = this.f1115n;
            float f11 = b5.f1787g;
            if (f10 == null) {
                floatValue = f11;
            } else {
                floatValue = f10.floatValue();
            }
            f7 = jVar2.b(f11, floatValue, b5.f1782b, b5.f1783c, f5, f5, d6);
        }
        if (f6 == null) {
            this.f1111j.set(this.f1110i.x, 0.0f);
        } else {
            this.f1111j.set(f6.floatValue(), 0.0f);
        }
        if (f7 == null) {
            PointF pointF = this.f1111j;
            pointF.set(pointF.x, this.f1110i.y);
        } else {
            PointF pointF2 = this.f1111j;
            pointF2.set(pointF2.x, f7.floatValue());
        }
        return this.f1111j;
    }

    public void s(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f1114m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f1114m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void t(@Nullable com.airbnb.lottie.value.j<Float> jVar) {
        com.airbnb.lottie.value.j<Float> jVar2 = this.f1115n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f1115n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}

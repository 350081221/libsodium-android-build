package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f1103i;

    public k(List<com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f1103i = new PointF();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        return j(aVar, f5, f5, f5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF j(com.airbnb.lottie.value.a<PointF> aVar, float f5, float f6, float f7) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f1782b;
        if (pointF3 != null && (pointF = aVar.f1783c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            com.airbnb.lottie.value.j<A> jVar = this.f1073e;
            if (jVar != 0 && (pointF2 = (PointF) jVar.b(aVar.f1787g, aVar.f1788h.floatValue(), pointF4, pointF5, f5, e(), f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f1103i;
            float f8 = pointF4.x;
            float f9 = f8 + (f6 * (pointF5.x - f8));
            float f10 = pointF4.y;
            pointF6.set(f9, f10 + (f7 * (pointF5.y - f10)));
            return this.f1103i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}

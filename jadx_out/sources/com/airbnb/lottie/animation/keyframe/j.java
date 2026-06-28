package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    private final PointF f1099i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f1100j;

    /* renamed from: k, reason: collision with root package name */
    private final PathMeasure f1101k;

    /* renamed from: l, reason: collision with root package name */
    private i f1102l;

    public j(List<? extends com.airbnb.lottie.value.a<PointF>> list) {
        super(list);
        this.f1099i = new PointF();
        this.f1100j = new float[2];
        this.f1101k = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(com.airbnb.lottie.value.a<PointF> aVar, float f5) {
        PointF pointF;
        i iVar = (i) aVar;
        Path k5 = iVar.k();
        if (k5 == null) {
            return aVar.f1782b;
        }
        com.airbnb.lottie.value.j<A> jVar = this.f1073e;
        if (jVar != 0 && (pointF = (PointF) jVar.b(iVar.f1787g, iVar.f1788h.floatValue(), (PointF) iVar.f1782b, (PointF) iVar.f1783c, e(), f5, f())) != null) {
            return pointF;
        }
        if (this.f1102l != iVar) {
            this.f1101k.setPath(k5, false);
            this.f1102l = iVar;
        }
        PathMeasure pathMeasure = this.f1101k;
        pathMeasure.getPosTan(f5 * pathMeasure.getLength(), this.f1100j, null);
        PointF pointF2 = this.f1099i;
        float[] fArr = this.f1100j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f1099i;
    }
}

package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    private Path f1097s;

    /* renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f1098t;

    public i(com.airbnb.lottie.k kVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(kVar, aVar.f1782b, aVar.f1783c, aVar.f1784d, aVar.f1785e, aVar.f1786f, aVar.f1787g, aVar.f1788h);
        this.f1098t = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        boolean z4;
        T t5;
        T t6;
        T t7 = this.f1783c;
        if (t7 != 0 && (t6 = this.f1782b) != 0 && ((PointF) t6).equals(((PointF) t7).x, ((PointF) t7).y)) {
            z4 = true;
        } else {
            z4 = false;
        }
        T t8 = this.f1782b;
        if (t8 != 0 && (t5 = this.f1783c) != 0 && !z4) {
            com.airbnb.lottie.value.a<PointF> aVar = this.f1098t;
            this.f1097s = com.airbnb.lottie.utils.l.d((PointF) t8, (PointF) t5, aVar.f1795o, aVar.f1796p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Path k() {
        return this.f1097s;
    }
}

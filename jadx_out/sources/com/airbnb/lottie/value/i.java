package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class i extends j<PointF> {

    /* renamed from: d, reason: collision with root package name */
    private final PointF f1808d;

    public i() {
        this.f1808d = new PointF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PointF e(b<PointF> bVar) {
        T t5 = this.f1811c;
        if (t5 != 0) {
            return (PointF) t5;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PointF a(b<PointF> bVar) {
        this.f1808d.set(com.airbnb.lottie.utils.k.k(bVar.g().x, bVar.b().x, bVar.c()), com.airbnb.lottie.utils.k.k(bVar.g().y, bVar.b().y, bVar.c()));
        PointF e5 = e(bVar);
        this.f1808d.offset(e5.x, e5.y);
        return this.f1808d;
    }

    public i(@NonNull PointF pointF) {
        super(pointF);
        this.f1808d = new PointF();
    }
}

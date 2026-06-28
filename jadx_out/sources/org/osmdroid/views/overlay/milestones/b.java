package org.osmdroid.views.overlay.milestones;

import android.graphics.Canvas;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final double f21956a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21957b;

    public b(double d5, boolean z4) {
        this.f21956a = d5;
        this.f21957b = z4;
    }

    protected abstract void a(Canvas canvas, Object obj);

    public void b(Canvas canvas, k kVar) {
        double d5;
        double d6 = this.f21956a;
        if (this.f21957b) {
            d5 = kVar.b();
        } else {
            d5 = 0.0d;
        }
        canvas.save();
        canvas.rotate((float) (d6 + d5), (float) kVar.c(), (float) kVar.d());
        canvas.translate((float) kVar.c(), (float) kVar.d());
        a(canvas, kVar.a());
        canvas.restore();
    }

    public void c(Canvas canvas) {
    }

    public void d(Canvas canvas) {
    }
}

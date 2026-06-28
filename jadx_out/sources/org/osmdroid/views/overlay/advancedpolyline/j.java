package org.osmdroid.views.overlay.advancedpolyline;

/* loaded from: classes4.dex */
public class j extends h {

    /* renamed from: g, reason: collision with root package name */
    private float f21886g;

    /* renamed from: h, reason: collision with root package name */
    private float f21887h;

    public j(float f5, float f6, float f7, float f8, float f9, float f10) {
        float b5 = a.b(f7, 0.0f, 1.0f);
        float b6 = a.b(f8, 0.0f, 1.0f);
        this.f21886g = a.b(f9, 0.0f, 360.0f);
        this.f21887h = a.b(f10, 0.0f, 1.0f);
        h(f5, f6, b5, b6);
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.h
    protected float e(float f5) {
        return this.f21886g;
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.h
    protected float f(float f5) {
        return i(f5);
    }

    @Override // org.osmdroid.views.overlay.advancedpolyline.h
    protected float g(float f5) {
        return this.f21887h;
    }
}

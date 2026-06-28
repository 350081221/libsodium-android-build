package org.osmdroid.views.overlay.advancedpolyline;

/* loaded from: classes4.dex */
public abstract class h extends d {

    /* renamed from: b, reason: collision with root package name */
    private float f21879b;

    /* renamed from: c, reason: collision with root package name */
    private float f21880c;

    /* renamed from: d, reason: collision with root package name */
    private float f21881d;

    /* renamed from: e, reason: collision with root package name */
    private float f21882e;

    /* renamed from: f, reason: collision with root package name */
    private float f21883f;

    @Override // org.osmdroid.views.overlay.advancedpolyline.d
    protected int c(float f5) {
        return a.a(e(f5), g(f5), f(f5));
    }

    protected abstract float e(float f5);

    protected abstract float f(float f5);

    protected abstract float g(float f5);

    public void h(float f5, float f6, float f7, float f8) {
        float f9;
        this.f21881d = f5;
        this.f21882e = f6;
        this.f21879b = f7;
        this.f21880c = f8;
        if (f6 == f5) {
            f9 = 1.0f;
        } else {
            f9 = (f8 - f7) / (f6 - f5);
        }
        this.f21883f = f9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float i(float f5) {
        if (f5 >= this.f21882e) {
            return this.f21880c;
        }
        float f6 = this.f21881d;
        if (f5 <= f6) {
            return this.f21879b;
        }
        return ((f5 - f6) * this.f21883f) + this.f21879b;
    }
}

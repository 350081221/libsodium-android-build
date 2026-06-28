package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes4.dex */
public class j extends d {

    /* renamed from: e, reason: collision with root package name */
    private final double f21988e;

    /* renamed from: f, reason: collision with root package name */
    private final double f21989f;

    /* renamed from: g, reason: collision with root package name */
    private double f21990g;

    public j(double d5, double d6) {
        this.f21988e = d5;
        this.f21989f = d6;
    }

    @Override // org.osmdroid.views.overlay.milestones.d
    protected void a(long j5, long j6, long j7, long j8) {
        double d5 = j5;
        double d6 = j6;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d5, d6, j7, j8));
        if (sqrt == 0.0d) {
            return;
        }
        double e5 = d.e(j5, j6, j7, j8);
        double d7 = d6;
        while (true) {
            double floor = Math.floor(this.f21990g / this.f21989f);
            double d8 = this.f21989f;
            double d9 = (floor * d8) + d8;
            double d10 = this.f21990g;
            double d11 = d9 - d10;
            if (sqrt < d11) {
                this.f21990g = d10 + sqrt;
                return;
            }
            this.f21990g = d10 + d11;
            double d12 = 0.017453292519943295d * e5;
            d5 += Math.cos(d12) * d11;
            d7 += d11 * Math.sin(d12);
            b(new k((long) d5, (long) d7, e5, Double.valueOf(this.f21990g)));
            sqrt -= d11;
        }
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.f21990g = this.f21989f - this.f21988e;
    }
}

package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes4.dex */
public class g extends d {

    /* renamed from: e, reason: collision with root package name */
    private double f21980e;

    /* renamed from: f, reason: collision with root package name */
    private double f21981f;

    /* renamed from: g, reason: collision with root package name */
    private double f21982g;

    /* renamed from: h, reason: collision with root package name */
    private int f21983h;

    /* renamed from: i, reason: collision with root package name */
    private a f21984i;

    /* loaded from: classes4.dex */
    private enum a {
        STEP_INIT,
        STEP_STARTED,
        STEP_ENDED
    }

    @Override // org.osmdroid.views.overlay.milestones.d
    protected void a(long j5, long j6, long j7, long j8) {
        a aVar;
        double d5;
        double d6;
        a aVar2 = this.f21984i;
        a aVar3 = a.STEP_ENDED;
        if (aVar2 == aVar3) {
            return;
        }
        int i5 = this.f21983h + 1;
        this.f21983h = i5;
        double c5 = c(i5);
        if (c5 == 0.0d) {
            return;
        }
        double d7 = j5;
        double d8 = j6;
        double d9 = c5;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d7, d8, j7, j8)) / d9;
        double e5 = d.e(j5, j6, j7, j8);
        if (this.f21984i == a.STEP_INIT) {
            double d10 = this.f21980e;
            double d11 = this.f21982g;
            double d12 = d10 - d11;
            if (d12 > d9) {
                this.f21982g = d11 + d9;
                return;
            }
            this.f21984i = a.STEP_STARTED;
            this.f21982g = d11 + d12;
            d9 -= d12;
            double d13 = e5 * 0.017453292519943295d;
            double cos = d7 + (Math.cos(d13) * d12 * sqrt);
            double sin = d8 + (d12 * Math.sin(d13) * sqrt);
            b(new k((long) cos, (long) sin, e5, null));
            if (this.f21980e == this.f21981f) {
                this.f21984i = aVar3;
                return;
            } else {
                aVar = aVar3;
                d5 = cos;
                d6 = sin;
            }
        } else {
            aVar = aVar3;
            d5 = d7;
            d6 = d8;
        }
        if (this.f21984i == a.STEP_STARTED) {
            double d14 = this.f21981f;
            double d15 = this.f21982g;
            double d16 = d14 - d15;
            if (d16 > d9) {
                this.f21982g = d15 + d9;
                b(new k(j7, j8, e5, null));
            } else {
                this.f21984i = aVar;
                double d17 = 0.017453292519943295d * e5;
                b(new k((long) (d5 + (Math.cos(d17) * d16 * sqrt)), (long) (d6 + (d16 * Math.sin(d17) * sqrt)), e5, null));
            }
        }
    }

    public void g(double d5, double d6) {
        this.f21980e = d5;
        this.f21981f = d6;
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.f21982g = 0.0d;
        this.f21983h = 0;
        this.f21984i = a.STEP_INIT;
    }
}

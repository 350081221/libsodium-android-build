package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes4.dex */
public class f extends d {

    /* renamed from: e, reason: collision with root package name */
    private final double f21969e;

    /* renamed from: f, reason: collision with root package name */
    private double f21970f;

    /* renamed from: g, reason: collision with root package name */
    private int f21971g;

    /* renamed from: h, reason: collision with root package name */
    private final double[] f21972h;

    /* renamed from: i, reason: collision with root package name */
    private int f21973i;

    /* renamed from: j, reason: collision with root package name */
    private double f21974j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21975k;

    /* renamed from: l, reason: collision with root package name */
    private double f21976l;

    /* renamed from: m, reason: collision with root package name */
    private long f21977m;

    /* renamed from: n, reason: collision with root package name */
    private long f21978n;

    /* renamed from: o, reason: collision with root package name */
    private double f21979o;

    public f(double d5) {
        this.f21976l = 1.0E-5d;
        this.f21969e = d5;
        this.f21972h = null;
    }

    private void g(long j5, long j6, double d5) {
        b(new k(j5, j6, d5, Double.valueOf(this.f21970f)));
    }

    private double h() {
        double d5;
        double[] dArr = this.f21972h;
        if (dArr == null) {
            return this.f21969e;
        }
        int i5 = this.f21973i;
        if (i5 >= dArr.length) {
            return -1.0d;
        }
        if (i5 == 0) {
            d5 = 0.0d;
        } else {
            d5 = dArr[i5 - 1];
        }
        this.f21973i = i5 + 1;
        double d6 = dArr[i5] - d5;
        if (d6 >= 0.0d) {
            return d6;
        }
        throw new IllegalArgumentException();
    }

    @Override // org.osmdroid.views.overlay.milestones.d
    protected void a(long j5, long j6, long j7, long j8) {
        long j9 = j7;
        this.f21975k = false;
        if (this.f21974j == -1.0d) {
            return;
        }
        int i5 = this.f21971g + 1;
        this.f21971g = i5;
        double c5 = c(i5);
        if (c5 == 0.0d) {
            return;
        }
        double d5 = j5;
        double d6 = j6;
        double sqrt = Math.sqrt(Distance.getSquaredDistanceToPoint(d5, d6, j9, j8)) / c5;
        double e5 = d.e(j5, j6, j7, j8);
        while (true) {
            double d7 = this.f21974j;
            if (c5 < d7) {
                this.f21970f += c5;
                this.f21974j = d7 - c5;
                this.f21975k = true;
                this.f21977m = j9;
                this.f21978n = j8;
                this.f21979o = e5;
                return;
            }
            this.f21970f += d7;
            double d8 = c5 - d7;
            double d9 = 0.017453292519943295d * e5;
            double cos = d5 + (d7 * Math.cos(d9) * sqrt);
            double sin = d6 + (this.f21974j * Math.sin(d9) * sqrt);
            d6 = sin;
            g((long) cos, (long) sin, e5);
            double h5 = h();
            this.f21974j = h5;
            if (h5 == -1.0d) {
                return;
            }
            c5 = d8;
            d5 = cos;
            j9 = j7;
        }
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void end() {
        if (this.f21975k && this.f21974j < this.f21976l) {
            g(this.f21977m, this.f21978n, this.f21979o);
        }
        super.end();
    }

    public void i(double d5) {
        this.f21976l = d5;
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.f21970f = 0.0d;
        this.f21971g = 0;
        if (this.f21972h != null) {
            this.f21973i = 0;
        }
        this.f21974j = h();
        this.f21975k = false;
    }

    public f(double[] dArr) {
        this.f21976l = 1.0E-5d;
        this.f21969e = 0.0d;
        this.f21972h = dArr;
    }
}

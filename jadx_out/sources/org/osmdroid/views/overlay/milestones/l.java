package org.osmdroid.views.overlay.milestones;

/* loaded from: classes4.dex */
public class l extends d {

    /* renamed from: e, reason: collision with root package name */
    private double f21995e;

    /* renamed from: f, reason: collision with root package name */
    private long f21996f;

    /* renamed from: g, reason: collision with root package name */
    private long f21997g;

    /* renamed from: h, reason: collision with root package name */
    private int f21998h;

    private void g(long j5, long j6, int i5) {
        b(new k(j5, j6, this.f21995e, Integer.valueOf(i5)));
    }

    @Override // org.osmdroid.views.overlay.milestones.d
    protected void a(long j5, long j6, long j7, long j8) {
        this.f21995e = d.e(j5, j6, j7, j8);
        int i5 = this.f21998h;
        this.f21998h = i5 + 1;
        g(j5, j6, i5);
        this.f21996f = j7;
        this.f21997g = j8;
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void end() {
        super.end();
        g(this.f21996f, this.f21997g, -this.f21998h);
    }

    @Override // org.osmdroid.views.overlay.milestones.d, org.osmdroid.util.PointAccepter
    public void init() {
        super.init();
        this.f21998h = 0;
    }
}

package org.osmdroid.views.overlay.milestones;

import org.osmdroid.util.Distance;

/* loaded from: classes4.dex */
public class h extends d {

    /* renamed from: e, reason: collision with root package name */
    private final double f21985e;

    public h(double d5) {
        this.f21985e = d5 * d5;
    }

    @Override // org.osmdroid.views.overlay.milestones.d
    protected void a(long j5, long j6, long j7, long j8) {
        if (Distance.getSquaredDistanceToPoint(j5, j6, j7, j8) <= this.f21985e) {
            return;
        }
        b(new k((j5 + j7) / 2, (j6 + j8) / 2, d.e(j5, j6, j7, j8)));
    }
}

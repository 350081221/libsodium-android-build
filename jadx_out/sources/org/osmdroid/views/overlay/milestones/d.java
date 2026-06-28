package org.osmdroid.views.overlay.milestones;

import java.util.ArrayList;
import java.util.List;
import org.osmdroid.util.PointAccepter;
import org.osmdroid.util.PointL;

/* loaded from: classes4.dex */
public abstract class d implements PointAccepter {

    /* renamed from: a, reason: collision with root package name */
    private final List<k> f21963a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final PointL f21964b = new PointL();

    /* renamed from: c, reason: collision with root package name */
    private boolean f21965c;

    /* renamed from: d, reason: collision with root package name */
    private double[] f21966d;

    public static double e(long j5, long j6, long j7, long j8) {
        if (j5 == j7) {
            if (j6 == j8) {
                return 0.0d;
            }
            return j6 > j8 ? -90.0d : 90.0d;
        }
        return (Math.atan((j8 - j6) / (j7 - j5)) * 57.29577951308232d) + ((j7 > j5 ? 1 : (j7 == j5 ? 0 : -1)) < 0 ? 180 : 0);
    }

    protected abstract void a(long j5, long j6, long j7, long j8);

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        if (this.f21965c) {
            this.f21965c = false;
            this.f21964b.set(j5, j6);
        } else {
            PointL pointL = this.f21964b;
            a(pointL.f21839x, pointL.f21840y, j5, j6);
            this.f21964b.set(j5, j6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(k kVar) {
        this.f21963a.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double c(int i5) {
        return this.f21966d[i5];
    }

    public List<k> d() {
        return this.f21963a;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    public void f(double[] dArr) {
        this.f21966d = dArr;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.f21963a.clear();
        this.f21965c = true;
    }
}

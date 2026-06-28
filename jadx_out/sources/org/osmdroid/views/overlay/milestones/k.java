package org.osmdroid.views.overlay.milestones;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final long f21991a;

    /* renamed from: b, reason: collision with root package name */
    private final long f21992b;

    /* renamed from: c, reason: collision with root package name */
    private final double f21993c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21994d;

    public k(long j5, long j6, double d5, Object obj) {
        this.f21991a = j5;
        this.f21992b = j6;
        this.f21993c = d5;
        this.f21994d = obj;
    }

    public Object a() {
        return this.f21994d;
    }

    public double b() {
        return this.f21993c;
    }

    public long c() {
        return this.f21991a;
    }

    public long d() {
        return this.f21992b;
    }

    public String toString() {
        return getClass().getSimpleName() + ":" + this.f21991a + "," + this.f21992b + "," + this.f21993c + "," + this.f21994d;
    }

    public k(long j5, long j6, double d5) {
        this(j5, j6, d5, null);
    }
}

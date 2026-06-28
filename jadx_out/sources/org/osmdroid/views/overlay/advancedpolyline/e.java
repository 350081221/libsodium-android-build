package org.osmdroid.views.overlay.advancedpolyline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f21872a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Float> f21873b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private float f21874c = Float.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private float f21875d = Float.MIN_VALUE;

    public e(d dVar) {
        this.f21872a = dVar;
    }

    public void a(float f5) {
        this.f21872a.b(f5);
        this.f21873b.add(Float.valueOf(f5));
        if (this.f21874c > f5) {
            this.f21874c = f5;
        }
        if (this.f21875d < f5) {
            this.f21875d = f5;
        }
    }

    public d b() {
        return this.f21872a;
    }

    public float c() {
        return this.f21875d;
    }

    public float d() {
        return this.f21874c;
    }

    public void e() {
        Iterator<Float> it = this.f21873b.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            this.f21872a.d(i5, it.next().floatValue());
            i5++;
        }
    }

    public int f() {
        return this.f21873b.size();
    }
}

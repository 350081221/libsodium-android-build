package org.osmdroid.views.overlay.milestones;

import android.graphics.Canvas;
import java.util.Iterator;
import org.osmdroid.util.PointAccepter;

/* loaded from: classes4.dex */
public class e implements PointAccepter {

    /* renamed from: a, reason: collision with root package name */
    private final d f21967a;

    /* renamed from: b, reason: collision with root package name */
    private final b f21968b;

    public e(d dVar, b bVar) {
        this.f21967a = dVar;
        this.f21968b = bVar;
    }

    public void a(Canvas canvas) {
        this.f21968b.c(canvas);
        Iterator<k> it = this.f21967a.d().iterator();
        while (it.hasNext()) {
            this.f21968b.b(canvas, it.next());
        }
        this.f21968b.d(canvas);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        this.f21967a.add(j5, j6);
    }

    public void b(double[] dArr) {
        this.f21967a.f(dArr);
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
        this.f21967a.end();
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.f21967a.init();
    }
}

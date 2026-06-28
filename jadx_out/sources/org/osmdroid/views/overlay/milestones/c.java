package org.osmdroid.views.overlay.milestones;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.osmdroid.views.overlay.LineDrawer;

/* loaded from: classes4.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private boolean f21958c;

    /* renamed from: d, reason: collision with root package name */
    private long f21959d;

    /* renamed from: e, reason: collision with root package name */
    private long f21960e;

    /* renamed from: f, reason: collision with root package name */
    private final LineDrawer f21961f;

    /* loaded from: classes4.dex */
    class a extends LineDrawer {
        a(int i5) {
            super(i5);
        }

        @Override // org.osmdroid.views.overlay.LineDrawer, org.osmdroid.util.LineBuilder
        public void flush() {
            super.flush();
            c.this.f21958c = true;
        }
    }

    public c(Paint paint) {
        super(0.0d, false);
        this.f21958c = true;
        a aVar = new a(256);
        this.f21961f = aVar;
        aVar.setPaint(paint);
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    protected void a(Canvas canvas, Object obj) {
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    public void b(Canvas canvas, k kVar) {
        long c5 = kVar.c();
        long d5 = kVar.d();
        if (this.f21958c) {
            this.f21958c = false;
        } else {
            long j5 = this.f21959d;
            if (j5 != c5 || this.f21960e != d5) {
                this.f21961f.add(j5, this.f21960e);
                this.f21961f.add(c5, d5);
            }
        }
        this.f21959d = c5;
        this.f21960e = d5;
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    public void c(Canvas canvas) {
        this.f21961f.init();
        this.f21961f.setCanvas(canvas);
        this.f21958c = true;
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    public void d(Canvas canvas) {
        this.f21961f.end();
    }
}

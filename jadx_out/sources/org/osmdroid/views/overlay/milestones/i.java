package org.osmdroid.views.overlay.milestones;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes4.dex */
public class i extends b {

    /* renamed from: c, reason: collision with root package name */
    private final Path f21986c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f21987d;

    public i(double d5, boolean z4, Path path, Paint paint) {
        super(d5, z4);
        this.f21986c = path;
        this.f21987d = paint;
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    protected void a(Canvas canvas, Object obj) {
        canvas.drawPath(this.f21986c, this.f21987d);
    }
}

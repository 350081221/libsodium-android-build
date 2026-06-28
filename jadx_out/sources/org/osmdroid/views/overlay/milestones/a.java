package org.osmdroid.views.overlay.milestones;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public class a extends b {

    /* renamed from: c, reason: collision with root package name */
    private final Bitmap f21953c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21954d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21955e;

    public a(double d5, boolean z4, Bitmap bitmap, int i5, int i6) {
        super(d5, z4);
        this.f21953c = bitmap;
        this.f21954d = i5;
        this.f21955e = i6;
    }

    @Override // org.osmdroid.views.overlay.milestones.b
    protected void a(Canvas canvas, Object obj) {
        canvas.drawBitmap(this.f21953c, -this.f21954d, -this.f21955e, (Paint) null);
    }
}

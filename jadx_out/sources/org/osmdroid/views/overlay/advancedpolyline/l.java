package org.osmdroid.views.overlay.advancedpolyline;

import android.graphics.Paint;
import org.osmdroid.views.overlay.PaintList;

/* loaded from: classes4.dex */
public class l implements PaintList {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f21890a;

    public l(Paint paint) {
        this.f21890a = paint;
    }

    @Override // org.osmdroid.views.overlay.PaintList
    public Paint getPaint() {
        return this.f21890a;
    }

    @Override // org.osmdroid.views.overlay.PaintList
    public Paint getPaint(int i5, float f5, float f6, float f7, float f8) {
        return null;
    }
}

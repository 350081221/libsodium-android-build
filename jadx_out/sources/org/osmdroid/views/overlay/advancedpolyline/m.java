package org.osmdroid.views.overlay.advancedpolyline;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import org.osmdroid.views.overlay.PaintList;

/* loaded from: classes4.dex */
public class m implements PaintList {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f21891a;

    /* renamed from: b, reason: collision with root package name */
    private final b f21892b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21893c;

    public m(Paint paint, b bVar, boolean z4) {
        this.f21891a = paint;
        this.f21892b = bVar;
        this.f21893c = z4;
    }

    @Override // org.osmdroid.views.overlay.PaintList
    public Paint getPaint() {
        return null;
    }

    @Override // org.osmdroid.views.overlay.PaintList
    public Paint getPaint(int i5, float f5, float f6, float f7, float f8) {
        int a5 = this.f21892b.a(i5);
        if (this.f21893c) {
            int a6 = this.f21892b.a(i5 + 1);
            if (a5 != a6) {
                this.f21891a.setShader(new LinearGradient(f5, f6, f7, f8, a5, a6, Shader.TileMode.CLAMP));
                return this.f21891a;
            }
            this.f21891a.setShader(null);
        }
        this.f21891a.setColor(a5);
        return this.f21891a;
    }
}

package com.yuanqi.group.widgets;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class k extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private Paint f14387a;

    /* renamed from: c, reason: collision with root package name */
    private int f14389c;

    /* renamed from: d, reason: collision with root package name */
    private int f14390d;

    /* renamed from: e, reason: collision with root package name */
    private j f14391e;

    /* renamed from: f, reason: collision with root package name */
    private int f14392f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f14393g;

    /* renamed from: h, reason: collision with root package name */
    private float f14394h;

    /* renamed from: i, reason: collision with root package name */
    private float f14395i;

    /* renamed from: b, reason: collision with root package name */
    private RectF f14388b = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private PorterDuffXfermode f14396j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);

    public k(j jVar, int i5, float f5, float f6) {
        this.f14391e = jVar;
        this.f14392f = jVar.d();
        this.f14394h = f5;
        this.f14395i = f6;
        Paint paint = new Paint();
        this.f14387a = paint;
        paint.setAntiAlias(true);
        this.f14387a.setFilterBitmap(true);
        this.f14387a.setDither(true);
        this.f14387a.setStyle(Paint.Style.FILL);
        this.f14387a.setColor(i5);
        this.f14387a.setShadowLayer(jVar.f(), jVar.b(), jVar.c(), jVar.a());
        this.f14393g = new RectF();
    }

    public k a(int i5) {
        this.f14387a.setColor(i5);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f14387a.setXfermode(null);
        canvas.drawRoundRect(this.f14393g, this.f14394h, this.f14395i, this.f14387a);
        this.f14387a.setXfermode(this.f14396j);
        canvas.drawRoundRect(this.f14393g, this.f14394h, this.f14395i, this.f14387a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i5;
        int i6;
        int i7;
        super.onBoundsChange(rect);
        int i8 = rect.right;
        int i9 = rect.left;
        if (i8 - i9 > 0) {
            int i10 = rect.bottom;
            int i11 = rect.top;
            if (i10 - i11 > 0) {
                RectF rectF = this.f14388b;
                float f5 = i9;
                rectF.left = f5;
                float f6 = i8;
                rectF.right = f6;
                float f7 = i11;
                rectF.top = f7;
                float f8 = i10;
                rectF.bottom = f8;
                this.f14389c = (int) (f6 - f5);
                this.f14390d = (int) (f8 - f7);
                int g5 = this.f14391e.g();
                int i12 = 0;
                if ((g5 & 1) == 1) {
                    i5 = this.f14392f;
                } else {
                    i5 = 0;
                }
                if ((g5 & 16) == 16) {
                    i6 = this.f14392f;
                } else {
                    i6 = 0;
                }
                int i13 = this.f14389c;
                if ((g5 & 256) == 256) {
                    i7 = this.f14392f;
                } else {
                    i7 = 0;
                }
                int i14 = i13 - i7;
                int i15 = this.f14390d;
                if ((g5 & 4096) == 4096) {
                    i12 = this.f14392f;
                }
                this.f14393g = new RectF(i5, i6, i14, i15 - i12);
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

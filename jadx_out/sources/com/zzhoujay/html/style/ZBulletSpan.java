package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* loaded from: classes3.dex */
public class ZBulletSpan extends BulletSpan {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15344d = 15;

    /* renamed from: e, reason: collision with root package name */
    private static final int f15345e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static Path f15346f;

    /* renamed from: a, reason: collision with root package name */
    private final int f15347a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15348b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15349c;

    public ZBulletSpan() {
        this.f15347a = 15;
        this.f15348b = false;
        this.f15349c = 0;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        int i12;
        if (((Spanned) charSequence).getSpanStart(this) == i10) {
            Paint.Style style = paint.getStyle();
            if (this.f15348b) {
                i12 = paint.getColor();
                paint.setColor(this.f15349c);
            } else {
                i12 = 0;
            }
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                if (f15346f == null) {
                    Path path = new Path();
                    f15346f = path;
                    path.addCircle(0.0f, 0.0f, 6.0f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(i5 + (i6 * 5), (i7 + i9) / 2.0f);
                canvas.drawPath(f15346f, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(i5 + (i6 * 5), (i7 + i9) / 2.0f, 5.0f, paint);
            }
            if (this.f15348b) {
                paint.setColor(i12);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        return this.f15347a + 10;
    }

    public ZBulletSpan(int i5) {
        super(i5);
        this.f15347a = i5;
        this.f15348b = false;
        this.f15349c = 0;
    }

    public ZBulletSpan(int i5, int i6) {
        super(i5, i6);
        this.f15347a = i5;
        this.f15348b = true;
        this.f15349c = i6;
    }
}

package com.zzhoujay.markdown.style;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.QuoteSpan;
import android.widget.TextView;
import d3.b;
import external.org.apache.commons.lang3.d;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class QuotaBulletSpan extends QuoteSpan {

    /* renamed from: g, reason: collision with root package name */
    private static final int f15475g = 40;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15476h = 40;

    /* renamed from: i, reason: collision with root package name */
    private static final int f15477i = 6;

    /* renamed from: j, reason: collision with root package name */
    private static final int f15478j = 15;

    /* renamed from: k, reason: collision with root package name */
    private static final int f15479k = 40;

    /* renamed from: l, reason: collision with root package name */
    private static Path f15480l;

    /* renamed from: m, reason: collision with root package name */
    private static Path f15481m;

    /* renamed from: a, reason: collision with root package name */
    private final String f15482a;

    /* renamed from: b, reason: collision with root package name */
    private int f15483b;

    /* renamed from: c, reason: collision with root package name */
    private int f15484c;

    /* renamed from: d, reason: collision with root package name */
    private int f15485d;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<TextView> f15486e;

    /* renamed from: f, reason: collision with root package name */
    private int f15487f;

    public QuotaBulletSpan(int i5, int i6, int i7, int i8, int i9, TextView textView) {
        super(i7);
        this.f15487f = i5;
        this.f15483b = i6;
        if (i9 > 0) {
            if (i6 == 1) {
                this.f15482a = b.b(i9);
            } else if (i6 >= 2) {
                this.f15482a = b.a(i9 - 1);
            } else {
                this.f15482a = i9 + "";
            }
        } else {
            this.f15482a = null;
        }
        this.f15484c = i8;
        this.f15486e = new WeakReference<>(textView);
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    @TargetApi(11)
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        Path path;
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getColor());
        for (int i12 = 0; i12 <= this.f15487f; i12++) {
            canvas.drawRect((i12 * 55) + i5, i7, r1 + (i6 * 15), i9, paint);
        }
        paint.setStyle(style);
        paint.setColor(color);
        if (((Spanned) charSequence).getSpanStart(this) == i10) {
            int color2 = paint.getColor();
            paint.setColor(this.f15484c);
            if (this.f15482a != null) {
                canvas.drawText(this.f15482a + d.f15957a, ((i5 - paint.measureText(this.f15482a)) + this.f15485d) - 40.0f, i8, paint);
            } else {
                Paint.Style style2 = paint.getStyle();
                if (this.f15483b == 1) {
                    paint.setStyle(Paint.Style.STROKE);
                } else {
                    paint.setStyle(Paint.Style.FILL);
                }
                if (canvas.isHardwareAccelerated()) {
                    if (this.f15483b >= 2) {
                        if (f15481m == null) {
                            Path path2 = new Path();
                            f15481m = path2;
                            path2.addRect(-7.2000003f, -7.2000003f, 7.2000003f, 7.2000003f, Path.Direction.CW);
                        }
                        path = f15481m;
                    } else {
                        if (f15480l == null) {
                            Path path3 = new Path();
                            f15480l = path3;
                            path3.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                        }
                        path = f15480l;
                    }
                    canvas.save();
                    canvas.translate((this.f15485d + i5) - 40, (i7 + i9) / 2.0f);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle((this.f15485d + i5) - 40, (i7 + i9) / 2.0f, 6.0f, paint);
                }
                paint.setStyle(style2);
            }
            paint.setColor(color2);
        }
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        int i5;
        WeakReference<TextView> weakReference = this.f15486e;
        if (weakReference == null && (i5 = this.f15485d) != 0) {
            return i5;
        }
        TextView textView = weakReference.get();
        if (this.f15482a != null && textView != null) {
            this.f15485d = (int) (((textView.getPaint().measureText(this.f15482a) + 40.0f) * (this.f15483b + 1)) + 40.0f);
        } else {
            this.f15485d = ((this.f15483b + 1) * 52) + 40;
        }
        int i6 = this.f15485d + ((this.f15487f + 1) * 55);
        this.f15485d = i6;
        return i6;
    }
}

package com.zzhoujay.html.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.QuoteSpan;

/* loaded from: classes3.dex */
public class ZQuoteSpan extends QuoteSpan {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15350a = 15;

    /* renamed from: b, reason: collision with root package name */
    private static final int f15351b = 40;

    public ZQuoteSpan() {
        this(-3355444);
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getColor());
        canvas.drawRect(i5, i7, i5 + (i6 * 15), i9, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.QuoteSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        return 55;
    }

    public ZQuoteSpan(int i5) {
        super(i5);
    }
}

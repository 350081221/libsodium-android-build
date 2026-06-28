package c3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;

/* loaded from: classes3.dex */
public class e extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private int f747a;

    /* renamed from: b, reason: collision with root package name */
    private int f748b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f749c;

    public e(Drawable drawable, int i5, int i6) {
        this.f747a = i6;
        this.f748b = i5;
        this.f749c = drawable;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.top /= 3;
        fontMetricsInt.ascent /= 3;
        fontMetricsInt.bottom /= 3;
        fontMetricsInt.descent /= 3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        int i10 = (int) f5;
        this.f749c.setBounds(i10, i9 - this.f747a, this.f748b + i10, i9);
        this.f749c.draw(canvas);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i5, i6);
    }
}

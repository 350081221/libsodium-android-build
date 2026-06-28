package b3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;

/* loaded from: classes3.dex */
public class b extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    private static final int f667e = Color.parseColor("#F4F4F5");

    /* renamed from: f, reason: collision with root package name */
    private static final int f668f = Color.parseColor("#24292E");

    /* renamed from: g, reason: collision with root package name */
    private static final float f669g = 10.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f670h = 16.0f;

    /* renamed from: i, reason: collision with root package name */
    private static final float f671i = 2.0f;

    /* renamed from: j, reason: collision with root package name */
    private static final float f672j = 8.0f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f673k = 0.92f;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f674a;

    /* renamed from: b, reason: collision with root package name */
    private int f675b;

    /* renamed from: c, reason: collision with root package name */
    private int f676c;

    /* renamed from: d, reason: collision with root package name */
    private int f677d;

    public b() {
        this(f667e, f668f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        float textSize = paint.getTextSize();
        paint.setTextSize(f673k * textSize);
        paint.setTypeface(Typeface.MONOSPACE);
        float f6 = f5 + 8.0f;
        this.f674a.setBounds((int) f6, (int) (i7 - f671i), (int) ((f5 + this.f675b) - 8.0f), (int) (i7 + this.f676c + f671i));
        this.f674a.draw(canvas);
        int color = paint.getColor();
        paint.setColor(this.f677d);
        canvas.drawText(charSequence, i5, i6, f6 + f670h, i8 - ((this.f676c * 0.07999998f) * 0.5f), paint);
        paint.setColor(color);
        paint.setTextSize(textSize);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        this.f676c = paint.getFontMetricsInt().descent - paint.getFontMetricsInt().ascent;
        float textSize = paint.getTextSize();
        paint.setTextSize(f673k * textSize);
        paint.setTypeface(Typeface.MONOSPACE);
        this.f675b = (int) (paint.measureText(charSequence, i5, i6) + 32.0f + f670h);
        if (fontMetricsInt != null) {
            fontMetricsInt.top = (int) (fontMetricsInt.top - f671i);
            fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + f671i);
        }
        paint.setTextSize(textSize);
        return this.f675b;
    }

    public b(int i5, int i6) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i5);
        gradientDrawable.setCornerRadius(10.0f);
        this.f674a = gradientDrawable;
        this.f677d = i6;
    }
}

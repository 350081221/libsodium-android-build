package c3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ReplacementSpan;
import com.umeng.analytics.pro.bi;

/* loaded from: classes3.dex */
public class b extends ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    private static final float f733d = 10.0f;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f734a;

    /* renamed from: b, reason: collision with root package name */
    private float f735b;

    /* renamed from: c, reason: collision with root package name */
    private int f736c;

    public b(int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i5);
        gradientDrawable.setCornerRadius(10.0f);
        this.f734a = gradientDrawable;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        int i10 = (int) f5;
        this.f734a.setBounds(i10, i7, this.f736c + i10, i9);
        this.f734a.draw(canvas);
        canvas.drawText(charSequence, i5, i6, f5 + this.f735b, i8, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        this.f735b = paint.measureText(bi.aL);
        int measureText = (int) (paint.measureText(charSequence, i5, i6) + (this.f735b * 2.0f));
        this.f736c = measureText;
        return measureText;
    }
}

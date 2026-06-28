package b3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends ReplacementSpan implements LeadingMarginSpan, LineHeightSpan {

    /* renamed from: g, reason: collision with root package name */
    private static final int f654g = Color.parseColor("#F4F4F5");

    /* renamed from: h, reason: collision with root package name */
    private static final int f655h = Color.parseColor("#24292E");

    /* renamed from: i, reason: collision with root package name */
    private static final int f656i = 10;

    /* renamed from: j, reason: collision with root package name */
    private static final int f657j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f658k = 16;

    /* renamed from: l, reason: collision with root package name */
    private static final int f659l = 20;

    /* renamed from: m, reason: collision with root package name */
    private static final float f660m = 0.92f;

    /* renamed from: a, reason: collision with root package name */
    private int f661a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f662b;

    /* renamed from: c, reason: collision with root package name */
    private int f663c;

    /* renamed from: d, reason: collision with root package name */
    private int f664d;

    /* renamed from: e, reason: collision with root package name */
    private int f665e;

    /* renamed from: f, reason: collision with root package name */
    private List<CharSequence> f666f;

    public a(int i5, int i6, CharSequence charSequence) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i5);
        gradientDrawable.setCornerRadius(10.0f);
        this.f662b = gradientDrawable;
        this.f666f = a(charSequence);
        this.f663c = i6;
    }

    private List<CharSequence> a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length <= 0) {
            return Collections.emptyList();
        }
        int i5 = 0;
        while (charSequence.charAt(i5) == '\n' && i5 < length) {
            i5++;
        }
        while (charSequence.charAt(length - 1) == '\n' && i5 < length) {
            length--;
        }
        if (i5 >= length) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length2 = charSequence.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length2; i7++) {
            if (charSequence.charAt(i7) == '\n') {
                arrayList.add(charSequence.subSequence(i6, i7));
                i6 = i7 + 1;
            }
        }
        if (i6 < length2) {
            arrayList.add(charSequence.subSequence(i6, length2));
        }
        return arrayList;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        int size = this.f666f.size();
        int i9 = fontMetricsInt.bottom;
        int i10 = fontMetricsInt.top;
        int i11 = i9 - i10;
        this.f665e = i11;
        this.f664d = -i10;
        fontMetricsInt.ascent = i10;
        int i12 = i9 + ((size - 1) * i11) + 32;
        fontMetricsInt.bottom = i12;
        fontMetricsInt.descent = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        float textSize = paint.getTextSize();
        paint.setTextSize(f660m * textSize);
        paint.setTypeface(Typeface.MONOSPACE);
        int size = i7 + (this.f666f.size() * this.f665e);
        this.f662b.setBounds(((int) f5) + 5, i7 + 5, (r7 + this.f661a) - 5, (size + 32) - 5);
        this.f662b.draw(canvas);
        canvas.save();
        float f6 = f5 + 20.0f;
        canvas.clipRect(f6, i7 + 16, (f5 + this.f661a) - 20.0f, size + 16);
        int color = paint.getColor();
        paint.setColor(this.f663c);
        int i10 = this.f664d + 16 + i7;
        for (CharSequence charSequence2 : this.f666f) {
            canvas.drawText(charSequence2, 0, charSequence2.length(), f6, i10, paint);
            i10 += this.f665e;
        }
        paint.setTextSize(textSize);
        paint.setColor(color);
        canvas.restore();
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
        this.f661a = layout.getWidth();
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z4) {
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        return this.f661a;
    }

    public a(CharSequence charSequence) {
        this(f654g, f655h, charSequence);
    }
}

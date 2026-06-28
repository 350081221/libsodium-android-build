package c3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends ReplacementSpan implements LineHeightSpan {

    /* renamed from: g, reason: collision with root package name */
    private static final float f725g = 10.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f726h = 30;

    /* renamed from: a, reason: collision with root package name */
    private int f727a;

    /* renamed from: b, reason: collision with root package name */
    private Drawable f728b;

    /* renamed from: c, reason: collision with root package name */
    private int f729c;

    /* renamed from: d, reason: collision with root package name */
    private int f730d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence[] f731e;

    /* renamed from: f, reason: collision with root package name */
    private List<Pair<Integer, Integer>> f732f;

    public a(int i5, int i6, CharSequence... charSequenceArr) {
        this.f727a = i5;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i6);
        gradientDrawable.setCornerRadius(10.0f);
        this.f728b = gradientDrawable;
        this.f731e = charSequenceArr;
    }

    private int a(CharSequence charSequence, int i5, int i6, Paint paint) {
        int i7 = i5;
        while (paint.measureText(charSequence, i5, i7) < this.f727a - 60 && (i7 = i7 + 1) <= i6) {
        }
        return i7 - 1;
    }

    private int b(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint paint) {
        if (i7 > i6) {
            return i6;
        }
        while (paint.measureText(charSequence, i5, i7) < this.f727a - 60 && (i7 = i7 + 1) <= i6 && i7 <= i8) {
        }
        return i7 - 1;
    }

    private List<Pair<Integer, Integer>> c(CharSequence charSequence, int i5, int i6, Paint paint) {
        ArrayList arrayList = new ArrayList();
        int a5 = a(charSequence, i5, i6, paint);
        arrayList.add(new Pair(Integer.valueOf(i5), Integer.valueOf(a5)));
        int i7 = a5;
        while (a5 < i6) {
            int i8 = i7 + a5;
            int b5 = b(charSequence, a5, i6, i8 - 4, i8 + 4, paint);
            int i9 = b5 - a5;
            arrayList.add(new Pair(Integer.valueOf(a5), Integer.valueOf(b5)));
            a5 = b5;
            i7 = i9;
        }
        return arrayList;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        int size = this.f732f.size();
        int i9 = fontMetricsInt.bottom;
        int i10 = fontMetricsInt.top;
        int i11 = i9 - i10;
        this.f730d = i11;
        this.f729c = -i10;
        fontMetricsInt.ascent = i10;
        int i12 = i9 + (size * i11);
        fontMetricsInt.bottom = i12;
        fontMetricsInt.descent = i12;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        int i10 = (int) f5;
        this.f728b.setBounds(i10, i7, this.f727a + i10, i9);
        this.f728b.draw(canvas);
        float f6 = f5 + 30.0f;
        int i11 = this.f729c + (this.f730d / 2) + i7;
        int i12 = 0;
        for (Pair<Integer, Integer> pair : this.f732f) {
            CharSequence charSequence2 = this.f731e[i12];
            canvas.drawText(charSequence2, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), f6 + 30.0f, i11, paint);
            if (((Integer) pair.second).intValue() >= charSequence2.length()) {
                i12++;
            }
            i11 += this.f730d;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null && this.f732f == null) {
            this.f732f = new ArrayList();
            for (CharSequence charSequence2 : this.f731e) {
                this.f732f.addAll(c(charSequence2, 0, charSequence2.length(), paint));
            }
        }
        return this.f727a;
    }
}

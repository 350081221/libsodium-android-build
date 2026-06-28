package com.zzhoujay.markdown.style;

import android.annotation.SuppressLint;
import android.text.ParcelableSpan;
import android.text.TextPaint;
import android.text.style.StyleSpan;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public class FontSpan extends StyleSpan implements ParcelableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final float f15459a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15460b;

    public FontSpan(float f5, int i5, int i6) {
        super(i5);
        this.f15459a = f5;
        this.f15460b = i6;
    }

    @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        updateMeasureState(textPaint);
        textPaint.setColor(this.f15460b);
    }

    @Override // android.text.style.StyleSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setTextSize(textPaint.getTextSize() * this.f15459a);
    }
}

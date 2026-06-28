package com.zzhoujay.markdown.style;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* loaded from: classes3.dex */
public class LinkSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private int f15461a;

    public LinkSpan(String str, int i5) {
        super(str);
        this.f15461a = i5;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f15461a);
        textPaint.setUnderlineText(false);
    }
}

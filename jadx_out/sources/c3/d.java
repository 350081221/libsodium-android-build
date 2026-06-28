package c3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes3.dex */
public class d implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    private float f746a;

    public d(float f5) {
        this.f746a = f5;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        float f5 = fontMetricsInt.ascent;
        float f6 = this.f746a;
        fontMetricsInt.ascent = (int) (f5 * f6);
        fontMetricsInt.top = (int) (fontMetricsInt.top * f6);
        fontMetricsInt.descent = (int) (fontMetricsInt.descent * f6);
        fontMetricsInt.bottom = (int) (fontMetricsInt.bottom * f6);
    }
}

package d3;

import android.graphics.Paint;

/* loaded from: classes3.dex */
public class a {
    public static void a(Paint.FontMetricsInt fontMetricsInt, float f5) {
        fontMetricsInt.top = (int) (fontMetricsInt.top * f5);
        fontMetricsInt.bottom = (int) (fontMetricsInt.bottom * f5);
        fontMetricsInt.ascent = (int) (fontMetricsInt.ascent * f5);
        fontMetricsInt.descent = (int) (fontMetricsInt.descent * f5);
        fontMetricsInt.leading = (int) (fontMetricsInt.leading * f5);
    }

    public static void b(Paint.FontMetricsInt fontMetricsInt, Paint.FontMetricsInt fontMetricsInt2, float f5) {
        fontMetricsInt2.top = (int) (fontMetricsInt.top * f5);
        fontMetricsInt2.bottom = (int) (fontMetricsInt.bottom * f5);
        fontMetricsInt2.ascent = (int) (fontMetricsInt.ascent * f5);
        fontMetricsInt2.descent = (int) (fontMetricsInt.descent * f5);
        fontMetricsInt2.leading = (int) (fontMetricsInt.leading * f5);
    }
}

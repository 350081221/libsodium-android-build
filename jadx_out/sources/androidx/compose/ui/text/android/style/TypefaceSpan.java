package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/android/style/TypefaceSpan;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Paint;", "paint", "Lkotlin/r2;", "updateTypeface", "Landroid/text/TextPaint;", "ds", "updateDrawState", "updateMeasureState", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "<init>", "(Landroid/graphics/Typeface;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    public static final int $stable = 8;

    @l
    private final Typeface typeface;

    public TypefaceSpan(@l Typeface typeface) {
        this.typeface = typeface;
    }

    private final void updateTypeface(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    @l
    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        updateTypeface(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@l TextPaint textPaint) {
        updateTypeface(textPaint);
    }
}

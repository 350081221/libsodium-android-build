package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\b\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "", "text", "", "start", "end", "spanstartVertical", "lineHeight", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lkotlin/r2;", "chooseHeight", "", "F", "getLineHeight", "()F", "<init>", "(F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 0;
    private final float lineHeight;

    public LineHeightSpan(float f5) {
        this.lineHeight = f5;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@l CharSequence charSequence, int i5, int i6, int i7, int i8, @l Paint.FontMetricsInt fontMetricsInt) {
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.lineHeight));
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}

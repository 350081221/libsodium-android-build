package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import kotlin.i0;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a$\u0010\u000e\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0001\u001a,\u0010\u000f\u001a\u00020\t*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"Landroid/text/TextPaint;", "", "text", "", "startInclusive", "endExclusive", "Landroid/graphics/Rect;", "getCharSequenceBounds", "rect", "Lkotlin/r2;", "extendWith", "Landroid/graphics/Paint;", "start", "end", "getStringBounds", "fillStringBounds", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PaintExtensionsKt {
    private static final void extendWith(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void fillStringBounds(Paint paint, CharSequence charSequence, int i5, int i6, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            Paint29.getTextBounds(paint, charSequence, i5, i6, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i5, i6, rect);
        }
    }

    @p4.l
    public static final Rect getCharSequenceBounds(@p4.l TextPaint textPaint, @p4.l CharSequence charSequence, int i5, int i6) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensionsKt.hasSpan(spanned, MetricAffectingSpan.class, i5, i6)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i5 < i6) {
                    int nextSpanTransition = spanned.nextSpanTransition(i5, i6, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i5, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    fillStringBounds(textPaint2, charSequence, i5, nextSpanTransition, rect2);
                    extendWith(rect, rect2);
                    i5 = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, charSequence, i5, i6);
    }

    @p4.l
    @VisibleForTesting
    public static final Rect getStringBounds(@p4.l Paint paint, @p4.l CharSequence charSequence, int i5, int i6) {
        Rect rect = new Rect();
        fillStringBounds(paint, charSequence, i5, i6, rect);
        return rect;
    }
}

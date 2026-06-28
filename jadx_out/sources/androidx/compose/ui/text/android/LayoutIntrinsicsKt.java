package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.u0;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"minIntrinsicWidth", "", "text", "", "paint", "Landroid/text/TextPaint;", "shouldIncreaseMaxIntrinsic", "", "desiredWidth", "charSequence", "textPaint", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLayoutIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1855#2,2:170\n*S KotlinDebug\n*F\n+ 1 LayoutIntrinsics.kt\nandroidx/compose/ui/text/android/LayoutIntrinsicsKt\n*L\n139#1:170,2\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(@p4.l CharSequence charSequence, @p4.l TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i5 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue<u0> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int minIntrinsicWidth$lambda$0;
                minIntrinsicWidth$lambda$0 = LayoutIntrinsicsKt.minIntrinsicWidth$lambda$0((u0) obj, (u0) obj2);
                return minIntrinsicWidth$lambda$0;
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i6 = i5;
            i5 = next;
            if (i5 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new u0(Integer.valueOf(i6), Integer.valueOf(i5)));
            } else {
                u0 u0Var = (u0) priorityQueue.peek();
                if (u0Var != null && ((Number) u0Var.getSecond()).intValue() - ((Number) u0Var.getFirst()).intValue() < i5 - i6) {
                    priorityQueue.poll();
                    priorityQueue.add(new u0(Integer.valueOf(i6), Integer.valueOf(i5)));
                }
            }
            next = lineInstance.next();
        }
        float f5 = 0.0f;
        for (u0 u0Var2 : priorityQueue) {
            f5 = Math.max(f5, Layout.getDesiredWidth(charSequence, ((Number) u0Var2.component1()).intValue(), ((Number) u0Var2.component2()).intValue(), textPaint));
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(u0 u0Var, u0 u0Var2) {
        return (((Number) u0Var.getSecond()).intValue() - ((Number) u0Var.getFirst()).intValue()) - (((Number) u0Var2.getSecond()).intValue() - ((Number) u0Var2.getFirst()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f5, CharSequence charSequence, TextPaint textPaint) {
        boolean z4;
        boolean z5;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                    return true;
                }
            }
            if (textPaint.getLetterSpacing() == 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }
}

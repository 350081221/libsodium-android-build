package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"getLineForOffset", "", "Landroid/text/Layout;", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCompatKt {
    public static final int getLineForOffset(@p4.l Layout layout, @IntRange(from = 0) int i5, boolean z4) {
        if (i5 <= 0) {
            return 0;
        }
        if (i5 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i5);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i5 && lineEnd != i5) {
            return lineForOffset;
        }
        if (lineStart == i5) {
            if (z4) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        }
        if (!z4) {
            return lineForOffset + 1;
        }
        return lineForOffset;
    }
}

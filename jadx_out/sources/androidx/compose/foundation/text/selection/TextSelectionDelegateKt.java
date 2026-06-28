package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\t\u001a$\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¨\u0006\f"}, d2 = {"getSelectionHandleCoordinates", "Landroidx/compose/ui/geometry/Offset;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", TypedValues.CycleType.S_WAVE_OFFSET, "", "isStart", "", "areHandlesCrossed", "(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J", "getHorizontalPosition", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionDelegateKt {
    public static final float getHorizontalPosition(@l TextLayoutResult textLayoutResult, int i5, boolean z4, boolean z5) {
        int max;
        boolean z6 = false;
        if ((z4 && !z5) || (!z4 && z5)) {
            max = i5;
        } else {
            max = Math.max(i5 - 1, 0);
        }
        if (textLayoutResult.getBidiRunDirection(max) == textLayoutResult.getParagraphDirection(i5)) {
            z6 = true;
        }
        return textLayoutResult.getHorizontalPosition(i5, z6);
    }

    public static final long getSelectionHandleCoordinates(@l TextLayoutResult textLayoutResult, int i5, boolean z4, boolean z5) {
        int lineForOffset = textLayoutResult.getLineForOffset(i5);
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        return OffsetKt.Offset(getHorizontalPosition(textLayoutResult, i5, z4, z5), textLayoutResult.getLineBottom(lineForOffset));
    }
}

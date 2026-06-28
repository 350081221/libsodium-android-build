package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"calculateAlignmentAndPlaceChildAsNeeded", "", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(LookaheadCapablePlaceable lookaheadCapablePlaceable, AlignmentLine alignmentLine) {
        boolean z4;
        int m6172getXimpl;
        LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
                Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
                if (num == null) {
                    return Integer.MIN_VALUE;
                }
                return num.intValue();
            }
            int i5 = child.get(alignmentLine);
            if (i5 == Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            child.setShallowPlacing$ui_release(true);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
            lookaheadCapablePlaceable.replace$ui_release();
            child.setShallowPlacing$ui_release(false);
            lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
            if (alignmentLine instanceof HorizontalAlignmentLine) {
                m6172getXimpl = IntOffset.m6173getYimpl(child.mo5151getPositionnOccac());
            } else {
                m6172getXimpl = IntOffset.m6172getXimpl(child.mo5151getPositionnOccac());
            }
            return i5 + m6172getXimpl;
        }
        throw new IllegalStateException(("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line").toString());
    }
}

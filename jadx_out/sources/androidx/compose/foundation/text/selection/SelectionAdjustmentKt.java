package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a4\u0010\u0015\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0007X\u008a\u0084\u0002"}, d2 = {"adjustToBoundaries", "Landroidx/compose/foundation/text/selection/Selection;", "layout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/BoundaryFunction;", "anchorOnBoundary", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "crossed", "", "isStart", "slot", "", "changeOffset", "info", "newOffset", "ensureAtLeastOneChar", "expandOneChar", "isExpanding", "currentRawOffset", "snapToWordBoundary", "currentLine", "currentOffset", "otherOffset", "updateSelectionBoundary", "previousSelectionAnchor", "foundation_release", "currentRawLine", "anchorSnappedToWordBoundary"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    public static final Selection adjustToBoundaries(SelectionLayout selectionLayout, BoundaryFunction boundaryFunction) {
        boolean z4;
        if (selectionLayout.getCrossStatus() == CrossStatus.CROSSED) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new Selection(anchorOnBoundary(selectionLayout.getStartInfo(), z4, true, selectionLayout.getStartSlot(), boundaryFunction), anchorOnBoundary(selectionLayout.getEndInfo(), z4, false, selectionLayout.getEndSlot(), boundaryFunction), z4);
    }

    private static final Selection.AnchorInfo anchorOnBoundary(SelectableInfo selectableInfo, boolean z4, boolean z5, int i5, BoundaryFunction boundaryFunction) {
        int rawEndHandleOffset;
        int m5540getEndimpl;
        if (z5) {
            rawEndHandleOffset = selectableInfo.getRawStartHandleOffset();
        } else {
            rawEndHandleOffset = selectableInfo.getRawEndHandleOffset();
        }
        if (i5 != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawEndHandleOffset);
        }
        long mo978getBoundaryfzxv0v0 = boundaryFunction.mo978getBoundaryfzxv0v0(selectableInfo, rawEndHandleOffset);
        if (z4 ^ z5) {
            m5540getEndimpl = TextRange.m5545getStartimpl(mo978getBoundaryfzxv0v0);
        } else {
            m5540getEndimpl = TextRange.m5540getEndimpl(mo978getBoundaryfzxv0v0);
        }
        return selectableInfo.anchorForOffset(m5540getEndimpl);
    }

    private static final Selection.AnchorInfo changeOffset(Selection.AnchorInfo anchorInfo, SelectableInfo selectableInfo, int i5) {
        return Selection.AnchorInfo.copy$default(anchorInfo, selectableInfo.getTextLayoutResult().getBidiRunDirection(i5), i5, 0L, 4, null);
    }

    @l
    public static final Selection ensureAtLeastOneChar(@l Selection selection, @l SelectionLayout selectionLayout) {
        if (!SelectionLayoutKt.isCollapsed(selection, selectionLayout)) {
            return selection;
        }
        String inputText = selectionLayout.getCurrentInfo().getInputText();
        boolean z4 = true;
        if (selectionLayout.getSize() <= 1 && selectionLayout.getPreviousSelection() != null) {
            if (inputText.length() != 0) {
                z4 = false;
            }
            if (!z4) {
                return expandOneChar(selection, selectionLayout);
            }
            return selection;
        }
        return selection;
    }

    private static final Selection expandOneChar(Selection selection, SelectionLayout selectionLayout) {
        boolean z4;
        int findFollowingBreak;
        SelectableInfo currentInfo = selectionLayout.getCurrentInfo();
        String inputText = currentInfo.getInputText();
        int rawStartHandleOffset = currentInfo.getRawStartHandleOffset();
        int length = inputText.length();
        if (rawStartHandleOffset == 0) {
            int findFollowingBreak2 = StringHelpers_androidKt.findFollowingBreak(inputText, 0);
            if (selectionLayout.isStartHandle()) {
                return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak2), null, true, 2, null);
            }
            return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak2), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, length);
            if (selectionLayout.isStartHandle()) {
                return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findPrecedingBreak), null, false, 2, null);
            }
            return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findPrecedingBreak), true, 1, null);
        }
        Selection previousSelection = selectionLayout.getPreviousSelection();
        if (previousSelection != null && previousSelection.getHandlesCrossed()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (selectionLayout.isStartHandle() ^ z4) {
            findFollowingBreak = StringHelpers_androidKt.findPrecedingBreak(inputText, rawStartHandleOffset);
        } else {
            findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(inputText, rawStartHandleOffset);
        }
        if (selectionLayout.isStartHandle()) {
            return Selection.copy$default(selection, changeOffset(selection.getStart(), currentInfo, findFollowingBreak), null, z4, 2, null);
        }
        return Selection.copy$default(selection, null, changeOffset(selection.getEnd(), currentInfo, findFollowingBreak), z4, 1, null);
    }

    private static final boolean isExpanding(SelectableInfo selectableInfo, int i5, boolean z4) {
        boolean z5;
        if (selectableInfo.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i5 == selectableInfo.getRawPreviousHandleOffset()) {
            return false;
        }
        if (selectableInfo.getRawCrossStatus() == CrossStatus.CROSSED) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 ^ z5) {
            if (i5 < selectableInfo.getRawPreviousHandleOffset()) {
                return true;
            }
        } else if (i5 > selectableInfo.getRawPreviousHandleOffset()) {
            return true;
        }
        return false;
    }

    public static final Selection.AnchorInfo snapToWordBoundary(SelectableInfo selectableInfo, int i5, int i6, int i7, boolean z4, boolean z5) {
        int lineStart;
        int lineEnd$default;
        long m5519getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m5519getWordBoundaryjx7JFs(i6);
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs)) == i5) {
            lineStart = TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs);
        } else if (i5 >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(selectableInfo.getTextLayoutResult().getLineCount() - 1);
        } else {
            lineStart = selectableInfo.getTextLayoutResult().getLineStart(i5);
        }
        if (selectableInfo.getTextLayoutResult().getLineForOffset(TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs)) == i5) {
            lineEnd$default = TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs);
        } else if (i5 >= selectableInfo.getTextLayoutResult().getLineCount()) {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), selectableInfo.getTextLayoutResult().getLineCount() - 1, false, 2, null);
        } else {
            lineEnd$default = TextLayoutResult.getLineEnd$default(selectableInfo.getTextLayoutResult(), i5, false, 2, null);
        }
        if (lineStart == i7) {
            return selectableInfo.anchorForOffset(lineEnd$default);
        }
        if (lineEnd$default == i7) {
            return selectableInfo.anchorForOffset(lineStart);
        }
        if (!(z4 ^ z5) ? i6 >= lineStart : i6 > lineEnd$default) {
            lineStart = lineEnd$default;
        }
        return selectableInfo.anchorForOffset(lineStart);
    }

    public static final Selection.AnchorInfo updateSelectionBoundary(SelectionLayout selectionLayout, SelectableInfo selectableInfo, Selection.AnchorInfo anchorInfo) {
        int rawEndHandleOffset;
        int endSlot;
        d0 b5;
        int rawStartHandleOffset;
        d0 b6;
        if (selectionLayout.isStartHandle()) {
            rawEndHandleOffset = selectableInfo.getRawStartHandleOffset();
        } else {
            rawEndHandleOffset = selectableInfo.getRawEndHandleOffset();
        }
        if (selectionLayout.isStartHandle()) {
            endSlot = selectionLayout.getStartSlot();
        } else {
            endSlot = selectionLayout.getEndSlot();
        }
        if (endSlot != selectableInfo.getSlot()) {
            return selectableInfo.anchorForOffset(rawEndHandleOffset);
        }
        h0 h0Var = h0.NONE;
        b5 = f0.b(h0Var, new SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(selectableInfo, rawEndHandleOffset));
        if (selectionLayout.isStartHandle()) {
            rawStartHandleOffset = selectableInfo.getRawEndHandleOffset();
        } else {
            rawStartHandleOffset = selectableInfo.getRawStartHandleOffset();
        }
        b6 = f0.b(h0Var, new SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(selectableInfo, rawEndHandleOffset, rawStartHandleOffset, selectionLayout, b5));
        if (selectableInfo.getSelectableId() != anchorInfo.getSelectableId()) {
            return updateSelectionBoundary$lambda$1(b6);
        }
        int rawPreviousHandleOffset = selectableInfo.getRawPreviousHandleOffset();
        if (rawEndHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (updateSelectionBoundary$lambda$0(b5) != selectableInfo.getTextLayoutResult().getLineForOffset(rawPreviousHandleOffset)) {
            return updateSelectionBoundary$lambda$1(b6);
        }
        int offset = anchorInfo.getOffset();
        long m5519getWordBoundaryjx7JFs = selectableInfo.getTextLayoutResult().m5519getWordBoundaryjx7JFs(offset);
        if (!isExpanding(selectableInfo, rawEndHandleOffset, selectionLayout.isStartHandle())) {
            return selectableInfo.anchorForOffset(rawEndHandleOffset);
        }
        if (offset != TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs) && offset != TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs)) {
            return selectableInfo.anchorForOffset(rawEndHandleOffset);
        }
        return updateSelectionBoundary$lambda$1(b6);
    }

    public static final int updateSelectionBoundary$lambda$0(d0<Integer> d0Var) {
        return d0Var.getValue().intValue();
    }

    private static final Selection.AnchorInfo updateSelectionBoundary$lambda$1(d0<Selection.AnchorInfo> d0Var) {
        return d0Var.getValue();
    }
}

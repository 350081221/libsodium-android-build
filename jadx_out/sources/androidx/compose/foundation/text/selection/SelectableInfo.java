package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0005J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0000J\b\u0010/\u001a\u00020\u0011H\u0016R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "selectableId", "", "slot", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "(JIIIILandroidx/compose/ui/text/TextLayoutResult;)V", "endRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getEndRunDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "inputText", "", "getInputText", "()Ljava/lang/String;", "rawCrossStatus", "Landroidx/compose/foundation/text/selection/CrossStatus;", "getRawCrossStatus", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "getRawEndHandleOffset", "()I", "getRawPreviousHandleOffset", "getRawStartHandleOffset", "getSelectableId", "()J", "getSlot", "startRunDirection", "getStartRunDirection", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "textLength", "getTextLength", "anchorForOffset", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", TypedValues.CycleType.S_WAVE_OFFSET, "makeSingleLayoutSelection", "Landroidx/compose/foundation/text/selection/Selection;", "start", "end", "shouldRecomputeSelection", "", "other", "toString", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectableInfo {
    public static final int $stable = TextLayoutResult.$stable;
    private final int rawEndHandleOffset;
    private final int rawPreviousHandleOffset;
    private final int rawStartHandleOffset;
    private final long selectableId;
    private final int slot;

    @l
    private final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j5, int i5, int i6, int i7, int i8, @l TextLayoutResult textLayoutResult) {
        this.selectableId = j5;
        this.slot = i5;
        this.rawStartHandleOffset = i6;
        this.rawEndHandleOffset = i7;
        this.rawPreviousHandleOffset = i8;
        this.textLayoutResult = textLayoutResult;
    }

    private final ResolvedTextDirection getEndRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawEndHandleOffset);
        return textDirectionForOffset;
    }

    private final ResolvedTextDirection getStartRunDirection() {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, this.rawStartHandleOffset);
        return textDirectionForOffset;
    }

    @l
    public final Selection.AnchorInfo anchorForOffset(int i5) {
        ResolvedTextDirection textDirectionForOffset;
        textDirectionForOffset = SelectionLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i5);
        return new Selection.AnchorInfo(textDirectionForOffset, i5, this.selectableId);
    }

    @l
    public final String getInputText() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    @l
    public final CrossStatus getRawCrossStatus() {
        int i5 = this.rawStartHandleOffset;
        int i6 = this.rawEndHandleOffset;
        if (i5 < i6) {
            return CrossStatus.NOT_CROSSED;
        }
        if (i5 > i6) {
            return CrossStatus.CROSSED;
        }
        return CrossStatus.COLLAPSED;
    }

    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    public final int getSlot() {
        return this.slot;
    }

    @l
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    @l
    public final Selection makeSingleLayoutSelection(int i5, int i6) {
        boolean z4;
        Selection.AnchorInfo anchorForOffset = anchorForOffset(i5);
        Selection.AnchorInfo anchorForOffset2 = anchorForOffset(i6);
        if (i5 > i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new Selection(anchorForOffset, anchorForOffset2, z4);
    }

    public final boolean shouldRecomputeSelection(@l SelectableInfo selectableInfo) {
        if (this.selectableId == selectableInfo.selectableId && this.rawStartHandleOffset == selectableInfo.rawStartHandleOffset && this.rawEndHandleOffset == selectableInfo.rawEndHandleOffset) {
            return false;
        }
        return true;
    }

    @l
    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + getStartRunDirection() + ',' + this.rawEndHandleOffset + '-' + getEndRunDirection() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}

package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2 extends n0 implements v3.a<Selection.AnchorInfo> {
    final /* synthetic */ d0<Integer> $currentRawLine$delegate;
    final /* synthetic */ int $currentRawOffset;
    final /* synthetic */ SelectableInfo $info;
    final /* synthetic */ int $otherRawOffset;
    final /* synthetic */ SelectionLayout $this_updateSelectionBoundary;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$anchorSnappedToWordBoundary$2(SelectableInfo selectableInfo, int i5, int i6, SelectionLayout selectionLayout, d0<Integer> d0Var) {
        super(0);
        this.$info = selectableInfo;
        this.$currentRawOffset = i5;
        this.$otherRawOffset = i6;
        this.$this_updateSelectionBoundary = selectionLayout;
        this.$currentRawLine$delegate = d0Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Selection.AnchorInfo invoke() {
        int updateSelectionBoundary$lambda$0;
        Selection.AnchorInfo snapToWordBoundary;
        SelectableInfo selectableInfo = this.$info;
        updateSelectionBoundary$lambda$0 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$0(this.$currentRawLine$delegate);
        snapToWordBoundary = SelectionAdjustmentKt.snapToWordBoundary(selectableInfo, updateSelectionBoundary$lambda$0, this.$currentRawOffset, this.$otherRawOffset, this.$this_updateSelectionBoundary.isStartHandle(), this.$this_updateSelectionBoundary.getCrossStatus() == CrossStatus.CROSSED);
        return snapToWordBoundary;
    }
}

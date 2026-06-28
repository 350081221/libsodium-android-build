package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/material3/SwipeToDismissAnchorsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Lkotlin/r2;", "onDetach", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/material3/SwipeToDismissBoxState;", "state", "Landroidx/compose/material3/SwipeToDismissBoxState;", "getState", "()Landroidx/compose/material3/SwipeToDismissBoxState;", "setState", "(Landroidx/compose/material3/SwipeToDismissBoxState;)V", "", "enableDismissFromStartToEnd", "Z", "getEnableDismissFromStartToEnd", "()Z", "setEnableDismissFromStartToEnd", "(Z)V", "enableDismissFromEndToStart", "getEnableDismissFromEndToStart", "setEnableDismissFromEndToStart", "didLookahead", "<init>", "(Landroidx/compose/material3/SwipeToDismissBoxState;ZZ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeToDismissAnchorsNode extends Modifier.Node implements LayoutModifierNode {
    private boolean didLookahead;
    private boolean enableDismissFromEndToStart;
    private boolean enableDismissFromStartToEnd;

    @p4.l
    private SwipeToDismissBoxState state;

    public SwipeToDismissAnchorsNode(@p4.l SwipeToDismissBoxState swipeToDismissBoxState, boolean z4, boolean z5) {
        this.state = swipeToDismissBoxState;
        this.enableDismissFromStartToEnd = z4;
        this.enableDismissFromEndToStart = z5;
    }

    public final boolean getEnableDismissFromEndToStart() {
        return this.enableDismissFromEndToStart;
    }

    public final boolean getEnableDismissFromStartToEnd() {
        return this.enableDismissFromStartToEnd;
    }

    @p4.l
    public final SwipeToDismissBoxState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        boolean z4;
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        if (measureScope.isLookingAhead() || !this.didLookahead) {
            AnchoredDraggableState.updateAnchors$default(this.state.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new SwipeToDismissAnchorsNode$measure$newAnchors$1(this, mo4998measureBRTryo0.getWidth())), null, 2, null);
        }
        if (!measureScope.isLookingAhead() && !this.didLookahead) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.didLookahead = z4;
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new SwipeToDismissAnchorsNode$measure$1(measureScope, this, mo4998measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.didLookahead = false;
    }

    public final void setEnableDismissFromEndToStart(boolean z4) {
        this.enableDismissFromEndToStart = z4;
    }

    public final void setEnableDismissFromStartToEnd(boolean z4) {
        this.enableDismissFromStartToEnd = z4;
    }

    public final void setState(@p4.l SwipeToDismissBoxState swipeToDismissBoxState) {
        this.state = swipeToDismissBoxState;
    }
}

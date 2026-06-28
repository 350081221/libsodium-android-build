package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b&\u0010'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0011\u001a\u00020\b*\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lkotlin/r2;", "onPlaced", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "update", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "onGloballyPositioned", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/foundation/FocusableSemanticsNode;", "focusableSemanticsNode", "Landroidx/compose/foundation/FocusableSemanticsNode;", "Landroidx/compose/foundation/FocusableInteractionNode;", "focusableInteractionNode", "Landroidx/compose/foundation/FocusableInteractionNode;", "Landroidx/compose/foundation/FocusablePinnableContainerNode;", "focusablePinnableContainer", "Landroidx/compose/foundation/FocusablePinnableContainerNode;", "Landroidx/compose/foundation/FocusedBoundsNode;", "focusedBoundsNode", "Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "bringIntoViewRequester", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "bringIntoViewRequesterNode", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1#2:375\n*E\n"})
/* loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements FocusEventModifierNode, LayoutAwareModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode {

    @p4.l
    private final BringIntoViewRequester bringIntoViewRequester;

    @p4.l
    private final BringIntoViewRequesterNode bringIntoViewRequesterNode;

    @p4.m
    private FocusState focusState;

    @p4.l
    private final FocusableInteractionNode focusableInteractionNode;

    @p4.l
    private final FocusableSemanticsNode focusableSemanticsNode = (FocusableSemanticsNode) delegate(new FocusableSemanticsNode());

    @p4.l
    private final FocusablePinnableContainerNode focusablePinnableContainer = (FocusablePinnableContainerNode) delegate(new FocusablePinnableContainerNode());

    @p4.l
    private final FocusedBoundsNode focusedBoundsNode = (FocusedBoundsNode) delegate(new FocusedBoundsNode());

    public FocusableNode(@p4.m MutableInteractionSource mutableInteractionSource) {
        this.focusableInteractionNode = (FocusableInteractionNode) delegate(new FocusableInteractionNode(mutableInteractionSource));
        BringIntoViewRequester BringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
        this.bringIntoViewRequester = BringIntoViewRequester;
        this.bringIntoViewRequesterNode = (BringIntoViewRequesterNode) delegate(new BringIntoViewRequesterNode(BringIntoViewRequester));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.focusableSemanticsNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@p4.l FocusState focusState) {
        if (!l0.g(this.focusState, focusState)) {
            boolean isFocused = focusState.isFocused();
            if (isFocused) {
                kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new FocusableNode$onFocusEvent$1(this, null), 3, null);
            }
            if (isAttached()) {
                SemanticsModifierNodeKt.invalidateSemantics(this);
            }
            this.focusableInteractionNode.setFocus(isFocused);
            this.focusedBoundsNode.setFocus(isFocused);
            this.focusablePinnableContainer.setFocus(isFocused);
            this.focusableSemanticsNode.setFocus(isFocused);
            this.focusState = focusState;
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@p4.l LayoutCoordinates layoutCoordinates) {
        this.focusedBoundsNode.onGloballyPositioned(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@p4.l LayoutCoordinates layoutCoordinates) {
        this.bringIntoViewRequesterNode.onPlaced(layoutCoordinates);
    }

    public final void update(@p4.m MutableInteractionSource mutableInteractionSource) {
        this.focusableInteractionNode.update(mutableInteractionSource);
    }
}

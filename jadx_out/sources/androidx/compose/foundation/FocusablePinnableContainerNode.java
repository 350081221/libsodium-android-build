package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.i0;
import kotlin.jvm.internal.k1;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/FocusablePinnableContainerNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/layout/PinnableContainer;", "retrievePinnableContainer", "", "focused", "Lkotlin/r2;", "setFocus", "onReset", "onObservedReadsChanged", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinnedHandle", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "isFocused", "Z", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusablePinnableContainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private boolean isFocused;

    @p4.m
    private PinnableContainer.PinnedHandle pinnedHandle;

    private final PinnableContainer retrievePinnableContainer() {
        k1.h hVar = new k1.h();
        ObserverModifierNodeKt.observeReads(this, new FocusablePinnableContainerNode$retrievePinnableContainer$1(hVar, this));
        return (PinnableContainer) hVar.element;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        PinnableContainer.PinnedHandle pinnedHandle;
        PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
        if (this.isFocused) {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.pinnedHandle;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            if (retrievePinnableContainer != null) {
                pinnedHandle = retrievePinnableContainer.pin();
            } else {
                pinnedHandle = null;
            }
            this.pinnedHandle = pinnedHandle;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    public final void setFocus(boolean z4) {
        PinnableContainer.PinnedHandle pinnedHandle = null;
        if (z4) {
            PinnableContainer retrievePinnableContainer = retrievePinnableContainer();
            if (retrievePinnableContainer != null) {
                pinnedHandle = retrievePinnableContainer.pin();
            }
            this.pinnedHandle = pinnedHandle;
        } else {
            PinnableContainer.PinnedHandle pinnedHandle2 = this.pinnedHandle;
            if (pinnedHandle2 != null) {
                pinnedHandle2.release();
            }
            this.pinnedHandle = null;
        }
        this.isFocused = z4;
    }
}

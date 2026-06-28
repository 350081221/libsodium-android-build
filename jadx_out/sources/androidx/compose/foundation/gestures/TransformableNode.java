package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.channels.o;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/TransformableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "canPan", "lockRotationOnZoomPan", "enabled", "Lkotlin/r2;", "update", "Landroidx/compose/foundation/gestures/TransformableState;", "Lv3/l;", "Z", "updatedCanPan", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/TransformEvent;", "channel", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "<init>", "(Landroidx/compose/foundation/gestures/TransformableState;Lv3/l;ZZ)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode {

    @l
    private v3.l<? super Offset, Boolean> canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;

    @l
    private TransformableState state;

    @l
    private final v3.l<Offset, Boolean> updatedCanPan = new TransformableNode$updatedCanPan$1(this);

    @l
    private final kotlinx.coroutines.channels.l<TransformEvent> channel = o.d(Integer.MAX_VALUE, null, null, 6, null);

    @l
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TransformableNode$pointerInputNode$1(this, null)));

    public TransformableNode(@l TransformableState transformableState, @l v3.l<? super Offset, Boolean> lVar, boolean z4, boolean z5) {
        this.state = transformableState;
        this.canPan = lVar;
        this.lockRotationOnZoomPan = z4;
        this.enabled = z5;
    }

    public final void update(@l TransformableState transformableState, @l v3.l<? super Offset, Boolean> lVar, boolean z4, boolean z5) {
        boolean z6;
        this.canPan = lVar;
        if (l0.g(this.state, transformableState) && this.enabled == z5 && this.lockRotationOnZoomPan == z4) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            this.state = transformableState;
            this.enabled = z5;
            this.lockRotationOnZoomPan = z4;
            this.pointerInputNode.resetPointerInputHandler();
        }
    }
}

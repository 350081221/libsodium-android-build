package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u00106J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RJ\u0010.\u001a8\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0013\u0012\u00110'¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0+\u0012\u0006\u0012\u0004\u0018\u00010,0%¢\u0006\u0002\b-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/r2;", "update", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "Z", "getEnabled", "()Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getNestedScrollDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/gestures/ScrollDraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/ScrollDraggableState;", "getDraggableState", "()Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Lkotlin/Function0;", "startDragImmediately", "Lv3/a;", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/v0;", "name", "velocity", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onDragStopped", "Lv3/q;", "Landroidx/compose/foundation/gestures/DraggableNode;", "draggableGesturesNode", "Landroidx/compose/foundation/gestures/DraggableNode;", "getDraggableGesturesNode", "()Landroidx/compose/foundation/gestures/DraggableNode;", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableGesturesNode extends DelegatingNode {

    @l
    private final DraggableNode draggableGesturesNode;

    @l
    private final ScrollDraggableState draggableState;
    private final boolean enabled;

    @m
    private final MutableInteractionSource interactionSource;

    @l
    private final NestedScrollDispatcher nestedScrollDispatcher;

    @l
    private final q<s0, Velocity, d<? super r2>, Object> onDragStopped;

    @l
    private final Orientation orientation;

    @l
    private final ScrollingLogic scrollLogic;

    @l
    private final a<Boolean> startDragImmediately;

    public ScrollableGesturesNode(@l ScrollingLogic scrollingLogic, @l Orientation orientation, boolean z4, @l NestedScrollDispatcher nestedScrollDispatcher, @m MutableInteractionSource mutableInteractionSource) {
        v3.l lVar;
        q qVar;
        this.scrollLogic = scrollingLogic;
        this.orientation = orientation;
        this.enabled = z4;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.interactionSource = mutableInteractionSource;
        delegate(new MouseWheelScrollNode(scrollingLogic));
        ScrollDraggableState scrollDraggableState = new ScrollDraggableState(scrollingLogic);
        this.draggableState = scrollDraggableState;
        ScrollableGesturesNode$startDragImmediately$1 scrollableGesturesNode$startDragImmediately$1 = new ScrollableGesturesNode$startDragImmediately$1(this);
        this.startDragImmediately = scrollableGesturesNode$startDragImmediately$1;
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this, null);
        this.onDragStopped = scrollableGesturesNode$onDragStopped$1;
        lVar = ScrollableKt.CanDragCalculation;
        qVar = ScrollableKt.NoOpOnDragStarted;
        this.draggableGesturesNode = (DraggableNode) delegate(new DraggableNode(scrollDraggableState, lVar, orientation, z4, mutableInteractionSource, scrollableGesturesNode$startDragImmediately$1, qVar, scrollableGesturesNode$onDragStopped$1, false));
    }

    @l
    public final DraggableNode getDraggableGesturesNode() {
        return this.draggableGesturesNode;
    }

    @l
    public final ScrollDraggableState getDraggableState() {
        return this.draggableState;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @l
    public final NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @l
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @l
    public final ScrollingLogic getScrollLogic() {
        return this.scrollLogic;
    }

    public final void update(@l Orientation orientation, boolean z4, @m MutableInteractionSource mutableInteractionSource) {
        q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar;
        v3.l<? super PointerInputChange, Boolean> lVar;
        DraggableNode draggableNode = this.draggableGesturesNode;
        ScrollDraggableState scrollDraggableState = this.draggableState;
        a<Boolean> aVar = this.startDragImmediately;
        qVar = ScrollableKt.NoOpOnDragStarted;
        q<s0, Velocity, d<? super r2>, Object> qVar2 = this.onDragStopped;
        lVar = ScrollableKt.CanDragCalculation;
        draggableNode.update(scrollDraggableState, lVar, orientation, z4, mutableInteractionSource, aVar, qVar, qVar2, false);
    }
}

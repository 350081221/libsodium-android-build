package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001/\b\u0000\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018\u0012<\u0010 \u001a8\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a¢\u0006\u0002\b\u0007\u0012<\u0010#\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a¢\u0006\u0002\b\u0007\u0012\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b7\u0010&J9\u0010\t\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJÍ\u0001\u0010%\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182<\u0010 \u001a8\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a¢\u0006\u0002\b\u00072<\u0010#\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a¢\u0006\u0002\b\u00072\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "drag", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "draggingBy", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "update", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lv3/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "drag2DScope", "Landroidx/compose/foundation/gestures/Drag2DScope;", "getDrag2DScope", "()Landroidx/compose/foundation/gestures/Drag2DScope;", "setDrag2DScope", "(Landroidx/compose/foundation/gestures/Drag2DScope;)V", "androidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1", "abstractDragScope", "Landroidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1;", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Draggable2DNode extends AbstractDraggableNode {
    public static final int $stable = 8;

    @l
    private final Draggable2DNode$abstractDragScope$1 abstractDragScope;

    @l
    private Drag2DScope drag2DScope;

    @l
    private final PointerDirectionConfig pointerDirectionConfig;

    @l
    private Draggable2DState state;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1] */
    public Draggable2DNode(@l Draggable2DState draggable2DState, @l v3.l<? super PointerInputChange, Boolean> lVar, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        super(lVar, z4, mutableInteractionSource, aVar, qVar, qVar2, z5);
        Drag2DScope drag2DScope;
        this.state = draggable2DState;
        drag2DScope = Draggable2DKt.NoOpDrag2DScope;
        this.drag2DScope = drag2DScope;
        this.abstractDragScope = new AbstractDragScope() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1
            @Override // androidx.compose.foundation.gestures.AbstractDragScope
            /* renamed from: dragBy-k-4lQ0M */
            public void mo309dragByk4lQ0M(long j5) {
                Draggable2DNode.this.getDrag2DScope().mo319dragByk4lQ0M(j5);
            }
        };
        this.pointerDirectionConfig = DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @m
    public Object drag(@l p<? super AbstractDragScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object drag = this.state.drag(MutatePriority.UserInput, new Draggable2DNode$drag$2(this, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return drag == l5 ? drag : r2.f19517a;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @m
    public Object draggingBy(@l AbstractDragScope abstractDragScope, @l DragEvent.DragDelta dragDelta, @l d<? super r2> dVar) {
        abstractDragScope.mo309dragByk4lQ0M(dragDelta.m321getDeltaF1C5BW0());
        return r2.f19517a;
    }

    @l
    public final Drag2DScope getDrag2DScope() {
        return this.drag2DScope;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @l
    public PointerDirectionConfig getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    public final void setDrag2DScope(@l Drag2DScope drag2DScope) {
        this.drag2DScope = drag2DScope;
    }

    public final void update(@l Draggable2DState draggable2DState, @l v3.l<? super PointerInputChange, Boolean> lVar, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        boolean z6;
        boolean z7 = true;
        if (!l0.g(this.state, draggable2DState)) {
            this.state = draggable2DState;
            z6 = true;
        } else {
            z6 = false;
        }
        setCanDrag(lVar);
        if (getEnabled() != z4) {
            setEnabled(z4);
            if (!z4) {
                disposeInteractionSource();
            }
            z6 = true;
        }
        if (!l0.g(getInteractionSource(), mutableInteractionSource)) {
            disposeInteractionSource();
            setInteractionSource(mutableInteractionSource);
        }
        setStartDragImmediately(aVar);
        setOnDragStarted(qVar);
        setOnDragStopped(qVar2);
        if (getReverseDirection() != z5) {
            setReverseDirection(z5);
        } else {
            z7 = z6;
        }
        if (z7) {
            getPointerInputNode().resetPointerInputHandler();
        }
    }
}

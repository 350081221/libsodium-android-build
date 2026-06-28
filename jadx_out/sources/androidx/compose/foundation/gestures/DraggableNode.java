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
@i0(d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00012\b\u0000\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a\u0012<\u0010\"\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c¢\u0006\u0002\b\u0007\u0012<\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c¢\u0006\u0002\b\u0007\u0012\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b:\u0010(J9\u0010\t\u001a\u00020\u00052'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJÕ\u0001\u0010'\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2<\u0010\"\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c¢\u0006\u0002\b\u00072<\u0010%\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c¢\u0006\u0002\b\u00072\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010)R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "drag", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "draggingBy", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Lkotlin/Function0;", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "update", "(Landroidx/compose/foundation/gestures/DraggableState;Lv3/l;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/gestures/DragScope;", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "getDragScope", "()Landroidx/compose/foundation/gestures/DragScope;", "setDragScope", "(Landroidx/compose/foundation/gestures/DragScope;)V", "androidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1", "abstractDragScope", "Landroidx/compose/foundation/gestures/DraggableNode$abstractDragScope$1;", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DraggableNode extends AbstractDraggableNode {
    public static final int $stable = 8;

    @l
    private final DraggableNode$abstractDragScope$1 abstractDragScope;

    @l
    private DragScope dragScope;

    @l
    private Orientation orientation;

    @l
    private final PointerDirectionConfig pointerDirectionConfig;

    @l
    private DraggableState state;

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.compose.foundation.gestures.DraggableNode$abstractDragScope$1] */
    public DraggableNode(@l DraggableState draggableState, @l v3.l<? super PointerInputChange, Boolean> lVar, @l Orientation orientation, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        super(lVar, z4, mutableInteractionSource, aVar, qVar, qVar2, z5);
        DragScope dragScope;
        this.state = draggableState;
        this.orientation = orientation;
        dragScope = DraggableKt.NoOpDragScope;
        this.dragScope = dragScope;
        this.abstractDragScope = new AbstractDragScope() { // from class: androidx.compose.foundation.gestures.DraggableNode$abstractDragScope$1
            @Override // androidx.compose.foundation.gestures.AbstractDragScope
            /* renamed from: dragBy-k-4lQ0M */
            public void mo309dragByk4lQ0M(long j5) {
                Orientation orientation2;
                float m359toFloat3MmeM6k;
                DragScope dragScope2 = DraggableNode.this.getDragScope();
                orientation2 = DraggableNode.this.orientation;
                m359toFloat3MmeM6k = DraggableKt.m359toFloat3MmeM6k(j5, orientation2);
                dragScope2.dragBy(m359toFloat3MmeM6k);
            }
        };
        this.pointerDirectionConfig = DragGestureDetectorKt.toPointerDirectionConfig(this.orientation);
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @m
    public Object drag(@l p<? super AbstractDragScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object drag = this.state.drag(MutatePriority.UserInput, new DraggableNode$drag$2(this, pVar, null), dVar);
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
    public final DragScope getDragScope() {
        return this.dragScope;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    @l
    public PointerDirectionConfig getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    public final void setDragScope(@l DragScope dragScope) {
        this.dragScope = dragScope;
    }

    public final void update(@l DraggableState draggableState, @l v3.l<? super PointerInputChange, Boolean> lVar, @l Orientation orientation, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        boolean z6;
        boolean z7 = true;
        if (!l0.g(this.state, draggableState)) {
            this.state = draggableState;
            z6 = true;
        } else {
            z6 = false;
        }
        setCanDrag(lVar);
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z6 = true;
        }
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

package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.r2;

@kotlin.i0(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0004*\u0002\u0000\u0010\b\n\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"androidx/compose/material3/AnchoredDraggableState$draggableState$1", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "androidx/compose/material3/AnchoredDraggableState$draggableState$1$dragScope$1", "dragScope", "Landroidx/compose/material3/AnchoredDraggableState$draggableState$1$dragScope$1;", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$draggableState$1 implements DraggableState {

    @p4.l
    private final AnchoredDraggableState$draggableState$1$dragScope$1 dragScope;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.material3.AnchoredDraggableState$draggableState$1$dragScope$1] */
    public AnchoredDraggableState$draggableState$1(final AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
        this.dragScope = new DragScope() { // from class: androidx.compose.material3.AnchoredDraggableState$draggableState$1$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public void dragBy(float f5) {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) anchoredDraggableState).anchoredDragScope;
                AnchoredDragScope.dragTo$default(anchoredDragScope, anchoredDraggableState.newOffsetForDelta$material3_release(f5), 0.0f, 2, null);
            }
        };
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f5) {
        this.this$0.dispatchRawDelta(f5);
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @p4.m
    public Object drag(@p4.l MutatePriority mutatePriority, @p4.l v3.p<? super DragScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object anchoredDrag = this.this$0.anchoredDrag(mutatePriority, new AnchoredDraggableState$draggableState$1$drag$2(this, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return anchoredDrag == l5 ? anchoredDrag : r2.f19517a;
    }
}

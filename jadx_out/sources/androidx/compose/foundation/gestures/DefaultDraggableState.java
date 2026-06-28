package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/d;", "Lkotlin/r2;", "", "Lkotlin/u;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "Lkotlin/Function1;", "onDelta", "Lv3/l;", "getOnDelta", "()Lv3/l;", "dragScope", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/foundation/MutatorMutex;", "<init>", "(Lv3/l;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultDraggableState implements DraggableState {

    @l
    private final v3.l<Float, r2> onDelta;

    @l
    private final DragScope dragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f5) {
            DefaultDraggableState.this.getOnDelta().invoke(Float.valueOf(f5));
        }
    };

    @l
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(@l v3.l<? super Float, r2> lVar) {
        this.onDelta = lVar;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public void dispatchRawDelta(float f5) {
        this.onDelta.invoke(Float.valueOf(f5));
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    @m
    public Object drag(@l MutatePriority mutatePriority, @l p<? super DragScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    @l
    public final v3.l<Float, r2> getOnDelta() {
        return this.onDelta;
    }
}

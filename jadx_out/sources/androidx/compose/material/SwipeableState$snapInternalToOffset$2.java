package androidx.compose.material;

import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableFloatState;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwipeableState$snapInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeableState$snapInternalToOffset$2 extends o implements p<DragScope, d<? super r2>, Object> {
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapInternalToOffset$2(float f5, SwipeableState<T> swipeableState, d<? super SwipeableState$snapInternalToOffset$2> dVar) {
        super(2, dVar);
        this.$target = f5;
        this.this$0 = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        SwipeableState$snapInternalToOffset$2 swipeableState$snapInternalToOffset$2 = new SwipeableState$snapInternalToOffset$2(this.$target, this.this$0, dVar);
        swipeableState$snapInternalToOffset$2.L$0 = obj;
        return swipeableState$snapInternalToOffset$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l DragScope dragScope, @m d<? super r2> dVar) {
        return ((SwipeableState$snapInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        MutableFloatState mutableFloatState;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            DragScope dragScope = (DragScope) this.L$0;
            float f5 = this.$target;
            mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
            dragScope.dragBy(f5 - mutableFloatState.getFloatValue());
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package androidx.compose.foundation.gestures;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", i = {}, l = {894}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollDraggableState$drag$2 extends o implements p<ScrollScope, d<? super r2>, Object> {
    final /* synthetic */ p<DragScope, d<? super r2>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollDraggableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollDraggableState$drag$2(ScrollDraggableState scrollDraggableState, p<? super DragScope, ? super d<? super r2>, ? extends Object> pVar, d<? super ScrollDraggableState$drag$2> dVar) {
        super(2, dVar);
        this.this$0 = scrollDraggableState;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScrollDraggableState$drag$2 scrollDraggableState$drag$2 = new ScrollDraggableState$drag$2(this.this$0, this.$block, dVar);
        scrollDraggableState$drag$2.L$0 = obj;
        return scrollDraggableState$drag$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
        return ((ScrollDraggableState$drag$2) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            this.this$0.setLatestScrollScope((ScrollScope) this.L$0);
            p<DragScope, d<? super r2>, Object> pVar = this.$block;
            ScrollDraggableState scrollDraggableState = this.this$0;
            this.label = 1;
            if (pVar.invoke(scrollDraggableState, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}

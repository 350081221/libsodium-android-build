package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/AnchoredDragScope;", "Landroidx/compose/material3/DraggableAnchors;", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
/* loaded from: classes.dex */
final class AnchoredDraggableState$draggableState$1$drag$2<T> extends kotlin.coroutines.jvm.internal.o implements v3.q<AnchoredDragScope, DraggableAnchors<T>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.p<DragScope, kotlin.coroutines.d<? super r2>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, v3.p<? super DragScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object> pVar, kotlin.coroutines.d<? super AnchoredDraggableState$draggableState$1$drag$2> dVar) {
        super(3, dVar);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = pVar;
    }

    @Override // v3.q
    @p4.m
    public final Object invoke(@p4.l AnchoredDragScope anchoredDragScope, @p4.l DraggableAnchors<T> draggableAnchors, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, dVar).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        AnchoredDraggableState$draggableState$1$dragScope$1 anchoredDraggableState$draggableState$1$dragScope$1;
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
            anchoredDraggableState$draggableState$1$dragScope$1 = this.this$0.dragScope;
            v3.p<DragScope, kotlin.coroutines.d<? super r2>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(anchoredDraggableState$draggableState$1$dragScope$1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}

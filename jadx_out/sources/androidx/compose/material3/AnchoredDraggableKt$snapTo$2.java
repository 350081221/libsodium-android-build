package androidx.compose.material3;

import kotlin.e1;
import kotlin.r2;
import v3.r;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/AnchoredDragScope;", "Landroidx/compose/material3/DraggableAnchors;", "anchors", "latestTarget", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AnchoredDraggableKt$snapTo$2<T> extends kotlin.coroutines.jvm.internal.o implements r<AnchoredDragScope, DraggableAnchors<T>, T, kotlin.coroutines.d<? super r2>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnchoredDraggableKt$snapTo$2(kotlin.coroutines.d<? super AnchoredDraggableKt$snapTo$2> dVar) {
        super(4, dVar);
    }

    @p4.m
    public final Object invoke(@p4.l AnchoredDragScope anchoredDragScope, @p4.l DraggableAnchors<T> draggableAnchors, T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(dVar);
        anchoredDraggableKt$snapTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$snapTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$snapTo$2.L$2 = t5;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.r
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, kotlin.coroutines.d<? super r2> dVar) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {0}, l = {575}, m = "anchoredDrag", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$3 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.d<? super AnchoredDraggableState$anchoredDrag$3> dVar) {
        super(dVar);
        this.this$0 = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.anchoredDrag(null, null, null, this);
    }
}

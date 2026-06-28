package androidx.compose.material3;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$trySnapTo$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$trySnapTo$1(AnchoredDraggableState<T> anchoredDraggableState, T t5) {
        super(0);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t5;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnchoredDragScope anchoredDragScope;
        anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
        AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
        T t5 = this.$targetValue;
        float positionOf = anchoredDraggableState.getAnchors().positionOf(t5);
        if (!Float.isNaN(positionOf)) {
            AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
            anchoredDraggableState.setDragTarget(null);
        }
        anchoredDraggableState.setCurrentValue(t5);
    }
}

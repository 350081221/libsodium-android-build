package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/DraggableAnchorsConfig;", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/material3/DraggableAnchorsConfig;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SwipeToDismissAnchorsNode$measure$newAnchors$1 extends kotlin.jvm.internal.n0 implements v3.l<DraggableAnchorsConfig<SwipeToDismissBoxValue>, r2> {
    final /* synthetic */ float $width;
    final /* synthetic */ SwipeToDismissAnchorsNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissAnchorsNode$measure$newAnchors$1(SwipeToDismissAnchorsNode swipeToDismissAnchorsNode, float f5) {
        super(1);
        this.this$0 = swipeToDismissAnchorsNode;
        this.$width = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
        invoke2(draggableAnchorsConfig);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DraggableAnchorsConfig<SwipeToDismissBoxValue> draggableAnchorsConfig) {
        draggableAnchorsConfig.at(SwipeToDismissBoxValue.Settled, 0.0f);
        if (this.this$0.getEnableDismissFromStartToEnd()) {
            draggableAnchorsConfig.at(SwipeToDismissBoxValue.StartToEnd, this.$width);
        }
        if (this.this$0.getEnableDismissFromEndToStart()) {
            draggableAnchorsConfig.at(SwipeToDismissBoxValue.EndToStart, -this.$width);
        }
    }
}

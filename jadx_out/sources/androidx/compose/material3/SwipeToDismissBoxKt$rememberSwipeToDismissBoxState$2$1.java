package androidx.compose.material3;

import androidx.compose.ui.unit.Density;

@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SwipeToDismissBoxState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1 extends kotlin.jvm.internal.n0 implements v3.a<SwipeToDismissBoxState> {
    final /* synthetic */ v3.l<SwipeToDismissBoxValue, Boolean> $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ SwipeToDismissBoxValue $initialValue;
    final /* synthetic */ v3.l<Float, Float> $positionalThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissBoxKt$rememberSwipeToDismissBoxState$2$1(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, v3.l<? super SwipeToDismissBoxValue, Boolean> lVar, v3.l<? super Float, Float> lVar2) {
        super(0);
        this.$initialValue = swipeToDismissBoxValue;
        this.$density = density;
        this.$confirmValueChange = lVar;
        this.$positionalThreshold = lVar2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final SwipeToDismissBoxState invoke() {
        return new SwipeToDismissBoxState(this.$initialValue, this.$density, this.$confirmValueChange, this.$positionalThreshold);
    }
}

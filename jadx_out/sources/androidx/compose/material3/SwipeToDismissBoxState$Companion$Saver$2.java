package androidx.compose.material3;

import androidx.compose.ui.unit.Density;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SwipeToDismissBoxState;", "it", "Landroidx/compose/material3/SwipeToDismissBoxValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxState$Companion$Saver$2 extends kotlin.jvm.internal.n0 implements v3.l<SwipeToDismissBoxValue, SwipeToDismissBoxState> {
    final /* synthetic */ v3.l<SwipeToDismissBoxValue, Boolean> $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ v3.l<Float, Float> $positionalThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissBoxState$Companion$Saver$2(Density density, v3.l<? super SwipeToDismissBoxValue, Boolean> lVar, v3.l<? super Float, Float> lVar2) {
        super(1);
        this.$density = density;
        this.$confirmValueChange = lVar;
        this.$positionalThreshold = lVar2;
    }

    @Override // v3.l
    @p4.m
    public final SwipeToDismissBoxState invoke(@p4.l SwipeToDismissBoxValue swipeToDismissBoxValue) {
        return new SwipeToDismissBoxState(swipeToDismissBoxValue, this.$density, this.$confirmValueChange, this.$positionalThreshold);
    }
}

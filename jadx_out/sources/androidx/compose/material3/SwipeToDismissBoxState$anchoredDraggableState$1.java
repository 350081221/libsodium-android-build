package androidx.compose.material3;

import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxState$anchoredDraggableState$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,480:1\n1#2:481\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissBoxState$anchoredDraggableState$1 extends kotlin.jvm.internal.n0 implements v3.a<Float> {
    final /* synthetic */ SwipeToDismissBoxState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissBoxState$anchoredDraggableState$1(SwipeToDismissBoxState swipeToDismissBoxState) {
        super(0);
        this.this$0 = swipeToDismissBoxState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Float invoke() {
        return Float.valueOf(this.this$0.getDensity$material3_release().mo304toPx0680j_4(SwipeToDismissBoxKt.access$getDismissThreshold$p()));
    }
}

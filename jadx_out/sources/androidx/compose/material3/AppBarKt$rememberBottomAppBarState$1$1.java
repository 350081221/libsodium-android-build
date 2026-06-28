package androidx.compose.material3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material3/BottomAppBarState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$rememberBottomAppBarState$1$1 extends kotlin.jvm.internal.n0 implements v3.a<BottomAppBarState> {
    final /* synthetic */ float $initialContentOffset;
    final /* synthetic */ float $initialHeightOffset;
    final /* synthetic */ float $initialHeightOffsetLimit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$rememberBottomAppBarState$1$1(float f5, float f6, float f7) {
        super(0);
        this.$initialHeightOffsetLimit = f5;
        this.$initialHeightOffset = f6;
        this.$initialContentOffset = f7;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final BottomAppBarState invoke() {
        return AppBarKt.BottomAppBarState(this.$initialHeightOffsetLimit, this.$initialHeightOffset, this.$initialContentOffset);
    }
}

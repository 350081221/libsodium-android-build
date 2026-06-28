package androidx.compose.material3;

import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1 extends kotlin.jvm.internal.n0 implements v3.l<Float, r2> {
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior) {
        super(1);
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
        invoke(f5.floatValue());
        return r2.f19517a;
    }

    public final void invoke(float f5) {
        this.$scrollBehavior.getState().setHeightOffset(this.$scrollBehavior.getState().getHeightOffset() + f5);
    }
}

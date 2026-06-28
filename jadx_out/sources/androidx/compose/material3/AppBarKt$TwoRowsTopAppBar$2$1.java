package androidx.compose.material3;

import kotlin.jvm.internal.k1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppBarKt$TwoRowsTopAppBar$2$1 extends kotlin.jvm.internal.n0 implements v3.a<r2> {
    final /* synthetic */ k1.e $maxHeightPx;
    final /* synthetic */ k1.e $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TwoRowsTopAppBar$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, k1.e eVar, k1.e eVar2) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$pinnedHeightPx = eVar;
        this.$maxHeightPx = eVar2;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TopAppBarState state;
        TopAppBarScrollBehavior topAppBarScrollBehavior = this.$scrollBehavior;
        if (kotlin.jvm.internal.l0.e((topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), this.$pinnedHeightPx.element - this.$maxHeightPx.element)) {
            return;
        }
        TopAppBarScrollBehavior topAppBarScrollBehavior2 = this.$scrollBehavior;
        TopAppBarState state2 = topAppBarScrollBehavior2 != null ? topAppBarScrollBehavior2.getState() : null;
        if (state2 == null) {
            return;
        }
        state2.setHeightOffsetLimit(this.$pinnedHeightPx.element - this.$maxHeightPx.element);
    }
}

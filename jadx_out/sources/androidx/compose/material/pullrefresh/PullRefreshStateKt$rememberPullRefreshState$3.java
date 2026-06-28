package androidx.compose.material.pullrefresh;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PullRefreshStateKt$rememberPullRefreshState$3 extends n0 implements a<r2> {
    final /* synthetic */ boolean $refreshing;
    final /* synthetic */ k1.e $refreshingOffsetPx;
    final /* synthetic */ PullRefreshState $state;
    final /* synthetic */ k1.e $thresholdPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshStateKt$rememberPullRefreshState$3(PullRefreshState pullRefreshState, boolean z4, k1.e eVar, k1.e eVar2) {
        super(0);
        this.$state = pullRefreshState;
        this.$refreshing = z4;
        this.$thresholdPx = eVar;
        this.$refreshingOffsetPx = eVar2;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.setRefreshing$material_release(this.$refreshing);
        this.$state.setThreshold$material_release(this.$thresholdPx.element);
        this.$state.setRefreshingOffset$material_release(this.$refreshingOffsetPx.element);
    }
}

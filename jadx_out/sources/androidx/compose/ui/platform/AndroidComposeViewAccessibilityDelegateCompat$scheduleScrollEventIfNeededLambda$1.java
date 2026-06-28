package androidx.compose.ui.platform;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1 extends kotlin.jvm.internal.n0 implements v3.l<ScrollObservationScope, r2> {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(ScrollObservationScope scrollObservationScope) {
        invoke2(scrollObservationScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l ScrollObservationScope scrollObservationScope) {
        this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
    }
}

package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ kotlinx.coroutines.n0 $lifecycleDispatcher;
    final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(kotlinx.coroutines.n0 n0Var, Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        super(1);
        this.$lifecycleDispatcher = n0Var;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        kotlinx.coroutines.n0 n0Var = this.$lifecycleDispatcher;
        kotlin.coroutines.i iVar = kotlin.coroutines.i.INSTANCE;
        if (n0Var.isDispatchNeeded(iVar)) {
            kotlinx.coroutines.n0 n0Var2 = this.$lifecycleDispatcher;
            final Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
            final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.$observer;
            n0Var2.dispatch(iVar, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                @Override // java.lang.Runnable
                public final void run() {
                    Lifecycle.this.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                }
            });
            return;
        }
        this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
    }
}

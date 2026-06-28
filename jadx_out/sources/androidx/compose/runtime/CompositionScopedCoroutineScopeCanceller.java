package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.a1;
import kotlin.i0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/r2;", "onRemembered", "onForgotten", "onAbandoned", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlinx/coroutines/s0;", "getCoroutineScope", "()Lkotlinx/coroutines/s0;", "<init>", "(Lkotlinx/coroutines/s0;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@a1
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    public static final int $stable = 8;

    @l
    private final s0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@l s0 s0Var) {
        this.coroutineScope = s0Var;
    }

    @l
    public final s0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        t0.d(this.coroutineScope, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        t0.d(this.coroutineScope, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}

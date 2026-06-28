package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.Stable;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import kotlin.r2;
import kotlinx.coroutines.p;

@Stable
@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\f¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "Lkotlin/r2;", "show", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dismiss", "onDispose", "", "isPersistent", "Z", "()Z", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/animation/core/MutableTransitionState;", "transition", "Landroidx/compose/animation/core/MutableTransitionState;", "getTransition", "()Landroidx/compose/animation/core/MutableTransitionState;", "Lkotlinx/coroutines/p;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/p;", "isVisible", "initialIsVisible", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TooltipStateImpl implements TooltipState {
    private final boolean isPersistent;

    @p4.m
    private kotlinx.coroutines.p<? super r2> job;

    @p4.l
    private final MutatorMutex mutatorMutex;

    @p4.l
    private final MutableTransitionState<Boolean> transition;

    public TooltipStateImpl(boolean z4, boolean z5, @p4.l MutatorMutex mutatorMutex) {
        this.isPersistent = z5;
        this.mutatorMutex = mutatorMutex;
        this.transition = new MutableTransitionState<>(Boolean.valueOf(z4));
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void dismiss() {
        getTransition().setTargetState(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    @p4.l
    public MutableTransitionState<Boolean> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isPersistent() {
        return this.isPersistent;
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public boolean isVisible() {
        return getTransition().getCurrentState().booleanValue() || getTransition().getTargetState().booleanValue();
    }

    @Override // androidx.compose.material3.BasicTooltipState
    public void onDispose() {
        kotlinx.coroutines.p<? super r2> pVar = this.job;
        if (pVar != null) {
            p.a.a(pVar, null, 1, null);
        }
    }

    @Override // androidx.compose.material3.BasicTooltipState
    @p4.m
    public Object show(@p4.l MutatePriority mutatePriority, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object mutate = this.mutatorMutex.mutate(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (mutate == l5) {
            return mutate;
        }
        return r2.f19517a;
    }
}

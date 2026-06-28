package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0010¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0014\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "Landroidx/compose/animation/core/Transition;", "transition", "Lkotlin/r2;", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "<set-?>", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "(Ljava/lang/Object;)V", "currentState", "targetState$delegate", "getTargetState", "setTargetState", "targetState", "", "isIdle", "()Z", "initialState", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n81#2:1386\n107#2,2:1387\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n145#1:1383\n145#1:1384,2\n157#1:1386\n157#1:1387,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;

    @l
    private final MutableState currentState$delegate;

    @l
    private final MutableState targetState$delegate;

    public MutableTransitionState(S s5) {
        super(null);
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s5, null, 2, null);
        this.currentState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s5, null, 2, null);
        this.targetState$delegate = mutableStateOf$default2;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        return l0.g(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    public void setCurrentState$animation_core_release(S s5) {
        this.currentState$delegate.setValue(s5);
    }

    public void setTargetState(S s5) {
        this.targetState$delegate.setValue(s5);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@l Transition<S> transition) {
    }
}

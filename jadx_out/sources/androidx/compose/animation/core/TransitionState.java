package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H ¢\u0006\u0004\b\u0006\u0010\u0007R+\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/TransitionState;", "S", "", "Landroidx/compose/animation/core/Transition;", "transition", "Lkotlin/r2;", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning", "getCurrentState", "()Ljava/lang/Object;", "currentState", "getTargetState", "targetState", "<init>", "()V", "Landroidx/compose/animation/core/MutableTransitionState;", "Landroidx/compose/animation/core/PreventExhaustiveWhenTransitionState;", "Landroidx/compose/animation/core/SeekableTransitionState;", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1382:1\n81#2:1383\n107#2,2:1384\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n107#1:1383\n107#1:1384,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;

    @l
    private final MutableState isRunning$delegate;

    private TransitionState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
    }

    public /* synthetic */ TransitionState(w wVar) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean z4) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z4));
    }

    public abstract void transitionConfigured$animation_core_release(@l Transition<S> transition);
}

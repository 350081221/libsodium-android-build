package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import com.google.android.material.color.utilities.Contrast;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010#\u001a\u00028\u0000\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086@¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "Lkotlin/r2;", "seekToFraction", "", "fraction", "snapToFraction", "(FLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "animateToTargetState", "(Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateToCurrentState", "Landroidx/compose/animation/core/Transition;", "transition", "transitionConfigured$animation_core_release", "(Landroidx/compose/animation/core/Transition;)V", "transitionConfigured", "targetState", "Ljava/lang/Object;", "getTargetState", "()Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedFraction", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "currentState", "getCurrentState", "getFraction", "()F", "initialState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalTransitionApi
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 8;

    @l
    private final Animatable<Float, AnimationVector1D> animatedFraction;
    private final S currentState;

    @l
    private final SnapshotStateObserver observer;
    private final S targetState;

    @m
    private Transition<S> transition;

    public SeekableTransitionState(S s5, S s6) {
        super(null);
        this.targetState = s6;
        Animatable<Float, AnimationVector1D> Animatable$default = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        Animatable$default.updateBounds(Float.valueOf(0.0f), Float.valueOf(1.0f));
        this.animatedFraction = Animatable$default;
        this.observer = new SnapshotStateObserver(SeekableTransitionState$observer$1.INSTANCE);
        this.currentState = s5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateToCurrentState$default(SeekableTransitionState seekableTransitionState, FiniteAnimationSpec finiteAnimationSpec, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToCurrentState(finiteAnimationSpec, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateToTargetState$default(SeekableTransitionState seekableTransitionState, FiniteAnimationSpec finiteAnimationSpec, kotlin.coroutines.d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            finiteAnimationSpec = seekableTransitionState.animatedFraction.getDefaultSpringSpec$animation_core_release();
        }
        return seekableTransitionState.animateToTargetState(finiteAnimationSpec, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekToFraction() {
        long N0;
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        k1.g gVar = new k1.g();
        this.observer.observeReads(r2.f19517a, new SeekableTransitionState$seekToFraction$1(this), new SeekableTransitionState$seekToFraction$2(gVar, transition));
        N0 = kotlin.math.d.N0(this.animatedFraction.getValue().floatValue() * ((float) gVar.element));
        transition.seek(getCurrentState(), getTargetState(), N0);
    }

    @m
    public final Object animateToCurrentState(@l FiniteAnimationSpec<Float> finiteAnimationSpec, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (this.transition != null && !l0.g(getCurrentState(), getTargetState())) {
            Object animateTo$default = Animatable.animateTo$default(this.animatedFraction, kotlin.coroutines.jvm.internal.b.e(0.0f), finiteAnimationSpec, null, new SeekableTransitionState$animateToCurrentState$2(this), dVar, 4, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo$default == l5) {
                return animateTo$default;
            }
            return r2.f19517a;
        }
        return r2.f19517a;
    }

    @m
    public final Object animateToTargetState(@l FiniteAnimationSpec<Float> finiteAnimationSpec, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (this.transition != null && !l0.g(getCurrentState(), getTargetState())) {
            Object animateTo$default = Animatable.animateTo$default(this.animatedFraction, kotlin.coroutines.jvm.internal.b.e(1.0f), finiteAnimationSpec, null, new SeekableTransitionState$animateToTargetState$2(this), dVar, 4, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (animateTo$default == l5) {
                return animateTo$default;
            }
            return r2.f19517a;
        }
        return r2.f19517a;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return this.currentState;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public final float getFraction() {
        return this.animatedFraction.getValue().floatValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return this.targetState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapToFraction(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r5, @p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$snapToFraction$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.animation.core.SeekableTransitionState r5 = (androidx.compose.animation.core.SeekableTransitionState) r5
            kotlin.e1.n(r6)
            goto L6a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.e1.n(r6)
            r6 = 0
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            r2 = 0
            if (r6 > 0) goto L45
            r6 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 > 0) goto L45
            r2 = r3
        L45:
            if (r2 == 0) goto L70
            java.lang.Object r6 = r4.getCurrentState()
            java.lang.Object r2 = r4.getTargetState()
            boolean r6 = kotlin.jvm.internal.l0.g(r6, r2)
            if (r6 == 0) goto L58
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        L58:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6 = r4.animatedFraction
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.e(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.snapTo(r5, r0)
            if (r5 != r1) goto L69
            return r1
        L69:
            r5 = r4
        L6a:
            r5.seekToFraction()
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        L70:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Expecting fraction between 0 and 1. Got "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.snapToFraction(float, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@l Transition<S> transition) {
        boolean z4;
        Transition<S> transition2 = this.transition;
        if (transition2 != null && !l0.g(transition, transition2)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            this.transition = transition;
            seekToFraction();
            return;
        }
        throw new IllegalStateException(("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition).toString());
    }
}

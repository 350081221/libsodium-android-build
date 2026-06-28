package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/HighVelocityApproachAnimation;", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "scope", TypedValues.CycleType.S_WAVE_OFFSET, "velocity", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "delta", "Lkotlin/r2;", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "approachAnimation", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "<init>", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HighVelocityApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    @l
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public HighVelocityApproachAnimation(@l DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f5, Float f6, v3.l<? super Float, r2> lVar, d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        return approachAnimation(scrollScope, f5.floatValue(), f6.floatValue(), lVar, dVar);
    }

    @m
    public Object approachAnimation(@l ScrollScope scrollScope, float f5, float f6, @l v3.l<? super Float, r2> lVar, @l d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        Object l5;
        Object access$animateDecay = SnapFlingBehaviorKt.access$animateDecay(scrollScope, f5, AnimationStateKt.AnimationState$default(0.0f, f6, 0L, 0L, false, 28, null), this.decayAnimationSpec, lVar, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return access$animateDecay == l5 ? access$animateDecay : (AnimationResult) access$animateDecay;
    }
}

package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt$animateDecay$2 extends n0 implements l<AnimationScope<Float, AnimationVector1D>, r2> {
    final /* synthetic */ l<Float, r2> $onAnimationStep;
    final /* synthetic */ k1.e $previousValue;
    final /* synthetic */ float $targetOffset;
    final /* synthetic */ ScrollScope $this_animateDecay;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehaviorKt$animateDecay$2(float f5, k1.e eVar, ScrollScope scrollScope, l<? super Float, r2> lVar) {
        super(1);
        this.$targetOffset = f5;
        this.$previousValue = eVar;
        this.$this_animateDecay = scrollScope;
        this.$onAnimationStep = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AnimationScope<Float, AnimationVector1D> animationScope) {
        float coerceToTarget;
        if (Math.abs(animationScope.getValue().floatValue()) >= Math.abs(this.$targetOffset)) {
            coerceToTarget = SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), this.$targetOffset);
            SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, this.$this_animateDecay, this.$onAnimationStep, coerceToTarget - this.$previousValue.element);
            animationScope.cancelAnimation();
            this.$previousValue.element = coerceToTarget;
            return;
        }
        SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, this.$this_animateDecay, this.$onAnimationStep, animationScope.getValue().floatValue() - this.$previousValue.element);
        this.$previousValue.element = animationScope.getValue().floatValue();
    }
}

package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SuspendAnimationKt$animateDecay$2 extends n0 implements l<AnimationScope<Float, AnimationVector1D>, r2> {
    final /* synthetic */ p<Float, Float, r2> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animateDecay$2(p<? super Float, ? super Float, r2> pVar) {
        super(1);
        this.$block = pVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AnimationScope<Float, AnimationVector1D> animationScope) {
        this.$block.invoke(animationScope.getValue(), Float.valueOf(animationScope.getVelocityVector().getValue()));
    }
}

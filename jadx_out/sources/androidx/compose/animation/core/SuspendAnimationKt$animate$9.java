package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$9 extends n0 implements l<Long, r2> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ l<AnimationScope<T, V>, r2> $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ k1.h<AnimationScope<T, V>> $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$9(k1.h<AnimationScope<T, V>> hVar, float f5, Animation<T, V> animation, AnimationState<T, V> animationState, l<? super AnimationScope<T, V>, r2> lVar) {
        super(1);
        this.$lateInitScope = hVar;
        this.$durationScale = f5;
        this.$animation = animation;
        this.$this_animate = animationState;
        this.$block = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke(l5.longValue());
        return r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(long j5) {
        T t5 = this.$lateInitScope.element;
        l0.m(t5);
        SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope) t5, j5, this.$durationScale, this.$animation, this.$this_animate, this.$block);
    }
}

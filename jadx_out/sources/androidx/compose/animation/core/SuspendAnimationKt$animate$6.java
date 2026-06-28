package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Incorrect field signature: TV; */
@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "it", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$6 extends n0 implements l<Long, r2> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ l<AnimationScope<T, V>, r2> $block;
    final /* synthetic */ float $durationScale;
    final /* synthetic */ T $initialValue;
    final /* synthetic */ AnimationVector $initialVelocityVector;
    final /* synthetic */ k1.h<AnimationScope<T, V>> $lateInitScope;
    final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.a<r2> {
        final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnimationState<T, V> animationState) {
            super(0);
            this.$this_animate = animationState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_animate.setRunning$animation_core_release(false);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/k1$h<Landroidx/compose/animation/core/AnimationScope<TT;TV;>;>;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;FLv3/l<-Landroidx/compose/animation/core/AnimationScope<TT;TV;>;Lkotlin/r2;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$6(k1.h hVar, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f5, l lVar) {
        super(1);
        this.$lateInitScope = hVar;
        this.$initialValue = obj;
        this.$animation = animation;
        this.$initialVelocityVector = animationVector;
        this.$this_animate = animationState;
        this.$durationScale = f5;
        this.$block = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
        invoke(l5.longValue());
        return r2.f19517a;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    public final void invoke(long j5) {
        k1.h<AnimationScope<T, V>> hVar = this.$lateInitScope;
        ?? animationScope = new AnimationScope(this.$initialValue, this.$animation.getTypeConverter(), this.$initialVelocityVector, j5, this.$animation.getTargetValue(), j5, true, new AnonymousClass1(this.$this_animate));
        SuspendAnimationKt.doAnimationFrameWithScale(animationScope, j5, this.$durationScale, this.$animation, this.$this_animate, this.$block);
        hVar.element = animationScope;
    }
}

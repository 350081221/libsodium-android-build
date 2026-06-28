package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T, V] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Animatable$runAnimation$2<T, V> extends o implements l<kotlin.coroutines.d<? super AnimationResult<T, V>>, Object> {
    final /* synthetic */ Animation<T, V> $animation;
    final /* synthetic */ l<Animatable<T, V>, r2> $block;
    final /* synthetic */ T $initialVelocity;
    final /* synthetic */ long $startTime;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Animatable<T, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.core.Animatable$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<AnimationScope<T, V>, r2> {
        final /* synthetic */ l<Animatable<T, V>, r2> $block;
        final /* synthetic */ k1.a $clampingNeeded;
        final /* synthetic */ AnimationState<T, V> $endState;
        final /* synthetic */ Animatable<T, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Animatable<T, V> animatable, AnimationState<T, V> animationState, l<? super Animatable<T, V>, r2> lVar, k1.a aVar) {
            super(1);
            this.this$0 = animatable;
            this.$endState = animationState;
            this.$block = lVar;
            this.$clampingNeeded = aVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
            invoke((AnimationScope) obj);
            return r2.f19517a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(@p4.l AnimationScope<T, V> animationScope) {
            Object clampToBounds;
            SuspendAnimationKt.updateState(animationScope, this.this$0.getInternalState$animation_core_release());
            clampToBounds = this.this$0.clampToBounds(animationScope.getValue());
            if (!l0.g(clampToBounds, animationScope.getValue())) {
                this.this$0.getInternalState$animation_core_release().setValue$animation_core_release(clampToBounds);
                this.$endState.setValue$animation_core_release(clampToBounds);
                l<Animatable<T, V>, r2> lVar = this.$block;
                if (lVar != null) {
                    lVar.invoke(this.this$0);
                }
                animationScope.cancelAnimation();
                this.$clampingNeeded.element = true;
                return;
            }
            l<Animatable<T, V>, r2> lVar2 = this.$block;
            if (lVar2 != null) {
                lVar2.invoke(this.this$0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(Animatable<T, V> animatable, T t5, Animation<T, V> animation, long j5, l<? super Animatable<T, V>, r2> lVar, kotlin.coroutines.d<? super Animatable$runAnimation$2> dVar) {
        super(1, dVar);
        this.this$0 = animatable;
        this.$initialVelocity = t5;
        this.$animation = animation;
        this.$startTime = j5;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, dVar);
    }

    @Override // v3.l
    @m
    public final Object invoke(@m kotlin.coroutines.d<? super AnimationResult<T, V>> dVar) {
        return ((Animatable$runAnimation$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        AnimationState animationState;
        k1.a aVar;
        AnimationEndReason animationEndReason;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    aVar = (k1.a) this.L$1;
                    animationState = (AnimationState) this.L$0;
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                this.this$0.getInternalState$animation_core_release().setVelocityVector$animation_core_release((AnimationVector) this.this$0.getTypeConverter().getConvertToVector().invoke(this.$initialVelocity));
                this.this$0.setTargetValue(this.$animation.getTargetValue());
                this.this$0.setRunning(true);
                AnimationState copy$default = AnimationStateKt.copy$default((AnimationState) this.this$0.getInternalState$animation_core_release(), (Object) null, (AnimationVector) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                k1.a aVar2 = new k1.a();
                Animation<T, V> animation = this.$animation;
                long j5 = this.$startTime;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, copy$default, this.$block, aVar2);
                this.L$0 = copy$default;
                this.L$1 = aVar2;
                this.label = 1;
                if (SuspendAnimationKt.animate(copy$default, animation, j5, anonymousClass1, this) == l5) {
                    return l5;
                }
                animationState = copy$default;
                aVar = aVar2;
            }
            if (aVar.element) {
                animationEndReason = AnimationEndReason.BoundReached;
            } else {
                animationEndReason = AnimationEndReason.Finished;
            }
            this.this$0.endAnimation();
            return new AnimationResult(animationState, animationEndReason);
        } catch (CancellationException e5) {
            this.this$0.endAnimation();
            throw e5;
        }
    }
}

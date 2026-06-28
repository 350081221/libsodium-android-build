package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

@f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {965}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DefaultFlingBehavior$performFling$2 extends o implements p<s0, d<? super Float>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<AnimationScope<Float, AnimationVector1D>, r2> {
        final /* synthetic */ k1.e $lastValue;
        final /* synthetic */ ScrollScope $this_performFling;
        final /* synthetic */ k1.e $velocityLeft;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k1.e eVar, ScrollScope scrollScope, k1.e eVar2, DefaultFlingBehavior defaultFlingBehavior) {
            super(1);
            this.$lastValue = eVar;
            this.$this_performFling = scrollScope;
            this.$velocityLeft = eVar2;
            this.this$0 = defaultFlingBehavior;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AnimationScope<Float, AnimationVector1D> animationScope) {
            float floatValue = animationScope.getValue().floatValue() - this.$lastValue.element;
            float scrollBy = this.$this_performFling.scrollBy(floatValue);
            this.$lastValue.element = animationScope.getValue().floatValue();
            this.$velocityLeft.element = animationScope.getVelocity().floatValue();
            if (Math.abs(floatValue - scrollBy) > 0.5f) {
                animationScope.cancelAnimation();
            }
            DefaultFlingBehavior defaultFlingBehavior = this.this$0;
            defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f5, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, d<? super DefaultFlingBehavior$performFling$2> dVar) {
        super(2, dVar);
        this.$initialVelocity = f5;
        this.this$0 = defaultFlingBehavior;
        this.$this_performFling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super Float> dVar) {
        return ((DefaultFlingBehavior$performFling$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        float f5;
        k1.e eVar;
        AnimationState animationState;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                animationState = (AnimationState) this.L$1;
                eVar = (k1.e) this.L$0;
                try {
                    e1.n(obj);
                } catch (CancellationException unused) {
                    eVar.element = ((Number) animationState.getVelocity()).floatValue();
                    f5 = eVar.element;
                    return b.e(f5);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                k1.e eVar2 = new k1.e();
                eVar2.element = this.$initialVelocity;
                k1.e eVar3 = new k1.e();
                AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                try {
                    DecayAnimationSpec<Float> flingDecay = this.this$0.getFlingDecay();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(eVar3, this.$this_performFling, eVar2, this.this$0);
                    this.L$0 = eVar2;
                    this.L$1 = AnimationState$default;
                    this.label = 1;
                    if (SuspendAnimationKt.animateDecay$default(AnimationState$default, flingDecay, false, anonymousClass1, this, 2, null) == l5) {
                        return l5;
                    }
                    eVar = eVar2;
                } catch (CancellationException unused2) {
                    eVar = eVar2;
                    animationState = AnimationState$default;
                    eVar.element = ((Number) animationState.getVelocity()).floatValue();
                    f5 = eVar.element;
                    return b.e(f5);
                }
            } else {
                f5 = this.$initialVelocity;
                return b.e(f5);
            }
        }
        f5 = eVar.element;
        return b.e(f5);
    }
}

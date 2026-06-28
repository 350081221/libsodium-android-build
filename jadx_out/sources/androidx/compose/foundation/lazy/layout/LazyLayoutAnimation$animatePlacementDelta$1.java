package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", f = "LazyLayoutAnimation.kt", i = {0}, l = {127, 133}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n79#2:208\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1\n*L\n132#1:208\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$animatePlacementDelta$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayoutAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n79#2:208\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimation.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimation$animatePlacementDelta$1$1\n*L\n135#1:208\n*E\n"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Animatable<IntOffset, AnimationVector2D>, r2> {
        final /* synthetic */ long $animationTarget;
        final /* synthetic */ LazyLayoutAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutAnimation lazyLayoutAnimation, long j5) {
            super(1);
            this.this$0 = lazyLayoutAnimation;
            this.$animationTarget = j5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Animatable<IntOffset, AnimationVector2D> animatable) {
            invoke2(animatable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Animatable<IntOffset, AnimationVector2D> animatable) {
            LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
            long m6181unboximpl = animatable.getValue().m6181unboximpl();
            long j5 = this.$animationTarget;
            lazyLayoutAnimation.m700setPlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6181unboximpl) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(m6181unboximpl) - IntOffset.m6173getYimpl(j5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$animatePlacementDelta$1(LazyLayoutAnimation lazyLayoutAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j5, d<? super LazyLayoutAnimation$animatePlacementDelta$1> dVar) {
        super(2, dVar);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new LazyLayoutAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
        return ((LazyLayoutAnimation$animatePlacementDelta$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Animatable animatable;
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Animatable animatable2;
        Animatable animatable3;
        Animatable animatable4;
        Animatable animatable5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    this.this$0.setPlacementAnimationInProgress(false);
                    return r2.f19517a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            finiteAnimationSpec2 = (FiniteAnimationSpec) this.L$0;
            e1.n(obj);
        } else {
            e1.n(obj);
            animatable = this.this$0.placementDeltaAnimation;
            if (animatable.isRunning()) {
                FiniteAnimationSpec<IntOffset> finiteAnimationSpec3 = this.$spec;
                if (finiteAnimationSpec3 instanceof SpringSpec) {
                    finiteAnimationSpec = (SpringSpec) finiteAnimationSpec3;
                } else {
                    finiteAnimationSpec = LazyLayoutAnimationKt.InterruptionSpec;
                }
            } else {
                finiteAnimationSpec = this.$spec;
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                IntOffset m6163boximpl = IntOffset.m6163boximpl(this.$totalDelta);
                this.L$0 = finiteAnimationSpec2;
                this.label = 1;
                if (animatable3.snapTo(m6163boximpl, this) == l5) {
                    return l5;
                }
            }
        }
        FiniteAnimationSpec finiteAnimationSpec4 = finiteAnimationSpec2;
        animatable4 = this.this$0.placementDeltaAnimation;
        long m6181unboximpl = ((IntOffset) animatable4.getValue()).m6181unboximpl();
        long j5 = this.$totalDelta;
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6181unboximpl) - IntOffset.m6172getXimpl(j5), IntOffset.m6173getYimpl(m6181unboximpl) - IntOffset.m6173getYimpl(j5));
        animatable5 = this.this$0.placementDeltaAnimation;
        IntOffset m6163boximpl2 = IntOffset.m6163boximpl(IntOffset);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, IntOffset);
        this.L$0 = null;
        this.label = 2;
        if (Animatable.animateTo$default(animatable5, m6163boximpl2, finiteAnimationSpec4, null, anonymousClass1, this, 4, null) == l5) {
            return l5;
        }
        this.this$0.setPlacementAnimationInProgress(false);
        return r2.f19517a;
    }
}

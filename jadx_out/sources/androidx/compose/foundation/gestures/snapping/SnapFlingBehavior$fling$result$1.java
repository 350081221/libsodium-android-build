package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {174, 187}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n+ 2 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehaviorKt\n*L\n1#1,538:1\n534#2,4:539\n*S KotlinDebug\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/SnapFlingBehavior$fling$result$1\n*L\n185#1:539,4\n*E\n"})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends o implements p<s0, d<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ l<Float, r2> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Lkotlin/r2;", "invoke", "(F)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<Float, r2> {
        final /* synthetic */ l<Float, r2> $onRemainingScrollOffsetUpdate;
        final /* synthetic */ k1.e $remainingScrollOffset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(k1.e eVar, l<? super Float, r2> lVar) {
            super(1);
            this.$remainingScrollOffset = eVar;
            this.$onRemainingScrollOffsetUpdate = lVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Float f5) {
            invoke(f5.floatValue());
            return r2.f19517a;
        }

        public final void invoke(float f5) {
            k1.e eVar = this.$remainingScrollOffset;
            float f6 = eVar.element - f5;
            eVar.element = f6;
            this.$onRemainingScrollOffsetUpdate.invoke(Float.valueOf(f6));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1(SnapFlingBehavior snapFlingBehavior, float f5, l<? super Float, r2> lVar, ScrollScope scrollScope, d<? super SnapFlingBehavior$fling$result$1> dVar) {
        super(2, dVar);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f5;
        this.$onRemainingScrollOffsetUpdate = lVar;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        return ((SnapFlingBehavior$fling$result$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        SnapLayoutInfoProvider snapLayoutInfoProvider;
        k1.e eVar;
        SnapLayoutInfoProvider snapLayoutInfoProvider2;
        AnimationSpec animationSpec;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (k1.e) this.L$0;
            e1.n(obj);
        } else {
            e1.n(obj);
            snapLayoutInfoProvider = this.this$0.snapLayoutInfoProvider;
            float abs = Math.abs(snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity)) * Math.signum(this.$initialVelocity);
            eVar = new k1.e();
            eVar.element = abs;
            this.$onRemainingScrollOffsetUpdate.invoke(b.e(abs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f5 = eVar.element;
            float f6 = this.$initialVelocity;
            SnapFlingBehavior$fling$result$1$animationState$1 snapFlingBehavior$fling$result$1$animationState$1 = new SnapFlingBehavior$fling$result$1$animationState$1(eVar, this.$onRemainingScrollOffsetUpdate);
            this.L$0 = eVar;
            this.label = 1;
            obj = snapFlingBehavior.tryApproach(scrollScope, f5, f6, snapFlingBehavior$fling$result$1$animationState$1, this);
            if (obj == l5) {
                return l5;
            }
        }
        AnimationState animationState = (AnimationState) obj;
        snapLayoutInfoProvider2 = this.this$0.snapLayoutInfoProvider;
        float calculateSnappingOffset = snapLayoutInfoProvider2.calculateSnappingOffset(((Number) animationState.getVelocity()).floatValue());
        eVar.element = calculateSnappingOffset;
        ScrollScope scrollScope2 = this.$this_fling;
        AnimationState copy$default = AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        animationSpec = this.this$0.snapAnimationSpec;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar, this.$onRemainingScrollOffsetUpdate);
        this.L$0 = null;
        this.label = 2;
        obj = SnapFlingBehaviorKt.animateWithTarget(scrollScope2, calculateSnappingOffset, calculateSnappingOffset, copy$default, animationSpec, anonymousClass2, this);
        if (obj == l5) {
            return l5;
        }
        return obj;
    }
}

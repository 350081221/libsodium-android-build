package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {}, l = {97, 99}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/material3/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super AnimationResult<Float, AnimationVector1D>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(float f5, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, kotlin.coroutines.d<? super SnapFlingBehavior$fling$result$1> dVar) {
        super(2, dVar);
        this.$initialVelocity = f5;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super AnimationResult<Float, AnimationVector1D>> dVar) {
        return ((SnapFlingBehavior$fling$result$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        float f5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    e1.n(obj);
                    return (AnimationResult) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
            return (AnimationResult) obj;
        }
        e1.n(obj);
        float abs = Math.abs(this.$initialVelocity);
        f5 = this.this$0.velocityThreshold;
        if (abs <= Math.abs(f5)) {
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f6 = this.$initialVelocity;
            this.label = 1;
            obj = snapFlingBehavior.shortSnap(scrollScope, f6, this);
            if (obj == l5) {
                return l5;
            }
            return (AnimationResult) obj;
        }
        SnapFlingBehavior snapFlingBehavior2 = this.this$0;
        ScrollScope scrollScope2 = this.$this_fling;
        float f7 = this.$initialVelocity;
        this.label = 2;
        obj = snapFlingBehavior2.longSnap(scrollScope2, f7, this);
        if (obj == l5) {
            return l5;
        }
        return (AnimationResult) obj;
    }
}

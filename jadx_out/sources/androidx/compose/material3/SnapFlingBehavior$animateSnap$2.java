package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.internal.k1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapFlingBehavior$animateSnap$2 extends kotlin.jvm.internal.n0 implements v3.l<AnimationScope<Float, AnimationVector1D>, r2> {
    final /* synthetic */ float $cancelOffset;
    final /* synthetic */ k1.e $consumedUpToNow;
    final /* synthetic */ ScrollScope $this_animateSnap;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$animateSnap$2(SnapFlingBehavior snapFlingBehavior, float f5, k1.e eVar, ScrollScope scrollScope) {
        super(1);
        this.this$0 = snapFlingBehavior;
        this.$cancelOffset = f5;
        this.$consumedUpToNow = eVar;
        this.$this_animateSnap = scrollScope;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return r2.f19517a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if ((r0 == r5.getValue().floatValue()) == false) goto L9;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(@p4.l androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5) {
        /*
            r4 = this;
            androidx.compose.material3.SnapFlingBehavior r0 = r4.this$0
            java.lang.Object r1 = r5.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r2 = r4.$cancelOffset
            float r0 = androidx.compose.material3.SnapFlingBehavior.access$coerceToTarget(r0, r1, r2)
            kotlin.jvm.internal.k1$e r1 = r4.$consumedUpToNow
            float r1 = r1.element
            float r1 = r0 - r1
            androidx.compose.foundation.gestures.ScrollScope r2 = r4.$this_animateSnap
            float r2 = r2.scrollBy(r1)
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3c
            java.lang.Object r1 = r5.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 != 0) goto L3f
        L3c:
            r5.cancelAnimation()
        L3f:
            kotlin.jvm.internal.k1$e r5 = r4.$consumedUpToNow
            float r0 = r5.element
            float r0 = r0 + r2
            r5.element = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnapFlingBehavior$animateSnap$2.invoke2(androidx.compose.animation.core.AnimationScope):void");
    }
}

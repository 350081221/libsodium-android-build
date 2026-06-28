package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.jvm.internal.k1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBar$2 extends kotlin.jvm.internal.n0 implements v3.l<AnimationScope<Float, AnimationVector1D>, r2> {
    final /* synthetic */ k1.e $lastValue;
    final /* synthetic */ k1.e $remainingVelocity;
    final /* synthetic */ TopAppBarState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$settleAppBar$2(k1.e eVar, TopAppBarState topAppBarState, k1.e eVar2) {
        super(1);
        this.$lastValue = eVar;
        this.$state = topAppBarState;
        this.$remainingVelocity = eVar2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
        invoke2(animationScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l AnimationScope<Float, AnimationVector1D> animationScope) {
        float floatValue = animationScope.getValue().floatValue() - this.$lastValue.element;
        float heightOffset = this.$state.getHeightOffset();
        this.$state.setHeightOffset(heightOffset + floatValue);
        float abs = Math.abs(heightOffset - this.$state.getHeightOffset());
        this.$lastValue.element = animationScope.getValue().floatValue();
        this.$remainingVelocity.element = animationScope.getVelocity().floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }
}

package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T, V] */
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SuspendAnimationKt$animate$3<T, V> extends n0 implements l<AnimationScope<T, V>, r2> {
    final /* synthetic */ p<T, T, r2> $block;
    final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$3(p<? super T, ? super T, r2> pVar, TwoWayConverter<T, V> twoWayConverter) {
        super(1);
        this.$block = pVar;
        this.$typeConverter = twoWayConverter;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Object obj) {
        invoke((AnimationScope) obj);
        return r2.f19517a;
    }

    public final void invoke(@p4.l AnimationScope<T, V> animationScope) {
        this.$block.invoke(animationScope.getValue(), this.$typeConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
    }
}

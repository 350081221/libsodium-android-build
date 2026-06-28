package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SeekableTransitionState$animateToCurrentState$2 extends n0 implements l<Animatable<Float, AnimationVector1D>, r2> {
    final /* synthetic */ SeekableTransitionState<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateToCurrentState$2(SeekableTransitionState<S> seekableTransitionState) {
        super(1);
        this.this$0 = seekableTransitionState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Animatable<Float, AnimationVector1D> animatable) {
        invoke2(animatable);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Animatable<Float, AnimationVector1D> animatable) {
        this.this$0.seekToFraction();
    }
}

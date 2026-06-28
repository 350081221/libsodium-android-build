package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SeekableTransitionState$seekToFraction$2 extends n0 implements v3.a<r2> {
    final /* synthetic */ k1.g $duration;
    final /* synthetic */ Transition<S> $transition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekToFraction$2(k1.g gVar, Transition<S> transition) {
        super(0);
        this.$duration = gVar;
        this.$transition = transition;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$duration.element = this.$transition.getTotalDurationNanos();
    }
}

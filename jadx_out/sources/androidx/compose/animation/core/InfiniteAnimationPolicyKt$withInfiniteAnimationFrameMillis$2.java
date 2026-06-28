package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [R] */
@i0(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nInfiniteAnimationPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteAnimationPolicy.kt\nandroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2\n*L\n1#1,42:1\n*E\n"})
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2<R> extends n0 implements l<Long, R> {
    final /* synthetic */ l<Long, R> $onFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(l<? super Long, ? extends R> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    public final R invoke(long j5) {
        return this.$onFrame.invoke(Long.valueOf(j5 / AnimationKt.MillisToNanos));
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Long l5) {
        return invoke(l5.longValue());
    }
}

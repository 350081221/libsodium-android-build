package androidx.compose.animation.core;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [R] */
@i0(d1 = {"\u0000\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke", "(J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SuspendAnimationKt$callWithFrameNanos$2<R> extends n0 implements l<Long, R> {
    final /* synthetic */ l<Long, R> $onFrame;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$callWithFrameNanos$2(l<? super Long, ? extends R> lVar) {
        super(1);
        this.$onFrame = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Long l5) {
        return invoke(l5.longValue());
    }

    public final R invoke(long j5) {
        return this.$onFrame.invoke(Long.valueOf(j5 / 1));
    }
}

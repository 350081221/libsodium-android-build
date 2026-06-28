package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicy;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0086H¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withInfiniteAnimationFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "frameTimeMillis", "withInfiniteAnimationFrameMillis", "animation-core_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    @m
    public static final <R> Object withInfiniteAnimationFrameMillis(@l v3.l<? super Long, ? extends R> lVar, @l kotlin.coroutines.d<? super R> dVar) {
        return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar), dVar);
    }

    private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(v3.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super R> dVar) {
        InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 = new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(lVar);
        kotlin.jvm.internal.i0.e(0);
        Object withInfiniteAnimationFrameNanos = withInfiniteAnimationFrameNanos(infiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2, dVar);
        kotlin.jvm.internal.i0.e(1);
        return withInfiniteAnimationFrameNanos;
    }

    @m
    public static final <R> Object withInfiniteAnimationFrameNanos(@l v3.l<? super Long, ? extends R> lVar, @l kotlin.coroutines.d<? super R> dVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) dVar.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(lVar, dVar);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), dVar);
    }
}

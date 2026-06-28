package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;

@kotlin.i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withInfiniteAnimationFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InfiniteAnimationPolicyKt {
    @p4.m
    public static final <R> Object withInfiniteAnimationFrameNanos(@p4.l v3.l<? super Long, ? extends R> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        InfiniteAnimationPolicy infiniteAnimationPolicy = (InfiniteAnimationPolicy) dVar.getContext().get(InfiniteAnimationPolicy.Key);
        if (infiniteAnimationPolicy == null) {
            return MonotonicFrameClockKt.withFrameNanos(lVar, dVar);
        }
        return infiniteAnimationPolicy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(lVar, null), dVar);
    }
}

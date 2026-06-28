package androidx.compose.ui.platform;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.r2;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"R", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2<R> extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super R>, Object> {
    final /* synthetic */ v3.l<Long, R> $onFrame;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(v3.l<? super Long, ? extends R> lVar, kotlin.coroutines.d<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> dVar) {
        super(1, dVar);
        this.$onFrame = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, dVar);
    }

    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.m kotlin.coroutines.d<? super R> dVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                kotlin.e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.e1.n(obj);
            v3.l<Long, R> lVar = this.$onFrame;
            this.label = 1;
            obj = MonotonicFrameClockKt.withFrameNanos(lVar, this);
            if (obj == l5) {
                return l5;
            }
        }
        return obj;
    }
}

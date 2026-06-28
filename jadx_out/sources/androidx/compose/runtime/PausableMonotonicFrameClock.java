package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.g;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J9\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/r2;", "pause", "resume", "R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroidx/compose/runtime/Latch;", "latch", "Landroidx/compose/runtime/Latch;", "", "isPaused", "()Z", "<init>", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @l
    private final MonotonicFrameClock frameClock;

    @l
    private final Latch latch = new Latch();

    public PausableMonotonicFrameClock(@l MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @l p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    public <E extends g.b> E get(@l g.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[PHI: r7
      0x0063: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0060, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object withFrameNanos(@p4.l v3.l<? super java.lang.Long, ? extends R> r6, @p4.l kotlin.coroutines.d<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e1.n(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            v3.l r6 = (v3.l) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r2 = (androidx.compose.runtime.PausableMonotonicFrameClock) r2
            kotlin.e1.n(r7)
            goto L53
        L40:
            kotlin.e1.n(r7)
            androidx.compose.runtime.Latch r7 = r5.latch
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            androidx.compose.runtime.MonotonicFrameClock r7 = r2.frameClock
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.withFrameNanos(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos(v3.l, kotlin.coroutines.d):java.lang.Object");
    }
}

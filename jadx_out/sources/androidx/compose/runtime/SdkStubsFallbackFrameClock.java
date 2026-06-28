package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k1;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SdkStubsFallbackFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "DefaultFrameDelay", "J", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;

    @l
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
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

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    public g minusKey(@l g.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @l
    public g plus(@l g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @m
    public <R> Object withFrameNanos(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        return i.h(k1.e(), new SdkStubsFallbackFrameClock$withFrameNanos$2(lVar, null), dVar);
    }
}

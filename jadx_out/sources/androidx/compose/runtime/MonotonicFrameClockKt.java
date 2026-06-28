package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012#\b\u0004\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\b\u0010\f\"\u001e\u0010\u0012\u001a\u00020\u0001*\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"R", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeMillis", "onFrame", "withFrameMillis", "(Landroidx/compose/runtime/MonotonicFrameClock;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "frameTimeNanos", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getMonotonicFrameClock", "(Lkotlin/coroutines/g;)Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/g;)V", "monotonicFrameClock", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
/* loaded from: classes.dex */
public final class MonotonicFrameClockKt {
    @l
    public static final MonotonicFrameClock getMonotonicFrameClock(@l g gVar) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getMonotonicFrameClock$annotations(g gVar) {
    }

    @m
    public static final <R> Object withFrameMillis(@l MonotonicFrameClock monotonicFrameClock, @l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        return monotonicFrameClock.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(lVar), dVar);
    }

    private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock, v3.l<? super Long, ? extends R> lVar, d<? super R> dVar) {
        MonotonicFrameClockKt$withFrameMillis$2 monotonicFrameClockKt$withFrameMillis$2 = new MonotonicFrameClockKt$withFrameMillis$2(lVar);
        kotlin.jvm.internal.i0.e(0);
        Object withFrameNanos = monotonicFrameClock.withFrameNanos(monotonicFrameClockKt$withFrameMillis$2, dVar);
        kotlin.jvm.internal.i0.e(1);
        return withFrameNanos;
    }

    @m
    public static final <R> Object withFrameNanos(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(lVar, dVar);
    }

    @m
    public static final <R> Object withFrameMillis(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        return getMonotonicFrameClock(dVar.getContext()).withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(lVar), dVar);
    }
}

package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/DefaultChoreographerFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "frameTimeNanos", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "choreographer", "Landroid/view/Choreographer;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nActualAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,126:1\n314#2,11:127\n*S KotlinDebug\n*F\n+ 1 ActualAndroid.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n64#1:127,11\n*E\n"})
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    @l
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) i.f(k1.e().C0(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
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
    public <R> Object withFrameNanos(@l final v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        d e5;
        Object l5;
        e5 = c.e(dVar);
        final q qVar = new q(e5, 1);
        qVar.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                Object m6444constructorimpl;
                d dVar2 = qVar;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                v3.l<Long, R> lVar2 = lVar;
                try {
                    d1.a aVar = d1.Companion;
                    m6444constructorimpl = d1.m6444constructorimpl(lVar2.invoke(Long.valueOf(j5)));
                } catch (Throwable th) {
                    d1.a aVar2 = d1.Companion;
                    m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
                }
                dVar2.resumeWith(m6444constructorimpl);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        qVar.g(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }
}

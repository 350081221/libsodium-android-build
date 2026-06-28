package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.g;
import kotlin.d1;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0012J*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,61:1\n314#2,11:62\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:62,11\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @p4.l
    private final Choreographer choreographer;

    @p4.m
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(@p4.l Choreographer choreographer, @p4.m AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R fold(R r5, @p4.l v3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r5, pVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.m
    public <E extends g.b> E get(@p4.l g.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @p4.l
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g minusKey(@p4.l g.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.g
    @p4.l
    public kotlin.coroutines.g plus(@p4.l kotlin.coroutines.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @p4.m
    public <R> Object withFrameNanos(@p4.l final v3.l<? super Long, ? extends R> lVar, @p4.l kotlin.coroutines.d<? super R> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            g.b bVar = dVar.getContext().get(kotlin.coroutines.e.S);
            if (bVar instanceof AndroidUiDispatcher) {
                androidUiDispatcher = (AndroidUiDispatcher) bVar;
            } else {
                androidUiDispatcher = null;
            }
        }
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(e5, 1);
        qVar.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                Object m6444constructorimpl;
                kotlin.coroutines.d dVar2 = qVar;
                v3.l<Long, R> lVar2 = lVar;
                try {
                    d1.a aVar = kotlin.d1.Companion;
                    m6444constructorimpl = kotlin.d1.m6444constructorimpl(lVar2.invoke(Long.valueOf(j5)));
                } catch (Throwable th) {
                    d1.a aVar2 = kotlin.d1.Companion;
                    m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
                }
                dVar2.resumeWith(m6444constructorimpl);
            }
        };
        if (androidUiDispatcher != null && kotlin.jvm.internal.l0.g(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            qVar.g(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            qVar.g(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return E;
    }

    public AndroidUiFrameClock(@p4.l Choreographer choreographer) {
        this(choreographer, null);
    }
}

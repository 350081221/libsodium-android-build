package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0019\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0011\u001a\u00020\u00042\f\b\u0002\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fR\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "", "cause", "Lkotlin/r2;", "fail", "", "timeNanos", "sendFrame", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "Lkotlin/Function0;", "onNewAwaiters", "Lv3/a;", "", "lock", "Ljava/lang/Object;", "failureCause", "Ljava/lang/Throwable;", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "awaiters", "Ljava/util/List;", "spareList", "", "getHasAwaiters", "()Z", "hasAwaiters", "<init>", "(Lv3/a;)V", "FrameAwaiter", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n82#2:133\n82#2:134\n82#2:144\n82#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @l
    private List<FrameAwaiter<?>> awaiters;

    @m
    private Throwable failureCause;

    @l
    private final Object lock;

    @m
    private final v3.a<r2> onNewAwaiters;

    @l
    private List<FrameAwaiter<?>> spareList;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "", "timeNanos", "Lkotlin/r2;", "resume", "Lkotlin/Function1;", "onFrame", "Lv3/l;", "getOnFrame", "()Lv3/l;", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "getContinuation", "()Lkotlin/coroutines/d;", "<init>", "(Lv3/l;Lkotlin/coroutines/d;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    /* loaded from: classes.dex */
    public static final class FrameAwaiter<R> {

        @l
        private final d<R> continuation;

        @l
        private final v3.l<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
            this.onFrame = lVar;
            this.continuation = dVar;
        }

        @l
        public final d<R> getContinuation() {
            return this.continuation;
        }

        @l
        public final v3.l<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j5) {
            Object m6444constructorimpl;
            d<R> dVar = this.continuation;
            try {
                d1.a aVar = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(this.onFrame.invoke(Long.valueOf(j5)));
            } catch (Throwable th) {
                d1.a aVar2 = d1.Companion;
                m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
            }
            dVar.resumeWith(m6444constructorimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BroadcastFrameClock(@m v3.a<r2> aVar) {
        this.onNewAwaiters = aVar;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                d<?> continuation = list.get(i5).getContinuation();
                d1.a aVar = d1.Companion;
                continuation.resumeWith(d1.m6444constructorimpl(e1.a(th)));
            }
            this.awaiters.clear();
            r2 r2Var = r2.f19517a;
        }
    }

    public final void cancel(@l CancellationException cancellationException) {
        fail(cancellationException);
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

    public final boolean getHasAwaiters() {
        boolean z4;
        synchronized (this.lock) {
            z4 = !this.awaiters.isEmpty();
        }
        return z4;
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

    public final void sendFrame(long j5) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                list.get(i5).resume(j5);
            }
            list.clear();
            r2 r2Var = r2.f19517a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$FrameAwaiter] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @m
    public <R> Object withFrameNanos(@l v3.l<? super Long, ? extends R> lVar, @l d<? super R> dVar) {
        d e5;
        boolean z4;
        FrameAwaiter frameAwaiter;
        Object l5;
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        k1.h hVar = new k1.h();
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
            } else {
                hVar.element = new FrameAwaiter(lVar, qVar);
                if (!this.awaiters.isEmpty()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                List list = this.awaiters;
                T t5 = hVar.element;
                if (t5 == 0) {
                    l0.S("awaiter");
                    frameAwaiter = null;
                } else {
                    frameAwaiter = (FrameAwaiter) t5;
                }
                list.add(frameAwaiter);
                boolean z5 = !z4;
                qVar.g(new BroadcastFrameClock$withFrameNanos$2$1(this, hVar));
                if (z5 && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            }
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        return E;
    }

    public /* synthetic */ BroadcastFrameClock(v3.a aVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : aVar);
    }
}

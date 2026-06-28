package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "R", "Lkotlin/Function0;", "block", "withClosed", "(Lv3/a;)Ljava/lang/Object;", "Lkotlin/r2;", "closeLatch", "openLatch", "await", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "", "Lkotlin/coroutines/d;", "awaiters", "Ljava/util/List;", "spareList", "", "_isOpen", "Z", "isOpen", "()Z", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n82#2:92\n82#2:93\n82#2:94\n82#2:104\n314#3,9:95\n323#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;

    @l
    private final Object lock = new Object();

    @l
    private List<d<r2>> awaiters = new ArrayList();

    @l
    private List<d<r2>> spareList = new ArrayList();
    private boolean _isOpen = true;

    @m
    public final Object await(@l d<? super r2> dVar) {
        d e5;
        Object l5;
        Object l6;
        if (isOpen()) {
            return r2.f19517a;
        }
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        synchronized (this.lock) {
            this.awaiters.add(qVar);
        }
        qVar.g(new Latch$await$2$2(this, qVar));
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2.f19517a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            r2 r2Var = r2.f19517a;
        }
    }

    public final boolean isOpen() {
        boolean z4;
        synchronized (this.lock) {
            z4 = this._isOpen;
        }
        return z4;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (isOpen()) {
                return;
            }
            List<d<r2>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this._isOpen = true;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                d<r2> dVar = list.get(i5);
                d1.a aVar = d1.Companion;
                dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
            list.clear();
            r2 r2Var = r2.f19517a;
        }
    }

    public final <R> R withClosed(@l v3.a<? extends R> aVar) {
        closeLatch();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            openLatch();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}

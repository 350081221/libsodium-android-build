package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.d1;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/core/util/ContinuationRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/r2;", "run", "", "toString", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    @l
    private final kotlin.coroutines.d<r2> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(@l kotlin.coroutines.d<? super r2> dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<r2> dVar = this.continuation;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(r2.f19517a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}

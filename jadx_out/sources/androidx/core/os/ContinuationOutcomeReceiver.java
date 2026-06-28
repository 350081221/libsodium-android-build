package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/core/os/ContinuationOutcomeReceiver;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "Lkotlin/r2;", "onResult", "(Ljava/lang/Object;)V", com.umeng.analytics.pro.d.U, "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(31)
/* loaded from: classes2.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {

    @l
    private final kotlin.coroutines.d<R> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(@l kotlin.coroutines.d<? super R> dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@l E e5) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.continuation;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(e1.a(e5)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r5) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<R> dVar = this.continuation;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(r5));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}

package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.d1;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/core/util/ContinuationConsumer;", "T", "Ljava/util/function/Consumer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", t0.b.f22420d, "Lkotlin/r2;", "accept", "(Ljava/lang/Object;)V", "", "toString", "Lkotlin/coroutines/d;", "continuation", "Lkotlin/coroutines/d;", "<init>", "(Lkotlin/coroutines/d;)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(24)
/* loaded from: classes2.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {

    @l
    private final kotlin.coroutines.d<T> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(@l kotlin.coroutines.d<? super T> dVar) {
        super(false);
        this.continuation = dVar;
    }

    @Override // java.util.function.Consumer
    public void accept(T t5) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.d<T> dVar = this.continuation;
            d1.a aVar = d1.Companion;
            dVar.resumeWith(d1.m6444constructorimpl(t5));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @l
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}

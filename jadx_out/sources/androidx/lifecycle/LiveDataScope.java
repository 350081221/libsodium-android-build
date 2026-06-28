package androidx.lifecycle;

import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.n1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "T", "", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/n1;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface LiveDataScope<T> {
    @m
    Object emit(T t5, @l kotlin.coroutines.d<? super r2> dVar);

    @m
    Object emitSource(@l LiveData<T> liveData, @l kotlin.coroutines.d<? super n1> dVar);

    @m
    T getLatestValue();
}

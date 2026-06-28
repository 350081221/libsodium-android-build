package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.n1;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\n\u0010\u000bR(\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/n1;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", TypedValues.AttributesType.S_TARGET, "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "Lkotlin/coroutines/g;", "coroutineContext", "Lkotlin/coroutines/g;", "getLatestValue", "()Ljava/lang/Object;", "latestValue", com.umeng.analytics.pro.d.X, "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/g;)V", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    @l
    private final kotlin.coroutines.g coroutineContext;

    @l
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(@l CoroutineLiveData<T> target, @l kotlin.coroutines.g context) {
        l0.p(target, "target");
        l0.p(context, "context");
        this.target = target;
        this.coroutineContext = context.plus(k1.e().E0());
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    @m
    public Object emit(T t5, @l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object h5 = kotlinx.coroutines.i.h(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t5, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return h5 == l5 ? h5 : r2.f19517a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    @m
    public Object emitSource(@l LiveData<T> liveData, @l kotlin.coroutines.d<? super n1> dVar) {
        return kotlinx.coroutines.i.h(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), dVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    @m
    public T getLatestValue() {
        return this.target.getValue();
    }

    @l
    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_release(@l CoroutineLiveData<T> coroutineLiveData) {
        l0.p(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }
}

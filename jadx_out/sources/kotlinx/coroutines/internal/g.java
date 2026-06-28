package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/g;", "Lkotlinx/coroutines/s0;", "", "toString", "Lkotlin/coroutines/g;", bi.ay, "Lkotlin/coroutines/g;", "getCoroutineContext", "()Lkotlin/coroutines/g;", "coroutineContext", com.umeng.analytics.pro.d.X, "<init>", "(Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class g implements kotlinx.coroutines.s0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f20355a;

    public g(@p4.l kotlin.coroutines.g gVar) {
        this.f20355a = gVar;
    }

    @Override // kotlinx.coroutines.s0
    @p4.l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.f20355a;
    }

    @p4.l
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}

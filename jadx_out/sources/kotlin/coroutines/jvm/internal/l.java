package kotlin.coroutines.jvm.internal;

import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "", "()V", com.umeng.analytics.pro.d.X, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/Result;", "getResult-xLWZpok", "()Lkotlin/Result;", "setResult", "(Lkotlin/Result;)V", "await", "resumeWith", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class l implements kotlin.coroutines.d<r2> {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private d1<r2> f19237a;

    public final void b() {
        synchronized (this) {
            while (true) {
                d1<r2> d1Var = this.f19237a;
                if (d1Var == null) {
                    l0.n(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    e1.n(d1Var.m6453unboximpl());
                }
            }
        }
    }

    @p4.m
    public final d1<r2> c() {
        return this.f19237a;
    }

    public final void f(@p4.m d1<r2> d1Var) {
        this.f19237a = d1Var;
    }

    @Override // kotlin.coroutines.d
    @p4.l
    public kotlin.coroutines.g getContext() {
        return kotlin.coroutines.i.INSTANCE;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@p4.l Object obj) {
        synchronized (this) {
            this.f19237a = d1.m6443boximpl(obj);
            l0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            r2 r2Var = r2.f19517a;
        }
    }
}

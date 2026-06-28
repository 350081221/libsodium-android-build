package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/g;", "T", "Lkotlinx/coroutines/a;", "", "state", "Lkotlin/r2;", "W", "x1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "d", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/r1;", "e", "Lkotlinx/coroutines/r1;", "eventLoop", "", "K0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/g;", "parentContext", "<init>", "(Lkotlin/coroutines/g;Ljava/lang/Thread;Lkotlinx/coroutines/r1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes4.dex */
public final class g<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final Thread f20288d;

    /* renamed from: e, reason: collision with root package name */
    @p4.m
    private final r1 f20289e;

    public g(@p4.l kotlin.coroutines.g gVar, @p4.l Thread thread, @p4.m r1 r1Var) {
        super(gVar, true, true);
        this.f20288d = thread;
        this.f20289e = r1Var;
    }

    @Override // kotlinx.coroutines.t2
    protected boolean K0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.t2
    public void W(@p4.m Object obj) {
        kotlin.r2 r2Var;
        if (!kotlin.jvm.internal.l0.g(Thread.currentThread(), this.f20288d)) {
            Thread thread = this.f20288d;
            b b5 = c.b();
            if (b5 != null) {
                b5.g(thread);
                r2Var = kotlin.r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var == null) {
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T x1() {
        long j5;
        kotlin.r2 r2Var;
        b b5 = c.b();
        if (b5 != null) {
            b5.d();
        }
        try {
            r1 r1Var = this.f20289e;
            d0 d0Var = null;
            if (r1Var != null) {
                r1.I0(r1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    r1 r1Var2 = this.f20289e;
                    if (r1Var2 != null) {
                        j5 = r1Var2.M0();
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (!d()) {
                        b b6 = c.b();
                        if (b6 != null) {
                            b6.c(this, j5);
                            r2Var = kotlin.r2.f19517a;
                        } else {
                            r2Var = null;
                        }
                        if (r2Var == null) {
                            LockSupport.parkNanos(this, j5);
                        }
                    } else {
                        T t5 = (T) u2.h(E0());
                        if (t5 instanceof d0) {
                            d0Var = (d0) t5;
                        }
                        if (d0Var == null) {
                            return t5;
                        }
                        throw d0Var.f19951a;
                    }
                } finally {
                    r1 r1Var3 = this.f20289e;
                    if (r1Var3 != null) {
                        r1.D0(r1Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            Z(interruptedException);
            throw interruptedException;
        } finally {
            b b7 = c.b();
            if (b7 != null) {
                b7.h();
            }
        }
    }
}

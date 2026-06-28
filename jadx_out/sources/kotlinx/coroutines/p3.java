package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/p3;", "", "Lkotlinx/coroutines/r1;", bi.ay, "()Lkotlinx/coroutines/r1;", "Lkotlin/r2;", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/r1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: classes4.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final p3 f20437a = new p3();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final ThreadLocal<r1> f20438b = kotlinx.coroutines.internal.c1.b(new kotlinx.coroutines.internal.t0("ThreadLocalEventLoop"));

    private p3() {
    }

    @p4.m
    public final r1 a() {
        return f20438b.get();
    }

    @p4.l
    public final r1 b() {
        ThreadLocal<r1> threadLocal = f20438b;
        r1 r1Var = threadLocal.get();
        if (r1Var != null) {
            return r1Var;
        }
        r1 a5 = u1.a();
        threadLocal.set(a5);
        return a5;
    }

    public final void c() {
        f20438b.set(null);
    }

    public final void d(@p4.l r1 r1Var) {
        f20438b.set(r1Var);
    }
}

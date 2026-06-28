package kotlinx.coroutines;

import com.umeng.analytics.pro.bi;
import java.util.concurrent.locks.LockSupport;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", bi.ay, "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "Lkotlin/r2;", socket.g.f22386a, bi.aJ, "e", "j", "", "blocker", "nanos", "d", "Ljava/lang/Thread;", "thread", "i", "Lkotlinx/coroutines/b;", "Lkotlinx/coroutines/b;", "b", "()Lkotlinx/coroutines/b;", "f", "(Lkotlinx/coroutines/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private static b f19861a;

    @kotlin.internal.f
    private static final long a() {
        b b5 = b();
        return b5 != null ? b5.a() : System.currentTimeMillis();
    }

    @p4.m
    public static final b b() {
        return f19861a;
    }

    @kotlin.internal.f
    private static final long c() {
        b b5 = b();
        return b5 != null ? b5.b() : System.nanoTime();
    }

    @kotlin.internal.f
    private static final void d(Object obj, long j5) {
        kotlin.r2 r2Var;
        b b5 = b();
        if (b5 != null) {
            b5.c(obj, j5);
            r2Var = kotlin.r2.f19517a;
        } else {
            r2Var = null;
        }
        if (r2Var == null) {
            LockSupport.parkNanos(obj, j5);
        }
    }

    @kotlin.internal.f
    private static final void e() {
        b b5 = b();
        if (b5 != null) {
            b5.d();
        }
    }

    public static final void f(@p4.m b bVar) {
        f19861a = bVar;
    }

    @kotlin.internal.f
    private static final void g() {
        b b5 = b();
        if (b5 != null) {
            b5.e();
        }
    }

    @kotlin.internal.f
    private static final void h() {
        b b5 = b();
        if (b5 != null) {
            b5.f();
        }
    }

    @kotlin.internal.f
    private static final void i(Thread thread) {
        kotlin.r2 r2Var;
        b b5 = b();
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

    @kotlin.internal.f
    private static final void j() {
        b b5 = b();
        if (b5 != null) {
            b5.h();
        }
    }

    @kotlin.internal.f
    private static final Runnable k(Runnable runnable) {
        Runnable i5;
        b b5 = b();
        return (b5 == null || (i5 = b5.i(runnable)) == null) ? runnable : i5;
    }
}

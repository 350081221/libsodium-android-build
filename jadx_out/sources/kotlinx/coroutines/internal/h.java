package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/o0;", "callback", "Lkotlin/r2;", bi.ay, "", "exception", "c", "", "Ljava/util/Collection;", "b", "()Ljava/util/Collection;", "platformExceptionHandlers", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final Collection<kotlinx.coroutines.o0> f20358a;

    static {
        kotlin.sequences.m e5;
        List c32;
        e5 = kotlin.sequences.s.e(ServiceLoader.load(kotlinx.coroutines.o0.class, kotlinx.coroutines.o0.class.getClassLoader()).iterator());
        c32 = kotlin.sequences.u.c3(e5);
        f20358a = c32;
    }

    public static final void a(@p4.l kotlinx.coroutines.o0 o0Var) {
        if (!f20358a.contains(o0Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader".toString());
        }
    }

    @p4.l
    public static final Collection<kotlinx.coroutines.o0> b() {
        return f20358a;
    }

    public static final void c(@p4.l Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}

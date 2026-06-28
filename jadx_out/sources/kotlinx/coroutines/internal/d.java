package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

@kotlin.i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\bH\u0080\b\u001a\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000\"\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012*\f\b\u0000\u0010\u0014\"\u00020\u00012\u00020\u0001¨\u0006\u0015"}, d2 = {"T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "d", "(Ljava/util/concurrent/locks/ReentrantLock;Lv3/a;)Ljava/lang/Object;", "E", "", "expectedSize", "", "b", "Ljava/util/concurrent/Executor;", "executor", "", "c", "Ljava/lang/reflect/Method;", bi.ay, "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private static final Method f20339a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f20339a = method;
    }

    public static /* synthetic */ void a() {
    }

    @p4.l
    public static final <E> Set<E> b(int i5) {
        return Collections.newSetFromMap(new IdentityHashMap(i5));
    }

    public static final boolean c(@p4.l Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor == null || (method = f20339a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T d(@p4.l ReentrantLock reentrantLock, @p4.l v3.a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.i0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}

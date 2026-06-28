package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.a.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static com.huawei.hmf.tasks.a.j f8107a = new com.huawei.hmf.tasks.a.j();

    public static Task<List<Task<?>>> a(Collection<? extends Task<?>> collection) {
        return com.huawei.hmf.tasks.a.j.b(collection);
    }

    public static Task<List<Task<?>>> b(Task<?>... taskArr) {
        return com.huawei.hmf.tasks.a.j.b(Arrays.asList(taskArr));
    }

    public static <TResult> TResult c(Task<TResult> task) throws ExecutionException, InterruptedException {
        com.huawei.hmf.tasks.a.j.e("await must not be called on the UI thread");
        if (task.u()) {
            return (TResult) com.huawei.hmf.tasks.a.j.d(task);
        }
        j.d dVar = new j.d();
        task.k(dVar).h(dVar);
        dVar.f8099a.await();
        return (TResult) com.huawei.hmf.tasks.a.j.d(task);
    }

    public static <TResult> TResult d(Task<TResult> task, long j5, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        com.huawei.hmf.tasks.a.j.e("await must not be called on the UI thread");
        if (!task.u()) {
            j.d dVar = new j.d();
            task.k(dVar).h(dVar);
            if (!dVar.f8099a.await(j5, timeUnit)) {
                throw new TimeoutException("Timed out waiting for Task");
            }
        }
        return (TResult) com.huawei.hmf.tasks.a.j.d(task);
    }

    public static <TResult> Task<TResult> e(Callable<TResult> callable) {
        return f8107a.c(l.b(), callable);
    }

    public static <TResult> Task<TResult> f(Callable<TResult> callable) {
        return f8107a.c(l.a(), callable);
    }

    public static <TResult> Task<TResult> g(Executor executor, Callable<TResult> callable) {
        return f8107a.c(executor, callable);
    }

    public static <TResult> Task<TResult> h() {
        com.huawei.hmf.tasks.a.i iVar = new com.huawei.hmf.tasks.a.i();
        iVar.B();
        return iVar;
    }

    public static <TResult> Task<TResult> i(Exception exc) {
        k kVar = new k();
        kVar.c(exc);
        return kVar.b();
    }

    public static <TResult> Task<TResult> j(TResult tresult) {
        return com.huawei.hmf.tasks.a.j.a(tresult);
    }

    public static Task<Void> k(Collection<? extends Task<?>> collection) {
        return com.huawei.hmf.tasks.a.j.g(collection);
    }

    public static Task<Void> l(Task<?>... taskArr) {
        return com.huawei.hmf.tasks.a.j.g(Arrays.asList(taskArr));
    }

    public static <TResult> Task<List<TResult>> m(Collection<? extends Task<TResult>> collection) {
        return com.huawei.hmf.tasks.a.j.f(collection);
    }

    public static <TResult> Task<List<TResult>> n(Task<?>... taskArr) {
        return com.huawei.hmf.tasks.a.j.f(Arrays.asList(taskArr));
    }
}

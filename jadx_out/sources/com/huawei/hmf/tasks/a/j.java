package com.huawei.hmf.tasks.a;

import android.os.Looper;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.k;
import com.huawei.hmf.tasks.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j {

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f8094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable f8095b;

        a(k kVar, Callable callable) {
            this.f8094a = kVar;
            this.f8095b = callable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f8094a.d(this.f8095b.call());
            } catch (Exception e5) {
                this.f8094a.c(e5);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class b implements com.huawei.hmf.tasks.d<Void, List<Task<?>>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f8097a;

        b(Collection collection) {
            this.f8097a = collection;
        }

        @Override // com.huawei.hmf.tasks.d
        public final /* synthetic */ List<Task<?>> a(Task<Void> task) throws Exception {
            ArrayList arrayList = new ArrayList(this.f8097a.size());
            arrayList.addAll(this.f8097a);
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [TResult] */
    /* loaded from: classes3.dex */
    static class c<TResult> implements com.huawei.hmf.tasks.d<Void, List<TResult>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f8098a;

        c(Collection collection) {
            this.f8098a = collection;
        }

        @Override // com.huawei.hmf.tasks.d
        public final /* synthetic */ Object a(Task<Void> task) throws Exception {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f8098a.iterator();
            while (it.hasNext()) {
                arrayList.add(((Task) it.next()).r());
            }
            return arrayList;
        }
    }

    /* loaded from: classes3.dex */
    public static class d<TResult> implements com.huawei.hmf.tasks.f, com.huawei.hmf.tasks.h, com.huawei.hmf.tasks.i<TResult> {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f8099a = new CountDownLatch(1);

        @Override // com.huawei.hmf.tasks.f
        public final void a() {
            this.f8099a.countDown();
        }

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(Exception exc) {
            this.f8099a.countDown();
        }

        @Override // com.huawei.hmf.tasks.i
        public final void onSuccess(TResult tresult) {
            this.f8099a.countDown();
        }
    }

    public static <TResult> Task<TResult> a(TResult tresult) {
        k kVar = new k();
        kVar.d(tresult);
        return kVar.b();
    }

    public static Task<List<Task<?>>> b(Collection<? extends Task<?>> collection) {
        return g(collection).m(new b(collection));
    }

    public static <TResult> TResult d(Task<TResult> task) throws ExecutionException {
        if (task.v()) {
            return task.r();
        }
        throw new ExecutionException(task.q());
    }

    public static void e(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static <TResult> Task<List<TResult>> f(Collection<? extends Task<?>> collection) {
        return (Task<List<TResult>>) g(collection).m(new c(collection));
    }

    public static Task<Void> g(Collection<? extends Task<?>> collection) {
        if (collection.isEmpty()) {
            return a(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("task can not is null");
            }
        }
        i iVar = new i();
        e eVar = new e(collection.size(), iVar);
        for (Task<?> task : collection) {
            task.l(l.b(), eVar);
            task.i(l.b(), eVar);
            task.c(l.b(), eVar);
        }
        return iVar;
    }

    public final <TResult> Task<TResult> c(Executor executor, Callable<TResult> callable) {
        k kVar = new k();
        try {
            executor.execute(new a(kVar, callable));
        } catch (Exception e5) {
            kVar.c(e5);
        }
        return kVar.b();
    }
}

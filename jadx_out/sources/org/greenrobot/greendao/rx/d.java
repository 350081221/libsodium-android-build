package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

@m4.b
/* loaded from: classes4.dex */
public class d extends org.greenrobot.greendao.rx.a {

    /* renamed from: b, reason: collision with root package name */
    private final org.greenrobot.greendao.c f21501b;

    /* loaded from: classes4.dex */
    class a implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f21502a;

        a(Runnable runnable) {
            this.f21502a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            d.this.f21501b.runInTx(this.f21502a);
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    class b<T> implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f21504a;

        b(Callable callable) {
            this.f21504a = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return (T) d.this.f21501b.callInTx(this.f21504a);
        }
    }

    public d(org.greenrobot.greendao.c cVar) {
        this.f21501b = cVar;
    }

    @Override // org.greenrobot.greendao.rx.a
    @m4.b
    public /* bridge */ /* synthetic */ Scheduler a() {
        return super.a();
    }

    @m4.b
    public <T> Observable<T> e(Callable<T> callable) {
        return b(new b(callable));
    }

    @m4.b
    public org.greenrobot.greendao.c f() {
        return this.f21501b;
    }

    @m4.b
    public Observable<Void> g(Runnable runnable) {
        return b(new a(runnable));
    }

    public d(org.greenrobot.greendao.c cVar, Scheduler scheduler) {
        super(scheduler);
        this.f21501b = cVar;
    }
}

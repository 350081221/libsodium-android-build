package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

@m4.c
/* loaded from: classes4.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    protected final Scheduler f21452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f21452a = null;
    }

    @m4.b
    public Scheduler a() {
        return this.f21452a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <R> Observable<R> b(Callable<R> callable) {
        return c(e.a(callable));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <R> Observable<R> c(Observable<R> observable) {
        Scheduler scheduler = this.f21452a;
        if (scheduler != null) {
            return observable.subscribeOn(scheduler);
        }
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @m4.b
    public a(Scheduler scheduler) {
        this.f21452a = scheduler;
    }
}

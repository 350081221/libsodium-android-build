package org.greenrobot.greendao.rx;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.query.i;
import org.greenrobot.greendao.query.j;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;

@m4.b
/* loaded from: classes4.dex */
public class c<T> extends org.greenrobot.greendao.rx.a {

    /* renamed from: b, reason: collision with root package name */
    private final j<T> f21497b;

    /* loaded from: classes4.dex */
    class a implements Callable<List<T>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return c.this.f21497b.l().n();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Callable<T> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return c.this.f21497b.l().u();
        }
    }

    /* renamed from: org.greenrobot.greendao.rx.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0641c implements Observable.OnSubscribe<T> {
        C0641c() {
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Subscriber<? super T> subscriber) {
            try {
                i<T> q5 = c.this.f21497b.l().q();
                try {
                    Iterator<T> it = q5.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (subscriber.isUnsubscribed()) {
                            break;
                        } else {
                            subscriber.onNext(next);
                        }
                    }
                    q5.close();
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onCompleted();
                    }
                } catch (Throwable th) {
                    q5.close();
                    throw th;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                subscriber.onError(th2);
            }
        }
    }

    public c(j<T> jVar) {
        this.f21497b = jVar;
    }

    @Override // org.greenrobot.greendao.rx.a
    @m4.b
    public /* bridge */ /* synthetic */ Scheduler a() {
        return super.a();
    }

    @m4.b
    public Observable<List<T>> e() {
        return (Observable<List<T>>) b(new a());
    }

    public Observable<T> f() {
        return (Observable<T>) c(Observable.create(new C0641c()));
    }

    @m4.b
    public Observable<T> g() {
        return (Observable<T>) b(new b());
    }

    public c(j<T> jVar, Scheduler scheduler) {
        super(scheduler);
        this.f21497b = jVar;
    }
}

package org.greenrobot.greendao.rx;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.functions.Func0;

@m4.c
/* loaded from: classes4.dex */
class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes4.dex */
    class a<T> implements Func0<Observable<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callable f21506a;

        a(Callable callable) {
            this.f21506a = callable;
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Observable<T> a() {
            try {
                return Observable.just(this.f21506a.call());
            } catch (Exception e5) {
                return Observable.error(e5);
            }
        }
    }

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @m4.c
    public static <T> Observable<T> a(Callable<T> callable) {
        return Observable.defer(new a(callable));
    }
}

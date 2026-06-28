package io.reactivex.rxjava3.internal.operators.flowable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class u<T> extends io.reactivex.rxjava3.core.o<T> {

    /* renamed from: b, reason: collision with root package name */
    final org.reactivestreams.o<? extends T>[] f17067b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f17068c;

    /* loaded from: classes3.dex */
    static final class a<T> extends io.reactivex.rxjava3.internal.subscriptions.i implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final org.reactivestreams.p<? super T> downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final org.reactivestreams.o<? extends T>[] sources;
        final AtomicInteger wip;

        a(org.reactivestreams.o<? extends T>[] oVarArr, boolean z4, org.reactivestreams.p<? super T> pVar) {
            super(false);
            this.downstream = pVar;
            this.sources = oVarArr;
            this.delayError = z4;
            this.wip = new AtomicInteger();
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                org.reactivestreams.o<? extends T>[] oVarArr = this.sources;
                int length = oVarArr.length;
                int i5 = this.index;
                while (i5 != length) {
                    org.reactivestreams.o<? extends T> oVar = oVarArr[i5];
                    if (oVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.delayError) {
                            List list = this.errors;
                            if (list == null) {
                                list = new ArrayList((length - i5) + 1);
                                this.errors = list;
                            }
                            list.add(nullPointerException);
                            i5++;
                        } else {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j5 = this.produced;
                        if (j5 != 0) {
                            this.produced = 0L;
                            produced(j5);
                        }
                        oVar.subscribe(this);
                        i5++;
                        this.index = i5;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.downstream.onError(list2.get(0));
                        return;
                    } else {
                        this.downstream.onError(new io.reactivex.rxjava3.exceptions.a(list2));
                        return;
                    }
                }
                this.downstream.onComplete();
            }
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            if (this.delayError) {
                List list = this.errors;
                if (list == null) {
                    list = new ArrayList((this.sources.length - this.index) + 1);
                    this.errors = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.downstream.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
        public void onSubscribe(org.reactivestreams.q qVar) {
            setSubscription(qVar);
        }
    }

    public u(org.reactivestreams.o<? extends T>[] oVarArr, boolean z4) {
        this.f17067b = oVarArr;
        this.f17068c = z4;
    }

    @Override // io.reactivex.rxjava3.core.o
    protected void O6(org.reactivestreams.p<? super T> pVar) {
        a aVar = new a(this.f17067b, this.f17068c, pVar);
        pVar.onSubscribe(aVar);
        aVar.onComplete();
    }
}

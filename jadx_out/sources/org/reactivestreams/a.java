package org.reactivestreams;

import java.util.Objects;
import java.util.concurrent.Flow;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: org.reactivestreams.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class FlowPublisherC0655a<T> implements Flow.Publisher<T> {

        /* renamed from: a, reason: collision with root package name */
        final o<? extends T> f22086a;

        public FlowPublisherC0655a(o<? extends T> oVar) {
            this.f22086a = oVar;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f22086a.subscribe(subscriber == null ? null : new g(subscriber));
        }
    }

    /* loaded from: classes4.dex */
    static final class b<T, U> implements Flow.Processor<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final n<? super T, ? extends U> f22087a;

        public b(n<? super T, ? extends U> nVar) {
            this.f22087a = nVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f22087a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            this.f22087a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t5) {
            this.f22087a.onNext(t5);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f22087a.onSubscribe(subscription == null ? null : new h(subscription));
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
            this.f22087a.subscribe(subscriber == null ? null : new g(subscriber));
        }
    }

    /* loaded from: classes4.dex */
    static final class c<T> implements Flow.Subscriber<T> {

        /* renamed from: a, reason: collision with root package name */
        final p<? super T> f22088a;

        public c(p<? super T> pVar) {
            this.f22088a = pVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f22088a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th) {
            this.f22088a.onError(th);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t5) {
            this.f22088a.onNext(t5);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f22088a.onSubscribe(subscription == null ? null : new h(subscription));
        }
    }

    /* loaded from: classes4.dex */
    static final class d implements Flow.Subscription {

        /* renamed from: a, reason: collision with root package name */
        final q f22089a;

        public d(q qVar) {
            this.f22089a = qVar;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f22089a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j5) {
            this.f22089a.request(j5);
        }
    }

    /* loaded from: classes4.dex */
    static final class e<T> implements o<T> {

        /* renamed from: a, reason: collision with root package name */
        final Flow.Publisher<? extends T> f22090a;

        public e(Flow.Publisher<? extends T> publisher) {
            this.f22090a = publisher;
        }

        @Override // org.reactivestreams.o
        public void subscribe(p<? super T> pVar) {
            this.f22090a.subscribe(pVar == null ? null : new c(pVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class f<T, U> implements n<T, U> {

        /* renamed from: a, reason: collision with root package name */
        final Flow.Processor<? super T, ? extends U> f22091a;

        public f(Flow.Processor<? super T, ? extends U> processor) {
            this.f22091a = processor;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f22091a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f22091a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f22091a.onNext(t5);
        }

        @Override // org.reactivestreams.p
        public void onSubscribe(q qVar) {
            this.f22091a.onSubscribe(qVar == null ? null : new d(qVar));
        }

        @Override // org.reactivestreams.o
        public void subscribe(p<? super U> pVar) {
            this.f22091a.subscribe(pVar == null ? null : new c(pVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class g<T> implements p<T> {

        /* renamed from: a, reason: collision with root package name */
        final Flow.Subscriber<? super T> f22092a;

        public g(Flow.Subscriber<? super T> subscriber) {
            this.f22092a = subscriber;
        }

        @Override // org.reactivestreams.p
        public void onComplete() {
            this.f22092a.onComplete();
        }

        @Override // org.reactivestreams.p
        public void onError(Throwable th) {
            this.f22092a.onError(th);
        }

        @Override // org.reactivestreams.p
        public void onNext(T t5) {
            this.f22092a.onNext(t5);
        }

        @Override // org.reactivestreams.p
        public void onSubscribe(q qVar) {
            this.f22092a.onSubscribe(qVar == null ? null : new d(qVar));
        }
    }

    /* loaded from: classes4.dex */
    static final class h implements q {

        /* renamed from: a, reason: collision with root package name */
        final Flow.Subscription f22093a;

        public h(Flow.Subscription subscription) {
            this.f22093a = subscription;
        }

        @Override // org.reactivestreams.q
        public void cancel() {
            this.f22093a.cancel();
        }

        @Override // org.reactivestreams.q
        public void request(long j5) {
            this.f22093a.request(j5);
        }
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flow.Processor<T, U> a(n<? super T, ? extends U> nVar) {
        Objects.requireNonNull(nVar, "reactiveStreamsProcessor");
        if (nVar instanceof f) {
            return ((f) nVar).f22091a;
        }
        if (nVar instanceof Flow.Processor) {
            return (Flow.Processor) nVar;
        }
        return new b(nVar);
    }

    public static <T> Flow.Publisher<T> b(o<? extends T> oVar) {
        Objects.requireNonNull(oVar, "reactiveStreamsPublisher");
        if (oVar instanceof e) {
            return ((e) oVar).f22090a;
        }
        if (oVar instanceof Flow.Publisher) {
            return (Flow.Publisher) oVar;
        }
        return new FlowPublisherC0655a(oVar);
    }

    public static <T> Flow.Subscriber<T> c(p<T> pVar) {
        Objects.requireNonNull(pVar, "reactiveStreamsSubscriber");
        if (pVar instanceof g) {
            return ((g) pVar).f22092a;
        }
        if (pVar instanceof Flow.Subscriber) {
            return (Flow.Subscriber) pVar;
        }
        return new c(pVar);
    }

    public static <T, U> n<T, U> d(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof b) {
            return ((b) processor).f22087a;
        }
        if (processor instanceof n) {
            return (n) processor;
        }
        return new f(processor);
    }

    public static <T> o<T> e(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof FlowPublisherC0655a) {
            return ((FlowPublisherC0655a) publisher).f22086a;
        }
        if (publisher instanceof o) {
            return (o) publisher;
        }
        return new e(publisher);
    }

    public static <T> p<T> f(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof c) {
            return ((c) subscriber).f22088a;
        }
        if (subscriber instanceof p) {
            return (p) subscriber;
        }
        return new g(subscriber);
    }
}

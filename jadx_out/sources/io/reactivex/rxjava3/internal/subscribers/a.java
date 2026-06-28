package io.reactivex.rxjava3.internal.subscribers;

/* loaded from: classes3.dex */
public abstract class a<T, R> implements io.reactivex.rxjava3.internal.fuseable.c<T>, io.reactivex.rxjava3.internal.fuseable.n<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.rxjava3.internal.fuseable.c<? super R> f18631a;

    /* renamed from: b, reason: collision with root package name */
    protected org.reactivestreams.q f18632b;

    /* renamed from: c, reason: collision with root package name */
    protected io.reactivex.rxjava3.internal.fuseable.n<T> f18633c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f18634d;

    /* renamed from: e, reason: collision with root package name */
    protected int f18635e;

    public a(io.reactivex.rxjava3.internal.fuseable.c<? super R> cVar) {
        this.f18631a = cVar;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Throwable th) {
        io.reactivex.rxjava3.exceptions.b.b(th);
        this.f18632b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.q
    public void cancel() {
        this.f18632b.cancel();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        this.f18633c.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d(int i5) {
        io.reactivex.rxjava3.internal.fuseable.n<T> nVar = this.f18633c;
        if (nVar != null && (i5 & 4) == 0) {
            int requestFusion = nVar.requestFusion(i5);
            if (requestFusion != 0) {
                this.f18635e = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return this.f18633c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(R r5) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.p
    public void onComplete() {
        if (this.f18634d) {
            return;
        }
        this.f18634d = true;
        this.f18631a.onComplete();
    }

    @Override // org.reactivestreams.p
    public void onError(Throwable th) {
        if (this.f18634d) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        } else {
            this.f18634d = true;
            this.f18631a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.t, org.reactivestreams.p
    public final void onSubscribe(org.reactivestreams.q qVar) {
        if (io.reactivex.rxjava3.internal.subscriptions.j.validate(this.f18632b, qVar)) {
            this.f18632b = qVar;
            if (qVar instanceof io.reactivex.rxjava3.internal.fuseable.n) {
                this.f18633c = (io.reactivex.rxjava3.internal.fuseable.n) qVar;
            }
            if (b()) {
                this.f18631a.onSubscribe(this);
                a();
            }
        }
    }

    @Override // org.reactivestreams.q
    public void request(long j5) {
        this.f18632b.request(j5);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(R r5, R r6) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

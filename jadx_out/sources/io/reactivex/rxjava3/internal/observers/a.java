package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.p0;

/* loaded from: classes3.dex */
public abstract class a<T, R> implements p0<T>, io.reactivex.rxjava3.internal.fuseable.l<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final p0<? super R> f16408a;

    /* renamed from: b, reason: collision with root package name */
    protected io.reactivex.rxjava3.disposables.e f16409b;

    /* renamed from: c, reason: collision with root package name */
    protected io.reactivex.rxjava3.internal.fuseable.l<T> f16410c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f16411d;

    /* renamed from: e, reason: collision with root package name */
    protected int f16412e;

    public a(p0<? super R> p0Var) {
        this.f16408a = p0Var;
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(Throwable th) {
        io.reactivex.rxjava3.exceptions.b.b(th);
        this.f16409b.dispose();
        onError(th);
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public void clear() {
        this.f16410c.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d(int i5) {
        io.reactivex.rxjava3.internal.fuseable.l<T> lVar = this.f16410c;
        if (lVar != null && (i5 & 4) == 0) {
            int requestFusion = lVar.requestFusion(i5);
            if (requestFusion != 0) {
                this.f16412e = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public void dispose() {
        this.f16409b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public boolean isDisposed() {
        return this.f16409b.isDisposed();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public boolean isEmpty() {
        return this.f16410c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(R r5) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onComplete() {
        if (this.f16411d) {
            return;
        }
        this.f16411d = true;
        this.f16408a.onComplete();
    }

    @Override // io.reactivex.rxjava3.core.p0
    public void onError(Throwable th) {
        if (this.f16411d) {
            io.reactivex.rxjava3.plugins.a.Y(th);
        } else {
            this.f16411d = true;
            this.f16408a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.p0
    public final void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
        if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f16409b, eVar)) {
            this.f16409b = eVar;
            if (eVar instanceof io.reactivex.rxjava3.internal.fuseable.l) {
                this.f16410c = (io.reactivex.rxjava3.internal.fuseable.l) eVar;
            }
            if (b()) {
                this.f16408a.onSubscribe(this);
                a();
            }
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.q
    public final boolean offer(R r5, R r6) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

package io.reactivex.rxjava3.internal.operators.observable;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class m<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final int f17836b;

    /* renamed from: c, reason: collision with root package name */
    final int f17837c;

    /* renamed from: d, reason: collision with root package name */
    final m3.s<U> f17838d;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.rxjava3.core.p0<? super U> f17839a;

        /* renamed from: b, reason: collision with root package name */
        final int f17840b;

        /* renamed from: c, reason: collision with root package name */
        final m3.s<U> f17841c;

        /* renamed from: d, reason: collision with root package name */
        U f17842d;

        /* renamed from: e, reason: collision with root package name */
        int f17843e;

        /* renamed from: f, reason: collision with root package name */
        io.reactivex.rxjava3.disposables.e f17844f;

        a(io.reactivex.rxjava3.core.p0<? super U> p0Var, int i5, m3.s<U> sVar) {
            this.f17839a = p0Var;
            this.f17840b = i5;
            this.f17841c = sVar;
        }

        boolean a() {
            try {
                U u4 = this.f17841c.get();
                Objects.requireNonNull(u4, "Empty buffer supplied");
                this.f17842d = u4;
                return true;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.b.b(th);
                this.f17842d = null;
                io.reactivex.rxjava3.disposables.e eVar = this.f17844f;
                if (eVar == null) {
                    io.reactivex.rxjava3.internal.disposables.d.error(th, this.f17839a);
                    return false;
                }
                eVar.dispose();
                this.f17839a.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f17844f.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f17844f.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            U u4 = this.f17842d;
            if (u4 != null) {
                this.f17842d = null;
                if (!u4.isEmpty()) {
                    this.f17839a.onNext(u4);
                }
                this.f17839a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.f17842d = null;
            this.f17839a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            U u4 = this.f17842d;
            if (u4 != null) {
                u4.add(t5);
                int i5 = this.f17843e + 1;
                this.f17843e = i5;
                if (i5 >= this.f17840b) {
                    this.f17839a.onNext(u4);
                    this.f17843e = 0;
                    a();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.f17844f, eVar)) {
                this.f17844f = eVar;
                this.f17839a.onSubscribe(this);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements io.reactivex.rxjava3.core.p0<T>, io.reactivex.rxjava3.disposables.e {
        private static final long serialVersionUID = -8223395059921494546L;
        final m3.s<U> bufferSupplier;
        final ArrayDeque<U> buffers = new ArrayDeque<>();
        final int count;
        final io.reactivex.rxjava3.core.p0<? super U> downstream;
        long index;
        final int skip;
        io.reactivex.rxjava3.disposables.e upstream;

        b(io.reactivex.rxjava3.core.p0<? super U> p0Var, int i5, int i6, m3.s<U> sVar) {
            this.downstream = p0Var;
            this.count = i5;
            this.skip = i6;
            this.bufferSupplier = sVar;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onError(Throwable th) {
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onNext(T t5) {
            long j5 = this.index;
            this.index = 1 + j5;
            if (j5 % this.skip == 0) {
                try {
                    this.buffers.offer((Collection) io.reactivex.rxjava3.internal.util.k.d(this.bufferSupplier.get(), "The bufferSupplier returned a null Collection."));
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.b.b(th);
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t5);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.p0
        public void onSubscribe(io.reactivex.rxjava3.disposables.e eVar) {
            if (io.reactivex.rxjava3.internal.disposables.c.validate(this.upstream, eVar)) {
                this.upstream = eVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public m(io.reactivex.rxjava3.core.n0<T> n0Var, int i5, int i6, m3.s<U> sVar) {
        super(n0Var);
        this.f17836b = i5;
        this.f17837c = i6;
        this.f17838d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super U> p0Var) {
        int i5 = this.f17837c;
        int i6 = this.f17836b;
        if (i5 == i6) {
            a aVar = new a(p0Var, i6, this.f17838d);
            if (aVar.a()) {
                this.f17528a.subscribe(aVar);
                return;
            }
            return;
        }
        this.f17528a.subscribe(new b(p0Var, this.f17836b, this.f17837c, this.f17838d));
    }
}

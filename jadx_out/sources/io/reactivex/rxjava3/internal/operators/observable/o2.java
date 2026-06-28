package io.reactivex.rxjava3.internal.operators.observable;

/* loaded from: classes3.dex */
public final class o2 extends io.reactivex.rxjava3.core.i0<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final long f17919a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17920b;

    /* loaded from: classes3.dex */
    static final class a extends io.reactivex.rxjava3.internal.observers.b<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.rxjava3.core.p0<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        a(io.reactivex.rxjava3.core.p0<? super Long> p0Var, long j5, long j6) {
            this.downstream = p0Var;
            this.index = j5;
            this.end = j6;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.m
        public int requestFusion(int i5) {
            if ((i5 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        void run() {
            if (this.fused) {
                return;
            }
            io.reactivex.rxjava3.core.p0<? super Long> p0Var = this.downstream;
            long j5 = this.end;
            for (long j6 = this.index; j6 != j5 && get() == 0; j6++) {
                p0Var.onNext(Long.valueOf(j6));
            }
            if (get() == 0) {
                lazySet(1);
                p0Var.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.q
        @l3.g
        public Long poll() {
            long j5 = this.index;
            if (j5 != this.end) {
                this.index = 1 + j5;
                return Long.valueOf(j5);
            }
            lazySet(1);
            return null;
        }
    }

    public o2(long j5, long j6) {
        this.f17919a = j5;
        this.f17920b = j6;
    }

    @Override // io.reactivex.rxjava3.core.i0
    protected void l6(io.reactivex.rxjava3.core.p0<? super Long> p0Var) {
        long j5 = this.f17919a;
        a aVar = new a(p0Var, j5, j5 + this.f17920b);
        p0Var.onSubscribe(aVar);
        aVar.run();
    }
}

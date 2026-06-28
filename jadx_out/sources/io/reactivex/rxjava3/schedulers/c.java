package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.q0;
import io.reactivex.rxjava3.disposables.e;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import l3.f;

/* loaded from: classes3.dex */
public final class c extends q0 {

    /* renamed from: b, reason: collision with root package name */
    final Queue<b> f18846b = new PriorityBlockingQueue(11);

    /* renamed from: c, reason: collision with root package name */
    long f18847c;

    /* renamed from: d, reason: collision with root package name */
    volatile long f18848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a extends q0.c {

        /* renamed from: a, reason: collision with root package name */
        volatile boolean f18849a;

        /* renamed from: io.reactivex.rxjava3.schedulers.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0535a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f18851a;

            RunnableC0535a(b bVar) {
                this.f18851a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f18846b.remove(this.f18851a);
            }
        }

        a() {
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        public long a(@f TimeUnit timeUnit) {
            return c.this.d(timeUnit);
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @f
        public e b(@f Runnable runnable) {
            if (this.f18849a) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            c cVar = c.this;
            long j5 = cVar.f18847c;
            cVar.f18847c = 1 + j5;
            b bVar = new b(this, 0L, runnable, j5);
            c.this.f18846b.add(bVar);
            return e.m(new RunnableC0535a(bVar));
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @f
        public e c(@f Runnable runnable, long j5, @f TimeUnit timeUnit) {
            if (this.f18849a) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            long nanos = c.this.f18848d + timeUnit.toNanos(j5);
            c cVar = c.this;
            long j6 = cVar.f18847c;
            cVar.f18847c = 1 + j6;
            b bVar = new b(this, nanos, runnable, j6);
            c.this.f18846b.add(bVar);
            return e.m(new RunnableC0535a(bVar));
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18849a = true;
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18849a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final long f18853a;

        /* renamed from: b, reason: collision with root package name */
        final Runnable f18854b;

        /* renamed from: c, reason: collision with root package name */
        final a f18855c;

        /* renamed from: d, reason: collision with root package name */
        final long f18856d;

        b(a aVar, long j5, Runnable runnable, long j6) {
            this.f18853a = j5;
            this.f18854b = runnable;
            this.f18855c = aVar;
            this.f18856d = j6;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j5 = this.f18853a;
            long j6 = bVar.f18853a;
            if (j5 == j6) {
                return Long.compare(this.f18856d, bVar.f18856d);
            }
            return Long.compare(j5, j6);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f18853a), this.f18854b.toString());
        }
    }

    public c() {
    }

    private void w(long j5) {
        while (true) {
            b peek = this.f18846b.peek();
            if (peek == null) {
                break;
            }
            long j6 = peek.f18853a;
            if (j6 > j5) {
                break;
            }
            if (j6 == 0) {
                j6 = this.f18848d;
            }
            this.f18848d = j6;
            this.f18846b.remove(peek);
            if (!peek.f18855c.f18849a) {
                peek.f18854b.run();
            }
        }
        this.f18848d = j5;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @f
    public q0.c c() {
        return new a();
    }

    @Override // io.reactivex.rxjava3.core.q0
    public long d(@f TimeUnit timeUnit) {
        return timeUnit.convert(this.f18848d, TimeUnit.NANOSECONDS);
    }

    public void t(long j5, TimeUnit timeUnit) {
        u(this.f18848d + timeUnit.toNanos(j5), TimeUnit.NANOSECONDS);
    }

    public void u(long j5, TimeUnit timeUnit) {
        w(timeUnit.toNanos(j5));
    }

    public void v() {
        w(this.f18848d);
    }

    public c(long j5, TimeUnit timeUnit) {
        this.f18848d = timeUnit.toNanos(j5);
    }
}

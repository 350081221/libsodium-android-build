package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.core.q0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class s extends q0 {

    /* renamed from: b, reason: collision with root package name */
    private static final s f18617b = new s();

    /* loaded from: classes3.dex */
    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f18618a;

        /* renamed from: b, reason: collision with root package name */
        private final c f18619b;

        /* renamed from: c, reason: collision with root package name */
        private final long f18620c;

        a(Runnable runnable, c cVar, long j5) {
            this.f18618a = runnable;
            this.f18619b = cVar;
            this.f18620c = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f18619b.f18628d) {
                long a5 = this.f18619b.a(TimeUnit.MILLISECONDS);
                long j5 = this.f18620c;
                if (j5 > a5) {
                    try {
                        Thread.sleep(j5 - a5);
                    } catch (InterruptedException e5) {
                        Thread.currentThread().interrupt();
                        io.reactivex.rxjava3.plugins.a.Y(e5);
                        return;
                    }
                }
                if (!this.f18619b.f18628d) {
                    this.f18618a.run();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f18621a;

        /* renamed from: b, reason: collision with root package name */
        final long f18622b;

        /* renamed from: c, reason: collision with root package name */
        final int f18623c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f18624d;

        b(Runnable runnable, Long l5, int i5) {
            this.f18621a = runnable;
            this.f18622b = l5.longValue();
            this.f18623c = i5;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int compare = Long.compare(this.f18622b, bVar.f18622b);
            if (compare == 0) {
                return Integer.compare(this.f18623c, bVar.f18623c);
            }
            return compare;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends q0.c implements io.reactivex.rxjava3.disposables.e {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue<b> f18625a = new PriorityBlockingQueue<>();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f18626b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f18627c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f18628d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f18629a;

            a(b bVar) {
                this.f18629a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18629a.f18624d = true;
                c.this.f18625a.remove(this.f18629a);
            }
        }

        c() {
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e b(@l3.f Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.q0.c
        @l3.f
        public io.reactivex.rxjava3.disposables.e c(@l3.f Runnable runnable, long j5, @l3.f TimeUnit timeUnit) {
            long a5 = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j5);
            return e(new a(runnable, this, a5), a5);
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public void dispose() {
            this.f18628d = true;
        }

        io.reactivex.rxjava3.disposables.e e(Runnable runnable, long j5) {
            if (this.f18628d) {
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j5), this.f18627c.incrementAndGet());
            this.f18625a.add(bVar);
            if (this.f18626b.getAndIncrement() == 0) {
                int i5 = 1;
                while (!this.f18628d) {
                    b poll = this.f18625a.poll();
                    if (poll == null) {
                        i5 = this.f18626b.addAndGet(-i5);
                        if (i5 == 0) {
                            return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
                        }
                    } else if (!poll.f18624d) {
                        poll.f18621a.run();
                    }
                }
                this.f18625a.clear();
                return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
            }
            return io.reactivex.rxjava3.disposables.e.m(new a(bVar));
        }

        @Override // io.reactivex.rxjava3.disposables.e
        public boolean isDisposed() {
            return this.f18628d;
        }
    }

    s() {
    }

    public static s t() {
        return f18617b;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public q0.c c() {
        return new c();
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e e(@l3.f Runnable runnable) {
        io.reactivex.rxjava3.plugins.a.b0(runnable).run();
        return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.q0
    @l3.f
    public io.reactivex.rxjava3.disposables.e g(@l3.f Runnable runnable, long j5, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j5);
            io.reactivex.rxjava3.plugins.a.b0(runnable).run();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            io.reactivex.rxjava3.plugins.a.Y(e5);
        }
        return io.reactivex.rxjava3.internal.disposables.d.INSTANCE;
    }
}

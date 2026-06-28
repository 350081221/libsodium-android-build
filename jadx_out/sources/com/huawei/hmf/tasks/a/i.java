package com.huawei.hmf.tasks.a;

import android.app.Activity;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i<TResult> extends Task<TResult> {

    /* renamed from: b, reason: collision with root package name */
    private boolean f8074b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f8075c;

    /* renamed from: d, reason: collision with root package name */
    private TResult f8076d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f8077e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f8073a = new Object();

    /* renamed from: f, reason: collision with root package name */
    private List<com.huawei.hmf.tasks.e<TResult>> f8078f = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements com.huawei.hmf.tasks.i<TResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hmf.tasks.j f8079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f8080b;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* renamed from: com.huawei.hmf.tasks.a.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0158a<TContinuationResult> implements com.huawei.hmf.tasks.g<TContinuationResult> {
            C0158a() {
            }

            @Override // com.huawei.hmf.tasks.g
            public final void onComplete(Task<TContinuationResult> task) {
                if (task.v()) {
                    a.this.f8080b.A(task.r());
                } else if (task.t()) {
                    a.this.f8080b.B();
                } else {
                    a.this.f8080b.z(task.q());
                }
            }
        }

        a(com.huawei.hmf.tasks.j jVar, i iVar) {
            this.f8079a = jVar;
            this.f8080b = iVar;
        }

        @Override // com.huawei.hmf.tasks.i
        public final void onSuccess(TResult tresult) {
            try {
                Task a5 = this.f8079a.a(tresult);
                if (a5 == null) {
                    this.f8080b.z(new NullPointerException("SuccessContinuation returned null"));
                } else {
                    a5.e(new C0158a());
                }
            } catch (Exception e5) {
                this.f8080b.z(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements com.huawei.hmf.tasks.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8083a;

        b(i iVar) {
            this.f8083a = iVar;
        }

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(Exception exc) {
            this.f8083a.z(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c implements com.huawei.hmf.tasks.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8085a;

        c(i iVar) {
            this.f8085a = iVar;
        }

        @Override // com.huawei.hmf.tasks.f
        public final void a() {
            this.f8085a.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class d implements com.huawei.hmf.tasks.g<TResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hmf.tasks.d f8087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f8088b;

        /* JADX INFO: Add missing generic type declarations: [TContinuationResult] */
        /* loaded from: classes3.dex */
        final class a<TContinuationResult> implements com.huawei.hmf.tasks.g<TContinuationResult> {
            a() {
            }

            @Override // com.huawei.hmf.tasks.g
            public final void onComplete(Task<TContinuationResult> task) {
                if (task.v()) {
                    d.this.f8088b.A(task.r());
                } else if (task.t()) {
                    d.this.f8088b.B();
                } else {
                    d.this.f8088b.z(task.q());
                }
            }
        }

        d(com.huawei.hmf.tasks.d dVar, i iVar) {
            this.f8087a = dVar;
            this.f8088b = iVar;
        }

        @Override // com.huawei.hmf.tasks.g
        public final void onComplete(Task<TResult> task) {
            try {
                Task task2 = (Task) this.f8087a.a(task);
                if (task2 == null) {
                    this.f8088b.z(new NullPointerException("Continuation returned null"));
                } else {
                    task2.e(new a());
                }
            } catch (Exception e5) {
                this.f8088b.z(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class e implements com.huawei.hmf.tasks.g<TResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8091a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.huawei.hmf.tasks.d f8092b;

        e(i iVar, com.huawei.hmf.tasks.d dVar) {
            this.f8091a = iVar;
            this.f8092b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hmf.tasks.g
        public final void onComplete(Task<TResult> task) {
            if (task.t()) {
                this.f8091a.B();
                return;
            }
            try {
                this.f8091a.A(this.f8092b.a(task));
            } catch (Exception e5) {
                this.f8091a.z(e5);
            }
        }
    }

    private void C() {
        synchronized (this.f8073a) {
            Iterator<com.huawei.hmf.tasks.e<TResult>> it = this.f8078f.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onComplete(this);
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception e6) {
                    throw new RuntimeException(e6);
                }
            }
            this.f8078f = null;
        }
    }

    private Task<TResult> y(com.huawei.hmf.tasks.e<TResult> eVar) {
        boolean u4;
        synchronized (this.f8073a) {
            u4 = u();
            if (!u4) {
                this.f8078f.add(eVar);
            }
        }
        if (u4) {
            eVar.onComplete(this);
        }
        return this;
    }

    public final void A(TResult tresult) {
        synchronized (this.f8073a) {
            if (this.f8074b) {
                return;
            }
            this.f8074b = true;
            this.f8076d = tresult;
            this.f8073a.notifyAll();
            C();
        }
    }

    public final boolean B() {
        synchronized (this.f8073a) {
            if (this.f8074b) {
                return false;
            }
            this.f8074b = true;
            this.f8075c = true;
            this.f8073a.notifyAll();
            C();
            return true;
        }
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> a(Activity activity, com.huawei.hmf.tasks.f fVar) {
        com.huawei.hmf.tasks.a.b bVar = new com.huawei.hmf.tasks.a.b(l.c(), fVar);
        g.c(activity, bVar);
        return y(bVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> b(com.huawei.hmf.tasks.f fVar) {
        return c(l.c(), fVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> c(Executor executor, com.huawei.hmf.tasks.f fVar) {
        return y(new com.huawei.hmf.tasks.a.b(executor, fVar));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> d(Activity activity, com.huawei.hmf.tasks.g<TResult> gVar) {
        com.huawei.hmf.tasks.a.d dVar = new com.huawei.hmf.tasks.a.d(l.c(), gVar);
        g.c(activity, dVar);
        return y(dVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> e(com.huawei.hmf.tasks.g<TResult> gVar) {
        return f(l.c(), gVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> f(Executor executor, com.huawei.hmf.tasks.g<TResult> gVar) {
        return y(new com.huawei.hmf.tasks.a.d(executor, gVar));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> g(Activity activity, com.huawei.hmf.tasks.h hVar) {
        f fVar = new f(l.c(), hVar);
        g.c(activity, fVar);
        return y(fVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> h(com.huawei.hmf.tasks.h hVar) {
        return i(l.c(), hVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> i(Executor executor, com.huawei.hmf.tasks.h hVar) {
        return y(new f(executor, hVar));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> j(Activity activity, com.huawei.hmf.tasks.i<TResult> iVar) {
        h hVar = new h(l.c(), iVar);
        g.c(activity, hVar);
        return y(hVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> k(com.huawei.hmf.tasks.i<TResult> iVar) {
        return l(l.c(), iVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Task<TResult> l(Executor executor, com.huawei.hmf.tasks.i<TResult> iVar) {
        return y(new h(executor, iVar));
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> m(com.huawei.hmf.tasks.d<TResult, TContinuationResult> dVar) {
        return n(l.c(), dVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> n(Executor executor, com.huawei.hmf.tasks.d<TResult, TContinuationResult> dVar) {
        i iVar = new i();
        f(executor, new e(iVar, dVar));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> o(com.huawei.hmf.tasks.d<TResult, Task<TContinuationResult>> dVar) {
        return p(l.c(), dVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> p(Executor executor, com.huawei.hmf.tasks.d<TResult, Task<TContinuationResult>> dVar) {
        i iVar = new i();
        f(executor, new d(dVar, iVar));
        return iVar;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Exception q() {
        Exception exc;
        synchronized (this.f8073a) {
            exc = this.f8077e;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final TResult r() {
        TResult tresult;
        synchronized (this.f8073a) {
            if (this.f8077e != null) {
                throw new RuntimeException(this.f8077e);
            }
            tresult = this.f8076d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <E extends Throwable> TResult s(Class<E> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f8073a) {
            if (cls != null) {
                if (cls.isInstance(this.f8077e)) {
                    throw cls.cast(this.f8077e);
                }
            }
            if (this.f8077e != null) {
                throw new RuntimeException(this.f8077e);
            }
            tresult = this.f8076d;
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean t() {
        return this.f8075c;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean u() {
        boolean z4;
        synchronized (this.f8073a) {
            z4 = this.f8074b;
        }
        return z4;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean v() {
        boolean z4;
        synchronized (this.f8073a) {
            z4 = this.f8074b && !t() && this.f8077e == null;
        }
        return z4;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> w(com.huawei.hmf.tasks.j<TResult, TContinuationResult> jVar) {
        return x(l.c(), jVar);
    }

    @Override // com.huawei.hmf.tasks.Task
    public final <TContinuationResult> Task<TContinuationResult> x(Executor executor, com.huawei.hmf.tasks.j<TResult, TContinuationResult> jVar) {
        i iVar = new i();
        l(executor, new a(jVar, iVar));
        h(new b(iVar));
        b(new c(iVar));
        return iVar;
    }

    public final void z(Exception exc) {
        synchronized (this.f8073a) {
            if (this.f8074b) {
                return;
            }
            this.f8074b = true;
            this.f8077e = exc;
            this.f8073a.notifyAll();
            C();
        }
    }
}

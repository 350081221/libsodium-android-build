package com.ss.android.downloadlib.g;

import java.lang.ref.SoftReference;

/* loaded from: classes3.dex */
public class c<P, R> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private P f10084a;

    /* renamed from: b, reason: collision with root package name */
    private R f10085b;

    /* renamed from: c, reason: collision with root package name */
    private int f10086c;

    /* renamed from: d, reason: collision with root package name */
    private SoftReference<a<P, R>> f10087d;

    /* renamed from: e, reason: collision with root package name */
    private c<?, P> f10088e;

    /* renamed from: f, reason: collision with root package name */
    private c<R, ?> f10089f;

    /* loaded from: classes3.dex */
    public interface a<PARAM, RESULT> {
        RESULT a(PARAM param);
    }

    private c(int i5, a<P, R> aVar, P p5) {
        this.f10086c = i5;
        this.f10087d = new SoftReference<>(aVar);
        this.f10084a = p5;
    }

    public static <P, R> c<P, R> a(a<P, R> aVar, P p5) {
        return new c<>(2, aVar, p5);
    }

    private R b() {
        return this.f10085b;
    }

    @Override // java.lang.Runnable
    public void run() {
        c<?, P> cVar;
        if (this.f10086c == 0 && !m.b()) {
            com.ss.android.downloadlib.g.a().b().post(this);
            return;
        }
        if (this.f10086c == 1 && m.b()) {
            com.ss.android.downloadlib.d.a().a(this);
            return;
        }
        if (this.f10086c == 2 && m.b()) {
            com.ss.android.downloadlib.d.a().b(this);
            return;
        }
        if (this.f10084a == null && (cVar = this.f10088e) != null) {
            this.f10084a = cVar.b();
        }
        a<P, R> aVar = this.f10087d.get();
        if (aVar == null) {
            return;
        }
        this.f10085b = aVar.a(this.f10084a);
        c<R, ?> cVar2 = this.f10089f;
        if (cVar2 != null) {
            cVar2.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <NR> c<R, NR> a(int i5, a<R, NR> aVar) {
        c cVar = (c<R, ?>) new c(i5, aVar, null);
        this.f10089f = cVar;
        cVar.f10088e = this;
        return cVar;
    }

    public <NR> c<R, NR> a(a<R, NR> aVar) {
        return a(0, aVar);
    }

    public void a() {
        c<?, P> cVar = this.f10088e;
        if (cVar != null) {
            cVar.a();
        } else {
            run();
        }
    }
}

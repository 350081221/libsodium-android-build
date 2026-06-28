package org.jdeferred.android;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.jdeferred.j;
import org.jdeferred.m;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class c<D, F, P> extends org.jdeferred.impl.d<D, F, P> {

    /* renamed from: k, reason: collision with root package name */
    private static final e f21536k = new e();

    /* renamed from: l, reason: collision with root package name */
    private static final int f21537l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f21538m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f21539n = 3;

    /* renamed from: o, reason: collision with root package name */
    private static final int f21540o = 4;

    /* renamed from: i, reason: collision with root package name */
    protected final org.slf4j.a f21541i;

    /* renamed from: j, reason: collision with root package name */
    private final org.jdeferred.android.e f21542j;

    /* loaded from: classes4.dex */
    class a implements j<F> {
        a() {
        }

        @Override // org.jdeferred.j
        public void onFail(F f5) {
            c.this.h(f5);
        }
    }

    /* loaded from: classes4.dex */
    class b implements m<P> {
        b() {
        }

        @Override // org.jdeferred.m
        public void a(P p5) {
            c.this.q(p5);
        }
    }

    /* renamed from: org.jdeferred.android.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0643c implements org.jdeferred.g<D> {
        C0643c() {
        }

        @Override // org.jdeferred.g
        public void a(D d5) {
            c.this.g(d5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class d<Callback, D, F, P> {

        /* renamed from: a, reason: collision with root package name */
        final org.jdeferred.b f21546a;

        /* renamed from: b, reason: collision with root package name */
        final Callback f21547b;

        /* renamed from: c, reason: collision with root package name */
        final D f21548c;

        /* renamed from: d, reason: collision with root package name */
        final F f21549d;

        /* renamed from: e, reason: collision with root package name */
        final P f21550e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f21551f;

        d(org.jdeferred.b bVar, Callback callback, p.a aVar, D d5, F f5, P p5) {
            this.f21546a = bVar;
            this.f21547b = callback;
            this.f21551f = aVar;
            this.f21548c = d5;
            this.f21549d = f5;
            this.f21550e = p5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i5 = message.what;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            ((org.jdeferred.a) dVar.f21547b).a(dVar.f21551f, dVar.f21548c, dVar.f21549d);
                            return;
                        }
                        return;
                    }
                    ((j) dVar.f21547b).onFail(dVar.f21549d);
                    return;
                }
                ((m) dVar.f21547b).a(dVar.f21550e);
                return;
            }
            ((org.jdeferred.g) dVar.f21547b).a(dVar.f21548c);
        }
    }

    public c(p<D, F, P> pVar) {
        this(pVar, org.jdeferred.android.e.UI);
    }

    @Override // org.jdeferred.impl.b
    protected void A(org.jdeferred.g<D> gVar, D d5) {
        if (F(gVar) == org.jdeferred.android.e.UI) {
            G(1, gVar, p.a.RESOLVED, d5, null, null);
        } else {
            super.A(gVar, d5);
        }
    }

    @Override // org.jdeferred.impl.b
    protected void C(j<F> jVar, F f5) {
        if (F(jVar) == org.jdeferred.android.e.UI) {
            G(3, jVar, p.a.REJECTED, null, f5, null);
        } else {
            super.C(jVar, f5);
        }
    }

    @Override // org.jdeferred.impl.b
    protected void E(m<P> mVar, P p5) {
        if (F(mVar) == org.jdeferred.android.e.UI) {
            G(2, mVar, p.a.PENDING, null, null, p5);
        } else {
            super.E(mVar, p5);
        }
    }

    protected org.jdeferred.android.e F(Object obj) {
        org.jdeferred.android.e eVar;
        if (obj instanceof f) {
            eVar = ((f) obj).b();
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return this.f21542j;
        }
        return eVar;
    }

    protected <Callback> void G(int i5, Callback callback, p.a aVar, D d5, F f5, P p5) {
        f21536k.obtainMessage(i5, new d(this, callback, aVar, d5, f5, p5)).sendToTarget();
    }

    @Override // org.jdeferred.impl.b
    protected void x(org.jdeferred.a<D, F> aVar, p.a aVar2, D d5, F f5) {
        if (F(aVar) == org.jdeferred.android.e.UI) {
            G(4, aVar, aVar2, d5, f5, null);
        } else {
            super.x(aVar, aVar2, d5, f5);
        }
    }

    public c(p<D, F, P> pVar, org.jdeferred.android.e eVar) {
        this.f21541i = org.slf4j.b.f(c.class);
        this.f21542j = eVar;
        pVar.d(new C0643c()).i(new b()).p(new a());
    }
}

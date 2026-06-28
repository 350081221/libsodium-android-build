package org.jdeferred.multiple;

import java.util.concurrent.atomic.AtomicInteger;
import org.jdeferred.g;
import org.jdeferred.j;
import org.jdeferred.m;
import org.jdeferred.p;

/* loaded from: classes4.dex */
public class a extends org.jdeferred.impl.d<org.jdeferred.multiple.c, e, org.jdeferred.multiple.b> implements p<org.jdeferred.multiple.c, e, org.jdeferred.multiple.b> {

    /* renamed from: i, reason: collision with root package name */
    private final int f21597i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f21598j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f21599k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private final org.jdeferred.multiple.c f21600l;

    /* renamed from: org.jdeferred.multiple.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0646a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f21602b;

        C0646a(int i5, p pVar) {
            this.f21601a = i5;
            this.f21602b = pVar;
        }

        @Override // org.jdeferred.g
        public void a(Object obj) {
            synchronized (a.this) {
                if (!a.this.w()) {
                    return;
                }
                org.jdeferred.multiple.c cVar = a.this.f21600l;
                int i5 = this.f21601a;
                cVar.c(i5, new f(i5, this.f21602b, obj));
                int incrementAndGet = a.this.f21598j.incrementAndGet();
                a aVar = a.this;
                aVar.q(new org.jdeferred.multiple.b(incrementAndGet, aVar.f21599k.get(), a.this.f21597i));
                if (incrementAndGet == a.this.f21597i) {
                    a aVar2 = a.this;
                    aVar2.g(aVar2.f21600l);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f21605b;

        b(int i5, p pVar) {
            this.f21604a = i5;
            this.f21605b = pVar;
        }

        @Override // org.jdeferred.m
        public void a(Object obj) {
            synchronized (a.this) {
                if (!a.this.w()) {
                    return;
                }
                a aVar = a.this;
                aVar.q(new d(aVar.f21598j.get(), a.this.f21599k.get(), a.this.f21597i, this.f21604a, this.f21605b, obj));
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements j<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21607a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f21608b;

        c(int i5, p pVar) {
            this.f21607a = i5;
            this.f21608b = pVar;
        }

        @Override // org.jdeferred.j
        public void onFail(Object obj) {
            synchronized (a.this) {
                if (!a.this.w()) {
                    return;
                }
                int incrementAndGet = a.this.f21599k.incrementAndGet();
                a aVar = a.this;
                aVar.q(new org.jdeferred.multiple.b(aVar.f21598j.get(), incrementAndGet, a.this.f21597i));
                a.this.h(new e(this.f21607a, this.f21608b, obj));
            }
        }
    }

    public a(p... pVarArr) {
        if (pVarArr != null && pVarArr.length != 0) {
            int length = pVarArr.length;
            this.f21597i = length;
            this.f21600l = new org.jdeferred.multiple.c(length);
            int length2 = pVarArr.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length2) {
                p pVar = pVarArr[i5];
                pVar.p(new c(i6, pVar)).i(new b(i6, pVar)).d(new C0646a(i6, pVar));
                i5++;
                i6++;
            }
            return;
        }
        throw new IllegalArgumentException("Promises is null or empty");
    }
}

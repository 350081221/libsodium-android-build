package com.zzhoujay.richtext.ig;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, e> f15830a;

    /* renamed from: b, reason: collision with root package name */
    private final c f15831b;

    /* loaded from: classes3.dex */
    class a implements c {
        a() {
        }

        @Override // com.zzhoujay.richtext.ig.j.c
        public void a(String str) {
            synchronized (j.this.f15830a) {
                j.this.f15830a.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final ExecutorService f15833a = Executors.newCachedThreadPool();

        private b() {
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final j f15834a = new j(null);

        private d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e implements Runnable {

        /* renamed from: h, reason: collision with root package name */
        private static final int f15835h = 0;

        /* renamed from: i, reason: collision with root package name */
        private static final int f15836i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f15837j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f15838k = 3;

        /* renamed from: a, reason: collision with root package name */
        private final String f15839a;

        /* renamed from: b, reason: collision with root package name */
        private final String f15840b;

        /* renamed from: c, reason: collision with root package name */
        private final i f15841c;

        /* renamed from: g, reason: collision with root package name */
        private final c f15845g;

        /* renamed from: e, reason: collision with root package name */
        private final Object f15843e = new Object();

        /* renamed from: d, reason: collision with root package name */
        private volatile int f15842d = 0;

        /* renamed from: f, reason: collision with root package name */
        private final ArrayList<com.zzhoujay.richtext.ig.d> f15844f = new ArrayList<>();

        e(String str, String str2, i iVar, c cVar) {
            this.f15840b = str;
            this.f15841c = iVar;
            this.f15845g = cVar;
            this.f15839a = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.zzhoujay.richtext.ig.e c(ExecutorService executorService, com.zzhoujay.richtext.ig.d dVar) {
            f fVar;
            synchronized (this.f15843e) {
                if (this.f15842d == 1) {
                    synchronized (this.f15844f) {
                        this.f15844f.add(dVar);
                        fVar = new f(this, dVar);
                    }
                } else {
                    fVar = null;
                }
                if (this.f15842d == 0) {
                    this.f15842d = 1;
                    executorService.submit(this);
                    synchronized (this.f15844f) {
                        this.f15844f.add(dVar);
                        fVar = new f(this, dVar);
                    }
                }
            }
            if (fVar == null) {
                dVar.onFailure(new f3.g());
            }
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(com.zzhoujay.richtext.ig.d dVar) {
            synchronized (this.f15844f) {
                this.f15844f.remove(dVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f15843e) {
                this.f15842d = 1;
            }
            try {
                e3.a a5 = this.f15841c.a(this.f15840b);
                com.zzhoujay.richtext.cache.a.g().o(this.f15839a, a5.a());
                a5.close();
                e = null;
            } catch (Exception e5) {
                e = e5;
            }
            synchronized (this.f15843e) {
                this.f15845g.a(this.f15839a);
                if (this.f15842d != 1) {
                    return;
                }
                this.f15842d = 2;
                synchronized (this.f15844f) {
                    Iterator<com.zzhoujay.richtext.ig.d> it = this.f15844f.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().o(this.f15839a, e);
                        } catch (Throwable th) {
                            com.zzhoujay.richtext.ext.c.a(th);
                        }
                    }
                }
                this.f15842d = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class f implements com.zzhoujay.richtext.ig.e {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<e> f15846a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<com.zzhoujay.richtext.ig.d> f15847b;

        f(e eVar, com.zzhoujay.richtext.ig.d dVar) {
            this.f15846a = new WeakReference<>(eVar);
            this.f15847b = new WeakReference<>(dVar);
        }

        @Override // com.zzhoujay.richtext.ig.e
        public void cancel() {
            com.zzhoujay.richtext.ig.d dVar;
            e eVar = this.f15846a.get();
            if (eVar != null && (dVar = this.f15847b.get()) != null) {
                eVar.d(dVar);
                dVar.onFailure(new f3.i());
            }
        }
    }

    /* synthetic */ j(a aVar) {
        this();
    }

    private static ExecutorService c() {
        return b.f15833a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j d() {
        return d.f15834a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.zzhoujay.richtext.ig.e b(com.zzhoujay.richtext.c cVar, i iVar, com.zzhoujay.richtext.ig.d dVar) {
        com.zzhoujay.richtext.ig.e c5;
        String g5 = cVar.g();
        synchronized (this.f15830a) {
            e eVar = this.f15830a.get(g5);
            if (eVar == null) {
                eVar = new e(cVar.k(), g5, iVar, this.f15831b);
                this.f15830a.put(g5, eVar);
            }
            c5 = eVar.c(c(), dVar);
        }
        return c5;
    }

    private j() {
        this.f15831b = new a();
        this.f15830a = new HashMap<>();
    }
}

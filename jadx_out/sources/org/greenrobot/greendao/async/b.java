package org.greenrobot.greendao.async;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    public static final int f21311n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f21312o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f21313p = 4;

    /* renamed from: a, reason: collision with root package name */
    final a f21314a;

    /* renamed from: b, reason: collision with root package name */
    final org.greenrobot.greendao.a<Object, Object> f21315b;

    /* renamed from: c, reason: collision with root package name */
    private final org.greenrobot.greendao.database.a f21316c;

    /* renamed from: d, reason: collision with root package name */
    final Object f21317d;

    /* renamed from: e, reason: collision with root package name */
    final int f21318e;

    /* renamed from: f, reason: collision with root package name */
    volatile long f21319f;

    /* renamed from: g, reason: collision with root package name */
    volatile long f21320g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f21321h;

    /* renamed from: i, reason: collision with root package name */
    volatile Throwable f21322i;

    /* renamed from: j, reason: collision with root package name */
    final Exception f21323j;

    /* renamed from: k, reason: collision with root package name */
    volatile Object f21324k;

    /* renamed from: l, reason: collision with root package name */
    volatile int f21325l;

    /* renamed from: m, reason: collision with root package name */
    int f21326m;

    /* loaded from: classes4.dex */
    public enum a {
        Insert,
        InsertInTxIterable,
        InsertInTxArray,
        InsertOrReplace,
        InsertOrReplaceInTxIterable,
        InsertOrReplaceInTxArray,
        Update,
        UpdateInTxIterable,
        UpdateInTxArray,
        Delete,
        DeleteInTxIterable,
        DeleteInTxArray,
        DeleteByKey,
        DeleteAll,
        TransactionRunnable,
        TransactionCallable,
        QueryList,
        QueryUnique,
        Load,
        LoadAll,
        Count,
        Refresh
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, org.greenrobot.greendao.a<?, ?> aVar2, org.greenrobot.greendao.database.a aVar3, Object obj, int i5) {
        Exception exc;
        this.f21314a = aVar;
        this.f21318e = i5;
        this.f21315b = aVar2;
        this.f21316c = aVar3;
        this.f21317d = obj;
        if ((i5 & 4) != 0) {
            exc = new Exception("AsyncOperation was created here");
        } else {
            exc = null;
        }
        this.f21323j = exc;
    }

    public Exception a() {
        return this.f21323j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public org.greenrobot.greendao.database.a b() {
        org.greenrobot.greendao.database.a aVar = this.f21316c;
        return aVar != null ? aVar : this.f21315b.getDatabase();
    }

    public long c() {
        if (this.f21320g != 0) {
            return this.f21320g - this.f21319f;
        }
        throw new org.greenrobot.greendao.d("This operation did not yet complete");
    }

    public int d() {
        return this.f21325l;
    }

    public Object e() {
        return this.f21317d;
    }

    public synchronized Object f() {
        if (!this.f21321h) {
            t();
        }
        if (this.f21322i == null) {
        } else {
            throw new org.greenrobot.greendao.async.a(this, this.f21322i);
        }
        return this.f21324k;
    }

    public int g() {
        return this.f21326m;
    }

    public Throwable h() {
        return this.f21322i;
    }

    public long i() {
        return this.f21320g;
    }

    public long j() {
        return this.f21319f;
    }

    public a k() {
        return this.f21314a;
    }

    public boolean l() {
        return this.f21321h;
    }

    public boolean m() {
        return this.f21321h && this.f21322i == null;
    }

    public boolean n() {
        return this.f21322i != null;
    }

    public boolean o() {
        return (this.f21318e & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(b bVar) {
        return bVar != null && o() && bVar.o() && b() == bVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        this.f21319f = 0L;
        this.f21320g = 0L;
        this.f21321h = false;
        this.f21322i = null;
        this.f21324k = null;
        this.f21325l = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r() {
        this.f21321h = true;
        notifyAll();
    }

    public void s(Throwable th) {
        this.f21322i = th;
    }

    public synchronized Object t() {
        while (!this.f21321h) {
            try {
                wait();
            } catch (InterruptedException e5) {
                throw new org.greenrobot.greendao.d("Interrupted while waiting for operation to complete", e5);
            }
        }
        return this.f21324k;
    }

    public synchronized boolean u(int i5) {
        if (!this.f21321h) {
            try {
                wait(i5);
            } catch (InterruptedException e5) {
                throw new org.greenrobot.greendao.d("Interrupted while waiting for operation to complete", e5);
            }
        }
        return this.f21321h;
    }
}

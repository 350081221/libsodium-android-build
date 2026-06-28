package org.greenrobot.greendao.rx;

import java.util.List;
import java.util.concurrent.Callable;
import rx.Observable;
import rx.Scheduler;

@m4.b
/* loaded from: classes4.dex */
public class b<T, K> extends org.greenrobot.greendao.rx.a {

    /* renamed from: b, reason: collision with root package name */
    private final org.greenrobot.greendao.a<T, K> f21453b;

    /* loaded from: classes4.dex */
    class a implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21454a;

        a(Object obj) {
            this.f21454a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            b.this.f21453b.save(this.f21454a);
            return (T) this.f21454a;
        }
    }

    /* renamed from: org.greenrobot.greendao.rx.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class CallableC0640b implements Callable<Iterable<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21456a;

        CallableC0640b(Iterable iterable) {
            this.f21456a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterable<T> call() throws Exception {
            b.this.f21453b.saveInTx(this.f21456a);
            return this.f21456a;
        }
    }

    /* loaded from: classes4.dex */
    class c implements Callable<Object[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21458a;

        c(Object[] objArr) {
            this.f21458a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() throws Exception {
            b.this.f21453b.saveInTx(this.f21458a);
            return this.f21458a;
        }
    }

    /* loaded from: classes4.dex */
    class d implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21460a;

        d(Object obj) {
            this.f21460a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            b.this.f21453b.update(this.f21460a);
            return (T) this.f21460a;
        }
    }

    /* loaded from: classes4.dex */
    class e implements Callable<Iterable<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21462a;

        e(Iterable iterable) {
            this.f21462a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterable<T> call() throws Exception {
            b.this.f21453b.updateInTx(this.f21462a);
            return this.f21462a;
        }
    }

    /* loaded from: classes4.dex */
    class f implements Callable<Object[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21464a;

        f(Object[] objArr) {
            this.f21464a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() throws Exception {
            b.this.f21453b.updateInTx(this.f21464a);
            return this.f21464a;
        }
    }

    /* loaded from: classes4.dex */
    class g implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21466a;

        g(Object obj) {
            this.f21466a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.delete(this.f21466a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class h implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21468a;

        h(Object obj) {
            this.f21468a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteByKey(this.f21468a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class i implements Callable<Void> {
        i() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteAll();
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class j implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21471a;

        j(Iterable iterable) {
            this.f21471a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteInTx(this.f21471a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class k implements Callable<List<T>> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> call() throws Exception {
            return b.this.f21453b.loadAll();
        }
    }

    /* loaded from: classes4.dex */
    class l implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21474a;

        l(Object[] objArr) {
            this.f21474a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteInTx(this.f21474a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class m implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21476a;

        m(Iterable iterable) {
            this.f21476a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteByKeyInTx(this.f21476a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class n implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21478a;

        n(Object[] objArr) {
            this.f21478a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            b.this.f21453b.deleteByKeyInTx(this.f21478a);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    class o implements Callable<Long> {
        o() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() throws Exception {
            return Long.valueOf(b.this.f21453b.count());
        }
    }

    /* loaded from: classes4.dex */
    class p implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21481a;

        p(Object obj) {
            this.f21481a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            return (T) b.this.f21453b.load(this.f21481a);
        }
    }

    /* loaded from: classes4.dex */
    class q implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21483a;

        q(Object obj) {
            this.f21483a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            b.this.f21453b.refresh(this.f21483a);
            return (T) this.f21483a;
        }
    }

    /* loaded from: classes4.dex */
    class r implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21485a;

        r(Object obj) {
            this.f21485a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            b.this.f21453b.insert(this.f21485a);
            return (T) this.f21485a;
        }
    }

    /* loaded from: classes4.dex */
    class s implements Callable<Iterable<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21487a;

        s(Iterable iterable) {
            this.f21487a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterable<T> call() throws Exception {
            b.this.f21453b.insertInTx(this.f21487a);
            return this.f21487a;
        }
    }

    /* loaded from: classes4.dex */
    class t implements Callable<Object[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21489a;

        t(Object[] objArr) {
            this.f21489a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() throws Exception {
            b.this.f21453b.insertInTx(this.f21489a);
            return this.f21489a;
        }
    }

    /* loaded from: classes4.dex */
    class u implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f21491a;

        u(Object obj) {
            this.f21491a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            b.this.f21453b.insertOrReplace(this.f21491a);
            return (T) this.f21491a;
        }
    }

    /* loaded from: classes4.dex */
    class v implements Callable<Iterable<T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f21493a;

        v(Iterable iterable) {
            this.f21493a = iterable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterable<T> call() throws Exception {
            b.this.f21453b.insertOrReplaceInTx(this.f21493a);
            return this.f21493a;
        }
    }

    /* loaded from: classes4.dex */
    class w implements Callable<Object[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f21495a;

        w(Object[] objArr) {
            this.f21495a = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object[] call() throws Exception {
            b.this.f21453b.insertOrReplaceInTx(this.f21495a);
            return this.f21495a;
        }
    }

    @m4.b
    public b(org.greenrobot.greendao.a<T, K> aVar) {
        this(aVar, null);
    }

    @m4.b
    public Observable<Iterable<T>> A(Iterable<T> iterable) {
        return (Observable<Iterable<T>>) b(new e(iterable));
    }

    @m4.b
    public Observable<Object[]> B(T... tArr) {
        return b(new f(tArr));
    }

    @Override // org.greenrobot.greendao.rx.a
    @m4.b
    public /* bridge */ /* synthetic */ Scheduler a() {
        return super.a();
    }

    @m4.b
    public Observable<Long> e() {
        return b(new o());
    }

    @m4.b
    public Observable<Void> f(T t5) {
        return b(new g(t5));
    }

    @m4.b
    public Observable<Void> g() {
        return b(new i());
    }

    @m4.b
    public Observable<Void> h(K k5) {
        return b(new h(k5));
    }

    @m4.b
    public Observable<Void> i(Iterable<K> iterable) {
        return b(new m(iterable));
    }

    @m4.b
    public Observable<Void> j(K... kArr) {
        return b(new n(kArr));
    }

    @m4.b
    public Observable<Void> k(Iterable<T> iterable) {
        return b(new j(iterable));
    }

    @m4.b
    public Observable<Void> l(T... tArr) {
        return b(new l(tArr));
    }

    @m4.b
    public org.greenrobot.greendao.a<T, K> m() {
        return this.f21453b;
    }

    @m4.b
    public Observable<T> n(T t5) {
        return (Observable<T>) b(new r(t5));
    }

    @m4.b
    public Observable<Iterable<T>> o(Iterable<T> iterable) {
        return (Observable<Iterable<T>>) b(new s(iterable));
    }

    @m4.b
    public Observable<Object[]> p(T... tArr) {
        return b(new t(tArr));
    }

    @m4.b
    public Observable<T> q(T t5) {
        return (Observable<T>) b(new u(t5));
    }

    @m4.b
    public Observable<Iterable<T>> r(Iterable<T> iterable) {
        return (Observable<Iterable<T>>) b(new v(iterable));
    }

    @m4.b
    public Observable<Object[]> s(T... tArr) {
        return b(new w(tArr));
    }

    @m4.b
    public Observable<T> t(K k5) {
        return (Observable<T>) b(new p(k5));
    }

    @m4.b
    public Observable<List<T>> u() {
        return (Observable<List<T>>) b(new k());
    }

    @m4.b
    public Observable<T> v(T t5) {
        return (Observable<T>) b(new q(t5));
    }

    @m4.b
    public Observable<T> w(T t5) {
        return (Observable<T>) b(new a(t5));
    }

    @m4.b
    public Observable<Iterable<T>> x(Iterable<T> iterable) {
        return (Observable<Iterable<T>>) b(new CallableC0640b(iterable));
    }

    @m4.b
    public Observable<Object[]> y(T... tArr) {
        return b(new c(tArr));
    }

    @m4.b
    public Observable<T> z(T t5) {
        return (Observable<T>) b(new d(t5));
    }

    @m4.b
    public b(org.greenrobot.greendao.a<T, K> aVar, Scheduler scheduler) {
        super(scheduler);
        this.f21453b = aVar;
    }
}

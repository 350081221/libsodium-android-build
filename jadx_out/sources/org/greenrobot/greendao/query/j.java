package org.greenrobot.greendao.query;

import java.util.Date;
import java.util.List;
import rx.schedulers.Schedulers;

/* loaded from: classes4.dex */
public class j<T> extends c<T> {

    /* renamed from: h, reason: collision with root package name */
    private final b<T> f21426h;

    /* renamed from: i, reason: collision with root package name */
    private volatile org.greenrobot.greendao.rx.c f21427i;

    /* renamed from: j, reason: collision with root package name */
    private volatile org.greenrobot.greendao.rx.c f21428j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, j<T2>> {

        /* renamed from: e, reason: collision with root package name */
        private final int f21429e;

        /* renamed from: f, reason: collision with root package name */
        private final int f21430f;

        b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr, int i5, int i6) {
            super(aVar, str, strArr);
            this.f21429e = i5;
            this.f21430f = i6;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public j<T2> a() {
            return new j<>(this, this.f21401b, this.f21400a, (String[]) this.f21402c.clone(), this.f21429e, this.f21430f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T2> j<T2> k(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr, int i5, int i6) {
        return new b(aVar, str, org.greenrobot.greendao.query.a.e(objArr), i5, i6).b();
    }

    public static <T2> j<T2> m(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return k(aVar, str, objArr, -1, -1);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void f(int i5) {
        super.f(i5);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void g(int i5) {
        super.g(i5);
    }

    @m4.c
    public org.greenrobot.greendao.rx.c i() {
        if (this.f21428j == null) {
            this.f21428j = new org.greenrobot.greendao.rx.c(this, Schedulers.io());
        }
        return this.f21428j;
    }

    @m4.c
    public org.greenrobot.greendao.rx.c j() {
        if (this.f21427i == null) {
            this.f21427i = new org.greenrobot.greendao.rx.c(this);
        }
        return this.f21427i;
    }

    public j<T> l() {
        return (j) this.f21426h.c(this);
    }

    public List<T> n() {
        a();
        return this.f21396b.c(this.f21395a.getDatabase().b(this.f21397c, this.f21398d));
    }

    public d<T> o() {
        return q().o();
    }

    public i<T> p() {
        a();
        return new i<>(this.f21396b, this.f21395a.getDatabase().b(this.f21397c, this.f21398d), true);
    }

    public i<T> q() {
        a();
        return new i<>(this.f21396b, this.f21395a.getDatabase().b(this.f21397c, this.f21398d), false);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public j<T> b(int i5, Boolean bool) {
        return (j) super.b(i5, bool);
    }

    @Override // org.greenrobot.greendao.query.c
    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j<T> h(int i5, Object obj) {
        return (j) super.h(i5, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j<T> d(int i5, Date date) {
        return (j) super.d(i5, date);
    }

    public T u() {
        a();
        return this.f21396b.e(this.f21395a.getDatabase().b(this.f21397c, this.f21398d));
    }

    public T v() {
        T u4 = u();
        if (u4 != null) {
            return u4;
        }
        throw new org.greenrobot.greendao.d("No entity found for query");
    }

    private j(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr, int i5, int i6) {
        super(aVar, str, strArr, i5, i6);
        this.f21426h = bVar;
    }
}

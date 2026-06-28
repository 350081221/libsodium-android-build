package org.greenrobot.greendao.query;

import java.util.Date;

/* loaded from: classes4.dex */
public class g<T> extends org.greenrobot.greendao.query.a<T> {

    /* renamed from: f, reason: collision with root package name */
    private final b<T> f21410f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, g<T2>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g<T2> a() {
            return new g<>(this, this.f21401b, this.f21400a, (String[]) this.f21402c.clone());
        }

        private b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T2> g<T2> f(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return new b(aVar, str, org.greenrobot.greendao.query.a.e(objArr)).b();
    }

    public void g() {
        a();
        org.greenrobot.greendao.database.a database = this.f21395a.getDatabase();
        if (database.isDbLockedByCurrentThread()) {
            this.f21395a.getDatabase().execSQL(this.f21397c, this.f21398d);
            return;
        }
        database.beginTransaction();
        try {
            this.f21395a.getDatabase().execSQL(this.f21397c, this.f21398d);
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    public g<T> h() {
        return (g) this.f21410f.c(this);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public g<T> b(int i5, Boolean bool) {
        return (g) super.b(i5, bool);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g<T> h(int i5, Object obj) {
        return (g) super.h(i5, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g<T> d(int i5, Date date) {
        return (g) super.d(i5, date);
    }

    private g(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
        this.f21410f = bVar;
    }
}

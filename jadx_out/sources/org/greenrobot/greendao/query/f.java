package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;

/* loaded from: classes4.dex */
public class f<T> extends c<T> {

    /* renamed from: h, reason: collision with root package name */
    private final b<T> f21407h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, f<T2>> {

        /* renamed from: e, reason: collision with root package name */
        private final int f21408e;

        /* renamed from: f, reason: collision with root package name */
        private final int f21409f;

        b(org.greenrobot.greendao.a aVar, String str, String[] strArr, int i5, int i6) {
            super(aVar, str, strArr);
            this.f21408e = i5;
            this.f21409f = i6;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f<T2> a() {
            return new f<>(this, this.f21401b, this.f21400a, (String[]) this.f21402c.clone(), this.f21408e, this.f21409f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T2> f<T2> i(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr, int i5, int i6) {
        return new b(aVar, str, org.greenrobot.greendao.query.a.e(objArr), i5, i6).b();
    }

    public static <T2> f<T2> k(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return i(aVar, str, objArr, -1, -1);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void f(int i5) {
        super.f(i5);
    }

    @Override // org.greenrobot.greendao.query.c
    public /* bridge */ /* synthetic */ void g(int i5) {
        super.g(i5);
    }

    public f j() {
        return this.f21407h.c(this);
    }

    public Cursor l() {
        a();
        return this.f21395a.getDatabase().b(this.f21397c, this.f21398d);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public f<T> b(int i5, Boolean bool) {
        return (f) super.b(i5, bool);
    }

    @Override // org.greenrobot.greendao.query.c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f<T> h(int i5, Object obj) {
        return (f) super.h(i5, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public f<T> d(int i5, Date date) {
        return (f) super.d(i5, date);
    }

    private f(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr, int i5, int i6) {
        super(aVar, str, strArr, i5, i6);
        this.f21407h = bVar;
    }
}

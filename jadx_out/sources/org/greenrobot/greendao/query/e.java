package org.greenrobot.greendao.query;

import android.database.Cursor;
import java.util.Date;

/* loaded from: classes4.dex */
public class e<T> extends org.greenrobot.greendao.query.a<T> {

    /* renamed from: f, reason: collision with root package name */
    private final b<T> f21406f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b<T2> extends org.greenrobot.greendao.query.b<T2, e<T2>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.greenrobot.greendao.query.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e<T2> a() {
            return new e<>(this, this.f21401b, this.f21400a, (String[]) this.f21402c.clone());
        }

        private b(org.greenrobot.greendao.a<T2, ?> aVar, String str, String[] strArr) {
            super(aVar, str, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T2> e<T2> g(org.greenrobot.greendao.a<T2, ?> aVar, String str, Object[] objArr) {
        return new b(aVar, str, org.greenrobot.greendao.query.a.e(objArr)).b();
    }

    public long f() {
        a();
        Cursor b5 = this.f21395a.getDatabase().b(this.f21397c, this.f21398d);
        try {
            if (b5.moveToNext()) {
                if (b5.isLast()) {
                    if (b5.getColumnCount() == 1) {
                        return b5.getLong(0);
                    }
                    throw new org.greenrobot.greendao.d("Unexpected column count: " + b5.getColumnCount());
                }
                throw new org.greenrobot.greendao.d("Unexpected row count: " + b5.getCount());
            }
            throw new org.greenrobot.greendao.d("No result for count");
        } finally {
            b5.close();
        }
    }

    public e<T> h() {
        return (e) this.f21406f.c(this);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e<T> b(int i5, Boolean bool) {
        return (e) super.b(i5, bool);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e<T> h(int i5, Object obj) {
        return (e) super.h(i5, obj);
    }

    @Override // org.greenrobot.greendao.query.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e<T> d(int i5, Date date) {
        return (e) super.d(i5, date);
    }

    private e(b<T> bVar, org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        super(aVar, str, strArr);
        this.f21406f = bVar;
    }
}

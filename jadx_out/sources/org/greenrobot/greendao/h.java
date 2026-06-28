package org.greenrobot.greendao;

import android.database.Cursor;

/* loaded from: classes4.dex */
public class h<T, K> {

    /* renamed from: a, reason: collision with root package name */
    private final a<T, K> f21355a;

    public h(org.greenrobot.greendao.database.a aVar, Class<a<T, K>> cls, o4.a<?, ?> aVar2) throws Exception {
        org.greenrobot.greendao.internal.a aVar3 = new org.greenrobot.greendao.internal.a(aVar, cls);
        aVar3.f(aVar2);
        this.f21355a = cls.getConstructor(org.greenrobot.greendao.internal.a.class).newInstance(aVar3);
    }

    public a<T, K> a() {
        return this.f21355a;
    }

    public K b(T t5) {
        return this.f21355a.getKey(t5);
    }

    public i[] c() {
        return this.f21355a.getProperties();
    }

    public boolean d() {
        return this.f21355a.isEntityUpdateable();
    }

    public T e(Cursor cursor, int i5) {
        return this.f21355a.readEntity(cursor, i5);
    }

    public K f(Cursor cursor, int i5) {
        return this.f21355a.readKey(cursor, i5);
    }
}

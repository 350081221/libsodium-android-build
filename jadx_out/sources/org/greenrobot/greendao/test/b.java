package org.greenrobot.greendao.test;

import org.greenrobot.greendao.a;
import org.greenrobot.greendao.h;
import org.greenrobot.greendao.i;

/* loaded from: classes4.dex */
public abstract class b<D extends org.greenrobot.greendao.a<T, K>, T, K> extends f {

    /* renamed from: f, reason: collision with root package name */
    protected final Class<D> f21510f;

    /* renamed from: g, reason: collision with root package name */
    protected D f21511g;

    /* renamed from: h, reason: collision with root package name */
    protected h<T, K> f21512h;

    /* renamed from: i, reason: collision with root package name */
    protected i f21513i;

    /* renamed from: j, reason: collision with root package name */
    protected o4.a<K, T> f21514j;

    public b(Class<D> cls) {
        this(cls, true);
    }

    protected void f() {
        o4.a<K, T> aVar = this.f21514j;
        if (aVar != null) {
            aVar.clear();
            org.greenrobot.greendao.e.a("Identity scope cleared");
        } else {
            org.greenrobot.greendao.e.a("No identity scope to clear");
        }
    }

    protected void g() {
        d(this.f21511g.getTablename());
    }

    public void h(o4.a<K, T> aVar) {
        this.f21514j = aVar;
    }

    protected void i() throws Exception {
        try {
            this.f21510f.getMethod("createTable", org.greenrobot.greendao.database.a.class, Boolean.TYPE).invoke(null, this.f21520c, Boolean.FALSE);
        } catch (NoSuchMethodException unused) {
            org.greenrobot.greendao.e.f("No createTable method");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.test.f
    public void setUp() throws Exception {
        super.setUp();
        try {
            i();
            h<T, K> hVar = new h<>(this.f21520c, this.f21510f, this.f21514j);
            this.f21512h = hVar;
            this.f21511g = hVar.a();
        } catch (Exception e5) {
            throw new RuntimeException("Could not prepare DAO Test", e5);
        }
    }

    public b(Class<D> cls, boolean z4) {
        super(z4);
        this.f21510f = cls;
    }
}

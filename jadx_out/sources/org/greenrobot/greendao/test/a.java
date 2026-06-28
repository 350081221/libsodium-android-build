package org.greenrobot.greendao.test;

import org.greenrobot.greendao.b;
import org.greenrobot.greendao.c;

/* loaded from: classes4.dex */
public abstract class a<T extends org.greenrobot.greendao.b, S extends org.greenrobot.greendao.c> extends f {

    /* renamed from: f, reason: collision with root package name */
    private final Class<T> f21507f;

    /* renamed from: g, reason: collision with root package name */
    protected T f21508g;

    /* renamed from: h, reason: collision with root package name */
    protected S f21509h;

    public a(Class<T> cls) {
        this(cls, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.test.f
    public void setUp() throws Exception {
        super.setUp();
        try {
            this.f21508g = this.f21507f.getConstructor(org.greenrobot.greendao.database.a.class).newInstance(this.f21520c);
            this.f21507f.getMethod("createAllTables", org.greenrobot.greendao.database.a.class, Boolean.TYPE).invoke(null, this.f21520c, Boolean.FALSE);
            this.f21509h = (S) this.f21508g.newSession();
        } catch (Exception e5) {
            throw new RuntimeException("Could not prepare DAO session test", e5);
        }
    }

    public a(Class<T> cls, boolean z4) {
        super(z4);
        this.f21507f = cls;
    }
}

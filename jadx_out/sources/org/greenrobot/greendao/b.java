package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class b {
    protected final Map<Class<? extends a<?, ?>>, org.greenrobot.greendao.internal.a> daoConfigMap = new HashMap();
    protected final org.greenrobot.greendao.database.a db;
    protected final int schemaVersion;

    public b(org.greenrobot.greendao.database.a aVar, int i5) {
        this.db = aVar;
        this.schemaVersion = i5;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract c newSession();

    public abstract c newSession(o4.d dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void registerDaoClass(Class<? extends a<?, ?>> cls) {
        this.daoConfigMap.put(cls, new org.greenrobot.greendao.internal.a(this.db, cls));
    }
}

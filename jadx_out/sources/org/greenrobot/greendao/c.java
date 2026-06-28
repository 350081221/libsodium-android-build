package org.greenrobot.greendao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.query.k;
import rx.schedulers.Schedulers;

/* loaded from: classes4.dex */
public class c {
    private final org.greenrobot.greendao.database.a db;
    private final Map<Class<?>, a<?, ?>> entityToDao = new HashMap();
    private volatile org.greenrobot.greendao.rx.d rxTxIo;
    private volatile org.greenrobot.greendao.rx.d rxTxPlain;

    public c(org.greenrobot.greendao.database.a aVar) {
        this.db = aVar;
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
        this.db.beginTransaction();
        try {
            V call = callable.call();
            this.db.setTransactionSuccessful();
            return call;
        } finally {
            this.db.endTransaction();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.db.beginTransaction();
        try {
            try {
                V call = callable.call();
                this.db.setTransactionSuccessful();
                return call;
            } catch (Exception e5) {
                throw new d("Callable failed", e5);
            }
        } finally {
            this.db.endTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t5) {
        getDao(t5.getClass()).delete(t5);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<a<?, ?>> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public a<?, ?> getDao(Class<? extends Object> cls) {
        a<?, ?> aVar = this.entityToDao.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new d("No DAO registered for " + cls);
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t5) {
        return getDao(t5.getClass()).insert(t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t5) {
        return getDao(t5.getClass()).insertOrReplace(t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T, K> T load(Class<T> cls, K k5) {
        return (T) getDao(cls).load(k5);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> k<T> queryBuilder(Class<T> cls) {
        return (k<T>) getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t5) {
        getDao(t5.getClass()).refresh(t5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> void registerDao(Class<T> cls, a<T, ?> aVar) {
        this.entityToDao.put(cls, aVar);
    }

    public void runInTx(Runnable runnable) {
        this.db.beginTransaction();
        try {
            runnable.run();
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    @m4.b
    public org.greenrobot.greendao.rx.d rxTx() {
        if (this.rxTxIo == null) {
            this.rxTxIo = new org.greenrobot.greendao.rx.d(this, Schedulers.io());
        }
        return this.rxTxIo;
    }

    @m4.b
    public org.greenrobot.greendao.rx.d rxTxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new org.greenrobot.greendao.rx.d(this);
        }
        return this.rxTxPlain;
    }

    public org.greenrobot.greendao.async.e startAsyncSession() {
        return new org.greenrobot.greendao.async.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t5) {
        getDao(t5.getClass()).update(t5);
    }
}

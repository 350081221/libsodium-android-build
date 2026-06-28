package org.greenrobot.greendao;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.j;
import org.greenrobot.greendao.query.k;
import rx.schedulers.Schedulers;

/* loaded from: classes4.dex */
public abstract class a<T, K> {
    protected final org.greenrobot.greendao.internal.a config;
    protected final org.greenrobot.greendao.database.a db;
    protected final o4.a<K, T> identityScope;
    protected final o4.b<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile org.greenrobot.greendao.rx.b<T, K> rxDao;
    private volatile org.greenrobot.greendao.rx.b<T, K> rxDaoPlain;
    protected final c session;
    protected final org.greenrobot.greendao.internal.e statements;

    public a(org.greenrobot.greendao.internal.a aVar) {
        this(aVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void deleteByKeyInsideSynchronized(K k5, org.greenrobot.greendao.database.c cVar) {
        if (k5 instanceof Long) {
            cVar.bindLong(1, ((Long) k5).longValue());
        } else if (k5 != 0) {
            cVar.bindString(1, k5.toString());
        } else {
            throw new d("Cannot delete entity, key is null");
        }
        cVar.execute();
    }

    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        o4.a<K, T> aVar;
        assertSinglePk();
        org.greenrobot.greendao.database.c b5 = this.statements.b();
        this.db.beginTransaction();
        try {
            synchronized (b5) {
                o4.a<K, T> aVar2 = this.identityScope;
                if (aVar2 != null) {
                    aVar2.c();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            K keyVerified = getKeyVerified(it.next());
                            deleteByKeyInsideSynchronized(keyVerified, b5);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                    } catch (Throwable th) {
                        o4.a<K, T> aVar3 = this.identityScope;
                        if (aVar3 != null) {
                            aVar3.a();
                        }
                        throw th;
                    }
                }
                if (iterable2 != null) {
                    for (K k5 : iterable2) {
                        deleteByKeyInsideSynchronized(k5, b5);
                        if (arrayList != null) {
                            arrayList.add(k5);
                        }
                    }
                }
                o4.a<K, T> aVar4 = this.identityScope;
                if (aVar4 != null) {
                    aVar4.a();
                }
            }
            this.db.setTransactionSuccessful();
            if (arrayList != null && (aVar = this.identityScope) != null) {
                aVar.b(arrayList);
            }
        } finally {
            this.db.endTransaction();
        }
    }

    private long executeInsert(T t5, org.greenrobot.greendao.database.c cVar, boolean z4) {
        long insertInsideTx;
        if (this.db.isDbLockedByCurrentThread()) {
            insertInsideTx = insertInsideTx(t5, cVar);
        } else {
            this.db.beginTransaction();
            try {
                insertInsideTx = insertInsideTx(t5, cVar);
                this.db.setTransactionSuccessful();
            } finally {
                this.db.endTransaction();
            }
        }
        if (z4) {
            updateKeyAfterInsertAndAttach(t5, insertInsideTx, true);
        }
        return insertInsideTx;
    }

    private void executeInsertInTx(org.greenrobot.greendao.database.c cVar, Iterable<T> iterable, boolean z4) {
        this.db.beginTransaction();
        try {
            synchronized (cVar) {
                o4.a<K, T> aVar = this.identityScope;
                if (aVar != null) {
                    aVar.c();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.a();
                        for (T t5 : iterable) {
                            bindValues(sQLiteStatement, (SQLiteStatement) t5);
                            if (z4) {
                                updateKeyAfterInsertAndAttach(t5, sQLiteStatement.executeInsert(), false);
                            } else {
                                sQLiteStatement.execute();
                            }
                        }
                    } else {
                        for (T t6 : iterable) {
                            bindValues(cVar, (org.greenrobot.greendao.database.c) t6);
                            if (z4) {
                                updateKeyAfterInsertAndAttach(t6, cVar.executeInsert(), false);
                            } else {
                                cVar.execute();
                            }
                        }
                    }
                } finally {
                    o4.a<K, T> aVar2 = this.identityScope;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            }
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    private long insertInsideTx(T t5, org.greenrobot.greendao.database.c cVar) {
        synchronized (cVar) {
            if (this.isStandardSQLite) {
                SQLiteStatement sQLiteStatement = (SQLiteStatement) cVar.a();
                bindValues(sQLiteStatement, (SQLiteStatement) t5);
                return sQLiteStatement.executeInsert();
            }
            bindValues(cVar, (org.greenrobot.greendao.database.c) t5);
            return cVar.executeInsert();
        }
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i5 = 0;
        while (true) {
            list.add(loadCurrent(cursor, 0, false));
            int i6 = i5 + 1;
            if (i6 >= startPosition) {
                CursorWindow moveToNextUnlocked = moveToNextUnlocked(cursor);
                if (moveToNextUnlocked != null) {
                    startPosition = moveToNextUnlocked.getStartPosition() + moveToNextUnlocked.getNumRows();
                } else {
                    return;
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i5 = i6 + 1;
        }
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
        this.identityScope.a();
        try {
            if (cursor.moveToNext()) {
                return ((CrossProcessCursor) cursor).getWindow();
            }
            this.identityScope.c();
            return null;
        } finally {
            this.identityScope.c();
        }
    }

    protected void assertSinglePk() {
        if (this.config.f21365e.length == 1) {
            return;
        }
        throw new d(this + " (" + this.config.f21362b + ") does not have a single-column primary key");
    }

    protected void attachEntity(T t5) {
    }

    protected final void attachEntity(K k5, T t5, boolean z4) {
        attachEntity(t5);
        o4.a<K, T> aVar = this.identityScope;
        if (aVar != null && k5 != null) {
            if (z4) {
                aVar.put(k5, t5);
            } else {
                aVar.d(k5, t5);
            }
        }
    }

    protected abstract void bindValues(SQLiteStatement sQLiteStatement, T t5);

    protected abstract void bindValues(org.greenrobot.greendao.database.c cVar, T t5);

    public long count() {
        return this.statements.a().simpleQueryForLong();
    }

    public void delete(T t5) {
        assertSinglePk();
        deleteByKey(getKeyVerified(t5));
    }

    public void deleteAll() {
        this.db.execSQL("DELETE FROM '" + this.config.f21362b + "'");
        o4.a<K, T> aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void deleteByKey(K k5) {
        assertSinglePk();
        org.greenrobot.greendao.database.c b5 = this.statements.b();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (b5) {
                deleteByKeyInsideSynchronized(k5, b5);
            }
        } else {
            this.db.beginTransaction();
            try {
                synchronized (b5) {
                    deleteByKeyInsideSynchronized(k5, b5);
                }
                this.db.setTransactionSuccessful();
            } finally {
                this.db.endTransaction();
            }
        }
        o4.a<K, T> aVar = this.identityScope;
        if (aVar != null) {
            aVar.remove(k5);
        }
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        deleteInTxInternal(null, iterable);
    }

    public void deleteInTx(Iterable<T> iterable) {
        deleteInTxInternal(iterable, null);
    }

    public boolean detach(T t5) {
        if (this.identityScope != null) {
            return this.identityScope.g(getKeyVerified(t5), t5);
        }
        return false;
    }

    public void detachAll() {
        o4.a<K, T> aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public String[] getAllColumns() {
        return this.config.f21364d;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract K getKey(T t5);

    protected K getKeyVerified(T t5) {
        K key = getKey(t5);
        if (key == null) {
            if (t5 == null) {
                throw new NullPointerException("Entity may not be null");
            }
            throw new d("Entity has no key");
        }
        return key;
    }

    public String[] getNonPkColumns() {
        return this.config.f21366f;
    }

    public String[] getPkColumns() {
        return this.config.f21365e;
    }

    public i getPkProperty() {
        return this.config.f21367g;
    }

    public i[] getProperties() {
        return this.config.f21363c;
    }

    public c getSession() {
        return this.session;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public org.greenrobot.greendao.internal.e getStatements() {
        return this.config.f21369i;
    }

    public String getTablename() {
        return this.config.f21362b;
    }

    protected abstract boolean hasKey(T t5);

    public long insert(T t5) {
        return executeInsert(t5, this.statements.d(), true);
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(T t5) {
        return executeInsert(t5, this.statements.c(), true);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z4) {
        executeInsertInTx(this.statements.c(), iterable, z4);
    }

    public long insertWithoutSettingPk(T t5) {
        return executeInsert(t5, this.statements.c(), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean isEntityUpdateable();

    public T load(K k5) {
        T t5;
        assertSinglePk();
        if (k5 == null) {
            return null;
        }
        o4.a<K, T> aVar = this.identityScope;
        if (aVar != null && (t5 = aVar.get(k5)) != null) {
            return t5;
        }
        return loadUniqueAndCloseCursor(this.db.b(this.statements.f(), new String[]{k5.toString()}));
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.db.b(this.statements.e(), null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.List<T> loadAllFromCursor(android.database.Cursor r7) {
        /*
            r6 = this;
            int r0 = r7.getCount()
            if (r0 != 0) goto Lc
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r2 = r7 instanceof android.database.CrossProcessCursor
            r3 = 0
            if (r2 == 0) goto L4d
            r2 = r7
            android.database.CrossProcessCursor r2 = (android.database.CrossProcessCursor) r2
            android.database.CursorWindow r2 = r2.getWindow()
            if (r2 == 0) goto L4e
            int r4 = r2.getNumRows()
            if (r4 != r0) goto L2c
            org.greenrobot.greendao.internal.b r7 = new org.greenrobot.greendao.internal.b
            r7.<init>(r2)
            r4 = 1
            goto L4f
        L2c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Window vs. result size: "
            r4.append(r5)
            int r5 = r2.getNumRows()
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            org.greenrobot.greendao.e.a(r4)
            goto L4e
        L4d:
            r2 = 0
        L4e:
            r4 = r3
        L4f:
            boolean r5 = r7.moveToFirst()
            if (r5 == 0) goto L8b
            o4.a<K, T> r5 = r6.identityScope
            if (r5 == 0) goto L61
            r5.c()
            o4.a<K, T> r5 = r6.identityScope
            r5.f(r0)
        L61:
            if (r4 != 0) goto L6d
            if (r2 == 0) goto L6d
            o4.a<K, T> r0 = r6.identityScope     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L6d
            r6.loadAllUnlockOnWindowBounds(r7, r2, r1)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L6d:
            java.lang.Object r0 = r6.loadCurrent(r7, r3, r3)     // Catch: java.lang.Throwable -> L82
            r1.add(r0)     // Catch: java.lang.Throwable -> L82
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L6d
        L7a:
            o4.a<K, T> r7 = r6.identityScope
            if (r7 == 0) goto L8b
            r7.a()
            goto L8b
        L82:
            r7 = move-exception
            o4.a<K, T> r0 = r6.identityScope
            if (r0 == 0) goto L8a
            r0.a()
        L8a:
            throw r7
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.greendao.a.loadAllFromCursor(android.database.Cursor):java.util.List");
    }

    public T loadByRowId(long j5) {
        return loadUniqueAndCloseCursor(this.db.b(this.statements.g(), new String[]{Long.toString(j5)}));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T loadCurrent(Cursor cursor, int i5, boolean z4) {
        T e5;
        T k5;
        if (this.identityScopeLong != null) {
            if (i5 != 0 && cursor.isNull(this.pkOrdinal + i5)) {
                return null;
            }
            long j5 = cursor.getLong(this.pkOrdinal + i5);
            o4.b<T> bVar = this.identityScopeLong;
            if (z4) {
                k5 = bVar.j(j5);
            } else {
                k5 = bVar.k(j5);
            }
            if (k5 != null) {
                return k5;
            }
            T readEntity = readEntity(cursor, i5);
            attachEntity(readEntity);
            if (z4) {
                this.identityScopeLong.n(j5, readEntity);
            } else {
                this.identityScopeLong.o(j5, readEntity);
            }
            return readEntity;
        }
        if (this.identityScope != null) {
            K readKey = readKey(cursor, i5);
            if (i5 != 0 && readKey == null) {
                return null;
            }
            o4.a<K, T> aVar = this.identityScope;
            if (z4) {
                e5 = aVar.get(readKey);
            } else {
                e5 = aVar.e(readKey);
            }
            if (e5 != null) {
                return e5;
            }
            T readEntity2 = readEntity(cursor, i5);
            attachEntity(readKey, readEntity2, z4);
            return readEntity2;
        }
        if (i5 != 0 && readKey(cursor, i5) == null) {
            return null;
        }
        T readEntity3 = readEntity(cursor, i5);
        attachEntity(readEntity3);
        return readEntity3;
    }

    protected final <O> O loadCurrentOther(a<O, ?> aVar, Cursor cursor, int i5) {
        return aVar.loadCurrent(cursor, i5, true);
    }

    protected T loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new d("Expected unique result, but count was " + cursor.getCount());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public k<T> queryBuilder() {
        return k.p(this);
    }

    public List<T> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.db.b(this.statements.e() + str, strArr));
    }

    public j<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public j<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return j.m(this, this.statements.e() + str, collection.toArray());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T readEntity(Cursor cursor, int i5);

    protected abstract void readEntity(Cursor cursor, T t5, int i5);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract K readKey(Cursor cursor, int i5);

    public void refresh(T t5) {
        assertSinglePk();
        K keyVerified = getKeyVerified(t5);
        Cursor b5 = this.db.b(this.statements.f(), new String[]{keyVerified.toString()});
        try {
            if (b5.moveToFirst()) {
                if (b5.isLast()) {
                    readEntity(b5, t5, 0);
                    attachEntity(keyVerified, t5, true);
                    return;
                } else {
                    throw new d("Expected unique result, but count was " + b5.getCount());
                }
            }
            throw new d("Entity does not exist in the database anymore: " + t5.getClass() + " with key " + keyVerified);
        } finally {
            b5.close();
        }
    }

    @m4.b
    public org.greenrobot.greendao.rx.b<T, K> rx() {
        if (this.rxDao == null) {
            this.rxDao = new org.greenrobot.greendao.rx.b<>(this, Schedulers.io());
        }
        return this.rxDao;
    }

    @m4.b
    public org.greenrobot.greendao.rx.b<T, K> rxPlain() {
        if (this.rxDaoPlain == null) {
            this.rxDaoPlain = new org.greenrobot.greendao.rx.b<>(this);
        }
        return this.rxDaoPlain;
    }

    public void save(T t5) {
        if (hasKey(t5)) {
            update(t5);
        } else {
            insert(t5);
        }
    }

    public void saveInTx(T... tArr) {
        saveInTx(Arrays.asList(tArr));
    }

    public void update(T t5) {
        assertSinglePk();
        org.greenrobot.greendao.database.c i5 = this.statements.i();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (i5) {
                if (this.isStandardSQLite) {
                    updateInsideSynchronized((a<T, K>) t5, (SQLiteStatement) i5.a(), true);
                } else {
                    updateInsideSynchronized((a<T, K>) t5, i5, true);
                }
            }
            return;
        }
        this.db.beginTransaction();
        try {
            synchronized (i5) {
                updateInsideSynchronized((a<T, K>) t5, i5, true);
            }
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public void updateInTx(Iterable<T> iterable) {
        org.greenrobot.greendao.database.c i5 = this.statements.i();
        this.db.beginTransaction();
        try {
            synchronized (i5) {
                o4.a<K, T> aVar = this.identityScope;
                if (aVar != null) {
                    aVar.c();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) i5.a();
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            updateInsideSynchronized((a<T, K>) it.next(), sQLiteStatement, false);
                        }
                    } else {
                        Iterator<T> it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            updateInsideSynchronized((a<T, K>) it2.next(), i5, false);
                        }
                    }
                } finally {
                    o4.a<K, T> aVar2 = this.identityScope;
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            }
            this.db.setTransactionSuccessful();
            try {
                this.db.endTransaction();
                e = null;
            } catch (RuntimeException e5) {
                throw e5;
            }
        } catch (RuntimeException e6) {
            e = e6;
            try {
                this.db.endTransaction();
            } catch (RuntimeException e7) {
                e.m("Could not end transaction (rethrowing initial exception)", e7);
                throw e;
            }
        } catch (Throwable th) {
            try {
                this.db.endTransaction();
                throw th;
            } catch (RuntimeException e8) {
                throw e8;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void updateInsideSynchronized(T t5, org.greenrobot.greendao.database.c cVar, boolean z4) {
        bindValues(cVar, (org.greenrobot.greendao.database.c) t5);
        int length = this.config.f21364d.length + 1;
        Object key = getKey(t5);
        if (key instanceof Long) {
            cVar.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            cVar.bindString(length, key.toString());
        } else {
            throw new d("Cannot update entity without key - was it inserted before?");
        }
        cVar.execute();
        attachEntity(key, t5, z4);
    }

    protected abstract K updateKeyAfterInsert(T t5, long j5);

    protected void updateKeyAfterInsertAndAttach(T t5, long j5, boolean z4) {
        if (j5 != -1) {
            attachEntity(updateKeyAfterInsert(t5, j5), t5, z4);
        } else {
            e.l("Could not insert row (executeInsert returned -1)");
        }
    }

    public a(org.greenrobot.greendao.internal.a aVar, c cVar) {
        this.config = aVar;
        this.session = cVar;
        org.greenrobot.greendao.database.a aVar2 = aVar.f21361a;
        this.db = aVar2;
        this.isStandardSQLite = aVar2.a() instanceof SQLiteDatabase;
        o4.b<T> bVar = (o4.a<K, T>) aVar.c();
        this.identityScope = bVar;
        if (bVar instanceof o4.b) {
            this.identityScopeLong = bVar;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = aVar.f21369i;
        i iVar = aVar.f21367g;
        this.pkOrdinal = iVar != null ? iVar.f21356a : -1;
    }

    public void deleteByKeyInTx(K... kArr) {
        deleteInTxInternal(null, Arrays.asList(kArr));
    }

    public void deleteInTx(T... tArr) {
        deleteInTxInternal(Arrays.asList(tArr), null);
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void saveInTx(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            if (hasKey(it.next())) {
                i5++;
            } else {
                i6++;
            }
        }
        if (i5 <= 0 || i6 <= 0) {
            if (i6 > 0) {
                insertInTx(iterable);
                return;
            } else {
                if (i5 > 0) {
                    updateInTx(iterable);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList(i5);
        ArrayList arrayList2 = new ArrayList(i6);
        for (T t5 : iterable) {
            if (hasKey(t5)) {
                arrayList.add(t5);
            } else {
                arrayList2.add(t5);
            }
        }
        this.db.beginTransaction();
        try {
            updateInTx(arrayList);
            insertInTx(arrayList2);
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public void insertInTx(Iterable<T> iterable, boolean z4) {
        executeInsertInTx(this.statements.d(), iterable, z4);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void updateInsideSynchronized(T t5, SQLiteStatement sQLiteStatement, boolean z4) {
        bindValues(sQLiteStatement, (SQLiteStatement) t5);
        int length = this.config.f21364d.length + 1;
        Object key = getKey(t5);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new d("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        attachEntity(key, t5, z4);
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }
}

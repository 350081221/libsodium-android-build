package org.greenrobot.greendao.database;

import net.sqlcipher.database.SQLiteStatement;

/* loaded from: classes4.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteStatement f21344a;

    public e(SQLiteStatement sQLiteStatement) {
        this.f21344a = sQLiteStatement;
    }

    @Override // org.greenrobot.greendao.database.c
    public Object a() {
        return this.f21344a;
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindBlob(int i5, byte[] bArr) {
        this.f21344a.bindBlob(i5, bArr);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindDouble(int i5, double d5) {
        this.f21344a.bindDouble(i5, d5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindLong(int i5, long j5) {
        this.f21344a.bindLong(i5, j5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindNull(int i5) {
        this.f21344a.bindNull(i5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindString(int i5, String str) {
        this.f21344a.bindString(i5, str);
    }

    @Override // org.greenrobot.greendao.database.c
    public void clearBindings() {
        this.f21344a.clearBindings();
    }

    @Override // org.greenrobot.greendao.database.c
    public void close() {
        this.f21344a.close();
    }

    @Override // org.greenrobot.greendao.database.c
    public void execute() {
        this.f21344a.execute();
    }

    @Override // org.greenrobot.greendao.database.c
    public long executeInsert() {
        return this.f21344a.executeInsert();
    }

    @Override // org.greenrobot.greendao.database.c
    public long simpleQueryForLong() {
        return this.f21344a.simpleQueryForLong();
    }
}

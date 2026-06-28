package org.greenrobot.greendao.database;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes4.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteStatement f21346a;

    public g(SQLiteStatement sQLiteStatement) {
        this.f21346a = sQLiteStatement;
    }

    @Override // org.greenrobot.greendao.database.c
    public Object a() {
        return this.f21346a;
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindBlob(int i5, byte[] bArr) {
        this.f21346a.bindBlob(i5, bArr);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindDouble(int i5, double d5) {
        this.f21346a.bindDouble(i5, d5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindLong(int i5, long j5) {
        this.f21346a.bindLong(i5, j5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindNull(int i5) {
        this.f21346a.bindNull(i5);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindString(int i5, String str) {
        this.f21346a.bindString(i5, str);
    }

    @Override // org.greenrobot.greendao.database.c
    public void clearBindings() {
        this.f21346a.clearBindings();
    }

    @Override // org.greenrobot.greendao.database.c
    public void close() {
        this.f21346a.close();
    }

    @Override // org.greenrobot.greendao.database.c
    public void execute() {
        this.f21346a.execute();
    }

    @Override // org.greenrobot.greendao.database.c
    public long executeInsert() {
        return this.f21346a.executeInsert();
    }

    @Override // org.greenrobot.greendao.database.c
    public long simpleQueryForLong() {
        return this.f21346a.simpleQueryForLong();
    }
}

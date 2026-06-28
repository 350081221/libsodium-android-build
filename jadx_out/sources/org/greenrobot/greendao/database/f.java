package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes4.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f21345a;

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f21345a = sQLiteDatabase;
    }

    @Override // org.greenrobot.greendao.database.a
    public Object a() {
        return this.f21345a;
    }

    @Override // org.greenrobot.greendao.database.a
    public Cursor b(String str, String[] strArr) {
        return this.f21345a.rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.a
    public void beginTransaction() {
        this.f21345a.beginTransaction();
    }

    public SQLiteDatabase c() {
        return this.f21345a;
    }

    @Override // org.greenrobot.greendao.database.a
    public void close() {
        this.f21345a.close();
    }

    @Override // org.greenrobot.greendao.database.a
    public c compileStatement(String str) {
        return new g(this.f21345a.compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.a
    public void endTransaction() {
        this.f21345a.endTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str) throws SQLException {
        this.f21345a.execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean inTransaction() {
        return this.f21345a.inTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isDbLockedByCurrentThread() {
        return this.f21345a.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isOpen() {
        return this.f21345a.isOpen();
    }

    @Override // org.greenrobot.greendao.database.a
    public void setTransactionSuccessful() {
        this.f21345a.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.f21345a.execSQL(str, objArr);
    }
}

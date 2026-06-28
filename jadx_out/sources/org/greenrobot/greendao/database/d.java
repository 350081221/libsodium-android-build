package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.SQLException;
import net.sqlcipher.database.SQLiteDatabase;

/* loaded from: classes4.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f21343a;

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f21343a = sQLiteDatabase;
    }

    @Override // org.greenrobot.greendao.database.a
    public Object a() {
        return this.f21343a;
    }

    @Override // org.greenrobot.greendao.database.a
    public Cursor b(String str, String[] strArr) {
        return this.f21343a.rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.a
    public void beginTransaction() {
        this.f21343a.beginTransaction();
    }

    public SQLiteDatabase c() {
        return this.f21343a;
    }

    @Override // org.greenrobot.greendao.database.a
    public void close() {
        this.f21343a.close();
    }

    @Override // org.greenrobot.greendao.database.a
    public c compileStatement(String str) {
        return new e(this.f21343a.compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.a
    public void endTransaction() {
        this.f21343a.endTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str) throws SQLException {
        this.f21343a.execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean inTransaction() {
        return this.f21343a.inTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isDbLockedByCurrentThread() {
        return this.f21343a.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isOpen() {
        return this.f21343a.isOpen();
    }

    @Override // org.greenrobot.greendao.database.a
    public void setTransactionSuccessful() {
        this.f21343a.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str, Object[] objArr) throws SQLException {
        this.f21343a.execSQL(str, objArr);
    }
}

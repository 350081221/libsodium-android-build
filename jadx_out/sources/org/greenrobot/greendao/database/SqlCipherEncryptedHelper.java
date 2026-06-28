package org.greenrobot.greendao.database;

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;
import org.greenrobot.greendao.database.b;

/* loaded from: classes4.dex */
class SqlCipherEncryptedHelper extends SQLiteOpenHelper implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f21342a;

    public SqlCipherEncryptedHelper(b bVar, Context context, String str, int i5, boolean z4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i5);
        this.f21342a = bVar;
        if (z4) {
            SQLiteDatabase.loadLibs(context);
        }
    }

    private a h(SQLiteDatabase sQLiteDatabase) {
        return new d(sQLiteDatabase);
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a a(String str) {
        return h(getReadableDatabase(str));
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a b(String str) {
        return h(getWritableDatabase(str));
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a c(char[] cArr) {
        return h(getReadableDatabase(cArr));
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a d(char[] cArr) {
        return h(getWritableDatabase(cArr));
    }

    public void e(SQLiteDatabase sQLiteDatabase) {
        this.f21342a.onCreate(h(sQLiteDatabase));
    }

    public void f(SQLiteDatabase sQLiteDatabase) {
        this.f21342a.onOpen(h(sQLiteDatabase));
    }

    public void g(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        this.f21342a.onUpgrade(h(sQLiteDatabase), i5, i6);
    }
}

package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.SQLException;

/* loaded from: classes4.dex */
public interface a {
    Object a();

    Cursor b(String str, String[] strArr);

    void beginTransaction();

    void close();

    c compileStatement(String str);

    void endTransaction();

    void execSQL(String str) throws SQLException;

    void execSQL(String str, Object[] objArr) throws SQLException;

    boolean inTransaction();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    void setTransactionSuccessful();
}

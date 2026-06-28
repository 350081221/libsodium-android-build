package com.huawei.agconnect.apms.instrument;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.i0;

/* loaded from: classes3.dex */
public class SQLiteInstrumentation {
    public static int delete(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.delete(str, str2, strArr);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#delete"), i0.DATABASE);
        int delete = sQLiteDatabase.delete(str, str2, strArr);
        TraceManager.exitMethod();
        return delete;
    }

    public static void execSQL(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        if (Agent.isDisabled()) {
            sQLiteDatabase.execSQL(str);
            return;
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#execSQL"), i0.DATABASE);
        sQLiteDatabase.execSQL(str);
        TraceManager.exitMethod();
    }

    public static long insert(SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.insert(str, str2, contentValues);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#insert"), i0.DATABASE);
        long insert = sQLiteDatabase.insert(str, str2, contentValues);
        TraceManager.exitMethod();
        return insert;
    }

    public static long insertOrThrow(SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) throws SQLException {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.insertOrThrow(str, str2, contentValues);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#insertOrThrow"), i0.DATABASE);
        long insertOrThrow = sQLiteDatabase.insertOrThrow(str, str2, contentValues);
        TraceManager.exitMethod();
        return insertOrThrow;
    }

    public static long insertWithOnConflict(SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues, int i5) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, i5);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#insertWithOnConflict"), i0.DATABASE);
        long insertWithOnConflict = sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, i5);
        TraceManager.exitMethod();
        return insertWithOnConflict;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.query(z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#query"), i0.DATABASE);
        Cursor query = sQLiteDatabase.query(z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceManager.exitMethod();
        return query;
    }

    public static Cursor queryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.queryWithFactory(cursorFactory, z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#queryWithFactory"), i0.DATABASE);
        Cursor queryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, z4, str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceManager.exitMethod();
        return queryWithFactory;
    }

    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.rawQuery(str, strArr);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#rawQuery"), i0.DATABASE);
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr);
        TraceManager.exitMethod();
        return rawQuery;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#rawQueryWithFactory"), i0.DATABASE);
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2);
        TraceManager.exitMethod();
        return rawQueryWithFactory;
    }

    public static long replace(SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.replace(str, str2, contentValues);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#replace"), i0.DATABASE);
        long replace = sQLiteDatabase.replace(str, str2, contentValues);
        TraceManager.exitMethod();
        return replace;
    }

    public static long replaceOrThrow(SQLiteDatabase sQLiteDatabase, String str, String str2, ContentValues contentValues) throws SQLException {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.replaceOrThrow(str, str2, contentValues);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#replaceOrThrow"), i0.DATABASE);
        long replaceOrThrow = sQLiteDatabase.replaceOrThrow(str, str2, contentValues);
        TraceManager.exitMethod();
        return replaceOrThrow;
    }

    public static int update(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#update"), i0.DATABASE);
        int update = sQLiteDatabase.update(str, contentValues, str2, strArr);
        TraceManager.exitMethod();
        return update;
    }

    public static int updateWithOnConflict(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues, String str2, String[] strArr, int i5) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.updateWithOnConflict(str, contentValues, str2, strArr, i5);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#updateWithOnConflict"), i0.DATABASE);
        int updateWithOnConflict = sQLiteDatabase.updateWithOnConflict(str, contentValues, str2, strArr, i5);
        TraceManager.exitMethod();
        return updateWithOnConflict;
    }

    public static void execSQL(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) throws SQLException {
        if (Agent.isDisabled()) {
            sQLiteDatabase.execSQL(str, objArr);
            return;
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#execSQL"), i0.DATABASE);
        sQLiteDatabase.execSQL(str, objArr);
        TraceManager.exitMethod();
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.query(z4, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#query"), i0.DATABASE);
        Cursor query = sQLiteDatabase.query(z4, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        TraceManager.exitMethod();
        return query;
    }

    public static Cursor queryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, boolean z4, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, CancellationSignal cancellationSignal) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.queryWithFactory(cursorFactory, z4, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#queryWithFactory"), i0.DATABASE);
        Cursor queryWithFactory = sQLiteDatabase.queryWithFactory(cursorFactory, z4, str, strArr, str2, strArr2, str3, str4, str5, str6, cancellationSignal);
        TraceManager.exitMethod();
        return queryWithFactory;
    }

    public static Cursor rawQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, CancellationSignal cancellationSignal) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.rawQuery(str, strArr, cancellationSignal);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#rawQuery"), i0.DATABASE);
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, strArr, cancellationSignal);
        TraceManager.exitMethod();
        return rawQuery;
    }

    public static Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, SQLiteDatabase.CursorFactory cursorFactory, String str, String[] strArr, String str2, CancellationSignal cancellationSignal) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#rawQueryWithFactory"), i0.DATABASE);
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        TraceManager.exitMethod();
        return rawQueryWithFactory;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#query"), i0.DATABASE);
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5);
        TraceManager.exitMethod();
        return query;
    }

    public static Cursor query(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (Agent.isDisabled()) {
            return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        TraceManager.enterMethod(abc.abc(new StringBuilder(), "SQLiteDatabase#query"), i0.DATABASE);
        Cursor query = sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        TraceManager.exitMethod();
        return query;
    }
}

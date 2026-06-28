package org.greenrobot.greendao.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes4.dex */
public abstract class b extends SQLiteOpenHelper {
    private final Context context;
    private a encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface a {
        org.greenrobot.greendao.database.a a(String str);

        org.greenrobot.greendao.database.a b(String str);

        org.greenrobot.greendao.database.a c(char[] cArr);

        org.greenrobot.greendao.database.a d(char[] cArr);
    }

    public b(Context context, String str, int i5) {
        this(context, str, null, i5);
    }

    private a checkEncryptedHelper() {
        if (this.encryptedHelper == null) {
            try {
                Class.forName("net.sqlcipher.database.SQLiteOpenHelper");
                try {
                    this.encryptedHelper = (a) Class.forName("org.greenrobot.greendao.database.SqlCipherEncryptedHelper").getConstructor(b.class, Context.class, String.class, Integer.TYPE, Boolean.TYPE).newInstance(this, this.context, this.name, Integer.valueOf(this.version), Boolean.valueOf(this.loadSQLCipherNativeLibs));
                } catch (Exception e5) {
                    throw new org.greenrobot.greendao.d(e5);
                }
            } catch (ClassNotFoundException unused) {
                throw new org.greenrobot.greendao.d("Using an encrypted database requires SQLCipher, make sure to add it to dependencies: https://greenrobot.org/greendao/documentation/database-encryption/");
            }
        }
        return this.encryptedHelper;
    }

    public org.greenrobot.greendao.database.a getEncryptedReadableDb(String str) {
        return checkEncryptedHelper().a(str);
    }

    public org.greenrobot.greendao.database.a getEncryptedWritableDb(String str) {
        return checkEncryptedHelper().b(str);
    }

    public org.greenrobot.greendao.database.a getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public org.greenrobot.greendao.database.a getWritableDb() {
        return wrap(getWritableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    public void onCreate(org.greenrobot.greendao.database.a aVar) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    public void onOpen(org.greenrobot.greendao.database.a aVar) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        onUpgrade(wrap(sQLiteDatabase), i5, i6);
    }

    public void onUpgrade(org.greenrobot.greendao.database.a aVar, int i5, int i6) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z4) {
        this.loadSQLCipherNativeLibs = z4;
    }

    protected org.greenrobot.greendao.database.a wrap(SQLiteDatabase sQLiteDatabase) {
        return new f(sQLiteDatabase);
    }

    public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5) {
        super(context, str, cursorFactory, i5);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i5;
    }

    public org.greenrobot.greendao.database.a getEncryptedReadableDb(char[] cArr) {
        return checkEncryptedHelper().c(cArr);
    }

    public org.greenrobot.greendao.database.a getEncryptedWritableDb(char[] cArr) {
        return checkEncryptedHelper().d(cArr);
    }

    @SuppressLint({"NewApi"})
    public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, cursorFactory, i5, databaseErrorHandler);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i5;
    }
}

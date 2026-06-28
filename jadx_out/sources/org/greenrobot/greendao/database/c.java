package org.greenrobot.greendao.database;

/* loaded from: classes4.dex */
public interface c {
    Object a();

    void bindBlob(int i5, byte[] bArr);

    void bindDouble(int i5, double d5);

    void bindLong(int i5, long j5);

    void bindNull(int i5);

    void bindString(int i5, String str);

    void clearBindings();

    void close();

    void execute();

    long executeInsert();

    long simpleQueryForLong();
}

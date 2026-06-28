package com.umeng.cconfig.a;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;

@Instrumented
/* loaded from: classes3.dex */
public final class a extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    private static Context f12895b;

    /* renamed from: a, reason: collision with root package name */
    private String f12896a;

    /* renamed from: com.umeng.cconfig.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0242a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f12897a = new a(a.f12895b, 0);
    }

    private a(Context context) {
        super(context, "cc.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f12896a = null;
    }

    /* synthetic */ a(Context context, byte b5) {
        this(context);
    }

    public static a a(Context context) {
        if (f12895b == null) {
            f12895b = context.getApplicationContext();
        }
        return C0242a.f12897a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f12896a = "create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)";
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)");
            } else {
                sQLiteDatabase.execSQL("create table if not exists __cc(id INTEGER primary key autoincrement, __ts TEXT, __c TEXT, __a TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }
}

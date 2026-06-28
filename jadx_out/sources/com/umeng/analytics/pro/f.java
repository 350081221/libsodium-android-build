package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.e;

/* JADX INFO: Access modifiers changed from: package-private */
@Instrumented
/* loaded from: classes3.dex */
public class f extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    private static Context f12584b;

    /* renamed from: a, reason: collision with root package name */
    private String f12585a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final f f12586a = new f(f.f12584b, h.b(f.f12584b), e.f12518b, null, 2);

        private a() {
        }
    }

    public static f a(Context context) {
        if (f12584b == null) {
            f12584b = context.getApplicationContext();
        }
        return a.f12586a;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f12585a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
            } else {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f12585a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
            } else {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        if (!h.a(sQLiteDatabase, e.d.f12559a, "__av")) {
            h.a(sQLiteDatabase, e.d.f12559a, "__sp", "TEXT");
            h.a(sQLiteDatabase, e.d.f12559a, "__pp", "TEXT");
            h.a(sQLiteDatabase, e.d.f12559a, "__av", "TEXT");
            h.a(sQLiteDatabase, e.d.f12559a, "__vc", "TEXT");
        }
        if (!h.a(sQLiteDatabase, e.b.f12533a, "__av")) {
            h.a(sQLiteDatabase, e.b.f12533a, "__av", "TEXT");
            h.a(sQLiteDatabase, e.b.f12533a, "__vc", "TEXT");
        }
        if (!h.a(sQLiteDatabase, e.a.f12522a, "__av")) {
            h.a(sQLiteDatabase, e.a.f12522a, "__av", "TEXT");
            h.a(sQLiteDatabase, e.a.f12522a, "__vc", "TEXT");
        }
    }

    private void f(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, e.d.f12559a);
        a(sQLiteDatabase, e.b.f12533a);
        a(sQLiteDatabase, e.a.f12522a);
        a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                c(sQLiteDatabase);
                d(sQLiteDatabase);
                b(sQLiteDatabase);
                a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            h.a(f12584b);
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
                return;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        if (i6 > i5 && i5 == 1) {
            try {
                try {
                    e(sQLiteDatabase);
                } catch (Exception unused) {
                    f(sQLiteDatabase);
                }
            } catch (Exception unused2) {
                e(sQLiteDatabase);
            }
        }
    }

    private f(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i5) {
        this(new c(context, str), str2, cursorFactory, i5);
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f12585a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
            } else {
                sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    private f(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5) {
        super(context, TextUtils.isEmpty(str) ? e.f12518b : str, cursorFactory, i5);
        this.f12585a = null;
        a();
    }

    public void a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!h.a(e.d.f12559a, writableDatabase)) {
                c(writableDatabase);
            }
            if (!h.a(e.c.f12546a, writableDatabase)) {
                d(writableDatabase);
            }
            if (!h.a(e.b.f12533a, writableDatabase)) {
                b(writableDatabase);
            }
            if (h.a(e.a.f12522a, writableDatabase)) {
                return;
            }
            a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f12585a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
            } else {
                sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            String str2 = "DROP TABLE IF EXISTS " + str;
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, str2);
            } else {
                sQLiteDatabase.execSQL(str2);
            }
        } catch (SQLException unused) {
        }
    }
}

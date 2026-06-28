package com.umeng.analytics.process;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.h;
import java.io.File;

@Instrumented
/* loaded from: classes3.dex */
class b extends SQLiteOpenHelper {
    b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5) {
        super(context, str, cursorFactory, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Context context, String str) {
        String b5 = b(context, str);
        a.f12804h.equals(str);
        return new b(context, b5, null, 1);
    }

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = a.f12804h;
        }
        String str2 = h.b(context) + a.f12797a;
        if (a.f12804h.equals(str)) {
            str2 = h.b(context);
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return String.format(str2 + a.f12801e, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.execSQL(sQLiteDatabase, "create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
            } else {
                sQLiteDatabase.execSQL("create table if not exists __et_p(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __pn TEXT, __av TEXT, __vc TEXT)");
            }
        } catch (SQLException unused) {
        }
    }

    public static String a(Context context) {
        return h.b(context) + a.f12797a;
    }
}

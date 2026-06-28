package com.ss.android.downloadlib.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bm;

@Instrumented
/* loaded from: classes3.dex */
public class b extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    static final String[] f10036a = {bm.f12336d, MediationConstant.EXTRA_ADID, "req_id", CrashHianalyticsData.TIME};

    public b(@Nullable Context context) {
        super(context, "click_event", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "CREATE TABLE IF NOT EXISTS click_event(_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_id INTEGER,req_id TEXT,time INTEGER)");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS click_event(_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_id INTEGER,req_id TEXT,time INTEGER)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS click_event");
        } else {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, "DROP TABLE IF EXISTS click_event");
        }
        onCreate(sQLiteDatabase);
    }
}

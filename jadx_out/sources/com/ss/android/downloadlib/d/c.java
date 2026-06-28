package com.ss.android.downloadlib.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ss.android.downloadlib.addownload.k;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f10037b;

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f10038a;

    private c() {
        try {
            this.f10038a = new b(k.a()).getWritableDatabase();
        } catch (Throwable th) {
            com.ss.android.downloadlib.e.c.a().a(th, "ClickEventHelper");
        }
    }

    public static c a() {
        if (f10037b == null) {
            synchronized (c.class) {
                if (f10037b == null) {
                    f10037b = new c();
                }
            }
        }
        return f10037b;
    }

    public boolean b() {
        return com.ss.android.socialbase.downloader.g.a.c().a("click_event_switch", 0) == 1;
    }

    public boolean c() {
        return com.ss.android.socialbase.downloader.g.a.c().a("click_event_switch", 0) == 2;
    }

    private void c(long j5, String str) {
        SQLiteDatabase sQLiteDatabase = this.f10038a;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j5 <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String optString = new JSONObject(str).optString("req_id");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j5), optString};
            SQLiteDatabase sQLiteDatabase2 = this.f10038a;
            if (sQLiteDatabase2 instanceof SQLiteDatabase) {
                SQLiteInstrumentation.delete(sQLiteDatabase2, "click_event", "time < ? AND ad_id = ? AND req_id = ?", strArr);
            } else {
                sQLiteDatabase2.delete("click_event", "time < ? AND ad_id = ? AND req_id = ?", strArr);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean b(long j5, String str) {
        SQLiteDatabase sQLiteDatabase = this.f10038a;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j5 <= 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        Cursor cursor = null;
        try {
            try {
                String optString = new JSONObject(str).optString("req_id");
                if (TextUtils.isEmpty(optString)) {
                    return false;
                }
                String[] strArr = {String.valueOf(System.currentTimeMillis() - 1209600000), String.valueOf(j5), optString};
                SQLiteDatabase sQLiteDatabase2 = this.f10038a;
                String[] strArr2 = b.f10036a;
                cursor = !(sQLiteDatabase2 instanceof SQLiteDatabase) ? sQLiteDatabase2.query("click_event", strArr2, "time > ? AND ad_id = ? AND req_id = ?", strArr, null, null, null, null) : SQLiteInstrumentation.query(sQLiteDatabase2, "click_event", strArr2, "time > ? AND ad_id = ? AND req_id = ?", strArr, null, null, null, null);
                boolean z4 = cursor.getCount() > 0;
                cursor.close();
                return z4;
            } catch (Exception e5) {
                e5.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void a(long j5, String str) {
        String optString;
        SQLiteDatabase sQLiteDatabase = this.f10038a;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen() || j5 <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            optString = new JSONObject(str).optString("req_id");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(MediationConstant.EXTRA_ADID, Long.valueOf(j5));
        contentValues.put("req_id", optString);
        contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(System.currentTimeMillis()));
        SQLiteDatabase sQLiteDatabase2 = this.f10038a;
        if (sQLiteDatabase2 instanceof SQLiteDatabase) {
            SQLiteInstrumentation.insert(sQLiteDatabase2, "click_event", null, contentValues);
        } else {
            sQLiteDatabase2.insert("click_event", null, contentValues);
        }
        c(j5, str);
    }
}

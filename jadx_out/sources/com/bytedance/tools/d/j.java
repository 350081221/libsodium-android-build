package com.bytedance.tools.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f6314a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f6315b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f6316c;

    /* renamed from: d, reason: collision with root package name */
    public static List<String> f6317d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6318a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6319b;

        a(String str, String str2) {
            this.f6318a = str;
            this.f6319b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            new m1.a().e(this.f6318a, this.f6319b);
        }
    }

    private static String a() {
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < f6317d.size(); i5++) {
            jSONArray.put(f6317d.get(i5));
        }
        return jSONArray.toString();
    }

    public static String b(Context context) {
        if (!TextUtils.isEmpty(f6316c)) {
            return f6316c;
        }
        if (context != null) {
            try {
                f6316c = context.getPackageName();
            } catch (Throwable unused) {
            }
        }
        return f6316c;
    }

    public static void c(Context context, String str) {
        try {
            JSONObject h5 = h(context, str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DatabaseFileArchive.COLUMN_KEY, "test_tool_data");
            jSONObject.put(bi.f12279y, c.c(context).get(4).i());
            if (str.equals("test_tool_slot_info")) {
                jSONObject.put("adslot_id_list", a());
            }
            e(context, h5, jSONObject);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    public static void d(Context context, String str, String str2, String str3, String str4) {
        try {
            JSONObject h5 = h(context, str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DatabaseFileArchive.COLUMN_KEY, "test_tool_data");
            jSONObject.put(bi.f12279y, c.c(context).get(4).i());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("adslot_id", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("aid", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("cid", str4);
            }
            e(context, h5, jSONObject);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    private static void e(Context context, JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("event_extra", jSONObject2.toString());
        jSONArray.put(jSONObject);
        jSONObject3.put("stats_list", jSONArray);
        i(context, b.e(jSONObject3).toString());
    }

    public static void f(List<com.bytedance.tools.c.d> list) {
        f6317d.clear();
        for (int i5 = 0; i5 < list.size(); i5++) {
            f6317d.add(list.get(i5).f6301a);
        }
    }

    public static String g(Context context) {
        if (TextUtils.isEmpty(f6315b) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(b(context), 0);
                f6314a = String.valueOf(packageInfo.versionCode);
                f6315b = packageInfo.versionName;
            } catch (Throwable unused) {
            }
        }
        return f6315b;
    }

    private static JSONObject h(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        List<com.bytedance.tools.c.a> c5 = c.c(context);
        try {
            jSONObject.put("ad_sdk_version", c5.get(0).i());
            jSONObject.put("appid", c5.get(2).i());
            jSONObject.put("type", str);
            jSONObject.put("app_version", g(context));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(bi.f12269o, c5.get(1).i());
            jSONObject2.put(bi.f12278x, 1);
            jSONObject2.put("oaid", c5.get(7).i());
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("imei", c5.get(6).i());
            jSONObject2.put("vendor", Build.MANUFACTURER);
            jSONObject2.put("applog_did", g.g(context));
            jSONObject.put("device_info", jSONObject2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    private static void i(Context context, String str) {
        new Thread(new a("https://" + g.f(context) + "/api/ad/union/sdk/stats/batch/", str)).start();
    }
}

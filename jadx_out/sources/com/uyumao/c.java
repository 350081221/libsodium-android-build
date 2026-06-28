package com.uyumao;

import android.content.Context;
import android.util.Log;
import com.umeng.analytics.pro.au;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13643a = false;

    /* renamed from: b, reason: collision with root package name */
    public static h f13644b;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(android.content.Context r9, com.uyumao.i r10, org.json.JSONArray r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.c.a(android.content.Context, com.uyumao.i, org.json.JSONArray):org.json.JSONObject");
    }

    public static void a(Context context, JSONObject jSONObject, boolean z4) {
        if (jSONObject == null) {
            Log.e("UYMInnerManager", "JSONObject in sendInitData() is null.");
            return;
        }
        String a5 = k.a(context, "https://yumao.puata.info/anti_logs", jSONObject.toString());
        Log.d("UYMInnerManager", "msg: " + a5 + "; json: " + jSONObject);
        if (a5 == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(a5);
            if (jSONObject2.has(au.f12195c)) {
                context.getSharedPreferences("uyumao_info", 0).edit().putString(au.f12195c, jSONObject2.optString(au.f12195c)).apply();
            }
            if (z4) {
                if (jSONObject2.has("resp_code") && jSONObject2.optInt("resp_code") == 0) {
                    context.getSharedPreferences("uyumao_info", 0).edit().putBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), true).apply();
                }
                e.a(new File(context.getCacheDir() + File.separator + "net_change"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

package com.umeng.analytics.pro;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class al {
    public static JSONObject a(Context context, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            ak akVar = new ak();
            String uMId = UMUtils.getUMId(context);
            if (TextUtils.isEmpty(uMId)) {
                return null;
            }
            akVar.a(uMId);
            String appkey = UMUtils.getAppkey(context);
            if (TextUtils.isEmpty(appkey)) {
                return null;
            }
            akVar.b(appkey);
            akVar.c(UMUtils.getAppVersionName(context));
            akVar.d("9.6.5");
            akVar.e(UMUtils.getChannel(context));
            akVar.f(Build.VERSION.SDK_INT + "");
            akVar.g(Build.BRAND);
            akVar.h(Build.MODEL);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            akVar.i(localeInfo[1]);
            akVar.j(localeInfo[0]);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            akVar.b(Integer.valueOf(resolutionArray[1]));
            akVar.a(Integer.valueOf(resolutionArray[0]));
            akVar.k(ap.a(context, "install_datetime", ""));
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e5) {
                e = e5;
            }
            try {
                jSONObject.put(ak.f12136a, akVar.a());
                jSONObject.put(ak.f12138c, akVar.c());
                jSONObject.put(ak.f12137b, akVar.b());
                jSONObject.put(ak.f12139d, akVar.d());
                jSONObject.put(ak.f12140e, akVar.e());
                jSONObject.put(ak.f12141f, akVar.f());
                jSONObject.put(ak.f12142g, akVar.g());
                jSONObject.put(ak.f12143h, akVar.h());
                jSONObject.put(ak.f12146k, akVar.k());
                jSONObject.put(ak.f12145j, akVar.j());
                jSONObject.put(ak.f12147l, akVar.l());
                jSONObject.put(ak.f12144i, akVar.i());
                jSONObject.put(ak.f12148m, akVar.m());
                jSONObject.put(bi.al, UMUtils.getZid(context));
                jSONObject.put(EventType.PLATFORM, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
                jSONObject.put("optional", new JSONObject(ap.a()));
                String[] split = str.split("@");
                if (split.length == 4) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        String str2 = split[1];
                        jSONObject.put("s1", parseLong);
                        jSONObject.put("s2", str2);
                    } catch (Throwable unused) {
                    }
                }
                try {
                    String str3 = Build.BRAND;
                    String a5 = aq.a(str3);
                    String b5 = aq.b(str3);
                    if (!TextUtils.isEmpty(a5) && !TextUtils.isEmpty(b5)) {
                        jSONObject.put(ak.f12149n, a5);
                        jSONObject.put(ak.f12150o, b5);
                    } else {
                        jSONObject.put(ak.f12149n, "Android");
                        jSONObject.put(ak.f12150o, Build.VERSION.RELEASE);
                    }
                } catch (Throwable unused2) {
                }
                return jSONObject;
            } catch (JSONException e6) {
                e = e6;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + e.getMessage());
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject2 = jSONObject;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + th.getMessage());
                return jSONObject2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static JSONObject a(Context context, int i5, JSONArray jSONArray, String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String zid = UMUtils.getZid(context);
                if (TextUtils.isEmpty(zid)) {
                    return jSONObject2;
                }
                jSONObject2.put("atoken", zid);
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject2.put("device_token", deviceToken);
                }
                jSONObject2.put("model", Build.MODEL);
                jSONObject2.put(bi.f12278x, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
                jSONObject2.put(bi.f12279y, Build.VERSION.RELEASE);
                jSONObject2.put(com.umeng.ccg.a.f12836o, str);
                jSONObject2.put(com.umeng.ccg.a.f12839r, jSONArray);
                jSONObject2.put("e", i5);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }
}

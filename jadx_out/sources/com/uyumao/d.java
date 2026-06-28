package com.uyumao;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.g;
import com.uyumao.sdk.UYMManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f13645a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f13646b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f13647c = true;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f13648d = true;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f13649e = true;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f13650f = true;

    /* renamed from: g, reason: collision with root package name */
    public static Context f13651g = null;

    /* renamed from: h, reason: collision with root package name */
    public static JSONObject f13652h = null;

    /* renamed from: i, reason: collision with root package name */
    public static JSONObject f13653i = null;

    /* renamed from: j, reason: collision with root package name */
    public static JSONObject f13654j = null;

    /* renamed from: k, reason: collision with root package name */
    public static JSONObject f13655k = null;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f13656l = false;

    /* renamed from: m, reason: collision with root package name */
    public static Map<String, Integer> f13657m;

    /* renamed from: n, reason: collision with root package name */
    public static LocationListener f13658n;

    /* loaded from: classes3.dex */
    public static class a implements LocationListener {
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            double d5;
            boolean unused = d.f13656l = true;
            try {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                long time = location.getTime();
                double d6 = 0.0d;
                if (location.hasAltitude()) {
                    d5 = location.getAltitude();
                } else {
                    d5 = 0.0d;
                }
                if (location.hasSpeed()) {
                    d6 = location.getSpeed();
                }
                JSONObject jSONObject = new JSONObject();
                d.f13654j = jSONObject;
                jSONObject.put(com.umeng.analytics.pro.d.C, latitude);
                d.f13654j.put(com.umeng.analytics.pro.d.D, longitude);
                d.f13654j.put("alt", d5);
                d.f13654j.put("acc", d6);
                d.f13654j.put("lts", time);
                g.a(d.f13651g, 203, e.f13662a, d.f13655k);
            } catch (Throwable unused2) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i5, Bundle bundle) {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13659a;

        public b(d dVar, String str) {
            this.f13659a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.f13651g, "https://yumao.puata.info/cc_info", this.f13659a);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13660a;

        public c(d dVar, String str) {
            this.f13660a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.f13651g, "https://yumao.puata.info/cc_info", this.f13660a);
        }
    }

    /* renamed from: com.uyumao.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0256d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13661a;

        public RunnableC0256d(d dVar, String str) {
            this.f13661a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.a(d.f13651g, "https://yumao.puata.info/cc_info", this.f13661a);
        }
    }

    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13662a = new d();
    }

    static {
        HashMap hashMap = new HashMap();
        f13657m = hashMap;
        hashMap.put(com.umeng.ccg.a.f12823b, 101);
        f13657m.put(com.umeng.ccg.a.f12824c, 102);
        f13657m.put(com.umeng.ccg.a.f12825d, 103);
        f13657m.put(com.umeng.ccg.a.f12826e, 104);
        f13658n = new a();
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Object optString = jSONObject2.optString(com.umeng.ccg.a.f12836o);
                String optString2 = jSONObject2.optString(com.umeng.ccg.a.f12839r);
                jSONObject.put(com.umeng.ccg.a.f12836o, optString);
                String[] split = optString2.split(",");
                JSONArray jSONArray = new JSONArray();
                for (String str : split) {
                    jSONArray.put(str);
                }
                jSONObject.put(com.umeng.ccg.a.f12839r, jSONArray);
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONObject a(Context context) {
        JSONObject jSONObject = f13652h;
        if (jSONObject != null && jSONObject.length() > 0) {
            return f13652h;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(bi.f12278x, "Android");
            jSONObject2.put("dm", Build.MODEL);
            jSONObject2.put(y0.a.f22655w, DeviceConfig.getAppVersionName(context));
            jSONObject2.put(bi.f12261g, UMUtils.getUMId(context));
            jSONObject2.put("ov", Build.VERSION.RELEASE);
            jSONObject2.put("chn", UMUtils.getChannel(context));
            if (UMUtils.getActiveUser(context) != null && UMUtils.getActiveUser(context).length == 2) {
                jSONObject2.put(com.umeng.analytics.pro.d.N, UMUtils.getActiveUser(context)[1]);
            } else {
                jSONObject2.put(com.umeng.analytics.pro.d.N, "");
            }
            jSONObject2.put(bi.al, UMUtils.getZid(context));
            jSONObject2.put(y0.a.f22652t, UYMManager.getSdkVersion());
            jSONObject2.put("ak", UMUtils.getAppkey(context));
            jSONObject2.put("idfa", DeviceConfig.getIdfa(context));
            jSONObject2.put("db", Build.BRAND);
            jSONObject2.put("aid", DeviceConfig.getAndroidId(context));
            jSONObject2.put("oaid", DeviceConfig.getOaid(context));
            jSONObject2.put("imei", DeviceConfig.getImeiNew(context));
            jSONObject2.put("boa", Build.BOARD);
            jSONObject2.put("mant", Build.TIME);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject2.put("ct", localeInfo[0]);
            jSONObject2.put("lang", localeInfo[1]);
            jSONObject2.put("tz", DeviceConfig.getTimeZone(context));
            jSONObject2.put("pkg", DeviceConfig.getPackageName(context));
            jSONObject2.put("disn", DeviceConfig.getAppName(context));
            String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", NetworkUtil.NETWORK_TYPE_WIFI);
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", "2G/3G");
            } else {
                jSONObject2.put("ac", "unknown");
            }
            if (!"".equals(networkAccessMode[1])) {
                jSONObject2.put("ast", networkAccessMode[1]);
            }
            jSONObject2.put("nt", DeviceConfig.getNetworkType(context));
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject2.put("device_token", deviceToken);
            }
            f13652h = jSONObject2;
        } catch (Throwable unused) {
        }
        return f13652h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b9, code lost:
    
        if (r5.contains("network") != false) goto L53;
     */
    @Override // com.uyumao.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r19, int r20) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.d.a(java.lang.Object, int):void");
    }
}

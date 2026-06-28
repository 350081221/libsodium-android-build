package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.a;
import com.umeng.commonsdk.internal.utils.d;
import com.umeng.commonsdk.internal.utils.j;
import com.umeng.commonsdk.internal.utils.k;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    public static void a(Context context) {
        try {
            ULog.i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bi.aQ, a.f13124e);
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, d(context), UMServerURL.PATH_ANALYTICS, "i", a.f13124e);
            if (buildEnvelopeWithExtHeader == null || buildEnvelopeWithExtHeader.has("exception")) {
                return;
            }
            ULog.i("walle", "[internal] workEvent send envelope back, result is ok");
        } catch (Exception e5) {
            UMCrashManager.reportCrash(context, e5);
        }
    }

    public static void b(Context context) {
        ULog.i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            j(context);
        }
    }

    public static void c(Context context) {
        ULog.i("walle", "[internal] begin by stateful--->>>");
        if (context == null || !UMEnvelopeBuild.getTransmissionSendFlag()) {
            return;
        }
        j(context);
    }

    public static JSONObject d(Context context) {
        JSONObject b5;
        JSONArray h5;
        JSONObject a5;
        JSONArray l5;
        JSONArray k5;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.J) && (k5 = k(applicationContext)) != null && k5.length() > 0) {
                    jSONObject2.put("rs", k5);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.ao) && (l5 = l(applicationContext)) != null && l5.length() > 0) {
                    jSONObject2.put("by", l5);
                }
            } catch (Exception e6) {
                UMCrashManager.reportCrash(applicationContext, e6);
            }
            try {
                a(applicationContext, jSONObject2);
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                b(applicationContext, jSONObject2);
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.ap) && (a5 = a()) != null && a5.length() > 0) {
                    jSONObject2.put("build", a5);
                }
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                JSONObject e10 = e(applicationContext);
                if (e10 != null && e10.length() > 0) {
                    jSONObject2.put("scr", e10);
                }
            } catch (Exception e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
            try {
                JSONObject f5 = f(applicationContext);
                if (f5 != null && f5.length() > 0) {
                    jSONObject2.put("sinfo", f5);
                }
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                JSONArray g5 = g(applicationContext);
                if (g5 != null && g5.length() > 0) {
                    jSONObject2.put("input", g5);
                }
            } catch (Exception e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
            try {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.ag) && (h5 = h(applicationContext)) != null && h5.length() > 0) {
                    jSONObject2.put("appls", h5);
                }
            } catch (Exception e14) {
                UMCrashManager.reportCrash(applicationContext, e14);
            }
            try {
                JSONObject i5 = i(applicationContext);
                if (i5 != null && i5.length() > 0) {
                    jSONObject2.put("mem", i5);
                }
            } catch (Exception e15) {
                UMCrashManager.reportCrash(applicationContext, e15);
            }
            try {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.aq) && (b5 = b()) != null && b5.length() > 0) {
                    jSONObject2.put(bi.f12277w, b5);
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put(bi.ax, jSONObject2);
            } catch (JSONException e16) {
                UMCrashManager.reportCrash(applicationContext, e16);
            }
        }
        return jSONObject;
    }

    public static JSONObject e(Context context) {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", com.umeng.commonsdk.internal.utils.a.c(context));
                jSONObject.put("a_nav_h", com.umeng.commonsdk.internal.utils.a.d(context));
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    jSONObject.put("a_den", displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(context, e5);
            }
        }
        return jSONObject;
    }

    public static JSONObject f(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", com.umeng.commonsdk.internal.utils.a.a(applicationContext, packageName));
                jSONObject.put("a_alut", com.umeng.commonsdk.internal.utils.a.b(applicationContext, packageName));
                jSONObject.put("a_c", com.umeng.commonsdk.internal.utils.a.c(applicationContext, packageName));
                jSONObject.put("a_uid", com.umeng.commonsdk.internal.utils.a.d(applicationContext, packageName));
                if (com.umeng.commonsdk.internal.utils.a.a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", com.umeng.commonsdk.internal.utils.a.b());
                jSONObject.put("s_fs", com.umeng.commonsdk.internal.utils.a.a(applicationContext));
                jSONObject.put("a_meid", DeviceConfig.getMeid(applicationContext));
                jSONObject.put("a_imsi", DeviceConfig.getImsi(applicationContext));
                jSONObject.put("st", com.umeng.commonsdk.internal.utils.a.c());
                String simICCID = DeviceConfig.getSimICCID(applicationContext);
                if (!TextUtils.isEmpty(simICCID)) {
                    try {
                        jSONObject.put("a_iccid", simICCID);
                    } catch (Exception unused) {
                    }
                }
                String secondSimIMEi = DeviceConfig.getSecondSimIMEi(applicationContext);
                if (!TextUtils.isEmpty(secondSimIMEi)) {
                    try {
                        jSONObject.put("a_simei", secondSimIMEi);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", com.umeng.commonsdk.internal.utils.a.d());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
        }
        return jSONObject;
    }

    public static JSONArray g(Context context) {
        Context applicationContext;
        List<InputMethodInfo> f5;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (f5 = com.umeng.commonsdk.internal.utils.a.f((applicationContext = context.getApplicationContext()))) != null) {
            for (InputMethodInfo inputMethodInfo : f5) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_id", inputMethodInfo.getId());
                    jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(applicationContext, th);
                }
            }
        }
        return jSONArray;
    }

    public static JSONArray h(Context context) {
        Context applicationContext;
        List<a.C0245a> g5;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (g5 = com.umeng.commonsdk.internal.utils.a.g((applicationContext = context.getApplicationContext()))) != null && !g5.isEmpty()) {
            for (a.C0245a c0245a : g5) {
                if (c0245a != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", c0245a.f13170a);
                        jSONObject.put("a_la", c0245a.f13171b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e5) {
                        UMCrashManager.reportCrash(applicationContext, e5);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject i(Context context) {
        Context applicationContext;
        ActivityManager.MemoryInfo h5;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (h5 = com.umeng.commonsdk.internal.utils.a.h((applicationContext = context.getApplicationContext()))) != null) {
            try {
                jSONObject.put(bi.aL, h5.totalMem);
                jSONObject.put("f", h5.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
        }
        return jSONObject;
    }

    private static void j(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, a.f13125f, b.a(context).a(), null, 5000L);
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, a.f13141v, b.a(context).a(), null, 5000L);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    private static JSONArray k(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            for (int i5 = 0; i5 < runningServices.size(); i5++) {
                if (runningServices.get(i5) != null && runningServices.get(i5).service != null && runningServices.get(i5).service.getClassName() != null && runningServices.get(i5).service.getPackageName() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i5).service.getClassName().toString());
                        jSONObject.put("pn", runningServices.get(i5).service.getPackageName().toString());
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ts", System.currentTimeMillis());
                    jSONObject2.put("ls", jSONArray);
                } catch (JSONException unused2) {
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sers", jSONObject2);
                } catch (JSONException unused3) {
                }
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONArray2.put(jSONObject3);
                    return jSONArray2;
                } catch (Throwable th) {
                    th = th;
                    jSONArray = jSONArray2;
                    UMCrashManager.reportCrash(context, th);
                    return jSONArray;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static JSONArray l(Context context) {
        JSONArray jSONArray = new JSONArray();
        String a5 = j.a(context);
        if (!TextUtils.isEmpty(a5)) {
            try {
                jSONArray.put(new JSONObject(a5));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    private static JSONObject b() {
        try {
            d.a a5 = com.umeng.commonsdk.internal.utils.d.a();
            if (a5 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", a5.f13184a);
                jSONObject.put("pla", a5.f13185b);
                jSONObject.put("cpus", a5.f13186c);
                jSONObject.put("fea", a5.f13187d);
                jSONObject.put(au.f12195c, a5.f13188e);
                jSONObject.put("arc", a5.f13189f);
                jSONObject.put("var", a5.f13190g);
                jSONObject.put("par", a5.f13191h);
                jSONObject.put("rev", a5.f13192i);
                jSONObject.put("har", a5.f13193j);
                jSONObject.put("rev", a5.f13194k);
                jSONObject.put("ser", a5.f13195l);
                jSONObject.put("cur_cpu", com.umeng.commonsdk.internal.utils.d.d());
                jSONObject.put("max_cpu", com.umeng.commonsdk.internal.utils.d.b());
                jSONObject.put("min_cpu", com.umeng.commonsdk.internal.utils.d.c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        a(jSONObject, TypedValues.TransitionType.S_TO, packageManager.hasSystemFeature("android.hardware.touchscreen"));
        a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    private static void a(JSONObject jSONObject, String str, boolean z4) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (z4) {
                jSONObject.put(str, 1);
            } else {
                jSONObject.put(str, 0);
            }
        } catch (Exception unused) {
        }
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            jSONObject.put("a_rv", Build.getRadioVersion());
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            JSONArray jSONArray = new JSONArray();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                if (i6 >= strArr.length) {
                    break;
                }
                jSONArray.put(strArr[i6]);
                i6++;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("a_s32", jSONArray);
            }
            JSONArray jSONArray2 = new JSONArray();
            int i7 = 0;
            while (true) {
                String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                if (i7 >= strArr2.length) {
                    break;
                }
                jSONArray2.put(strArr2[i7]);
                i7++;
            }
            if (jSONArray2.length() > 0) {
                jSONObject.put("a_s64", jSONArray2);
            }
            JSONArray jSONArray3 = new JSONArray();
            while (true) {
                String[] strArr3 = Build.SUPPORTED_ABIS;
                if (i5 >= strArr3.length) {
                    break;
                }
                jSONArray3.put(strArr3[i5]);
                i5++;
            }
            if (jSONArray3.length() > 0) {
                jSONObject.put("a_sa", jSONArray3);
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            jSONObject.put("a_bos", Build.VERSION.BASE_OS);
            jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
            jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static void b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String a5 = k.a(context);
            if (TextUtils.isEmpty(a5)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(a5);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(k.f13207d)) {
                    jSONObject.put(k.f13207d, jSONObject2.opt(k.f13207d));
                }
                if (jSONObject2.has(k.f13206c)) {
                    jSONObject.put(k.f13206c, jSONObject2.opt(k.f13206c));
                }
                if (jSONObject2.has(k.f13205b)) {
                    jSONObject.put(k.f13205b, jSONObject2.opt(k.f13205b));
                }
            } catch (Exception unused) {
            }
        }
    }
}

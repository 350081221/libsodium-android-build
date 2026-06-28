package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f6695a;

    /* renamed from: b, reason: collision with root package name */
    private static long f6696b;

    /* renamed from: c, reason: collision with root package name */
    private static long f6697c;

    /* renamed from: d, reason: collision with root package name */
    private static long f6698d;

    /* renamed from: e, reason: collision with root package name */
    private static long f6699e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f6700f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f6701g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f6702h;

    /* renamed from: i, reason: collision with root package name */
    private static long f6703i;

    /* renamed from: j, reason: collision with root package name */
    private static long f6704j;

    /* renamed from: k, reason: collision with root package name */
    private static int f6705k;

    /* renamed from: l, reason: collision with root package name */
    private static List<EfsJSONLog> f6706l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private static Map<String, Long[]> f6707m = new HashMap();

    public static void a(Activity activity, String str, boolean z4) {
        long currentTimeMillis;
        Context applicationContext;
        String name;
        int i5;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_CREATE)) {
            if (z4) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onCreate");
                }
                f6698d = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_RE_START)) {
            if (z4 && f6705k == 0) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onRestart");
                }
                f6699e = System.currentTimeMillis();
                f6701g = true;
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_START)) {
            if (z4) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStart");
                }
                f6705k++;
                f6702h = true;
                return;
            }
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.PAGE_ON_RESUME)) {
            if (TextUtils.equals(str, LaunchManager.PAGE_ON_STOP) && z4) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStop");
                }
                f6705k--;
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "onResume");
        }
        if (f6700f) {
            f6700f = false;
            long currentTimeMillis2 = System.currentTimeMillis();
            long j14 = currentTimeMillis2 - f6697c;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "loadTime is ".concat(String.valueOf(j14)));
            }
            long j15 = currentTimeMillis2 - f6695a;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "======>>>>>> coldTime is ".concat(String.valueOf(j15)));
            }
            int i6 = !c.d(activity.getApplicationContext()) ? 1 : 0;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "type is ".concat(String.valueOf(i6)));
            }
            a(activity.getApplicationContext(), i6, activity.getClass().getName(), j15, f6695a, f6696b, f6703i, f6697c, f6704j, currentTimeMillis2, j14, 0L, 0L, f6707m);
        } else if (f6705k == 1) {
            if (f6701g) {
                f6701g = false;
                j13 = System.currentTimeMillis() - f6699e;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> hotTime is ".concat(String.valueOf(j13)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i5 = 2;
                j5 = 0;
                j6 = 0;
                j7 = 0;
                j8 = 0;
                j9 = 0;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                currentTimeMillis = 0;
            } else if (f6702h) {
                currentTimeMillis = System.currentTimeMillis() - f6698d;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> warmTime is ".concat(String.valueOf(currentTimeMillis)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i5 = 3;
                j5 = 0;
                j6 = 0;
                j7 = 0;
                j8 = 0;
                j9 = 0;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                j13 = 0;
            }
            a(applicationContext, i5, name, j5, j6, j7, j8, j9, j10, j11, j12, j13, currentTimeMillis, f6707m);
        }
        f6702h = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r24, int r25, java.lang.String r26, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, java.util.Map<java.lang.String, java.lang.Long[]> r47) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.b.a(android.content.Context, int, java.lang.String, long, long, long, long, long, long, long, long, long, long, java.util.Map):void");
    }

    public static void a(Context context, String str) {
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "begin sendLaunchCache");
        }
        if (str == null || TextUtils.isEmpty(str)) {
            str = c.a(context);
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(UMCrash.KEY_HEADER_UMID, str);
        if (LaunchManager.getReporter() != null) {
            LaunchManager.getReporter().addPublicParams(hashMap);
        }
        String b5 = c.b(context);
        if (b5 != null && !TextUtils.isEmpty(b5)) {
            try {
                JSONObject jSONObject = new JSONObject(b5);
                jSONObject.put(UMCrash.KEY_HEADER_UMID, str);
                if (a(jSONObject)) {
                    c.c(context);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        List<EfsJSONLog> list = f6706l;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EfsJSONLog efsJSONLog : f6706l) {
            if (efsJSONLog != null) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "send cache launch report --->>> " + efsJSONLog.generateString());
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                }
            }
        }
        f6706l.clear();
        f6706l = null;
    }

    public static void a(String str, long j5) {
        Map<String, Long[]> map = f6707m;
        if (map == null || map.containsKey(str) || f6707m.size() >= 10) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name already exists or over quantity !");
            }
        } else {
            Long[] lArr = new Long[2];
            lArr[0] = Long.valueOf(j5);
            f6707m.put(str, lArr);
        }
    }

    public static void a(String str, boolean z4) {
        if (TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
            if (!TextUtils.equals(str, LaunchManager.APP_ON_CREATE) || z4) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f6697c = currentTimeMillis;
            f6704j = currentTimeMillis - f6696b;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "buildTime is " + f6704j);
                return;
            }
            return;
        }
        if (z4) {
            f6695a = System.currentTimeMillis();
            f6700f = true;
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        f6696b = currentTimeMillis2;
        f6703i = currentTimeMillis2 - f6695a;
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "initTime is " + f6703i);
        }
    }

    private static boolean a(JSONObject jSONObject) {
        try {
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", jSONObject.opt("w_type"));
            efsJSONLog.put("w_url", jSONObject.opt("w_url"));
            efsJSONLog.put("l_version", jSONObject.opt("l_version"));
            efsJSONLog.put("wl_avgv", jSONObject.opt("wl_avgv"));
            efsJSONLog.put("wd_init", jSONObject.opt("wd_init"));
            efsJSONLog.put("wd_inittm", jSONObject.opt("wd_inittm"));
            efsJSONLog.put("wl_init", jSONObject.opt("wl_init"));
            efsJSONLog.put("wd_build", jSONObject.opt("wd_build"));
            efsJSONLog.put("wd_buildtm", jSONObject.opt("wd_buildtm"));
            efsJSONLog.put("wl_build", jSONObject.opt("wl_build"));
            efsJSONLog.put("wd_page", jSONObject.opt("wd_page"));
            efsJSONLog.put("wd_pagetm", jSONObject.opt("wd_pagetm"));
            efsJSONLog.put("wl_page", jSONObject.opt("wl_page"));
            efsJSONLog.put("userExtra", jSONObject.opt("userExtra"));
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "send cache cold launch report --->>> " + efsJSONLog.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter == null) {
                return false;
            }
            reporter.send(efsJSONLog);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b(String str, long j5) {
        Map<String, Long[]> map = f6707m;
        if (map == null || !map.containsKey(str)) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name non-existent or over quantity !");
            }
        } else {
            Long[] lArr = f6707m.get(str);
            lArr[1] = Long.valueOf(j5);
            f6707m.put(str, lArr);
        }
    }
}

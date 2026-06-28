package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.e;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.o;
import com.umeng.analytics.pro.y;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class u implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12745a = "session_start_time";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12746b = "session_end_time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12747c = "session_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12748d = "pre_session_id";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12749e = "a_start_time";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12750f = "a_end_time";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12751g = "fg_count";

    /* renamed from: h, reason: collision with root package name */
    private static String f12752h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Context f12753i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f12754j = false;

    /* renamed from: k, reason: collision with root package name */
    private static long f12755k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f12756l = true;

    /* renamed from: m, reason: collision with root package name */
    private static long f12757m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final u f12758a = new u();

        private a() {
        }
    }

    public static u a() {
        return a.f12758a;
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12753i);
        if (sharedPreferences != null) {
            long j5 = sharedPreferences.getLong(f12751g, 0L);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putLong(f12751g, j5 + 1);
                edit.commit();
            }
        }
    }

    private void d(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putLong(f12751g, 0L);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private String e(Context context) {
        if (f12753i == null && context != null) {
            f12753i = context.getApplicationContext();
        }
        String d5 = y.a().d(f12753i);
        try {
            f(context);
            o.a(f12753i).d((Object) null);
        } catch (Throwable unused) {
        }
        return d5;
    }

    private void f(Context context) {
        o.a(context).b(context);
        o.a(context).d();
    }

    public void c(Context context, Object obj) {
        try {
            if (f12753i == null && context != null) {
                f12753i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f12749e, 0L) == 0) {
                MLog.e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + longValue);
            edit.putLong(f12750f, longValue);
            edit.putLong(f12746b, longValue);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private u() {
        y.a().a(this);
    }

    public static long a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f12751g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void a(Context context, long j5) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12753i);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(f12745a, j5);
        edit.commit();
    }

    public void b(Context context, Object obj) {
        long longValue;
        try {
            if (f12753i == null) {
                f12753i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                longValue = System.currentTimeMillis();
            } else {
                longValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12753i);
            if (sharedPreferences == null) {
                return;
            }
            f12755k = sharedPreferences.getLong(f12750f, 0L);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f12755k);
            String string = sharedPreferences.getString(d.aF, "");
            String appVersionName = UMUtils.getAppVersionName(f12753i);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                edit.putLong(f12745a, longValue);
                edit.commit();
                o.a(f12753i).a((Object) null, true);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + y.a().c(f12753i));
                f12754j = true;
                a(f12753i, longValue, true);
                return;
            }
            if (y.a().e(f12753i)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f12754j = true;
                edit.putLong(f12745a, longValue);
                edit.commit();
                a(f12753i, longValue, false);
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
            f12754j = false;
        } catch (Throwable unused) {
        }
    }

    public void a(Context context, Object obj) {
        SharedPreferences.Editor edit;
        try {
            if (f12753i == null && context != null) {
                f12753i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12753i);
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(d.aF, "");
            String appVersionName = UMUtils.getAppVersionName(f12753i);
            if (TextUtils.isEmpty(string)) {
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(d.aF, appVersionName);
                edit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i5 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(d.aF, "");
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(d.aF, appVersionName);
                edit.putString("vers_date", string2);
                edit.putString("vers_pre_version", string3);
                edit.putString("cur_version", string4);
                edit.putInt("vers_code", i5);
                edit.putString("vers_name", string);
                edit.commit();
                if (f12756l) {
                    f12756l = false;
                }
                if (f12754j) {
                    f12754j = false;
                    b(f12753i, longValue, true);
                    b(f12753i, longValue);
                    return;
                }
                return;
            }
            if (f12754j) {
                f12754j = false;
                if (f12756l) {
                    f12756l = false;
                }
                f12752h = e(context);
                MLog.d("创建新会话: " + f12752h);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f12752h);
                return;
            }
            f12752h = sharedPreferences.getString("session_id", null);
            edit.putLong(f12749e, longValue);
            edit.putLong(f12750f, 0L);
            edit.commit();
            MLog.d("延续上一个会话: " + f12752h);
            UMRTLog.i(UMRTLog.RTLOG_TAG, "Extend current session: " + f12752h);
            if (f12756l) {
                f12756l = false;
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                    Context context2 = f12753i;
                    UMWorkDispatch.sendEventEx(context2, o.a.E, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            f(context);
            o.a(f12753i).a(false);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public String c(Context context) {
        try {
            if (f12752h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f12752h;
    }

    @Deprecated
    public String c() {
        return c(f12753i);
    }

    public boolean b(Context context, long j5, boolean z4) {
        String a5;
        long j6;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (a5 = y.a().a(f12753i)) == null) {
                return false;
            }
            long j7 = sharedPreferences.getLong(f12749e, 0L);
            long j8 = sharedPreferences.getLong(f12750f, 0L);
            if (j7 <= 0 || j8 != 0) {
                return false;
            }
            try {
                if (z4) {
                    j6 = f12755k;
                    if (j6 == 0) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j5);
                        j6 = j5;
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f12755k);
                    }
                    c(f12753i, Long.valueOf(j6));
                } else {
                    c(f12753i, Long.valueOf(j5));
                    j6 = j5;
                }
                JSONObject jSONObject = new JSONObject();
                if (z4) {
                    jSONObject.put(e.d.a.f12566g, j6);
                } else {
                    jSONObject.put(e.d.a.f12566g, j5);
                }
                JSONObject b5 = com.umeng.analytics.b.a().b();
                if (b5 != null && b5.length() > 0) {
                    jSONObject.put("__sp", b5);
                }
                JSONObject c5 = com.umeng.analytics.b.a().c();
                if (c5 != null && c5.length() > 0) {
                    jSONObject.put("__pp", c5);
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f12757m);
                    jSONObject.put(e.d.a.f12567h, f12757m);
                    f12757m = 0L;
                } else {
                    jSONObject.put(e.d.a.f12567h, 0L);
                }
                i.a(context).a(a5, jSONObject, i.a.END);
                o.a(f12753i).e();
            } catch (Throwable unused) {
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void b(Context context, long j5) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            o.a(f12753i).c((Object) null);
        } catch (Throwable unused) {
        }
    }

    public String a(Context context, long j5, boolean z4) {
        String b5 = y.a().b(context);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + b5);
        if (TextUtils.isEmpty(b5)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j5);
            JSONObject b6 = com.umeng.analytics.b.a().b();
            if (b6 != null && b6.length() > 0) {
                jSONObject.put("__sp", b6);
            }
            JSONObject c5 = com.umeng.analytics.b.a().c();
            if (c5 != null && c5.length() > 0) {
                jSONObject.put("__pp", c5);
            }
            i.a(context).a(b5, jSONObject, i.a.INSTANTSESSIONBEGIN);
            o.a(context).a(jSONObject, z4);
        } catch (Throwable unused) {
        }
        return b5;
    }

    @Deprecated
    public String b() {
        return f12752h;
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(String str, String str2, long j5, long j6, long j7) {
        a(f12753i, str2, j5, j6, j7);
        UMRTLog.i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f12753i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.y.a
    public void a(String str, long j5, long j6, long j7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str, j5);
    }

    private void a(Context context, String str, long j5, long j6, long j7) {
        if (TextUtils.isEmpty(f12752h)) {
            f12752h = y.a().a(f12753i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f12752h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e.d.a.f12566g, j6);
            jSONObject.put(e.d.a.f12567h, j7);
            JSONObject b5 = com.umeng.analytics.b.a().b();
            if (b5 != null && b5.length() > 0) {
                jSONObject.put("__sp", b5);
            }
            JSONObject c5 = com.umeng.analytics.b.a().c();
            if (c5 != null && c5.length() > 0) {
                jSONObject.put("__pp", c5);
            }
            i.a(context).a(f12752h, jSONObject, i.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j5);
            i.a(context).a(str, jSONObject2, i.a.BEGIN);
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
                f12757m = j7;
                d(context);
                Context context2 = f12753i;
                UMWorkDispatch.sendEventEx(context2, o.a.E, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f12752h = str;
    }

    private void a(String str, long j5) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f12753i);
        if (sharedPreferences == null) {
            return;
        }
        long j6 = sharedPreferences.getLong(f12746b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j5);
            jSONObject.put(e.d.a.f12566g, j6);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(d.C, location[0]);
                jSONObject2.put(d.D, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(e.d.a.f12564e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i5 = f12753i.getApplicationInfo().uid;
            if (i5 == -1) {
                return;
            }
            long longValue = ((Long) method.invoke(null, Integer.valueOf(i5))).longValue();
            long longValue2 = ((Long) method2.invoke(null, Integer.valueOf(i5))).longValue();
            if (longValue > 0 && longValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(d.H, longValue);
                jSONObject3.put(d.G, longValue2);
                jSONObject.put(e.d.a.f12563d, jSONObject3);
            }
            i.a(f12753i).a(str, jSONObject, i.a.NEWSESSION);
            v.a(f12753i);
            l.c(f12753i);
        } catch (Throwable unused) {
        }
    }
}

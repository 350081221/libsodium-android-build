package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: c, reason: collision with root package name */
    private static volatile y f12766c;

    /* renamed from: a, reason: collision with root package name */
    private w f12767a = new x();

    /* renamed from: b, reason: collision with root package name */
    private String f12768b;

    /* renamed from: d, reason: collision with root package name */
    private List<a> f12769d;

    /* renamed from: e, reason: collision with root package name */
    private String f12770e;

    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, long j5, long j6, long j7);

        void a(String str, String str2, long j5, long j6, long j7);
    }

    private y() {
    }

    public static y a() {
        if (f12766c == null) {
            synchronized (y.class) {
                if (f12766c == null) {
                    f12766c = new y();
                }
            }
        }
        return f12766c;
    }

    private String f(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString(u.f12748d, d(context));
            edit.commit();
        } catch (Exception unused) {
        }
        long h5 = h(context);
        long i5 = i(context);
        String str = this.f12768b;
        long a5 = u.a(context);
        long j5 = a5 * 5000;
        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count 值完成，count次数：" + a5);
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.E)) {
            if (UMWorkDispatch.eventHasExist()) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，终止checker timer.");
                UMWorkDispatch.removeEvent();
            } else {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** 读取 foreground count druation值完成，无未处理check timer事件。");
            }
        } else {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>*** foreground count druation云控参数关闭。");
        }
        a(i5, h5, j5, str, false);
        this.f12768b = this.f12767a.a(context);
        a(i5, h5, j5, str, true);
        this.f12767a.a(context, this.f12768b);
        return this.f12768b;
    }

    private boolean g(Context context) {
        if (TextUtils.isEmpty(this.f12768b) || i.a(context).a(this.f12768b) <= 0) {
            return false;
        }
        return true;
    }

    private long h(Context context) {
        return a(context, u.f12750f);
    }

    private long i(Context context) {
        return a(context, u.f12745a);
    }

    private boolean j(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(appContext);
            long j5 = sharedPreferences.getLong(u.f12749e, 0L);
            long j6 = sharedPreferences.getLong(u.f12750f, 0L);
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.E) && j5 > 0 && j6 == 0) {
                long a5 = u.a(appContext);
                if (a5 > 0) {
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> last session end time stamp = 0, reconstruct it by foreground count value.");
                    j6 = j5 + (a5 * 5000);
                }
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> interval of last session is: " + (j6 - j5));
            return this.f12767a.a(j5, j6);
        } catch (Exception unused) {
            return false;
        }
    }

    public long b() {
        return this.f12767a.a();
    }

    public String c(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        try {
            this.f12768b = f(appContext);
        } catch (Exception unused) {
        }
        return this.f12768b;
    }

    public String d(Context context) {
        if (TextUtils.isEmpty(this.f12768b)) {
            try {
                this.f12768b = PreferenceWrapper.getDefault(context).getString("session_id", null);
            } catch (Exception unused) {
            }
        }
        return this.f12768b;
    }

    public boolean e(Context context) {
        if (TextUtils.isEmpty(this.f12768b)) {
            this.f12768b = d(context);
        }
        if (!TextUtils.isEmpty(this.f12768b) && !j(context) && !g(context)) {
            return false;
        }
        return true;
    }

    public synchronized String b(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        this.f12768b = d(appContext);
        if (e(appContext)) {
            try {
                this.f12768b = f(appContext);
            } catch (Exception unused) {
            }
        }
        return this.f12768b;
    }

    public void a(long j5) {
        this.f12767a.a(j5);
    }

    public String a(Context context) {
        Context appContext = UMGlobalContext.getAppContext(context);
        if (appContext == null) {
            return "";
        }
        String str = "";
        try {
            synchronized (y.class) {
                str = PreferenceWrapper.getDefault(appContext).getString(u.f12748d, "");
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public void b(a aVar) {
        List<a> list;
        if (aVar == null || (list = this.f12769d) == null || list.size() == 0) {
            return;
        }
        this.f12769d.remove(aVar);
    }

    public String a(Context context, long j5) {
        if (TextUtils.isEmpty(this.f12770e)) {
            String str = "SUB" + j5;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(String.format("%0" + (32 - str.length()) + "d", 0));
            this.f12770e = sb.toString();
        }
        return this.f12770e;
    }

    private long a(Context context, String str) {
        long j5;
        try {
            j5 = PreferenceWrapper.getDefault(context).getLong(str, 0L);
        } catch (Exception unused) {
            j5 = 0;
        }
        return j5 <= 0 ? System.currentTimeMillis() : j5;
    }

    private void a(long j5, long j6, long j7, String str, boolean z4) {
        List<a> list = this.f12769d;
        if (list != null) {
            for (a aVar : list) {
                if (z4) {
                    try {
                        aVar.a(str, this.f12768b, j5, j6, j7);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar.a(this.f12768b, j5, j6, j7);
                }
            }
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f12769d == null) {
            this.f12769d = new ArrayList();
        }
        if (this.f12769d.contains(aVar)) {
            return;
        }
        this.f12769d.add(aVar);
    }
}

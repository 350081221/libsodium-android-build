package com.umeng.powersdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.powersdk.c;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class PowerManager {
    public static final String TAG = "PowerManager";

    /* renamed from: a, reason: collision with root package name */
    private static Context f13577a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13578b = false;

    /* renamed from: c, reason: collision with root package name */
    private static EfsReporter f13579c = null;

    /* renamed from: d, reason: collision with root package name */
    private static PowerConfigManager f13580d = null;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f13577a;
    }

    public static PowerConfigManager getPowerConfigManager() {
        return f13580d;
    }

    public static EfsReporter getReporter() {
        return f13579c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        final c cVar;
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init power manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isInit()) {
            if (isDebug) {
                Log.e(TAG, "invalid init ！");
                return;
            }
            return;
        }
        f13577a = context.getApplicationContext();
        f13579c = efsReporter;
        f13580d = new PowerConfigManager(context, efsReporter);
        f13578b = true;
        cVar = c.a.f13605a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer()) {
                return;
            }
            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("efs_power", 0);
            if (sharedPreferences != null) {
                cVar.f13590b = sharedPreferences.getInt("apm_powerperf_collect_interval", 5);
                cVar.f13591c = sharedPreferences.getInt("apm_powerperf_collect_max_period_sec", 100);
            }
            final HandlerThread handlerThread = new HandlerThread("power-info");
            handlerThread.start();
            final Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.umeng.powersdk.c.1
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (message.what == c.this.f13589a) {
                        try {
                            handlerThread.quit();
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            handler.post(new Runnable() { // from class: com.umeng.powersdk.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final c cVar2 = c.this;
                        final Handler handler2 = handler;
                        final int i5 = cVar2.f13590b;
                        final int i6 = cVar2.f13591c;
                        final long elapsedRealtime = SystemClock.elapsedRealtime();
                        handler2.post(new Runnable() { // from class: com.umeng.powersdk.c.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (c.this.f13593e) {
                                    if (SystemClock.elapsedRealtime() - elapsedRealtime > i6 * 1000) {
                                        handler2.sendEmptyMessage(c.this.f13589a);
                                        return;
                                    }
                                    try {
                                        EfsJSONLog efsJSONLog = new EfsJSONLog("powerperf");
                                        efsJSONLog.put("power", c.this.a());
                                        EfsReporter reporter = PowerManager.getReporter();
                                        if (reporter != null) {
                                            reporter.send(efsJSONLog);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                handler2.postDelayed(this, i5 * 1000);
                            }
                        });
                    } catch (Throwable unused) {
                        handler.sendEmptyMessage(c.this.f13589a);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static boolean isInit() {
        return f13578b;
    }

    public static void onActivityResumed(Activity activity) {
        c cVar;
        cVar = c.a.f13605a;
        try {
            if (getPowerConfigManager() != null && getPowerConfigManager().enableTracer()) {
                cVar.f13592d = new WeakReference<>(activity);
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStarted(Activity activity) {
        c cVar;
        cVar = c.a.f13605a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (cVar.f13595g) {
                cVar.f13595g = false;
                return;
            }
            int i5 = cVar.f13594f + 1;
            cVar.f13594f = i5;
            if (i5 == 1) {
                cVar.f13593e = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void onActivityStopped(Activity activity) {
        c cVar;
        cVar = c.a.f13605a;
        try {
            if (getPowerConfigManager() == null || !getPowerConfigManager().enableTracer() || activity == null) {
                return;
            }
            if (activity.isChangingConfigurations()) {
                cVar.f13595g = true;
                return;
            }
            int i5 = cVar.f13594f - 1;
            cVar.f13594f = i5;
            if (i5 == 0) {
                cVar.f13593e = false;
            }
        } catch (Throwable unused) {
        }
    }
}

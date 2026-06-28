package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.efs.sdk.base.EfsReporter;

/* loaded from: classes3.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* renamed from: a, reason: collision with root package name */
    private static Context f13535a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f13536b = false;

    /* renamed from: c, reason: collision with root package name */
    private static EfsReporter f13537c = null;

    /* renamed from: d, reason: collision with root package name */
    private static PageConfigManger f13538d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f13539e = true;

    /* renamed from: f, reason: collision with root package name */
    private static float f13540f = 0.0f;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f13535a;
    }

    public static PageConfigManger getPageConfigManger() {
        return f13538d;
    }

    public static float getRefreshRate() {
        return f13540f;
    }

    public static EfsReporter getReporter() {
        return f13537c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init page manager error! parameter is null!");
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
            }
        } else {
            f13535a = context.getApplicationContext();
            f13537c = efsReporter;
            f13538d = new PageConfigManger(context, efsReporter);
            f13536b = true;
        }
    }

    public static boolean isControlMainThread() {
        return f13539e;
    }

    public static boolean isInit() {
        return f13536b;
    }

    public static void onTracePageBegin(Activity activity, String str) {
        try {
            onTracePageBegin(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z4) {
        float refreshRate;
        Display display;
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z4 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. parameter illegality!");
                            return;
                        }
                        return;
                    }
                    if (str.length() > 10) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. method name is " + str + "method name over length !");
                            return;
                        }
                        return;
                    }
                    if (f13539e && !e.a(activity.getApplicationContext()) && isDebug) {
                        Log.e(TAG, "tracePageBegin. Non main process !");
                    }
                    String name = activity.getClass().getName();
                    if (f13540f <= 0.0f) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            display = activity.getDisplay();
                            refreshRate = display.getRefreshRate();
                        } else {
                            refreshRate = activity.getWindowManager().getDefaultDisplay().getRefreshRate();
                        }
                        f13540f = refreshRate;
                    }
                    d.a(name, str, z4);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "tracePageBegin. parameter null!");
        }
    }

    public static void onTracePageEnd(Activity activity, String str) {
        try {
            onTracePageEnd(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z4) {
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z4 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. parameter illegality!");
                            return;
                        }
                        return;
                    } else {
                        if (str.length() <= 10) {
                            if (f13539e && !e.a(activity.getApplicationContext()) && isDebug) {
                                Log.e(TAG, "tracePageBegin. Non main process !");
                            }
                            d.b(activity.getClass().getName(), str, z4);
                            return;
                        }
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. method name is " + str + "method name over length !");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "tracePageEnd. parameter null!");
        }
    }

    public static void setControlMainThread(boolean z4) {
        f13539e = z4;
    }
}

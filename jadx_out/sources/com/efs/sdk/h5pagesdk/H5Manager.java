package com.efs.sdk.h5pagesdk;

import android.content.Context;
import android.view.View;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;

/* loaded from: classes2.dex */
public class H5Manager {
    public static final String TAG = "H5Manager";

    /* renamed from: g, reason: collision with root package name */
    private static EfsReporter f6672g = null;

    /* renamed from: h, reason: collision with root package name */
    private static H5ConfigMananger f6673h = null;
    public static boolean isDebug = true;

    public static H5ConfigMananger getH5ConfigMananger() {
        return f6673h;
    }

    public static EfsReporter getReporter() {
        return f6672g;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context != null && efsReporter != null) {
            f6672g = efsReporter;
            f6673h = new H5ConfigMananger(context, efsReporter);
        } else {
            Log.e(TAG, "init H5 manager error! parameter is null!");
        }
    }

    public static void setWebView(View view) {
        H5ConfigMananger h5ConfigMananger;
        if (view != null && (h5ConfigMananger = f6673h) != null) {
            if (!h5ConfigMananger.isH5TracerEnable() && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                if (isDebug) {
                    Log.d(TAG, "未注入JavascriptInterface：H5命中状态=" + f6673h.isH5TracerEnable() + "; 集成测试状态=" + IntegrationTestingUtil.isIntegrationTestingInPeriod());
                    return;
                }
                return;
            }
            UApmJSBridge uApmJSBridge = new UApmJSBridge();
            try {
                Class<?> cls = view.getClass();
                try {
                    Object invoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                    if (invoke != null) {
                        invoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(invoke, Boolean.TRUE);
                    }
                } catch (Throwable unused) {
                }
                cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, uApmJSBridge, "UAPM_JSBridge");
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "webView为null，或H5功能未初始化完成");
        }
    }
}

package com.efs.sdk.base.core.config;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.umcrash.UMCrash;
import i0.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class GlobalInfoManager {

    /* renamed from: a, reason: collision with root package name */
    private GlobalInfo f6548a;

    /* renamed from: b, reason: collision with root package name */
    private Context f6549b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final GlobalInfoManager f6550a = new GlobalInfoManager(0);
    }

    /* synthetic */ GlobalInfoManager(byte b5) {
        this();
    }

    private static String a(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke == null) {
                return null;
            }
            return invoke.toString();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static GlobalInfoManager getInstance() {
        return a.f6550a;
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String a5 = a(this.f6549b);
            if (!TextUtils.isEmpty(a5)) {
                this.f6548a.a(UMCrash.KEY_CALLBACK_SESSION_ID, a5);
            }
        } catch (Throwable th) {
            Log.d("efs.info.manager", "refreshSessionId caused error: " + th.getMessage());
        }
        return this.f6548a;
    }

    public String getNetStatus() {
        return this.f6548a.b(b.f16155k, NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void initGlobalInfo() {
        String lowerCase;
        Log.e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f6548a = globalInfo;
        globalInfo.a("appid", ControllerCenter.getGlobalEnvStruct().getAppid());
        int myPid = ProcessUtil.myPid();
        this.f6548a.a("pid", Integer.valueOf(myPid));
        this.f6548a.a("ps", ProcessUtil.getProcessName(myPid));
        String a5 = d.a(this.f6549b);
        this.f6548a.a("wid", a5);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f6548a.a("uid", a5);
        } else {
            this.f6548a.a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f6548a;
        com.efs.sdk.base.core.a.a.a();
        globalInfo2.a("stime", Long.valueOf(com.efs.sdk.base.core.a.a.b() - Process.getElapsedCpuTime()));
        this.f6548a.a("pkg", PackageUtil.getPackageName(this.f6549b));
        this.f6548a.a("ver", PackageUtil.getAppVersionName(this.f6549b));
        this.f6548a.a("vcode", PackageUtil.getAppVersionCode(this.f6549b));
        this.f6548a.a(HiAnalyticsConstant.BI_KEY_SDK_VER, BuildConfig.VERSION_NAME);
        this.f6548a.a("brand", Build.BRAND.toLowerCase());
        GlobalInfo globalInfo3 = this.f6548a;
        String str = Build.MODEL;
        if (str == null) {
            lowerCase = "unknown";
        } else {
            lowerCase = str.replace(" ", "-").replace("_", "-").toLowerCase();
        }
        globalInfo3.a("model", lowerCase);
        this.f6548a.a("build_model", str);
        DisplayMetrics displayMetrics = this.f6549b.getResources().getDisplayMetrics();
        this.f6548a.a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f6548a.a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f6548a.a("fr", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
        this.f6548a.a("rom", Build.VERSION.RELEASE);
        this.f6548a.a(com.umeng.ccg.a.f12839r, Integer.valueOf(Build.VERSION.SDK_INT));
        this.f6548a.a("lang", Locale.getDefault().getLanguage());
        this.f6548a.a("tzone", TimeZone.getDefault().getID());
        this.f6548a.a(b.f16155k, NetworkUtil.getNetworkType(this.f6549b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.f6549b);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                this.f6548a.a(UMCrash.KEY_HEADER_ACCESS, NetworkUtil.NETWORK_TYPE_WIFI);
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                this.f6548a.a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
            } else {
                this.f6548a.a(UMCrash.KEY_HEADER_ACCESS, "unknow");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f6548a.a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f6548a.a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.f6549b)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f6548a.a(b.f16155k, networkType);
    }

    private GlobalInfoManager() {
        this.f6549b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }
}

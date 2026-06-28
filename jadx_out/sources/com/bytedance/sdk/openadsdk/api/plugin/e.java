package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.ZeusPluginInstallListener;
import com.bytedance.pangle.ZeusPluginStateListener;
import com.bytedance.pangle.download.PluginDownloadBean;
import com.bytedance.pangle.log.IZeusLogger;
import com.bytedance.pangle.log.IZeusReporter;
import com.bytedance.pangle.plugin.Plugin;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static volatile BaseDexClassLoader f4858d;

    /* renamed from: l, reason: collision with root package name */
    private static volatile TTPluginListener f4860l;

    /* renamed from: i, reason: collision with root package name */
    private final Context f4864i;

    /* renamed from: a, reason: collision with root package name */
    private static final String f4855a = "next" + File.separator;

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap<String, TTPluginListener> f4856b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap<String, Handler> f4857c = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static volatile e f4859e = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f4861f = new CountDownLatch(1);

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f4862g = false;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f4863h = "none";

    /* renamed from: j, reason: collision with root package name */
    private JSONObject f4865j = new JSONObject();

    /* renamed from: k, reason: collision with root package name */
    private EventListener f4866k = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class a extends PluginDownloadBean {

        /* renamed from: a, reason: collision with root package name */
        public String f4874a = "";

        /* renamed from: b, reason: collision with root package name */
        public File f4875b = null;

        a() {
            this.mBackupUrlList = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements IZeusLogger {
        private b() {
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void e(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.c(str, str2, th);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void i(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.c.c(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void v(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.c.a(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2) {
            com.bytedance.sdk.openadsdk.api.c.d(str, str2);
        }

        @Override // com.bytedance.pangle.log.IZeusLogger
        public void w(String str, String str2, Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.b(str, str2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c implements EventListener, Serializable {
        private void a(a aVar) {
            try {
                if (!TextUtils.isEmpty(aVar.mPackageName) && aVar.mPackageName.equals(TTAdSdk.BUILT_IN_PLUGIN_NAME)) {
                    e.a(TTAppContextHolder.getContext()).b();
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.bykv.vk.openvk.api.proto.EventListener
        public ValueSet onEvent(int i5, Result result) {
            com.bykv.a.a.a.a.b a5 = com.bykv.a.a.a.a.b.a();
            if (i5 == 1) {
                com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin update start");
                ValueSet values = result.values();
                if (values == null) {
                    com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "valueSet empty");
                    return null;
                }
                String stringValue = values.stringValue(3);
                int code = result.code();
                if (result.isSuccess()) {
                    a d5 = e.d(values.stringValue(2));
                    if (d5 != null && !TextUtils.isEmpty(d5.mPackageName)) {
                        com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin update received: " + d5.mPackageName);
                        com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin update received: " + d5.mPackageName);
                        if (d5.isRevert()) {
                            com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin revert " + d5.mPackageName);
                            Zeus.unInstallPlugin(d5.mPackageName);
                        } else {
                            a(d5);
                            com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin install");
                            if (e.b(d5)) {
                                a5.i(4, true);
                            }
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin update received with invalid config");
                        com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin update received with invalid config");
                        return null;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.api.plugin.b.a("plugin_download", "plugin update received failed");
                    com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin update received failed");
                    e.c(stringValue, code);
                    return null;
                }
            }
            return a5.k();
        }
    }

    private e(Context context) {
        this.f4864i = context.getApplicationContext();
        try {
            GlobalParam.getInstance().closeHookHuaweiOnInit(true);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Unexpected error for closeHookHuaweiOnInit.", th);
        }
        b(context.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException unused) {
            com.bytedance.sdk.openadsdk.api.c.e("TTPluginManager", "Invalid plugin info:" + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        Plugin plugin = Zeus.getPlugin(str, false);
        try {
            if (plugin.mClassLoader != null) {
                TTAdSdk.getAdManager().register(com.bykv.a.a.a.a.b.b(3).e(0, 1).h(1, str).g(2, plugin.mClassLoader).k());
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.a("TTPluginManager", "initPluginService failed in " + str, th);
        }
    }

    private void b(Context context) {
        try {
            IZeusReporter iZeusReporter = new IZeusReporter() { // from class: com.bytedance.sdk.openadsdk.api.plugin.e.1
                @Override // com.bytedance.pangle.log.IZeusReporter
                public void report(String str, JSONObject jSONObject) {
                    if ("load_finish".equals(str) && jSONObject != null && TTAdSdk.BUILT_IN_PLUGIN_NAME.endsWith(jSONObject.optString("plugin_package_name"))) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("duration", jSONObject.opt("duration"));
                            jSONObject2.put(CrashHianalyticsData.MESSAGE, jSONObject.opt(CrashHianalyticsData.MESSAGE));
                            e.this.f4865j.put("zeus", jSONObject2);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (TTAdSdk.isInitSuccess()) {
                        com.bytedance.sdk.openadsdk.api.plugin.c.a(str, jSONObject);
                    } else {
                        com.bytedance.sdk.openadsdk.api.plugin.c.b(str, jSONObject);
                    }
                }

                @Override // com.bytedance.pangle.log.IZeusReporter
                public void saveRecord(String str, String str2) {
                    com.bytedance.sdk.openadsdk.api.plugin.b.a(str, str2);
                }
            };
            GlobalParam globalParam = GlobalParam.getInstance();
            globalParam.setReporter(iZeusReporter);
            globalParam.setCheckPermission(false);
            globalParam.setDownloadDir(c(context));
            globalParam.setLogger(new b());
            globalParam.setSignature(TTAdSdk.BUILT_IN_PLUGIN_NAME, "MIIDfTCCAmWgAwIBAgIEfRwYPjANBgkqhkiG9w0BAQsFADBvMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzESMBAGA1UEChMJQnl0ZURhbmNlMQ8wDQYDVQQLEwZQYW5nbGUxFzAVBgNVBAMTDkNodWFuIFNoYW4gSmlhMB4XDTIxMTEwODA2MjQzOVoXDTQ2MTEwMjA2MjQzOVowbzELMAkGA1UEBhMCQ04xEDAOBgNVBAgTB0JlaWppbmcxEDAOBgNVBAcTB0JlaWppbmcxEjAQBgNVBAoTCUJ5dGVEYW5jZTEPMA0GA1UECxMGUGFuZ2xlMRcwFQYDVQQDEw5DaHVhbiBTaGFuIEppYTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIBKeRL+4mfCn1SLYv6OemfwwItkjlLPyqOEugkV6lanFTcZgLwEl5LIkL0y28UncPtMX1Mii6DzCdJ/plw7S9+RT/hYDneu339IKWojaU2qai/5FokHlQ0MMnYl5yry00ghVPsl1u+03cQA2ZnjIMiFhrBJpQzHt7IYvq2aEEMBcY8uT7iFoBI848e1mL1joVS2z02C3NliP7ZNARkXH+rTQAlCJulT5IZk+V/PTaKqzgNrkhsKh0/tBmU7m8u79x/xpgGsE19H18AgS4P/9/MDCRe2Z35boZeccaUy2MXCwv3djzUcDk3rRzQPYzdpyyRnrFMuhiKesc5VHgUMs9kCAwEAAaMhMB8wHQYDVR0OBBYEFENENrNWGzc2WhxdvhoMDs57U70zMA0GCSqGSIb3DQEBCwUAA4IBAQAHqDCrmvyBBmIGXwuL1rwS/Qv9ZJIZykBIaNMm+H1IfitCl4yXd9N2n+PjE0UZtxZ21UZOt9wAr+RFiSl5YRXqpt7WLARTy4YW3RiQ+wiL7bshzeSYBoSiC427Bfeq0WjwY0/jHlr8uouppyJOz++6U9hrYX2EW/6UjH5XlWiKQJ6b2ZzPcP8Xpg/TJn4tWvXJP6jw9kRRP2GmMttY78leWQst2QEZILmWJubXRLPj9O+qx2uP9oGTD4sc1vb9hzkOHBIHzGaalqLFbbGaeFpLFHoGTsnOfPTwUVKDZYmxbkcmR1bp7eYOW+nSQNMLn0FjDewZl5l37Sa/gz0WVHon");
            globalParam.setSignature("com.byted.csj.ext", "MIIDezCCAmOgAwIBAgIENkE1KDANBgkqhkiG9w0BAQsFADBtMQswCQYDVQQGEwI4NjEQMA4GA1UECBMHYmVpamluZzEQMA4GA1UEBxMHYmVpamluZzESMBAGA1UEChMJYnl0ZWRhbmNlMRIwEAYDVQQLEwlieXRlZGFuY2UxEjAQBgNVBAMTCWJ5dGVkYW5jZTAgFw0yMjExMDIwODI3MzlaGA8yMDUwMDMyMDA4MjczOVowbTELMAkGA1UEBhMCODYxEDAOBgNVBAgTB2JlaWppbmcxEDAOBgNVBAcTB2JlaWppbmcxEjAQBgNVBAoTCWJ5dGVkYW5jZTESMBAGA1UECxMJYnl0ZWRhbmNlMRIwEAYDVQQDEwlieXRlZGFuY2UwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCc9Z2F3xxOMX1qTXMy2aPmS9OSkqrp8C8bHwS1hkNVR4umKREuqOn73INNo+R706jaCVnlPwxDwWjtX6H74DE4CveivyM9f2wNC3yIyDW+5j7lW/keTQcOlGLDEJQv4O/6FbB/jNU6epjyNaNIZhgZcvTpgaSixbdyHzRTFmvMh+WovdVK/J9LnHOQ+pmPZj7NB6MQRGMUrPEotLHQca3cmnLrnPAaZQaVoaFE9lOt9syyqEuf361SprNIGDtbkJuX3EqV/QOKWFwZX94IS7ZGSvfyCojcD4kaUSbaSoZC7zEuBb7l69g+ZMrJ/v6wkm01wxsNNssUwF7k6Sp0zubbAgMBAAGjITAfMB0GA1UdDgQWBBSxk+gVdDco1dP65hP67qoKNlMEYDANBgkqhkiG9w0BAQsFAAOCAQEAfosExl/AYEbS2xqHBTHa28cvnp/SElUQuzW6aWLqkfk9cxmFSI/euUV3/eB8RN+U2X47Y05u6+XUxTv0tSSEtyXNawm0qWH8jkR4gZY38YqBChKjhea668oT5X3Uocrw7SYXO/BfI8SKPa0uI/U8Cyl3uctbmmq/pPUkd3mKAy+HgyJoThD6K0oyiADlygngUMVTv6Uvid4qPj/bBnxI+LvVeX4l1dxGqWkiafQW9sz+RbFdge3X2XsSH4eo01BsCwOYEv1lHO2FrbAtFNpnIsSqrERdFaAJZ3tlJmg9bA03png8A2AajEjkhaOhduJB8zkSlvHNpoQMIAS9WtkG/w==");
            globalParam.setSignature("com.byted.live.lite", "MIIDSTCCAjGgAwIBAgIEaLy5tzANBgkqhkiG9w0BAQsFADBVMQswCQYDVQQGEwIxMTEMMAoGA1UECBMDMTExMQ4wDAYDVQQHEwUxMTExMTEMMAoGA1UEChMDMTExMQwwCgYDVQQLEwMxMTExDDAKBgNVBAMTAzExMTAeFw0yMDEyMDMxMjQyMTJaFw00NTExMjcxMjQyMTJaMFUxCzAJBgNVBAYTAjExMQwwCgYDVQQIEwMxMTExDjAMBgNVBAcTBTExMTExMQwwCgYDVQQKEwMxMTExDDAKBgNVBAsTAzExMTEMMAoGA1UEAxMDMTExMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA45E52YdkJm4gPCXZq7KDoM1h6pgSswllC/CwDOmh8pDGvX4ROaYP1vr2biRlXMHg7G0iXpxWVdlTtx+4QFd3dC+cGJQk0f6apGo2n2RpMA0zIsSf0VO1a3GjWLei5INo+4RDdciqJ4jfsoqBIjZETRkky+UU4eO/oyrAwOu4KdMln3Bg3u7eHWU4kMFrXxrRruT3Q/9gzlO90yQa0CZPWVDrk6cGJtJwJGhWm+62S3U8D26HE++eGP7ve83QBDGtKqx7HpCAFWUiYBgXGq12H0amQDkKcPcr/EFCaBlombSgkN0t6zBX80m+wcUPC75IBTmMV/DT2dXcgjZ2I1JSCQIDAQABoyEwHzAdBgNVHQ4EFgQUPDyIeKI0KhZFPHyn36gMMIYrpukwDQYJKoZIhvcNAQELBQADggEBAHkl0DoCRwn+XKsDJE+wGMpBBqUDzL6DSOnJx4SNqb7YZZU0ThcDK7jY4If3QRkvMio6ODrVZc2U/m/Tc3VeMk5h2W2UZRUWHNH3k9Xe0720uL20ZeH2Y6IG4L5HG8kIbTbFtX3gJpPG/xAcez+CzyCFLWQAZt1N+csG0syWkXJ0Nryq8VrgSCyCXD1KzFxrOe+65wtu50Vi68Vlbk7BZe/G8Qm0RhKmxq5BPMBJ4uY3be+03Ba5qC//o1XQHOEAjrJKXcN5wqHdFZTkmuxVyIPogZOzx4JlNl0zOrYGDJxp7aZfKF9FkXQyF7x0Ns3mZEtjx/+flXRzAAU9MDhPr/0=");
            Zeus.registerPluginStateListener(new ZeusPluginStateListener() { // from class: com.bytedance.sdk.openadsdk.api.plugin.e.2
                @Override // com.bytedance.pangle.ZeusPluginStateListener
                public void onPluginStateChange(String str, int i5, Object... objArr) {
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", str + " state changed, " + i5);
                    if (i5 == 9 && !TextUtils.equals(str, TTAdSdk.BUILT_IN_PLUGIN_NAME)) {
                        e.this.c(str);
                    }
                }
            });
            globalParam.closeBgDex2oat(true);
            Zeus.init((Application) context, true);
            Zeus.registerPluginInstallListener(new ZeusPluginInstallListener() { // from class: com.bytedance.sdk.openadsdk.api.plugin.e.3
                @Override // com.bytedance.pangle.ZeusPluginInstallListener
                public void onPluginInstall(String str, int i5, String str2) {
                    if (i5 == 7) {
                        e.this.b(str, i5);
                        return;
                    }
                    if (i5 == 6) {
                        e.this.b(str, i5);
                        if (e.this.f4866k != null && TTAdSdk.BUILT_IN_PLUGIN_NAME.equals(str)) {
                            e.this.f4866k.onEvent(0, com.bykv.a.a.a.a.a.a().e(true).f());
                        } else {
                            com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "no main pl");
                        }
                    }
                }
            });
            this.f4862g = true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Unexpected error for init zeus.", th);
            this.f4863h = th.getMessage();
        }
    }

    public static e a(Context context) {
        if (f4859e == null) {
            synchronized (e.class) {
                if (f4859e == null) {
                    f4859e = new e(context);
                }
            }
        }
        return f4859e;
    }

    private static File c(Context context) {
        return new File(new File(context.getDir("tt_pangle_bykv_file", 0), "pangle_com.byted.pangle"), f4855a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, int i5) {
        com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin update failed");
        Bundle bundle = new Bundle();
        bundle.putInt(PluginConstants.KEY_ERROR_CODE, i5);
        TTPluginListener tTPluginListener = f4856b.get(str);
        if (tTPluginListener != null) {
            tTPluginListener.onPluginListener(1001, null, null, bundle);
        }
    }

    public JSONObject a() {
        return this.f4865j;
    }

    public BaseDexClassLoader a(d dVar) throws Exception {
        return a(dVar, 60000);
    }

    public BaseDexClassLoader a(d dVar, int i5) throws Exception {
        boolean z4;
        if (this.f4862g) {
            if (!Zeus.isPluginInstalled(TTAdSdk.BUILT_IN_PLUGIN_NAME)) {
                try {
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "wait start");
                    this.f4861f.await(i5, TimeUnit.MILLISECONDS);
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "wait done");
                    dVar.b("wait_install_cost");
                } catch (Exception unused) {
                    com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Install wait time out");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.a(8, "install wait timeout");
                }
            }
            if (Zeus.isPluginLoaded(TTAdSdk.BUILT_IN_PLUGIN_NAME) || Zeus.loadPlugin(TTAdSdk.BUILT_IN_PLUGIN_NAME)) {
                f4858d = Zeus.getPlugin(TTAdSdk.BUILT_IN_PLUGIN_NAME).mClassLoader;
                z4 = true;
            } else {
                z4 = false;
            }
            dVar.b("get_classloader_cost");
            Zeus.installFromDownloadDir();
            if (f4858d == null) {
                if (this.f4861f.getCount() != 0) {
                    com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "Install wait time out");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.a(8, "install wait timeout");
                }
                if (z4) {
                    com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "Get null after load");
                    throw new com.bytedance.sdk.openadsdk.api.plugin.a(9, "Get null after load");
                }
            }
            dVar.b("get_classloader_done");
            return f4858d;
        }
        com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "Zeus init failed.");
        throw new com.bytedance.sdk.openadsdk.api.plugin.a(4, this.f4863h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i5) {
        if (TTAdSdk.BUILT_IN_PLUGIN_NAME.equals(str) && i5 == 6) {
            com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "notify to end wait");
            this.f4861f.countDown();
        }
        a(i5 == 6, str);
    }

    public void b(final TTPluginListener tTPluginListener) {
        com.bytedance.sdk.openadsdk.e.a.a().b(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.e.5
            @Override // java.lang.Runnable
            public void run() {
                Plugin plugin;
                boolean z4;
                String packageName = tTPluginListener.packageName();
                if (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) {
                    plugin = Zeus.getPlugin(packageName);
                } else {
                    plugin = null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Find plugin:");
                if (plugin != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sb.append(z4);
                com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", sb.toString());
                if (plugin == null) {
                    TTPluginListener unused = e.f4860l = tTPluginListener;
                } else {
                    e.b(plugin);
                    tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Plugin plugin) {
        if (plugin == null) {
            com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin is null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("action", 0);
        bundle.putString("plugin_pkg_name", plugin.mPkgName);
        bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, a(plugin.getVersion()));
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            adManager.getExtra(Bundle.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(a aVar) {
        File file;
        if (aVar != null && (file = aVar.f4875b) != null) {
            boolean syncInstallPlugin = Zeus.syncInstallPlugin(aVar.mPackageName, file.getAbsolutePath());
            a(syncInstallPlugin, aVar.mPackageName);
            return syncInstallPlugin;
        }
        com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "plugin config is null");
        return false;
    }

    public void b() {
        EventListener eventListener = this.f4866k;
        if (eventListener != null) {
            eventListener.onEvent(1, com.bykv.a.a.a.a.a.a().e(true).f());
        }
    }

    public Bundle a(String str, Bundle bundle) {
        String a5 = a(str);
        if (!TextUtils.isEmpty(a5)) {
            bundle.putString(PluginConstants.KEY_PLUGIN_VERSION, a5);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(str, bundle);
        Bundle bundle3 = new Bundle();
        bundle3.putBundle(PluginConstants.KEY_PL_CONFIG_INFO, bundle2);
        return bundle3;
    }

    public static String a(String str) {
        Plugin plugin;
        try {
            if (!Zeus.isPluginInstalled(str) || (plugin = Zeus.getPlugin(str)) == null) {
                return null;
            }
            return a(plugin.getVersion());
        } catch (Throwable unused) {
            com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "Get local version failed");
            return null;
        }
    }

    public void a(final TTPluginListener tTPluginListener) {
        if (!this.f4862g) {
            com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "Zeus init failed.");
            if (tTPluginListener != null) {
                tTPluginListener.onPluginListener(1002, null, null, null);
                return;
            }
            return;
        }
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.e.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "Load plugin failed, caused by timeout.");
                tTPluginListener.onPluginListener(1001, null, null, null);
            }
        }, 180000L);
        String packageName = tTPluginListener.packageName();
        Plugin plugin = (Zeus.isPluginInstalled(packageName) && (Zeus.isPluginLoaded(packageName) || Zeus.loadPlugin(packageName))) ? Zeus.getPlugin(packageName) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("Find plugin:");
        sb.append(plugin != null);
        com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", sb.toString());
        if (plugin != null) {
            b(plugin);
            handler.removeCallbacksAndMessages(null);
            tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
        } else {
            f4856b.put(packageName, tTPluginListener);
            f4857c.put(packageName, handler);
        }
    }

    private static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.mPackageName = jSONObject.optString(bi.f12269o);
        aVar.mVersionCode = jSONObject.optInt("version_code");
        aVar.mUrl = jSONObject.optString("download_url");
        aVar.mMd5 = jSONObject.optString(TTDownloadField.TT_MD5);
        aVar.mApiVersionMin = jSONObject.optInt("min_version");
        aVar.mApiVersionMax = jSONObject.optInt("max_version");
        aVar.f4874a = jSONObject.optString("sign");
        aVar.mFlag = jSONObject.optBoolean("is_revert") ? 3 : 2;
        aVar.f4875b = new File(jSONObject.optString("plugin_file"));
        return aVar;
    }

    public static String a(int i5) {
        char[] charArray = String.valueOf(i5).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < charArray.length; i6++) {
            sb.append(charArray[i6]);
            if (i6 < charArray.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private static boolean a(TTPluginListener tTPluginListener, String str) {
        if (tTPluginListener == null || tTPluginListener.packageName() == null) {
            return false;
        }
        return tTPluginListener.packageName().equals(str);
    }

    private static void a(boolean z4, String str) {
        HashMap<String, TTPluginListener> hashMap = f4856b;
        TTPluginListener tTPluginListener = hashMap.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Install dl plugin ");
        sb.append(str);
        sb.append(z4 ? " success" : " failed");
        sb.append(", need notify: ");
        sb.append(tTPluginListener != null);
        com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", sb.toString());
        HashMap<String, Handler> hashMap2 = f4857c;
        Handler handler = hashMap2.get(str);
        if (z4) {
            TTPluginListener tTPluginListener2 = f4860l;
            if (!a(tTPluginListener2, str) && (tTPluginListener == null || handler == null)) {
                return;
            }
            if (Zeus.loadPlugin(str)) {
                Plugin plugin = Zeus.getPlugin(str);
                b(plugin);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (tTPluginListener != null) {
                    tTPluginListener.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                }
                if (a(tTPluginListener2, str)) {
                    tTPluginListener2.onPluginListener(1000, plugin.mClassLoader, plugin.mResources, null);
                    f4860l = null;
                }
            } else {
                com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "handle installed, load failed");
                c(str, 1002);
            }
        } else {
            com.bytedance.sdk.openadsdk.api.c.b("TTPluginManager", "handle installed failed");
            c(str, 1003);
        }
        hashMap.remove(str);
        hashMap2.remove(str);
    }

    public static void a(Throwable th) {
        if (th instanceof AbstractMethodError) {
            Zeus.unInstallPlugin(TTAdSdk.BUILT_IN_PLUGIN_NAME);
            com.bytedance.sdk.openadsdk.api.c.d("TTPluginManager", "AbstractMethodError, rollback to builtin version.");
        }
    }
}

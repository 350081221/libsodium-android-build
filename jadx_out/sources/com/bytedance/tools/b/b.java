package com.bytedance.tools.b;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.a.a.a.b;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.TTILog;
import com.bytedance.tools.ToolsProvider;
import com.bytedance.tools.d.f;
import com.bytedance.tools.d.g;
import com.bytedance.tools.d.h;
import com.umeng.analytics.pro.bi;
import java.io.File;
import java.lang.reflect.Method;
import m1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f6279a = false;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f6280b;

    /* renamed from: c, reason: collision with root package name */
    private static c f6281c;

    private static String a(int i5) {
        return g.a(ToolsProvider.f6267a, i5);
    }

    public static String b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("app_name", ToolsProvider.f6267a.getPackageName());
            jSONObject.putOpt("app_id", g(2));
            jSONObject.putOpt("device", g(3));
            jSONObject.putOpt("os_api", Integer.valueOf(Build.VERSION.SDK_INT));
            jSONObject.putOpt(bi.f12279y, Build.VERSION.RELEASE);
            jSONObject.putOpt("manufacturer", Build.MANUFACTURER);
            jSONObject.putOpt("imei", g(6));
            jSONObject.putOpt("oaid", g(7));
            jSONObject.putOpt("android_id", g(9));
            jSONObject.putOpt("did", a(16));
            jSONObject.putOpt("sdk_version", h.b(TTAdSdk.BUILT_IN_PLUGIN_NAME));
            jSONObject.putOpt("sdk_api_version", h.b(TTAdSdk.BUILT_IN_PLUGIN_NAME));
            jSONObject.putOpt("live_sdk_version", h.b("com.byted.live.lite"));
            jSONObject.putOpt("live_sdk_api_version", h.c("com.byted.live.lite"));
            jSONObject.putOpt("msg", str);
            jSONObject.putOpt("recordId", str2);
            return com.bytedance.tools.d.b.e(jSONObject).toString();
        } catch (JSONException e5) {
            Log.w("TT_TOOLS", e5);
            return str;
        }
    }

    public static void c(Context context) {
        try {
            if (!f6279a) {
                f6279a = h(context);
            }
            if (!f6279a) {
                Log.w("TT_TOOLS", "init clog failed");
                return;
            }
            i();
            f6279a = true;
            Log.w("TT_TOOLS", "init tool log success!");
        } catch (Exception e5) {
            f6279a = false;
            Log.w("TT_TOOLS", e5);
        }
    }

    public static void d(a.InterfaceC0622a interfaceC0622a, String str, String str2) {
        File a5 = f.a(f6280b, str2 + ".zip");
        if (a5 == null) {
            interfaceC0622a.a(-1, "zip file failed!");
        } else {
            new m1.a().d(a5, b(str, str2), new a(interfaceC0622a, a5));
        }
    }

    public static boolean e() {
        return f6279a;
    }

    private static String g(int i5) {
        return com.bytedance.tools.d.c.b(ToolsProvider.f6267a, i5);
    }

    private static boolean h(Context context) {
        String path = context.getExternalFilesDir(null).getPath();
        String file = context.getFilesDir().toString();
        Log.d("TT_TOOLS", "init clog logBaseDir: " + path);
        Log.d("TT_TOOLS", "init clog cacheBaseDir: " + file);
        f6280b = path + "/tool_log";
        return com.a.a.a.a.k(new b.C0083b(context).b(file + "/tool_log").f(f6280b).c(true).g(true).j(2).a(7).e(41943040).h(5242880).i(true).d());
    }

    private static void i() throws Exception {
        ClassLoader a5 = h.a(TTAdSdk.BUILT_IN_PLUGIN_NAME);
        if (a5 == null) {
            return;
        }
        try {
            f6281c = new c(f6280b);
            Method method = a5.loadClass("com.bytedance.sdk.openadsdk.tools.LogAdapter").getMethod("zzz", TTILog.class);
            method.setAccessible(true);
            method.invoke(null, f6281c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes2.dex */
    static class a implements a.InterfaceC0622a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0622a f6282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f6283b;

        a(a.InterfaceC0622a interfaceC0622a, File file) {
            this.f6282a = interfaceC0622a;
            this.f6283b = file;
        }

        @Override // m1.a.InterfaceC0622a
        public void a(String str) {
            this.f6282a.a(str);
            this.f6283b.delete();
            f.c(new File(b.f6280b));
        }

        @Override // m1.a.InterfaceC0622a
        public void a(int i5, String str) {
            this.f6282a.a(i5, str);
        }
    }
}

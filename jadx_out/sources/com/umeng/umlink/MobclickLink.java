package com.umeng.umlink;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.SharedLibraryInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umlink.a.b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MobclickLink {

    /* renamed from: a, reason: collision with root package name */
    private static Context f13606a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f13607b = Boolean.TRUE;

    /* renamed from: c, reason: collision with root package name */
    private static String f13608c = null;

    private static String a() {
        try {
            Class<?> cls = Class.forName("com.umeng.umzid.Spy");
            Method declaredMethod = cls.getDeclaredMethod("getID", new Class[0]);
            if (declaredMethod != null) {
                return (String) declaredMethod.invoke(cls, new Object[0]);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(Context context, UMLinkListener uMLinkListener) {
        String concat;
        String string = a.a(context).getString("umlink_install_cache", null);
        try {
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            JSONObject jSONObject = new JSONObject(string);
            HashMap<String, String> hashMap = new HashMap<>();
            Uri parse = Uri.parse("");
            if (jSONObject.isNull("data")) {
                concat = "[match-local result]:none";
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                TextUtils.isEmpty(jSONObject2.getString("linkId"));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("installParams");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject3.getString(next));
                }
                String string2 = jSONObject2.getString("matchType");
                String string3 = jSONObject2.getString("wakeupUrl");
                if (!TextUtils.isEmpty(string3)) {
                    parse = Uri.parse(string3 + "&_scene_=install");
                }
                concat = "[match-local result]:".concat(String.valueOf(string2));
            }
            UMLog.mutlInfo(concat, 3, "", null, null);
            uMLinkListener.onInstall(hashMap, parse);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, Uri uri, String str2) {
        String str3;
        String str4 = "";
        try {
            if (context == null) {
                UMLog.aq("context参数不能为null。|需要指定ApplicationContext值。", 0, "\\|");
                return;
            }
            if (f13606a == null) {
                f13606a = context.getApplicationContext();
            }
            String uri2 = uri.toString();
            String query = uri.getQuery();
            try {
                if (query.contains("url=")) {
                    query = query.substring(0, query.indexOf("url="));
                }
                if (query.length() > 0) {
                    str3 = "";
                    for (String str5 : query.split("&")) {
                        try {
                            int indexOf = str5.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (indexOf > 0 && indexOf < str5.length() - 1) {
                                String substring = str5.substring(0, indexOf);
                                String substring2 = str5.substring(indexOf + 1);
                                if ("um_from_appkey".equals(substring)) {
                                    str4 = substring2;
                                } else if ("_bizType_".equals(substring)) {
                                    str3 = substring2;
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            e.printStackTrace();
                            if (TextUtils.isEmpty(str)) {
                            }
                            UMLog.aq("linkid、url、scene参数不能为null，也不能为空字符串。|必须为非空字符串。", 0, "\\|");
                            return;
                        }
                    }
                } else {
                    str3 = "";
                }
            } catch (Exception e6) {
                e = e6;
                str3 = "";
            }
            if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(uri2) || TextUtils.isEmpty(str2)) {
                UMLog.aq("linkid、url、scene参数不能为null，也不能为空字符串。|必须为非空字符串。", 0, "\\|");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("_$!link_id", str);
            hashMap.put("_$!url", uri2);
            hashMap.put("_$!scene", str2);
            hashMap.put("_$!appkey", str4);
            hashMap.put("_$!bizType", str3);
            MobclickAgent.onEvent(f13606a, "$$_um_link", hashMap);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized JSONObject c(Context context) {
        JSONObject jSONObject;
        String appkey;
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        synchronized (MobclickLink.class) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e5) {
                e = e5;
                jSONObject = null;
            }
            try {
                appkey = UMUtils.getAppkey(context);
            } catch (Exception e6) {
                e = e6;
                UMLog.mutlInfo("[getUMLinkParam error]:" + e.getMessage(), 3, "", null, null);
                f13608c = null;
                f13607b = Boolean.TRUE;
                return jSONObject;
            }
            if (TextUtils.isEmpty(appkey)) {
                throw new Exception("no appkey");
            }
            jSONObject.put("appkey", appkey);
            String uMId = UMUtils.getUMId(context);
            if (!TextUtils.isEmpty(uMId)) {
                jSONObject.put(bi.f12261g, uMId);
            }
            jSONObject.put("appVersion", UMUtils.getAppVersionName(context));
            jSONObject.put("sdkVersion", "9.4.0");
            jSONObject.put("linkVersion", getVersion());
            jSONObject.put("channel", UMUtils.getChannel(context));
            jSONObject.put(bi.f12278x, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("buildId", Build.ID);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("deviceModel", Build.MODEL);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            jSONObject.put("resolutionHeight", resolutionArray[1]);
            jSONObject.put("resolutionWidth", resolutionArray[0]);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject.put(bi.N, localeInfo[1]);
            jSONObject.put(bi.O, localeInfo[0]);
            jSONObject.put("dateTime", String.valueOf((int) (System.currentTimeMillis() / 1000)));
            String umengZID = UMConfigure.getUmengZID(context);
            if (umengZID != null) {
                jSONObject.put(bi.al, umengZID);
            }
            String a5 = a();
            if (a5 != null) {
                jSONObject.put("zdata", a5);
            }
            String str = f13608c;
            if (str != null) {
                int indexOf = str.indexOf("8um:/");
                int indexOf2 = f13608c.indexOf("$$");
                if (indexOf < 0 || indexOf2 <= indexOf) {
                    throw new Exception("token format error");
                }
                jSONObject.put("clipboardToken", f13608c.substring(indexOf, indexOf2 + 2));
            } else if (f13607b.booleanValue()) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                String charSequence = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || (itemAt = primaryClip.getItemAt(0)) == null || (coerceToText = itemAt.coerceToText(context)) == null) ? null : coerceToText.toString();
                if (charSequence != null) {
                    int indexOf3 = charSequence.indexOf("8um:/");
                    int indexOf4 = charSequence.indexOf("$$");
                    if (indexOf3 >= 0 && indexOf4 > indexOf3) {
                        jSONObject.put("clipboardToken", charSequence.substring(indexOf3, indexOf4 + 2));
                        ClipboardManager clipboardManager2 = (ClipboardManager) context.getSystemService("clipboard");
                        if (clipboardManager2 != null) {
                            clipboardManager2.setPrimaryClip(ClipData.newPlainText("", ""));
                        }
                    }
                }
            }
            f13608c = null;
            f13607b = Boolean.TRUE;
        }
        return jSONObject;
    }

    public static void getInstallParams(final Context context, final UMLinkListener uMLinkListener) {
        if (a(context, uMLinkListener)) {
            return;
        }
        b.a(new Thread(new Runnable() { // from class: com.umeng.umlink.MobclickLink.1
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject c5 = MobclickLink.c(context);
                if (c5 == null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.umeng.umlink.MobclickLink.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            uMLinkListener.onError("param error: appkey not set for example");
                        }
                    });
                    return;
                }
                String a5 = com.umeng.umlink.a.a.a("https://deeplink.umeng.com/deeplink/match", c5.toString());
                try {
                    if (TextUtils.isEmpty(a5)) {
                        throw new Exception("network error");
                    }
                    JSONObject jSONObject = new JSONObject(a5);
                    if (jSONObject.getInt(PluginConstants.KEY_ERROR_CODE) != 200) {
                        throw new Exception("code=" + jSONObject.getInt(PluginConstants.KEY_ERROR_CODE));
                    }
                    SharedPreferences.Editor edit = a.a(context).edit();
                    edit.putString("umlink_install_cache", a5);
                    edit.commit();
                    final HashMap hashMap = new HashMap();
                    final Uri parse = Uri.parse("");
                    if (jSONObject.isNull("data")) {
                        UMLog.mutlInfo("[match result]:none", 3, "", null, null);
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        String string = jSONObject2.getString("linkId");
                        if (TextUtils.isEmpty(string)) {
                            string = "";
                        }
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("installParams");
                        Iterator<String> keys = jSONObject3.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject3.getString(next));
                        }
                        String string2 = jSONObject2.getString("matchType");
                        String string3 = jSONObject2.getString("wakeupUrl");
                        if (!TextUtils.isEmpty(string3)) {
                            parse = Uri.parse(string3 + "&_scene_=install");
                        }
                        UMLog.mutlInfo("[match result]:".concat(String.valueOf(string2)), 3, "", null, null);
                        MobclickLink.b(context, string, parse, "install");
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.umeng.umlink.MobclickLink.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            uMLinkListener.onInstall(hashMap, parse);
                        }
                    });
                } catch (Exception e5) {
                    UMLog.mutlInfo("[match error]:" + e5.getMessage(), 3, "", null, null);
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.umeng.umlink.MobclickLink.1.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            uMLinkListener.onError(e5.getMessage());
                        }
                    });
                }
            }
        }));
    }

    public static void getInstallParams(Context context, String str, UMLinkListener uMLinkListener) {
        f13608c = str;
        getInstallParams(context, uMLinkListener);
    }

    public static void getInstallParams(Context context, boolean z4, UMLinkListener uMLinkListener) {
        f13608c = null;
        f13607b = Boolean.valueOf(z4);
        getInstallParams(context, uMLinkListener);
    }

    public static String getVersion() {
        return com.umeng.commonsdk.internal.a.f13124e;
    }

    public static void handleUMLinkURI(final Context context, Uri uri, UMLinkListener uMLinkListener) {
        String str;
        String str2;
        String str3 = "";
        if (uri == null || uri.toString().length() <= 0) {
            return;
        }
        String path = uri.getPath();
        String query = uri.getQuery();
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            if (query.contains("url=")) {
                int indexOf = query.indexOf("url=");
                hashMap.put("url", query.substring(indexOf + 4));
                query = query.substring(0, indexOf);
            }
            if (query.length() > 0) {
                str = "wakeup";
                str2 = "";
                for (String str4 : query.split("&")) {
                    try {
                        int indexOf2 = str4.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (indexOf2 > 0 && indexOf2 < str4.length() - 1) {
                            String substring = str4.substring(0, indexOf2);
                            String substring2 = str4.substring(indexOf2 + 1);
                            if ("_sdk_".equals(substring)) {
                                str3 = substring2;
                            } else if ("_linkid_".equals(substring)) {
                                str2 = substring2;
                            } else if ("_scene_".equals(substring)) {
                                str = substring2;
                            }
                            hashMap.put(substring, substring2);
                        }
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        if (str3 != null) {
                            return;
                        }
                    }
                }
            } else {
                str = "wakeup";
                str2 = "";
            }
        } catch (Exception e6) {
            e = e6;
            str = "wakeup";
            str2 = "";
        }
        if (str3 != null && "umeng".equals(str3)) {
            if ("wakeup".equals(str)) {
                b(context, str2, uri, str);
                final String uri2 = uri.toString();
                b.a(new Thread(new Runnable() { // from class: com.umeng.umlink.MobclickLink.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str5;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("appkey", UMUtils.getAppkey(context));
                            jSONObject.put("wakeupUrl", uri2);
                            jSONObject.put(CrashHianalyticsData.TIME, String.valueOf((int) (System.currentTimeMillis() / 1000)));
                            String umengZID = UMConfigure.getUmengZID(context);
                            if (umengZID != null) {
                                jSONObject.put(bi.al, umengZID);
                            }
                            str5 = jSONObject.toString();
                        } catch (Exception unused) {
                            UMLog.mutlInfo("[reportFP error]:param", 3, "", null, null);
                            str5 = "";
                        }
                        String a5 = com.umeng.umlink.a.a.a("https://deeplink.umeng.com/deeplink/deviceFingerprint", str5);
                        try {
                            if (TextUtils.isEmpty(a5)) {
                                throw new Exception("network error");
                            }
                            JSONObject jSONObject2 = new JSONObject(a5);
                            if (jSONObject2.getInt(PluginConstants.KEY_ERROR_CODE) == 200) {
                                UMLog.mutlInfo("[reportFP result]:200", 3, "", null, null);
                            } else {
                                throw new Exception("code=" + jSONObject2.getInt(PluginConstants.KEY_ERROR_CODE));
                            }
                        } catch (Exception e7) {
                            UMLog.mutlInfo("[reportFP error]:" + e7.getMessage(), 3, "", null, null);
                        }
                    }
                }));
            }
            uMLinkListener.onLink(path, hashMap);
        }
    }

    public void init(Context context) {
        if (f13606a == null) {
            f13606a = context.getApplicationContext();
        }
    }
}

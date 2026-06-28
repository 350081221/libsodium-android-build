package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9104a = "UriUtil";

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.secure.android.common.util.e.r(f9104a, "whiteListUrl is null");
            return null;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            return str;
        }
        return b(str);
    }

    @TargetApi(9)
    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.secure.android.common.util.e.r(f9104a, "url is null");
            return str;
        }
        try {
            if (!URLUtil.isNetworkUrl(str)) {
                com.huawei.secure.android.common.util.e.l(f9104a, "url don't starts with http or https");
                return "";
            }
            return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
        } catch (MalformedURLException e5) {
            com.huawei.secure.android.common.util.e.l(f9104a, "getHostByURI error  MalformedURLException : " + e5.getMessage());
            return "";
        }
    }

    public static boolean c(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (d(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        com.huawei.secure.android.common.util.e.l(f9104a, "whitelist is null");
        return false;
    }

    public static boolean d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.contains("..") && !str.contains("@")) {
                if (!str2.equals(str)) {
                    if (!str.startsWith(str2 + "?")) {
                        if (!str.startsWith(str2 + "#")) {
                            if (!str2.endsWith("/")) {
                                return false;
                            }
                            if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() != 1) {
                                return false;
                            }
                            return str.startsWith(str2);
                        }
                    }
                }
                return true;
            }
            Log.e(f9104a, "url contains unsafe char");
        }
        return false;
    }

    public static boolean e(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (f(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        com.huawei.secure.android.common.util.e.l(f9104a, "whitelist is null");
        return false;
    }

    public static boolean f(String str, String str2) {
        String b5 = b(str);
        if (!TextUtils.isEmpty(b5) && !TextUtils.isEmpty(str2)) {
            String a5 = a(str2);
            if (TextUtils.isEmpty(a5)) {
                Log.e(f9104a, "whitelist host is null");
                return false;
            }
            if (a5.equals(b5)) {
                return true;
            }
            if (b5.endsWith(a5)) {
                try {
                    String substring = b5.substring(0, b5.length() - a5.length());
                    if (!substring.endsWith(".")) {
                        return false;
                    }
                    return substring.matches("^[A-Za-z0-9.-]+$");
                } catch (IndexOutOfBoundsException e5) {
                    com.huawei.secure.android.common.util.e.l(f9104a, "IndexOutOfBoundsException" + e5.getMessage());
                } catch (Exception e6) {
                    com.huawei.secure.android.common.util.e.l(f9104a, "Exception : " + e6.getMessage());
                    return false;
                }
            }
            return false;
        }
        com.huawei.secure.android.common.util.e.l(f9104a, "url or whitelist is null");
        return false;
    }

    public static boolean g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(b(str), a(str2));
        }
        Log.e(f9104a, "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    public static boolean h(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (g(str, str2)) {
                    return true;
                }
            }
            return false;
        }
        com.huawei.secure.android.common.util.e.l(f9104a, "whitelist is null");
        return false;
    }
}

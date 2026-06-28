package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;

/* loaded from: classes3.dex */
public class aq {

    /* renamed from: a, reason: collision with root package name */
    private static String f12170a = "";

    /* renamed from: b, reason: collision with root package name */
    private static String f12171b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12172c = "hw_sc.build.platform.version";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12173d = "ro.build.version.emui";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12174e = "ro.build.version.magic";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12175f = "ro.miui.ui.version.name";

    /* renamed from: g, reason: collision with root package name */
    private static final String f12176g = "ro.build.version.opporom";

    /* renamed from: h, reason: collision with root package name */
    private static final String f12177h = "ro.vivo.os.name";

    /* renamed from: i, reason: collision with root package name */
    private static final String f12178i = "ro.vivo.os.version";

    /* renamed from: j, reason: collision with root package name */
    private static final String f12179j = "ro.build.version.oplusrom";

    /* renamed from: k, reason: collision with root package name */
    private static final String f12180k = "ro.rom.version";

    private static boolean a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(f12170a)) {
            e(str);
        }
        return f12171b;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll(" ", "").toUpperCase();
    }

    private static String d(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void e(String str) {
        char c5;
        try {
            String c6 = c(str);
            switch (c6.hashCode()) {
                case -1881642058:
                    if (c6.equals("REALME")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1706170181:
                    if (c6.equals("XIAOMI")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -602397472:
                    if (c6.equals("ONEPLUS")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2432928:
                    if (c6.equals(BaseConstants.ROM_OPPO_UPPER_CONSTANT)) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2634924:
                    if (c6.equals("VIVO")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 68924490:
                    if (c6.equals("HONOR")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 77852109:
                    if (c6.equals("REDMI")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 2141820391:
                    if (c6.equals("HUAWEI")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            switch (c5) {
                case 0:
                    if (a()) {
                        f12171b = d("hw_sc.build.platform.version");
                        f12170a = "HarmonyOS";
                        return;
                    } else {
                        f12170a = "EMUI";
                        f12171b = d("ro.build.version.emui");
                        return;
                    }
                case 1:
                    if (!TextUtils.isEmpty(d(f12174e))) {
                        f12170a = "MagicUI";
                        f12171b = d(f12174e);
                        return;
                    } else {
                        f12170a = "EMUI";
                        f12171b = d("ro.build.version.emui");
                        return;
                    }
                case 2:
                case 3:
                    f12170a = "MIUI";
                    f12171b = d(f12175f);
                    return;
                case 4:
                case 5:
                    f12170a = "ColorOS";
                    f12171b = d(f12176g);
                    return;
                case 6:
                    f12170a = "Funtouch";
                    f12171b = d(f12178i);
                    return;
                case 7:
                    f12170a = "HydrogenOS";
                    String d5 = d(f12180k);
                    if (TextUtils.isEmpty(d5)) {
                        f12170a = "ColorOS";
                        d5 = d(f12179j);
                    }
                    f12171b = d5;
                    return;
                default:
                    f12170a = "Android";
                    f12171b = Build.VERSION.RELEASE;
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(f12170a)) {
            e(str);
        }
        return f12170a;
    }
}

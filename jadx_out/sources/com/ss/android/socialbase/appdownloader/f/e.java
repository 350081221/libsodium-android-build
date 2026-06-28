package com.ss.android.socialbase.appdownloader.f;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.appdownloader.g;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static String f10352a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f10353b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f10354c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f10355d = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f10356e;

    /* renamed from: f, reason: collision with root package name */
    private static String f10357f;

    /* renamed from: g, reason: collision with root package name */
    private static String f10358g;

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f10359h;

    public static boolean a() {
        return a("EMUI") || a("MAGICUI");
    }

    public static boolean b() {
        return a("MAGICUI");
    }

    public static boolean c() {
        return a("MIUI");
    }

    public static boolean d() {
        return a("VIVO");
    }

    public static boolean e() {
        r();
        return a(f10352a);
    }

    public static boolean f() {
        return a("FLYME");
    }

    public static boolean g() {
        return a("SAMSUNG");
    }

    public static String h() {
        if (f10356e == null) {
            a("");
        }
        return f10356e;
    }

    public static String i() {
        if (f10357f == null) {
            a("");
        }
        return f10357f;
    }

    public static String j() {
        if (f10354c == null) {
            a("");
        }
        return f10354c;
    }

    @NonNull
    public static String k() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str.trim();
    }

    @NonNull
    public static String l() {
        String str = Build.DISPLAY;
        return str == null ? "" : str.trim();
    }

    public static boolean m() {
        s();
        return "V10".equals(f10358g);
    }

    public static boolean n() {
        s();
        return "V11".equals(f10358g);
    }

    public static boolean o() {
        s();
        return "V12".equals(f10358g);
    }

    public static boolean p() {
        if (f10359h == null) {
            f10359h = Boolean.valueOf(d.g().equals("harmony"));
        }
        return f10359h.booleanValue();
    }

    public static boolean q() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("honor")) {
            String str2 = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str2) || !str2.toLowerCase().startsWith("honor")) {
                return false;
            }
        }
        return true;
    }

    private static void r() {
        if (TextUtils.isEmpty(f10352a)) {
            com.ss.android.socialbase.downloader.downloader.c.G();
            f10352a = com.ss.android.socialbase.downloader.constants.e.f10512b;
            f10355d = "ro.build.version." + com.ss.android.socialbase.downloader.constants.e.f10513c + "rom";
            f10353b = "com." + com.ss.android.socialbase.downloader.constants.e.f10513c + ".market";
        }
    }

    private static void s() {
        if (f10358g == null) {
            try {
                f10358g = d("ro.miui.ui.version.name");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String str = f10358g;
            if (str == null) {
                str = "";
            }
            f10358g = str;
        }
    }

    public static boolean a(String str) {
        r();
        String str2 = f10356e;
        if (str2 != null) {
            return str2.equals(str);
        }
        String d5 = d("ro.miui.ui.version.name");
        f10357f = d5;
        if (!TextUtils.isEmpty(d5)) {
            f10356e = "MIUI";
            f10354c = "com.xiaomi.market";
            f10358g = f10357f;
        } else {
            String d6 = d(s.a.f22319a);
            f10357f = d6;
            if (!TextUtils.isEmpty(d6)) {
                String str3 = q() ? "MAGICUI" : "EMUI";
                f10356e = str3;
                if (TextUtils.equals(str3, "MAGICUI")) {
                    f10354c = "com.hihonor.appmarket";
                } else {
                    f10354c = "com.huawei.appmarket";
                }
            } else {
                String d7 = d("ro.build.version.magic");
                f10357f = d7;
                if (!TextUtils.isEmpty(d7)) {
                    f10356e = "MAGICUI";
                    f10354c = "com.hihonor.appmarket";
                } else {
                    String d8 = d(f10355d);
                    f10357f = d8;
                    if (!TextUtils.isEmpty(d8)) {
                        f10356e = f10352a;
                        if (g.a(f10353b) > -1) {
                            f10354c = f10353b;
                        } else {
                            f10354c = "com.heytap.market";
                        }
                    } else {
                        String d9 = d("ro.vivo.os.version");
                        f10357f = d9;
                        if (!TextUtils.isEmpty(d9)) {
                            f10356e = "VIVO";
                            f10354c = "com.bbk.appstore";
                        } else {
                            String d10 = d("ro.smartisan.version");
                            f10357f = d10;
                            if (!TextUtils.isEmpty(d10)) {
                                f10356e = "SMARTISAN";
                                f10354c = "com.smartisanos.appstore";
                            } else {
                                String d11 = d("ro.gn.sv.version");
                                f10357f = d11;
                                if (!TextUtils.isEmpty(d11)) {
                                    f10356e = "QIONEE";
                                    f10354c = "com.gionee.aora.market";
                                } else {
                                    String d12 = d("ro.lenovo.lvp.version");
                                    f10357f = d12;
                                    if (!TextUtils.isEmpty(d12)) {
                                        f10356e = "LENOVO";
                                        f10354c = "com.lenovo.leos.appstore";
                                    } else if (k().toUpperCase().contains("SAMSUNG")) {
                                        f10356e = "SAMSUNG";
                                        f10354c = "com.sec.android.app.samsungapps";
                                    } else if (k().toUpperCase().contains("ZTE")) {
                                        f10356e = "ZTE";
                                        f10354c = "zte.com.market";
                                    } else if (k().toUpperCase().contains("NUBIA")) {
                                        f10356e = "NUBIA";
                                        f10354c = "cn.nubia.neostore";
                                    } else if (l().toUpperCase().contains("FLYME")) {
                                        f10356e = "FLYME";
                                        f10354c = "com.meizu.mstore";
                                        f10357f = l();
                                    } else if (k().toUpperCase().contains("ONEPLUS")) {
                                        f10356e = "ONEPLUS";
                                        f10357f = d("ro.rom.version");
                                        if (g.a(f10353b) > -1) {
                                            f10354c = f10353b;
                                        } else {
                                            f10354c = "com.heytap.market";
                                        }
                                    } else {
                                        f10356e = k().toUpperCase();
                                        f10354c = "";
                                        f10357f = "";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return f10356e.equals(str);
    }

    public static String b(String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            com.ss.android.socialbase.downloader.i.f.a(bufferedReader);
            return readLine;
        } catch (Throwable unused2) {
            com.ss.android.socialbase.downloader.i.f.a(bufferedReader);
            return null;
        }
    }

    public static String c(String str) throws Throwable {
        return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
    }

    public static String d(String str) {
        if (com.ss.android.socialbase.downloader.g.a.b().optBoolean("enable_reflect_system_properties", true)) {
            try {
                return c(str);
            } catch (Throwable th) {
                th.printStackTrace();
                return b(str);
            }
        }
        return b(str);
    }
}

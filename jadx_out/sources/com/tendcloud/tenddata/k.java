package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11748a = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11749b = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11750c = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";

    /* renamed from: d, reason: collision with root package name */
    private static final int f11751d = 3600000;

    /* renamed from: i, reason: collision with root package name */
    private static int[] f11756i;

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f11752e = Pattern.compile("([0-9]+)");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f11753f = Pattern.compile("\\s*([0-9]+)");

    /* renamed from: g, reason: collision with root package name */
    private static List<PackageInfo> f11754g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private static boolean f11755h = false;

    /* renamed from: j, reason: collision with root package name */
    private static final FileFilter f11757j = new FileFilter() { // from class: com.tendcloud.tenddata.k.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file != null) {
                try {
                    String name = file.getName();
                    if (name != null && name.startsWith(com.umeng.analytics.pro.bi.f12277w)) {
                        for (int i5 = 3; i5 < name.length(); i5++) {
                            if (name.charAt(i5) < '0' || name.charAt(i5) > '9') {
                                return false;
                            }
                        }
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static BroadcastReceiver f11758k = new BroadcastReceiver() { // from class: com.tendcloud.tenddata.k.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    };

    /* loaded from: classes3.dex */
    public static class a {
        static final int HCE_ENABLED = 3;
        static final int NFC_ENABLED = 2;
        static final int NOT_ENALBED = 1;
        static final int UNKNOWN = 0;
    }

    public static String a() {
        return ab.f11354j + Build.VERSION.RELEASE;
    }

    public static boolean b() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object invoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (invoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(invoke.toString());
        } catch (Throwable th) {
            h.iForInternal("SA.HasHarmonyOS", th.getMessage());
            return false;
        }
    }

    public static String c() {
        return a(s.a.f22320b, (String) null);
    }

    public static String d() {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            Process exec = Runtime.getRuntime().exec("uname -r");
            inputStream = exec.waitFor() == 0 ? exec.getInputStream() : exec.getErrorStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 512);
                try {
                    String readLine = bufferedReader.readLine();
                    inputStream.close();
                    bufferedReader.close();
                    exec.destroy();
                    try {
                        inputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return readLine;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        th.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
            bufferedReader = null;
        }
    }

    public static String e() {
        try {
            return Build.ID;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f() {
        return Build.MANUFACTURER.trim();
    }

    public static String g() {
        return Build.BRAND.trim();
    }

    public static String h() {
        return Build.MODEL.trim();
    }

    public static int i() {
        return TimeZone.getDefault().getRawOffset() / 3600000;
    }

    public static String j() {
        try {
            String trim = Build.MODEL.trim();
            String b5 = b(Build.MANUFACTURER.trim(), trim);
            if (TextUtils.isEmpty(b5)) {
                b5 = b(Build.BRAND.trim(), trim);
            }
            if (b5 == null) {
                b5 = "";
            }
            return b5 + ":" + trim;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String k() {
        try {
            return y.a(14) ? Build.getRadioVersion() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static int l() {
        return Build.VERSION.SDK_INT;
    }

    public static String m() {
        return Build.VERSION.RELEASE;
    }

    public static String n() {
        return Locale.getDefault().getLanguage();
    }

    public static String o() {
        return Locale.getDefault().getCountry();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:7:0x0013, B:21:0x003c, B:23:0x004b, B:25:0x0058, B:27:0x005f, B:29:0x0068, B:31:0x0078, B:33:0x0082, B:36:0x0085, B:38:0x0088, B:43:0x0044), top: B:6:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] p() {
        /*
            r0 = 4
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto Le
            java.lang.String r4 = ""
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L90
            r5 = 1024(0x400, float:1.435E-42)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L90
        L21:
            r5 = 1
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L3c
            r0.add(r6)     // Catch: java.lang.Throwable -> L44
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L44
            r7 = 104857600(0x6400000, float:3.6111186E-35)
            if (r6 > r7) goto L34
            goto L21
        L34:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = "List size more than 104857600 limit"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L44
            throw r6     // Catch: java.lang.Throwable -> L44
        L3c:
            r4.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L90
        L42:
            r3 = r5
            goto L4b
        L44:
            r4.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
            r3.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L90
        L4a:
            r3 = r2
        L4b:
            java.lang.String r4 = "Processor\\s*:\\s*(.*)"
            java.lang.String r6 = "CPU\\s*variant\\s*:\\s*0x(.*)"
            java.lang.String r7 = "Hardware\\s*:\\s*(.*)"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6, r7}     // Catch: java.lang.Throwable -> L90
            r6 = 3
            if (r3 == 0) goto L88
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L90
            r7 = r2
        L5d:
            if (r7 >= r6) goto L88
            r8 = r4[r7]     // Catch: java.lang.Throwable -> L90
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)     // Catch: java.lang.Throwable -> L90
            r9 = r2
        L66:
            if (r9 >= r3) goto L85
            java.lang.Object r10 = r0.get(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L90
            java.util.regex.Matcher r10 = r8.matcher(r10)     // Catch: java.lang.Throwable -> L90
            boolean r11 = r10.find()     // Catch: java.lang.Throwable -> L90
            if (r11 == 0) goto L82
            java.util.regex.MatchResult r10 = r10.toMatchResult()     // Catch: java.lang.Throwable -> L90
            java.lang.String r10 = r10.group(r5)     // Catch: java.lang.Throwable -> L90
            r1[r7] = r10     // Catch: java.lang.Throwable -> L90
        L82:
            int r9 = r9 + 1
            goto L66
        L85:
            int r7 = r7 + 1
            goto L5d
        L88:
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L90
            r1[r6] = r0     // Catch: java.lang.Throwable -> L90
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.k.p():java.lang.String[]");
    }

    public static JSONObject q() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", p()[2]);
            jSONObject.put("coreNum", r());
            jSONObject.put("maxFreq", a(f11748a));
            jSONObject.put("minFreq", a(f11749b));
            jSONObject.put("curFreq", a(f11750c));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int r() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(f11757j);
            if (listFiles != null) {
                return listFiles.length;
            }
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    public static int[] s() {
        int[] iArr = {0, 0};
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                int blockSize = statFs.getBlockSize();
                int blockCount = statFs.getBlockCount();
                int availableBlocks = statFs.getAvailableBlocks();
                iArr[0] = (blockCount * (blockSize / 512)) / 2;
                iArr[1] = (availableBlocks * (blockSize / 512)) / 2;
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    private static JSONArray t(Context context) {
        ServiceInfo[] serviceInfoArr;
        if (!y.a(19)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<PackageInfo> a5 = a(context, 4);
            if (a5 != null) {
                for (PackageInfo packageInfo : a5) {
                    if (packageInfo != null && (serviceInfoArr = packageInfo.services) != null) {
                        int length = serviceInfoArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                ServiceInfo serviceInfo = serviceInfoArr[i5];
                                try {
                                    Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(serviceInfo.packageName, serviceInfo.name), 128).metaData;
                                    if (bundle != null && bundle.containsKey("android.nfc.cardemulation.host_apdu_service")) {
                                        jSONArray.put(packageInfo.packageName);
                                        break;
                                    }
                                } catch (Throwable unused) {
                                }
                                i5++;
                            }
                        }
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static int u(Context context) {
        NfcAdapter defaultAdapter;
        try {
            if (!y.a(19) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return -1;
            }
            return CardEmulation.getInstance(defaultAdapter).getSelectionModeForCategory("payment");
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int v() {
        try {
            Matcher matcher = f11753f.matcher(c("/sys/class/power_supply/battery/full_bat"));
            if (!matcher.find()) {
                return 0;
            }
            return Integer.parseInt(matcher.toMatchResult().group(0));
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }

    public static int c(Context context) {
        NfcAdapter defaultAdapter;
        int i5;
        if (context == null) {
            return 0;
        }
        try {
            if (!y.a(10) || (defaultAdapter = ((NfcManager) context.getSystemService("nfc")).getDefaultAdapter()) == null) {
                return 0;
            }
            if (defaultAdapter.isEnabled()) {
                if (y.a(19)) {
                    if (context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce")) {
                        i5 = 3;
                    }
                }
                i5 = 2;
            } else {
                i5 = 1;
            }
            return i5;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String e(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                return "";
            }
            int i5 = displayMetrics.widthPixels;
            int i6 = displayMetrics.heightPixels;
            return Math.min(i5, i6) + org.slf4j.d.ANY_MARKER + Math.max(i5, i6) + org.slf4j.d.ANY_MARKER + displayMetrics.densityDpi;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int f(Context context) {
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent registerReceiver = context.registerReceiver(f11758k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i5 = registerReceiver != null ? registerReceiver.getExtras().getInt("level", 0) : 0;
        context.unregisterReceiver(f11758k);
        return i5;
    }

    public static int g(Context context) {
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return 0;
                }
            } catch (Throwable unused) {
                return 0;
            }
        }
        Intent registerReceiver = context.registerReceiver(f11758k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", 0) : 0;
        context.unregisterReceiver(f11758k);
        return intExtra;
    }

    public static JSONObject h(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mobile", o(context));
            jSONObject.put(NetworkUtil.NETWORK_TYPE_WIFI, k(context));
            jSONObject.put("gps", j(context));
            jSONObject.put("telephone", n(context));
            jSONObject.put("nfc", m(context));
            jSONObject.put("bluetooth", l(context));
            jSONObject.put("otg", i(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean i(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.usb.host");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.bluetooth");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean m(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.nfc");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean n(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager != null) {
                return telephonyManager.getPhoneType() != 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean o(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean k(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.wifi");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.densityDpi;
        }
        return -1;
    }

    public static JSONObject b(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("nfcStatus", c(context));
            jSONObject.put("appsRegistedHCE", t(context));
            jSONObject.put("ssMode", u(context));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int[] u() {
        int[] iArr = new int[4];
        int[] iArr2 = f11756i;
        if (iArr2 == null || iArr2.length <= 0) {
            f11756i = a(iArr);
        }
        return f11756i;
    }

    public static boolean a(Context context) {
        try {
            if (y.a(17)) {
                return Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader fileReader = new FileReader(str);
            char[] cArr = new char[1024];
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            while (true) {
                int read = bufferedReader.read(cArr, 0, 1024);
                if (-1 == read) {
                    break;
                }
                stringBuffer.append(new String(cArr, 0, read));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static boolean j(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.hasSystemFeature("android.hardware.location.gps");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int q(Context context) {
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return -1;
    }

    private static String b(String str, String str2) {
        try {
            String lowerCase = str.toLowerCase();
            if (!lowerCase.startsWith("unknown") && !lowerCase.startsWith("alps") && !lowerCase.startsWith(SharedLibraryInfo.PLATFORM_PACKAGE_NAME) && !lowerCase.startsWith("sprd") && !lowerCase.startsWith("spreadtrum") && !lowerCase.startsWith("rockchip") && !lowerCase.startsWith("wondermedia") && !lowerCase.startsWith("mtk") && !lowerCase.startsWith("mt65") && !lowerCase.startsWith("nvidia") && !lowerCase.startsWith("brcm") && !lowerCase.startsWith("marvell")) {
                if (!str2.toLowerCase().contains(lowerCase)) {
                    return str;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static List<PackageInfo> a(Context context, int i5) {
        ArrayList arrayList = new ArrayList();
        if (!ab.T.isAppListEnabled() || ab.S) {
            return arrayList;
        }
        try {
            return d(context);
        } catch (Throwable unused) {
            PackageManager packageManager = context.getPackageManager();
            BufferedReader bufferedReader = null;
            try {
                try {
                    Process exec = Runtime.getRuntime().exec("pm list packages");
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            arrayList.add(packageManager.getPackageInfo(readLine.substring(readLine.indexOf(58) + 1), i5));
                        } catch (Throwable unused2) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return arrayList;
                        }
                    }
                    exec.waitFor();
                    bufferedReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
            return arrayList;
        }
    }

    public static int[] t() {
        int[] iArr = {0, 0};
        int[] iArr2 = new int[4];
        for (int i5 = 0; i5 < 4; i5++) {
            iArr2[i5] = 0;
        }
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
            for (int i6 = 0; i6 < 4; i6++) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine.length() <= 104857600) {
                        iArr2[i6] = b(readLine);
                    } else {
                        throw new RuntimeException("Input stream more than 100 MB size limit");
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1] + iArr2[2] + iArr2[3];
            bufferedReader.close();
            fileReader.close();
        } catch (Throwable unused3) {
        }
        return iArr;
    }

    public static int s(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return -1;
        }
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static int p(Context context) {
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return -1;
                }
            } catch (Throwable unused) {
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public static JSONObject b(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("brightness", s(context));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static synchronized List<PackageInfo> d(Context context) {
        synchronized (k.class) {
            if (!ab.T.isAppListEnabled()) {
                return null;
            }
            if (ab.S) {
                return null;
            }
            if (f11755h) {
                return f11754g;
            }
            if (y.a(30) && y.a(context, 30) && !y.c(context, "android.permission.QUERY_ALL_PACKAGES")) {
                f11755h = true;
                return f11754g;
            }
            try {
                f11754g = context.getPackageManager().getInstalledPackages(5);
                f11755h = true;
            } catch (Throwable unused) {
            }
            return f11754g;
        }
    }

    public static JSONObject a(Context context, JSONObject jSONObject) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                int i5 = displayMetrics.widthPixels;
                int i6 = displayMetrics.heightPixels;
                jSONObject.put("pixel", Math.min(i5, i6) + org.slf4j.d.ANY_MARKER + Math.max(i5, i6) + org.slf4j.d.ANY_MARKER + displayMetrics.densityDpi);
                jSONObject.put("densityDpi", displayMetrics.densityDpi);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static int b(String str) {
        try {
            Matcher matcher = f11752e.matcher(str);
            return Integer.parseInt(matcher.find() ? matcher.toMatchResult().group(0) : "");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r5 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L39
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L39
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L37
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L37
            r4 = 104857600(0x6400000, float:3.6111186E-35)
            if (r3 > r4) goto L2e
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L37
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L37
            r2.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            r5.close()     // Catch: java.lang.Throwable -> L42
            goto L42
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "Input stream more than 100 MB size limit"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L36:
            r5 = r0
        L37:
            r0 = r2
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r0 == 0) goto L3f
            r0.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            if (r5 == 0) goto L42
            goto L2a
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.k.a(java.lang.String):int");
    }

    private static int[] a(int[] iArr) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            iArr[0] = (statFs.getBlockCount() * (statFs.getBlockSize() / 512)) / 2;
            iArr[1] = (statFs.getAvailableBlocks() * (statFs.getBlockSize() / 512)) / 2;
        } catch (Throwable unused) {
        }
        try {
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            iArr[2] = (statFs2.getBlockCount() * (statFs2.getBlockSize() / 512)) / 2;
            iArr[3] = (statFs2.getAvailableBlocks() * (statFs2.getBlockSize() / 512)) / 2;
        } catch (Throwable unused2) {
        }
        return iArr;
    }
}

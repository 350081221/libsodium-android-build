package com.tendcloud.tenddata;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static TelephonyManager f11759a = null;

    /* renamed from: b, reason: collision with root package name */
    private static String f11760b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f11761c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f11762d;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f11762d = hashMap;
        try {
            Context context = ab.f11351g;
            if (context != null) {
                f11759a = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                hashMap.put("imei1", a(ab.f11351g, 0));
                hashMap.put("meid1", a(0));
                if (o.B(ab.f11351g) == 2) {
                    hashMap.put("imei2", a(ab.f11351g, 1));
                    hashMap.put("meid2", a(1));
                }
                hashMap.put("imsi", g(ab.f11351g));
                hashMap.put("androidId", e(ab.f11351g));
                hashMap.put("mac", d(ab.f11351g));
                hashMap.put("ethMac", c());
                hashMap.put("dummy0", b());
                hashMap.put("serialNo", c(ab.f11351g));
            }
        } catch (Throwable unused) {
        }
    }

    private l() {
    }

    public static String c() {
        if (!ab.T.isMACEnabled()) {
            return null;
        }
        try {
            String f5 = f();
            try {
                if (y.j(f5)) {
                    return null;
                }
            } catch (Throwable unused) {
            }
            return f5;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String c(Context context) {
        return null;
    }

    public static String d(Context context) {
        String j5;
        if (!ab.T.isMACEnabled()) {
            return null;
        }
        try {
            if (y.a(23)) {
                j5 = e();
            } else {
                j5 = j(context);
            }
            try {
                if (y.j(j5)) {
                    return null;
                }
            } catch (Throwable unused) {
            }
            return j5;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(Context context) {
        HashMap<String, String> hashMap;
        String str;
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return "";
        }
        try {
            if (o.B(context) == 2) {
                hashMap = f11762d;
                str = "imei2";
            } else {
                hashMap = f11762d;
                str = "imei1";
            }
            return hashMap.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String g(Context context) {
        return null;
    }

    private static String h(Context context) {
        try {
            if (y.b(context, "android.permission.READ_PHONE_STATE")) {
                String str = "";
                if (o.B(context) == 2) {
                    try {
                        HashMap<String, String> hashMap = f11762d;
                        hashMap.get("imei1");
                        str = hashMap.get("imei2");
                    } catch (Exception unused) {
                    }
                }
                if (y.b(str)) {
                    return f11762d.get("imei1");
                }
                return str;
            }
            return null;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String i(Context context) {
        return null;
    }

    private static String j(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String macAddress;
        try {
            if (y.b(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) != null && wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null && (macAddress = connectionInfo.getMacAddress()) != null) {
                return macAddress.toUpperCase().trim();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a() {
        try {
            if (y.c(ab.f11351g, "android.permission.READ_PHONE_STATE")) {
                o.tryGetDoubleSimInfoReCheck(ab.f11351g);
                dk.b().a();
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(final Context context) {
        try {
            if (!f11761c) {
                w.f11818a.execute(new Runnable() { // from class: com.tendcloud.tenddata.l.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            boolean unused = l.f11761c = true;
                            String unused2 = l.f11760b = (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), new Object[0]);
                        } catch (Throwable unused3) {
                        }
                    }
                });
            }
            return f11760b;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String e() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b5 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b5)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String f() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("eth0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b5 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b5)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(int i5) {
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            String a5 = a(i5 == 1 ? "meid2" : "meid1");
            if (y.b(a5)) {
                return null;
            }
            return y.c(a5);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(String str) {
        return f11762d.get(str);
    }

    public static String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.getName().toLowerCase().startsWith("dummy")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        String hostAddress = inetAddresses.nextElement().getHostAddress();
                        if (hostAddress.contains("dummy")) {
                            return hostAddress.split("%")[0];
                        }
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Context context) {
        try {
            String a5 = a("mac");
            if (!y.b(a5)) {
                a5 = String.valueOf(Long.parseLong(a5.replaceAll(":", ""), 16));
            }
            String a6 = a("androidId");
            String a7 = a("imeis");
            String a8 = a("imsi");
            String a9 = a("simId");
            String a10 = j.a(context);
            String d5 = d();
            String a11 = a("serialNo");
            StringBuilder sb = new StringBuilder(170);
            sb.append(2);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a5);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a6);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a7);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a8);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a9);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a10);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(d5);
            sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb.append(a11);
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String d() {
        try {
            return df.a().c();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(int i5) {
        String a5;
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            if (i5 == 1) {
                a5 = a("imei2");
            } else {
                a5 = a("imei1");
            }
            if (y.b(a5)) {
                return null;
            }
            return y.c(a5);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(Context context, int i5) {
        String imei;
        if (!ab.T.isIMEIAndMEIDEnabled() || !y.b(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (y.a(26)) {
            try {
                imei = f11759a.getImei(i5);
                return imei;
            } catch (Throwable unused) {
                return "";
            }
        }
        if (y.a(23)) {
            return f11759a.getDeviceId(i5);
        }
        return f11759a.getDeviceId();
    }

    static String a(int i5) {
        String meid;
        if (!ab.T.isIMEIAndMEIDEnabled() || !y.a(26)) {
            return "";
        }
        try {
            meid = f11759a.getMeid(i5);
            return meid;
        } catch (Throwable unused) {
            return "";
        }
    }
}

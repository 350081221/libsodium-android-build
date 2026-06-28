package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.http.Headers;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    static final String f11764a = "www.talkingdata.net";

    /* renamed from: b, reason: collision with root package name */
    static final int f11765b = 80;

    /* renamed from: c, reason: collision with root package name */
    private static TelephonyManager f11766c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f11767d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f11768e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f11769f;

    /* renamed from: g, reason: collision with root package name */
    private static a f11770g = null;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f11771h = false;

    /* renamed from: i, reason: collision with root package name */
    private static final long f11772i = 300000;

    /* renamed from: j, reason: collision with root package name */
    private static long f11773j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile boolean f11774k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f11775l;

    /* renamed from: m, reason: collision with root package name */
    private static JSONArray f11776m;

    /* renamed from: n, reason: collision with root package name */
    private static JSONArray f11777n;

    /* renamed from: o, reason: collision with root package name */
    private static volatile boolean f11778o;

    /* renamed from: p, reason: collision with root package name */
    private static volatile boolean f11779p;

    /* renamed from: q, reason: collision with root package name */
    private static volatile boolean f11780q;

    /* renamed from: r, reason: collision with root package name */
    private static JSONArray f11781r;

    /* renamed from: s, reason: collision with root package name */
    private static JSONArray f11782s;

    /* renamed from: t, reason: collision with root package name */
    private static JSONArray f11783t;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f11784u;

    /* renamed from: v, reason: collision with root package name */
    private static b f11785v;

    /* renamed from: w, reason: collision with root package name */
    private static JSONArray f11786w;

    /* renamed from: x, reason: collision with root package name */
    private static volatile boolean f11787x;

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        private Context context;
        private Object lock;
        private BroadcastReceiver receiver;

        public a(Context context, Object obj, BroadcastReceiver broadcastReceiver) {
            this.context = context;
            this.lock = obj;
            this.receiver = broadcastReceiver;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            BroadcastReceiver broadcastReceiver;
            try {
                synchronized (this.lock) {
                    try {
                        this.lock.notifyAll();
                        context = this.context;
                        broadcastReceiver = this.receiver;
                    } catch (Throwable unused) {
                        context = this.context;
                        broadcastReceiver = this.receiver;
                    }
                    context.unregisterReceiver(broadcastReceiver);
                }
            } catch (Throwable unused2) {
            }
        }

        public void unRegisterReceiver() {
            BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                try {
                    this.context.unregisterReceiver(broadcastReceiver);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends BroadcastReceiver {
        private CountDownLatch latch = new CountDownLatch(1);

        b() {
        }

        void await() {
            try {
                this.latch.await(2000L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                h.eForInternal(th);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction()) && this.latch.getCount() > 0) {
                this.latch.countDown();
            }
        }

        void reset() {
            this.latch = new CountDownLatch(1);
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f11767d = hashMap;
        f11768e = new String[]{GrsBaseInfo.CountryCodeSource.UNKNOWN, "GPRS", "EDGE", "UMTS", "CDMA", "EVDO_0", "EVDO_A", "1xRTT", "HSDPA", "HSUPA", "HSPA", "IDEN", "EVDO_B", "LTE", "EHRPD", "HSPAP"};
        f11769f = new String[]{"NONE", "GSM", "CDMA", "SIP"};
        f11770g = null;
        if (ab.f11351g != null) {
            String[] a5 = a();
            hashMap.put("ip", a5[0]);
            hashMap.put("ipv6", a5[1]);
            hashMap.put("cell_ip", a5[2]);
            hashMap.put("cell_ipv6", a5[3]);
            hashMap.put("bssid", q(ab.f11351g));
            hashMap.put("ssid", w(ab.f11351g));
        }
        f11771h = false;
        f11773j = -300000L;
        f11774k = false;
        f11775l = false;
        f11776m = new JSONArray();
        f11778o = false;
        f11779p = false;
        f11780q = false;
        f11781r = new JSONArray();
        f11784u = false;
        f11785v = new b();
        f11786w = new JSONArray();
        f11787x = false;
    }

    public static JSONArray A(Context context) {
        if (f11786w.length() <= 0 && !f11787x) {
            if (!y.b(context, "android.permission.READ_PHONE_STATE")) {
                return f11786w;
            }
            D(context);
            return f11786w;
        }
        return f11786w;
    }

    public static int B(Context context) {
        try {
            if (y.a(23)) {
                if (f11766c == null) {
                    a(context);
                }
                return f11766c.getPhoneCount();
            }
            return A(context).length();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Map<String, Object> C(Context context) {
        DatagramSocket datagramSocket;
        if (d(context)) {
            try {
                String str = f11767d.get("ip");
                if (str != null) {
                    String substring = str.substring(0, str.lastIndexOf(46) + 1);
                    DatagramPacket datagramPacket = new DatagramPacket(new byte[0], 0, 0);
                    datagramSocket = new DatagramSocket();
                    for (int i5 = 1; i5 < 255; i5++) {
                        try {
                            try {
                                datagramPacket.setAddress(InetAddress.getByName(substring + i5));
                                datagramSocket.send(datagramPacket);
                                if (i5 == 125) {
                                    datagramSocket.close();
                                    datagramSocket = new DatagramSocket();
                                }
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            if (datagramSocket != null) {
                                try {
                                    datagramSocket.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            return null;
                        }
                    }
                    datagramSocket.close();
                } else {
                    datagramSocket = null;
                }
                Thread.sleep(5000L);
                Map<String, Object> c5 = c();
                if (datagramSocket != null) {
                    try {
                        datagramSocket.close();
                    } catch (Throwable unused4) {
                    }
                }
                return c5;
            } catch (Throwable unused5) {
                datagramSocket = null;
            }
        }
        return null;
    }

    private static void D(Context context) {
        String str;
        String str2;
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            ArrayList arrayList = new ArrayList();
            if (y.a(22)) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                try {
                    JSONObject a5 = a(context, subscriptionManager, 0);
                    if (y.a(26)) {
                        try {
                            a5.put("imei", l.a("imei1"));
                            a5.put("imei5", l.b(0));
                        } catch (Throwable unused) {
                        }
                        try {
                            a5.put("meid", l.a("meid1"));
                            a5.put("meid5", l.c(0));
                        } catch (Throwable unused2) {
                        }
                    } else {
                        a5.put("imei", l.a("imei1"));
                        a5.put("imei5", l.b(0));
                    }
                    if (a5.length() > 0) {
                        f11786w.put(a5);
                    }
                } catch (Throwable unused3) {
                }
                JSONObject a6 = a(context, subscriptionManager, 1);
                if (telephonyManager != null) {
                    if (y.a(26)) {
                        try {
                            a6.put("imei", l.a("imei2"));
                            a6.put("imei5", l.b(1));
                        } catch (Throwable unused4) {
                        }
                        try {
                            a6.put("meid", l.a("meid2"));
                            a6.put("meid5", l.c(1));
                        } catch (Throwable unused5) {
                        }
                    } else {
                        a6.put("imei", l.a("imei2"));
                        a6.put("imei5", l.b(1));
                    }
                }
                if (a6.length() > 0) {
                    f11786w.put(a6);
                }
            } else {
                String str3 = "";
                if (telephonyManager == null) {
                    str = "";
                } else {
                    str = telephonyManager.getDeviceId();
                }
                if (c(str.trim()).booleanValue()) {
                    arrayList.add(str.trim());
                    JSONObject a7 = a(telephonyManager, str);
                    if (a7 != null) {
                        f11786w.put(a7);
                    }
                }
                try {
                    TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone1");
                    if (telephonyManager2 == null) {
                        str2 = "";
                    } else {
                        str2 = telephonyManager2.getDeviceId();
                    }
                    if (str2 != null && c(str2).booleanValue() && !arrayList.contains(str2)) {
                        arrayList.add(str2);
                        JSONObject a8 = a(telephonyManager2, str2);
                        if (a8 != null) {
                            f11786w.put(a8);
                        }
                    }
                } catch (Throwable unused6) {
                }
                try {
                    TelephonyManager telephonyManager3 = (TelephonyManager) context.getSystemService("phone2");
                    if (telephonyManager3 != null) {
                        str3 = telephonyManager3.getDeviceId();
                    }
                    if (str3 != null && c(str3).booleanValue() && !arrayList.contains(str3)) {
                        arrayList.add(str3);
                        JSONObject a9 = a(telephonyManager3, str3);
                        if (a9 != null) {
                            f11786w.put(a9);
                        }
                    }
                } catch (Throwable unused7) {
                }
                JSONArray H = H(context);
                JSONArray G = G(context);
                if (G != null) {
                    H = G;
                }
                JSONArray F = F(context);
                if (F != null) {
                    H = F;
                }
                JSONArray E = E(context);
                if (E != null) {
                    H = E;
                }
                if (H != null && H.length() > 0) {
                    for (int i5 = 0; i5 < H.length(); i5++) {
                        JSONObject jSONObject = H.getJSONObject(i5);
                        String string = jSONObject.getString("imei");
                        if (!arrayList.contains(string)) {
                            arrayList.add(string);
                            f11786w.put(jSONObject);
                        }
                    }
                }
            }
        } catch (Throwable unused8) {
        }
        f11787x = true;
    }

    private static JSONArray E(Context context) {
        int i5;
        int i6;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i5 = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i6 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i5 = 0;
                i6 = 1;
            }
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            if (telephonyManager != null && declaredMethod != null) {
                String trim = ((String) declaredMethod.invoke(telephonyManager, i5)).trim();
                String trim2 = ((String) declaredMethod.invoke(telephonyManager, i6)).trim();
                if (c(trim).booleanValue()) {
                    jSONArray.put(a(TelephonyManager.class, telephonyManager, i5, trim, "Gemini"));
                }
                if (c(trim2).booleanValue()) {
                    jSONArray.put(a(TelephonyManager.class, telephonyManager, i6, trim2, "Gemini"));
                }
                return jSONArray;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    private static JSONArray F(Context context) {
        int i5;
        int i6;
        JSONObject a5;
        JSONObject a6;
        try {
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            Class<?> cls = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = cls.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                i5 = (Integer) field.get(null);
                Field field2 = cls.getField("GEMINI_SIM_2");
                field2.setAccessible(true);
                i6 = (Integer) field2.get(null);
            } catch (Throwable unused) {
                i5 = 0;
                i6 = 1;
            }
            Method method = TelephonyManager.class.getMethod("getDefault", Integer.TYPE);
            TelephonyManager telephonyManager2 = (TelephonyManager) method.invoke(telephonyManager, i5);
            TelephonyManager telephonyManager3 = (TelephonyManager) method.invoke(telephonyManager, i6);
            String trim = telephonyManager2.getDeviceId().trim();
            String trim2 = telephonyManager3.getDeviceId().trim();
            if (c(trim).booleanValue() && (a6 = a(telephonyManager2, trim)) != null) {
                jSONArray.put(a6);
            }
            if (c(trim2).booleanValue() && (a5 = a(telephonyManager3, trim2)) != null) {
                jSONArray.put(a5);
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static JSONArray G(Context context) {
        JSONObject a5;
        JSONObject a6;
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("com.android.internal.telephony.PhoneFactory");
            String str = (String) cls.getMethod("getServiceName", String.class, Integer.TYPE).invoke(cls, HintConstants.AUTOFILL_HINT_PHONE, 1);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            String trim = telephonyManager.getDeviceId().trim();
            TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService(str);
            String trim2 = telephonyManager2.getDeviceId().trim();
            if (c(trim).booleanValue() && (a6 = a(telephonyManager, trim)) != null) {
                jSONArray.put(a6);
            }
            if (c(trim2).booleanValue() && (a5 = a(telephonyManager2, trim2)) != null) {
                jSONArray.put(a5);
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONArray H(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            Object systemService = context.getSystemService("phone_msim");
            Method method = cls.getMethod("getDeviceId", Integer.TYPE);
            String trim = ((String) method.invoke(systemService, 0)).trim();
            String trim2 = ((String) method.invoke(systemService, 1)).trim();
            if (c(trim).booleanValue()) {
                jSONArray.put(a(cls, systemService, 0, trim, ""));
            }
            if (c(trim2).booleanValue()) {
                jSONArray.put(a(cls, systemService, 1, trim2, ""));
            }
            return jSONArray;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void a(Context context) {
        try {
            f11766c = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        } catch (Throwable unused) {
        }
    }

    private static String b(int i5) {
        switch (i5) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return "3G";
            case 13:
            case 18:
                return "4G";
        }
    }

    private static void b(String[] strArr) {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.getName().toLowerCase().startsWith("wlan") && (inetAddresses = nextElement.getInetAddresses()) != null) {
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if (nextElement2 != null && !nextElement2.isLoopbackAddress()) {
                        String hostAddress = nextElement2.getHostAddress();
                        if (!TextUtils.isEmpty(hostAddress)) {
                            if (nextElement2 instanceof Inet4Address) {
                                strArr[0] = hostAddress;
                            } else if (nextElement2 instanceof Inet6Address) {
                                int indexOf = hostAddress.indexOf("%");
                                if (indexOf > 0) {
                                    hostAddress = hostAddress.substring(0, indexOf);
                                }
                                strArr[1] = hostAddress;
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean c(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            if (!y.b(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        try {
            if (i(context)) {
                return true;
            }
            return ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).isWifiEnabled();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            if (f11766c.getSimState() != 5) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean f(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean g(Context context) {
        try {
            if (y.a(17)) {
                if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 1) {
                    return false;
                }
                return true;
            }
            if (Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 1) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            int simState = f11766c.getSimState();
            if (1 == simState || simState == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            if (!y.b(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
                return false;
            }
            if (y.a(29)) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasTransport(1)) {
                    return false;
                }
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || 1 != activeNetworkInfo.getType() || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean j(Context context) {
        if (context == null && (context = ab.f11351g) == null) {
            return false;
        }
        try {
            if (f11766c == null) {
                a(context);
            }
            if (f11766c.getDataState() != 2) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String k(Context context) {
        if (!b(context)) {
            return "OFFLINE";
        }
        if (i(context)) {
            return "WIFI";
        }
        return a(n(context));
    }

    public static String l(Context context) {
        if (!b(context)) {
            return "offline";
        }
        if (i(context)) {
            return NetworkUtil.NETWORK_TYPE_WIFI;
        }
        return "cellular";
    }

    public static String m(Context context) {
        if ((context == null && (context = ab.f11351g) == null) || !b(context)) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i(context)) {
            return "WIFI";
        }
        return b(n(context));
    }

    public static int n(Context context) {
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
        if (f11766c == null) {
            a(context);
        }
        return f11766c.getNetworkType();
    }

    public static String o(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            return f11766c.getNetworkOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String p(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            return f11766c.getSimOperator();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String q(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        if (ab.Q || !ab.T.isWiFiEnable() || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)) == null || !y.b(context, "android.permission.ACCESS_WIFI_STATE") || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        return connectionInfo.getBSSID();
    }

    public static String r(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            return f11766c.getNetworkCountryIso();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String s(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            return f11766c.getNetworkOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String t(Context context) {
        try {
            if (f11766c == null) {
                a(context);
            }
            return f11766c.getSimOperatorName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void tryGetDoubleSimInfoReCheck(Context context) {
        try {
            if (f11786w.length() <= 0 && !f11787x) {
                D(context);
            }
        } catch (Throwable th) {
            h.eForInternal(th);
        }
    }

    public static JSONArray u(Context context) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", NetworkUtil.NETWORK_TYPE_WIFI);
            jSONObject.put("available", d(context));
            jSONObject.put("connected", i(context));
            jSONObject.put("current", y(context));
            jSONObject.put("scannable", z(context));
            jSONObject.put("configured", x(context));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "cellular");
            jSONObject2.put("available", e(context));
            jSONObject2.put("connected", j(context));
            jSONObject2.put("current", a(context, false));
            jSONObject2.put("scannable", v(context));
            jSONArray.put(jSONObject2);
        } catch (Throwable unused2) {
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray;
    }

    @TargetApi(18)
    public static JSONArray v(Context context) {
        List<CellInfo> allCellInfo;
        CellSignalStrength cellSignalStrength;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (!ab.T.isLocationEnabled() || ab.P) {
            return null;
        }
        if (context == null && (context = ab.f11351g) == null) {
            return null;
        }
        JSONArray jSONArray = f11777n;
        if (jSONArray != null && (jSONArray.length() > 0 || f11775l)) {
            return f11777n;
        }
        if (!y.b(context, "android.permission.ACCESS_COARSE_LOCATION") && !y.b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        }
        try {
            if (f11766c == null) {
                a(context);
            }
            JSONArray jSONArray2 = new JSONArray();
            if (y.a(17) && (allCellInfo = f11766c.getAllCellInfo()) != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("registered", cellInfo.isRegistered());
                        jSONObject.put("ts", cellInfo.getTimeStamp());
                        if (cellInfo instanceof CellInfoGsm) {
                            str = "GSM";
                            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
                            i6 = cellIdentity.getLac();
                            i7 = cellIdentity.getCid();
                            int mcc = cellIdentity.getMcc();
                            i5 = cellIdentity.getMnc();
                            i9 = mcc;
                            i8 = -1;
                            cellSignalStrength = cellInfoGsm.getCellSignalStrength();
                        } else if (cellInfo instanceof CellInfoCdma) {
                            str = "CDMA";
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
                            i6 = cellIdentity2.getSystemId();
                            i7 = cellIdentity2.getNetworkId();
                            i8 = cellIdentity2.getBasestationId();
                            CellSignalStrengthCdma cellSignalStrength2 = cellInfoCdma.getCellSignalStrength();
                            jSONObject.put("cdmaDbm", cellSignalStrength2.getCdmaDbm());
                            jSONObject.put("cdmaDbm", cellSignalStrength2.getCdmaDbm());
                            jSONObject.put("cdmaEcio", cellSignalStrength2.getCdmaEcio());
                            jSONObject.put("evdoDbm", cellSignalStrength2.getEvdoDbm());
                            jSONObject.put("evdoEcio", cellSignalStrength2.getEvdoEcio());
                            jSONObject.put("evdoSnr", cellSignalStrength2.getEvdoSnr());
                            jSONObject.put(Headers.LOCATION, a(cellIdentity2.getLatitude(), cellIdentity2.getLongitude()));
                            i5 = -1;
                            i9 = -1;
                            cellSignalStrength = cellSignalStrength2;
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            str = "WCDMA";
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                            i6 = cellIdentity3.getLac();
                            i7 = cellIdentity3.getCid();
                            i8 = cellIdentity3.getPsc();
                            i9 = cellIdentity3.getMcc();
                            i5 = cellIdentity3.getMnc();
                            cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
                        } else if (cellInfo instanceof CellInfoLte) {
                            str = "LTE";
                            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                            CellIdentityLte cellIdentity4 = cellInfoLte.getCellIdentity();
                            i6 = cellIdentity4.getTac();
                            i7 = cellIdentity4.getPci();
                            i8 = cellIdentity4.getCi();
                            i9 = cellIdentity4.getMcc();
                            i5 = cellIdentity4.getMnc();
                            cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        } else {
                            cellSignalStrength = null;
                            str = null;
                            i5 = -1;
                            i6 = -1;
                            i7 = -1;
                            i8 = -1;
                            i9 = -1;
                        }
                        if (i6 != -1) {
                            jSONObject.put("systemId", i6);
                        }
                        if (i7 != -1) {
                            jSONObject.put("networkId", i7);
                        }
                        if (i8 != -1) {
                            jSONObject.put("basestationId", i8);
                        }
                        if (i9 != -1) {
                            jSONObject.put("mcc", i9);
                        }
                        if (i5 != -1) {
                            jSONObject.put("mnc", i5);
                        }
                        if (cellSignalStrength != null) {
                            jSONObject.put("asuLevel", cellSignalStrength.getAsuLevel());
                            jSONObject.put("dbm", cellSignalStrength.getDbm());
                        }
                        jSONObject.put("type", str);
                        jSONArray2.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            }
            f11775l = true;
            JSONArray a5 = a(jSONArray2, 20);
            f11777n = a5;
            return a5;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String w(Context context) {
        WifiInfo connectionInfo;
        if (ab.Q || !ab.T.isWiFiEnable()) {
            return null;
        }
        try {
            if (!y.b(context, "android.permission.ACCESS_WIFI_STATE")) {
                return null;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
            if (!wifiManager.isWifiEnabled() || !i(context) || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return null;
            }
            return connectionInfo.getSSID();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray x(Context context) {
        List<WifiConfiguration> configuredNetworks;
        if (ab.Q || !ab.T.isWiFiEnable()) {
            return null;
        }
        JSONArray jSONArray = f11782s;
        if (jSONArray != null && (jSONArray.length() > 0 || f11779p)) {
            return f11782s;
        }
        try {
            if (y.b(context, "android.permission.ACCESS_WIFI_STATE") && (configuredNetworks = ((WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI)).getConfiguredNetworks()) != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkId", wifiConfiguration.networkId);
                        jSONObject.put(LogFactory.PRIORITY_KEY, wifiConfiguration.priority);
                        jSONObject.put("name", wifiConfiguration.SSID);
                        jSONObject.put("id", wifiConfiguration.BSSID);
                        jSONArray2.put(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
                f11779p = true;
                JSONArray b5 = b(jSONArray2, 30);
                f11782s = b5;
                return b5;
            }
        } catch (Throwable unused2) {
        }
        return null;
    }

    public static JSONArray y(Context context) {
        WifiInfo connectionInfo;
        if (ab.Q) {
            return null;
        }
        if (f11781r.length() <= 0 && !f11778o) {
            try {
                if (y.b(context, "android.permission.ACCESS_WIFI_STATE")) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
                    if (wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                        String a5 = a("bssid");
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("name", a("ssid"));
                            jSONObject.put("id", a5);
                            jSONObject.put("level", connectionInfo.getRssi());
                            jSONObject.put("hidden", connectionInfo.getHiddenSSID());
                            jSONObject.put("ip", connectionInfo.getIpAddress());
                            jSONObject.put("speed", connectionInfo.getLinkSpeed());
                            jSONObject.put("networkId", connectionInfo.getNetworkId());
                            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                            if (dhcpInfo != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("dns1", dhcpInfo.dns1);
                                jSONObject2.put("dns2", dhcpInfo.dns2);
                                jSONObject2.put("gw", dhcpInfo.gateway);
                                jSONObject2.put("ip", dhcpInfo.ipAddress);
                                jSONObject2.put("mask", dhcpInfo.netmask);
                                jSONObject2.put("server", dhcpInfo.serverAddress);
                                jSONObject2.put("leaseDuration", dhcpInfo.leaseDuration);
                                jSONObject.put("dhcp", jSONObject2);
                            }
                        } catch (Throwable unused) {
                        }
                        f11778o = true;
                        f11781r.put(jSONObject);
                        return f11781r;
                    }
                }
            } catch (Throwable unused2) {
            }
            return null;
        }
        return f11781r;
    }

    public static synchronized JSONArray z(Context context) {
        synchronized (o.class) {
            if (!y.f11829c) {
                return null;
            }
            if (ab.Q) {
                return null;
            }
            if (!ab.T.isWiFiEnable()) {
                return null;
            }
            JSONArray jSONArray = f11783t;
            if (jSONArray != null && (jSONArray.length() > 0 || f11780q)) {
                return f11783t;
            }
            try {
                if (y.b(context, "android.permission.ACCESS_WIFI_STATE")) {
                    WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(NetworkUtil.NETWORK_TYPE_WIFI);
                    if (wifiManager.isWifiEnabled() || wifiManager.isScanAlwaysAvailable()) {
                        if (y.b(context, "android.permission.CHANGE_WIFI_STATE") && !f11784u) {
                            try {
                                context.registerReceiver(f11785v, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                            } catch (Throwable unused) {
                            }
                            f11784u = true;
                        }
                        wifiManager.startScan();
                        f11785v.await();
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        f11785v.reset();
                        if (scanResults != null) {
                            ArrayList arrayList = new ArrayList();
                            for (ScanResult scanResult : scanResults) {
                                if (scanResult.level >= -85) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("id", scanResult.BSSID);
                                        jSONObject.put("name", scanResult.SSID);
                                        jSONObject.put("level", scanResult.level);
                                        jSONObject.put("freq", scanResult.frequency);
                                        if (y.a(17)) {
                                            jSONObject.put("ts", scanResult.timestamp);
                                            jSONObject.put("scanTs", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + (scanResult.timestamp / 1000));
                                        }
                                        arrayList.add(jSONObject);
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            f11780q = true;
                            JSONArray a5 = a(arrayList, 20);
                            f11783t = a5;
                            return a5;
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
            return null;
        }
    }

    public static String a(String str) {
        return f11767d.get(str);
    }

    public static String[] a() {
        String[] strArr = {null, null, null, null};
        if (ab.R) {
            return strArr;
        }
        boolean i5 = i(ab.f11351g);
        boolean j5 = j(ab.f11351g);
        if (!i5 && !j5) {
            h.iForInternal("no-network");
            return strArr;
        }
        if (!i5) {
            if (j5) {
                a(strArr);
            }
            return strArr;
        }
        b(strArr);
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, java.lang.Object> d() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "ip n"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L66
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L64
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L64
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L61
            r3.<init>()     // Catch: java.lang.Throwable -> L61
        L1e:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L57
            java.lang.String r4 = "lladdr"
            int r4 = r0.indexOf(r4)     // Catch: java.lang.Throwable -> L62
            r5 = -1
            if (r4 <= r5) goto L1e
            java.lang.String r4 = " "
            java.lang.String[] r0 = r0.split(r4)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L1e
            int r4 = r0.length     // Catch: java.lang.Throwable -> L62
            r5 = 5
            if (r4 <= r5) goto L1e
            r4 = 0
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = c(r0)     // Catch: java.lang.Throwable -> L62
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L1e
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L4d
            goto L1e
        L4d:
            boolean r5 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L1e
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L62
            goto L1e
        L57:
            r1.waitFor()     // Catch: java.lang.Throwable -> L62
            r2.close()     // Catch: java.lang.Throwable -> L5d
        L5d:
            r1.destroy()
            goto L70
        L61:
            r3 = r0
        L62:
            r0 = r2
            goto L68
        L64:
            r3 = r0
            goto L68
        L66:
            r1 = r0
            r3 = r1
        L68:
            if (r0 == 0) goto L6d
            r0.close()     // Catch: java.lang.Throwable -> L6d
        L6d:
            if (r1 == 0) goto L70
            goto L5d
        L70:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.o.d():java.util.Map");
    }

    private static String c(int i5) {
        if (i5 >= 0) {
            String[] strArr = f11769f;
            if (i5 < strArr.length) {
                return strArr[i5];
            }
        }
        return String.valueOf(i5);
    }

    private static Boolean c(String str) {
        try {
            Integer valueOf = Integer.valueOf(str.length());
            if (valueOf.intValue() > 10 && valueOf.intValue() < 20 && !b(str.trim()).booleanValue()) {
                return Boolean.TRUE;
            }
        } catch (Throwable unused) {
        }
        return Boolean.FALSE;
    }

    private static void a(String[] strArr) {
        Enumeration<InetAddress> inetAddresses;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (!nextElement.isLoopback()) {
                String lowerCase = nextElement.getName().toLowerCase();
                if (!lowerCase.startsWith("wlan") && !lowerCase.startsWith("eth") && !lowerCase.startsWith("dummy") && (inetAddresses = nextElement.getInetAddresses()) != null && inetAddresses.hasMoreElements()) {
                    arrayList.add(Collections.list(inetAddresses));
                }
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        Collections.sort(arrayList, new Comparator<List<InetAddress>>() { // from class: com.tendcloud.tenddata.o.1
            @Override // java.util.Comparator
            public int compare(List<InetAddress> list, List<InetAddress> list2) {
                return list.size() - list2.size();
            }
        });
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            for (InetAddress inetAddress : (List) arrayList.get(size)) {
                if (!inetAddress.isLinkLocalAddress() && !inetAddress.isLoopbackAddress()) {
                    if (inetAddress instanceof Inet4Address) {
                        strArr[2] = inetAddress.getHostAddress();
                    } else if (inetAddress instanceof Inet6Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (!hostAddress.contains("ff:fe")) {
                            strArr[3] = hostAddress;
                        }
                    }
                }
            }
            if (strArr[2] != null || strArr[3] != null) {
                return;
            }
        }
    }

    private static Map<String, Object> c() {
        try {
            if (y.a(29)) {
                return d();
            }
            HashMap hashMap = new HashMap();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/net/arp")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split("[ ]+");
                    if (!split[0].matches("IP")) {
                        String str = split[0];
                        String str2 = split[3];
                        if (!hashMap.containsKey(str) && !str2.equals(a1.c.f92a)) {
                            hashMap.put(str, str2);
                        }
                    }
                } else {
                    bufferedReader.close();
                    return hashMap;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r7 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r7) {
        /*
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = com.tendcloud.tenddata.y.b(r7, r0)     // Catch: java.lang.Throwable -> L97
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L52
            java.lang.String r0 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r0)     // Catch: java.lang.Throwable -> L97
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L52
            r0 = 29
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L33
            android.net.Network r0 = r7.getActiveNetwork()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L52
            android.net.NetworkCapabilities r7 = r7.getNetworkCapabilities(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L31
            r0 = 12
            boolean r7 = r7.hasCapability(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            return r1
        L33:
            android.net.NetworkInfo r0 = r7.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L3e
            boolean r7 = r0.isConnected()     // Catch: java.lang.Throwable -> L97
            return r7
        L3e:
            android.net.NetworkInfo r7 = r7.getNetworkInfo(r2)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L51
            android.net.NetworkInfo$State r7 = r7.getState()     // Catch: java.lang.Throwable -> L97
            android.net.NetworkInfo$State r0 = android.net.NetworkInfo.State.UNKNOWN     // Catch: java.lang.Throwable -> L97
            boolean r7 = r7.equals(r0)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L51
            goto L52
        L51:
            return r2
        L52:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L97
            long r5 = com.tendcloud.tenddata.o.f11773j     // Catch: java.lang.Throwable -> L97
            long r3 = r3 - r5
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L97
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L97
            com.tendcloud.tenddata.o.f11773j = r3     // Catch: java.lang.Throwable -> L97
            r7 = 0
            boolean r0 = b()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L7b
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = android.net.Proxy.getDefaultHost()     // Catch: java.lang.Throwable -> L8b
            int r4 = android.net.Proxy.getDefaultPort()     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8b
            goto L84
        L7b:
            java.net.Socket r0 = new java.net.Socket     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "www.talkingdata.net"
            r4 = 80
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L8b
        L84:
            r7 = r0
            com.tendcloud.tenddata.o.f11771h = r1     // Catch: java.lang.Throwable -> L8b
        L87:
            r7.close()     // Catch: java.lang.Throwable -> L97
            goto L97
        L8b:
            com.tendcloud.tenddata.o.f11771h = r2     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L97
            goto L87
        L90:
            r0 = move-exception
            if (r7 == 0) goto L96
            r7.close()     // Catch: java.lang.Throwable -> L96
        L96:
            throw r0     // Catch: java.lang.Throwable -> L97
        L97:
            boolean r7 = com.tendcloud.tenddata.o.f11771h
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.o.b(android.content.Context):boolean");
    }

    private static String c(String[] strArr) {
        if (strArr != null && strArr.length >= 6) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= strArr.length) {
                    break;
                }
                if ("lladdr".equalsIgnoreCase(strArr[i6])) {
                    i5 = i6 + 1;
                    break;
                }
                i6++;
            }
            if (i5 > 0 && i5 < strArr.length) {
                String str = strArr[i5];
                if (str.matches("([\\da-fA-F]{2}:){5}([\\da-fA-F]{2}){1}") && !str.equals(a1.c.f92a)) {
                    return str;
                }
            }
        }
        return null;
    }

    private static String a(int i5) {
        if (i5 >= 0) {
            String[] strArr = f11768e;
            if (i5 < strArr.length) {
                return strArr[i5];
            }
        }
        return String.valueOf(i5);
    }

    public static JSONArray a(Context context, boolean z4) {
        CdmaCellLocation cdmaCellLocation;
        if (context == null) {
            try {
                context = ab.f11351g;
                if (context == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        if (f11776m.length() <= 0 && !f11774k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", n(context));
            jSONObject.put("mcc", o(context));
            jSONObject.put("operator", s(context));
            jSONObject.put(com.umeng.analytics.pro.bi.O, r(context));
            boolean isLocationEnabled = ab.T.isLocationEnabled();
            if (isLocationEnabled && !y.b(context, "android.permission.ACCESS_COARSE_LOCATION") && !y.b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                isLocationEnabled = false;
            }
            if (isLocationEnabled) {
                if (f11766c == null) {
                    a(context);
                }
                if ((y.f11829c || z4) && !ab.P) {
                    CellLocation cellLocation = f11766c.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        if (gsmCellLocation != null) {
                            jSONObject.put("systemId", gsmCellLocation.getLac());
                            jSONObject.put("networkId", gsmCellLocation.getCid());
                            if (y.a(9)) {
                                jSONObject.put("basestationId", gsmCellLocation.getPsc());
                            }
                        }
                    } else if ((cellLocation instanceof CdmaCellLocation) && (cdmaCellLocation = (CdmaCellLocation) cellLocation) != null) {
                        jSONObject.put("systemId", cdmaCellLocation.getSystemId());
                        jSONObject.put("networkId", cdmaCellLocation.getNetworkId());
                        jSONObject.put("basestationId", cdmaCellLocation.getBaseStationId());
                        jSONObject.put(Headers.LOCATION, a(cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude()));
                    }
                }
            }
            f11774k = true;
            f11776m.put(jSONObject);
            return f11776m;
        }
        return f11776m;
    }

    public static boolean b() {
        try {
            if (y.a(11)) {
                return !TextUtils.isEmpty(System.getProperty("http.proxyHost"));
            }
            return !TextUtils.isEmpty(Proxy.getDefaultHost());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONArray b(JSONArray jSONArray, int i5) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                arrayList.add(jSONArray.optJSONObject(i6));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.3
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject.getInt("networkId") - jSONObject2.getInt("networkId");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i5) {
                i5 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Boolean b(String str) {
        try {
            char charAt = str.length() > 0 ? str.charAt(0) : '0';
            Boolean bool = Boolean.TRUE;
            for (int i5 = 0; i5 < str.length(); i5++) {
                if (charAt != str.charAt(i5)) {
                    return Boolean.FALSE;
                }
            }
            return bool;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    public static JSONArray a(JSONArray jSONArray, int i5) {
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                arrayList.add(jSONArray.optJSONObject(i6));
            }
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.2
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("asuLevel") - jSONObject.getInt("asuLevel");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i5) {
                i5 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(int i5, int i6) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.umeng.analytics.pro.d.C, i5);
            jSONObject.put(com.umeng.analytics.pro.d.D, i6);
            jSONObject.put("unit", "qd");
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static JSONArray a(ArrayList arrayList, int i5) {
        try {
            Collections.sort(arrayList, new Comparator<JSONObject>() { // from class: com.tendcloud.tenddata.o.4
                @Override // java.util.Comparator
                public int compare(JSONObject jSONObject, JSONObject jSONObject2) {
                    try {
                        return jSONObject2.getInt("level") - jSONObject.getInt("level");
                    } catch (Throwable unused) {
                        return 0;
                    }
                }
            });
            if (arrayList.size() <= i5) {
                i5 = arrayList.size();
            }
            return new JSONArray((Collection) arrayList.subList(0, i5));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONArray a(BitSet bitSet) {
        if (bitSet == null || bitSet.cardinality() < 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i5 = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i5);
            if (nextSetBit < 0) {
                return jSONArray;
            }
            jSONArray.put(nextSetBit);
            i5 = nextSetBit + 1;
        }
    }

    private static JSONObject a(TelephonyManager telephonyManager, String str) {
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imei", str.trim());
            jSONObject.put("imei5", y.c(str.trim()));
            jSONObject.put("dataState", telephonyManager.getDataState());
            jSONObject.put("networkType", a(telephonyManager.getNetworkType()));
            jSONObject.put("networkOperator", telephonyManager.getNetworkOperator());
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, c(telephonyManager.getPhoneType()));
            String str2 = "";
            jSONObject.put("simOperator", telephonyManager.getSimOperator() == null ? "" : telephonyManager.getSimOperator());
            jSONObject.put("simOperatorName", telephonyManager.getSimOperatorName() == null ? "" : telephonyManager.getSimOperatorName());
            if (telephonyManager.getSimCountryIso() != null) {
                str2 = telephonyManager.getSimCountryIso();
            }
            jSONObject.put("simCountryIso", str2);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject a(Context context, SubscriptionManager subscriptionManager, int i5) {
        SubscriptionInfo activeSubscriptionInfoForSimSlotIndex;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        if (!ab.T.isIMEIAndMEIDEnabled()) {
            return jSONObject;
        }
        try {
            if (y.a(22) && (activeSubscriptionInfoForSimSlotIndex = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(i5)) != null) {
                jSONObject.put("simSerialNumber", "");
                jSONObject.put("simOperator", activeSubscriptionInfoForSimSlotIndex.getMcc() + "0" + activeSubscriptionInfoForSimSlotIndex.getMnc());
                jSONObject.put("simOperatorName", activeSubscriptionInfoForSimSlotIndex.getCarrierName() == null ? "" : activeSubscriptionInfoForSimSlotIndex.getCarrierName());
                if (activeSubscriptionInfoForSimSlotIndex.getCountryIso() != null) {
                    str = activeSubscriptionInfoForSimSlotIndex.getCountryIso();
                }
                jSONObject.put("simCountryIso", str);
                jSONObject.put("subscriberId", l.a("imsi"));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(Class<?> cls, Object obj, Integer num, String str, String str2) {
        String str3 = "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imei", str);
        jSONObject.put("imei5", y.c(str));
        try {
            jSONObject.put("dataState", (Integer) cls.getMethod("getDataState" + str2, Integer.TYPE).invoke(obj, num));
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("networkType", a(((Integer) cls.getMethod("getNetworkType" + str2, Integer.TYPE).invoke(obj, num)).intValue()));
        } catch (Throwable unused2) {
        }
        try {
            jSONObject.put("networkOperator", (String) cls.getMethod("getNetworkOperator" + str2, Integer.TYPE).invoke(obj, num));
        } catch (Throwable unused3) {
        }
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, c(((Integer) cls.getMethod("getPhoneType" + str2, Integer.TYPE).invoke(obj, num)).intValue()));
        } catch (Throwable unused4) {
        }
        try {
            Method method = cls.getMethod("getSimOperator" + str2, Integer.TYPE);
            jSONObject.put("simOperator", method.invoke(obj, num) == null ? "" : ((String) method.invoke(obj, num)).trim());
        } catch (Throwable unused5) {
        }
        try {
            Method method2 = cls.getMethod("getSimOperatorName" + str2, Integer.TYPE);
            if (method2.invoke(obj, num) != null) {
                str3 = ((String) method2.invoke(obj, num)).trim();
            }
            jSONObject.put("simOperatorName", str3);
        } catch (Throwable unused6) {
        }
        return jSONObject;
    }
}

package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class ab {
    public static final String A = "TD_sdk_last_send_time_wifi";
    public static final String B = "TD_sdk_last_send_time_mobile_data";
    public static final String C = "TD_sdk_last_send_url";
    public static final String D = "TD_sdk_last_send_host";
    public static final String E = "isDeveloper";
    public static final int K = 104857600;
    static final String M = "All";
    public static final String O = "v1.0.0";
    public static final String U = "Android+TD+V5.0.28 gp";
    static long V = 0;
    public static final int Y = 1800000;

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f11345a = false;
    public static final long aa = 30000;
    public static final int ab = 100;
    public static final String ac = "TD_APP_ID";
    public static final String ad = "TD_CHANNEL_ID";
    private static final String af = "+V";
    private static final int ag = 120;
    private static final int ah = 30;
    private static final int ai = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11346b = false;

    /* renamed from: i, reason: collision with root package name */
    public static final int f11353i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final String f11354j = "Android+";

    /* renamed from: k, reason: collision with root package name */
    public static FileChannel f11355k = null;

    /* renamed from: r, reason: collision with root package name */
    public static String f11362r = null;

    /* renamed from: s, reason: collision with root package name */
    public static final String f11363s = "TD";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11364t = "TDLog";

    /* renamed from: v, reason: collision with root package name */
    public static final String f11366v = "2596";

    /* renamed from: w, reason: collision with root package name */
    public static final String f11367w = "TD_app_pefercen_profile";

    /* renamed from: x, reason: collision with root package name */
    public static final String f11368x = "TD_appId_";

    /* renamed from: y, reason: collision with root package name */
    public static final String f11369y = "TD_channelId";

    /* renamed from: z, reason: collision with root package name */
    public static final String f11370z = "TD_init_custom";

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f11347c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final Map<String, Object> f11348d = new TreeMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f11349e = false;

    /* renamed from: f, reason: collision with root package name */
    public static long f11350f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static Context f11351g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Handler f11352h = null;

    /* renamed from: l, reason: collision with root package name */
    public static long f11356l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11357m = false;

    /* renamed from: n, reason: collision with root package name */
    public static int f11358n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f11359o = true;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f11360p = true;

    /* renamed from: q, reason: collision with root package name */
    public static long f11361q = 5000;

    /* renamed from: u, reason: collision with root package name */
    public static TalkingDataSharingFilter f11365u = TalkingDataSharingFilter.SHARE;
    private static HashMap<String, Object> ae = new HashMap<>();
    public static String F = "Default";
    public static String G = "";
    public static boolean H = false;
    public static String I = null;
    public static boolean J = false;
    static final String L = "WiFi";
    static String N = L;
    public static boolean P = false;
    public static boolean Q = false;
    public static boolean R = false;
    public static boolean S = false;
    public static TalkingDataSDKConfig T = new TalkingDataSDKConfig();
    public static int W = 2;
    public static AtomicInteger X = new AtomicInteger(0);
    public static final AtomicBoolean Z = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public class a {
        public static final int DST_FILE = 2;
        public static final int DST_SQLITE = 1;

        public a() {
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        public static final int API_MYNA_INIT = 90;
        public static final int API_MYNA_START = 91;
        public static final int API_MYNA_STOP = 92;
        public static final int API_ON_ERROR = 3;
        public static final int API_ON_EVENT = 2;
        public static final int API_ON_INIT = 1;
        public static final int API_ON_PAGE_END = 5;
        public static final int API_ON_PAGE_START = 4;
        public static final int API_TYPE_ACCOUNT = 9;
        public static final int API_TYPE_BRAND_GROWTH = 16;
        public static final int API_TYPE_CUST_LOCATION = 14;
        public static final int API_TYPE_GAME = 6;
        public static final int API_TYPE_GAME_SESSION_END = 15;
        public static final int API_TYPE_GAME_SESSION_START = 12;
        public static final int API_TYPE_IAP = 8;
        public static final int API_TYPE_INDUSTRY = 17;
        public static final int API_TYPE_SESSION_END = 11;
        public static final int API_TYPE_SESSION_PAUSE = 13;
        public static final int API_TYPE_SESSION_START = 10;
        public static final int API_TYPE_TRACKING = 7;
    }

    /* loaded from: classes3.dex */
    public class c {
        public static final int SDT_JSON = 2;
        public static final int SDT_MP = 1;
        public static final int SDT_PB = 3;
        public static final int SDT_UNKNOWN = -1;

        public c() {
        }
    }

    public static String a(Context context, com.tendcloud.tenddata.a aVar) {
        if (context != null && aVar != null) {
            String str = (String) ae.get(aVar.name());
            if (!y.b(str)) {
                return str;
            }
            return s.b(context, f11367w, f11368x + aVar.name(), "");
        }
        h.dForInternal("Context or Service is null");
        return "";
    }

    public static String b(Context context, com.tendcloud.tenddata.a aVar) {
        if (y.b(F) || F.equals("Default")) {
            F = s.b(context, f11367w, f11369y + aVar.name(), "Default");
        }
        return F;
    }

    public static String c(Context context, com.tendcloud.tenddata.a aVar) {
        try {
            if (y.b(G)) {
                G = s.b(context, f11367w, f11370z + aVar.name(), "");
            }
        } catch (Throwable unused) {
        }
        return G;
    }

    private static boolean d(com.tendcloud.tenddata.a aVar) {
        if (f11351g == null || !aVar.name().equals(GrsBaseInfo.CountryCodeSource.APP)) {
            return false;
        }
        File filesDir = f11351g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, aa.f11341r);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (!file.exists() && !file2.exists() && !file4.exists()) {
                if (!file5.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean e(com.tendcloud.tenddata.a aVar) {
        if (f11351g == null || !aVar.name().equals("GAME")) {
            return false;
        }
        File filesDir = f11351g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database0SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, aa.f11341r);
            File file4 = new File(file3, "td_database0SaaS");
            File file5 = new File(file3, "td_database1SaaS");
            if (!file2.exists() && !file.exists() && !file5.exists()) {
                if (!file4.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void setCofig(TalkingDataSDKConfig talkingDataSDKConfig) {
        if (talkingDataSDKConfig != null) {
            T = talkingDataSDKConfig;
        }
    }

    public static void setConfigurationDisable(int i5) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if ((i5 & 1) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        try {
            P = z4;
            if ((i5 & 2) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            Q = z5;
            if ((i5 & 4) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            R = z6;
            if ((i5 & 8) != 0) {
                z7 = true;
            }
            S = z7;
        } catch (Throwable unused) {
        }
    }

    public static void setDeveloperMode(boolean z4) {
        try {
            s.a(f11351g, f11367w, E, z4 ? 1L : 0L);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, com.tendcloud.tenddata.a aVar) {
        s.a(f11351g, f11367w, f11369y + aVar.name(), str);
    }

    public static void c(String str, com.tendcloud.tenddata.a aVar) {
        try {
            s.a(f11351g, f11367w, f11370z + aVar.name(), str);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, com.tendcloud.tenddata.a aVar) {
        if (aVar != null) {
            ae.put(aVar.name(), str);
            s.a(f11351g, f11367w, f11368x + aVar.name(), str);
        }
    }

    public static boolean b() {
        try {
            return s.b(f11351g, f11367w, E, 0L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        try {
            return new cz().a();
        } catch (Throwable unused) {
            return "Native";
        }
    }

    private static boolean b(com.tendcloud.tenddata.a aVar) {
        if (f11351g == null || !aVar.name().equals("SDK")) {
            return false;
        }
        File filesDir = f11351g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database0SaaS");
            File file2 = new File(filesDir, "td_database1SaaS");
            File file3 = new File(filesDir, "td_database3SaaS");
            File file4 = new File(filesDir, aa.f11341r);
            File file5 = new File(file4, "td_database0SaaS");
            File file6 = new File(file4, "td_database1SaaS");
            File file7 = new File(file4, "td_database3SaaS");
            if ((!file3.exists() && !file7.exists()) || file2.exists() || file6.exists() || file.exists()) {
                return false;
            }
            return !file5.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c(com.tendcloud.tenddata.a aVar) {
        if (f11351g == null || !aVar.name().equals("TRACKING")) {
            return false;
        }
        File filesDir = f11351g.getFilesDir();
        try {
            File file = new File(filesDir, "td_database3SaaS");
            File file2 = new File(filesDir, "td_database0SaaS");
            File file3 = new File(filesDir, aa.f11341r);
            File file4 = new File(file3, "td_database3SaaS");
            File file5 = new File(file3, "td_database0SaaS");
            if (!file.exists() && !file2.exists() && !file4.exists()) {
                if (!file5.exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int[] a() {
        return new int[]{120000, 30000};
    }

    public static void a(String str, String str2, com.tendcloud.tenddata.a aVar) {
        if (f11351g != null) {
            f11352h = new Handler(f11351g.getMainLooper());
        }
        f11350f = System.currentTimeMillis();
        if (str != null && !str.trim().isEmpty() && str.contains("-")) {
            try {
                str = str.split("-")[1];
            } catch (Throwable unused) {
                str = null;
            }
        }
        if (str2 != null && !str2.trim().isEmpty()) {
            F = str2;
        }
        a(str, aVar);
        b(F, aVar);
        cw.a().a((Object) str, aVar);
        cw.a().b(F, aVar);
        a(dz.f11702a);
    }

    private static boolean d(Context context, com.tendcloud.tenddata.a aVar) {
        try {
            if (f11351g == null) {
                return true;
            }
            if ((!aVar.name().equals("TRACKING") && !aVar.name().equals("SDK")) || !context.getSharedPreferences("talkingdata_file_prefence", 0).getBoolean("actived", false)) {
                return true;
            }
            i.a(false, aVar);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void a(int i5) {
        try {
            cz czVar = new cz();
            switch (i5) {
                case 1:
                    czVar.setFrameWork("Cocos2d");
                    break;
                case 2:
                    czVar.setFrameWork("Unity");
                    break;
                case 3:
                    czVar.setFrameWork("AIR");
                    break;
                case 4:
                    czVar.setFrameWork("PhoneGap");
                    break;
                case 5:
                    czVar.setFrameWork("APICloud");
                    break;
                case 6:
                    czVar.setFrameWork("Hybrid");
                    break;
                case 7:
                    czVar.setFrameWork("ReactNative");
                    break;
                case 8:
                    czVar.setFrameWork("Flutter");
                    break;
                default:
                    czVar.setFrameWork("Native");
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(com.tendcloud.tenddata.a aVar) {
        Context context;
        try {
            context = f11351g;
        } catch (Throwable unused) {
        }
        if (context == null || aVar == null) {
            return false;
        }
        if (a(context)) {
            return i.e(aVar) == 1;
        }
        if (i.e(aVar) == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - i.d(aVar) > f11361q * 4) {
                i.a(false, aVar);
            } else {
                if (currentTimeMillis - i.e() <= f11361q * 4) {
                    return d(f11351g, aVar);
                }
                if (c(aVar) || e(aVar) || d(aVar) || b(aVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(Context context) {
        try {
            return g.a().d(context) == g.a().e(context);
        } catch (Throwable unused) {
            return false;
        }
    }
}

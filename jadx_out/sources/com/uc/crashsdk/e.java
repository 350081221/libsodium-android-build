package com.uc.crashsdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Debug;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.uc.crashsdk.a.h;
import com.uc.crashsdk.export.LogType;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f11984a = true;

    /* renamed from: b, reason: collision with root package name */
    private static long f11985b;

    /* renamed from: i, reason: collision with root package name */
    private static String f11991i;

    /* renamed from: e, reason: collision with root package name */
    private final List<FileInputStream> f12009e = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f11986c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static boolean f11987d = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f11988f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static long f11989g = -1;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f11990h = true;

    /* renamed from: j, reason: collision with root package name */
    private static String f11992j = "";

    /* renamed from: k, reason: collision with root package name */
    private static String f11993k = null;

    /* renamed from: l, reason: collision with root package name */
    private static String f11994l = null;

    /* renamed from: m, reason: collision with root package name */
    private static String f11995m = null;

    /* renamed from: n, reason: collision with root package name */
    private static final Object f11996n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static final ConditionVariable f11997o = new ConditionVariable();

    /* renamed from: p, reason: collision with root package name */
    private static final Object f11998p = new Object();

    /* renamed from: q, reason: collision with root package name */
    private static final Object f11999q = new Object();

    /* renamed from: r, reason: collision with root package name */
    private static final Object f12000r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private static final ArrayList<String> f12001s = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private static int f12002t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static String f12003u = null;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f12004v = false;

    /* renamed from: w, reason: collision with root package name */
    private static String f12005w = null;

    /* renamed from: x, reason: collision with root package name */
    private static String f12006x = null;

    /* renamed from: y, reason: collision with root package name */
    private static final Object f12007y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private static final Object f12008z = new Object();
    private static Map<String, Integer> A = null;
    private static String B = null;
    private static int C = -1;
    private static int D = -1;
    private static int E = -1;
    private static int F = -1;
    private static int G = -1;
    private static int H = -1;
    private static int I = -1;
    private static String J = "?";
    private static boolean K = false;
    private static boolean L = false;
    private static int M = 0;
    private static int N = 0;
    private static boolean O = false;
    private static com.uc.crashsdk.a.e P = new com.uc.crashsdk.a.e(405);
    private static c Q = new c(0);
    private static boolean R = false;
    private static final com.uc.crashsdk.a.e S = new com.uc.crashsdk.a.e(412);
    private static Thread.UncaughtExceptionHandler T = null;
    private static Throwable U = null;
    private static boolean V = false;
    private static boolean W = false;
    private static Runnable X = null;
    private static final Object Y = new Object();
    private static int Z = 101;
    private static Runnable aa = new com.uc.crashsdk.a.e(407);
    private static final Object ab = new Object();
    private static volatile boolean ac = false;
    private static Object ad = new Object();
    private static ParcelFileDescriptor ae = null;
    private static boolean af = false;
    private static boolean ag = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements Comparator<File> {
        private b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            File file3 = file;
            File file4 = file2;
            if (file3.lastModified() > file4.lastModified()) {
                return 1;
            }
            return file3.lastModified() < file4.lastModified() ? -1 : 0;
        }

        /* synthetic */ b(byte b5) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                int unused = e.C = intent.getIntExtra("level", -1);
                int unused2 = e.D = intent.getIntExtra("scale", -1);
                int unused3 = e.E = intent.getIntExtra("voltage", -1);
                int unused4 = e.F = intent.getIntExtra("health", -1);
                int unused5 = e.G = intent.getIntExtra("plugged", -1);
                int unused6 = e.H = intent.getIntExtra("status", -1);
                int unused7 = e.I = intent.getIntExtra("temperature", -1);
                String unused8 = e.J = intent.getStringExtra("technology");
                if (e.J() >= 2) {
                    e.K();
                    e.L();
                    return;
                }
                return;
            }
            if ("android.intent.action.BATTERY_LOW".equals(action) || "android.intent.action.BATTERY_OKAY".equals(action)) {
                boolean unused9 = e.K = "android.intent.action.BATTERY_LOW".equals(action);
                e.K();
            } else if ("android.intent.action.ANR".equals(action)) {
                try {
                    e.d(context);
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                }
            }
        }

        /* synthetic */ c(byte b5) {
            this();
        }
    }

    public e() {
        try {
            M();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void A() {
        if (!g.q()) {
            return;
        }
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(403), 10000L);
    }

    public static void B() {
        if (ac || com.uc.crashsdk.b.L()) {
            return;
        }
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(408), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(409), 7000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003b, code lost:
    
        if ((java.lang.System.currentTimeMillis() % 3) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        if (r0 == 1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D() {
        /*
            int r0 = com.uc.crashsdk.g.N()
            r1 = 4
            r2 = 3
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L13
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lf
            goto L13
        Lf:
            if (r0 != r4) goto L3f
        L11:
            r4 = r3
            goto L3f
        L13:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 25
            if (r5 > r6) goto L3f
            if (r0 != 0) goto L1d
            r5 = r3
            goto L1e
        L1d:
            r5 = r4
        L1e:
            r6 = 0
            if (r0 != r2) goto L30
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 10
            long r8 = r8 % r10
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 != 0) goto L2f
            r5 = r4
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r0 != r1) goto L3e
            long r0 = java.lang.System.currentTimeMillis()
            r8 = 3
            long r0 = r0 % r8
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L3f
        L3e:
            r4 = r5
        L3f:
            if (r4 != 0) goto L48
            java.lang.String r0 = "crashsdk"
            java.lang.String r1 = "SIG 3 is disabled by settings"
            com.uc.crashsdk.a.a.a(r0, r1)
        L48:
            boolean r0 = com.uc.crashsdk.b.L()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r1 == r2) goto L64
            if (r4 == 0) goto L64
            com.uc.crashsdk.a.e r1 = new com.uc.crashsdk.a.e
            r2 = 413(0x19d, float:5.79E-43)
            r1.<init>(r2)
            r2 = 2
            com.uc.crashsdk.a.f.a(r2, r1)
            goto L65
        L64:
            r3 = r4
        L65:
            r1 = 7
            long r4 = (long) r0
            r0 = 0
            com.uc.crashsdk.JNIBridge.nativeCmd(r1, r4, r0, r0)
            if (r3 == 0) goto L72
            r0 = 8
            com.uc.crashsdk.JNIBridge.cmd(r0)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.D():void");
    }

    public static ParcelFileDescriptor E() {
        if (!com.uc.crashsdk.b.f11952d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return null;
        }
        synchronized (ad) {
            ParcelFileDescriptor parcelFileDescriptor = ae;
            if (parcelFileDescriptor != null) {
                return parcelFileDescriptor;
            }
            int cmd = (int) JNIBridge.cmd(14);
            if (cmd == -1) {
                return null;
            }
            ParcelFileDescriptor adoptFd = ParcelFileDescriptor.adoptFd(cmd);
            ae = adoptFd;
            af = true;
            return adoptFd;
        }
    }

    public static boolean F() {
        return ag;
    }

    public static void G() {
        String X2 = g.X();
        File file = new File(X2);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                com.uc.crashsdk.a.a.b("Ucebu can not list folder: " + X2);
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().contains("ucebu")) {
                    a(false, false);
                    return;
                }
            }
        }
    }

    static /* synthetic */ boolean I() {
        return O();
    }

    static /* synthetic */ int J() {
        int i5 = M + 1;
        M = i5;
        return i5;
    }

    static /* synthetic */ void K() {
        StringBuilder Y2;
        if (com.uc.crashsdk.b.f11952d && (Y2 = Y()) != null) {
            JNIBridge.set(125, Y2.toString());
        }
        L = true;
        Z();
    }

    static /* synthetic */ int L() {
        M = 0;
        return 0;
    }

    private void M() {
        int I2 = g.I();
        for (int i5 = 0; i5 < I2; i5++) {
            try {
                this.f12009e.add(new FileInputStream("/dev/null"));
            } catch (Exception e5) {
                com.uc.crashsdk.a.g.a(e5);
                return;
            }
        }
    }

    private void N() {
        Iterator<FileInputStream> it = this.f12009e.iterator();
        while (it.hasNext()) {
            com.uc.crashsdk.a.g.a(it.next());
        }
        this.f12009e.clear();
    }

    private static boolean O() {
        if (g.P()) {
            return true;
        }
        return a();
    }

    private static String P() {
        return g.e() + "_";
    }

    private static String Q() {
        return com.uc.crashsdk.b.B() ? "fg" : "bg";
    }

    private static byte[] R() {
        byte[] bArr = null;
        int i5 = 1024;
        while (bArr == null && i5 > 0) {
            try {
                bArr = new byte[i5];
            } catch (Throwable unused) {
                i5 /= 2;
                if (i5 < 16) {
                    break;
                }
            }
        }
        return bArr;
    }

    private static String S() {
        return (!com.uc.crashsdk.b.F() || f11987d) ? LogType.JAVA_TYPE : "ucebujava";
    }

    private static void T() {
        String str;
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        String str2 = "-";
        try {
            str = Build.HARDWARE;
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            str = "-";
        }
        try {
            fileReader = new FileReader(new File("/proc/cpuinfo"));
            try {
                bufferedReader = new BufferedReader(fileReader, 512);
                int i5 = 0;
                do {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.startsWith("Hardware")) {
                            str = readLine.substring(readLine.indexOf(":") + 1).trim();
                        } else if (readLine.startsWith("Processor")) {
                            str2 = readLine.substring(readLine.indexOf(":") + 1).trim();
                        }
                        i5++;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            com.uc.crashsdk.a.g.a(th);
                            com.uc.crashsdk.a.g.a(fileReader);
                            com.uc.crashsdk.a.g.a(bufferedReader);
                            f11993k = str;
                            f11994l = str2;
                        } catch (Throwable th4) {
                            com.uc.crashsdk.a.g.a(fileReader);
                            com.uc.crashsdk.a.g.a(bufferedReader);
                            throw th4;
                        }
                    }
                } while (i5 < 2);
                com.uc.crashsdk.a.g.a(fileReader);
            } catch (Throwable th5) {
                bufferedReader = null;
                th = th5;
            }
        } catch (Throwable th6) {
            bufferedReader = null;
            th = th6;
            fileReader = null;
        }
        com.uc.crashsdk.a.g.a(bufferedReader);
        f11993k = str;
        f11994l = str2;
    }

    private static String U() {
        return g.W() + "bytes";
    }

    private static boolean V() {
        return Build.VERSION.SDK_INT < 29;
    }

    private static void W() {
        if (!O && !com.uc.crashsdk.b.F() && !com.uc.crashsdk.b.L()) {
            JNIBridge.cmd(18);
        }
    }

    private static void X() {
        com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(414), 1000L);
    }

    private static StringBuilder Y() {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("level: ");
            sb.append(C);
            sb.append("\n");
            sb.append("scale: ");
            sb.append(D);
            sb.append("\n");
            String str3 = " (Unknown)";
            switch (F) {
                case 1:
                    str = " (Unknown)";
                    break;
                case 2:
                    str = " (Good)";
                    break;
                case 3:
                    str = " (Overheat)";
                    break;
                case 4:
                    str = " (Dead)";
                    break;
                case 5:
                    str = " (Over voltage)";
                    break;
                case 6:
                    str = " (Unspecified failure)";
                    break;
                case 7:
                    str = " (Cold)";
                    break;
                default:
                    str = " (?)";
                    break;
            }
            sb.append("health: ");
            sb.append(F);
            sb.append(str);
            sb.append("\n");
            int i5 = G;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 4) {
                            str2 = " (?)";
                        } else {
                            str2 = " (Wireless)";
                        }
                    } else {
                        str2 = " (USB port)";
                    }
                } else {
                    str2 = " (AC charger)";
                }
            } else {
                str2 = " (None)";
            }
            sb.append("pluged: ");
            sb.append(G);
            sb.append(str2);
            sb.append("\n");
            int i6 = H;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            if (i6 != 5) {
                                str3 = " (?)";
                            } else {
                                str3 = " (Full)";
                            }
                        } else {
                            str3 = " (Not charging)";
                        }
                    } else {
                        str3 = " (Discharging)";
                    }
                } else {
                    str3 = " (Charging)";
                }
            }
            sb.append("status: ");
            sb.append(H);
            sb.append(str3);
            sb.append("\n");
            sb.append("voltage: ");
            sb.append(E);
            sb.append("\n");
            sb.append("temperature: ");
            sb.append(I);
            sb.append("\n");
            sb.append("technology: ");
            sb.append(J);
            sb.append("\n");
            sb.append("battery low: ");
            sb.append(K);
            sb.append("\n");
            return sb;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return null;
        }
    }

    private static void Z() {
        if (com.uc.crashsdk.b.f11951c && L && com.uc.crashsdk.a.f11871c) {
            L = false;
            if (!com.uc.crashsdk.a.f.b(P)) {
                com.uc.crashsdk.a.f.a(0, P, 2000L);
            }
        }
    }

    public static boolean a() {
        if (f11988f == 0) {
            f11988f = 2L;
            if (h(com.uc.crashsdk.b.b("logs")) == 1) {
                f11988f = 1L;
            }
        }
        return f11988f == 1;
    }

    private static boolean aa() {
        return com.uc.crashsdk.b.f11952d && JNIBridge.nativeIsCrashing();
    }

    private static void ab() {
        boolean z4;
        String Y2 = g.Y();
        File file = new File(Y2);
        if (!file.isDirectory()) {
            return;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 150) {
                return;
            }
            Arrays.sort(listFiles, new b((byte) 0));
            int length = listFiles.length - 150;
            if (length < 0) {
                length = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < listFiles.length; i7++) {
                File file2 = listFiles[i7];
                if (i7 < length) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 && currentTimeMillis - file2.lastModified() >= 432000000) {
                    z4 = true;
                }
                if (!z4) {
                    break;
                }
                try {
                    file2.delete();
                    i5++;
                    i6 = 0;
                } catch (Throwable th) {
                    i6++;
                    com.uc.crashsdk.a.g.a(th);
                }
                if (i6 >= 3) {
                    break;
                }
            }
            com.uc.crashsdk.a.a.a("Removed " + i5 + " logs in " + Y2);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b() {
        if (f11989g == -1) {
            f11989g = h(com.uc.crashsdk.b.b(com.yuanqi.master.config.c.I));
        }
        return f11989g;
    }

    private static String j(String str) {
        if (str == null) {
            str = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(65536);
        }
        return String.format(Locale.US, "%s%s_%s_%s_%s_%s_", P(), g.T(), g.V(), i(Build.MODEL), i(Build.VERSION.RELEASE), str);
    }

    private static String k(String str) {
        return String.format(Locale.US, "%s%s_%s_%s.log", d(), n(), Q(), str);
    }

    private static String l(String str) {
        if (!com.uc.crashsdk.a.g.b(str)) {
            return "";
        }
        int indexOf = str.indexOf(0);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    private static String m(String str) {
        String a5 = com.uc.crashsdk.a.b.a(str, g.w(), g.v());
        if (!str.equals(a5)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
        return a5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r7.endsWith(r3) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r7.indexOf(".log", r7.lastIndexOf(95)) != r7.lastIndexOf(".log")) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean[] n(java.lang.String r7) {
        /*
            boolean r0 = com.uc.crashsdk.g.v()
            boolean r1 = com.uc.crashsdk.g.x()
            r2 = 0
            if (r0 != 0) goto Ld
            if (r1 == 0) goto L6f
        Ld:
            java.lang.String r3 = ".tmp"
            boolean r3 = r7.endsWith(r3)
            if (r3 != 0) goto L6d
            java.lang.String r3 = ".ec"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto L1e
            goto L6d
        L1e:
            char r3 = java.io.File.separatorChar
            int r3 = r7.lastIndexOf(r3)
            if (r3 >= 0) goto L29
            r3 = r2
            r4 = r3
            goto L2a
        L29:
            r4 = r2
        L2a:
            r5 = 95
            int r3 = r7.indexOf(r5, r3)
            if (r3 < 0) goto L36
            int r4 = r4 + 1
            int r3 = r3 + 1
        L36:
            if (r3 >= 0) goto L2a
            r3 = 8
            if (r4 == r3) goto L3d
            goto L6d
        L3d:
            java.lang.String r3 = com.uc.crashsdk.g.w()
            java.lang.String r4 = ".log"
            boolean r6 = r7.endsWith(r4)
            if (r6 != 0) goto L56
            boolean r0 = com.uc.crashsdk.a.g.a(r3)
            if (r0 != 0) goto L6d
            boolean r7 = r7.endsWith(r3)
            if (r7 != 0) goto L5c
            goto L6d
        L56:
            boolean r3 = com.uc.crashsdk.a.g.a(r3)
            if (r3 == 0) goto L5e
        L5c:
            r0 = r2
            goto L6f
        L5e:
            int r3 = r7.lastIndexOf(r5)
            int r3 = r7.indexOf(r4, r3)
            int r7 = r7.lastIndexOf(r4)
            if (r3 == r7) goto L6f
            goto L5c
        L6d:
            r0 = r2
            r1 = r0
        L6f:
            r7 = 2
            boolean[] r7 = new boolean[r7]
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.n(java.lang.String):boolean[]");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|(3:6|(3:9|(1:11)(15:12|13|14|(2:48|49)(1:16)|17|(1:47)(1:20)|21|(1:23)|24|25|26|28|29|30|31)|7)|53)|54|(0)|24|25|26|28|29|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        com.uc.crashsdk.a.g.a(r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        com.uc.crashsdk.a.g.a((java.io.Closeable) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ee, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0005, B:6:0x0033, B:7:0x0041, B:9:0x0047, B:11:0x0051, B:13:0x0056, B:49:0x0068, B:17:0x0079, B:21:0x0084, B:23:0x00af, B:30:0x00d6, B:31:0x00e9, B:42:0x00eb, B:43:0x00ee, B:39:0x00e6, B:52:0x0072), top: B:3:0x0005, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean o(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.o(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae A[Catch: all -> 0x0108, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:12:0x00ae, B:17:0x00d4, B:23:0x00ef, B:24:0x00df, B:38:0x00fc, B:41:0x0106, B:45:0x0033, B:47:0x003b, B:48:0x0044, B:50:0x004c, B:52:0x0054, B:54:0x005c, B:59:0x006a, B:61:0x0074, B:63:0x0081, B:65:0x008b, B:66:0x0096, B:68:0x00a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[Catch: all -> 0x0108, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:7:0x0018, B:9:0x0023, B:10:0x002d, B:12:0x00ae, B:17:0x00d4, B:23:0x00ef, B:24:0x00df, B:38:0x00fc, B:41:0x0106, B:45:0x0033, B:47:0x003b, B:48:0x0044, B:50:0x004c, B:52:0x0054, B:54:0x005c, B:59:0x006a, B:61:0x0074, B:63:0x0081, B:65:0x008b, B:66:0x0096, B:68:0x00a0), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean p(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.p(java.lang.String):boolean");
    }

    private static Map<String, Integer> q(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("\\|", 30)) {
            String[] split = str2.split(":", 3);
            if (split.length == 2) {
                String trim = split[0].trim();
                if (!com.uc.crashsdk.a.g.a(trim)) {
                    int i5 = 1;
                    try {
                        i5 = Integer.parseInt(split[1].trim(), 10);
                    } catch (Throwable th) {
                        com.uc.crashsdk.a.g.a(th);
                    }
                    hashMap.put(trim, Integer.valueOf(i5));
                }
            }
        }
        return hashMap;
    }

    private static void r(String str) {
        if (g.q()) {
            try {
                ab();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            if (str == null || "".equals(str)) {
                return;
            }
            try {
                File file = new File(g.Y());
                if (!file.exists()) {
                    file.mkdirs();
                }
                com.uc.crashsdk.a.a.a("crashsdk", "copy log to: " + file);
                com.uc.crashsdk.a.g.a(new File(str), file);
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
    }

    private static String s(String str) {
        return String.format("$^%s^$", str);
    }

    public static void t() {
        Thread.setDefaultUncaughtExceptionHandler(T);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u() {
        return f11986c.get() || aa();
    }

    public static Throwable v() {
        return U;
    }

    public static int w() {
        if (com.uc.crashsdk.b.I() == 5) {
            return Z;
        }
        return 100;
    }

    public static void x() {
        boolean z4;
        long o5 = g.o();
        if (o5 < 0) {
            return;
        }
        if (com.uc.crashsdk.b.I() == 5) {
            z4 = true;
        } else {
            z4 = false;
        }
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(401));
        if (!z4) {
            return;
        }
        com.uc.crashsdk.a.e eVar = new com.uc.crashsdk.a.e(402);
        X = eVar;
        com.uc.crashsdk.a.f.a(0, eVar, o5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void y() {
        if (com.uc.crashsdk.b.f11951c && com.uc.crashsdk.a.f11871c && !com.uc.crashsdk.a.f.b(aa)) {
            com.uc.crashsdk.a.f.a(0, aa, 1000L);
        }
    }

    public static boolean z() {
        synchronized (Y) {
            Runnable runnable = X;
            if (runnable != null && !W) {
                com.uc.crashsdk.a.f.a(runnable);
                X = null;
                return true;
            }
            return false;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(thread, th, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d() {
        String str = f11991i;
        if (str != null) {
            return str;
        }
        String j5 = j(null);
        f11991i = j5;
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #5 {all -> 0x00c9, blocks: (B:43:0x0090, B:45:0x00a5), top: B:42:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[Catch: all -> 0x0139, TryCatch #4 {all -> 0x0139, blocks: (B:50:0x00d0, B:52:0x00d6, B:54:0x00de, B:55:0x0104, B:57:0x010a, B:59:0x0112), top: B:49:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a A[Catch: all -> 0x0139, TryCatch #4 {all -> 0x0139, blocks: (B:50:0x00d0, B:52:0x00d6, B:54:0x00de, B:55:0x0104, B:57:0x010a, B:59:0x0112), top: B:49:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e():java.lang.String");
    }

    public static String f() {
        if (com.uc.crashsdk.a.g.a(f11993k)) {
            T();
        }
        return f11993k;
    }

    private static long h(String str) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("getLong", String.class, Long.TYPE);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                return ((Long) declaredMethod.invoke(null, str, 0L)).longValue();
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return 0L;
    }

    private static String i(String str) {
        try {
            return str.replaceAll("[^0-9a-zA-Z-.]", "-");
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static void s() {
        T = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        f11991i = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i() {
        return f11987d;
    }

    public static boolean b(int i5, Object[] objArr) {
        if (i5 == 451) {
            if (f11984a || objArr != null) {
                return a((String) objArr[0], (d) objArr[1]);
            }
            throw new AssertionError();
        }
        if (i5 != 452) {
            if (f11984a) {
                return false;
            }
            throw new AssertionError();
        }
        if (!f11984a && objArr == null) {
            throw new AssertionError();
        }
        String str = (String) objArr[0];
        d dVar = (d) objArr[1];
        return com.uc.crashsdk.a.g.a(new File(str), String.format(Locale.US, "%d %d %d %d", Long.valueOf(dVar.f12015a), Long.valueOf(dVar.f12016b), Integer.valueOf(dVar.f12017c), Integer.valueOf(dVar.f12018d)).getBytes());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(java.io.OutputStream r9) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.uc.crashsdk.b.f11952d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            java.lang.String r0 = com.uc.crashsdk.b.o()
            com.uc.crashsdk.e.f11990h = r2
            r1 = 17
            long r1 = com.uc.crashsdk.JNIBridge.cmd(r1, r0)
            r4 = 1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L3a
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            byte[] r0 = com.uc.crashsdk.a.g.e(r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2d
            r9.write(r0)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r0 = move-exception
            a(r0, r9)
        L2d:
            r1.delete()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            a(r0, r9)
        L35:
            com.uc.crashsdk.e.f11990h = r3
            a(r9)
        L3a:
            com.uc.crashsdk.e.f11990h = r3
            return
        L3d:
            r1 = 0
            int r4 = com.uc.crashsdk.g.J()     // Catch: java.lang.Throwable -> L7b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "/proc/self/fd"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L79
            java.io.File[] r1 = r5.listFiles()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L6f
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "opened file count: %d, write limit: %d.\n"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L79
            int r8 = r1.length     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L79
            r7[r2] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L79
            r7[r3] = r8     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = java.lang.String.format(r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L6f:
            java.lang.String r3 = "[DEBUG] listFiles failed!\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L79
            r9.write(r3)     // Catch: java.lang.Throwable -> L79
            goto L81
        L79:
            r3 = move-exception
            goto L7e
        L7b:
            r3 = move-exception
            r4 = 900(0x384, float:1.261E-42)
        L7e:
            a(r3, r9)
        L81:
            if (r1 == 0) goto Lc8
            int r3 = r1.length     // Catch: java.lang.Throwable -> Lc4
            if (r3 < r4) goto Lc8
            java.lang.String r3 = "opened files:\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            int r4 = r1.length     // Catch: java.lang.Throwable -> Lb4
        L95:
            if (r2 >= r4) goto Lb8
            r5 = r1[r2]     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = " -> "
            r3.append(r6)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> Lb4
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r5 = "\n"
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb4
            int r2 = r2 + 1
            goto L95
        Lb4:
            r1 = move-exception
            a(r1, r9)     // Catch: java.lang.Throwable -> Lc4
        Lb8:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc4
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            r9.write(r0)     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r0 = move-exception
            a(r0, r9)
        Lc8:
            a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.c(java.io.OutputStream):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("JavaMax:    ");
            sb.append(Runtime.getRuntime().maxMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaTotal:  ");
            sb.append(Runtime.getRuntime().totalMemory() / 1024);
            sb.append(" kB\n");
            sb.append("JavaFree:   ");
            sb.append(Runtime.getRuntime().freeMemory() / 1024);
            sb.append(" kB\n");
            sb.append("NativeHeap: ");
            sb.append(Debug.getNativeHeapSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeAllocated: ");
            sb.append(Debug.getNativeHeapAllocatedSize() / 1024);
            sb.append(" kB\n");
            sb.append("NativeFree: ");
            sb.append(Debug.getNativeHeapFreeSize() / 1024);
            sb.append(" kB\n");
            try {
                ActivityManager activityManager = (ActivityManager) com.uc.crashsdk.a.g.a().getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    sb.append("availMem:   ");
                    sb.append(memoryInfo.availMem / 1024);
                    sb.append(" kB\n");
                    sb.append("threshold:  ");
                    sb.append(memoryInfo.threshold / 1024);
                    sb.append(" kB\n");
                    sb.append("lowMemory:  ");
                    sb.append(memoryInfo.lowMemory);
                    sb.append("\n");
                }
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            return sb.toString();
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(java.io.OutputStream r12) {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            int r3 = com.uc.crashsdk.g.K()     // Catch: java.lang.Throwable -> L1c
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "/proc/self/task"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            java.io.File[] r1 = r4.listFiles()     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L16
            return
        L16:
            int r4 = r1.length     // Catch: java.lang.Throwable -> L1a
            if (r4 >= r3) goto L23
            return
        L1a:
            r4 = move-exception
            goto L1f
        L1c:
            r4 = move-exception
            r3 = 300(0x12c, float:4.2E-43)
        L1f:
            com.uc.crashsdk.a.g.a(r4)
            r4 = r2
        L23:
            if (r1 != 0) goto L26
            return
        L26:
            java.lang.String r5 = "threads info:\n"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r5)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "threads count: %d, dump limit: %d.\n"
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8e
            r8[r2] = r4     // Catch: java.lang.Throwable -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 1
            r8[r4] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.format(r5, r6, r8)     // Catch: java.lang.Throwable -> L8e
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = " tid     name\n"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r3)     // Catch: java.lang.Throwable -> L8e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L8e
            r5 = r2
        L59:
            if (r5 >= r3) goto L92
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L8e
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = r6.getPath()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "comm"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L8e
            r9 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = com.uc.crashsdk.a.g.a(r8, r9, r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = l(r8)     // Catch: java.lang.Throwable -> L8e
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L8e
            java.lang.String r10 = "%5s %s\n"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            r11[r2] = r6     // Catch: java.lang.Throwable -> L8e
            r11[r4] = r8     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = java.lang.String.format(r9, r10, r11)     // Catch: java.lang.Throwable -> L8e
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L8e
            r12.write(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r5 + 1
            goto L59
        L8e:
            r0 = move-exception
            a(r0, r12)
        L92:
            a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.d(java.io.OutputStream):void");
    }

    private static void f(OutputStream outputStream) {
        String m5;
        try {
            outputStream.write("recent status:\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            if (ag) {
                m5 = s("LASTVER");
            } else {
                m5 = com.uc.crashsdk.a.m();
            }
            outputStream.write(String.format(Locale.US, "last version: '%s'\n", m5).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            ArrayList<String> arrayList = f12001s;
            synchronized (arrayList) {
                if (f12003u != null) {
                    outputStream.write(String.format(Locale.US, "generating log: %s\n", f12003u).getBytes("UTF-8"));
                }
                if (f12002t > 0 || arrayList.size() > 0) {
                    outputStream.write(String.format(Locale.US, "generated %d logs, recent are:\n", Integer.valueOf(f12002t)).getBytes("UTF-8"));
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        outputStream.write(String.format(Locale.US, "* %s\n", it.next()).getBytes("UTF-8"));
                    }
                }
            }
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "dumping all threads: %s\n", Boolean.valueOf(f12004v)).getBytes("UTF-8"));
            String str = f12005w;
            if (str != null) {
                outputStream.write(String.format(locale, "dumping threads: %s\n", str).getBytes("UTF-8"));
            }
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        a(outputStream);
    }

    public static String k() {
        String str = f12006x;
        if (com.uc.crashsdk.a.g.a(str)) {
            synchronized (f12007y) {
                str = com.uc.crashsdk.a.g.a(com.uc.crashsdk.b.i(), g.y(), true);
                f12006x = str;
            }
        }
        return str;
    }

    public static void l() {
        synchronized (f12007y) {
            f12006x = null;
        }
    }

    public static void a(int i5, Object[] objArr) {
        int i6;
        switch (i5) {
            case 401:
                JNIBridge.nativeCmd(10, com.uc.crashsdk.b.I() == 5 ? 1L : 0L, null, null);
                com.uc.crashsdk.a.f11871c = true;
                com.uc.crashsdk.a.a(false);
                L = true;
                Z();
                y();
                return;
            case 402:
                Object obj = Y;
                synchronized (obj) {
                    if (X == null) {
                        return;
                    }
                    W = true;
                    if (com.uc.crashsdk.b.q()) {
                        return;
                    }
                    if (!com.uc.crashsdk.a.d.e()) {
                        com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
                        return;
                    }
                    if (!d(LogType.UNEXP_TYPE)) {
                        com.uc.crashsdk.a.a.d("DEBUG", "unexp sample miss");
                        return;
                    }
                    int nativeGenerateUnexpLog = JNIBridge.nativeGenerateUnexpLog(g.o(), g.p());
                    if (nativeGenerateUnexpLog != 0) {
                        f.a(11);
                        if ((nativeGenerateUnexpLog & 4352) != 0) {
                            Z = 105;
                            i6 = 30;
                        } else if ((nativeGenerateUnexpLog & LogType.UNEXP_EXIT) != 0) {
                            Z = 104;
                            i6 = 31;
                        } else if ((nativeGenerateUnexpLog & LogType.UNEXP_RESTART) != 0) {
                            Z = 106;
                            i6 = 32;
                        } else {
                            if ((nativeGenerateUnexpLog & LogType.UNEXP_ANR) != 0) {
                                Z = 103;
                                f.a(10);
                            } else if ((nativeGenerateUnexpLog & LogType.UNEXP_LOW_MEMORY) != 0) {
                                Z = 107;
                                f.a(29);
                            } else {
                                Z = 102;
                            }
                            a(true);
                        }
                        f.a(i6);
                        a(true);
                    }
                    synchronized (obj) {
                        X = null;
                    }
                    return;
                }
            case 403:
                ab();
                return;
            case 404:
            default:
                if (!f11984a) {
                    throw new AssertionError();
                }
                return;
            case 405:
                L = false;
                StringBuilder Y2 = Y();
                String g5 = com.uc.crashsdk.b.g();
                if (Y2 != null) {
                    com.uc.crashsdk.a.g.a(new File(g5), Y2.toString());
                    return;
                }
                return;
            case 406:
                if (!f11984a && objArr == null) {
                    throw new AssertionError();
                }
                a((String) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue());
                return;
            case 407:
                try {
                    com.uc.crashsdk.a.d();
                    return;
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                    return;
                }
            case 408:
                synchronized (ab) {
                    if (!ac && g.Q() && com.uc.crashsdk.b.z()) {
                        com.uc.crashsdk.b.s();
                        h.f();
                        f.c();
                        if (com.uc.crashsdk.b.F()) {
                            C();
                        }
                        if (g.Q()) {
                            a(Calendar.getInstance());
                        }
                        ac = true;
                        return;
                    }
                    return;
                }
            case 409:
                d(false);
                return;
            case 410:
                a(false, true);
                return;
            case 411:
                if (com.uc.crashsdk.b.f11952d) {
                    JNIBridge.set(28, d(LogType.NATIVE_TYPE));
                    JNIBridge.set(29, d("anr"));
                    return;
                }
                return;
            case 412:
                if (!R && com.uc.crashsdk.b.B() && g.M()) {
                    b(com.uc.crashsdk.a.g.a());
                    return;
                }
                if (R) {
                    if (com.uc.crashsdk.b.B() && g.M()) {
                        return;
                    }
                    try {
                        com.uc.crashsdk.a.g.a().unregisterReceiver(Q);
                        R = false;
                        return;
                    } catch (Throwable th2) {
                        com.uc.crashsdk.a.g.a(th2);
                        return;
                    }
                }
                return;
            case 413:
                JNIBridge.cmd(8);
                return;
            case 414:
                try {
                    if (d(com.uc.crashsdk.a.g.a())) {
                        return;
                    }
                    int i7 = N + 1;
                    N = i7;
                    if (i7 < 10) {
                        X();
                        return;
                    } else {
                        if (com.uc.crashsdk.b.f11952d) {
                            JNIBridge.set(130, "(get failed)");
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    com.uc.crashsdk.a.g.a(th3);
                    return;
                }
            case 415:
                if (!f11984a && objArr == null) {
                    throw new AssertionError();
                }
                long longValue = ((Long) objArr[0]).longValue();
                Calendar calendar = Calendar.getInstance();
                if (calendar.getTimeInMillis() >= longValue) {
                    h.g();
                    f.a(100);
                    d(true);
                    f.a(true);
                    h.b();
                } else {
                    h.h();
                    h.i();
                    h.c();
                }
                a(calendar);
                break;
            case 416:
                break;
        }
        W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final long f12010a;

        /* renamed from: b, reason: collision with root package name */
        private final OutputStream f12011b;

        /* renamed from: c, reason: collision with root package name */
        private int f12012c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f12013d = 0;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12014e = false;

        a(long j5, OutputStream outputStream) {
            this.f12010a = j5;
            this.f12011b = outputStream;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int a(byte[] r6, int r7, int r8) {
            /*
                r5 = this;
                int r0 = r5.f12013d
                int r0 = r0 + r8
                r5.f12013d = r0
                boolean r0 = r5.f12014e
                if (r0 == 0) goto Lb
                r6 = 0
                return r6
            Lb:
                int r0 = com.uc.crashsdk.g.A()
                if (r0 <= 0) goto L19
                int r1 = r5.f12012c
                int r2 = r1 + r8
                if (r2 <= r0) goto L19
                int r0 = r0 - r1
                goto L1a
            L19:
                r0 = r8
            L1a:
                int r1 = r5.f12012c
                int r1 = r1 + r0
                r5.f12012c = r1
                long r1 = r5.f12010a
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L30
                java.lang.String r1 = new java.lang.String
                r1.<init>(r6, r7, r0)
                r5.b(r1)
                goto L35
            L30:
                java.io.OutputStream r1 = r5.f12011b
                r1.write(r6, r7, r0)
            L35:
                if (r0 >= r8) goto L3a
                r6 = 1
                r5.f12014e = r6
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a.a(byte[], int, int):int");
        }

        private void b(String str) {
            if (com.uc.crashsdk.b.f11952d) {
                JNIBridge.nativeClientWriteData(this.f12010a, str);
            }
        }

        @Override // java.io.OutputStream
        public final void write(int i5) {
            if (e.f11990h && e.I()) {
                com.uc.crashsdk.a.a.d("DEBUG", String.format(Locale.US, "%c", Integer.valueOf(i5)));
            }
            if (this.f12010a != 0) {
                b(String.format(Locale.US, "%c", Integer.valueOf(i5)));
            } else {
                this.f12011b.write(i5);
            }
            this.f12012c++;
            this.f12013d++;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i5, int i6) {
            if (e.f11990h && e.I()) {
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i5, bArr2, 0, i6);
                if (i6 != 1 || bArr2[0] != 10) {
                    try {
                        com.uc.crashsdk.a.a.d("DEBUG", new String(bArr2));
                    } catch (Throwable unused) {
                    }
                }
            }
            a(bArr, i5, i6);
        }

        final void a() {
            try {
                if (this.f12013d - this.f12012c > 0) {
                    a("\n");
                    a("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                }
                a(String.format(Locale.US, "Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", Integer.valueOf(this.f12013d), Integer.valueOf(this.f12012c), Integer.valueOf(g.A()), Integer.valueOf(this.f12013d - this.f12012c)));
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            if (e.f11990h && e.I() && (bArr.length != 1 || bArr[0] != 10)) {
                try {
                    com.uc.crashsdk.a.a.d("DEBUG", new String(bArr));
                } catch (Throwable unused) {
                }
            }
            a(bArr, 0, bArr.length);
        }

        final void a(String str) {
            if (e.f11990h && e.I()) {
                com.uc.crashsdk.a.a.d("DEBUG", str);
            }
            if (this.f12010a != 0) {
                b(str);
            } else {
                this.f12011b.write(str.getBytes("UTF-8"));
            }
        }
    }

    public static String h() {
        String str = f11995m;
        if (str != null) {
            return str;
        }
        String a5 = a(Process.myPid());
        f11995m = a5;
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        long f12015a;

        /* renamed from: b, reason: collision with root package name */
        long f12016b;

        /* renamed from: c, reason: collision with root package name */
        int f12017c;

        /* renamed from: d, reason: collision with root package name */
        int f12018d;

        /* renamed from: e, reason: collision with root package name */
        boolean f12019e;

        /* renamed from: f, reason: collision with root package name */
        boolean f12020f;

        /* renamed from: g, reason: collision with root package name */
        boolean f12021g;

        private d() {
            this.f12015a = 0L;
            this.f12016b = 0L;
            this.f12017c = 0;
            this.f12018d = 0;
            this.f12019e = false;
            this.f12020f = false;
            this.f12021g = false;
        }

        /* synthetic */ d(byte b5) {
            this();
        }
    }

    public static void j() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void m() {
        if (ag) {
            return;
        }
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(411), 1000L);
    }

    public static void p() {
        String str;
        Throwable th;
        if (com.uc.crashsdk.a.g.a(B)) {
            String str2 = null;
            try {
                File file = new File(g.W() + "unique");
                if (file.exists()) {
                    str = com.uc.crashsdk.a.g.a(file, 48, false);
                    try {
                        if (str != null) {
                            try {
                                if (str.length() == 36) {
                                    str2 = str.replaceAll("[^0-9a-zA-Z-]", "-");
                                }
                            } catch (Exception e5) {
                                com.uc.crashsdk.a.g.a(e5);
                            }
                        }
                        str2 = str;
                    } catch (Throwable th2) {
                        th = th2;
                        com.uc.crashsdk.a.g.a(th);
                        str2 = str;
                        B = str2;
                    }
                }
                if (com.uc.crashsdk.a.g.a(str2)) {
                    com.uc.crashsdk.b.G();
                    str2 = UUID.randomUUID().toString();
                    if (!com.uc.crashsdk.a.g.a(str2)) {
                        com.uc.crashsdk.a.g.a(file, str2.getBytes());
                    }
                }
            } catch (Throwable th3) {
                str = str2;
                th = th3;
            }
            B = str2;
        }
    }

    public static String q() {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r() {
        O = false;
        if (!com.uc.crashsdk.b.B()) {
            com.uc.crashsdk.a.f.a(3, new com.uc.crashsdk.a.e(416), 11000L);
        }
        if (V()) {
            return;
        }
        N = 0;
        X();
    }

    private static void b(OutputStream outputStream, String str, String str2) {
        String str3;
        String str4;
        try {
            outputStream.write("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
        try {
            Locale locale = Locale.US;
            outputStream.write(String.format(locale, "Basic Information: 'pid: %d/tid: %d/time: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), n()).getBytes("UTF-8"));
            Object[] objArr = new Object[3];
            objArr[0] = e();
            if (com.uc.crashsdk.a.g.a(f11994l)) {
                T();
            }
            objArr[1] = f11994l;
            objArr[2] = f();
            outputStream.write(String.format(locale, "Cpu Information: 'abi: %s/processor: %s/hardware: %s'\n", objArr).getBytes("UTF-8"));
        } catch (Throwable th2) {
            a(th2, outputStream);
        }
        try {
            Locale locale2 = Locale.US;
            outputStream.write(String.format(locale2, "Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)).getBytes("UTF-8"));
            outputStream.write(("Build fingerprint: '" + Build.FINGERPRINT + "'\n").getBytes("UTF-8"));
            Object[] objArr2 = new Object[4];
            objArr2[0] = a(new Date(f11985b));
            objArr2[1] = Long.valueOf(Runtime.getRuntime().maxMemory());
            objArr2[2] = com.uc.crashsdk.a.g.d();
            objArr2[3] = com.uc.crashsdk.b.B() ? "fg" : "bg";
            outputStream.write(String.format(locale2, "Runtime Information: 'start: %s/maxheap: %s/primaryabi: %s/ground: %s'\n", objArr2).getBytes("UTF-8"));
        } catch (Throwable th3) {
            a(th3, outputStream);
        }
        try {
            Locale locale3 = Locale.US;
            outputStream.write(String.format(locale3, "Application Information: 'version: %s/subversion: %s/buildseq: %s/versioncode: %d'\n", g.T(), g.U(), g.V(), Integer.valueOf(com.uc.crashsdk.a.c())).getBytes("UTF-8"));
            String str5 = "0";
            String str6 = "";
            if (com.uc.crashsdk.b.f11952d) {
                String nativeGet = JNIBridge.nativeGet(1, 0L, null);
                str4 = JNIBridge.nativeGet(2, 0L, null);
                str5 = nativeGet;
            } else {
                str4 = "";
            }
            outputStream.write(String.format(locale3, "CrashSDK Information: 'version: %s/nativeseq: %s/javaseq: %s/arch: %s/target: %s'\n", "3.3.2.2", str5, "211215141717", str4, "release").getBytes("UTF-8"));
            if (str != null) {
                str6 = str;
            }
            outputStream.write(("Report Name: " + str6.substring(str6.lastIndexOf(47) + 1) + "\n").getBytes("UTF-8"));
        } catch (Throwable th4) {
            a(th4, outputStream);
        }
        try {
            if (ag) {
                str3 = s("UUID");
            } else {
                str3 = B;
            }
            outputStream.write(String.format("UUID: %s\n", str3).getBytes("UTF-8"));
            outputStream.write(("Log Type: " + str2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th5) {
            a(th5, outputStream);
        }
        try {
            String E2 = com.uc.crashsdk.b.E();
            if (com.uc.crashsdk.a.g.a(E2)) {
                E2 = "(none)";
            }
            outputStream.write(("Activity: " + E2 + "\n").getBytes("UTF-8"));
        } catch (Throwable th6) {
            a(th6, outputStream);
        }
        a(outputStream);
        try {
            com.uc.crashsdk.a.a(outputStream, "UTF-8");
            if (ag) {
                f11990h = false;
                outputStream.write(s("HEADER").getBytes("UTF-8"));
                f11990h = true;
            }
        } catch (Throwable th7) {
            a(th7, outputStream);
        }
        a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String n() {
        return a(new Date());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        if (ag) {
            return true;
        }
        try {
            return p(str);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(boolean z4) {
        File[] listFiles;
        try {
            if (com.uc.crashsdk.b.y() && (listFiles = new File(g.X()).listFiles()) != null) {
                int l5 = g.l();
                int m5 = g.m();
                if (listFiles.length < Math.min(l5, m5)) {
                    return;
                }
                Object[] objArr = 0;
                int i5 = 0;
                int i6 = 0;
                for (File file : listFiles) {
                    if (b(file)) {
                        i5++;
                    } else {
                        i6++;
                    }
                }
                int i7 = (!z4 || i5 < l5) ? 0 : (i5 - l5) + 1;
                int i8 = (z4 || i6 < m5) ? 0 : (i6 - m5) + 1;
                if (i7 == 0 && i8 == 0) {
                    return;
                }
                Arrays.sort(listFiles, new b(objArr == true ? 1 : 0));
                int i9 = i7;
                int i10 = i8;
                for (File file2 : listFiles) {
                    boolean b5 = b(file2);
                    if (b5 && i9 > 0) {
                        com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest crash log: " + file2.getPath());
                        file2.delete();
                        i9 += -1;
                    } else if (!b5 && i10 > 0) {
                        com.uc.crashsdk.a.a.a("crashsdk", "Delete oldest custom log: " + file2.getPath());
                        file2.delete();
                        i10 += -1;
                    }
                    if (i9 == 0 && i10 == 0) {
                        break;
                    }
                }
                f.a(16, i7 + i8);
                if (i7 > 0) {
                    f.a(22, i7);
                }
                if (i8 > 0) {
                    f.a(23, i8);
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        boolean z4 = false;
        if (activityManager == null || (processesInErrorState = activityManager.getProcessesInErrorState()) == null) {
            return false;
        }
        int myPid = Process.myPid();
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.ProcessErrorStateInfo next = it.next();
            if (next.pid == myPid) {
                O = true;
                if (O()) {
                    com.uc.crashsdk.a.a.d("crashsdk", "ANR occurred in process: " + next.processName);
                }
                if (com.uc.crashsdk.b.f11952d) {
                    JNIBridge.set(130, next.longMsg);
                }
                z4 = true;
            }
        }
        if (!z4 && com.uc.crashsdk.b.f11952d) {
            W();
        }
        return true;
    }

    public static void o() {
        f11985b = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(java.io.OutputStream r11) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.uc.crashsdk.b.f11952d
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "solib build id:\n"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L11
            r11.write(r1)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r1 = move-exception
            a(r1, r11)
        L15:
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc3
            r2.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> Lc3
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "/proc/self/maps"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc3
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lbf
            r5 = 512(0x200, float:7.175E-43)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lbf
        L2e:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto Lb9
            java.lang.String r5 = ".so"
            boolean r5 = r1.endsWith(r5)     // Catch: java.lang.Throwable -> Lbd
            if (r5 == 0) goto L2e
            r5 = 47
            int r5 = r1.indexOf(r5)     // Catch: java.lang.Throwable -> Lbd
            r6 = -1
            if (r5 == r6) goto L2e
            java.lang.String r1 = r1.substring(r5)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r5 = "/data/"
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> Lbd
            r6 = 0
            r7 = 1
            if (r5 != 0) goto L5e
            java.lang.String r5 = com.uc.crashsdk.a.f11869a     // Catch: java.lang.Throwable -> Lbd
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> Lbd
            if (r5 == 0) goto L5c
            goto L5e
        L5c:
            r5 = r6
            goto L5f
        L5e:
            r5 = r7
        L5f:
            if (r5 == 0) goto L2e
            boolean r5 = r2.contains(r1)     // Catch: java.lang.Throwable -> Lbd
            if (r5 != 0) goto L2e
            r2.add(r1)     // Catch: java.lang.Throwable -> Lbd
            boolean r5 = com.uc.crashsdk.e.ag     // Catch: java.lang.Throwable -> Lbd
            r8 = 2
            if (r5 == 0) goto L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r5.<init>()     // Catch: java.lang.Throwable -> L96
            java.lang.String r9 = "SOBUILDID"
            java.lang.String r10 = "$^%s`%s^$"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L96
            r8[r6] = r9     // Catch: java.lang.Throwable -> L96
            r8[r7] = r1     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = java.lang.String.format(r10, r8)     // Catch: java.lang.Throwable -> L96
            r5.append(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = "\n"
            r5.append(r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L96
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L96
            r11.write(r1)     // Catch: java.lang.Throwable -> L96
            goto L2e
        L96:
            r1 = move-exception
            a(r1, r11)     // Catch: java.lang.Throwable -> Lbd
            goto L2e
        L9b:
            r5 = 3
            r9 = 0
            java.lang.String r5 = com.uc.crashsdk.JNIBridge.nativeGet(r5, r9, r1)     // Catch: java.lang.Throwable -> Lbd
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r10 = "%s: %s\n"
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Lbd
            r8[r6] = r1     // Catch: java.lang.Throwable -> Lbd
            r8[r7] = r5     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = java.lang.String.format(r9, r10, r8)     // Catch: java.lang.Throwable -> Lbd
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lbd
            r11.write(r1)     // Catch: java.lang.Throwable -> Lbd
            goto L2e
        Lb9:
            com.uc.crashsdk.a.g.a(r3)
            goto Lcb
        Lbd:
            r0 = move-exception
            goto Lc1
        Lbf:
            r0 = move-exception
            r4 = r1
        Lc1:
            r1 = r3
            goto Lc5
        Lc3:
            r0 = move-exception
            r4 = r1
        Lc5:
            a(r0, r11)     // Catch: java.lang.Throwable -> Ld2
            com.uc.crashsdk.a.g.a(r1)
        Lcb:
            com.uc.crashsdk.a.g.a(r4)
            a(r11)
            return
        Ld2:
            r11 = move-exception
            com.uc.crashsdk.a.g.a(r1)
            com.uc.crashsdk.a.g.a(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.e(java.io.OutputStream):void");
    }

    public static void c(String str) {
        synchronized (f12008z) {
            com.uc.crashsdk.a.b.a(com.uc.crashsdk.b.l(), str + "\n");
        }
    }

    public static void d(boolean z4) {
        f.d(false);
        if (z4) {
            f.a(com.uc.crashsdk.b.c(), false);
            h.i();
        } else {
            f.a();
            h.i();
        }
    }

    public static int f(boolean z4) {
        int b5;
        if (z4) {
            b5 = f.a(com.uc.crashsdk.b.c()) ? 1 : 0;
        } else {
            b5 = f.b();
        }
        int b6 = f.b(z4);
        return b6 > b5 ? b6 : b5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z4) {
        boolean z5 = true;
        if (!R ? !z4 || !g.M() : z4 && g.M()) {
            z5 = false;
        }
        if (z5) {
            com.uc.crashsdk.a.e eVar = S;
            if (com.uc.crashsdk.a.f.b(eVar)) {
                com.uc.crashsdk.a.f.a(eVar);
            }
            com.uc.crashsdk.a.f.a(0, eVar, a1.b.f90a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder f(String str) {
        return a(Thread.currentThread().getStackTrace(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r3.write(r4.getBytes("UTF-8"));
        r3.write("\n".getBytes("UTF-8"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79
            r1 = 26
            java.lang.String r2 = "ps"
            if (r0 < r1) goto Lf
            java.lang.String r0 = "-ef"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}     // Catch: java.lang.Throwable -> L79
            goto L13
        Lf:
            java.lang.String[] r0 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L79
        L13:
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L79
            java.lang.Process r0 = r1.exec(r0)     // Catch: java.lang.Throwable -> L79
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L79
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L79
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L79
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L79
            boolean r0 = com.uc.crashsdk.a.g.b(r8)     // Catch: java.lang.Throwable -> L79
            boolean r2 = com.uc.crashsdk.a.g.b(r9)     // Catch: java.lang.Throwable -> L79
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L79
            r3.<init>()     // Catch: java.lang.Throwable -> L79
        L36:
            java.lang.String r4 = r1.readLine()     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "UTF-8"
            if (r4 == 0) goto L74
            r6 = 1
            if (r0 == 0) goto L47
            boolean r7 = r4.contains(r8)     // Catch: java.lang.Throwable -> L79
            if (r7 != 0) goto L61
        L47:
            if (r2 == 0) goto L50
            boolean r7 = r4.contains(r9)     // Catch: java.lang.Throwable -> L79
            if (r7 == 0) goto L50
            goto L61
        L50:
            r7 = 47
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L79
            if (r7 >= 0) goto L60
            r7 = 46
            int r7 = r4.indexOf(r7)     // Catch: java.lang.Throwable -> L79
            if (r7 > 0) goto L61
        L60:
            r6 = 0
        L61:
            if (r6 == 0) goto L36
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L79
            r3.write(r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r4 = "\n"
            byte[] r4 = r4.getBytes(r5)     // Catch: java.lang.Throwable -> L79
            r3.write(r4)     // Catch: java.lang.Throwable -> L79
            goto L36
        L74:
            java.lang.String r8 = r3.toString(r5)     // Catch: java.lang.Throwable -> L79
            return r8
        L79:
            r8 = move-exception
            com.uc.crashsdk.a.g.a(r8)
            java.lang.String r8 = "exception exists."
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, java.lang.String):java.lang.String");
    }

    private static BufferedReader a(InputStreamReader inputStreamReader) {
        BufferedReader bufferedReader = null;
        int i5 = 8192;
        while (bufferedReader == null && i5 > 0) {
            try {
                bufferedReader = new BufferedReader(inputStreamReader, i5);
            } catch (Throwable unused) {
                i5 /= 2;
                if (i5 < 512) {
                    break;
                }
            }
        }
        return bufferedReader;
    }

    public static boolean e(String str) {
        try {
            if (!com.uc.crashsdk.a.g.b(str) || !str.startsWith("lib") || !str.endsWith(".so")) {
                return false;
            }
            System.loadLibrary(str.substring(3, str.length() - 3));
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    private static void a(OutputStream outputStream) {
        try {
            outputStream.write("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n".getBytes("UTF-8"));
        } catch (Throwable th) {
            a(th, outputStream);
        }
    }

    private static String a(File file) {
        String str;
        try {
            str = file.getCanonicalPath();
        } catch (Throwable unused) {
            str = null;
        }
        return com.uc.crashsdk.a.g.a(str) ? file.getPath() : str;
    }

    public static int e(boolean z4) {
        return f.a(z4);
    }

    private static long a(StatFs statFs, String str, String str2) {
        try {
            Method declaredMethod = StatFs.class.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(statFs, new Object[0]);
            if (invoke != null && (invoke instanceof Long)) {
                return ((Long) invoke).longValue();
            }
        } catch (Throwable unused) {
        }
        try {
            Method declaredMethod2 = StatFs.class.getDeclaredMethod(str2, new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(statFs, new Object[0]);
            if (invoke2 == null || !(invoke2 instanceof Integer)) {
                return 0L;
            }
            return ((Integer) invoke2).intValue();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return 0L;
        }
    }

    private static void b(OutputStream outputStream) {
        BufferedReader bufferedReader = null;
        try {
            outputStream.write("logcat:\n".getBytes("UTF-8"));
        } finally {
        }
        try {
            if (g.n() <= 0) {
                try {
                    outputStream.write("[DEBUG] custom java logcat lines count is 0!\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    a(th, outputStream);
                }
                a(outputStream);
                return;
            }
            int n5 = g.n();
            bufferedReader = a(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-b", com.umeng.analytics.pro.d.ax, "-b", TTAdSdk.S_C, "-v", "threadtime", "-t", String.valueOf(n5)}).getInputStream()));
            if (bufferedReader == null) {
                try {
                    outputStream.write("[DEBUG] alloc buffer failed!\n".getBytes("UTF-8"));
                } catch (Throwable th2) {
                    a(th2, outputStream);
                }
                a(outputStream);
                return;
            }
            f11990h = false;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    i5++;
                    if (i6 < n5 && !readLine.contains(" I auditd ") && !readLine.contains(" I liblog ")) {
                        outputStream.write(readLine.getBytes("UTF-8"));
                        outputStream.write("\n".getBytes("UTF-8"));
                        i6++;
                    }
                } else {
                    try {
                        break;
                    } catch (Throwable th3) {
                        a(th3, outputStream);
                    }
                }
            }
            outputStream.write(String.format(Locale.US, "[DEBUG] Read %d lines, wrote %d lines.\n", Integer.valueOf(i5), Integer.valueOf(i6)).getBytes("UTF-8"));
            f11990h = true;
            com.uc.crashsdk.a.g.a(bufferedReader);
            a(outputStream);
            return;
            com.uc.crashsdk.a.g.a(bufferedReader);
            a(outputStream);
            return;
        } finally {
        }
    }

    private static void a(a aVar) {
        try {
            aVar.a(String.format(Locale.US, "log end: %s\n", n()));
        } catch (Throwable th) {
            a(th, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(OutputStream outputStream, String str, int i5) {
        int i6 = 0;
        if (str == null) {
            a(outputStream);
            return 0;
        }
        try {
            String a5 = com.uc.crashsdk.a.b.a(str);
            if (a5 == null) {
                a5 = "file: '" + str + "' not found or decode failed!";
            }
            int length = a5.length();
            if (length <= i5 + 32) {
                i5 = length;
            }
            if (i5 > 0) {
                try {
                    outputStream.write(a5.getBytes("UTF-8"), 0, i5);
                    outputStream.write("\n".getBytes("UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    i6 = i5;
                    a(th, outputStream);
                    i5 = i6;
                    a(outputStream);
                    return i5;
                }
            }
            if (i5 < a5.length()) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(a5.length() - i5)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        a(outputStream);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i5) {
        try {
            String a5 = com.uc.crashsdk.a.g.a(new File(String.format(Locale.US, "/proc/%d/cmdline", Integer.valueOf(i5))), 128, false);
            return com.uc.crashsdk.a.g.b(a5) ? l(a5) : "unknown";
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return "unknown";
        }
    }

    private static void b(a aVar) {
        f11990h = false;
        try {
            aVar.write((s("LOG_END") + "\n").getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f11990h = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:1|(58:2|3|4|(2:332|333)|6|(2:8|9)(1:331)|10|11|12|13|(1:15)|17|(2:19|20)|25|26|27|28|29|30|(1:32)|34|(1:38)|40|41|43|44|45|46|47|(2:49|50)|(2:295|296)|52|53|54|55|56|57|59|60|61|62|63|64|(4:66|67|68|69)|73|74|75|76|77|79|80|81|82|(1:84)(2:268|(1:270))|85|86|87|88)|(4:90|91|92|93)(3:210|211|(8:218|219|220|221|222|223|224|(42:226|227|228|229|230|231|232|233|234|235|236|237|96|97|98|99|(3:101|102|103)(7:171|172|(1:174)|175|(1:177)|178|(4:180|(1:182)(1:186)|183|184))|104|105|106|107|108|(4:110|111|112|113)|117|118|119|120|121|122|(4:124|125|126|127)|131|132|133|(1:135)|136|137|(1:139)|140|141|(1:143)(1:148)|144|145)(32:257|95|96|97|98|99|(0)(0)|104|105|106|107|108|(0)|117|118|119|120|121|122|(0)|131|132|133|(0)|136|137|(0)|140|141|(0)(0)|144|145)))|94|95|96|97|98|99|(0)(0)|104|105|106|107|108|(0)|117|118|119|120|121|122|(0)|131|132|133|(0)|136|137|(0)|140|141|(0)(0)|144|145|(2:(0)|(1:155))) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04ca, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x047d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x047f, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0452, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0454, code lost:
    
        a(r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x044a, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0423, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0425, code lost:
    
        a(r0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0354, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0355, code lost:
    
        a(r0, r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x042c A[Catch: all -> 0x048b, TRY_LEAVE, TryCatch #30 {all -> 0x048b, blocks: (B:96:0x0347, B:99:0x0358, B:104:0x0413, B:108:0x0428, B:110:0x042c, B:113:0x0441, B:116:0x043e, B:163:0x044a, B:122:0x0457, B:124:0x045b, B:127:0x0470, B:130:0x046d, B:131:0x0473, B:154:0x047f, B:159:0x0454, B:167:0x0425, B:170:0x0372, B:190:0x0355, B:245:0x0344, B:107:0x041f, B:126:0x045e, B:133:0x0479, B:112:0x042f, B:118:0x0444, B:121:0x044e, B:98:0x034a), top: B:244:0x0344, inners: #4, #10, #20, #21, #27, #39, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x045b A[Catch: all -> 0x048b, TRY_LEAVE, TryCatch #30 {all -> 0x048b, blocks: (B:96:0x0347, B:99:0x0358, B:104:0x0413, B:108:0x0428, B:110:0x042c, B:113:0x0441, B:116:0x043e, B:163:0x044a, B:122:0x0457, B:124:0x045b, B:127:0x0470, B:130:0x046d, B:131:0x0473, B:154:0x047f, B:159:0x0454, B:167:0x0425, B:170:0x0372, B:190:0x0355, B:245:0x0344, B:107:0x041f, B:126:0x045e, B:133:0x0479, B:112:0x042f, B:118:0x0444, B:121:0x044e, B:98:0x034a), top: B:244:0x0344, inners: #4, #10, #20, #21, #27, #39, #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b8 A[Catch: all -> 0x04c9, TryCatch #28 {all -> 0x04c9, blocks: (B:141:0x04b4, B:143:0x04b8, B:144:0x04c3), top: B:140:0x04b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0377 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.Throwable r24, java.lang.String r25, long r26, boolean r28) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Throwable, java.lang.String, long, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(OutputStream outputStream, String str, int i5) {
        int i6;
        DataInputStream dataInputStream;
        int i7;
        DataInputStream dataInputStream2 = null;
        int i8 = 0;
        try {
            File file = new File(str);
            if (file.exists()) {
                byte[] R2 = R();
                if (R2 == null) {
                    outputStream.write("(alloc buffer failed!)\n".getBytes("UTF-8"));
                    return 0;
                }
                dataInputStream = new DataInputStream(new FileInputStream(file));
                i7 = 0;
                i6 = 0;
                boolean z4 = false;
                while (true) {
                    try {
                        int read = dataInputStream.read(R2);
                        if (read == -1) {
                            break;
                        }
                        i7 += read;
                        int i9 = i5 - i6;
                        if (read <= i9 + 32) {
                            i9 = read;
                        }
                        if (i9 > 0 && !z4) {
                            outputStream.write(R2, 0, i9);
                            i6 += i9;
                        }
                        if (!z4) {
                            z4 = i9 < read || i6 >= i5;
                        }
                    } catch (Throwable th) {
                        th = th;
                        i8 = i6;
                        dataInputStream2 = dataInputStream;
                        try {
                            a(th, outputStream);
                            com.uc.crashsdk.a.g.a(dataInputStream2);
                            i6 = i8;
                            a(outputStream);
                            return i6;
                        } finally {
                            com.uc.crashsdk.a.g.a(dataInputStream2);
                        }
                    }
                }
            } else {
                outputStream.write(("file: '" + str + "' not exists!\n").getBytes("UTF-8"));
                dataInputStream = null;
                i7 = 0;
                i6 = 0;
            }
            if (i6 > 0) {
                outputStream.write("\n".getBytes("UTF-8"));
            }
            if (i6 < i7) {
                outputStream.write(String.format(Locale.US, "(truncated %d bytes)\n", Integer.valueOf(i7 - i6)).getBytes("UTF-8"));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        a(outputStream);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(boolean z4) {
        try {
            boolean z5 = g.r() && com.uc.crashsdk.b.F() && !f11987d;
            if (!z5) {
                z5 = g.s();
            }
            if (z5) {
                if (z4) {
                    String k5 = k();
                    if (com.uc.crashsdk.a.g.a(k5)) {
                        return;
                    }
                    j();
                    a(k5, false, false);
                    return;
                }
                a(true, false);
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    private static boolean b(File file) {
        int indexOf;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(95);
        if (lastIndexOf <= 0 || (indexOf = name.indexOf(46, lastIndexOf)) <= 0) {
            return false;
        }
        String substring = name.substring(lastIndexOf + 1, indexOf);
        return LogType.JAVA_TYPE.equals(substring) || "ucebujava".equals(substring) || LogType.NATIVE_TYPE.equals(substring) || "ucebujni".equals(substring) || LogType.UNEXP_TYPE.equals(substring) || "anr".equals(substring);
    }

    private static String b(String str, boolean z4, boolean z5) {
        if (z4) {
            try {
                str = m(str);
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
        if (!z5) {
            return str;
        }
        try {
            return a(str);
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(String str, String str2, boolean z4) {
        h.a(str, str2, false, z4);
    }

    public static void b(String str) {
        synchronized (f12007y) {
            f12006x = str;
            com.uc.crashsdk.a.b.a(com.uc.crashsdk.b.i(), str + "\n");
        }
    }

    private static void b(String str, String str2) {
        try {
            com.uc.crashsdk.d.a(str, h(), str2);
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    public static void b(Context context) {
        if (g.M()) {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(Q, intentFilter, null, com.uc.crashsdk.a.f.a(1));
                R = true;
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
        }
    }

    public static void b(int i5) {
        com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(410), i5 * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        int lastIndexOf;
        int indexOf;
        int i5;
        int indexOf2;
        File file;
        byte[] e5;
        byte[] bArr;
        if (!g.x() || (lastIndexOf = str.lastIndexOf(47)) <= 0 || (indexOf = str.indexOf(95, lastIndexOf)) <= lastIndexOf || (indexOf2 = str.indexOf(95, (i5 = indexOf + 1))) <= indexOf) {
            return str;
        }
        String d5 = com.uc.crashsdk.a.g.d("CrashSDK" + str.substring(lastIndexOf + 1, indexOf) + str.substring(i5, indexOf2));
        if (d5 == null || (e5 = com.uc.crashsdk.a.g.e((file = new File(str)))) == null || e5.length <= 0) {
            return str;
        }
        try {
            bArr = com.uc.crashsdk.a.c.b(e5, d5.substring(0, 16).getBytes());
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            bArr = null;
        }
        if (bArr == null) {
            return str;
        }
        String str2 = str + ".ec";
        File file2 = new File(str2 + ".tmp");
        if (!com.uc.crashsdk.a.g.a(file2, bArr)) {
            return str;
        }
        if (!file2.renameTo(new File(str2))) {
            file2.delete();
            return str;
        }
        file.delete();
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Throwable th, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write("[DEBUG] CrashHandler occurred new exception:\n".getBytes("UTF-8"));
                th.printStackTrace(new PrintStream(outputStream));
                outputStream.write("\n\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
        }
        com.uc.crashsdk.a.g.a(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0356 A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ac A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210 A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0226 A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02fc A[Catch: all -> 0x0440, TryCatch #1 {all -> 0x0440, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001f, B:16:0x0034, B:18:0x003a, B:19:0x004d, B:21:0x005d, B:23:0x0065, B:28:0x03cb, B:29:0x006d, B:31:0x007d, B:33:0x008f, B:34:0x00b0, B:36:0x00c0, B:40:0x00cd, B:45:0x00f9, B:50:0x00eb, B:66:0x01c6, B:68:0x01da, B:70:0x01de, B:71:0x01e0, B:73:0x01e5, B:74:0x01e7, B:75:0x01ec, B:79:0x0210, B:81:0x0226, B:83:0x022c, B:85:0x0235, B:86:0x0242, B:88:0x0261, B:89:0x0274, B:91:0x0286, B:93:0x0296, B:94:0x02a7, B:95:0x02eb, B:99:0x02fc, B:103:0x030a, B:107:0x031b, B:109:0x0329, B:111:0x0336, B:113:0x033d, B:116:0x034a, B:118:0x0356, B:120:0x036f, B:121:0x0374, B:123:0x0383, B:124:0x0390, B:130:0x03b9, B:132:0x03df, B:134:0x03e6, B:136:0x03ed, B:138:0x03f4, B:140:0x03fb, B:142:0x0402, B:147:0x0414, B:149:0x041b, B:151:0x0422, B:153:0x0429, B:154:0x040d, B:155:0x038a, B:156:0x03ac, B:158:0x03b1, B:161:0x02af, B:163:0x02b5, B:166:0x02bd, B:168:0x02c1, B:170:0x02d5, B:172:0x02d9, B:175:0x01f7, B:177:0x0205, B:179:0x020b, B:182:0x01c3, B:189:0x0431), top: B:4:0x000a, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, boolean, boolean):void");
    }

    public static boolean a(boolean z4, boolean z5) {
        if (!f11987d) {
            if (com.uc.crashsdk.b.f11952d) {
                JNIBridge.set(1, true);
            }
            f11987d = true;
        }
        try {
            String k5 = k();
            if (com.uc.crashsdk.a.g.a(k5)) {
                com.uc.crashsdk.a.a.a("crashsdk", "CrashHandler url is empty!");
                return false;
            }
            if (com.uc.crashsdk.a.f.a(z4 ? 1 : 0, new com.uc.crashsdk.a.e(406, new Object[]{k5, Boolean.valueOf(z5), Boolean.valueOf(z4)})) && z4) {
                f11997o.close();
                if (!r6.block(a1.b.f90a)) {
                    com.uc.crashsdk.a.a.a("crashsdk", "timeout to wait for uploading");
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        boolean z4;
        FileChannel fileChannel;
        Exception e5;
        synchronized (f11998p) {
            File file = new File(str);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e6) {
                    com.uc.crashsdk.a.g.a(e6);
                }
            }
            ?? r5 = 0;
            r5 = null;
            FileLock lock = null;
            z4 = false;
            try {
                try {
                    try {
                        fileChannel = new RandomAccessFile(file, "rw").getChannel();
                    } catch (Throwable th) {
                        th = th;
                        r5 = file;
                        com.uc.crashsdk.a.g.a((Closeable) r5);
                        throw th;
                    }
                } catch (Exception e7) {
                    try {
                        com.uc.crashsdk.a.g.a(e7);
                        fileChannel = null;
                    } catch (Exception e8) {
                        fileChannel = null;
                        e5 = e8;
                        com.uc.crashsdk.a.g.a(e5);
                        com.uc.crashsdk.a.g.a(fileChannel);
                        return z4;
                    }
                }
                if (fileChannel != null) {
                    try {
                        lock = fileChannel.lock();
                    } catch (Exception e9) {
                        try {
                            com.uc.crashsdk.a.g.a(e9);
                        } catch (Exception e10) {
                            e5 = e10;
                            com.uc.crashsdk.a.g.a(e5);
                            com.uc.crashsdk.a.g.a(fileChannel);
                            return z4;
                        }
                    }
                }
                try {
                    z4 = eVar.a();
                    com.uc.crashsdk.a.g.a(fileChannel);
                } finally {
                    if (lock != null) {
                        try {
                            lock.release();
                        } catch (Exception e11) {
                            com.uc.crashsdk.a.g.a(e11);
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z4;
    }

    private static boolean a(String str, d dVar) {
        String a5 = com.uc.crashsdk.a.g.a(new File(str), 64, false);
        if (a5 == null) {
            return false;
        }
        try {
            Matcher matcher = Pattern.compile("(\\d+)\\s+(\\d+)\\s+(\\d+)\\s+(\\d+)").matcher(a5);
            if (matcher.find()) {
                long parseLong = Long.parseLong(matcher.group(1));
                if (System.currentTimeMillis() - parseLong < 86400000) {
                    dVar.f12016b = Long.parseLong(matcher.group(2));
                    dVar.f12017c = Integer.parseInt(matcher.group(3));
                    dVar.f12018d = Integer.parseInt(matcher.group(4));
                    dVar.f12015a = parseLong;
                }
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static boolean a(StringBuffer stringBuffer, String str, long j5, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, String str2) {
        long j6;
        boolean z4;
        boolean a5;
        if (f11986c.get()) {
            com.uc.crashsdk.a.a.b("Processing java crash, skip generate custom log: " + str);
            return false;
        }
        boolean z5 = ag || com.uc.crashsdk.b.L();
        if (!z5 && !com.uc.crashsdk.a.d.e()) {
            com.uc.crashsdk.a.a.c("DEBUG", com.uc.crashsdk.a.d.b());
            return false;
        }
        if (!d(str)) {
            com.uc.crashsdk.a.a.d("DEBUG", "custom log sample miss: " + str);
            return false;
        }
        if (aa()) {
            com.uc.crashsdk.a.a.b("Processing native crash, skip generate custom log: " + str);
            return false;
        }
        if (stringBuffer == null || str == null) {
            return false;
        }
        String str3 = g.X() + k(str);
        ?? r11 = (j5 & 32) != 0 ? 1 : 0;
        if (z5) {
            long nativeClientCreateConnection = com.uc.crashsdk.b.f11952d ? JNIBridge.nativeClientCreateConnection(str3, "custom", str, r11) : 0L;
            if (nativeClientCreateConnection == 0) {
                com.uc.crashsdk.a.a.d("DEBUG", "skip custom log: " + str);
                return false;
            }
            j6 = nativeClientCreateConnection;
        } else {
            if (a(h(), str, (boolean) r11)) {
                return false;
            }
            g.a();
            a(false);
            j6 = 0;
        }
        synchronized (f11999q) {
            z4 = r11;
            a5 = a(str3, j6, stringBuffer, str, j5, arrayList, arrayList2, arrayList3, str2);
        }
        if (a5 && !z5) {
            b(h(), str, z4);
        }
        if (j6 != 0) {
            JNIBridge.nativeClientCloseConnection(j6);
        }
        if (!a5) {
            return false;
        }
        if (!z5) {
            r(str3);
        }
        if (!z5) {
            str3 = a(m(str3));
        }
        b(str3, str);
        if (!z4 || z5) {
            return true;
        }
        try {
            a(true, false);
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2, boolean z4) {
        if (!o(str2)) {
            return false;
        }
        h.a(str, str2, true, z4);
        com.uc.crashsdk.a.a.b(String.format(Locale.US, "Custom log '%s' has reach max count!", str2));
        return true;
    }

    private static void a(a aVar, String str, long j5) {
        String nativeDumpThreads;
        String str2 = null;
        if (com.uc.crashsdk.b.f11952d) {
            try {
                aVar.flush();
            } catch (Throwable th) {
                com.uc.crashsdk.a.g.a(th);
            }
            nativeDumpThreads = JNIBridge.nativeDumpThreads(str, j5);
            if (ag || nativeDumpThreads == null || nativeDumpThreads.length() >= 512 || !nativeDumpThreads.startsWith("/") || nativeDumpThreads.indexOf(10) >= 0) {
                str2 = nativeDumpThreads;
            } else {
                if (!new File(nativeDumpThreads).exists()) {
                    str2 = "Can not found " + nativeDumpThreads;
                }
                String str3 = str2;
                str2 = nativeDumpThreads;
                nativeDumpThreads = str3;
            }
        } else {
            nativeDumpThreads = "Native not initialized, skip dump!";
        }
        if (nativeDumpThreads != null) {
            try {
                aVar.write(nativeDumpThreads.getBytes("UTF-8"));
                aVar.write("\n".getBytes("UTF-8"));
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            a((OutputStream) aVar);
        } else if (str2 != null && !ag) {
            b(aVar, str2, 1048576);
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
        try {
            aVar.flush();
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r17, long r18, java.lang.StringBuffer r20, java.lang.String r21, long r22, java.util.ArrayList<java.lang.String> r24, java.util.ArrayList<java.lang.String> r25, java.util.ArrayList<java.lang.String> r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.String, long, java.lang.StringBuffer, java.lang.String, long, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    private static String a(Date date) {
        return String.format(Locale.US, "%d%02d%02d%02d%02d%02d", Integer.valueOf(date.getYear() + 1900), Integer.valueOf(date.getMonth() + 1), Integer.valueOf(date.getDate()), Integer.valueOf(date.getHours()), Integer.valueOf(date.getMinutes()), Integer.valueOf(date.getSeconds()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2, int i5, boolean z4, boolean z5) {
        f11990h = false;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i5);
            objArr[3] = Integer.valueOf(z4 ? 1 : 0);
            objArr[4] = Integer.valueOf(z5 ? 1 : 0);
            outputStream.write(String.format(locale, "$^%s`%s`%d`%d,%d^$", objArr).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f11990h = true;
        a(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str, String str2) {
        f11990h = false;
        try {
            outputStream.write(String.format(Locale.US, "$^%s`%s^$", str, str2).getBytes("UTF-8"));
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        f11990h = true;
    }

    public static void a(Context context) {
        try {
            if (V()) {
                context.registerReceiver(new c((byte) 0), new IntentFilter("android.intent.action.ANR"), null, com.uc.crashsdk.a.f.a(3));
            }
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(1:205)|(3:237|238|(15:241|242|243|(1:210)|211|212|213|214|(1:216)|217|(1:221)|222|(1:225)|227|(2:229|230)(1:231)))|207|(1:210)|211|212|213|214|(0)|217|(2:219|221)|222|(1:225)|227|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:330|(3:362|363|(15:366|367|368|(1:335)|336|337|338|339|(1:341)|342|(1:346)|347|(1:350)|352|(2:354|355)(1:356)))|332|(1:335)|336|337|338|339|(0)|342|(2:344|346)|347|(1:350)|352|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:378|(3:410|411|(15:414|415|416|(1:383)|384|385|386|387|(1:389)|390|(1:394)|395|(1:398)|400|(2:402|403)(1:404)))|380|(1:383)|384|385|386|387|(0)|390|(2:392|394)|395|(1:398)|400|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:77|(3:109|110|(15:113|114|115|(1:82)|83|84|85|86|(1:88)|89|(1:93)|94|(1:97)|99|(2:101|102)(1:103)))|79|(1:82)|83|84|85|86|(0)|89|(2:91|93)|94|(1:97)|99|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:151|(1:155)|(3:187|188|(15:191|192|193|(1:160)|161|162|164|165|(1:167)|168|(1:172)|173|(1:176)|178|(2:180|181)(1:182)))|157|(1:160)|161|162|164|165|(0)|168|(2:170|172)|173|(1:176)|178|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:491|492|(2:494|(1:496))|(3:528|529|(16:532|533|534|535|(1:501)|502|503|504|505|(0)|508|(2:510|512)|513|(1:516)|518|(0)(0)))|498|(0)|502|503|504|505|(0)|508|(0)|513|(0)|518|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:11|(6:14|15|16|17|(1:19)(1:67)|12)|72|20|(3:53|54|(15:57|58|59|(1:25)|26|27|28|29|(1:31)|32|(1:36)|37|(1:40)|42|(2:44|45)(1:47)))|22|(1:25)|26|27|28|29|(0)|32|(2:34|36)|37|(1:40)|42|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:435|436|(1:438)|440|(1:444)|(3:476|477|(16:480|481|482|483|(1:449)|450|451|452|453|(1:455)|456|(1:460)|461|(1:464)|466|(2:468|469)(1:470)))|446|(1:449)|450|451|452|453|(0)|456|(2:458|460)|461|(1:464)|466|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(35:123|(1:125)|126|(1:128)|129|130|131|132|133|134|135|(1:546)|139|140|141|142|(9:319|320|321|322|(1:324)(1:428)|325|327|328|(15:330|(3:362|363|(15:366|367|368|(1:335)|336|337|338|339|(1:341)|342|(1:346)|347|(1:350)|352|(2:354|355)(1:356)))|332|(1:335)|336|337|338|339|(0)|342|(2:344|346)|347|(1:350)|352|(0)(0))(2:376|(15:378|(3:410|411|(15:414|415|416|(1:383)|384|385|386|387|(1:389)|390|(1:394)|395|(1:398)|400|(2:402|403)(1:404)))|380|(1:383)|384|385|386|387|(0)|390|(2:392|394)|395|(1:398)|400|(0)(0))(1:424)))(5:(1:145)|146|(1:148)(1:318)|149|(16:151|(1:155)|(3:187|188|(15:191|192|193|(1:160)|161|162|164|165|(1:167)|168|(1:172)|173|(1:176)|178|(2:180|181)(1:182)))|157|(1:160)|161|162|164|165|(0)|168|(2:170|172)|173|(1:176)|178|(0)(0))(1:(15:(1:205)|(3:237|238|(15:241|242|243|(1:210)|211|212|213|214|(1:216)|217|(1:221)|222|(1:225)|227|(2:229|230)(1:231)))|207|(1:210)|211|212|213|214|(0)|217|(2:219|221)|222|(1:225)|227|(0)(0))))|251|(6:256|(1:258)|259|260|261|262)|267|(1:271)|(3:303|304|(16:307|308|309|310|(1:276)|277|278|279|280|(1:282)|283|(1:287)|288|(1:291)|293|(2:295|296)(1:297)))|273|(1:276)|277|278|279|280|(0)|283|(2:285|287)|288|(1:291)|293|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0132, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0133, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00fb, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0399, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039a, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0362, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0414, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0415, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03dd, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0511, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0512, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04da, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0280, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0281, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0248, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0249, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x02fb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02fc, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x02c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02c4, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x05c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x05c3, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x058a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x058b, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        com.uc.crashsdk.a.g.a(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0382 A[Catch: all -> 0x0399, TryCatch #44 {all -> 0x0399, blocks: (B:165:0x0366, B:168:0x0371, B:170:0x0382, B:172:0x0386, B:173:0x0389, B:176:0x0391), top: B:164:0x0366 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03fd A[Catch: all -> 0x0414, TryCatch #42 {all -> 0x0414, blocks: (B:214:0x03e1, B:217:0x03ec, B:219:0x03fd, B:221:0x0401, B:222:0x0404, B:225:0x040c), top: B:213:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x040a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0458 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:251:0x0428, B:254:0x043a, B:256:0x0440, B:258:0x0458, B:259:0x045b, B:262:0x0489, B:266:0x0486, B:151:0x032c, B:261:0x0480), top: B:142:0x01f1, inners: #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04fa A[Catch: all -> 0x0511, TryCatch #41 {all -> 0x0511, blocks: (B:280:0x04de, B:283:0x04e9, B:285:0x04fa, B:287:0x04fe, B:288:0x0501, B:291:0x0509), top: B:279:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0269 A[Catch: all -> 0x0280, TryCatch #21 {all -> 0x0280, blocks: (B:339:0x024d, B:342:0x0258, B:344:0x0269, B:346:0x026d, B:347:0x0270, B:350:0x0278), top: B:338:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x00b1, TryCatch #10 {all -> 0x00b1, blocks: (B:29:0x007e, B:32:0x0089, B:34:0x009a, B:36:0x009e, B:37:0x00a1, B:40:0x00a9), top: B:28:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02e4 A[Catch: all -> 0x02fb, TryCatch #20 {all -> 0x02fb, blocks: (B:387:0x02c8, B:390:0x02d3, B:392:0x02e4, B:394:0x02e8, B:395:0x02eb, B:398:0x02f3), top: B:386:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:404:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0581 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x05ab A[Catch: all -> 0x05c2, TryCatch #23 {all -> 0x05c2, blocks: (B:453:0x058f, B:456:0x059a, B:458:0x05ab, B:460:0x05af, B:461:0x05b2, B:464:0x05ba), top: B:452:0x058f }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:470:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0602 A[ADDED_TO_REGION, DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x061a A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x062c A[Catch: all -> 0x0643, DONT_GENERATE, FINALLY_INSNS, TryCatch #25 {all -> 0x0643, blocks: (B:505:0x0610, B:508:0x061b, B:510:0x062c, B:512:0x0630, B:513:0x0633, B:516:0x063b), top: B:504:0x0610 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0639 A[ADDED_TO_REGION, DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0650 A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:522:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b A[Catch: all -> 0x0132, TryCatch #11 {all -> 0x0132, blocks: (B:86:0x00ff, B:89:0x010a, B:91:0x011b, B:93:0x011f, B:94:0x0122, B:97:0x012a), top: B:85:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [long] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Thread r20, java.lang.Throwable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.e.a(java.lang.Thread, java.lang.Throwable, boolean):void");
    }

    private static void a(Throwable th) {
        try {
            com.uc.crashsdk.a.a.d("DEBUG", a(th.getStackTrace(), (String) null).toString());
        } catch (Throwable unused) {
        }
    }

    private static void a(Calendar calendar) {
        if (g.S()) {
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            long j5 = timeInMillis2 - timeInMillis;
            long j6 = OpenStreetMapTileProviderConstants.ONE_HOUR;
            if (j5 <= OpenStreetMapTileProviderConstants.ONE_HOUR) {
                j6 = 1000 + j5;
            }
            com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(415, new Object[]{Long.valueOf(timeInMillis2)}), j6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StringBuilder a(StackTraceElement[] stackTraceElementArr, String str) {
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            boolean z4 = str == null;
            int i6 = 0;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                i6++;
                sb.append("  at ");
                sb.append(stackTraceElement.toString());
                sb.append("\n");
                if (!z4 && stackTraceElement.getMethodName().contains(str)) {
                    sb.delete(0, sb.length());
                    i6 = 0;
                    z4 = true;
                }
            }
            i5 = i6;
        }
        if (i5 == 0) {
            sb.append("  (no java stack)\n");
        }
        return sb;
    }

    public static boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        if (af) {
            com.uc.crashsdk.a.a.d("crashsdk", "Can not call setHostFd and getHostFd in the same process!");
            return false;
        }
        if (!com.uc.crashsdk.b.f11952d) {
            com.uc.crashsdk.a.a.d("crashsdk", "Crash so is not loaded!");
            return false;
        }
        if (ae != null) {
            com.uc.crashsdk.a.a.c("crashsdk", "Has already set host fd!");
        }
        ae = parcelFileDescriptor;
        int fd = parcelFileDescriptor.getFd();
        int nativeCmd = (int) JNIBridge.nativeCmd(13, fd, null, null);
        ag = nativeCmd != -1;
        return fd == -1 || nativeCmd != -1;
    }
}

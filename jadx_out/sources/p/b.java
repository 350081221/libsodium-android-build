package p;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.tendcloud.tenddata.k;
import com.umeng.analytics.pro.bi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f22250b = new b();

    /* renamed from: a, reason: collision with root package name */
    public f f22251a;

    public static String A() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String B(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String C() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String D(Context context) {
        long j5;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long j6 = 0;
            for (int i5 = 0; i5 < 5; i5++) {
                try {
                    j5 = new File(strArr[i5]).lastModified();
                } catch (Throwable unused) {
                    j5 = -1;
                }
                j6 = Math.max(j5, j6);
            }
            return "1:" + j6;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String E() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i5 = 0; i5 < 7; i5++) {
                sb.append(new File(strArr[i5]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String F(android.content.Context r3) {
        /*
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            android.content.Intent r3 = r3.registerReceiver(r1, r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "status"
            int r3 = r3.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L3f
            r1 = 2
            if (r3 == r1) goto L22
            r1 = 5
            if (r3 != r1) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L2d
            java.lang.String r3 = "1"
            goto L2f
        L2d:
            java.lang.String r3 = "0"
        L2f:
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch: java.lang.Throwable -> L3f
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            return r3
        L3f:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.F(android.content.Context):java.lang.String");
    }

    public static String G() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder();
        sb.append("00");
        sb.append(":");
        for (int i5 = 0; i5 <= 0; i5++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String H(Context context) {
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0) {
                return null;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String I() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb.append("00:");
        for (String str : linkedHashMap.keySet()) {
            char c5 = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c5 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb.append(c5);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    public static String J() {
        StringBuilder sb = new StringBuilder();
        sb.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", com.umeng.ccg.a.f12839r);
        linkedHashMap.put("MODEL", com.umeng.ccg.a.f12839r);
        for (String str : linkedHashMap.keySet()) {
            char c5 = '0';
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                if (lowerCase != null && lowerCase.contains(str3)) {
                    c5 = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c5);
        }
        return sb.toString();
    }

    public static String K() {
        StringBuilder sb = new StringBuilder();
        sb.append("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", com.umeng.ccg.a.f12839r);
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", com.umeng.ccg.a.f12839r);
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String e5 = f1.a.e(str, "");
            sb.append((e5 == null || !e5.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    public static String L() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader(k.f11748a);
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    try {
                        fileReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (f1.a.c(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        r1 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0047, code lost:
    
        if (r0 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String M() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L41
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L41
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e
        L11:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3a
            boolean r4 = f1.a.c(r2)     // Catch: java.lang.Throwable -> L3f
            if (r4 != 0) goto L11
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L11
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            if (r4 <= r5) goto L11
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L11
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3f
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L49
        L3e:
            r0 = r2
        L3f:
            r2 = r3
            goto L42
        L41:
            r0 = r2
        L42:
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.lang.Throwable -> L47
        L47:
            if (r0 == 0) goto L4c
        L49:
            r0.close()     // Catch: java.lang.Throwable -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.M():java.lang.String");
    }

    private String N() {
        String a5 = d.a("ip");
        if (a5 != null) {
            return a5;
        }
        if (this.f22251a.isBackgroundRunning()) {
            return "";
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements() && a5 == null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            a5 = nextElement.getHostAddress().toString();
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String str = a5 != null ? a5 : "";
        d.b("ip", str);
        return str;
    }

    public static b c(f fVar) {
        b bVar = f22250b;
        bVar.f22251a = fVar;
        return bVar;
    }

    public static boolean d(Context context, String str) {
        return !(context.getPackageManager().checkPermission(str, context.getPackageName()) == 0);
    }

    public static String e() {
        long j5;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j5 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j5 = 0;
        }
        return String.valueOf(j5);
    }

    public static String g() {
        long j5;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j5 = statFs.getBlockSize() * statFs.getAvailableBlocks();
        } catch (Throwable unused) {
            j5 = 0;
        }
        return String.valueOf(j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i() {
        /*
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4f
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
            r1 = 1
            r5 = r1
        L1b:
            r6 = 100
            if (r5 >= r6) goto L46
            java.lang.String r6 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L46
            java.lang.String r7 = "Serial"
            int r7 = r6.indexOf(r7)     // Catch: java.lang.Throwable -> L44
            if (r7 < 0) goto L41
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch: java.lang.Throwable -> L44
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r6.substring(r5, r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L44
            goto L46
        L41:
            int r5 = r5 + 1
            goto L1b
        L44:
            r1 = r4
            goto L51
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L49
        L49:
            r3.close()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        L4d:
            r3 = r1
            goto L51
        L4f:
            r2 = r1
            r3 = r2
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L56
        L56:
            if (r3 == 0) goto L5b
            r3.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            if (r2 == 0) goto L60
        L5d:
            r2.close()     // Catch: java.lang.Throwable -> L60
        L60:
            if (r0 != 0) goto L64
            java.lang.String r0 = ""
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.i():java.lang.String");
    }

    public static String k() {
        String L = L();
        return !f1.a.c(L) ? L : M();
    }

    public static String m() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
            try {
                String[] split = bufferedReader.readLine().split(":\\s+", 2);
                if (split != null && split.length > 1) {
                    String str = split[1];
                    try {
                        fileReader2.close();
                    } catch (Throwable unused2) {
                    }
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                    return str;
                }
                try {
                    fileReader2.close();
                } catch (Throwable unused4) {
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (Throwable unused5) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
                fileReader = fileReader2;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Throwable unused7) {
                    }
                }
                if (bufferedReader == null) {
                    return "";
                }
                bufferedReader.close();
                return "";
            }
        } catch (Throwable unused8) {
            bufferedReader = null;
        }
    }

    public static String n(Context context) {
        int i5 = 0;
        try {
            i5 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i5 == 1 ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String o() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L25
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L2a
            int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L2a
            long r1 = (long) r1
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L34
            goto L34
        L29:
            r0 = r3
        L2a:
            r3 = r4
            goto L2d
        L2c:
            r0 = r3
        L2d:
            if (r3 == 0) goto L32
            r3.close()     // Catch: java.lang.Throwable -> L32
        L32:
            if (r0 == 0) goto L37
        L34:
            r0.close()     // Catch: java.lang.Throwable -> L37
        L37:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.o():java.lang.String");
    }

    public static String p(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i5 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i5));
            jSONObject.put(NotificationCompat.CATEGORY_CALL, String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put(NotificationCompat.CATEGORY_ALARM, String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String q() {
        long j5;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j5 = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j5 = 0;
        }
        return String.valueOf(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String r(android.content.Context r3) {
        /*
            if (r3 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            r0 = -1
            java.util.List r3 = r3.getSensorList(r0)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4d
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = f1.a.i(r3)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L52
            java.lang.String r3 = ""
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.r(android.content.Context):java.lang.String");
    }

    public static String s() {
        long j5;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j5 = statFs.getBlockSize() * statFs.getBlockCount();
        } catch (Throwable unused) {
            j5 = 0;
        }
        return String.valueOf(j5);
    }

    public static String t(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(bi.ac);
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String u() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String v(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + org.slf4j.d.ANY_MARKER + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String w() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String x(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String y() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String z(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String a() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String b(Context context) {
        String subscriberId = this.f22251a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String a5 = d.a("imsi");
        if (a5 != null) {
            return a5;
        }
        if (this.f22251a.isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (a5 == null) {
            a5 = "";
        }
        d.b("imsi", a5);
        return a5;
    }

    public final synchronized String f(Context context) {
        String a5 = d.a("NetworkOperatorName");
        if (a5 != null) {
            return a5;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (telephonyManager != null) {
                    a5 = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (a5 == null || "null".equals(a5)) {
            a5 = "";
        }
        d.b("NetworkOperatorName", a5);
        return a5;
    }

    public final synchronized String h(Context context) {
        String a5 = d.a("SimSerial");
        if (a5 != null) {
            return a5;
        }
        if (this.f22251a.isBackgroundRunning()) {
            return "";
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        d.b("SimSerial", a5);
        return a5;
    }

    public final synchronized String j(Context context) {
        String androidId = this.f22251a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String a5 = d.a("ANDROIDID");
        if (a5 != null) {
            return a5;
        }
        if (this.f22251a.isBackgroundRunning()) {
            return "";
        }
        try {
            a5 = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
        }
        if (a5 == null) {
            a5 = "";
        }
        d.b("ANDROIDID", a5);
        return a5;
    }

    public final String l(Context context) {
        try {
            String H = H(context);
            String N = N();
            if (f1.a.f(H) && f1.a.f(N)) {
                return H + ":" + N();
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}

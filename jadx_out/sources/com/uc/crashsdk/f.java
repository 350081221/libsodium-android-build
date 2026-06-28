package com.uc.crashsdk;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.framework.common.ContainerUtils;
import com.uc.crashsdk.a.h;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f12026a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12027b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray<String> f12028c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f12029d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static boolean f12030e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i5) {
        a(i5, 1);
    }

    private static boolean b(int i5, int i6) {
        try {
            b.x();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        try {
            String c5 = c(i5);
            if (c5 == null) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stat type not exists: " + i5, null);
                return false;
            }
            File file = new File(b.c());
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            StringBuffer a5 = a(file);
            if (com.uc.crashsdk.a.g.a(a5)) {
                if (a5 == null) {
                    a5 = new StringBuffer();
                }
                a5.append("[");
                a5.append(e.h());
                a5.append("]\n");
            }
            a(a5, c5, a(a5, c5) + i6);
            return a(file, a5);
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
            return false;
        }
    }

    private static boolean c(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(755, new Object[]{str}));
        }
        return false;
    }

    private static boolean d(String str) {
        if (!f12026a && str == null) {
            throw new AssertionError();
        }
        File file = new File(str);
        StringBuffer a5 = a(file);
        if (com.uc.crashsdk.a.g.a(a5)) {
            return false;
        }
        String a6 = a(a5);
        StringBuffer stringBuffer = null;
        if (a6 != null && a6.length() > 0) {
            SparseArray<String> e5 = e();
            boolean O = g.O();
            if (O) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("notifyStatsDetailImpl: processName: ");
                stringBuffer.append(a6 + "\n");
            }
            boolean z4 = false;
            for (int i5 = 0; i5 < e5.size(); i5++) {
                try {
                    int keyAt = e5.keyAt(i5);
                    String str2 = e5.get(keyAt);
                    int a7 = a(a5, str2);
                    if (a7 > 0) {
                        if (O) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(a7);
                            stringBuffer.append("\n");
                        }
                        d.a(a6, keyAt, a7);
                        a(a5, str2, 0);
                        z4 = true;
                    }
                } finally {
                    if (z4) {
                        a(file, a5);
                    }
                }
            }
            if (O) {
                com.uc.crashsdk.a.a.a(stringBuffer.toString());
            }
            if (z4) {
                d.a(a6, 1000000, 0);
            }
            return z4;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "notifyStatsDetailImpl: process name is invalid", null);
        return false;
    }

    private static boolean e(String str) {
        if (!com.uc.crashsdk.a.g.a(str) && new File(str).exists()) {
            return a(str, new com.uc.crashsdk.a.e(756, new Object[]{str}));
        }
        return false;
    }

    private static void f() {
        SparseArray<String> sparseArray = f12028c;
        synchronized (sparseArray) {
            if (sparseArray.size() != 0) {
                return;
            }
            sparseArray.put(100, "start_pv");
            sparseArray.put(102, "start_hpv");
            sparseArray.put(1, "all_all");
            sparseArray.put(2, "all_fg");
            sparseArray.put(101, "all_bg");
            sparseArray.put(3, "java_fg");
            sparseArray.put(4, "java_bg");
            sparseArray.put(7, "native_fg");
            sparseArray.put(8, "native_bg");
            sparseArray.put(27, "native_anr_fg");
            sparseArray.put(28, "native_anr_bg");
            sparseArray.put(9, "native_ok");
            sparseArray.put(10, "unexp_anr");
            sparseArray.put(29, "unexp_lowmem");
            sparseArray.put(30, "unexp_killed");
            sparseArray.put(31, "unexp_exit");
            sparseArray.put(32, "unexp_restart");
            sparseArray.put(11, "unexp_fg");
            sparseArray.put(12, "unexp_bg");
            sparseArray.put(40, "anr_fg");
            sparseArray.put(41, "anr_bg");
            sparseArray.put(42, "anr_cr_fg");
            sparseArray.put(43, "anr_cr_bg");
            sparseArray.put(13, "log_up_succ");
            sparseArray.put(14, "log_up_fail");
            sparseArray.put(15, "log_empty");
            sparseArray.put(200, "log_tmp");
            sparseArray.put(16, "log_abd_all");
            sparseArray.put(22, "log_abd_builtin");
            sparseArray.put(23, "log_abd_custom");
            sparseArray.put(17, "log_large");
            sparseArray.put(18, "log_up_all");
            sparseArray.put(19, "log_up_bytes");
            sparseArray.put(20, "log_up_crash");
            sparseArray.put(21, "log_up_custom");
            sparseArray.put(24, "log_zipped");
            sparseArray.put(201, "log_enced");
            sparseArray.put(25, "log_renamed");
            sparseArray.put(26, "log_safe_skip");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i5, int i6) {
        if (i6 == 0) {
            com.uc.crashsdk.a.a.b("Add stat for type " + i5 + " with count 0!");
            return;
        }
        a(b.c(), new com.uc.crashsdk.a.e(751, new Object[]{Integer.valueOf(i5), Integer.valueOf(i6)}));
    }

    private static String c(int i5) {
        String str;
        f();
        SparseArray<String> sparseArray = f12028c;
        synchronized (sparseArray) {
            str = sparseArray.get(i5);
        }
        return str;
    }

    private static SparseArray<String> e() {
        SparseArray<String> clone;
        f();
        SparseArray<String> sparseArray = f12028c;
        synchronized (sparseArray) {
            clone = sparseArray.clone();
        }
        return clone;
    }

    private static StringBuffer a(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (!file.exists()) {
            return null;
        }
        char[] d5 = d();
        if (d5 == null) {
            com.uc.crashsdk.a.a.a("crashsdk", "readCrashStatData alloc buffer failed!", null);
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                fileReader = new FileReader(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            int read = fileReader.read(d5);
            if (read > 0) {
                fileReader2 = null;
                stringBuffer.append(d5, 0, read);
            }
            com.uc.crashsdk.a.g.a(fileReader);
        } catch (Exception e6) {
            e = e6;
            fileReader2 = fileReader;
            com.uc.crashsdk.a.g.a(e);
            com.uc.crashsdk.a.g.a(fileReader2);
            return stringBuffer;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            com.uc.crashsdk.a.g.a(fileReader2);
            throw th;
        }
        return stringBuffer;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(boolean z4) {
        if (g.Q() && !b.L()) {
            e.j();
            if (!h.e()) {
                h.a(z4);
            }
            if (b.F()) {
                d(z4);
                a(b.c(), z4);
                h.b(z4);
            }
        }
    }

    private static String a(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return null;
        }
        int indexOf = stringBuffer.indexOf("[");
        if (indexOf < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name start!", null);
            return null;
        }
        int i5 = indexOf + 1;
        int indexOf2 = stringBuffer.indexOf("]", i5);
        if (indexOf2 < 0) {
            com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: Can not found process name end!", null);
            return null;
        }
        String substring = stringBuffer.substring(i5, indexOf2);
        if (substring.length() > 0) {
            return substring;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "getProcessName: process name is empty", null);
        return null;
    }

    private static boolean b(String str) {
        File file = new File(str);
        StringBuffer a5 = a(file);
        if (com.uc.crashsdk.a.g.a(a5)) {
            return false;
        }
        String a6 = a(a5);
        StringBuffer stringBuffer = null;
        if (a6 != null && a6.length() > 0) {
            SparseArray<String> e5 = e();
            HashMap hashMap = new HashMap();
            boolean O = g.O();
            if (O) {
                stringBuffer = new StringBuffer();
                stringBuffer.append("reportCrashStatImpl: processName: ");
                stringBuffer.append(a6 + "\n");
            }
            boolean z4 = false;
            for (int i5 = 0; i5 < e5.size(); i5++) {
                try {
                    int keyAt = e5.keyAt(i5);
                    String str2 = e5.get(keyAt);
                    int a7 = a(a5, str2);
                    if (a7 > 0) {
                        if (O) {
                            stringBuffer.append("name: ");
                            stringBuffer.append(str2);
                            stringBuffer.append(", key: ");
                            stringBuffer.append(keyAt);
                            stringBuffer.append(", count: ");
                            stringBuffer.append(a7);
                            stringBuffer.append("\n");
                        }
                        h.a(a6, keyAt, a7);
                        hashMap.put(str2, Integer.valueOf(a7));
                        a(a5, str2, 0);
                        z4 = true;
                    }
                } finally {
                    if (z4) {
                        a(file, a5);
                        if (hashMap.size() > 0) {
                            a(a6, (HashMap<String, Integer>) hashMap, b.a(str));
                        }
                    }
                }
            }
            if (O) {
                com.uc.crashsdk.a.a.a(stringBuffer.toString());
            }
            return true;
        }
        com.uc.crashsdk.a.a.a("crashsdk", "reportCrashStatImpl: process name is invalid", null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        com.uc.crashsdk.a.f.a(1, new com.uc.crashsdk.a.e(TypedValues.TransitionType.TYPE_DURATION), a1.b.f90a);
    }

    private static int a(StringBuffer stringBuffer, String str) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            return 0;
        }
        int indexOf2 = stringBuffer.indexOf(ContainerUtils.KEY_VALUE_DELIMITER, indexOf + str.length());
        if (indexOf2 < 0) {
            com.uc.crashsdk.a.a.b(str + " line not contain '='!");
            return 0;
        }
        int i5 = indexOf2 + 1;
        int indexOf3 = stringBuffer.indexOf("\n", i5);
        if (indexOf3 < 0) {
            indexOf3 = stringBuffer.length();
        }
        try {
            int parseInt = Integer.parseInt(stringBuffer.substring(i5, indexOf3));
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException e5) {
            com.uc.crashsdk.a.g.a(e5);
            return 0;
        }
    }

    private static char[] d() {
        char[] cArr = null;
        int i5 = 1024;
        while (cArr == null && i5 > 0) {
            try {
                cArr = new char[i5];
            } catch (Throwable unused) {
                i5 /= 2;
                if (i5 < 512) {
                    break;
                }
            }
        }
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0016, B:16:0x0018, B:18:0x001f, B:20:0x0029, B:23:0x004a, B:24:0x004d, B:25:0x0054, B:27:0x0030, B:29:0x0036, B:31:0x0041), top: B:7:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(boolean r2) {
        /*
            boolean r0 = com.uc.crashsdk.f.f12030e
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.uc.crashsdk.f.f12029d
            monitor-enter(r0)
            boolean r1 = com.uc.crashsdk.f.f12030e     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        Le:
            java.lang.String r1 = "crash detail"
            boolean r2 = com.uc.crashsdk.a.h.a(r2, r1)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L18:
            boolean r2 = com.uc.crashsdk.b.s()     // Catch: java.lang.Throwable -> L56
            r1 = 1
            if (r2 == 0) goto L30
            r2 = 2
            a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.uc.crashsdk.b.r()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 42
            a(r2, r1)     // Catch: java.lang.Throwable -> L56
        L2e:
            r2 = r1
            goto L48
        L30:
            boolean r2 = com.uc.crashsdk.b.t()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L47
            r2 = 101(0x65, float:1.42E-43)
            a(r2, r1)     // Catch: java.lang.Throwable -> L56
            boolean r2 = com.uc.crashsdk.b.r()     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L2e
            r2 = 43
            a(r2, r1)     // Catch: java.lang.Throwable -> L56
            goto L2e
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4d
            a(r1, r1)     // Catch: java.lang.Throwable -> L56
        L4d:
            r2 = 100
            a(r2, r1)     // Catch: java.lang.Throwable -> L56
            com.uc.crashsdk.f.f12030e = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            return
        L56:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.f.d(boolean):void");
    }

    private static void a(StringBuffer stringBuffer, String str, int i5) {
        int indexOf = stringBuffer.indexOf(str);
        if (indexOf < 0) {
            if (i5 > 0) {
                stringBuffer.append(str);
                stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                stringBuffer.append(i5);
                stringBuffer.append("\n");
                return;
            }
            return;
        }
        int indexOf2 = stringBuffer.indexOf("\n", indexOf);
        if (indexOf2 < 0) {
            indexOf2 = stringBuffer.length();
        }
        stringBuffer.replace(indexOf, indexOf2, str + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(i5));
    }

    private static boolean a(File file, StringBuffer stringBuffer) {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            try {
                fileWriter = new FileWriter(file);
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            String stringBuffer2 = stringBuffer.toString();
            fileWriter.write(stringBuffer2, 0, stringBuffer2.length());
            com.uc.crashsdk.a.g.a(fileWriter);
            return true;
        } catch (Exception e6) {
            e = e6;
            fileWriter2 = fileWriter;
            com.uc.crashsdk.a.g.a(e);
            com.uc.crashsdk.a.g.a(fileWriter2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            com.uc.crashsdk.a.g.a(fileWriter2);
            throw th;
        }
    }

    private static void a(String str, HashMap<String, Integer> hashMap, String str2) {
        if (hashMap.size() <= 0) {
            return;
        }
        if (com.uc.crashsdk.a.g.a(str)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: processName is null", null);
        } else if (com.uc.crashsdk.a.g.a(str2)) {
            com.uc.crashsdk.a.a.a("crashsdk", "cacheReportedStatsForCallback: callbackCacheFilePathName is null", null);
        } else {
            a(str2, new com.uc.crashsdk.a.e(754, new Object[]{str, hashMap, str2}));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(boolean z4) {
        if (z4) {
            return c(b.e()) ? 1 : 0;
        }
        File[] f5 = b.f();
        if (f5 == null) {
            return 0;
        }
        int i5 = 0;
        for (File file : f5) {
            if (c(file.getAbsolutePath())) {
                i5++;
            }
        }
        return i5;
    }

    private static void b(String str, HashMap<String, Integer> hashMap, String str2) {
        try {
            b.x();
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.a(th);
        }
        try {
            File file = new File(str2);
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Throwable th2) {
                com.uc.crashsdk.a.g.a(th2);
            }
            StringBuffer a5 = a(file);
            if (com.uc.crashsdk.a.g.a(a5)) {
                if (a5 == null) {
                    a5 = new StringBuffer();
                }
                a5.append("[");
                a5.append(str);
                a5.append("]\n");
            }
            boolean z4 = false;
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                int intValue = entry.getValue().intValue();
                if (intValue > 0) {
                    String key = entry.getKey();
                    a(a5, key, intValue + a(a5, key));
                    z4 = true;
                }
            }
            if (z4) {
                a(file, a5);
            }
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
    }

    private static boolean a(String str, com.uc.crashsdk.a.e eVar) {
        return b.a(f12027b, str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, boolean z4) {
        if (h.a(z4, "crash detail report")) {
            return false;
        }
        return a(str, new com.uc.crashsdk.a.e(752, new Object[]{str}));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a() {
        File[] d5 = b.d();
        if (d5 == null) {
            return 0;
        }
        int i5 = 0;
        for (File file : d5) {
            if (a(file.getAbsolutePath(), false)) {
                i5++;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return a(str, new com.uc.crashsdk.a.e(753, new Object[]{str}));
    }

    public static boolean a(int i5, Object[] objArr) {
        switch (i5) {
            case 751:
                if (f12026a || objArr != null) {
                    return b(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
                }
                throw new AssertionError();
            case 752:
                if (f12026a || objArr != null) {
                    return b((String) objArr[0]);
                }
                throw new AssertionError();
            case 753:
                if (!f12026a && objArr == null) {
                    throw new AssertionError();
                }
                File file = new File((String) objArr[0]);
                if (!file.exists()) {
                    return false;
                }
                file.delete();
                return true;
            case 754:
                if (!f12026a && objArr == null) {
                    throw new AssertionError();
                }
                b((String) objArr[0], (HashMap) objArr[1], (String) objArr[2]);
                return true;
            case 755:
                if (f12026a || objArr != null) {
                    return d((String) objArr[0]);
                }
                throw new AssertionError();
            case 756:
                if (!f12026a && objArr == null) {
                    throw new AssertionError();
                }
                File file2 = new File((String) objArr[0]);
                if (!file2.exists()) {
                    return false;
                }
                file2.delete();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(boolean z4) {
        if (z4) {
            return e(b.e()) ? 1 : 0;
        }
        File[] f5 = b.f();
        if (f5 == null) {
            return 0;
        }
        int i5 = 0;
        for (File file : f5) {
            if (e(file.getAbsolutePath())) {
                i5++;
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b() {
        File[] d5 = b.d();
        if (d5 == null) {
            return 0;
        }
        int i5 = 0;
        for (File file : d5) {
            if (a(file.getAbsolutePath())) {
                i5++;
            }
        }
        return i5;
    }

    public static void b(int i5) {
        if (i5 != 700) {
            return;
        }
        d(false);
    }
}

package com.uc.crashsdk;

import a1.i;
import android.content.pm.PackageInfo;
import android.util.Log;
import android.util.SparseArray;
import com.uc.crashsdk.export.LogType;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f11869a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f11870b = "";

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f11872d = true;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, String> f11873e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f11874f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private static String f11875g = "";

    /* renamed from: h, reason: collision with root package name */
    private static String f11876h = null;

    /* renamed from: i, reason: collision with root package name */
    private static int f11877i = -1;

    /* renamed from: j, reason: collision with root package name */
    private static long f11878j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<String, Object[]> f11879k = new HashMap<>();

    /* renamed from: l, reason: collision with root package name */
    private static final List<String> f11880l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private static int f11881m = 0;

    /* renamed from: n, reason: collision with root package name */
    private static int f11882n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static int f11883o = 0;

    /* renamed from: p, reason: collision with root package name */
    private static int f11884p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static final HashMap<String, Object[]> f11885q = new HashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private static final List<String> f11886r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    private static int f11887s = 0;

    /* renamed from: t, reason: collision with root package name */
    private static int f11888t = 0;

    /* renamed from: u, reason: collision with root package name */
    private static int f11889u = 0;

    /* renamed from: v, reason: collision with root package name */
    private static int f11890v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static int f11891w = 0;

    /* renamed from: x, reason: collision with root package name */
    private static int f11892x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final SparseArray<Object[]> f11893y = new SparseArray<>();

    /* renamed from: z, reason: collision with root package name */
    private static final List<Integer> f11894z = new ArrayList();
    private static final HashMap<String, Object[]> A = new HashMap<>();
    private static final List<String> B = new ArrayList();
    private static int C = 0;
    private static int D = 0;
    private static int E = 0;

    /* renamed from: c, reason: collision with root package name */
    static boolean f11871c = false;
    private static Runnable F = new com.uc.crashsdk.a.e(201);
    private static boolean G = false;
    private static boolean H = false;
    private static boolean I = false;

    public static String a() {
        String str = f11876h;
        return str != null ? str : o() ? f11876h : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b() {
        return f11878j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        if (f11877i == -1) {
            o();
        }
        return f11877i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        StringBuilder sb = new StringBuilder();
        synchronized (f11873e) {
            for (String str : f11874f) {
                String str2 = f11873e.get(str);
                sb.append(str);
                sb.append(": ");
                if (str2 != null) {
                    sb.append(str2);
                }
                sb.append("\n");
            }
        }
        sb.append(String.format(Locale.US, "(saved at %s)\n", e.n()));
        com.uc.crashsdk.a.b.a(b.h(), sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e() {
        if (!f11872d && !b.f11952d) {
            throw new AssertionError();
        }
        synchronized (f11873e) {
            for (String str : f11874f) {
                JNIBridge.nativeAddHeaderInfo(str, f11873e.get(str));
            }
        }
    }

    public static byte[] f() {
        return new byte[]{24, 99, 121, 60};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g() {
        if (!f11872d && !b.f11952d) {
            throw new AssertionError();
        }
        synchronized (f11879k) {
            for (String str : f11880l) {
                Object[] objArr = f11879k.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & intValue) != 0) {
                    JNIBridge.nativeAddDumpFile(str, (String) objArr[1], ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), intValue, ((Boolean) objArr[4]).booleanValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h() {
        StringBuilder sb = new StringBuilder();
        synchronized (f11879k) {
            boolean z4 = true;
            for (String str : f11880l) {
                if (LogType.isForJava(((Integer) f11879k.get(str)[0]).intValue())) {
                    if (!z4) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z4 = false;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i() {
        if (!f11872d && !b.f11952d) {
            throw new AssertionError();
        }
        synchronized (f11885q) {
            for (String str : f11886r) {
                Object[] objArr = f11885q.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                if ((1048833 & intValue) != 0) {
                    JNIBridge.nativeAddCallbackInfo(str, intValue, ((Long) objArr[2]).longValue(), ((Integer) objArr[3]).intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j() {
        String sb;
        synchronized (f11885q) {
            StringBuilder sb2 = new StringBuilder();
            List<String> list = f11886r;
            synchronized (list) {
                boolean z4 = true;
                for (String str : list) {
                    if (LogType.isForJava(((Integer) f11885q.get(str)[0]).intValue())) {
                        if (!z4) {
                            sb2.append("`");
                        }
                        sb2.append(str);
                        z4 = false;
                    }
                }
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k() {
        if (!f11872d && !b.f11952d) {
            throw new AssertionError();
        }
        synchronized (A) {
            for (String str : B) {
                Object[] objArr = A.get(str);
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if ((1048577 & intValue2) != 0 && JNIBridge.nativeCreateCachedInfo(str, intValue, intValue2) != 0) {
                    Iterator it = list.iterator();
                    while (it.hasNext() && JNIBridge.nativeAddCachedInfo(str, (String) it.next())) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l() {
        StringBuilder sb = new StringBuilder();
        synchronized (A) {
            boolean z4 = true;
            for (String str : B) {
                if (LogType.isForJava(((Integer) A.get(str)[1]).intValue())) {
                    if (!z4) {
                        sb.append("`");
                    }
                    sb.append(str);
                    z4 = false;
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String m() {
        if (!G) {
            String a5 = com.uc.crashsdk.a.b.a(b.m());
            f11875g = a5;
            G = true;
            if (a5 == null) {
                f11875g = "";
            }
        }
        return f11875g;
    }

    public static void n() {
        p();
        if (H) {
            if (b.f11952d) {
                JNIBridge.set(128, f11875g);
            }
        } else {
            H = true;
            com.uc.crashsdk.a.f.a(0, new com.uc.crashsdk.a.e(202));
        }
    }

    private static boolean o() {
        try {
            PackageInfo packageInfo = com.uc.crashsdk.a.g.a().getPackageManager().getPackageInfo(f11869a, 0);
            f11876h = packageInfo.versionName;
            f11878j = packageInfo.lastUpdateTime;
            f11877i = packageInfo.versionCode;
            return true;
        } catch (Throwable th) {
            com.uc.crashsdk.a.g.b(th);
            return false;
        }
    }

    private static void p() {
        if (I || !e.a()) {
            return;
        }
        if (b.f11952d || !b.f11955g) {
            String format = String.format(Locale.US, "%s/%s/%s", g.T(), g.U(), g.V());
            com.uc.crashsdk.a.a.b("crashsdk", "UUID: " + e.q());
            com.uc.crashsdk.a.a.b("crashsdk", "Version: " + format);
            com.uc.crashsdk.a.a.b("crashsdk", "Process Name: " + e.h());
            I = true;
        }
    }

    private static StringBuilder b(String str, boolean z4) {
        String a5;
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr = f11885q.get(str);
            try {
                if (objArr == null) {
                    a5 = "Unknown callback: " + str;
                } else {
                    Callable callable = (Callable) objArr[1];
                    if (callable != null) {
                        a5 = (String) callable.call();
                    } else {
                        a5 = d.a(str, z4);
                    }
                }
                if (a5 != null) {
                    sb.append(a5);
                }
            } catch (Throwable th) {
                sb.append("[DEBUG] Callback occurred new exception:\n");
                sb.append(Log.getStackTraceString(th));
            }
        } catch (Throwable th2) {
            com.uc.crashsdk.a.g.a(th2);
        }
        try {
            if (sb.length() == 0) {
                sb.append("(data is null)\n");
            }
        } catch (Throwable th3) {
            com.uc.crashsdk.a.g.a(th3);
        }
        return sb;
    }

    public static void a(String str, String str2) {
        Map<String, String> map = f11873e;
        synchronized (map) {
            if (!map.containsKey(str)) {
                f11874f.add(str);
            }
            map.put(str, str2);
            if (b.f11952d) {
                JNIBridge.nativeAddHeaderInfo(str, str2);
            }
            e.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ArrayList<String> c(String str) {
        if (com.uc.crashsdk.a.g.a(str)) {
            return null;
        }
        String[] split = str.split(i.f136b, 20);
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : split) {
            if (!com.uc.crashsdk.a.g.a(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(OutputStream outputStream, String str) {
        synchronized (f11873e) {
            for (String str2 : f11874f) {
                try {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(str2);
                    sb.append(": ");
                    String str3 = f11873e.get(str2);
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    sb.append("\n");
                    outputStream.write(sb.toString().getBytes(str));
                } catch (Throwable th) {
                    e.a(th, outputStream);
                }
            }
        }
    }

    public static int b(String str, String str2) {
        int i5;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str2.length() > 2048) {
            str2 = str2.substring(0, 2048);
        }
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            if (objArr != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int intValue2 = ((Integer) objArr[1]).intValue();
                List list = (List) objArr[2];
                if (list.size() >= intValue) {
                    list.remove(0);
                }
                list.add(str2);
                r0 = LogType.isForJava(intValue2) ? LogType.addType(0, 16) : 0;
                if (!b.f11952d) {
                    if (LogType.isForNative(intValue2)) {
                        r0 = LogType.addType(r0, 1);
                    }
                    if (LogType.isForANR(intValue2)) {
                        r0 = LogType.addType(r0, 1048576);
                    }
                }
                i5 = r0;
                r0 = intValue2;
            } else {
                i5 = 0;
            }
            if (b.f11952d && JNIBridge.nativeAddCachedInfo(str, str2)) {
                if (LogType.isForNative(r0)) {
                    i5 = LogType.addType(i5, 1);
                }
                if (LogType.isForANR(r0)) {
                    i5 = LogType.addType(i5, 1048576);
                }
            }
        }
        return i5;
    }

    public static int a(String str, String str2, boolean z4, boolean z5, int i5, boolean z6) {
        int i6;
        int i7;
        boolean z7;
        if (str == null || str2 == null) {
            return 0;
        }
        if (str.length() > 256) {
            com.uc.crashsdk.a.a.a("crashsdk", "addDumpFile: description is too long!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = f11879k;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i7 = ((Integer) hashMap.get(str)[0]).intValue();
                i6 = LogType.addType(i7, i5);
            } else {
                i6 = i5;
                i7 = 0;
            }
            if (LogType.isForJava(i6) && !LogType.isForJava(i7)) {
                int i8 = f11881m;
                if (i8 >= 10) {
                    i6 = LogType.removeType(i6, 16);
                } else {
                    f11881m = i8 + 1;
                }
            }
            if (LogType.isForNative(i6) && !LogType.isForNative(i7)) {
                int i9 = f11882n;
                if (i9 >= 10) {
                    i6 = LogType.removeType(i6, 1);
                } else {
                    f11882n = i9 + 1;
                }
            }
            if (LogType.isForUnexp(i6) && !LogType.isForUnexp(i7)) {
                int i10 = f11883o;
                if (i10 >= 10) {
                    i6 = LogType.removeType(i6, 256);
                } else {
                    f11883o = i10 + 1;
                }
            }
            if (LogType.isForANR(i6) && !LogType.isForANR(i7)) {
                int i11 = f11884p;
                if (i11 >= 10) {
                    i6 = LogType.removeType(i6, 1048576);
                } else {
                    f11884p = i11 + 1;
                }
            }
            if ((1048849 & i6) == 0) {
                z7 = false;
            } else {
                if (i7 == 0) {
                    f11880l.add(str);
                }
                z7 = true;
            }
            if (!z7) {
                return i6;
            }
            if (b.f11952d && (1048833 & i5) != 0) {
                int nativeAddDumpFile = JNIBridge.nativeAddDumpFile(str, str2, z4, z5, i5, z6);
                if (!LogType.isForNative(nativeAddDumpFile)) {
                    i6 = LogType.removeType(i6, 1);
                }
                if (!LogType.isForUnexp(nativeAddDumpFile)) {
                    i6 = LogType.removeType(i6, 256);
                }
                if (!LogType.isForANR(nativeAddDumpFile)) {
                    i6 = LogType.removeType(i6, 1048576);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i6), str2, Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6)});
            return i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:7|(3:34|35|(4:37|38|39|24))(3:9|10|(2:33|24))|12|13|15|16|(2:19|17)|20|21|23|24|5) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        com.uc.crashsdk.e.a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        com.uc.crashsdk.e.a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        com.uc.crashsdk.e.a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.io.OutputStream r11, java.lang.String r12, java.lang.String r13, java.util.ArrayList<java.lang.String> r14) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.uc.crashsdk.a.A
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.uc.crashsdk.a.B     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.uc.crashsdk.a.A     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> Ld1
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld1
            r6 = 1
            r7 = r3[r6]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Ld1
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> Ld1
            r8 = 2
            r3 = r3[r8]     // Catch: java.lang.Throwable -> Ld1
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto L3d
            boolean r7 = com.uc.crashsdk.export.LogType.isForJava(r7)     // Catch: java.lang.Throwable -> Ld1
            if (r7 != 0) goto L43
            goto L9
        L3d:
            boolean r7 = a(r14, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r7 == 0) goto L9
        L43:
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L68
            java.lang.String r9 = "%s (%d/%d)\n"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L68
            r10[r4] = r2     // Catch: java.lang.Throwable -> L68
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L68
            r10[r6] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L68
            r10[r8] = r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = java.lang.String.format(r7, r9, r10)     // Catch: java.lang.Throwable -> L68
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> L68
            r11.write(r2)     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L6c:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L8d
        L70:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8d
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r3 = "\n"
            byte[] r3 = r3.getBytes(r12)     // Catch: java.lang.Throwable -> L8d
            r11.write(r3)     // Catch: java.lang.Throwable -> L8d
            goto L70
        L8d:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r13.getBytes(r12)     // Catch: java.lang.Throwable -> La3
            r11.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r11)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r14 == 0) goto Lcf
            boolean r12 = com.uc.crashsdk.e.F()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcf
            java.util.Iterator r12 = r14.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lcf
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r14 = com.uc.crashsdk.a.B     // Catch: java.lang.Throwable -> Ld1
            boolean r14 = a(r14, r13)     // Catch: java.lang.Throwable -> Ld1
            if (r14 != 0) goto Lb5
            java.lang.String r14 = "CUSTOMCACHEDINFO"
            com.uc.crashsdk.e.a(r11, r14, r13)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.b(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:12:0x0025, B:69:0x002f, B:22:0x0045, B:24:0x0050, B:15:0x003e), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:33:0x007e, B:37:0x009a, B:39:0x00a2, B:57:0x00af, B:59:0x00b4), top: B:32:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:33:0x007e, B:37:0x009a, B:39:0x00a2, B:57:0x00af, B:59:0x00b4), top: B:32:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.OutputStream r18, java.lang.String r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            int intValue = ((Integer) objArr[0]).intValue();
            List list = (List) objArr[2];
            sb.append(String.format(Locale.US, "%s (%d/%d)\n", str, Integer.valueOf(list.size()), Integer.valueOf(intValue)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        HashMap<String, Object[]> hashMap = f11879k;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            if (objArr == null) {
                return null;
            }
            int i5 = 1;
            String str2 = (String) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            Locale locale = Locale.US;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str2;
            objArr2[1] = "`";
            objArr2[2] = Integer.valueOf(booleanValue ? 1 : 0);
            if (!booleanValue2) {
                i5 = 0;
            }
            objArr2[3] = Integer.valueOf(i5);
            return String.format(locale, "%s%s%d%d", objArr2);
        }
    }

    private static boolean a(List<String> list, String str) {
        if (com.uc.crashsdk.a.g.a(str)) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5 A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[Catch: all -> 0x015a, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef A[Catch: all -> 0x015a, TryCatch #0 {, blocks: (B:8:0x000d, B:10:0x0013, B:12:0x0027, B:14:0x002b, B:16:0x0035, B:18:0x003b, B:22:0x005d, B:25:0x0047, B:28:0x004c, B:29:0x0057, B:30:0x0050, B:33:0x0063, B:35:0x006a, B:37:0x0070, B:41:0x009a, B:42:0x00a1, B:44:0x00a9, B:46:0x00af, B:48:0x00b3, B:49:0x00b8, B:50:0x00be, B:52:0x00c6, B:54:0x00cc, B:56:0x00d0, B:57:0x00d5, B:58:0x00db, B:62:0x00ed, B:64:0x00ef, B:66:0x00f3, B:68:0x00f9, B:70:0x0105, B:72:0x010b, B:74:0x0112, B:75:0x0117, B:77:0x011d, B:79:0x0123, B:80:0x0128, B:82:0x012e, B:84:0x0134, B:85:0x013c, B:86:0x0158, B:90:0x00e5, B:96:0x007c, B:99:0x0081, B:100:0x008b, B:103:0x0092), top: B:7:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r16, int r17, java.util.concurrent.Callable<java.lang.String> r18, long r19, int r21) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.lang.String, int, java.util.concurrent.Callable, long, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(2:8|9)|(3:35|36|(4:39|40|41|17)(1:38))(3:11|12|(4:14|15|16|17)(1:18))|19|(1:21)(1:34)|(1:33)(1:25)|26|27|29|17|5) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        com.uc.crashsdk.e.a(r2, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.OutputStream r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList<java.lang.String> r12) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Object[]> r0 = com.uc.crashsdk.a.f11885q
            monitor-enter(r0)
            java.util.List<java.lang.String> r1 = com.uc.crashsdk.a.f11886r     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld1
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Ld1
            java.util.HashMap<java.lang.String, java.lang.Object[]> r3 = com.uc.crashsdk.a.f11885q     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch: java.lang.Throwable -> L8d
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L8d
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L8d
            if (r12 != 0) goto L2f
            boolean r5 = com.uc.crashsdk.export.LogType.isForJava(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L2f:
            boolean r5 = a(r12, r2)     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L36
            goto L9
        L36:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
            r5.append(r2)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            byte[] r5 = r5.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r5)     // Catch: java.lang.Throwable -> L8d
            r5 = 2
            r5 = r3[r5]     // Catch: java.lang.Throwable -> L8d
            java.lang.Long r5 = (java.lang.Long) r5     // Catch: java.lang.Throwable -> L8d
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> L8d
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L6b
            r7 = 3
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = com.uc.crashsdk.JNIBridge.nativeGetCallbackInfo(r2, r5, r3, r4)     // Catch: java.lang.Throwable -> L8d
            goto L73
        L6b:
            java.lang.StringBuilder r2 = b(r2, r4)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8d
        L73:
            if (r2 == 0) goto L83
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L8d
            if (r3 <= 0) goto L83
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L83:
            java.lang.String r2 = "(data is null)\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> L8d
            r9.write(r2)     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r9)     // Catch: java.lang.Throwable -> Ld1
        L91:
            java.lang.String r2 = "\n"
            byte[] r2 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> La3
            r9.write(r2)     // Catch: java.lang.Throwable -> La3
            byte[] r2 = r11.getBytes(r10)     // Catch: java.lang.Throwable -> La3
            r9.write(r2)     // Catch: java.lang.Throwable -> La3
            goto L9
        La3:
            r2 = move-exception
            com.uc.crashsdk.e.a(r2, r9)     // Catch: java.lang.Throwable -> Ld1
            goto L9
        La9:
            if (r12 == 0) goto Lcf
            boolean r10 = com.uc.crashsdk.e.F()     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto Lcf
            java.util.Iterator r10 = r12.iterator()     // Catch: java.lang.Throwable -> Ld1
        Lb5:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r11 == 0) goto Lcf
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Ld1
            java.util.List<java.lang.String> r12 = com.uc.crashsdk.a.f11886r     // Catch: java.lang.Throwable -> Ld1
            boolean r12 = a(r12, r11)     // Catch: java.lang.Throwable -> Ld1
            if (r12 != 0) goto Lb5
            java.lang.String r12 = "CUSTOMCALLBACKINFO"
            com.uc.crashsdk.e.a(r9, r12, r11)     // Catch: java.lang.Throwable -> Ld1
            goto Lb5
        Lcf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        Ld1:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.lang.String, java.util.ArrayList):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, boolean z4) {
        String sb;
        HashMap<String, Object[]> hashMap = f11885q;
        synchronized (hashMap) {
            Object[] objArr = hashMap.get(str);
            long longValue = ((Long) objArr[2]).longValue();
            if (longValue != 0) {
                sb = JNIBridge.nativeGetCallbackInfo(str, longValue, ((Integer) objArr[3]).intValue(), z4);
            } else {
                sb = b(str, z4).toString();
            }
        }
        return sb;
    }

    private static boolean a(String str, Thread thread) {
        if (thread == null) {
            return false;
        }
        SparseArray<Object[]> sparseArray = f11893y;
        synchronized (sparseArray) {
            int id = (int) thread.getId();
            if (sparseArray.get(id) == null) {
                f11894z.add(Integer.valueOf(id));
            }
            sparseArray.put(id, new Object[]{new WeakReference(thread), str});
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:30:0x00c3, B:32:0x00ca, B:33:0x00d3, B:35:0x00d8, B:37:0x00dc, B:38:0x00e5), top: B:29:0x00c3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:30:0x00c3, B:32:0x00ca, B:33:0x00d3, B:35:0x00d8, B:37:0x00dc, B:38:0x00e5), top: B:29:0x00c3, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.io.OutputStream r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(java.io.OutputStream, java.lang.String, java.lang.String):void");
    }

    public static int a(String str, int i5, int i6) {
        int i7;
        int i8;
        boolean z4;
        if (str == null || i5 <= 0) {
            return 0;
        }
        if (i5 > 1500) {
            com.uc.crashsdk.a.a.a("crashsdk", "createCachedInfo: capacity is too large!", null);
            return 0;
        }
        HashMap<String, Object[]> hashMap = A;
        synchronized (hashMap) {
            if (hashMap.containsKey(str)) {
                i8 = ((Integer) hashMap.get(str)[1]).intValue();
                i7 = LogType.addType(i8, i6);
            } else {
                i7 = i6;
                i8 = 0;
            }
            if (LogType.isForJava(i7) && !LogType.isForJava(i8)) {
                int i9 = C;
                if (i9 >= 8) {
                    i7 = LogType.removeType(i7, 16);
                } else {
                    C = i9 + 1;
                }
            }
            if (LogType.isForNative(i7) && !LogType.isForNative(i8)) {
                int i10 = D;
                if (i10 >= 8) {
                    i7 = LogType.removeType(i7, 1);
                } else {
                    D = i10 + 1;
                }
            }
            if (LogType.isForANR(i7) && !LogType.isForANR(i8)) {
                int i11 = E;
                if (i11 >= 8) {
                    i7 = LogType.removeType(i7, 1048576);
                } else {
                    E = i11 + 1;
                }
            }
            if ((1048849 & i7) == 0) {
                z4 = false;
            } else {
                if (i8 == 0) {
                    B.add(str);
                }
                z4 = true;
            }
            if (!z4) {
                return i7;
            }
            if (b.f11952d && (i6 & 1048577) != 0) {
                int nativeCreateCachedInfo = JNIBridge.nativeCreateCachedInfo(str, i5, i7);
                if (!LogType.isForNative(nativeCreateCachedInfo)) {
                    i7 = LogType.removeType(i7, 1);
                }
                if (!LogType.isForANR(nativeCreateCachedInfo)) {
                    i7 = LogType.removeType(i7, 1048576);
                }
            }
            hashMap.put(str, new Object[]{Integer.valueOf(i5), Integer.valueOf(i7), new ArrayList()});
            return i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(int r5, java.lang.String r6) {
        /*
            boolean r0 = com.uc.crashsdk.a.g.a(r6)
            if (r0 == 0) goto Le
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
        Le:
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r5)
            if (r0 != 0) goto L1a
            boolean r0 = com.uc.crashsdk.export.LogType.isForANR(r5)
            if (r0 == 0) goto L40
        L1a:
            boolean r0 = com.uc.crashsdk.b.f11952d
            r1 = 0
            if (r0 == 0) goto L39
            android.util.SparseArray<java.lang.Object[]> r0 = com.uc.crashsdk.a.f11893y
            monitor-enter(r0)
            r2 = 4
            long r3 = (long) r5
            com.uc.crashsdk.JNIBridge.nativeCmd(r2, r3, r6, r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = com.uc.crashsdk.export.LogType.isForNative(r5)
            boolean r1 = com.uc.crashsdk.export.LogType.isForANR(r5)
            if (r1 == 0) goto L41
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 | r1
            goto L41
        L36:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r5
        L39:
            java.lang.String r0 = "crashsdk so has not loaded!"
            java.lang.String r2 = "crashsdk"
            com.uc.crashsdk.a.a.a(r2, r0, r1)
        L40:
            r0 = 0
        L41:
            boolean r5 = com.uc.crashsdk.export.LogType.isForJava(r5)
            if (r5 == 0) goto L50
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            a(r6, r5)
            r0 = r0 | 16
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.a(int, java.lang.String):int");
    }

    public static boolean a(boolean z4) {
        int G2;
        if (!b.f11951c) {
            com.uc.crashsdk.a.a.a("crashsdk", "Unexp log not enabled, skip update unexp info!");
            return false;
        }
        if (e.F() || b.L()) {
            return false;
        }
        if (z4) {
            com.uc.crashsdk.a.f.a(F);
            G2 = 0;
        } else {
            if (!b.B()) {
                com.uc.crashsdk.a.a.a("crashsdk", "Stop update unexp info in background!");
                return false;
            }
            if (g.G() <= 0) {
                return false;
            }
            if (com.uc.crashsdk.a.f.b(F)) {
                return true;
            }
            G2 = g.G() * 1000;
        }
        com.uc.crashsdk.a.f.a(0, F, G2);
        return true;
    }

    public static void a(int i5) {
        if (i5 == 201) {
            com.uc.crashsdk.a.a.a("crashsdk", "Begin update info ...");
            long currentTimeMillis = System.currentTimeMillis();
            if (b.f11952d && f11871c) {
                JNIBridge.nativeCmd(11, g.G(), String.valueOf(g.H()), null);
            }
            com.uc.crashsdk.a.a.a("crashsdk", "Update info took " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            a(false);
            return;
        }
        if (i5 != 202) {
            if (!f11872d) {
                throw new AssertionError();
            }
            return;
        }
        p();
        Locale locale = Locale.US;
        String format = String.format(locale, "%s/%s/%s", g.T(), g.U(), g.V());
        f11875g = m();
        if (b.f11952d) {
            JNIBridge.set(128, f11875g);
        }
        boolean z4 = !format.equals(f11875g);
        if (z4) {
            com.uc.crashsdk.a.b.a(b.m(), format);
        }
        if (z4 && g.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", String.format(locale, "Is new version ('%s' -> '%s'), deleting old stats data!", f11875g, format));
            b.v();
        }
    }
}

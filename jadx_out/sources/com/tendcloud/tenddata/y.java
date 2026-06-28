package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.y1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f11827a = false;

    /* renamed from: b, reason: collision with root package name */
    public static String f11828b = "TDLog";

    /* renamed from: c, reason: collision with root package name */
    public static boolean f11829c = false;

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f11830d = true;

    /* renamed from: e, reason: collision with root package name */
    private static volatile int f11831e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final String f11832f = "UTF-8";

    /* renamed from: g, reason: collision with root package name */
    private static final String f11833g = "ge";

    /* renamed from: h, reason: collision with root package name */
    private static final String f11834h = "tp";

    /* renamed from: i, reason: collision with root package name */
    private static final String f11835i = "rop";

    /* renamed from: l, reason: collision with root package name */
    private static final byte f11838l = 61;

    /* renamed from: m, reason: collision with root package name */
    private static final String f11839m = "US-ASCII";

    /* renamed from: q, reason: collision with root package name */
    private static final String f11843q = "00:00:00:00:00:00";

    /* renamed from: r, reason: collision with root package name */
    private static final String f11844r = "02:00:00:00:00:00";

    /* renamed from: j, reason: collision with root package name */
    private static final ExecutorService f11836j = Executors.newSingleThreadExecutor();

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<String, Boolean> f11837k = new HashMap<>();

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f11840n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: o, reason: collision with root package name */
    private static byte[] f11841o = {1, 2, 3, 4, 5, 6, 7, 8};

    /* renamed from: p, reason: collision with root package name */
    private static final SecureRandom f11842p = new SecureRandom();

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f11845s = Pattern.compile("^([0-9A-F]{2}:){5}([0-9A-F]{2})$");

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r2 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Throwable -> L2d
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L2d
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L2e
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L2e
            int r1 = r2.read(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 <= 0) goto L29
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "td_channel_id"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Throwable -> L2e
            r2.close()     // Catch: java.lang.Throwable -> L28
        L28:
            return r3
        L29:
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L31
        L2d:
            r2 = r0
        L2e:
            if (r2 == 0) goto L31
            goto L29
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.y.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean b(Context context) {
        return false;
    }

    public static final boolean b(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String c(String str) {
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(String str) {
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            for (int i5 = 0; i5 < length; i5 += 2) {
                bArr[i5 / 2] = (byte) ((Character.digit(str.charAt(i5), 16) << 4) + Character.digit(str.charAt(i5 + 1), 16));
            }
            return bArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void execute(Runnable runnable) {
        ExecutorService executorService = f11836j;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }

    public static byte[] f(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                DeflaterOutputStream deflaterOutputStream2 = new DeflaterOutputStream(byteArrayOutputStream, deflater);
                try {
                    deflaterOutputStream2.write(str.getBytes("UTF-8"));
                    deflaterOutputStream2.close();
                } catch (Throwable unused) {
                    deflaterOutputStream = deflaterOutputStream2;
                    if (deflaterOutputStream != null) {
                        deflaterOutputStream.close();
                    }
                    deflater.end();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    public static Long g(String str) {
        long j5 = -1L;
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (Throwable unused) {
            return j5;
        }
    }

    public static Integer h(String str) {
        int i5 = -1;
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Throwable unused) {
            return i5;
        }
    }

    public static boolean i(String str) {
        return !b(str) && q.f11795h.matcher(str).matches();
    }

    public static boolean j(String str) {
        try {
            if (b(str) || !f11845s.matcher(str).matches() || f11844r.equals(str)) {
                return true;
            }
            return "00:00:00:00:00:00".equals(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r4.checkCallingOrSelfPermission(r5) == 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.tendcloud.tenddata.y.f11837k     // Catch: java.lang.Throwable -> L35
            boolean r2 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L14
            java.lang.Object r4 = r1.get(r5)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L35
            goto L34
        L14:
            r2 = 23
            boolean r2 = a(r2)     // Catch: java.lang.Throwable -> L35
            r3 = 1
            if (r2 == 0) goto L24
            int r4 = r4.checkSelfPermission(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L2c
            goto L2a
        L24:
            int r4 = r4.checkCallingOrSelfPermission(r5)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L2c
        L2a:
            r4 = r3
            goto L2d
        L2c:
            r4 = r0
        L2d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L35
        L34:
            return r4
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.y.b(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
    
        if (r3.checkCallingOrSelfPermission(r4) == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 23
            r1 = 0
            boolean r0 = a(r0)     // Catch: java.lang.Throwable -> L18
            r2 = 1
            if (r0 == 0) goto L11
            int r3 = r3.checkSelfPermission(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L18
            goto L17
        L11:
            int r3 = r3.checkCallingOrSelfPermission(r4)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto L18
        L17:
            r1 = r2
        L18:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.y.c(android.content.Context, java.lang.String):boolean");
    }

    public static String d(Context context, String str) {
        try {
            return a(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData, str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static FileChannel e(Context context, String str) {
        RandomAccessFile randomAccessFile;
        try {
            File file = new File(context.getFilesDir(), str + "td.lock");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            return randomAccessFile.getChannel();
        } catch (Throwable unused2) {
            if (randomAccessFile == null) {
                return null;
            }
            try {
                randomAccessFile.close();
                return null;
            } catch (Throwable unused3) {
                return null;
            }
        }
    }

    public static boolean b(int i5) {
        return Build.VERSION.SDK_INT < i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(byte[] r7) {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r7)
            r7 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L38
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L38
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L36
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L36
        L14:
            r4 = 0
            int r5 = r1.read(r2, r4, r0)     // Catch: java.lang.Throwable -> L33
            r6 = -1
            if (r5 == r6) goto L20
            r3.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L33
            goto L14
        L20:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L33
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r3.flush()     // Catch: java.lang.Throwable -> L34
            r3.close()     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1.close()     // Catch: java.lang.Throwable -> L42
            goto L42
        L33:
            r2 = r7
        L34:
            r7 = r3
            goto L3a
        L36:
            r2 = r7
            goto L3a
        L38:
            r1 = r7
            r2 = r1
        L3a:
            if (r7 == 0) goto L3f
            r7.close()     // Catch: java.lang.Throwable -> L3f
        L3f:
            if (r1 == 0) goto L42
            goto L2f
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.y.c(byte[]):java.lang.String");
    }

    public static boolean a(Context context) {
        if (f11831e == -1) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                String str = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).processName;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.processName.equals(str)) {
                            f11831e = 0;
                            return true;
                        }
                    }
                } else {
                    f11831e = 1;
                }
            } catch (Throwable unused) {
            }
            return false;
        }
        if (f11831e == 0) {
            return true;
        }
        f11831e = -1;
        return false;
    }

    public static String b(byte[] bArr) {
        String str;
        try {
            str = a(bArr, 0, bArr.length);
        } catch (Throwable th) {
            if (!f11830d) {
                throw new AssertionError(th.getMessage());
            }
            str = null;
        }
        if (f11830d || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] d(byte[] r7) {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r7)
            r7 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L2e
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2e
            r3.<init>()     // Catch: java.lang.Throwable -> L2e
        L14:
            r4 = 0
            int r5 = r1.read(r2, r4, r0)     // Catch: java.lang.Throwable -> L32
            r6 = -1
            if (r5 == r6) goto L20
            r3.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L32
            goto L14
        L20:
            r3.flush()     // Catch: java.lang.Throwable -> L32
            byte[] r7 = r3.toByteArray()     // Catch: java.lang.Throwable -> L32
            r3.close()     // Catch: java.lang.Throwable -> L2a
        L2a:
            r1.close()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L2e:
            r3 = r7
            goto L32
        L30:
            r1 = r7
            r3 = r1
        L32:
            if (r3 == 0) goto L37
            r3.close()     // Catch: java.lang.Throwable -> L37
        L37:
            if (r1 == 0) goto L3a
            goto L2a
        L3a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.y.d(byte[]):byte[]");
    }

    public static byte[] b(byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i5);
        }
        if (i6 >= 0) {
            if (i5 + i6 <= bArr.length) {
                int i7 = ((i6 / 3) * 4) + (i6 % 3 <= 0 ? 0 : 4);
                byte[] bArr2 = new byte[i7];
                int i8 = i6 - 2;
                int i9 = 0;
                int i10 = 0;
                while (i9 < i8) {
                    a(bArr, i9 + i5, 3, bArr2, i10);
                    i9 += 3;
                    i10 += 4;
                }
                if (i9 < i6) {
                    a(bArr, i5 + i9, i6 - i9, bArr2, i10);
                    i10 += 4;
                }
                if (i10 > i7 - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i10];
                System.arraycopy(bArr2, 0, bArr3, 0, i10);
                return bArr3;
            }
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(bArr.length)));
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i6);
    }

    public static byte[] e(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Throwable unused) {
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable unused2) {
        }
        inflater.end();
        return bArr;
    }

    public static int c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            if (applicationInfo != null) {
                return applicationInfo.targetSdkVersion;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void a(Object obj, final v vVar, String str, String str2) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            final Object obj2 = declaredField.get(obj);
            Class<?> cls = Class.forName(str2);
            declaredField.set(obj, Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.tendcloud.tenddata.y.1
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj3, Method method, Object[] objArr) {
                    v.this.beforeMethodInvoke(obj3, method, objArr);
                    Object invoke = method.invoke(obj2, objArr);
                    v.this.afterMethodInvoked(obj3, method, objArr, invoke);
                    return invoke;
                }
            }));
        } catch (Throwable unused) {
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(2, generateSecret, new IvParameterSpec(f11841o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Class<?> cls, final v vVar, String str, String str2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        final Object obj = declaredField.get(null);
        Class<?> cls2 = Class.forName(str2);
        declaredField.set(null, Proxy.newProxyInstance(cls.getClass().getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.tendcloud.tenddata.y.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                v.this.beforeMethodInvoke(obj2, method, objArr);
                Object invoke = method.invoke(obj, objArr);
                v.this.afterMethodInvoked(obj2, method, objArr, invoke);
                return invoke;
            }
        }));
    }

    public static String b(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (true) {
                            int read = byteArrayInputStream.read(bArr2);
                            if (read != -1) {
                                fileOutputStream.write(bArr2, 0, read);
                                messageDigest.update(bArr2, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        fileOutputStream.close();
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        return a(messageDigest.digest());
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } catch (Throwable unused4) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                byteArrayInputStream = null;
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                treeMap.put(next, jSONObject.get(next));
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    public static boolean a(int i5) {
        return Build.VERSION.SDK_INT >= i5;
    }

    public static SecureRandom b() {
        return f11842p;
    }

    public static boolean a(Context context, int i5) {
        try {
            return c(context) >= i5;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Map<String, Object> b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            HashMap hashMap = new HashMap();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.get(next));
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (byte b5 : bArr) {
                int i5 = b5 & y1.f19838d;
                if (i5 < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i5));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(byte[] bArr, int i5, int i6, byte[] bArr2, int i7) {
        try {
            byte[] bArr3 = f11840n;
            int i8 = (i6 > 0 ? (bArr[i5] << 24) >>> 8 : 0) | (i6 > 1 ? (bArr[i5 + 1] << 24) >>> 16 : 0) | (i6 > 2 ? (bArr[i5 + 2] << 24) >>> 24 : 0);
            if (i6 == 1) {
                bArr2[i7] = bArr3[i8 >>> 18];
                bArr2[i7 + 1] = bArr3[(i8 >>> 12) & 63];
                bArr2[i7 + 2] = 61;
                bArr2[i7 + 3] = 61;
                return bArr2;
            }
            if (i6 == 2) {
                bArr2[i7] = bArr3[i8 >>> 18];
                bArr2[i7 + 1] = bArr3[(i8 >>> 12) & 63];
                bArr2[i7 + 2] = bArr3[(i8 >>> 6) & 63];
                bArr2[i7 + 3] = 61;
                return bArr2;
            }
            if (i6 != 3) {
                return bArr2;
            }
            bArr2[i7] = bArr3[i8 >>> 18];
            bArr2[i7 + 1] = bArr3[(i8 >>> 12) & 63];
            bArr2[i7 + 2] = bArr3[(i8 >>> 6) & 63];
            bArr2[i7 + 3] = bArr3[i8 & 63];
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(Context context, int i5) {
        try {
            return (int) ((i5 * context.getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String a(byte[] bArr, int i5, int i6) {
        byte[] b5 = b(bArr, i5, i6);
        try {
            return new String(b5, "US-ASCII");
        } catch (Throwable unused) {
            return new String(b5);
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return String.valueOf(bundle.get(str));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(bArr2));
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(1, generateSecret, new IvParameterSpec(f11841o));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a() {
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), "UTF-8"));
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            do {
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused2) {
                }
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    String sb2 = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                    return sb2;
                }
            } while (sb.length() <= 104857600);
            throw new RuntimeException("Input stream more than 100 MB size limit");
        } catch (Throwable unused4) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
            }
            return null;
        }
    }

    public static void a(File file, byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int read = byteArrayInputStream.read(bArr2);
                    if (read != -1) {
                        fileOutputStream.write(bArr2, 0, read);
                    } else {
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                byteArrayInputStream.close();
                throw th;
            }
        } catch (Throwable unused) {
        }
    }
}

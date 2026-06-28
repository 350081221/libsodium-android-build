package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11740a = "pref.deviceid.key";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11743d = ".tcookieid";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11744e = ".tlocalcookieid";

    /* renamed from: f, reason: collision with root package name */
    private static volatile String f11745f;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f11741b = Pattern.compile("[0-4][0-9a-f]{24,32}");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f11742c = Pattern.compile("[0-4][0-9a-f]{32}");

    /* renamed from: g, reason: collision with root package name */
    private static String f11746g = "TD_Custom_Dev_Id";

    /* renamed from: h, reason: collision with root package name */
    private static String f11747h = null;

    public static synchronized String a(Context context) {
        String str;
        synchronized (j.class) {
            if (f11745f == null) {
                f11745f = d(context);
            }
            str = f11745f;
        }
        return str;
    }

    static String b(Context context) {
        try {
            String b5 = s.b(context, "tdid", f11740a, (String) null);
            return y.b(b5) ? PreferenceManager.getDefaultSharedPreferences(context).getString(f11740a, null) : b5;
        } catch (Throwable unused) {
            return "";
        }
    }

    static String c(Context context) {
        if (f11747h == null) {
            try {
                Sensor[] sensorArr = new Sensor[64];
                for (Sensor sensor : ((SensorManager) context.getSystemService(com.umeng.analytics.pro.bi.ac)).getSensorList(-1)) {
                    if (sensor.getType() < 64 && sensor.getType() >= 0) {
                        sensorArr[sensor.getType()] = sensor;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i5 = 0; i5 < 64; i5++) {
                    if (sensorArr[i5] != null) {
                        stringBuffer.append(i5);
                        stringBuffer.append(external.org.apache.commons.lang3.d.f15957a);
                        stringBuffer.append(sensorArr[i5].getVendor());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i5].getName());
                        stringBuffer.append('-');
                        stringBuffer.append(sensorArr[i5].getVersion());
                        stringBuffer.append('\n');
                    }
                }
                f11747h = String.valueOf(stringBuffer.toString().hashCode());
            } catch (Throwable unused) {
            }
        }
        return f11747h;
    }

    private static String d(Context context) {
        String str;
        String b5 = b(context);
        boolean a5 = a();
        String a6 = a(context, a5, f11744e);
        if (!y.b(b5) && f11742c.matcher(b5).matches()) {
            str = b5;
        } else if (!y.b(a6) && f11742c.matcher(a6).matches()) {
            str = a6;
        } else {
            int i5 = 0;
            String[] strArr = {a(f11743d), a(context, a5, f11743d)};
            while (true) {
                if (i5 < 2) {
                    str = strArr[i5];
                    if (!y.b(str) && f11742c.matcher(str).matches()) {
                        break;
                    }
                    i5++;
                } else {
                    str = null;
                    break;
                }
            }
        }
        if (y.b(str)) {
            if (y.a(29)) {
                str = b();
            } else {
                str = e(context);
            }
        }
        if (!str.equals(b5)) {
            b(context, str);
        }
        if (y.b(a6)) {
            a(context, str, a5);
        }
        return str;
    }

    private static String e(Context context) {
        return "3" + y.c(f(context));
    }

    private static String f(Context context) {
        try {
            return l.f(context) + '-' + l.a("mac") + '-' + l.a("androidId");
        } catch (Throwable unused) {
            return "";
        }
    }

    static String a(Context context, boolean z4, String str) {
        if (y.a(23) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return "";
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (!z4) {
            str = str + c(context);
        }
        String a5 = a(new File(externalStorageDirectory, str));
        if (!y.b(a5)) {
            return a5;
        }
        return a(new File(Environment.getExternalStorageDirectory(), ".tid" + c(context)));
    }

    private static void b(Context context, String str) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("tdid", 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(f11740a, str);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }

    private static String b() {
        String a5 = l.a("mac");
        if (y.b(a5)) {
            a5 = l.a("androidId");
        }
        if (y.b(a5)) {
            a5 = UUID.randomUUID().toString();
        }
        return "4" + y.c(3 + a5);
    }

    static String a(String str) {
        String str2 = null;
        try {
            File[] listFiles = new File("/").listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            str2 = a(new File(file, str));
                            if (!y.b(str2)) {
                                return str2;
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory()) {
                                    str2 = a(new File(file2, str));
                                    if (!y.b(str2)) {
                                        return str2;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    private static String a(File file) {
        FileInputStream fileInputStream;
        try {
            if (file.exists() && file.canRead()) {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[128];
                        String str = new String(bArr, 0, fileInputStream.read(bArr));
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return str;
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                }
            }
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (Throwable unused4) {
        }
        return null;
    }

    private static void a(Context context, String str, boolean z4) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            String str2 = f11744e;
            if (!z4) {
                str2 = f11744e + c(context);
            }
            a(new File(externalStorageDirectory, str2), str);
        } catch (Throwable unused) {
        }
    }

    private static void a(Context context, String str) {
        try {
            File[] listFiles = new File("/").listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    if (file.isDirectory() && !"/sdcard".equals(file.getAbsolutePath())) {
                        if (file.canWrite()) {
                            if (!new File(file, f11743d + c(context)).exists()) {
                                a(new File(file, f11743d), str);
                            }
                        }
                        if (file.listFiles() != null) {
                            for (File file2 : file.listFiles()) {
                                if (file2.isDirectory() && file2.canWrite()) {
                                    if (!new File(file2, f11743d + c(context)).exists()) {
                                        a(new File(file2, f11743d), str);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(File file, String str) {
        FileOutputStream fileOutputStream = null;
        if (!file.exists() && y.b(ab.f11351g, "android.permission.WRITE_EXTERNAL_STORAGE") && ((!y.a(ab.f11351g, 29) || !y.a(29)) && !file.createNewFile())) {
            return;
        }
        if (file.canWrite()) {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes());
                if (y.a(9)) {
                    Class<?> cls = file.getClass();
                    Class<?> cls2 = Boolean.TYPE;
                    cls.getMethod("setReadable", cls2, cls2).invoke(file, Boolean.TRUE, Boolean.FALSE);
                } else {
                    Runtime.getRuntime().exec("chmod 444 " + file.getAbsolutePath());
                }
                fileOutputStream = fileOutputStream2;
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream == null) {
                    return;
                }
                fileOutputStream.close();
            }
        }
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.close();
        } catch (Throwable unused2) {
        }
    }

    static boolean a() {
        boolean z4;
        if (y.a(9)) {
            z4 = Environment.isExternalStorageRemovable();
            return !z4;
        }
        z4 = true;
        return !z4;
    }
}

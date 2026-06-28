package com.ss.android.downloadlib.g;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.o;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private static Object[] f10111b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    private static Object[] f10112c = new Object[73];

    /* renamed from: a, reason: collision with root package name */
    static final char[] f10110a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: d, reason: collision with root package name */
    private static String f10113d = null;

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static String c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static Drawable d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return packageManager.getApplicationInfo(str, 0).loadIcon(packageManager);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean e(Context context, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean f(Context context, String str) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) == null) {
                return false;
            }
            String str2 = packageArchiveInfo.packageName;
            int i5 = packageArchiveInfo.versionCode;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo == null) {
                return false;
            }
            if (i5 > packageInfo.versionCode) {
                return false;
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static Intent g(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static Signature[] h(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null) {
                return packageInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Signature[] i(Context context, String str) {
        try {
            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 64);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.signatures;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static File j(Context context, String str) {
        String str2 = null;
        File parentFile = context.getExternalFilesDir(null).getParentFile();
        if (parentFile != null) {
            str2 = parentFile.getParent();
        }
        File file = new File(str2 + File.separator + str);
        StringBuilder sb = new StringBuilder();
        sb.append("getExtDir: file.toString()-->");
        sb.append(file.toString());
        com.ss.android.socialbase.downloader.c.a.b("ToolUtils", sb.toString());
        return file;
    }

    public static long a(JSONObject jSONObject, String str) {
        return com.ss.android.download.api.c.b.a(jSONObject, str);
    }

    public static int b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        return com.ss.android.download.api.c.b.a(jSONObject, jSONObject2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1 > 29) goto L16;
     */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r7) {
        /*
            android.content.Context r0 = com.ss.android.downloadlib.addownload.k.a()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = e(r0, r7)
            if (r1 != 0) goto L13
            return r2
        L13:
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            org.json.JSONObject r3 = com.ss.android.downloadlib.addownload.k.j()
            java.lang.String r4 = "get_ext_dir_mode"
            int r3 = r3.optInt(r4)
            r5 = 1
            r6 = 29
            if (r3 != 0) goto L37
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r6) goto L37
            if (r1 != r6) goto L34
            boolean r3 = com.ss.android.downloadlib.addownload.o.a()
            if (r3 == 0) goto L36
        L34:
            if (r1 <= r6) goto L37
        L36:
            return r5
        L37:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L8d
            if (r1 < r6) goto L52
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L8d
            int r1 = r1.targetSdkVersion     // Catch: java.lang.Exception -> L8d
            if (r1 < r6) goto L52
            org.json.JSONObject r1 = com.ss.android.downloadlib.addownload.k.j()     // Catch: java.lang.Exception -> L8d
            int r1 = r1.optInt(r4)     // Catch: java.lang.Exception -> L8d
            if (r1 != r5) goto L52
            java.io.File r1 = j(r0, r7)     // Catch: java.lang.Exception -> L8d
            goto L70
        L52:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L8d
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L8d
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Exception -> L8d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8d
            r4.<init>()     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "android/data/"
            r4.append(r6)     // Catch: java.lang.Exception -> L8d
            r4.append(r7)     // Catch: java.lang.Exception -> L8d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L8d
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L8d
        L70:
            boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L8d
            if (r3 != 0) goto L77
            return r2
        L77:
            long r3 = com.ss.android.downloadlib.g.g.a(r1)     // Catch: java.lang.Exception -> L8d
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L8d
            android.content.pm.PackageInfo r7 = r0.getPackageInfo(r7, r2)     // Catch: java.lang.Exception -> L8d
            if (r7 == 0) goto L8c
            long r0 = r7.lastUpdateTime     // Catch: java.lang.Exception -> L8d
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 >= 0) goto L8c
            return r5
        L8c:
            return r2
        L8d:
            r7 = move-exception
            r7.printStackTrace()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.g.m.c(java.lang.String):boolean");
    }

    @NonNull
    public static JSONObject a(JSONObject jSONObject) {
        return com.ss.android.download.api.c.b.a(jSONObject);
    }

    @NonNull
    public static JSONObject a(JSONObject... jSONObjectArr) {
        return com.ss.android.download.api.c.b.a(jSONObjectArr);
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null) {
                return !queryIntentActivities.isEmpty();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return false;
        }
        return a(bVar.e(), bVar.I(), bVar.J()).a();
    }

    public static boolean b(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static String a(long j5) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j5 >= 1073741824) {
            return (j5 / 1073741824) + "G";
        }
        if (j5 >= 1048576) {
            return (j5 / 1048576) + "M";
        }
        return decimalFormat.format(((float) j5) / 1048576.0f) + "M";
    }

    public static long b(long j5) {
        try {
            return a(Environment.getExternalStorageDirectory(), j5);
        } catch (Exception e5) {
            e5.printStackTrace();
            return j5;
        }
    }

    public static PackageInfo a(com.ss.android.downloadad.api.a.b bVar) {
        DownloadInfo downloadInfo;
        if (bVar == null || (downloadInfo = Downloader.getInstance(com.ss.android.downloadlib.addownload.k.a()).getDownloadInfo(bVar.s())) == null) {
            return null;
        }
        try {
            return com.ss.android.socialbase.appdownloader.c.a(com.ss.android.downloadlib.addownload.k.a(), downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @NonNull
    public static HashMap<String, String> b(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
                return hashMap;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return hashMap;
    }

    public static Drawable a(Context context, String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (context != null && !TextUtils.isEmpty(str) && (packageArchiveInfo = (packageManager = context.getPackageManager()).getPackageArchiveInfo(str, 0)) != null) {
            ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
            applicationInfo.sourceDir = str;
            applicationInfo.publicSourceDir = str;
            try {
                return applicationInfo.loadIcon(packageManager);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static void c() {
        ComponentName componentName;
        try {
            if (com.ss.android.downloadlib.addownload.k.f().a(com.ss.android.downloadlib.addownload.k.a(), "android.permission.REORDER_TASKS")) {
                ActivityManager activityManager = (ActivityManager) com.ss.android.downloadlib.addownload.k.a().getSystemService("activity");
                for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(20)) {
                    String packageName = com.ss.android.downloadlib.addownload.k.a().getPackageName();
                    componentName = runningTaskInfo.topActivity;
                    if (packageName.equals(componentName.getPackageName())) {
                        activityManager.moveTaskToFront(runningTaskInfo.id, 1);
                        return;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static com.ss.android.downloadlib.addownload.b.c a(String str, int i5, String str2) {
        com.ss.android.downloadlib.addownload.b.c cVar = new com.ss.android.downloadlib.addownload.b.c();
        if (TextUtils.isEmpty(str)) {
            return cVar;
        }
        try {
            PackageInfo packageInfo = com.ss.android.downloadlib.addownload.k.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null) {
                cVar.b(packageInfo.versionCode);
                cVar.a(com.ss.android.downloadlib.addownload.b.c.f9641b);
                o h5 = com.ss.android.downloadlib.addownload.k.h();
                if (h5 != null && h5.a() && !a(packageInfo.versionCode, i5, packageInfo.versionName, str2)) {
                    cVar.a(com.ss.android.downloadlib.addownload.b.c.f9642c);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return cVar;
    }

    private static boolean a(int i5, int i6, String str, String str2) {
        if (i6 == 0 && TextUtils.isEmpty(str2)) {
            return true;
        }
        return (i6 > 0 && i5 >= i6) || a(str, str2) >= 0;
    }

    public static boolean a(DownloadModel downloadModel) {
        if (downloadModel == null) {
            return false;
        }
        return a(downloadModel.getPackageName(), downloadModel.getVersionCode(), downloadModel.getVersionName()).a();
    }

    public static boolean a(Context context, String str, String str2) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || (packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0)) == null || !packageArchiveInfo.packageName.equals(str2)) {
                return false;
            }
            int i5 = packageArchiveInfo.versionCode;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo == null) {
                return false;
            }
            return i5 == packageInfo.versionCode;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean a(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == signatureArr2) {
            return true;
        }
        if (signatureArr == null || signatureArr2 == null || signatureArr.length != signatureArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < signatureArr.length; i5++) {
            Signature signature = signatureArr[i5];
            if ((signature == null && signatureArr2[i5] != null) || (signature != null && !signature.equals(signatureArr2[i5]))) {
                return false;
            }
        }
        return true;
    }

    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String a(String str, int i5) {
        return i5 == 0 ? "" : (TextUtils.isEmpty(str) || str.length() <= i5) ? str : str.substring(0, i5);
    }

    public static int a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                    return 0;
                }
                String[] split = str.split("\\.");
                String[] split2 = str2.split("\\.");
                int min = Math.min(split.length, split2.length);
                int i5 = 0;
                int i6 = 0;
                while (i5 < min) {
                    i6 = Integer.parseInt(split[i5]) - Integer.parseInt(split2[i5]);
                    if (i6 != 0) {
                        break;
                    }
                    i5++;
                }
                if (i6 != 0) {
                    return i6 > 0 ? 1 : -1;
                }
                for (int i7 = i5; i7 < split.length; i7++) {
                    if (Integer.parseInt(split[i7]) > 0) {
                        return 1;
                    }
                }
                while (i5 < split2.length) {
                    if (Integer.parseInt(split2[i5]) > 0) {
                        return -1;
                    }
                    i5++;
                }
                return 0;
            }
        } catch (Exception unused) {
        }
        return -2;
    }

    public static String a(String... strArr) {
        return com.ss.android.download.api.c.b.a(strArr);
    }

    @NonNull
    public static <T> T a(T... tArr) {
        if (tArr != null) {
            for (T t5 : tArr) {
                if (t5 != null) {
                    return t5;
                }
            }
            throw new IllegalArgumentException("args is null");
        }
        throw new IllegalArgumentException("args is null");
    }

    public static boolean a() {
        try {
            if (com.ss.android.downloadlib.addownload.k.a().getPackageManager().getPackageInfo(com.ss.android.downloadlib.addownload.k.a().getPackageName(), 0).applicationInfo.targetSdkVersion == 33) {
                return Build.VERSION.SDK_INT == 33;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static long a(File file, long j5) {
        if (file == null) {
            return j5;
        }
        try {
            return com.ss.android.socialbase.downloader.i.f.d(file.getAbsolutePath());
        } catch (Exception e5) {
            e5.printStackTrace();
            return j5;
        }
    }

    public static long a(File file) {
        if (file == null) {
            return -1L;
        }
        try {
            return new StatFs(file.getAbsolutePath()).getTotalBytes();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1L;
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            jSONObject.putOpt(str, obj);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }
}

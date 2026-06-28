package com.ss.android.socialbase.appdownloader;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static int f10213a;

    /* renamed from: b, reason: collision with root package name */
    private static NotificationChannel f10214b;

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(Context context, int i5, boolean z4) {
        if (com.ss.android.socialbase.downloader.g.a.a(i5).b("notification_opt_2") == 1) {
            com.ss.android.socialbase.downloader.notification.b.a().f(i5);
        }
        a((Activity) h.a().b());
        if (com.ss.android.socialbase.downloader.g.a.a(i5).a("install_queue_enable", 0) == 1) {
            return h.a().a(context, i5, z4);
        }
        return b(context, i5, z4);
    }

    private static String a(long j5, long j6, String str, boolean z4) {
        double d5 = j5;
        if (j6 > 1) {
            d5 /= j6;
        }
        if (!z4 && !"GB".equals(str) && !"TB".equals(str)) {
            return new DecimalFormat("#").format(d5) + " " + str;
        }
        return new DecimalFormat("#.##").format(d5) + " " + str;
    }

    public static String b(long j5) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j5 < 1) {
            return "0 " + strArr[4];
        }
        for (int i5 = 0; i5 < 5; i5++) {
            long j6 = jArr[i5];
            if (j5 >= j6) {
                return a(j5, j6, strArr[i5]);
            }
        }
        return null;
    }

    public static boolean c(Context context, DownloadInfo downloadInfo) {
        if (context == null || downloadInfo == null || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        return b(context, downloadInfo, a(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName()));
    }

    public static String a(long j5) {
        return a(j5, true);
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.equals("application/vnd.android.package-archive");
    }

    public static String a(long j5, boolean z4) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j5 < 1) {
            return "0 " + strArr[4];
        }
        for (int i5 = 0; i5 < 5; i5++) {
            long j6 = jArr[i5];
            if (j5 >= j6) {
                return a(j5, j6, strArr[i5], z4);
            }
        }
        return null;
    }

    public static List<String> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("application/vnd.android.package-archive");
        arrayList.add("application/ttpatch");
        return arrayList;
    }

    public static int b(final Context context, final int i5, final boolean z4) {
        final DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i5);
        if (downloadInfo != null && "application/vnd.android.package-archive".equals(downloadInfo.getMimeType()) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            final File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.exists()) {
                com.ss.android.socialbase.downloader.downloader.c.b(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.c.2
                    @Override // java.lang.Runnable
                    public void run() {
                        d.j().k();
                        int a5 = c.a(context, i5, z4, downloadInfo, file);
                        if (a5 == 1 && d.j().q() != null) {
                            d.j().q().a(downloadInfo, null);
                        }
                        c.b(downloadInfo, z4, a5);
                    }
                });
                return 1;
            }
        }
        b(downloadInfo, z4, 2);
        return 2;
    }

    private static JSONObject d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(long j5, long j6, String str) {
        double d5 = j5;
        if (j6 > 1) {
            d5 /= j6;
        }
        if ("MB".equals(str)) {
            return new DecimalFormat("#").format(d5) + str;
        }
        return new DecimalFormat("#.##").format(d5) + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(DownloadInfo downloadInfo, boolean z4, int i5) {
        if (downloadInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("by_user", z4 ? 1 : 2);
            jSONObject.put("view_result", i5);
            jSONObject.put("real_package_name", downloadInfo.getFilePackageName());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().a(downloadInfo.getId(), "install_view_result", jSONObject);
    }

    public static int a(final Context context, final int i5, final boolean z4) {
        com.ss.android.socialbase.appdownloader.c.j g5 = d.j().g();
        if (g5 == null) {
            return d(context, i5, z4);
        }
        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i5);
        f10213a = 1;
        g5.a(downloadInfo, new com.ss.android.socialbase.appdownloader.c.i() { // from class: com.ss.android.socialbase.appdownloader.c.1
            @Override // com.ss.android.socialbase.appdownloader.c.i
            public void a() {
                int unused = c.f10213a = c.d(context, i5, z4);
            }
        });
        return f10213a;
    }

    public static boolean b(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        return a(context, downloadInfo, packageInfo, false);
    }

    public static int a(Context context, int i5, boolean z4, DownloadInfo downloadInfo, File file) {
        PackageInfo packageInfo;
        Intent a5;
        Process process;
        if (file.getPath().startsWith(Environment.getDataDirectory().getAbsolutePath())) {
            try {
                process = Runtime.getRuntime().exec("chmod 555 " + file.getAbsolutePath());
                try {
                    process.waitFor();
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                    } finally {
                        if (process != null) {
                            process.destroy();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                process = null;
            }
        }
        try {
            packageInfo = a(downloadInfo, file);
            if (packageInfo != null) {
                try {
                    downloadInfo.setFilePackageName(packageInfo.packageName);
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            th = null;
        } catch (Throwable th4) {
            th = th4;
            packageInfo = null;
        }
        if (d.j().c() != null) {
            if (packageInfo == null) {
                BaseException baseException = new BaseException(2001, th);
                d.j().c().a(downloadInfo, baseException, baseException.getErrorCode());
            } else {
                d.j().c().a(downloadInfo, null, 11);
            }
        }
        if (a(context, downloadInfo, packageInfo)) {
            return 2;
        }
        if (packageInfo != null && com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("install_callback_error")) {
            downloadInfo.getTempCacheData().put("extra_apk_package_name", packageInfo.packageName);
            downloadInfo.getTempCacheData().put("extra_apk_version_code", Integer.valueOf(packageInfo.versionCode));
        }
        int[] iArr = new int[1];
        if (b(context, downloadInfo, packageInfo)) {
            a5 = context.getPackageManager().getLaunchIntentForPackage(packageInfo.packageName);
        } else {
            if (!z4 && a(context, i5, file)) {
                downloadInfo.getTempCacheData().put("extra_silent_install_succeed", Boolean.TRUE);
                return 1;
            }
            a5 = a(context, downloadInfo, file, z4, iArr);
        }
        if (a5 == null) {
            return iArr[0] == 1 ? 2 : 0;
        }
        a5.addFlags(268435456);
        if (downloadInfo.getLinkMode() > 0 && com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("app_install_return_result", 0) == 1) {
            a5.putExtra("android.intent.extra.RETURN_RESULT", true);
        }
        if (iArr[0] == 0 && b.a(context, downloadInfo, a5, z4)) {
            return 1;
        }
        return a(context, a5);
    }

    public static int b(Context context, DownloadInfo downloadInfo) {
        if (context != null && downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getSavePath()) && !TextUtils.isEmpty(downloadInfo.getName())) {
            int appVersionCode = downloadInfo.getAppVersionCode();
            if (appVersionCode > 0) {
                return appVersionCode;
            }
            try {
                PackageInfo a5 = a(context, downloadInfo, downloadInfo.getSavePath(), downloadInfo.getName());
                if (a5 != null) {
                    int i5 = a5.versionCode;
                    downloadInfo.setAppVersionCode(i5);
                    return i5;
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    public static String b() {
        return com.ss.android.socialbase.downloader.i.f.e();
    }

    public static boolean b(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        if (!jSONObject.optBoolean("bind_app", false)) {
            if (jSONObject.optBoolean("auto_install_with_notification", true)) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(26)
    public static String b(@NonNull Context context) {
        try {
            if (f10214b == null) {
                NotificationChannel notificationChannel = new NotificationChannel("111111", "channel_appdownloader", 3);
                f10214b = notificationChannel;
                notificationChannel.setSound(null, null);
                f10214b.setShowBadge(false);
                ((NotificationManager) context.getSystemService(ServiceManagerNative.NOTIFICATION)).createNotificationChannel(f10214b);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "111111";
    }

    public static int a(Context context, Intent intent) {
        try {
            if (d.j().p() != null) {
                if (d.j().p().a(intent)) {
                    return 1;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            context.startActivity(intent);
            return 1;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    public static boolean a(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo) {
        if (packageInfo == null || packageInfo.packageName.equals(downloadInfo.getPackageName())) {
            return false;
        }
        com.ss.android.socialbase.appdownloader.c.d b5 = d.j().b();
        if (b5 != null) {
            b5.a(downloadInfo.getId(), 8, downloadInfo.getPackageName(), packageInfo.packageName, "");
            if (b5.a()) {
                return true;
            }
        }
        z downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        if (downloadNotificationEventListener == null) {
            return false;
        }
        downloadNotificationEventListener.a(8, downloadInfo, packageInfo.packageName, "");
        com.ss.android.socialbase.appdownloader.c.c a5 = d.j().a();
        return (a5 instanceof com.ss.android.socialbase.appdownloader.c.a) && ((com.ss.android.socialbase.appdownloader.c.a) a5).b();
    }

    public static boolean a(Context context, int i5, File file) {
        if (com.ss.android.socialbase.downloader.g.a.a(i5).a("back_miui_silent_install", 1) == 1) {
            return false;
        }
        if ((com.ss.android.socialbase.appdownloader.f.e.m() || com.ss.android.socialbase.appdownloader.f.e.n()) && com.ss.android.socialbase.downloader.i.j.a(context, "com.miui.securitycore", "com.miui.enterprise.service.EntInstallService")) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.securitycore", "com.miui.enterprise.service.EntInstallService"));
            Bundle bundle = new Bundle();
            bundle.putInt("userId", 0);
            bundle.putInt("flag", 256);
            bundle.putString("apkPath", file.getPath());
            bundle.putString("installerPkg", "com.miui.securitycore");
            intent.putExtras(bundle);
            try {
                context.startService(intent);
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static int a() {
        return d.j().f() ? 16384 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri a(int r1, com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider r2, android.content.Context r3, java.lang.String r4, java.io.File r5) {
        /*
            if (r2 == 0) goto Lb
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.getUriForFile(r4, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        Lb:
            com.ss.android.socialbase.appdownloader.d r2 = com.ss.android.socialbase.appdownloader.d.j()
            com.ss.android.socialbase.appdownloader.c.f r2 = r2.e()
            if (r2 == 0) goto L1e
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e
            android.net.Uri r1 = r2.a(r1, r4, r0)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 != 0) goto L35
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L2c
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L31
            goto L35
        L2c:
            android.net.Uri r1 = android.net.Uri.fromFile(r5)     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r2.printStackTrace()
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.a(int, com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider, android.content.Context, java.lang.String, java.io.File):android.net.Uri");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Intent a(Context context, DownloadInfo downloadInfo, @NonNull File file, boolean z4, int[] iArr) {
        Uri a5 = a(downloadInfo.getId(), Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId()), context, d.j().d(), file);
        if (a5 == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(1);
        intent.setDataAndType(a5, "application/vnd.android.package-archive");
        com.ss.android.socialbase.appdownloader.c.d b5 = d.j().b();
        int a6 = b5 != null ? b5.a(downloadInfo.getId(), z4) : 0;
        z downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(downloadInfo.getId());
        int i5 = a6;
        if (downloadNotificationEventListener != null) {
            i5 = downloadNotificationEventListener.a(z4);
        }
        iArr[0] = i5;
        if (i5 != 0) {
            return null;
        }
        return intent;
    }

    public static boolean a(DownloadInfo downloadInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty(downloadInfo.getPackageName()) || !str.equals(downloadInfo.getPackageName())) {
            return !TextUtils.isEmpty(downloadInfo.getName()) && a(com.ss.android.socialbase.downloader.downloader.c.O(), downloadInfo, str);
        }
        return true;
    }

    public static boolean a(Context context, DownloadInfo downloadInfo, String str) {
        if (context == null) {
            return false;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            PackageInfo packageInfo = null;
            if (file.exists()) {
                Log.e("AppDownloadUtils", "isPackageNameEqualsWithApk fileName:" + downloadInfo.getName() + " apkFileSize：" + file.length() + " fileUrl：" + downloadInfo.getUrl());
                PackageInfo a5 = a(downloadInfo, file);
                if (a5 == null || !a5.packageName.equals(str)) {
                    return false;
                }
                int i5 = a5.versionCode;
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, a());
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (packageInfo == null || i5 != packageInfo.versionCode) {
                    return false;
                }
            } else {
                if (!com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("install_callback_error")) {
                    return false;
                }
                String a6 = com.ss.android.socialbase.downloader.i.f.a(downloadInfo.getTempCacheData().get("extra_apk_package_name"), (String) null);
                int a7 = com.ss.android.socialbase.downloader.i.f.a(downloadInfo.getTempCacheData().get("extra_apk_version_code"), 0);
                if (a6 == null || TextUtils.isEmpty(a6) || !a6.equals(str)) {
                    return false;
                }
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, a());
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo == null || a7 != packageInfo.versionCode) {
                    return false;
                }
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context, DownloadInfo downloadInfo, PackageInfo packageInfo, boolean z4) {
        PackageInfo packageInfo2;
        if (packageInfo == null) {
            return false;
        }
        String str = packageInfo.packageName;
        int i5 = packageInfo.versionCode;
        if (downloadInfo != null) {
            downloadInfo.setAppVersionCode(i5);
        }
        try {
            packageInfo2 = context.getPackageManager().getPackageInfo(str, a());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo2 = null;
        }
        if (packageInfo2 == null) {
            return false;
        }
        int i6 = packageInfo2.versionCode;
        return z4 ? i5 < i6 : (downloadInfo == null || com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("install_with_same_version_code", 0) != 1) ? i5 <= i6 : i5 < i6;
    }

    public static boolean a(Context context, DownloadInfo downloadInfo) {
        return a(context, downloadInfo, true);
    }

    public static boolean a(Context context, DownloadInfo downloadInfo, boolean z4) {
        PackageInfo packageInfo;
        if (downloadInfo == null) {
            return false;
        }
        String packageName = downloadInfo.getPackageName();
        int appVersionCode = downloadInfo.getAppVersionCode();
        if (appVersionCode <= 0 && z4) {
            return c(context, downloadInfo);
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, a());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        return com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("install_with_same_version_code", 0) == 1 ? appVersionCode < packageInfo.versionCode : appVersionCode <= packageInfo.versionCode;
    }

    public static PackageInfo a(Context context, DownloadInfo downloadInfo, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str, str2);
        if (!file.exists()) {
            return null;
        }
        Log.e("AppDownloadUtils", "isApkInstalled apkFileSize：fileName:" + file.getPath() + " apkFileSize" + file.length());
        return a(downloadInfo, file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r0 = "default.apk"
            java.lang.String r2 = ".."
            if (r6 == 0) goto L34
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L5a
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getLastPathSegment()
            goto L5a
        L32:
            r4 = r0
            goto L5a
        L34:
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L4c
            java.lang.String r6 = r3.getLastPathSegment()
            boolean r6 = r6.contains(r2)
            if (r6 != 0) goto L4c
            java.lang.String r1 = r3.getLastPathSegment()
        L4c:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L59
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L32
            goto L5a
        L59:
            r4 = r1
        L5a:
            boolean r3 = c(r5)
            if (r3 == 0) goto L77
            java.lang.String r3 = ".apk"
            boolean r5 = r4.endsWith(r3)
            if (r5 != 0) goto L77
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.a(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    public static String a(String str, com.ss.android.socialbase.downloader.g.a aVar) {
        JSONObject d5;
        String format;
        if (aVar == null || (d5 = aVar.d("download_dir")) == null) {
            return "";
        }
        String optString = d5.optString("dir_name");
        if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
            optString = optString.substring(1);
        }
        if (TextUtils.isEmpty(optString)) {
            return optString;
        }
        if (!optString.contains("%s")) {
            format = optString + str;
        } else {
            try {
                format = String.format(optString, str);
            } catch (Throwable unused) {
            }
        }
        optString = format;
        return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return new JSONObject(str).optBoolean("bind_app", false);
    }

    public static int a(int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (i5 == -2) {
            return 2;
        }
        if (i5 == 1) {
            return 4;
        }
        if (DownloadStatus.isDownloading(i5) || i5 == 11) {
            return 1;
        }
        return DownloadStatus.isDownloadOver(i5) ? 3 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r1 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 0
            int r2 = com.ss.android.socialbase.appdownloader.e.b()     // Catch: java.lang.Throwable -> L37
            android.content.res.Resources r3 = r6.getResources()     // Catch: java.lang.Throwable -> L37
            int r2 = r3.getColor(r2)     // Catch: java.lang.Throwable -> L37
            int r3 = com.ss.android.socialbase.appdownloader.e.c()     // Catch: java.lang.Throwable -> L37
            int r4 = com.ss.android.socialbase.appdownloader.e.d()     // Catch: java.lang.Throwable -> L37
            r5 = 2
            int[] r5 = new int[r5]     // Catch: java.lang.Throwable -> L37
            r5[r0] = r3     // Catch: java.lang.Throwable -> L37
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L37
            int r4 = com.ss.android.socialbase.appdownloader.e.e()     // Catch: java.lang.Throwable -> L37
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r4, r5)     // Catch: java.lang.Throwable -> L37
            int r6 = r1.getColor(r0, r0)     // Catch: java.lang.Throwable -> L37
            if (r2 != r6) goto L33
            r1.recycle()     // Catch: java.lang.Throwable -> L32
        L32:
            return r3
        L33:
            r1.recycle()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L37:
            if (r1 == 0) goto L3a
            goto L33
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.c.a(android.content.Context):boolean");
    }

    public static void a(DownloadInfo downloadInfo, boolean z4, boolean z5) {
        d.j().a(new f(com.ss.android.socialbase.downloader.downloader.c.O(), downloadInfo.getUrl()).a(downloadInfo.getTitle()).b(downloadInfo.getName()).c(downloadInfo.getSavePath()).a(downloadInfo.isShowNotification()).b(downloadInfo.isAutoInstallWithoutNotification()).c(downloadInfo.isOnlyWifi() || z5).e(downloadInfo.getExtra()).f(downloadInfo.getMimeType()).a(downloadInfo.getExtraHeaders()).e(true).b(downloadInfo.getRetryCount()).c(downloadInfo.getBackUpUrlRetryCount()).b(downloadInfo.getBackUpUrls()).d(downloadInfo.getMinProgressTimeMsInterval()).e(downloadInfo.getMaxProgressCount()).f(z4).d(downloadInfo.isNeedHttpsToHttpRetry()).g(downloadInfo.getPackageName()).h(downloadInfo.getMd5()).a(downloadInfo.getExpectFileLength()).i(downloadInfo.isNeedDefaultHttpServiceBackUp()).j(downloadInfo.isNeedReuseFirstConnection()).l(downloadInfo.isNeedIndependentProcess()).a(downloadInfo.getEnqueueType()).n(downloadInfo.isForce()).m(downloadInfo.isHeadConnectionAvailable()).g(downloadInfo.isNeedRetryDelay()).i(downloadInfo.getRetryDelayTimeArray()).a(d(downloadInfo.getDownloadSettingString())).k(downloadInfo.getIconUrl()).f(downloadInfo.getExecutorGroup()).p(downloadInfo.isAutoInstall()));
    }

    public static void a(Activity activity) {
        if (activity != null) {
            try {
                if (activity.isFinishing()) {
                    return;
                }
                activity.finish();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static PackageInfo a(DownloadInfo downloadInfo, File file) {
        if (downloadInfo == null) {
            return com.ss.android.socialbase.appdownloader.f.a.e.a(com.ss.android.socialbase.downloader.downloader.c.O(), file, a());
        }
        PackageInfo packageInfo = downloadInfo.getPackageInfo();
        if (packageInfo != null) {
            return packageInfo;
        }
        PackageInfo a5 = com.ss.android.socialbase.appdownloader.f.a.e.a(com.ss.android.socialbase.downloader.downloader.c.O(), file, a());
        downloadInfo.setPackageInfo(a5);
        return a5;
    }

    public static int a(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}

package com.ss.android.socialbase.appdownloader.f.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.File;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {
    public static PackageInfo a(@NonNull File file) {
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        int b5;
        long j5;
        a aVar = null;
        String str = null;
        aVar = null;
        aVar = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                ZipInputStream zipInputStream2 = new ZipInputStream(fileInputStream);
                while (true) {
                    nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        zipInputStream = null;
                        break;
                    }
                    if (nextEntry.isDirectory()) {
                        try {
                            zipInputStream2.closeEntry();
                        } catch (Throwable unused) {
                        }
                    } else {
                        if ("AndroidManifest.xml".equals(nextEntry.getName())) {
                            zipInputStream = zipInputStream2;
                            break;
                        }
                        zipInputStream2.closeEntry();
                    }
                }
                if (nextEntry != null) {
                    try {
                        if ("AndroidManifest.xml".equals(nextEntry.getName())) {
                            a aVar2 = new a();
                            try {
                                aVar2.a(zipInputStream);
                                do {
                                    b5 = aVar2.b();
                                    if (b5 == 1) {
                                        throw new c("已达到END_DOCUMENT");
                                    }
                                } while (b5 != 2);
                                int e5 = aVar2.e();
                                String str2 = null;
                                String str3 = null;
                                for (int i5 = 0; i5 != e5; i5++) {
                                    if (TTDownloadField.TT_VERSION_NAME.equals(aVar2.a(i5))) {
                                        str3 = a(aVar2, i5);
                                    } else if (TTDownloadField.TT_VERSION_CODE.equals(aVar2.a(i5))) {
                                        str = a(aVar2, i5);
                                    } else if ("package".equals(aVar2.a(i5))) {
                                        str2 = a(aVar2, i5);
                                    }
                                }
                                try {
                                    j5 = Long.parseLong(str);
                                } catch (c unused2) {
                                    j5 = -1;
                                }
                                if (j5 != -1) {
                                    PackageInfo packageInfo = new PackageInfo();
                                    packageInfo.versionName = str3;
                                    packageInfo.versionCode = (int) j5;
                                    packageInfo.packageName = str2;
                                    try {
                                        zipInputStream2.closeEntry();
                                    } catch (Throwable unused3) {
                                    }
                                    try {
                                        aVar2.a();
                                    } catch (Throwable unused4) {
                                    }
                                    if (zipInputStream != null) {
                                        try {
                                            zipInputStream.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused6) {
                                    }
                                    return packageInfo;
                                }
                                throw new c("versionCode获取失败: " + str);
                            } catch (Throwable th) {
                                th = th;
                                aVar = aVar2;
                                try {
                                    throw new c("throwable: " + th.getMessage() + th.toString());
                                } finally {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                throw new c("没有找到AndroidManifest.xml entry");
            } catch (Throwable th3) {
                th = th3;
                zipInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            zipInputStream = null;
        }
    }

    private static String a(int i5) {
        return (i5 >>> 24) == 1 ? "android:" : "";
    }

    private static PackageInfo b(@NonNull Context context, @NonNull File file, int i5) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            a("unzip_getpackagearchiveinfo", "packageManager == null");
            return null;
        }
        try {
            return packageManager.getPackageArchiveInfo(file.getPath(), i5);
        } catch (Throwable th) {
            a("unzip_getpackagearchiveinfo", "pm.getPackageArchiveInfo failed: " + th.getMessage());
            return null;
        }
    }

    public static PackageInfo a(@NonNull Context context, @NonNull File file, int i5) {
        if (com.ss.android.socialbase.downloader.i.a.a(268435456) && Build.VERSION.SDK_INT < 26) {
            try {
                return a(file);
            } catch (Throwable th) {
                a("getPackageInfo::unzip_getpackagearchiveinfo", th.getMessage());
                return b(context, file, i5);
            }
        }
        return b(context, file, i5);
    }

    private static void a(@NonNull String str, @NonNull String str2) {
        com.ss.android.socialbase.downloader.d.b g5 = com.ss.android.socialbase.downloader.downloader.c.g();
        if (g5 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CrashHianalyticsData.MESSAGE, str2);
        } catch (JSONException unused) {
        }
        g5.a(str, jSONObject, null, null);
    }

    private static String a(a aVar, int i5) {
        int b5 = aVar.b(i5);
        int c5 = aVar.c(i5);
        if (b5 == 3) {
            return aVar.d(i5);
        }
        return b5 == 2 ? String.format("?%s%08X", a(c5), Integer.valueOf(c5)) : (b5 < 16 || b5 > 31) ? String.format("<0x%X, type 0x%02X>", Integer.valueOf(c5), Integer.valueOf(b5)) : String.valueOf(c5);
    }

    public static String a(Context context, PackageInfo packageInfo, String str) {
        ApplicationInfo applicationInfo;
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) {
            return null;
        }
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (OutOfMemoryError e5) {
            a("getPackageInfo::fail_load_label", e5.getMessage());
            return null;
        }
    }
}

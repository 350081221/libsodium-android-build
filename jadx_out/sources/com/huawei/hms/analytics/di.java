package com.huawei.hms.analytics;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class di {
    private static Context klm;
    private static final Set<String> lmn = new HashSet();

    private static String lmn() {
        String str;
        at atVar = ar.lmn().lmn;
        JSONObject jSONObject = new JSONObject();
        ay ayVar = atVar.f8152n;
        if (ayVar == null || (str = ayVar.klm) == null) {
            str = "";
        }
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("lib_ver", "6.7.0.300");
            String str2 = atVar.klm;
            if (str2 == null) {
                str2 = dg.hij(klm);
            }
            jSONObject.put("app_ver", str2);
            Context context = klm;
            jSONObject.put(com.umeng.analytics.pro.bi.f12269o, context == null ? "" : context.getPackageName());
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("lib_type", SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
            jSONObject.put(com.umeng.analytics.pro.bi.f12278x, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
            jSONObject.put("os_ver", dg.ijk());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void lmn(Context context, Throwable th) {
        klm = context;
        lmn(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0007, B:10:0x000b, B:11:0x0015, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:23:0x0044, B:27:0x0052, B:29:0x0069, B:30:0x0072, B:32:0x0075, B:34:0x0080, B:36:0x0097, B:38:0x00a1, B:40:0x00a7, B:43:0x00ae, B:47:0x00d8, B:49:0x00e4, B:50:0x00ed, B:56:0x006e, B:57:0x0027, B:59:0x0031, B:62:0x003a), top: B:7:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {, blocks: (B:8:0x0007, B:10:0x000b, B:11:0x0015, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:23:0x0044, B:27:0x0052, B:29:0x0069, B:30:0x0072, B:32:0x0075, B:34:0x0080, B:36:0x0097, B:38:0x00a1, B:40:0x00a7, B:43:0x00ae, B:47:0x00d8, B:49:0x00e4, B:50:0x00ed, B:56:0x006e, B:57:0x0027, B:59:0x0031, B:62:0x003a), top: B:7:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void lmn(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.di.lmn(java.lang.Throwable):void");
    }
}

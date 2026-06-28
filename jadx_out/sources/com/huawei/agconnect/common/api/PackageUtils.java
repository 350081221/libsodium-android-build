package com.huawei.agconnect.common.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.agconnect.config.impl.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class PackageUtils {
    private static final String TAG = "PackageUtils";

    public static String getInstalledAppSign256(Context context, String str) {
        PackageManager packageManager;
        String str2;
        if (context == null || TextUtils.isEmpty(str) || (packageManager = context.getPackageManager()) == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            byte[] byteArray = packageInfo.signatures[0].toByteArray();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (messageDigest != null) {
                return Hex.encodeHexString(messageDigest.digest(byteArray));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "not found: " + str;
            Logger.e(TAG, str2);
            return null;
        } catch (RuntimeException unused2) {
            str2 = "get packageInfo runtimeException";
            Logger.e(TAG, str2);
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            str2 = "not found sha256 digest";
            Logger.e(TAG, str2);
            return null;
        }
    }

    public static boolean isSystemApp(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isSystemApplication(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "PackageUtils"
            r1 = 0
            if (r3 == 0) goto L44
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto Lc
            goto L44
        Lc:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L13
            return r1
        L13:
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r1)     // Catch: java.lang.Exception -> L18 android.content.pm.PackageManager.NameNotFoundException -> L20
            goto L35
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "getApplicationInfo Exception: "
            goto L27
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "not found: "
        L27:
            r3.append(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.huawei.agconnect.common.api.Logger.e(r0, r3)
            r3 = 0
        L35:
            if (r3 == 0) goto L44
            boolean r4 = isSystemUpdateApp(r3)
            if (r4 != 0) goto L43
            boolean r3 = isSystemApp(r3)
            if (r3 == 0) goto L44
        L43:
            r1 = 1
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.common.api.PackageUtils.isSystemApplication(android.content.Context, java.lang.String):boolean");
    }

    public static boolean isSystemUpdateApp(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 128) != 0;
    }
}

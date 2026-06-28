package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.huawei.agconnect.common.api.RandomWrapper;
import com.huawei.agconnect.common.appinfo.SafeAppInfo;
import java.util.UUID;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7851a = "aaid";

    /* renamed from: b, reason: collision with root package name */
    public static final String f7852b = "creationTime";

    private static String a(int i5) {
        return f.b(RandomWrapper.generateSecureRandom(i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        PackageInfo safeGetPackageInfo;
        if (context == null || (safeGetPackageInfo = SafeAppInfo.safeGetPackageInfo(context.getPackageManager(), context.getPackageName(), 64)) == null) {
            return null;
        }
        return safeGetPackageInfo.signatures[0].toCharsString();
    }

    public static synchronized String a(e eVar) {
        String str;
        synchronized (c.class) {
            if (eVar.e(f7851a)) {
                str = eVar.b(f7851a);
            } else {
                String uuid = UUID.randomUUID().toString();
                eVar.a(f7851a, uuid);
                eVar.a(f7852b, Long.valueOf(System.currentTimeMillis()));
                str = uuid;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized String a(String str) {
        String b5;
        synchronized (c.class) {
            b5 = b(str + a(32));
        }
        return b5;
    }

    private static String b(String str) {
        String a5 = f.a(str, "SHA-256");
        return ((TextUtils.isEmpty(a5) || a5.length() != 64) ? UUID.randomUUID() : c(a5)).toString();
    }

    private static UUID c(String str) {
        return new UUID(d(str.substring(0, 32)), d(str.substring(32, 64)));
    }

    private static long d(String str) {
        return (((((Long.decode("0x" + str.substring(0, 8)).longValue() << 16) | Long.decode("0x" + str.substring(8, 16)).longValue()) << 16) | Long.decode("0x" + str.substring(16, 24)).longValue()) << 16) | Long.decode("0x" + str.substring(24, 32)).longValue();
    }
}

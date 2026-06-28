package com.huawei.hms.opendevice;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.util.UUID;

/* loaded from: classes3.dex */
public class o {
    public static String a(Context context) {
        PushPreferences pushPreferences = new PushPreferences(context, com.huawei.agconnect.credential.obs.c.f7851a);
        if (pushPreferences.containsKey(com.huawei.agconnect.credential.obs.c.f7851a)) {
            return pushPreferences.getString(com.huawei.agconnect.credential.obs.c.f7851a);
        }
        return null;
    }

    public static TokenReq b(Context context, String str, String str2) {
        return b(context, str, null, null, str2);
    }

    public static synchronized String c(Context context) {
        String uuid;
        synchronized (o.class) {
            PushPreferences pushPreferences = new PushPreferences(context, com.huawei.agconnect.credential.obs.c.f7851a);
            if (pushPreferences.containsKey(com.huawei.agconnect.credential.obs.c.f7851a)) {
                uuid = pushPreferences.getString(com.huawei.agconnect.credential.obs.c.f7851a);
            } else {
                uuid = UUID.randomUUID().toString();
                pushPreferences.saveString(com.huawei.agconnect.credential.obs.c.f7851a, uuid);
                pushPreferences.saveLong(com.huawei.agconnect.credential.obs.c.f7852b, Long.valueOf(System.currentTimeMillis()));
            }
        }
        return uuid;
    }

    public static String d(Context context) {
        return AGConnectServicesConfig.fromContext(context).getString("client/project_id");
    }

    public static boolean e(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                if (!TextUtils.isEmpty(bundle.getString("com.huawei.hms.client.service.name:base"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e(HmsInstanceId.TAG, "isIntegratedBaseSdk failed.");
            return true;
        }
    }

    public static TokenReq b(Context context, String str) {
        return b(context, null, null, str, null);
    }

    public static TokenReq b(Context context, String str, String str2, String str3, String str4) {
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(context.getPackageName());
        tokenReq.setAppId(str);
        tokenReq.setScope(str4);
        tokenReq.setProjectId(str2);
        tokenReq.setSubjectId(str3);
        tokenReq.setMultiSender(false);
        if (TextUtils.isEmpty(str)) {
            tokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str2)) {
            tokenReq.setProjectId(d(context));
        }
        if (TextUtils.isEmpty(str4)) {
            tokenReq.setScope("HCM");
        }
        i a5 = i.a(context);
        if (!a5.getBoolean("hasRequestAgreement")) {
            tokenReq.setFirstTime(true);
            a5.saveBoolean("hasRequestAgreement", true);
        } else {
            tokenReq.setFirstTime(false);
        }
        return tokenReq;
    }

    public static DeleteTokenReq a(Context context, String str, String str2, String str3, String str4) {
        DeleteTokenReq deleteTokenReq = new DeleteTokenReq();
        deleteTokenReq.setAppId(str);
        deleteTokenReq.setScope(str4);
        deleteTokenReq.setProjectId(str2);
        deleteTokenReq.setPkgName(context.getPackageName());
        deleteTokenReq.setSubjectId(str3);
        if (TextUtils.isEmpty(str)) {
            deleteTokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str4)) {
            deleteTokenReq.setScope("HCM");
        }
        if (TextUtils.isEmpty(str2)) {
            deleteTokenReq.setProjectId(d(context));
        }
        return deleteTokenReq;
    }

    public static DeleteTokenReq a(Context context, String str, String str2) {
        return a(context, str, null, null, str2);
    }

    public static DeleteTokenReq a(Context context, String str) {
        return a(context, null, null, str, null);
    }

    public static DeleteTokenReq b(Context context) {
        return a(context, null, null, null, null);
    }
}

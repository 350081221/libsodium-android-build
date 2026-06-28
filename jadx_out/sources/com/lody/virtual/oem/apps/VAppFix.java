package com.lody.virtual.oem.apps;

import android.app.Application;
import android.content.pm.ActivityInfo;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.proxies.view.AutoFillManagerStub;
import com.lody.virtual.helper.compat.BuildCompat;

/* loaded from: classes3.dex */
public class VAppFix {
    public static void handleAfterAppStart(String str, String str2, Application application) {
        WeChat.disableBinderHook(str2, application);
    }

    public static void handleBeforeAppStart(String str, String str2) {
        try {
            DouYin.cleanFiles(str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (BuildCompat.isTiramisu()) {
            try {
                new AutoFillManagerStub().inject();
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static boolean isForceInVisiblePackageForVApp(String str) {
        try {
            if (VirtualCore.get().isVAppProcess() && DouYin.isDouYin(VClient.get().getCurrentPackage())) {
                if ("com.heytap.openid".equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean isNeedCallVAppHCallback(String str) {
        try {
            if (DouYin.isDouYin(str)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public static boolean isPreventStartActivity(ActivityInfo activityInfo) {
        return WeChat.preventStartActivity(activityInfo);
    }
}

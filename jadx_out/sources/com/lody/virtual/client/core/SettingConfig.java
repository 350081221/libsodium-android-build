package com.lody.virtual.client.core;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import com.lody.virtual.client.env.SpecialComponentList;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.seccomp.SeccompWhitelist;
import com.lody.virtual.helper.compat.BuildCompat;

/* loaded from: classes3.dex */
public abstract class SettingConfig {

    /* loaded from: classes3.dex */
    public static class FakeWifiStatus {
        public static String DEFAULT_BSSID = "66:55:44:33:22:11";
        public static String DEFAULT_MAC = "11:22:33:44:55:66";
        public static String DEFAULT_SSID = "VA_SSID";

        public String getBSSID() {
            return DEFAULT_BSSID;
        }

        public String getMAC() {
            return DEFAULT_MAC;
        }

        public String getSSID() {
            return DEFAULT_SSID;
        }
    }

    public static boolean isEnableSeccomp(String str) {
        try {
            if (!BuildCompat.isPie() || !VirtualRuntime.is64bit() || VirtualCore.get().isRunInExtProcess(str)) {
                return false;
            }
            if (SeccompWhitelist.isEnableSeccomp(str)) {
                return true;
            }
            if (!SeccompWhitelist.isProtectApp(str)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public boolean disableSetScreenOrientation(String str) {
        return false;
    }

    public String getBinderProviderAuthority() {
        return "com.yqtech.multiapp.virtual.service.BinderProvider";
    }

    public String getExtPackageHelperAuthority() {
        return "com.yqtech.multiapp.ext.virtual.service.ext_helper";
    }

    public abstract String getExtPackageName();

    public FakeWifiStatus getFakeWifiStatus() {
        return null;
    }

    public abstract String getMainPackageName();

    public String getVirtualSdcardAndroidDataName() {
        return "Android_va";
    }

    public boolean isAllowCreateShortcut() {
        return true;
    }

    public boolean isDisableDrawOverlays(String str) {
        return false;
    }

    public boolean isDisableTinker(String str) {
        return str.equals("com.tencent.mm");
    }

    public boolean isEnableIORedirect() {
        return true;
    }

    public boolean isEnableVirtualSdcardAndroidData() {
        return false;
    }

    public boolean isHideForegroundNotification() {
        return false;
    }

    public boolean isHostIntent(Intent intent) {
        return false;
    }

    public boolean isOutsideAction(String str) {
        if (!"android.media.action.IMAGE_CAPTURE".equals(str) && !"android.media.action.VIDEO_CAPTURE".equals(str) && !"android.intent.action.PICK".equals(str)) {
            return false;
        }
        return true;
    }

    public boolean isOutsideAppInfoPriority(String str) {
        return true;
    }

    public abstract boolean isOutsidePackage(String str);

    public boolean isUnProtectAction(String str) {
        return SpecialComponentList.SYSTEM_BROADCAST_ACTION.contains(str);
    }

    public boolean isUseRealApkPath(String str, ApplicationInfo applicationInfo) {
        return false;
    }

    public boolean isUseRealDataDir(String str) {
        return true;
    }

    public Intent onHandleLauncherIntent(Intent intent) {
        return null;
    }
}

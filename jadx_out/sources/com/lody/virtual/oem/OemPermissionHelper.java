package com.lody.virtual.oem;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.lody.virtual.helper.compat.BuildCompat;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class OemPermissionHelper {
    private static List<ComponentName> EMUI_AUTO_START_COMPONENTS = Arrays.asList(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"), new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.bootstart.BootStartActivity"), new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity"), new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupAwakedAppListActivity"));
    private static List<ComponentName> FLYME_AUTO_START_COMPONENTS = Arrays.asList(new ComponentName("com.meizu.safe", "com.meizu.safe.permission.SmartBGActivity"), new ComponentName("com.meizu.safe", "com.meizu.safe.security.HomeActivity"));
    private static List<ComponentName> VIVO_AUTO_START_COMPONENTS = Arrays.asList(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager"), new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity"), new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"), new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewActivity"));

    /* renamed from: com.lody.virtual.oem.OemPermissionHelper$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType;

        static {
            int[] iArr = new int[BuildCompat.ROMType.values().length];
            $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType = iArr;
            try {
                iArr[BuildCompat.ROMType.EMUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType.MIUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType.FLYME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType.COLOR_OS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType.LETV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType.VIVO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.ROMType._360.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Intent getPermissionActivityIntent(Context context) {
        switch (AnonymousClass1.$SwitchMap$com$lody$virtual$helper$compat$BuildCompat$ROMType[BuildCompat.getROMType().ordinal()]) {
            case 1:
                for (ComponentName componentName : EMUI_AUTO_START_COMPONENTS) {
                    Intent intent = new Intent();
                    intent.addFlags(268435456);
                    intent.setComponent(componentName);
                    if (verifyIntent(context, intent)) {
                        return intent;
                    }
                }
                return null;
            case 2:
                Intent intent2 = new Intent();
                intent2.addFlags(268435456);
                intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
                if (verifyIntent(context, intent2)) {
                    return intent2;
                }
                return null;
            case 3:
                for (ComponentName componentName2 : FLYME_AUTO_START_COMPONENTS) {
                    Intent intent3 = new Intent();
                    intent3.addFlags(268435456);
                    intent3.setComponent(componentName2);
                    if (verifyIntent(context, intent3)) {
                        return intent3;
                    }
                }
                return null;
            case 4:
                Intent intent4 = new Intent();
                intent4.addFlags(268435456);
                intent4.setClassName("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity");
                if (verifyIntent(context, intent4)) {
                    return intent4;
                }
                return null;
            case 5:
                Intent intent5 = new Intent();
                intent5.addFlags(268435456);
                intent5.setClassName("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity");
                if (verifyIntent(context, intent5)) {
                    return intent5;
                }
                return null;
            case 6:
                for (ComponentName componentName3 : VIVO_AUTO_START_COMPONENTS) {
                    Intent intent6 = new Intent();
                    intent6.addFlags(268435456);
                    intent6.setComponent(componentName3);
                    if (verifyIntent(context, intent6)) {
                        return intent6;
                    }
                }
                return null;
            case 7:
                Intent intent7 = new Intent();
                intent7.addFlags(268435456);
                intent7.setClassName("com.qihoo360.mobilesafe", "com.qihoo360.mobilesafe.ui.index.AppEnterActivity");
                if (verifyIntent(context, intent7)) {
                    return intent7;
                }
                return null;
            default:
                Intent intent8 = new Intent();
                intent8.addFlags(268435456);
                intent8.setClassName("com.android.settings", "com.android.settings.Settings");
                return intent8;
        }
    }

    private static boolean verifyIntent(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || !activityInfo.exported) {
            return false;
        }
        return true;
    }
}

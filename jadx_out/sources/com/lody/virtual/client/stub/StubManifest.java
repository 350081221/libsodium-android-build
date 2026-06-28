package com.lody.virtual.client.stub;

import android.Manifest;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.server.pm.VPackageManagerService;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public class StubManifest {
    public static final boolean BLOCK_GMS_CHIMERA = false;
    public static String EXT_PACKAGE_NAME;
    public static String PACKAGE_NAME;
    public static String STUB_ACTIVITY = ShadowActivity.class.getName();
    public static String STUB_DIALOG = ShadowDialogActivity.class.getName();
    public static String STUB_CP = ShadowContentProvider.class.getName();
    public static String STUB_JOB = ShadowJobService.class.getName();
    public static String STUB_SERVICE = ShadowService.class.getName();
    public static String RESOLVER_ACTIVITY = ResolverActivity.class.getName();
    public static String STUB_CP_AUTHORITY = null;
    public static String EXT_STUB_CP_AUTHORITY = null;
    public static String PROXY_CP_AUTHORITY = null;
    public static String EXT_PROXY_CP_AUTHORITY = null;
    public static int STUB_COUNT = 100;
    private static final Set<String> SystemPermissions = new HashSet();

    static {
        try {
            Field[] fields = Manifest.permission.class.getFields();
            Class<?> cls = Class.forName("android.annotation.SystemApi");
            for (Field field : fields) {
                if (field.getAnnotation(cls) != null) {
                    SystemPermissions.add((String) field.get(Manifest.permission.class));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static String getProxyAuthority(boolean z4) {
        return z4 ? EXT_PROXY_CP_AUTHORITY : PROXY_CP_AUTHORITY;
    }

    public static String getStubActivityName(int i5, ActivityInfo activityInfo) {
        try {
            ActivityInfo activityInfo2 = VPackageManagerService.get().getActivityInfo(new ComponentName(activityInfo.packageName, activityInfo.name), 0, 0);
            boolean isFixedOrientationLandscape = isFixedOrientationLandscape(activityInfo2);
            VLog.d(VLog.TAG_DEFAULT, "getStubActivityName isFixedOrientationLandscape:" + isFixedOrientationLandscape + ",info:" + activityInfo2 + ",index:" + i5, new Object[0]);
            if (isFixedOrientationLandscape) {
                return String.format(Locale.ENGLISH, "%s$P%d_Land", STUB_ACTIVITY, Integer.valueOf(i5));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return String.format(Locale.ENGLISH, "%s$P%d", STUB_ACTIVITY, Integer.valueOf(i5));
    }

    public static String getStubAuthority(int i5, boolean z4) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        objArr[0] = z4 ? EXT_STUB_CP_AUTHORITY : STUB_CP_AUTHORITY;
        objArr[1] = Integer.valueOf(i5);
        return String.format(locale, "%s%d", objArr);
    }

    public static String getStubContentProviderName(int i5) {
        return String.format(Locale.ENGLISH, "%s$P%d", STUB_CP, Integer.valueOf(i5));
    }

    public static String getStubDialogName(int i5, ActivityInfo activityInfo) {
        try {
            ActivityInfo activityInfo2 = VPackageManagerService.get().getActivityInfo(new ComponentName(activityInfo.packageName, activityInfo.name), 0, 0);
            boolean isFixedOrientationLandscape = isFixedOrientationLandscape(activityInfo2);
            VLog.d(VLog.TAG_DEFAULT, "getStubDialogName isFixedOrientationLandscape:" + isFixedOrientationLandscape + ",info:" + activityInfo2 + ",index:" + i5, new Object[0]);
            if (isFixedOrientationLandscape) {
                return String.format(Locale.ENGLISH, "%s$P%d_Land", STUB_DIALOG, Integer.valueOf(i5));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return String.format(Locale.ENGLISH, "%s$P%d", STUB_DIALOG, Integer.valueOf(i5));
    }

    public static String getStubPackageName(boolean z4) {
        return z4 ? EXT_PACKAGE_NAME : PACKAGE_NAME;
    }

    public static String getStubServiceName(int i5) {
        return String.format(Locale.ENGLISH, "%s$P%d", STUB_SERVICE, Integer.valueOf(i5));
    }

    public static boolean isFixedOrientationLandscape(ActivityInfo activityInfo) {
        int i5 = activityInfo.screenOrientation;
        return i5 == 0 || i5 == 6 || i5 == 8 || i5 == 11;
    }

    public static boolean isHostPackageName(String str) {
        if (!PACKAGE_NAME.equals(str) && !EXT_PACKAGE_NAME.equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean isSystemPermission(String str) {
        return SystemPermissions.contains(str);
    }
}

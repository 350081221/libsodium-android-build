package com.lody.virtual.helper.compat;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Process;
import android.util.DisplayMetrics;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.os.VUserHandle;
import java.io.File;
import mirror.RefStaticMethod;
import mirror.android.content.pm.PackageParserJellyBean;
import mirror.android.content.pm.PackageParserJellyBean17;
import mirror.android.content.pm.PackageParserLollipop;
import mirror.android.content.pm.PackageParserLollipop22;
import mirror.android.content.pm.PackageParserMarshmallow;
import mirror.android.content.pm.PackageParserNougat;
import mirror.android.content.pm.PackageParserPie;
import mirror.android.content.pm.PackageParserTiramisu;
import mirror.android.content.pm.PackageUserState;
import mirror.android.content.pm.pkg.FrameworkPackageUserState;

/* loaded from: classes3.dex */
public class PackageParserCompat {
    public static final int[] GIDS = VirtualCore.get().getGids();
    private static final int API_LEVEL = Build.VERSION.SDK_INT;
    private static final int myUserId = VUserHandle.getUserId(Process.myUid());
    private static final Object sUserState = getUserState();

    public static void collectCertificates(PackageParser packageParser, PackageParser.Package r6, int i5) throws Throwable {
        if (BuildCompat.isPie()) {
            PackageParserPie.collectCertificates.callWithException(r6, Boolean.TRUE);
            return;
        }
        int i6 = API_LEVEL;
        if (i6 >= 24) {
            PackageParserNougat.collectCertificates.callWithException(r6, Integer.valueOf(i5));
            return;
        }
        if (i6 >= 23) {
            PackageParserMarshmallow.collectCertificates.callWithException(packageParser, r6, Integer.valueOf(i5));
            return;
        }
        if (i6 >= 22) {
            PackageParserLollipop22.collectCertificates.callWithException(packageParser, r6, Integer.valueOf(i5));
            return;
        }
        if (i6 >= 21) {
            PackageParserLollipop.collectCertificates.callWithException(packageParser, r6, Integer.valueOf(i5));
            return;
        }
        if (i6 >= 17) {
            PackageParserJellyBean17.collectCertificates.callWithException(packageParser, r6, Integer.valueOf(i5));
        } else if (i6 >= 16) {
            PackageParserJellyBean.collectCertificates.callWithException(packageParser, r6, Integer.valueOf(i5));
        } else {
            mirror.android.content.pm.PackageParser.collectCertificates.call(packageParser, r6, Integer.valueOf(i5));
        }
    }

    public static PackageParser createParser(File file) {
        int i5 = API_LEVEL;
        if (i5 >= 33) {
            return PackageParserTiramisu.ctor.newInstance();
        }
        if (i5 >= 23) {
            return PackageParserMarshmallow.ctor.newInstance();
        }
        if (i5 >= 22) {
            return PackageParserLollipop22.ctor.newInstance();
        }
        if (i5 >= 21) {
            return PackageParserLollipop.ctor.newInstance();
        }
        if (i5 >= 17) {
            return PackageParserJellyBean17.ctor.newInstance(file.getAbsolutePath());
        }
        if (i5 >= 16) {
            return PackageParserJellyBean.ctor.newInstance(file.getAbsolutePath());
        }
        return mirror.android.content.pm.PackageParser.ctor.newInstance(file.getAbsolutePath());
    }

    public static ActivityInfo generateActivityInfo(PackageParser.Activity activity, int i5) {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.generateActivityInfo.call(activity, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.generateActivityInfo.call(activity, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 22) {
            return PackageParserLollipop22.generateActivityInfo.call(activity, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 21) {
            return PackageParserLollipop.generateActivityInfo.call(activity, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.generateActivityInfo.call(activity, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.generateActivityInfo.call(activity, Integer.valueOf(i5), Boolean.FALSE, 1, Integer.valueOf(myUserId));
        }
        return mirror.android.content.pm.PackageParser.generateActivityInfo.call(activity, Integer.valueOf(i5));
    }

    public static ApplicationInfo generateApplicationInfo(PackageParser.Package r6, int i5) {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.generateApplicationInfo.call(r6, Integer.valueOf(i5), sUserState);
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.generateApplicationInfo.call(r6, Integer.valueOf(i5), sUserState);
        }
        if (i6 >= 22) {
            return PackageParserLollipop22.generateApplicationInfo.call(r6, Integer.valueOf(i5), sUserState);
        }
        if (i6 >= 21) {
            return PackageParserLollipop.generateApplicationInfo.call(r6, Integer.valueOf(i5), sUserState);
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.generateApplicationInfo.call(r6, Integer.valueOf(i5), sUserState);
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.generateApplicationInfo.call(r6, Integer.valueOf(i5), Boolean.FALSE, 1);
        }
        return mirror.android.content.pm.PackageParser.generateApplicationInfo.call(r6, Integer.valueOf(i5));
    }

    public static PackageInfo generatePackageInfo(PackageParser.Package r11, int i5, long j5, long j6) {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null, sUserState);
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null, sUserState);
        }
        if (i6 >= 21) {
            RefStaticMethod<PackageInfo> refStaticMethod = PackageParserLollipop22.generatePackageInfo;
            if (refStaticMethod != null) {
                return refStaticMethod.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null, sUserState);
            }
            return PackageParserLollipop.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null, sUserState);
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null, sUserState);
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6), null);
        }
        return mirror.android.content.pm.PackageParser.generatePackageInfo.call(r11, GIDS, Integer.valueOf(i5), Long.valueOf(j5), Long.valueOf(j6));
    }

    public static ProviderInfo generateProviderInfo(PackageParser.Provider provider, int i5) {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.generateProviderInfo.call(provider, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.generateProviderInfo.call(provider, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 22) {
            return PackageParserLollipop22.generateProviderInfo.call(provider, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 21) {
            return PackageParserLollipop.generateProviderInfo.call(provider, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.generateProviderInfo.call(provider, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.generateProviderInfo.call(provider, Integer.valueOf(i5), Boolean.FALSE, 1, Integer.valueOf(myUserId));
        }
        return mirror.android.content.pm.PackageParser.generateProviderInfo.call(provider, Integer.valueOf(i5));
    }

    public static ServiceInfo generateServiceInfo(PackageParser.Service service, int i5) {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.generateServiceInfo.call(service, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.generateServiceInfo.call(service, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 22) {
            return PackageParserLollipop22.generateServiceInfo.call(service, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 21) {
            return PackageParserLollipop.generateServiceInfo.call(service, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.generateServiceInfo.call(service, Integer.valueOf(i5), sUserState, Integer.valueOf(myUserId));
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.generateServiceInfo.call(service, Integer.valueOf(i5), Boolean.FALSE, 1, Integer.valueOf(myUserId));
        }
        return mirror.android.content.pm.PackageParser.generateServiceInfo.call(service, Integer.valueOf(i5));
    }

    public static Object getUserState() {
        if (BuildCompat.isTiramisu()) {
            return FrameworkPackageUserState.DEFAULT;
        }
        if (API_LEVEL >= 17) {
            return PackageUserState.ctor.newInstance();
        }
        return null;
    }

    public static PackageParser.Package parsePackage(PackageParser packageParser, File file, int i5) throws Throwable {
        int i6 = API_LEVEL;
        if (i6 >= 33) {
            return PackageParserTiramisu.parsePackage.callWithException(packageParser, file, Integer.valueOf(i5));
        }
        if (i6 >= 23) {
            return PackageParserMarshmallow.parsePackage.callWithException(packageParser, file, Integer.valueOf(i5));
        }
        if (i6 >= 22) {
            return PackageParserLollipop22.parsePackage.callWithException(packageParser, file, Integer.valueOf(i5));
        }
        if (i6 >= 21) {
            return PackageParserLollipop.parsePackage.callWithException(packageParser, file, Integer.valueOf(i5));
        }
        if (i6 >= 17) {
            return PackageParserJellyBean17.parsePackage.callWithException(packageParser, file, null, new DisplayMetrics(), Integer.valueOf(i5));
        }
        if (i6 >= 16) {
            return PackageParserJellyBean.parsePackage.callWithException(packageParser, file, null, new DisplayMetrics(), Integer.valueOf(i5));
        }
        return mirror.android.content.pm.PackageParser.parsePackage.callWithException(packageParser, file, null, new DisplayMetrics(), Integer.valueOf(i5));
    }
}

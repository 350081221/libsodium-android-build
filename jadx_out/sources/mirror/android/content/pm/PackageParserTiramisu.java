package mirror.android.content.pm;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import java.io.File;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefMethod;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class PackageParserTiramisu {
    public static Class<?> TYPE = RefClass.load((Class<?>) PackageParserTiramisu.class, "android.content.pm.PackageParser");
    public static RefConstructor<android.content.pm.PackageParser> ctor;

    @MethodReflectParams({"android.content.pm.PackageParser$Activity", com.swift.sandhook.annotation.MethodReflectParams.INT, "android.content.pm.pkg.FrameworkPackageUserState", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ActivityInfo> generateActivityInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Package", com.swift.sandhook.annotation.MethodReflectParams.INT, "android.content.pm.pkg.FrameworkPackageUserState"})
    public static RefStaticMethod<ApplicationInfo> generateApplicationInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Package", "[I", com.swift.sandhook.annotation.MethodReflectParams.INT, com.swift.sandhook.annotation.MethodReflectParams.LONG, com.swift.sandhook.annotation.MethodReflectParams.LONG, "java.util.Set", "android.content.pm.pkg.FrameworkPackageUserState"})
    public static RefStaticMethod<PackageInfo> generatePackageInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Provider", com.swift.sandhook.annotation.MethodReflectParams.INT, "android.content.pm.pkg.FrameworkPackageUserState", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ProviderInfo> generateProviderInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Service", com.swift.sandhook.annotation.MethodReflectParams.INT, "android.content.pm.pkg.FrameworkPackageUserState", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ServiceInfo> generateServiceInfo;

    @MethodParams({File.class, int.class})
    public static RefMethod<PackageParser.Package> parsePackage;
}

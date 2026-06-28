package mirror.android.content.pm;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.List;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.RefStaticMethod;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class PackageParser {
    public static Class<?> TYPE = RefClass.load((Class<?>) PackageParser.class, "android.content.pm.PackageParser");

    @MethodReflectParams({"android.content.pm.PackageParser$Package", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefMethod<Void> collectCertificates;

    @MethodParams({String.class})
    public static RefConstructor<android.content.pm.PackageParser> ctor;

    @MethodReflectParams({"android.content.pm.PackageParser$Activity", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ActivityInfo> generateActivityInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Package", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ApplicationInfo> generateApplicationInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Package", "[I", com.swift.sandhook.annotation.MethodReflectParams.INT, com.swift.sandhook.annotation.MethodReflectParams.LONG, com.swift.sandhook.annotation.MethodReflectParams.LONG})
    public static RefStaticMethod<PackageInfo> generatePackageInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Provider", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ProviderInfo> generateProviderInfo;

    @MethodReflectParams({"android.content.pm.PackageParser$Service", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<ServiceInfo> generateServiceInfo;

    @MethodParams({File.class, String.class, DisplayMetrics.class, int.class})
    public static RefMethod<PackageParser.Package> parsePackage;

    /* loaded from: classes4.dex */
    public static class Activity {
        public static Class<?> TYPE = RefClass.load((Class<?>) Activity.class, "android.content.pm.PackageParser$Activity");
        public static RefObject<ActivityInfo> info;
    }

    /* loaded from: classes4.dex */
    public static class Component {
        public static Class<?> TYPE = RefClass.load((Class<?>) Component.class, "android.content.pm.PackageParser$Component");
        public static RefObject<String> className;
        public static RefObject<ComponentName> componentName;
        public static RefObject<List<IntentFilter>> intents;
    }

    /* loaded from: classes4.dex */
    public static class Package {
        public static Class<?> TYPE = RefClass.load((Class<?>) Package.class, "android.content.pm.PackageParser$Package");
        public static RefObject<List> activities;
        public static RefObject<Bundle> mAppMetaData;
        public static RefObject<String> mSharedUserId;
        public static RefObject<Signature[]> mSignatures;
        public static RefObject<Object> mSigningDetails;
        public static RefObject<Integer> mVersionCode;
        public static RefObject<String> packageName;
        public static RefObject<List> permissionGroups;
        public static RefObject<List> permissions;
        public static RefObject<List<String>> protectedBroadcasts;
        public static RefObject<List> providers;
        public static RefObject<List> receivers;
        public static RefObject<List<String>> requestedPermissions;
        public static RefObject<List> services;
    }

    /* loaded from: classes4.dex */
    public static class Permission {
        public static Class<?> TYPE = RefClass.load((Class<?>) Permission.class, "android.content.pm.PackageParser$Permission");
        public static RefObject<PermissionInfo> info;
    }

    /* loaded from: classes4.dex */
    public static class PermissionGroup {
        public static Class<?> TYPE = RefClass.load((Class<?>) PermissionGroup.class, "android.content.pm.PackageParser$PermissionGroup");
        public static RefObject<PermissionGroupInfo> info;
    }

    /* loaded from: classes4.dex */
    public static class Provider {
        public static Class<?> TYPE = RefClass.load((Class<?>) Provider.class, "android.content.pm.PackageParser$Provider");
        public static RefObject<ProviderInfo> info;
    }

    /* loaded from: classes4.dex */
    public static class Service {
        public static Class<?> TYPE = RefClass.load((Class<?>) Provider.class, "android.content.pm.PackageParser$Service");
        public static RefObject<ServiceInfo> info;
    }

    /* loaded from: classes4.dex */
    public static class SigningDetails {
        public static RefStaticObject<Parcelable.Creator<Object>> CREATOR;
        public static Class<?> TYPE = RefClass.load((Class<?>) SigningDetails.class, "android.content.pm.PackageParser$SigningDetails");
        public static RefMethod<Boolean> hasPastSigningCertificates;
        public static RefMethod<Boolean> hasSignatures;
        public static RefObject<Signature[]> pastSigningCertificates;
        public static RefObject<Signature[]> signatures;
        public static RefMethod<Void> writeToParcel;
    }
}

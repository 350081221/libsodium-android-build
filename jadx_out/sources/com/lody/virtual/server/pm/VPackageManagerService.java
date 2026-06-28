package com.lody.virtual.server.pm;

import a1.i;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.lody.virtual.GmsSupport;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ComponentFixer;
import com.lody.virtual.client.stub.StubManifest;
import com.lody.virtual.helper.compat.ObjectsCompat;
import com.lody.virtual.helper.compat.PermissionCompat;
import com.lody.virtual.helper.utils.SignaturesUtils;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.remote.ReceiverInfo;
import com.lody.virtual.remote.VParceledListSlice;
import com.lody.virtual.server.interfaces.IPackageManager;
import com.lody.virtual.server.pm.installer.VPackageInstallerService;
import com.lody.virtual.server.pm.parser.PackageParserEx;
import com.lody.virtual.server.pm.parser.VPackage;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class VPackageManagerService extends IPackageManager.Stub {
    static final String TAG = "PackageManager";
    private final ActivityIntentResolver mActivities;
    private final Map<String, String[]> mDangerousPermissions;
    private final Map<String, VPackage> mPackages;
    private final HashMap<String, VPackage.PermissionGroupComponent> mPermissionGroups;
    private final HashMap<String, VPackage.PermissionComponent> mPermissions;
    private final ProviderIntentResolver mProviders;
    private final HashMap<String, VPackage.ProviderComponent> mProvidersByAuthority;
    private final HashMap<ComponentName, VPackage.ProviderComponent> mProvidersByComponent;
    private final ActivityIntentResolver mReceivers;
    private final ServiceIntentResolver mServices;
    static final Comparator<ResolveInfo> sResolvePrioritySorter = new Comparator<ResolveInfo>() { // from class: com.lody.virtual.server.pm.VPackageManagerService.1
        @Override // java.util.Comparator
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            int i5 = resolveInfo.priority;
            int i6 = resolveInfo2.priority;
            if (i5 != i6) {
                return i5 > i6 ? -1 : 1;
            }
            int i7 = resolveInfo.preferredOrder;
            int i8 = resolveInfo2.preferredOrder;
            if (i7 != i8) {
                return i7 > i8 ? -1 : 1;
            }
            boolean z4 = resolveInfo.isDefault;
            if (z4 != resolveInfo2.isDefault) {
                return z4 ? -1 : 1;
            }
            int i9 = resolveInfo.match;
            int i10 = resolveInfo2.match;
            if (i9 != i10) {
                return i9 > i10 ? -1 : 1;
            }
            return 0;
        }
    };
    private static final Singleton<VPackageManagerService> gService = new Singleton<VPackageManagerService>() { // from class: com.lody.virtual.server.pm.VPackageManagerService.2
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VPackageManagerService create() {
            return new VPackageManagerService();
        }
    };
    private static final Comparator<ProviderInfo> sProviderInitOrderSorter = new Comparator<ProviderInfo>() { // from class: com.lody.virtual.server.pm.VPackageManagerService.3
        @Override // java.util.Comparator
        public int compare(ProviderInfo providerInfo, ProviderInfo providerInfo2) {
            return Integer.compare(providerInfo2.initOrder, providerInfo.initOrder);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ActivityIntentResolver extends IntentResolver<VPackage.ActivityIntentInfo, ResolveInfo> {
        private final HashMap<ComponentName, VPackage.ActivityComponent> mActivities;
        private int mFlags;

        private ActivityIntentResolver() {
            this.mActivities = new HashMap<>();
        }

        public final void addActivity(VPackage.ActivityComponent activityComponent, String str) {
            this.mActivities.put(activityComponent.getComponentName(), activityComponent);
            int size = activityComponent.intents.size();
            for (int i5 = 0; i5 < size; i5++) {
                VPackage.ActivityIntentInfo activityIntentInfo = (VPackage.ActivityIntentInfo) activityComponent.intents.get(i5);
                if (activityIntentInfo.filter.getPriority() > 0 && "activity".equals(str)) {
                    activityIntentInfo.filter.setPriority(0);
                    Log.w(VPackageManagerService.TAG, "Package " + activityComponent.info.applicationInfo.packageName + " has activity " + activityComponent.className + " with priority > 0, forcing to 0");
                }
                addFilter(activityIntentInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public void dumpFilter(PrintWriter printWriter, String str, VPackage.ActivityIntentInfo activityIntentInfo) {
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        protected void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i5) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean isFilterStopped(VPackage.ActivityIntentInfo activityIntentInfo) {
            return false;
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z4, int i5) {
            this.mFlags = z4 ? 65536 : 0;
            return super.queryIntent(intent, str, z4, i5);
        }

        List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i5, ArrayList<VPackage.ActivityComponent> arrayList, int i6) {
            boolean z4;
            if (arrayList == null) {
                return null;
            }
            this.mFlags = i5;
            if ((i5 & 65536) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                ArrayList<II> arrayList3 = arrayList.get(i7).intents;
                if (arrayList3 != 0 && arrayList3.size() > 0) {
                    VPackage.ActivityIntentInfo[] activityIntentInfoArr = new VPackage.ActivityIntentInfo[arrayList3.size()];
                    arrayList3.toArray(activityIntentInfoArr);
                    arrayList2.add(activityIntentInfoArr);
                }
            }
            return super.queryIntentFromList(intent, str, z4, arrayList2, i6);
        }

        public final void removeActivity(VPackage.ActivityComponent activityComponent, String str) {
            this.mActivities.remove(activityComponent.getComponentName());
            int size = activityComponent.intents.size();
            for (int i5 = 0; i5 < size; i5++) {
                removeFilter((VPackage.ActivityIntentInfo) activityComponent.intents.get(i5));
            }
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        protected void sortResults(List<ResolveInfo> list) {
            Collections.sort(list, VPackageManagerService.sResolvePrioritySorter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean allowFilterResult(VPackage.ActivityIntentInfo activityIntentInfo, List<ResolveInfo> list) {
            ActivityInfo activityInfo = activityIntentInfo.activity.info;
            for (int size = list.size() - 1; size >= 0; size--) {
                ActivityInfo activityInfo2 = list.get(size).activityInfo;
                if (ObjectsCompat.equals(activityInfo2.name, activityInfo.name) && ObjectsCompat.equals(activityInfo2.packageName, activityInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public Object filterToLabel(VPackage.ActivityIntentInfo activityIntentInfo) {
            return activityIntentInfo.activity;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean isPackageForFilter(String str, VPackage.ActivityIntentInfo activityIntentInfo) {
            return str.equals(activityIntentInfo.activity.owner.packageName);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public VPackage.ActivityIntentInfo[] newArray(int i5) {
            return new VPackage.ActivityIntentInfo[i5];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public ResolveInfo newResult(VPackage.ActivityIntentInfo activityIntentInfo, int i5, int i6) {
            ActivityInfo generateActivityInfo;
            VPackage.ActivityComponent activityComponent = activityIntentInfo.activity;
            PackageSetting packageSetting = (PackageSetting) activityComponent.owner.mExtras;
            if (!packageSetting.isEnabledAndMatchLPr(activityComponent.info, this.mFlags, i6) || (generateActivityInfo = PackageParserEx.generateActivityInfo(activityComponent, this.mFlags, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess())) == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.activityInfo = generateActivityInfo;
            if ((this.mFlags & 64) != 0) {
                resolveInfo.filter = activityIntentInfo.filter;
            }
            resolveInfo.priority = activityIntentInfo.filter.getPriority();
            resolveInfo.preferredOrder = activityComponent.owner.mPreferredOrder;
            resolveInfo.match = i5;
            resolveInfo.isDefault = activityIntentInfo.hasDefault;
            resolveInfo.labelRes = activityIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = activityIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = activityIntentInfo.icon;
            return resolveInfo;
        }

        List<ResolveInfo> queryIntent(Intent intent, String str, int i5, int i6) {
            this.mFlags = i5;
            return super.queryIntent(intent, str, (i5 & 65536) != 0, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class ServiceIntentResolver extends IntentResolver<VPackage.ServiceIntentInfo, ResolveInfo> {
        private int mFlags;
        private final HashMap<ComponentName, VPackage.ServiceComponent> mServices;

        private ServiceIntentResolver() {
            this.mServices = new HashMap<>();
        }

        public final void addService(VPackage.ServiceComponent serviceComponent) {
            this.mServices.put(serviceComponent.getComponentName(), serviceComponent);
            int size = serviceComponent.intents.size();
            for (int i5 = 0; i5 < size; i5++) {
                addFilter((VPackage.ServiceIntentInfo) serviceComponent.intents.get(i5));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public void dumpFilter(PrintWriter printWriter, String str, VPackage.ServiceIntentInfo serviceIntentInfo) {
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        protected void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i5) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean isFilterStopped(VPackage.ServiceIntentInfo serviceIntentInfo) {
            return false;
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        public List<ResolveInfo> queryIntent(Intent intent, String str, boolean z4, int i5) {
            this.mFlags = z4 ? 65536 : 0;
            return super.queryIntent(intent, str, z4, i5);
        }

        public List<ResolveInfo> queryIntentForPackage(Intent intent, String str, int i5, ArrayList<VPackage.ServiceComponent> arrayList, int i6) {
            boolean z4;
            if (arrayList == null) {
                return null;
            }
            this.mFlags = i5;
            if ((i5 & 65536) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                ArrayList<II> arrayList3 = arrayList.get(i7).intents;
                if (arrayList3 != 0 && arrayList3.size() > 0) {
                    VPackage.ServiceIntentInfo[] serviceIntentInfoArr = new VPackage.ServiceIntentInfo[arrayList3.size()];
                    arrayList3.toArray(serviceIntentInfoArr);
                    arrayList2.add(serviceIntentInfoArr);
                }
            }
            return super.queryIntentFromList(intent, str, z4, arrayList2, i6);
        }

        public final void removeService(VPackage.ServiceComponent serviceComponent) {
            this.mServices.remove(serviceComponent.getComponentName());
            int size = serviceComponent.intents.size();
            for (int i5 = 0; i5 < size; i5++) {
                removeFilter((VPackage.ServiceIntentInfo) serviceComponent.intents.get(i5));
            }
        }

        @Override // com.lody.virtual.server.pm.IntentResolver
        protected void sortResults(List<ResolveInfo> list) {
            Collections.sort(list, VPackageManagerService.sResolvePrioritySorter);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean allowFilterResult(VPackage.ServiceIntentInfo serviceIntentInfo, List<ResolveInfo> list) {
            ServiceInfo serviceInfo = serviceIntentInfo.service.info;
            for (int size = list.size() - 1; size >= 0; size--) {
                ServiceInfo serviceInfo2 = list.get(size).serviceInfo;
                if (ObjectsCompat.equals(serviceInfo2.name, serviceInfo.name) && ObjectsCompat.equals(serviceInfo2.packageName, serviceInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public Object filterToLabel(VPackage.ServiceIntentInfo serviceIntentInfo) {
            return serviceIntentInfo.service;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public boolean isPackageForFilter(String str, VPackage.ServiceIntentInfo serviceIntentInfo) {
            return str.equals(serviceIntentInfo.service.owner.packageName);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public VPackage.ServiceIntentInfo[] newArray(int i5) {
            return new VPackage.ServiceIntentInfo[i5];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.lody.virtual.server.pm.IntentResolver
        public ResolveInfo newResult(VPackage.ServiceIntentInfo serviceIntentInfo, int i5, int i6) {
            ServiceInfo generateServiceInfo;
            VPackage.ServiceComponent serviceComponent = serviceIntentInfo.service;
            PackageSetting packageSetting = (PackageSetting) serviceComponent.owner.mExtras;
            if (!packageSetting.isEnabledAndMatchLPr(serviceComponent.info, this.mFlags, i6) || (generateServiceInfo = PackageParserEx.generateServiceInfo(serviceComponent, this.mFlags, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess())) == null) {
                return null;
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.serviceInfo = generateServiceInfo;
            if ((this.mFlags & 64) != 0) {
                resolveInfo.filter = serviceIntentInfo.filter;
            }
            resolveInfo.priority = serviceIntentInfo.filter.getPriority();
            resolveInfo.preferredOrder = serviceComponent.owner.mPreferredOrder;
            resolveInfo.match = i5;
            resolveInfo.isDefault = serviceIntentInfo.hasDefault;
            resolveInfo.labelRes = serviceIntentInfo.labelRes;
            resolveInfo.nonLocalizedLabel = serviceIntentInfo.nonLocalizedLabel;
            resolveInfo.icon = serviceIntentInfo.icon;
            return resolveInfo;
        }

        public List<ResolveInfo> queryIntent(Intent intent, String str, int i5, int i6) {
            this.mFlags = i5;
            return super.queryIntent(intent, str, (i5 & 65536) != 0, i6);
        }
    }

    private void checkUserId(int i5) {
        if (VUserManagerService.get().exists(i5)) {
            return;
        }
        throw new SecurityException("Invalid userId " + i5);
    }

    private ResolveInfo chooseBestActivity(Intent intent, String str, int i5, List<ResolveInfo> list) {
        if (list != null) {
            int size = list.size();
            if (size == 1) {
                return list.get(0);
            }
            if (size > 1) {
                ResolveInfo resolveInfo = list.get(0);
                ResolveInfo resolveInfo2 = list.get(1);
                int i6 = resolveInfo.priority;
                if (i6 == resolveInfo2.priority && resolveInfo.preferredOrder == resolveInfo2.preferredOrder && resolveInfo.isDefault == resolveInfo2.isDefault) {
                    ResolveInfo findPreferredActivity = findPreferredActivity(intent, str, i5, list, i6);
                    if (findPreferredActivity != null) {
                        return findPreferredActivity;
                    }
                    return list.get(0);
                }
                return list.get(0);
            }
            return null;
        }
        return null;
    }

    private PermissionInfo findPermission(String str) {
        synchronized (this.mPackages) {
            Iterator<VPackage> it = this.mPackages.values().iterator();
            while (it.hasNext()) {
                ArrayList<VPackage.PermissionComponent> arrayList = it.next().permissions;
                if (arrayList != null) {
                    Iterator<VPackage.PermissionComponent> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        VPackage.PermissionComponent next = it2.next();
                        PermissionInfo permissionInfo = next.info;
                        if (permissionInfo != null && TextUtils.equals(str, permissionInfo.name)) {
                            return next.info;
                        }
                    }
                }
            }
            return null;
        }
    }

    private ResolveInfo findPreferredActivity(Intent intent, String str, int i5, List<ResolveInfo> list, int i6) {
        return null;
    }

    private PackageInfo generatePackageInfo(VPackage vPackage, PackageSetting packageSetting, int i5, int i6) {
        return PackageParserEx.generatePackageInfo(vPackage, packageSetting, updateFlagsNought(i5), packageSetting.firstInstallTime, packageSetting.lastUpdateTime, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
    }

    public static VPackageManagerService get() {
        return gService.get();
    }

    private boolean hasRequestedPermission(String str, String str2) {
        VPackage vPackage;
        ArrayList<String> arrayList;
        synchronized (this.mPackages) {
            vPackage = this.mPackages.get(str2);
        }
        if (vPackage != null && (arrayList = vPackage.requestedPermissions) != null) {
            return arrayList.contains(str);
        }
        return false;
    }

    public static void systemReady() {
        new VUserManagerService(VirtualCore.get().getContext(), get(), new char[0], get().mPackages);
    }

    private int updateFlagsNought(int i5) {
        return (i5 & 786432) != 0 ? i5 : i5 | 786432;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public boolean activitySupportsIntent(ComponentName componentName, Intent intent, String str) {
        synchronized (this.mPackages) {
            VPackage.ActivityComponent activityComponent = (VPackage.ActivityComponent) this.mActivities.mActivities.get(componentName);
            if (activityComponent == null) {
                return false;
            }
            for (int i5 = 0; i5 < activityComponent.intents.size(); i5++) {
                if (((VPackage.ActivityIntentInfo) activityComponent.intents.get(i5)).filter.match(intent.getAction(), str, intent.getScheme(), intent.getData(), intent.getCategories(), TAG) >= 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void analyzePackageLocked(VPackage vPackage) {
        int size = vPackage.activities.size();
        for (int i5 = 0; i5 < size; i5++) {
            VPackage.ActivityComponent activityComponent = vPackage.activities.get(i5);
            ActivityInfo activityInfo = activityComponent.info;
            if (activityInfo.processName == null) {
                activityInfo.processName = activityInfo.packageName;
            }
            this.mActivities.addActivity(activityComponent, "activity");
        }
        int size2 = vPackage.services.size();
        for (int i6 = 0; i6 < size2; i6++) {
            VPackage.ServiceComponent serviceComponent = vPackage.services.get(i6);
            ServiceInfo serviceInfo = serviceComponent.info;
            if (serviceInfo.processName == null) {
                serviceInfo.processName = serviceInfo.packageName;
            }
            this.mServices.addService(serviceComponent);
        }
        int size3 = vPackage.receivers.size();
        for (int i7 = 0; i7 < size3; i7++) {
            VPackage.ActivityComponent activityComponent2 = vPackage.receivers.get(i7);
            ActivityInfo activityInfo2 = activityComponent2.info;
            if (activityInfo2.processName == null) {
                activityInfo2.processName = activityInfo2.packageName;
            }
            this.mReceivers.addActivity(activityComponent2, "receiver");
        }
        int size4 = vPackage.providers.size();
        for (int i8 = 0; i8 < size4; i8++) {
            VPackage.ProviderComponent providerComponent = vPackage.providers.get(i8);
            ProviderInfo providerInfo = providerComponent.info;
            if (providerInfo.processName == null) {
                providerInfo.processName = providerInfo.packageName;
            }
            this.mProviders.addProvider(providerComponent);
            String[] split = providerComponent.info.authority.split(i.f136b);
            synchronized (this.mProvidersByAuthority) {
                for (String str : split) {
                    if (!this.mProvidersByAuthority.containsKey(str)) {
                        this.mProvidersByAuthority.put(str, providerComponent);
                    }
                }
            }
            this.mProvidersByComponent.put(providerComponent.getComponentName(), providerComponent);
        }
        int size5 = vPackage.permissions.size();
        for (int i9 = 0; i9 < size5; i9++) {
            VPackage.PermissionComponent permissionComponent = vPackage.permissions.get(i9);
            this.mPermissions.put(permissionComponent.info.name, permissionComponent);
        }
        int size6 = vPackage.permissionGroups.size();
        for (int i10 = 0; i10 < size6; i10++) {
            VPackage.PermissionGroupComponent permissionGroupComponent = vPackage.permissionGroups.get(i10);
            this.mPermissionGroups.put(permissionGroupComponent.className, permissionGroupComponent);
        }
        synchronized (this.mDangerousPermissions) {
            this.mDangerousPermissions.put(vPackage.packageName, PermissionCompat.findDangerousPermissions(vPackage.requestedPermissions));
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public int checkPermission(boolean z4, String str, String str2, int i5) {
        if (!"android.permission.INTERACT_ACROSS_USERS".equals(str) && !"android.permission.INTERACT_ACROSS_USERS_FULL".equals(str)) {
            return checkUidPermission(z4, str, i5, str2);
        }
        return -1;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public int checkSignatures(String str, String str2) {
        if (TextUtils.equals(str, str2)) {
            return 0;
        }
        PackageInfo packageInfo = getPackageInfo(str, 64, 0);
        PackageInfo packageInfo2 = getPackageInfo(str2, 64, 0);
        if (packageInfo == null) {
            try {
                packageInfo = VirtualCore.get().getHostPackageManager().getPackageInfo(str, 64L);
            } catch (PackageManager.NameNotFoundException unused) {
                return -4;
            }
        }
        if (packageInfo2 == null) {
            try {
                packageInfo2 = VirtualCore.get().getHostPackageManager().getPackageInfo(str2, 64L);
            } catch (PackageManager.NameNotFoundException unused2) {
                return -4;
            }
        }
        return SignaturesUtils.compareSignatures(packageInfo.signatures, packageInfo2.signatures);
    }

    public int checkUidPermission(boolean z4, String str, int i5, String str2) {
        if (getPermissionInfo(str, 0) != null) {
            return 0;
        }
        if (GmsSupport.isGoogleAppOrService(str2) && GmsSupport.PERMISSION_FORCE_GRANT.contains(str)) {
            return 0;
        }
        return VirtualCore.getPM().checkPermission(str, StubManifest.getStubPackageName(z4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cleanUpUser(int i5) {
        Iterator<VPackage> it = this.mPackages.values().iterator();
        while (it.hasNext()) {
            ((PackageSetting) it.next().mExtras).removeUser(i5);
        }
        ComponentStateManager.user(i5).clearAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createNewUser(int i5, File file) {
        Iterator<VPackage> it = this.mPackages.values().iterator();
        while (it.hasNext()) {
            ((PackageSetting) it.next().mExtras).modifyUserState(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void deletePackageLocked(VPackage vPackage) {
        if (vPackage == null) {
            return;
        }
        int size = vPackage.activities.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.mActivities.removeActivity(vPackage.activities.get(i5), "activity");
        }
        int size2 = vPackage.services.size();
        for (int i6 = 0; i6 < size2; i6++) {
            this.mServices.removeService(vPackage.services.get(i6));
        }
        int size3 = vPackage.receivers.size();
        for (int i7 = 0; i7 < size3; i7++) {
            this.mReceivers.removeActivity(vPackage.receivers.get(i7), "receiver");
        }
        int size4 = vPackage.providers.size();
        for (int i8 = 0; i8 < size4; i8++) {
            VPackage.ProviderComponent providerComponent = vPackage.providers.get(i8);
            this.mProviders.removeProvider(providerComponent);
            String[] split = providerComponent.info.authority.split(i.f136b);
            synchronized (this.mProvidersByAuthority) {
                for (String str : split) {
                    this.mProvidersByAuthority.remove(str);
                }
            }
            this.mProvidersByComponent.remove(providerComponent.getComponentName());
        }
        int size5 = vPackage.permissions.size();
        for (int i9 = 0; i9 < size5; i9++) {
            this.mPermissions.remove(vPackage.permissions.get(i9).className);
        }
        int size6 = vPackage.permissionGroups.size();
        for (int i10 = 0; i10 < size6; i10++) {
            this.mPermissionGroups.remove(vPackage.permissionGroups.get(i10).className);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ActivityInfo getActivityInfo(ComponentName componentName, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(componentName.getPackageName());
            if (vPackage != null) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                VPackage.ActivityComponent activityComponent = (VPackage.ActivityComponent) this.mActivities.mActivities.get(componentName);
                if (activityComponent != null) {
                    ActivityInfo generateActivityInfo = PackageParserEx.generateActivityInfo(activityComponent, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                    ComponentFixer.fixComponentInfo(generateActivityInfo);
                    return generateActivityInfo;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<PermissionGroupInfo> getAllPermissionGroups(int i5) {
        ArrayList arrayList;
        synchronized (this.mPackages) {
            arrayList = new ArrayList(this.mPermissionGroups.size());
            Iterator<VPackage.PermissionGroupComponent> it = this.mPermissionGroups.values().iterator();
            while (it.hasNext()) {
                arrayList.add(new PermissionGroupInfo(it.next().info));
            }
        }
        return arrayList;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ApplicationInfo getApplicationInfo(String str, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage != null) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                return PackageParserEx.generateApplicationInfo(vPackage, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public int getComponentEnabledSetting(ComponentName componentName, int i5) {
        int i6;
        if (componentName == null) {
            return 0;
        }
        checkUserId(i5);
        synchronized (this.mPackages) {
            i6 = ComponentStateManager.user(i5).get(componentName);
        }
        return i6;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public String[] getDangerousPermissions(String str) {
        String[] strArr;
        synchronized (this.mDangerousPermissions) {
            strArr = this.mDangerousPermissions.get(str);
        }
        return strArr;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public VParceledListSlice<ApplicationInfo> getInstalledApplications(int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        ArrayList arrayList = new ArrayList(this.mPackages.size());
        synchronized (this.mPackages) {
            for (VPackage vPackage : this.mPackages.values()) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                ApplicationInfo generateApplicationInfo = PackageParserEx.generateApplicationInfo(vPackage, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                if (generateApplicationInfo != null) {
                    arrayList.add(generateApplicationInfo);
                }
            }
        }
        return new VParceledListSlice<>(arrayList);
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public VParceledListSlice<PackageInfo> getInstalledPackages(int i5, int i6) {
        checkUserId(i6);
        ArrayList arrayList = new ArrayList(this.mPackages.size());
        synchronized (this.mPackages) {
            for (VPackage vPackage : this.mPackages.values()) {
                PackageInfo generatePackageInfo = generatePackageInfo(vPackage, (PackageSetting) vPackage.mExtras, i5, i6);
                if (generatePackageInfo != null) {
                    arrayList.add(generatePackageInfo);
                }
            }
        }
        return new VParceledListSlice<>(arrayList);
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public String getNameForUid(int i5) {
        int appId = VUserHandle.getAppId(i5);
        synchronized (this.mPackages) {
            Iterator<VPackage> it = this.mPackages.values().iterator();
            while (it.hasNext()) {
                PackageSetting packageSetting = (PackageSetting) it.next().mExtras;
                if (packageSetting.appId == appId) {
                    return packageSetting.packageName;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public PackageInfo getPackageInfo(String str, int i5, int i6) {
        checkUserId(i6);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage != null) {
                return generatePackageInfo(vPackage, (PackageSetting) vPackage.mExtras, i5, i6);
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public IBinder getPackageInstaller() {
        return VPackageInstallerService.get();
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public int getPackageUid(String str, int i5) {
        checkUserId(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage != null) {
                return VUserHandle.getUid(i5, ((PackageSetting) vPackage.mExtras).appId);
            }
            return -1;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public String[] getPackagesForUid(int i5) {
        int userId = VUserHandle.getUserId(i5);
        checkUserId(userId);
        synchronized (this) {
            ArrayList arrayList = new ArrayList(2);
            for (VPackage vPackage : this.mPackages.values()) {
                if (VUserHandle.getUid(userId, ((PackageSetting) vPackage.mExtras).appId) == i5 || i5 == VEnvironment.UNKNOWN_APP_UID) {
                    arrayList.add(vPackage.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public PermissionGroupInfo getPermissionGroupInfo(String str, int i5) {
        synchronized (this.mPackages) {
            VPackage.PermissionGroupComponent permissionGroupComponent = this.mPermissionGroups.get(str);
            if (permissionGroupComponent != null) {
                return new PermissionGroupInfo(permissionGroupComponent.info);
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public PermissionInfo getPermissionInfo(String str, int i5) {
        synchronized (this.mPackages) {
            VPackage.PermissionComponent permissionComponent = this.mPermissions.get(str);
            if (permissionComponent != null) {
                return new PermissionInfo(permissionComponent.info);
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ProviderInfo getProviderInfo(ComponentName componentName, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(componentName.getPackageName());
            if (vPackage != null) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                VPackage.ProviderComponent providerComponent = this.mProvidersByComponent.get(componentName);
                if (providerComponent != null && packageSetting.isEnabledAndMatchLPr(providerComponent.info, updateFlagsNought, i6)) {
                    ProviderInfo generateProviderInfo = PackageParserEx.generateProviderInfo(providerComponent, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                    ComponentFixer.fixComponentInfo(generateProviderInfo);
                    return generateProviderInfo;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ActivityInfo getReceiverInfo(ComponentName componentName, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(componentName.getPackageName());
            if (vPackage != null) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                VPackage.ActivityComponent activityComponent = (VPackage.ActivityComponent) this.mReceivers.mActivities.get(componentName);
                if (activityComponent != null && packageSetting.isEnabledAndMatchLPr(activityComponent.info, updateFlagsNought, i6)) {
                    ActivityInfo generateActivityInfo = PackageParserEx.generateActivityInfo(activityComponent, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                    ComponentFixer.fixComponentInfo(generateActivityInfo);
                    return generateActivityInfo;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<ReceiverInfo> getReceiverInfos(String str, String str2, int i5) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage == null) {
                return Collections.emptyList();
            }
            PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
            Iterator<VPackage.ActivityComponent> it = vPackage.receivers.iterator();
            while (it.hasNext()) {
                VPackage.ActivityComponent next = it.next();
                if (packageSetting.isEnabledAndMatchLPr(next.info, 0, i5) && next.info.processName.equals(str2)) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = next.intents.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((VPackage.ActivityIntentInfo) it2.next()).filter);
                    }
                    arrayList.add(new ReceiverInfo(next.info, arrayList2));
                }
            }
            return arrayList;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ServiceInfo getServiceInfo(ComponentName componentName, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(componentName.getPackageName());
            if (vPackage != null) {
                PackageSetting packageSetting = (PackageSetting) vPackage.mExtras;
                VPackage.ServiceComponent serviceComponent = (VPackage.ServiceComponent) this.mServices.mServices.get(componentName);
                if (serviceComponent != null) {
                    ServiceInfo generateServiceInfo = PackageParserEx.generateServiceInfo(serviceComponent, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                    ComponentFixer.fixComponentInfo(generateServiceInfo);
                    return generateServiceInfo;
                }
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<String> getSharedLibraries(String str) {
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage != null) {
                return vPackage.usesLibraries;
            }
            return null;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public VParceledListSlice<ProviderInfo> queryContentProviders(String str, int i5, int i6) {
        int userId = VUserHandle.getUserId(i5);
        checkUserId(userId);
        int updateFlagsNought = updateFlagsNought(i6);
        ArrayList arrayList = new ArrayList(3);
        synchronized (this.mPackages) {
            for (VPackage.ProviderComponent providerComponent : this.mProvidersByAuthority.values()) {
                PackageSetting packageSetting = (PackageSetting) providerComponent.owner.mExtras;
                if (packageSetting.isEnabledAndMatchLPr(providerComponent.info, updateFlagsNought, userId) && (str == null || (packageSetting.appId == VUserHandle.getAppId(i5) && providerComponent.info.processName.equals(str)))) {
                    arrayList.add(PackageParserEx.generateProviderInfo(providerComponent, updateFlagsNought, packageSetting.readUserState(userId), userId, packageSetting.isRunInExtProcess()));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, sProviderInitOrderSorter);
        }
        return new VParceledListSlice<>(arrayList);
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo activityInfo = getActivityInfo(component, updateFlagsNought, i6);
            if (activityInfo != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = activityInfo;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.mPackages) {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                return this.mActivities.queryIntent(intent2, str, updateFlagsNought, i6);
            }
            VPackage vPackage = this.mPackages.get(str2);
            if (vPackage != null) {
                return this.mActivities.queryIntentForPackage(intent2, str, updateFlagsNought, vPackage.activities, i6);
            }
            return Collections.emptyList();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    @TargetApi(19)
    public List<ResolveInfo> queryIntentContentProviders(Intent intent, String str, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ProviderInfo providerInfo = getProviderInfo(component, updateFlagsNought, i6);
            if (providerInfo != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.providerInfo = providerInfo;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.mPackages) {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                return this.mProviders.queryIntent(intent2, str, updateFlagsNought, i6);
            }
            VPackage vPackage = this.mPackages.get(str2);
            if (vPackage != null) {
                return this.mProviders.queryIntentForPackage(intent2, str, updateFlagsNought, vPackage.providers, i6);
            }
            return Collections.emptyList();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo receiverInfo = getReceiverInfo(component, updateFlagsNought, i6);
            if (receiverInfo != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = receiverInfo;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.mPackages) {
            String str2 = intent2.getPackage();
            if (str2 == null) {
                return this.mReceivers.queryIntent(intent2, str, updateFlagsNought, i6);
            }
            VPackage vPackage = this.mPackages.get(str2);
            if (vPackage != null) {
                return this.mReceivers.queryIntentForPackage(intent2, str, updateFlagsNought, vPackage.receivers, i6);
            }
            return Collections.emptyList();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<ResolveInfo> queryIntentServices(Intent intent, String str, int i5, int i6) {
        try {
            checkUserId(i6);
            int updateFlagsNought = updateFlagsNought(i5);
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ServiceInfo serviceInfo = getServiceInfo(component, updateFlagsNought, i6);
                if (serviceInfo != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.serviceInfo = serviceInfo;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.mPackages) {
                String str2 = intent2.getPackage();
                if (str2 == null) {
                    return this.mServices.queryIntent(intent2, str, updateFlagsNought, i6);
                }
                VPackage vPackage = this.mPackages.get(str2);
                if (vPackage != null) {
                    return this.mServices.queryIntentForPackage(intent2, str, updateFlagsNought, vPackage.services, i6);
                }
                return Collections.emptyList();
            }
        } catch (Exception e5) {
            VLog.e(VLog.TAG_DEFAULT, e5);
            return Collections.emptyList();
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<PermissionInfo> queryPermissionsByGroup(String str, int i5) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            synchronized (this.mPackages) {
                for (VPackage.PermissionComponent permissionComponent : this.mPermissions.values()) {
                    if (permissionComponent.info.group.equals(str)) {
                        arrayList.add(permissionComponent.info);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public List<String> querySharedPackages(String str) {
        synchronized (this.mPackages) {
            VPackage vPackage = this.mPackages.get(str);
            if (vPackage != null && vPackage.mSharedUserId != null) {
                ArrayList arrayList = new ArrayList();
                for (VPackage vPackage2 : this.mPackages.values()) {
                    if (TextUtils.equals(vPackage2.mSharedUserId, vPackage.mSharedUserId)) {
                        arrayList.add(vPackage2.packageName);
                    }
                }
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ProviderInfo resolveContentProvider(String str, int i5, int i6) {
        VPackage.ProviderComponent providerComponent;
        try {
            checkUserId(i6);
            int updateFlagsNought = updateFlagsNought(i5);
            synchronized (this.mProvidersByAuthority) {
                providerComponent = this.mProvidersByAuthority.get(str);
            }
            if (providerComponent != null) {
                PackageSetting packageSetting = (PackageSetting) providerComponent.owner.mExtras;
                ProviderInfo generateProviderInfo = PackageParserEx.generateProviderInfo(providerComponent, updateFlagsNought, packageSetting.readUserState(i6), i6, packageSetting.isRunInExtProcess());
                if (generateProviderInfo == null || !packageSetting.isEnabledAndMatchLPr(generateProviderInfo, updateFlagsNought, i6)) {
                    return null;
                }
                ComponentFixer.fixComponentInfo(generateProviderInfo);
                return generateProviderInfo;
            }
        } catch (Exception e5) {
            VLog.e(TAG, e5);
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ResolveInfo resolveIntent(Intent intent, String str, int i5, int i6) {
        checkUserId(i6);
        int updateFlagsNought = updateFlagsNought(i5);
        return chooseBestActivity(intent, str, updateFlagsNought, queryIntentActivities(intent, str, updateFlagsNought, i6));
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public ResolveInfo resolveService(Intent intent, String str, int i5, int i6) {
        checkUserId(i6);
        List<ResolveInfo> queryIntentServices = queryIntentServices(intent, str, updateFlagsNought(i5), i6);
        if (queryIntentServices != null && queryIntentServices.size() >= 1) {
            return queryIntentServices.get(0);
        }
        return null;
    }

    @Override // com.lody.virtual.server.interfaces.IPackageManager
    public void setComponentEnabledSetting(ComponentName componentName, int i5, int i6, int i7) {
        VLog.e(TAG, "setComponentEnabledSetting " + componentName + " newState: " + i5 + " flags: " + i6);
        if (componentName == null) {
            return;
        }
        checkUserId(i7);
        synchronized (this.mPackages) {
            ComponentStateManager.user(i7).set(componentName, i5);
        }
    }

    private VPackageManagerService() {
        this.mActivities = new ActivityIntentResolver();
        this.mServices = new ServiceIntentResolver();
        this.mReceivers = new ActivityIntentResolver();
        this.mProviders = new ProviderIntentResolver();
        this.mProvidersByComponent = new HashMap<>();
        this.mPermissions = new HashMap<>();
        this.mPermissionGroups = new HashMap<>();
        this.mProvidersByAuthority = new HashMap<>();
        this.mPackages = PackageCacheManager.PACKAGE_CACHE;
        this.mDangerousPermissions = new HashMap();
    }
}

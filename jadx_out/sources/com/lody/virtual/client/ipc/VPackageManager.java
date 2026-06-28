package com.lody.virtual.client.ipc;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.RemoteException;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.remote.ReceiverInfo;
import com.lody.virtual.server.IPackageInstaller;
import com.lody.virtual.server.interfaces.IPackageManager;
import java.util.List;

/* loaded from: classes3.dex */
public class VPackageManager {
    private static final VPackageManager sMgr = new VPackageManager();
    private IPackageManager mService;

    public static VPackageManager get() {
        return sMgr;
    }

    private Object getRemoteInterface() {
        return IPackageManager.Stub.asInterface(ServiceManagerNative.getService("package"));
    }

    public boolean activitySupportsIntent(ComponentName componentName, Intent intent, String str) {
        try {
            return getService().activitySupportsIntent(componentName, intent, str);
        } catch (RemoteException e5) {
            return ((Boolean) VirtualRuntime.crash(e5)).booleanValue();
        }
    }

    public int checkPermission(String str, String str2, int i5) {
        try {
            return getService().checkPermission(VirtualCore.get().isExtPackage(), str, str2, i5);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public int checkSignatures(String str, String str2) {
        try {
            return getService().checkSignatures(str, str2);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public ActivityInfo getActivityInfo(ComponentName componentName, int i5, int i6) {
        try {
            return getService().getActivityInfo(componentName, i5, i6);
        } catch (RemoteException e5) {
            return (ActivityInfo) VirtualRuntime.crash(e5);
        }
    }

    public List<PermissionGroupInfo> getAllPermissionGroups(int i5) {
        try {
            return getService().getAllPermissionGroups(i5);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public ApplicationInfo getApplicationInfo(String str, int i5, int i6) {
        try {
            return getService().getApplicationInfo(str, i5, i6);
        } catch (RemoteException e5) {
            return (ApplicationInfo) VirtualRuntime.crash(e5);
        }
    }

    public int getComponentEnabledSetting(ComponentName componentName, int i5) {
        try {
            return getService().getComponentEnabledSetting(componentName, i5);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public String[] getDangerousPermissions(String str) {
        try {
            return getService().getDangerousPermissions(str);
        } catch (RemoteException e5) {
            return (String[]) VirtualRuntime.crash(e5);
        }
    }

    public List<ApplicationInfo> getInstalledApplications(int i5, int i6) {
        try {
            return getService().getInstalledApplications(i5, i6).getList();
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<PackageInfo> getInstalledPackages(int i5, int i6) {
        try {
            return getService().getInstalledPackages(i5, i6).getList();
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public String getNameForUid(int i5) {
        try {
            return getService().getNameForUid(i5);
        } catch (RemoteException e5) {
            return (String) VirtualRuntime.crash(e5);
        }
    }

    public PackageInfo getPackageInfo(String str, int i5, int i6) {
        try {
            return getService().getPackageInfo(str, i5, i6);
        } catch (RemoteException e5) {
            return (PackageInfo) VirtualRuntime.crash(e5);
        }
    }

    public IPackageInstaller getPackageInstaller() {
        try {
            return IPackageInstaller.Stub.asInterface(getService().getPackageInstaller());
        } catch (RemoteException e5) {
            return (IPackageInstaller) VirtualRuntime.crash(e5);
        }
    }

    public int getPackageUid(String str, int i5) {
        try {
            return getService().getPackageUid(str, i5);
        } catch (RemoteException e5) {
            return ((Integer) VirtualRuntime.crash(e5)).intValue();
        }
    }

    public String[] getPackagesForUid(int i5) {
        try {
            return getService().getPackagesForUid(i5);
        } catch (RemoteException e5) {
            return (String[]) VirtualRuntime.crash(e5);
        }
    }

    public PermissionGroupInfo getPermissionGroupInfo(String str, int i5) {
        try {
            return getService().getPermissionGroupInfo(str, i5);
        } catch (RemoteException e5) {
            return (PermissionGroupInfo) VirtualRuntime.crash(e5);
        }
    }

    public PermissionInfo getPermissionInfo(String str, int i5) {
        try {
            return getService().getPermissionInfo(str, i5);
        } catch (RemoteException e5) {
            return (PermissionInfo) VirtualRuntime.crash(e5);
        }
    }

    public ProviderInfo getProviderInfo(ComponentName componentName, int i5, int i6) {
        try {
            return getService().getProviderInfo(componentName, i5, i6);
        } catch (RemoteException e5) {
            return (ProviderInfo) VirtualRuntime.crash(e5);
        }
    }

    public ActivityInfo getReceiverInfo(ComponentName componentName, int i5, int i6) {
        try {
            return getService().getReceiverInfo(componentName, i5, i6);
        } catch (RemoteException e5) {
            return (ActivityInfo) VirtualRuntime.crash(e5);
        }
    }

    public List<ReceiverInfo> getReceiverInfos(String str, String str2, int i5) {
        try {
            return getService().getReceiverInfos(str, str2, i5);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public IPackageManager getService() {
        if (!IInterfaceUtils.isAlive(this.mService)) {
            synchronized (VPackageManager.class) {
                this.mService = (IPackageManager) LocalProxyUtils.genProxy(IPackageManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public ServiceInfo getServiceInfo(ComponentName componentName, int i5, int i6) {
        try {
            return getService().getServiceInfo(componentName, i5, i6);
        } catch (RemoteException e5) {
            return (ServiceInfo) VirtualRuntime.crash(e5);
        }
    }

    public List<ProviderInfo> queryContentProviders(String str, int i5, int i6) {
        try {
            return getService().queryContentProviders(str, i5, i6).getList();
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<ResolveInfo> queryIntentActivities(Intent intent, String str, int i5, int i6) {
        try {
            return getService().queryIntentActivities(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<ResolveInfo> queryIntentContentProviders(Intent intent, String str, int i5, int i6) {
        try {
            return getService().queryIntentContentProviders(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<ResolveInfo> queryIntentReceivers(Intent intent, String str, int i5, int i6) {
        try {
            return getService().queryIntentReceivers(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<ResolveInfo> queryIntentServices(Intent intent, String str, int i5, int i6) {
        try {
            return getService().queryIntentServices(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<PermissionInfo> queryPermissionsByGroup(String str, int i5) {
        try {
            return getService().queryPermissionsByGroup(str, i5);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public List<String> querySharedPackages(String str) {
        try {
            return getService().querySharedPackages(str);
        } catch (RemoteException e5) {
            return (List) VirtualRuntime.crash(e5);
        }
    }

    public ProviderInfo resolveContentProvider(String str, int i5, int i6) {
        try {
            return getService().resolveContentProvider(str, i5, i6);
        } catch (RemoteException e5) {
            return (ProviderInfo) VirtualRuntime.crash(e5);
        }
    }

    public ResolveInfo resolveIntent(Intent intent, String str, int i5, int i6) {
        try {
            return getService().resolveIntent(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (ResolveInfo) VirtualRuntime.crash(e5);
        }
    }

    public ResolveInfo resolveService(Intent intent, String str, int i5, int i6) {
        try {
            return getService().resolveService(intent, str, i5, i6);
        } catch (RemoteException e5) {
            return (ResolveInfo) VirtualRuntime.crash(e5);
        }
    }

    public void setComponentEnabledSetting(ComponentName componentName, int i5, int i6, int i7) {
        try {
            getService().setComponentEnabledSetting(componentName, i5, i6, i7);
        } catch (RemoteException e5) {
            VirtualRuntime.crash(e5);
        }
    }
}

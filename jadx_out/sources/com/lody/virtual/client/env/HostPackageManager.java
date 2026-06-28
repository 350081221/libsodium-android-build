package com.lody.virtual.client.env;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.RemoteException;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.os.VUserHandle;
import mirror.android.app.ActivityThread;

/* loaded from: classes3.dex */
public abstract class HostPackageManager {
    private static HostPackageManager sInstance;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class HostPackageManagerImpl extends HostPackageManager {
        private IPackageManager mService = ActivityThread.getPackageManager.call(new Object[0]);

        @Override // com.lody.virtual.client.env.HostPackageManager
        public int checkPermission(String str, String str2) {
            try {
                return this.mService.checkPermission(str, str2, VUserHandle.realUserId());
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.lody.virtual.client.env.HostPackageManager
        public ApplicationInfo getApplicationInfo(String str, long j5) throws PackageManager.NameNotFoundException {
            ApplicationInfo applicationInfo;
            try {
                if (BuildCompat.isTiramisu()) {
                    applicationInfo = this.mService.getApplicationInfo(str, j5, VUserHandle.realUserId());
                } else {
                    applicationInfo = this.mService.getApplicationInfo(str, (int) j5, VUserHandle.realUserId());
                }
                if (applicationInfo != null) {
                    return applicationInfo;
                }
                throw new PackageManager.NameNotFoundException(str);
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.lody.virtual.client.env.HostPackageManager
        public PackageInfo getPackageInfo(String str, long j5) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo;
            try {
                if (BuildCompat.isTiramisu()) {
                    packageInfo = this.mService.getPackageInfo(str, j5, VUserHandle.realUserId());
                } else {
                    packageInfo = this.mService.getPackageInfo(str, (int) j5, VUserHandle.realUserId());
                }
                if (packageInfo != null) {
                    return packageInfo;
                }
                throw new PackageManager.NameNotFoundException(str);
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.lody.virtual.client.env.HostPackageManager
        public String[] getPackagesForUid(int i5) {
            try {
                return this.mService.getPackagesForUid(i5);
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.lody.virtual.client.env.HostPackageManager
        public ResolveInfo resolveActivity(Intent intent, long j5) {
            try {
                if (BuildCompat.isTiramisu()) {
                    return this.mService.resolveIntent(intent, (String) null, j5, VUserHandle.realUserId());
                }
                return this.mService.resolveIntent(intent, (String) null, (int) j5, VUserHandle.realUserId());
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // com.lody.virtual.client.env.HostPackageManager
        public ProviderInfo resolveContentProvider(String str, long j5) {
            try {
                if (BuildCompat.isTiramisu()) {
                    return this.mService.resolveContentProvider(str, j5, VUserHandle.realUserId());
                }
                return this.mService.resolveContentProvider(str, (int) j5, VUserHandle.realUserId());
            } catch (RemoteException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    public static HostPackageManager get() {
        return sInstance;
    }

    public static HostPackageManager init() {
        HostPackageManagerImpl hostPackageManagerImpl = new HostPackageManagerImpl();
        sInstance = hostPackageManagerImpl;
        return hostPackageManagerImpl;
    }

    public abstract int checkPermission(String str, String str2);

    public abstract ApplicationInfo getApplicationInfo(String str, long j5) throws PackageManager.NameNotFoundException;

    public abstract PackageInfo getPackageInfo(String str, long j5) throws PackageManager.NameNotFoundException;

    public abstract String[] getPackagesForUid(int i5);

    public abstract ResolveInfo resolveActivity(Intent intent, long j5);

    public abstract ProviderInfo resolveContentProvider(String str, long j5);
}

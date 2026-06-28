package android.content.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IPackageManager {
    int checkPermission(String str, String str2, int i5) throws RemoteException;

    ApplicationInfo getApplicationInfo(String str, int i5, int i6) throws RemoteException;

    ApplicationInfo getApplicationInfo(String str, long j5, int i5) throws RemoteException;

    PackageInfo getPackageInfo(String str, int i5, int i6) throws RemoteException;

    PackageInfo getPackageInfo(String str, long j5, int i5) throws RemoteException;

    String[] getPackagesForUid(int i5) throws RemoteException;

    ServiceInfo getServiceInfo(ComponentName componentName, int i5, int i6) throws RemoteException;

    ServiceInfo getServiceInfo(ComponentName componentName, long j5, int i5) throws RemoteException;

    ProviderInfo resolveContentProvider(String str, int i5, int i6) throws RemoteException;

    ProviderInfo resolveContentProvider(String str, long j5, int i5) throws RemoteException;

    ResolveInfo resolveIntent(Intent intent, String str, int i5, int i6) throws RemoteException;

    ResolveInfo resolveIntent(Intent intent, String str, long j5, int i5) throws RemoteException;
}

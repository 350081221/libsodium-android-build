package com.lody.virtual.server.extension;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.RemoteException;
import com.lody.virtual.IExtHelperInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.client.ipc.FileTransfer;
import com.lody.virtual.helper.DexOptimizer;
import com.lody.virtual.helper.PackageCleaner;
import com.lody.virtual.helper.compat.BundleCompat;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.InstalledAppInfo;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class VExtPackageHelper extends ContentProvider {
    private static final String TAG = "VExtPackageHelper";
    private final Binder mExtHelperInterface = new IExtHelperInterface.Stub() { // from class: com.lody.virtual.server.extension.VExtPackageHelper.1
        @Override // com.lody.virtual.IExtHelperInterface
        public void cleanPackageData(int[] iArr, String str) {
            synchronized (this) {
                if (str != null && iArr != null) {
                    for (int i5 : iArr) {
                        FileUtils.deleteDir(VEnvironment.getDataUserPackageDirectoryExt(i5, str));
                        FileUtils.deleteDir(VEnvironment.getDeDataUserPackageDirectoryExt(i5, str));
                    }
                }
            }
        }

        public void copyPackage(InstalledAppInfo installedAppInfo) {
            String str = installedAppInfo.packageName;
            VLog.e(VExtPackageHelper.TAG, "copyPackage: " + str);
            FileUtils.ensureDirCreate(VEnvironment.getDataAppPackageDirectoryExt(str), VEnvironment.getDataAppLibDirectoryExt(str));
            FileTransfer fileTransfer = FileTransfer.get();
            fileTransfer.copyFile(VEnvironment.getPackageFile(str), VEnvironment.getPackageFileExt(str));
            for (String str2 : installedAppInfo.getSplitNames()) {
                fileTransfer.copyFile(VEnvironment.getSplitPackageFile(str, str2), VEnvironment.getSplitPackageFileExt(str, str2));
            }
            fileTransfer.copyDirectory(VEnvironment.getDataAppLibDirectory(str), VEnvironment.getDataAppLibDirectoryExt(str));
            if (VirtualCore.get().isRunInExtProcess(str)) {
                try {
                    DexOptimizer.dex2oat(VEnvironment.getPackageFileExt(str).getPath(), VEnvironment.getOatFileExt(str, VirtualRuntime.getCurrentInstructionSet()).getPath());
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public void forceStop(int[] iArr) {
            synchronized (this) {
                for (int i5 : iArr) {
                    Process.killProcess(i5);
                }
            }
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i5, int i6) {
            Context context = VExtPackageHelper.this.getContext();
            if (context == null) {
                return Collections.emptyList();
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return Collections.emptyList();
            }
            return activityManager.getRecentTasks(i5, i6);
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() {
            Context context = VExtPackageHelper.this.getContext();
            if (context == null) {
                return Collections.emptyList();
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return Collections.emptyList();
            }
            return activityManager.getRunningAppProcesses();
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RunningTaskInfo> getRunningTasks(int i5) {
            Context context = VExtPackageHelper.this.getContext();
            if (context == null) {
                return Collections.emptyList();
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return Collections.emptyList();
            }
            return activityManager.getRunningTasks(i5);
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public boolean isExternalStorageManager() throws RemoteException {
            boolean isExternalStorageManager;
            if (Build.VERSION.SDK_INT >= 30) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                return isExternalStorageManager;
            }
            return true;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public void startActivity(Intent intent, Bundle bundle) {
            if (VirtualCore.get().isSharedUserId()) {
                return;
            }
            Context context = VExtPackageHelper.this.getContext();
            if (context == null) {
                VLog.e(VLog.TAG_DEFAULT, "addon startActivity failed!! context is NULL");
            } else {
                context.startActivity(intent, bundle);
            }
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public int syncPackages() {
            boolean z4;
            if (VirtualCore.get().isSharedUserId()) {
                return 0;
            }
            synchronized (this) {
                PackageCleaner.cleanUsers(VEnvironment.getDataUserDirectoryExt());
                PackageCleaner.cleanUninstalledPackages();
                for (InstalledAppInfo installedAppInfo : VirtualCore.get().getInstalledApps(0)) {
                    List<String> splitNames = installedAppInfo.getSplitNames();
                    if (!splitNames.isEmpty()) {
                        Iterator<String> it = splitNames.iterator();
                        z4 = false;
                        while (it.hasNext()) {
                            if (!VEnvironment.getSplitPackageFileExt(installedAppInfo.packageName, it.next()).exists()) {
                                z4 = true;
                            }
                        }
                    } else {
                        z4 = false;
                    }
                    File dataAppPackageDirectoryExt = VEnvironment.getDataAppPackageDirectoryExt(installedAppInfo.packageName);
                    if (!dataAppPackageDirectoryExt.exists() || z4) {
                        FileUtils.ensureDirCreate(dataAppPackageDirectoryExt);
                        if (!installedAppInfo.dynamic) {
                            copyPackage(installedAppInfo);
                        }
                    }
                }
            }
            return 0;
        }
    };

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (str.equals("connect")) {
            Bundle bundle2 = new Bundle();
            BundleCompat.putBinder(bundle2, "_VA_|_binder_", this.mExtHelperInterface);
            return bundle2;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

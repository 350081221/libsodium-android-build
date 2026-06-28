package com.lody.virtual.remote;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.os.VEnvironment;
import java.io.File;
import java.util.List;
import mirror.dalvik.system.VMRuntime;

/* loaded from: classes3.dex */
public final class InstalledAppInfo implements Parcelable {
    public static final Parcelable.Creator<InstalledAppInfo> CREATOR = new Parcelable.Creator<InstalledAppInfo>() { // from class: com.lody.virtual.remote.InstalledAppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstalledAppInfo createFromParcel(Parcel parcel) {
            return new InstalledAppInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstalledAppInfo[] newArray(int i5) {
            return new InstalledAppInfo[i5];
        }
    };
    public int appId;
    public boolean dynamic;
    public int flag;
    public boolean is64bit;
    public String packageName;
    public String primaryCpuAbi;
    public String secondaryCpuAbi;

    public InstalledAppInfo(String str, boolean z4, int i5, int i6, String str2, String str3, boolean z5) {
        this.packageName = str;
        this.dynamic = z4;
        this.flag = i5;
        this.appId = i6;
        this.primaryCpuAbi = str2;
        this.secondaryCpuAbi = str3;
        this.is64bit = z5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApkPath() {
        return getApkPath(VirtualCore.get().isExtPackage());
    }

    public ApplicationInfo getApplicationInfo(int i5) {
        ApplicationInfo applicationInfo = VPackageManager.get().getApplicationInfo(this.packageName, 0, i5);
        if (applicationInfo != null && !VirtualCore.get().isVAppProcess() && !new File(applicationInfo.sourceDir).exists()) {
            String apkPath = getApkPath();
            applicationInfo.sourceDir = apkPath;
            applicationInfo.publicSourceDir = apkPath;
        }
        return applicationInfo;
    }

    public int[] getInstalledUsers() {
        return VirtualCore.get().getPackageInstalledUsers(this.packageName);
    }

    public File getOatFile() {
        return getOatFile(VirtualCore.get().isExtPackage(), VMRuntime.getCurrentInstructionSet.call(new Object[0]));
    }

    public String getOatPath() {
        return getOatFile().getPath();
    }

    public PackageInfo getPackageInfo(int i5) {
        return VPackageManager.get().getPackageInfo(this.packageName, 0, i5);
    }

    public List<String> getSplitNames() {
        return VirtualCore.get().getInstalledSplitNames(this.packageName);
    }

    public boolean isLaunched(int i5) {
        return VirtualCore.get().isPackageLaunched(i5, this.packageName);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.packageName);
        parcel.writeByte(this.dynamic ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.flag);
        parcel.writeInt(this.appId);
        parcel.writeString(this.primaryCpuAbi);
        parcel.writeString(this.secondaryCpuAbi);
        parcel.writeByte(this.is64bit ? (byte) 1 : (byte) 0);
    }

    public String getApkPath(boolean z4) {
        if (this.dynamic) {
            try {
                return VirtualCore.get().getHostPackageManager().getApplicationInfo(this.packageName, 0L).publicSourceDir;
            } catch (PackageManager.NameNotFoundException e5) {
                throw new IllegalStateException(e5);
            }
        }
        if (z4) {
            return VEnvironment.getPackageFileExt(this.packageName).getPath();
        }
        return VEnvironment.getPackageFile(this.packageName).getPath();
    }

    public File getOatFile(boolean z4, String str) {
        if (z4) {
            return VEnvironment.getOatFile(this.packageName, str);
        }
        return VEnvironment.getOatFileExt(this.packageName, str);
    }

    protected InstalledAppInfo(Parcel parcel) {
        this.packageName = parcel.readString();
        this.dynamic = parcel.readByte() != 0;
        this.flag = parcel.readInt();
        this.appId = parcel.readInt();
        this.primaryCpuAbi = parcel.readString();
        this.secondaryCpuAbi = parcel.readString();
        this.is64bit = parcel.readByte() != 0;
    }
}

package com.lody.virtual.server.pm;

import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.compat.ParcelCompat;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.server.pm.parser.PackageParserEx;

/* loaded from: classes3.dex */
public class PackageSetting implements Parcelable {
    public static final int CURRENT_VERSION = 7;
    public static final int PKG_INI_VERSION_SEVEN = 7;
    public static final int PKG_INI_VERSION_SIX = 6;
    public int appId;
    public boolean dynamic;
    public long firstInstallTime;
    public int flag;
    public boolean is64bitPackage;
    public long lastUpdateTime;
    public String packageName;
    public String primaryCpuAbi;
    public String secondaryCpuAbi;
    SparseArray<PackageUserState> userState;
    public int version;
    private static final PackageUserState DEFAULT_USER_STATE = new PackageUserState();
    public static final Parcelable.Creator<PackageSetting> CREATOR = new Parcelable.Creator<PackageSetting>() { // from class: com.lody.virtual.server.pm.PackageSetting.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PackageSetting createFromParcel(Parcel parcel) {
            return new PackageSetting(7, parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PackageSetting[] newArray(int i5) {
            return new PackageSetting[i5];
        }
    };

    public PackageSetting() {
        this.userState = new SparseArray<>();
        this.version = 7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InstalledAppInfo getAppInfo() {
        return new InstalledAppInfo(this.packageName, this.dynamic, this.flag, this.appId, this.primaryCpuAbi, this.secondaryCpuAbi, this.is64bitPackage);
    }

    public String getPackagePath() {
        if (this.dynamic) {
            try {
                return VirtualCore.get().getHostPackageManager().getApplicationInfo(this.packageName, 0L).publicSourceDir;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        if (VirtualCore.get().isExtPackage()) {
            return VEnvironment.getPackageFileExt(this.packageName).getPath();
        }
        return VEnvironment.getPackageFile(this.packageName).getPath();
    }

    public boolean is64bitPackage() {
        return this.is64bitPackage;
    }

    public boolean isEnabledAndMatchLPr(ComponentInfo componentInfo, int i5, int i6) {
        if ((i5 & 512) != 0) {
            return true;
        }
        return PackageParserEx.isEnabledLPr(componentInfo, i5, i6);
    }

    public boolean isHidden(int i5) {
        return readUserState(i5).hidden;
    }

    public boolean isInstalled(int i5) {
        return readUserState(i5).installed;
    }

    public boolean isLaunched(int i5) {
        return readUserState(i5).launched;
    }

    public boolean isRunInExtProcess() {
        return !is64bitPackage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PackageUserState modifyUserState(int i5) {
        PackageUserState packageUserState = this.userState.get(i5);
        if (packageUserState == null) {
            PackageUserState packageUserState2 = new PackageUserState();
            this.userState.put(i5, packageUserState2);
            return packageUserState2;
        }
        return packageUserState;
    }

    public PackageUserState readUserState(int i5) {
        PackageUserState packageUserState = this.userState.get(i5);
        if (packageUserState != null) {
            return packageUserState;
        }
        return DEFAULT_USER_STATE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeUser(int i5) {
        this.userState.delete(i5);
    }

    public void setHidden(int i5, boolean z4) {
        modifyUserState(i5).hidden = z4;
    }

    public void setInstalled(int i5, boolean z4) {
        modifyUserState(i5).installed = z4;
    }

    public void setLaunched(int i5, boolean z4) {
        modifyUserState(i5).launched = z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUserState(int i5, boolean z4, boolean z5, boolean z6) {
        PackageUserState modifyUserState = modifyUserState(i5);
        modifyUserState.launched = z4;
        modifyUserState.hidden = z5;
        modifyUserState.installed = z6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.appId);
        parcel.writeString(this.primaryCpuAbi);
        parcel.writeString(this.secondaryCpuAbi);
        parcel.writeByte(this.is64bitPackage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.dynamic ? (byte) 1 : (byte) 0);
        if (this.version <= 6) {
            parcel.writeSparseArray(this.userState);
        } else {
            int size = this.userState.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                parcel.writeInt(this.userState.keyAt(i6));
                this.userState.valueAt(i6).writeToParcel(parcel, i5);
            }
        }
        parcel.writeInt(this.flag);
        parcel.writeLong(this.firstInstallTime);
        parcel.writeLong(this.lastUpdateTime);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PackageSetting(int i5, Parcel parcel) {
        this.userState = new SparseArray<>();
        this.version = i5;
        this.packageName = parcel.readString();
        this.appId = parcel.readInt();
        this.primaryCpuAbi = parcel.readString();
        this.secondaryCpuAbi = parcel.readString();
        this.is64bitPackage = parcel.readByte() != 0;
        this.dynamic = parcel.readByte() != 0;
        int dataPosition = parcel.dataPosition();
        if (i5 <= 6) {
            try {
                this.userState = parcel.readSparseArray(PackageUserState.class.getClassLoader());
            } catch (Throwable unused) {
                parcel.setDataPosition(dataPosition);
                this.userState = new ParcelCompat(parcel).readSparseArray(PackageUserState.class.getClassLoader());
            }
        } else {
            int readInt = parcel.readInt();
            for (int i6 = 0; i6 < readInt; i6++) {
                this.userState.put(parcel.readInt(), new PackageUserState(parcel));
            }
        }
        this.flag = parcel.readInt();
        this.firstInstallTime = parcel.readLong();
        this.lastUpdateTime = parcel.readLong();
    }
}

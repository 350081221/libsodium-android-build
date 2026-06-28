package com.lody.virtual.server.pm.legacy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.lody.virtual.server.pm.PackageUserState;

@Deprecated
/* loaded from: classes3.dex */
public class PackageSettingV5 implements Parcelable {
    public static final int CURRENT_VERSION = 5;
    public static final int MODE_APP_COPY_APK = 0;
    public static final int MODE_APP_USE_OUTSIDE_APK = 1;
    public int appId;
    public int appMode;
    public long firstInstallTime;
    public int flag;
    public long lastUpdateTime;
    public String packageName;
    public SparseArray<PackageUserState> userState;
    public int version;
    private static final PackageUserState DEFAULT_USER_STATE = new PackageUserState();
    public static final Parcelable.Creator<PackageSettingV5> CREATOR = new Parcelable.Creator<PackageSettingV5>() { // from class: com.lody.virtual.server.pm.legacy.PackageSettingV5.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PackageSettingV5 createFromParcel(Parcel parcel) {
            return new PackageSettingV5(5, parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PackageSettingV5[] newArray(int i5) {
            return new PackageSettingV5[i5];
        }
    };

    public PackageSettingV5() {
        this.userState = new SparseArray<>();
        this.version = 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.appId);
        parcel.writeInt(this.appMode);
        parcel.writeSparseArray(this.userState);
        parcel.writeInt(this.flag);
        parcel.writeLong(this.firstInstallTime);
        parcel.writeLong(this.lastUpdateTime);
    }

    public PackageSettingV5(int i5, Parcel parcel) {
        this.userState = new SparseArray<>();
        this.version = i5;
        this.packageName = parcel.readString();
        this.appId = parcel.readInt();
        this.appMode = parcel.readInt();
        this.userState = parcel.readSparseArray(PackageUserState.class.getClassLoader());
        this.flag = parcel.readInt();
        this.firstInstallTime = parcel.readLong();
        this.lastUpdateTime = parcel.readLong();
    }
}

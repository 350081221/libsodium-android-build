package com.lody.virtual.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class VAppInstallerResult implements Parcelable {
    public static final Parcelable.Creator<VAppInstallerResult> CREATOR = new Parcelable.Creator<VAppInstallerResult>() { // from class: com.lody.virtual.remote.VAppInstallerResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VAppInstallerResult createFromParcel(Parcel parcel) {
            return new VAppInstallerResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VAppInstallerResult[] newArray(int i5) {
            return new VAppInstallerResult[i5];
        }
    };
    public static final int FLAG_IS_SPLIT_PACKAGE = 1;
    public static final int FLAG_PACKAGE_UPDATED = 2;
    public static final int STATUS_FAILURE_ABORTED = 3;
    public static final int STATUS_FAILURE_BLOCKED = 2;
    public static final int STATUS_FAILURE_CONFLICT = 5;
    public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
    public static final int STATUS_FAILURE_INVALID = 4;
    public static final int STATUS_FAILURE_NO_BASE_APK = 8;
    public static final int STATUS_FAILURE_STORAGE = 6;
    public static final int STATUS_SUCCESS = 0;
    public int flags;
    public String packageName;
    public int status;

    public VAppInstallerResult() {
        this.status = 0;
    }

    public static VAppInstallerResult create(String str, int i5) {
        return new VAppInstallerResult(str, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.packageName);
        parcel.writeInt(this.status);
        parcel.writeInt(this.flags);
    }

    public static VAppInstallerResult create(int i5) {
        return new VAppInstallerResult(i5);
    }

    public VAppInstallerResult(int i5) {
        this.status = i5;
    }

    public VAppInstallerResult(int i5, int i6) {
        this.status = i5;
        this.flags = i6;
    }

    public VAppInstallerResult(String str, int i5, int i6) {
        this.packageName = str;
        this.status = i5;
        this.flags = i6;
    }

    public VAppInstallerResult(String str, int i5) {
        this.packageName = str;
        this.status = i5;
    }

    protected VAppInstallerResult(Parcel parcel) {
        this.status = 0;
        this.packageName = parcel.readString();
        this.status = parcel.readInt();
        this.flags = parcel.readInt();
    }
}

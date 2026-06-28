package com.lody.virtual.remote;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class VAppInstallerParams implements Parcelable {
    public static final Parcelable.Creator<VAppInstallerParams> CREATOR = new Parcelable.Creator<VAppInstallerParams>() { // from class: com.lody.virtual.remote.VAppInstallerParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VAppInstallerParams createFromParcel(Parcel parcel) {
            return new VAppInstallerParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VAppInstallerParams[] newArray(int i5) {
            return new VAppInstallerParams[i5];
        }
    };
    public static final int FLAG_INSTALL_NOTIFY = 1;
    public static final int FLAG_INSTALL_OVERRIDE_DONT_KILL_APP = 8;
    public static final int FLAG_INSTALL_OVERRIDE_FORBIDDEN = 4;
    public static final int FLAG_INSTALL_OVERRIDE_NO_CHECK = 2;
    public static final int FLAG_INSTALL_OVERRIDE_SKIP_ODEX = 16;
    public static final int MODE_FULL_INSTALL = 1;
    public static final int MODE_INHERIT_EXISTING = 2;
    private String cpuAbiOverride;
    private int installFlags;
    private int mode;

    public VAppInstallerParams() {
        this.installFlags = 0;
        this.mode = 1;
    }

    public void addInstallFlags(int i5) {
        this.installFlags = i5 | this.installFlags;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCpuAbiOverride() {
        return this.cpuAbiOverride;
    }

    public int getInstallFlags() {
        return this.installFlags;
    }

    public int getMode() {
        return this.mode;
    }

    public void removeInstallFlags(int i5) {
        this.installFlags = (~i5) & this.installFlags;
    }

    public void setCpuAbiOverride(String str) {
        this.cpuAbiOverride = str;
    }

    public void setInstallFlags(int i5) {
        this.installFlags = i5;
    }

    public void setMode(int i5) {
        this.mode = i5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.installFlags);
        parcel.writeInt(this.mode);
        parcel.writeString(this.cpuAbiOverride);
    }

    public VAppInstallerParams(int i5) {
        this.mode = 1;
        this.installFlags = i5;
    }

    public VAppInstallerParams(int i5, int i6) {
        this.installFlags = i5;
        this.mode = i6;
    }

    protected VAppInstallerParams(Parcel parcel) {
        this.installFlags = 0;
        this.mode = 1;
        this.installFlags = parcel.readInt();
        this.mode = parcel.readInt();
        this.cpuAbiOverride = parcel.readString();
    }
}

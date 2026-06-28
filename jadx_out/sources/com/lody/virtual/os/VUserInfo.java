package com.lody.virtual.os;

import a1.i;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class VUserInfo implements Parcelable {
    public static final Parcelable.Creator<VUserInfo> CREATOR = new Parcelable.Creator<VUserInfo>() { // from class: com.lody.virtual.os.VUserInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VUserInfo createFromParcel(Parcel parcel) {
            return new VUserInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VUserInfo[] newArray(int i5) {
            return new VUserInfo[i5];
        }
    };
    public static final int FLAG_ADMIN = 2;
    public static final int FLAG_DISABLED = 64;
    public static final int FLAG_GUEST = 4;
    public static final int FLAG_INITIALIZED = 16;
    public static final int FLAG_MANAGED_PROFILE = 32;
    public static final int FLAG_MASK_USER_TYPE = 255;
    public static final int FLAG_PRIMARY = 1;
    public static final int FLAG_RESTRICTED = 8;
    public static final int NO_PROFILE_GROUP_ID = -1;
    public long creationTime;
    public int flags;
    public boolean guestToRemove;
    public String iconPath;
    public int id;
    public long lastLoggedInTime;
    public String name;
    public boolean partial;
    public int profileGroupId;
    public int serialNumber;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isAdmin() {
        return (this.flags & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.flags & 64) != 64;
    }

    public boolean isGuest() {
        return (this.flags & 4) == 4;
    }

    public boolean isManagedProfile() {
        return (this.flags & 32) == 32;
    }

    public boolean isPrimary() {
        return (this.flags & 1) == 1;
    }

    public boolean isRestricted() {
        return (this.flags & 8) == 8;
    }

    public String toString() {
        return "UserInfo{" + this.id + ":" + this.name + ":" + Integer.toHexString(this.flags) + i.f138d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.iconPath);
        parcel.writeInt(this.flags);
        parcel.writeInt(this.serialNumber);
        parcel.writeLong(this.creationTime);
        parcel.writeLong(this.lastLoggedInTime);
        parcel.writeInt(this.partial ? 1 : 0);
        parcel.writeInt(this.profileGroupId);
        parcel.writeInt(this.guestToRemove ? 1 : 0);
    }

    public VUserInfo(int i5, String str, int i6) {
        this(i5, str, null, i6);
    }

    public VUserInfo(int i5, String str, String str2, int i6) {
        this.id = i5;
        this.name = str;
        this.flags = i6;
        this.iconPath = str2;
        this.profileGroupId = -1;
    }

    public VUserInfo() {
    }

    public VUserInfo(int i5) {
        this.id = i5;
    }

    public VUserInfo(VUserInfo vUserInfo) {
        this.name = vUserInfo.name;
        this.iconPath = vUserInfo.iconPath;
        this.id = vUserInfo.id;
        this.flags = vUserInfo.flags;
        this.serialNumber = vUserInfo.serialNumber;
        this.creationTime = vUserInfo.creationTime;
        this.lastLoggedInTime = vUserInfo.lastLoggedInTime;
        this.partial = vUserInfo.partial;
        this.profileGroupId = vUserInfo.profileGroupId;
        this.guestToRemove = vUserInfo.guestToRemove;
    }

    private VUserInfo(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.iconPath = parcel.readString();
        this.flags = parcel.readInt();
        this.serialNumber = parcel.readInt();
        this.creationTime = parcel.readLong();
        this.lastLoggedInTime = parcel.readLong();
        this.partial = parcel.readInt() != 0;
        this.profileGroupId = parcel.readInt();
        this.guestToRemove = parcel.readInt() != 0;
    }
}

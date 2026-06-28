package com.lody.virtual.server.pm.installer;

import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import mirror.android.content.pm.PackageInstaller;

/* loaded from: classes3.dex */
public class SessionInfo implements Parcelable {
    public static final Parcelable.Creator<SessionInfo> CREATOR = new Parcelable.Creator<SessionInfo>() { // from class: com.lody.virtual.server.pm.installer.SessionInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionInfo createFromParcel(Parcel parcel) {
            return new SessionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionInfo[] newArray(int i5) {
            return new SessionInfo[i5];
        }
    };
    public boolean active;
    public Bitmap appIcon;
    public CharSequence appLabel;
    public String appPackageName;
    public String installerPackageName;
    public int mode;
    public float progress;
    public String resolvedBaseCodePath;
    public boolean sealed;
    public int sessionId;
    public long sizeBytes;

    public SessionInfo() {
    }

    public static SessionInfo realloc(PackageInstaller.SessionInfo sessionInfo) {
        SessionInfo sessionInfo2 = new SessionInfo();
        sessionInfo2.sessionId = PackageInstaller.SessionInfo.sessionId.get(sessionInfo);
        sessionInfo2.installerPackageName = PackageInstaller.SessionInfo.installerPackageName.get(sessionInfo);
        sessionInfo2.resolvedBaseCodePath = PackageInstaller.SessionInfo.resolvedBaseCodePath.get(sessionInfo);
        sessionInfo2.progress = PackageInstaller.SessionInfo.progress.get(sessionInfo);
        sessionInfo2.sealed = PackageInstaller.SessionInfo.sealed.get(sessionInfo);
        sessionInfo2.active = PackageInstaller.SessionInfo.active.get(sessionInfo);
        sessionInfo2.mode = PackageInstaller.SessionInfo.mode.get(sessionInfo);
        sessionInfo2.sizeBytes = PackageInstaller.SessionInfo.sizeBytes.get(sessionInfo);
        sessionInfo2.appPackageName = PackageInstaller.SessionInfo.appPackageName.get(sessionInfo);
        sessionInfo2.appIcon = PackageInstaller.SessionInfo.appIcon.get(sessionInfo);
        sessionInfo2.appLabel = PackageInstaller.SessionInfo.appLabel.get(sessionInfo);
        return sessionInfo2;
    }

    public PackageInstaller.SessionInfo alloc() {
        PackageInstaller.SessionInfo newInstance = PackageInstaller.SessionInfo.ctor.newInstance();
        PackageInstaller.SessionInfo.sessionId.set(newInstance, this.sessionId);
        PackageInstaller.SessionInfo.installerPackageName.set(newInstance, this.installerPackageName);
        PackageInstaller.SessionInfo.resolvedBaseCodePath.set(newInstance, this.resolvedBaseCodePath);
        PackageInstaller.SessionInfo.progress.set(newInstance, this.progress);
        PackageInstaller.SessionInfo.sealed.set(newInstance, this.sealed);
        PackageInstaller.SessionInfo.active.set(newInstance, this.active);
        PackageInstaller.SessionInfo.mode.set(newInstance, this.mode);
        PackageInstaller.SessionInfo.sizeBytes.set(newInstance, this.sizeBytes);
        PackageInstaller.SessionInfo.appPackageName.set(newInstance, this.appPackageName);
        PackageInstaller.SessionInfo.appIcon.set(newInstance, this.appIcon);
        PackageInstaller.SessionInfo.appLabel.set(newInstance, this.appLabel);
        return newInstance;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.sessionId);
        parcel.writeString(this.installerPackageName);
        parcel.writeString(this.resolvedBaseCodePath);
        parcel.writeFloat(this.progress);
        parcel.writeByte(this.sealed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.active ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mode);
        parcel.writeLong(this.sizeBytes);
        parcel.writeString(this.appPackageName);
        parcel.writeParcelable(this.appIcon, i5);
        CharSequence charSequence = this.appLabel;
        if (charSequence != null) {
            parcel.writeString(charSequence.toString());
        }
    }

    protected SessionInfo(Parcel parcel) {
        this.sessionId = parcel.readInt();
        this.installerPackageName = parcel.readString();
        this.resolvedBaseCodePath = parcel.readString();
        this.progress = parcel.readFloat();
        this.sealed = parcel.readByte() != 0;
        this.active = parcel.readByte() != 0;
        this.mode = parcel.readInt();
        this.sizeBytes = parcel.readLong();
        this.appPackageName = parcel.readString();
        this.appIcon = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.appLabel = parcel.readString();
    }
}

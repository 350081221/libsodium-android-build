package com.lody.virtual.server.pm.installer;

import android.annotation.TargetApi;
import android.content.pm.DataLoaderParamsParcel;
import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import mirror.RefObject;
import mirror.android.content.pm.DataLoaderParams;
import mirror.android.content.pm.PackageInstaller;

@TargetApi(21)
/* loaded from: classes3.dex */
public class SessionParams implements Parcelable {
    public static final Parcelable.Creator<SessionParams> CREATOR = new Parcelable.Creator<SessionParams>() { // from class: com.lody.virtual.server.pm.installer.SessionParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionParams createFromParcel(Parcel parcel) {
            return new SessionParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SessionParams[] newArray(int i5) {
            return new SessionParams[i5];
        }
    };
    public static final int MODE_FULL_INSTALL = 1;
    public static final int MODE_INHERIT_EXISTING = 2;
    public static final int MODE_INVALID = -1;
    public String abiOverride;
    public Bitmap appIcon;
    public long appIconLastModified;
    public String appLabel;
    public String appPackageName;
    public String[] grantedRuntimePermissions;
    public int installFlags;
    public int installLocation;
    public DataLoaderParamsParcel mData;
    public ArrayMap<String, Integer> mPermissionStates;
    public int mode;
    public Uri originatingUri;
    public Uri referrerUri;
    public long sizeBytes;
    public String volumeUuid;

    public SessionParams(int i5) {
        this.installLocation = 1;
        this.sizeBytes = -1L;
        this.appIconLastModified = -1L;
        this.mode = i5;
        this.mPermissionStates = new ArrayMap<>();
    }

    public static SessionParams create(PackageInstaller.SessionParams sessionParams) {
        Object obj;
        SessionParams sessionParams2 = new SessionParams(PackageInstaller.SessionParamsMarshmallow.mode.get(sessionParams));
        sessionParams2.installFlags = PackageInstaller.SessionParamsMarshmallow.installFlags.get(sessionParams);
        sessionParams2.installLocation = PackageInstaller.SessionParamsMarshmallow.installLocation.get(sessionParams);
        sessionParams2.sizeBytes = PackageInstaller.SessionParamsMarshmallow.sizeBytes.get(sessionParams);
        sessionParams2.appPackageName = PackageInstaller.SessionParamsMarshmallow.appPackageName.get(sessionParams);
        sessionParams2.appIcon = PackageInstaller.SessionParamsMarshmallow.appIcon.get(sessionParams);
        sessionParams2.appLabel = PackageInstaller.SessionParamsMarshmallow.appLabel.get(sessionParams);
        sessionParams2.appIconLastModified = PackageInstaller.SessionParamsMarshmallow.appIconLastModified.get(sessionParams);
        sessionParams2.originatingUri = PackageInstaller.SessionParamsMarshmallow.originatingUri.get(sessionParams);
        sessionParams2.referrerUri = PackageInstaller.SessionParamsMarshmallow.referrerUri.get(sessionParams);
        sessionParams2.abiOverride = PackageInstaller.SessionParamsMarshmallow.abiOverride.get(sessionParams);
        sessionParams2.volumeUuid = PackageInstaller.SessionParamsMarshmallow.volumeUuid.get(sessionParams);
        RefObject<String[]> refObject = PackageInstaller.SessionParamsMarshmallow.grantedRuntimePermissions;
        if (refObject != null) {
            sessionParams2.grantedRuntimePermissions = refObject.get(sessionParams);
        }
        RefObject<ArrayMap<String, Integer>> refObject2 = PackageInstaller.SessionParamsMarshmallow.mPermissionStates;
        if (refObject2 != null) {
            sessionParams2.mPermissionStates.putAll((ArrayMap<? extends String, ? extends Integer>) refObject2.get(sessionParams));
        }
        if (PackageInstaller.SessionParamsMarshmallow.dataLoaderParams != null && DataLoaderParams.mData != null && (obj = PackageInstaller.SessionParamsMarshmallow.dataLoaderParams.get(sessionParams2)) != null) {
            sessionParams2.mData = DataLoaderParams.mData.get(obj);
        }
        return sessionParams2;
    }

    public PackageInstaller.SessionParams build() {
        Object obj;
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(this.mode);
        PackageInstaller.SessionParamsMarshmallow.installFlags.set(sessionParams, this.installFlags);
        PackageInstaller.SessionParamsMarshmallow.installLocation.set(sessionParams, this.installLocation);
        PackageInstaller.SessionParamsMarshmallow.sizeBytes.set(sessionParams, this.sizeBytes);
        PackageInstaller.SessionParamsMarshmallow.appPackageName.set(sessionParams, this.appPackageName);
        PackageInstaller.SessionParamsMarshmallow.appIcon.set(sessionParams, this.appIcon);
        PackageInstaller.SessionParamsMarshmallow.appLabel.set(sessionParams, this.appLabel);
        PackageInstaller.SessionParamsMarshmallow.appIconLastModified.set(sessionParams, this.appIconLastModified);
        PackageInstaller.SessionParamsMarshmallow.originatingUri.set(sessionParams, this.originatingUri);
        PackageInstaller.SessionParamsMarshmallow.referrerUri.set(sessionParams, this.referrerUri);
        PackageInstaller.SessionParamsMarshmallow.abiOverride.set(sessionParams, this.abiOverride);
        PackageInstaller.SessionParamsMarshmallow.volumeUuid.set(sessionParams, this.volumeUuid);
        RefObject<String[]> refObject = PackageInstaller.SessionParamsMarshmallow.grantedRuntimePermissions;
        if (refObject != null) {
            refObject.set(sessionParams, this.grantedRuntimePermissions);
        }
        RefObject<ArrayMap<String, Integer>> refObject2 = PackageInstaller.SessionParamsMarshmallow.mPermissionStates;
        if (refObject2 != null) {
            refObject2.get(sessionParams).putAll((ArrayMap<? extends String, ? extends Integer>) this.mPermissionStates);
        }
        if (PackageInstaller.SessionParamsMarshmallow.dataLoaderParams != null && DataLoaderParams.mData != null && (obj = PackageInstaller.SessionParamsMarshmallow.dataLoaderParams.get(sessionParams)) != null) {
            DataLoaderParams.mData.set(obj, this.mData);
        }
        return sessionParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.mode);
        parcel.writeInt(this.installFlags);
        parcel.writeInt(this.installLocation);
        parcel.writeLong(this.sizeBytes);
        parcel.writeString(this.appPackageName);
        parcel.writeParcelable(this.appIcon, i5);
        parcel.writeString(this.appLabel);
        parcel.writeLong(this.appIconLastModified);
        parcel.writeParcelable(this.originatingUri, i5);
        parcel.writeParcelable(this.referrerUri, i5);
        parcel.writeString(this.abiOverride);
        parcel.writeString(this.volumeUuid);
        parcel.writeStringArray(this.grantedRuntimePermissions);
        parcel.writeMap(this.mPermissionStates);
        parcel.writeParcelable(this.mData, i5);
    }

    protected SessionParams(Parcel parcel) {
        this.mode = -1;
        this.installLocation = 1;
        this.sizeBytes = -1L;
        this.appIconLastModified = -1L;
        this.mode = parcel.readInt();
        this.installFlags = parcel.readInt();
        this.installLocation = parcel.readInt();
        this.sizeBytes = parcel.readLong();
        this.appPackageName = parcel.readString();
        this.appIcon = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.appLabel = parcel.readString();
        this.appIconLastModified = parcel.readLong();
        this.originatingUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.referrerUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.abiOverride = parcel.readString();
        this.volumeUuid = parcel.readString();
        this.grantedRuntimePermissions = parcel.createStringArray();
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
            this.mPermissionStates = arrayMap;
            parcel.readMap(arrayMap, null, String.class, Integer.class);
        }
        this.mData = (DataLoaderParamsParcel) parcel.readParcelable(DataLoaderParamsParcel.class.getClassLoader());
    }
}

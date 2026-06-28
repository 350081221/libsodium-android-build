package com.lody.virtual.server.pm.legacy;

import android.os.Parcel;
import android.util.SparseArray;
import com.lody.virtual.server.pm.PackageUserState;

@Deprecated
/* loaded from: classes3.dex */
public class PackageSettingV1 {
    public int appId;
    public int flag;
    public boolean notCopyApk;
    public String packageName;
    public SparseArray<PackageUserState> userState;

    public void readFromParcel(Parcel parcel, int i5) {
        boolean z4;
        this.packageName = parcel.readString();
        parcel.readString();
        parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.notCopyApk = z4;
        this.appId = parcel.readInt();
        this.userState = parcel.readSparseArray(PackageUserState.class.getClassLoader());
        parcel.readByte();
        if (i5 > 3) {
            this.flag = parcel.readInt();
        }
    }
}

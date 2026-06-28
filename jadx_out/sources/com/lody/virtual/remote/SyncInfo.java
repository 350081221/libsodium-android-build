package com.lody.virtual.remote;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class SyncInfo {
    public static final Parcelable.Creator<SyncInfo> CREATOR = new Parcelable.Creator<SyncInfo>() { // from class: com.lody.virtual.remote.SyncInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncInfo createFromParcel(Parcel parcel) {
            return new SyncInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncInfo[] newArray(int i5) {
            return new SyncInfo[i5];
        }
    };
    public final Account account;
    public final String authority;
    public final int authorityId;
    public final long startTime;

    public SyncInfo(int i5, Account account, String str, long j5) {
        this.authorityId = i5;
        this.account = account;
        this.authority = str;
        this.startTime = j5;
    }

    public android.content.SyncInfo create() {
        return mirror.android.content.SyncInfo.ctor.newInstance(Integer.valueOf(this.authorityId), this.account, this.authority, Long.valueOf(this.startTime));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.authorityId);
        this.account.writeToParcel(parcel, 0);
        parcel.writeString(this.authority);
        parcel.writeLong(this.startTime);
    }

    SyncInfo(Parcel parcel) {
        this.authorityId = parcel.readInt();
        this.account = new Account(parcel);
        this.authority = parcel.readString();
        this.startTime = parcel.readLong();
    }
}

package com.lody.virtual.server.content;

import android.accounts.Account;
import android.content.SyncInfo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class VSyncInfo implements Parcelable {
    public final Account account;
    public final String authority;
    public final int authorityId;
    public final long startTime;
    private static final Account REDACTED_ACCOUNT = new Account("*****", "*****");
    public static final Parcelable.Creator<VSyncInfo> CREATOR = new Parcelable.Creator<VSyncInfo>() { // from class: com.lody.virtual.server.content.VSyncInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VSyncInfo createFromParcel(Parcel parcel) {
            return new VSyncInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VSyncInfo[] newArray(int i5) {
            return new VSyncInfo[i5];
        }
    };

    public VSyncInfo(int i5, Account account, String str, long j5) {
        this.authorityId = i5;
        this.account = account;
        this.authority = str;
        this.startTime = j5;
    }

    public static VSyncInfo createAccountRedacted(int i5, String str, long j5) {
        return new VSyncInfo(i5, REDACTED_ACCOUNT, str, j5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SyncInfo toSyncInfo() {
        return mirror.android.content.SyncInfo.ctor.newInstance(Integer.valueOf(this.authorityId), this.account, this.authority, Long.valueOf(this.startTime));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.authorityId);
        parcel.writeParcelable(this.account, i5);
        parcel.writeString(this.authority);
        parcel.writeLong(this.startTime);
    }

    public VSyncInfo(VSyncInfo vSyncInfo) {
        this.authorityId = vSyncInfo.authorityId;
        Account account = vSyncInfo.account;
        this.account = new Account(account.name, account.type);
        this.authority = vSyncInfo.authority;
        this.startTime = vSyncInfo.startTime;
    }

    VSyncInfo(Parcel parcel) {
        this.authorityId = parcel.readInt();
        this.account = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.authority = parcel.readString();
        this.startTime = parcel.readLong();
    }
}

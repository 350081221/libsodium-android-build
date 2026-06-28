package com.lody.virtual.server.content;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.helper.compat.ContentResolverCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class VSyncRecord {
    public SyncRecordKey key;
    public int userId;
    public int syncable = -1;
    public boolean isPeriodic = false;
    public Map<SyncExtras, PeriodicSyncConfig> configs = new HashMap();
    public List<SyncExtras> extras = new ArrayList();

    public VSyncRecord(int i5, Account account, String str) {
        this.userId = i5;
        this.key = new SyncRecordKey(account, str);
    }

    public static boolean equals(Bundle bundle, Bundle bundle2, boolean z4) {
        if (bundle == bundle2) {
            return true;
        }
        if (z4 && bundle.size() != bundle2.size()) {
            return false;
        }
        if (bundle.size() <= bundle2.size()) {
            bundle2 = bundle;
            bundle = bundle2;
        }
        for (String str : bundle.keySet()) {
            if (z4 || !isIgnoredKey(str)) {
                if (!bundle2.containsKey(str) || !bundle.get(str).equals(bundle2.get(str))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isIgnoredKey(String str) {
        if (!str.equals("expedited") && !str.equals("ignore_settings") && !str.equals("ignore_backoff") && !str.equals("do_not_retry") && !str.equals(TTDownloadField.TT_FORCE) && !str.equals("upload") && !str.equals("deletions_override") && !str.equals("discard_deletions") && !str.equals(ContentResolverCompat.SYNC_EXTRAS_EXPECTED_UPLOAD) && !str.equals(ContentResolverCompat.SYNC_EXTRAS_EXPECTED_DOWNLOAD) && !str.equals(ContentResolverCompat.SYNC_EXTRAS_PRIORITY) && !str.equals(ContentResolverCompat.SYNC_EXTRAS_DISALLOW_METERED) && !str.equals("initialize")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class PeriodicSyncConfig implements Parcelable {
        public static final Parcelable.Creator<PeriodicSyncConfig> CREATOR = new Parcelable.Creator<PeriodicSyncConfig>() { // from class: com.lody.virtual.server.content.VSyncRecord.PeriodicSyncConfig.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PeriodicSyncConfig createFromParcel(Parcel parcel) {
                return new PeriodicSyncConfig(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public PeriodicSyncConfig[] newArray(int i5) {
                return new PeriodicSyncConfig[i5];
            }
        };
        long syncRunTimeSecs;

        public PeriodicSyncConfig(long j5) {
            this.syncRunTimeSecs = j5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeLong(this.syncRunTimeSecs);
        }

        PeriodicSyncConfig(Parcel parcel) {
            this.syncRunTimeSecs = parcel.readLong();
        }
    }

    /* loaded from: classes3.dex */
    public static class SyncExtras implements Parcelable {
        public static final Parcelable.Creator<SyncExtras> CREATOR = new Parcelable.Creator<SyncExtras>() { // from class: com.lody.virtual.server.content.VSyncRecord.SyncExtras.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SyncExtras createFromParcel(Parcel parcel) {
                return new SyncExtras(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SyncExtras[] newArray(int i5) {
                return new SyncExtras[i5];
            }
        };
        Bundle extras;

        public SyncExtras(Bundle bundle) {
            this.extras = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return VSyncRecord.equals(this.extras, ((SyncExtras) obj).extras, false);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeBundle(this.extras);
        }

        SyncExtras(Parcel parcel) {
            this.extras = parcel.readBundle(getClass().getClassLoader());
        }
    }

    /* loaded from: classes3.dex */
    public static class SyncRecordKey implements Parcelable {
        public static final Parcelable.Creator<SyncRecordKey> CREATOR = new Parcelable.Creator<SyncRecordKey>() { // from class: com.lody.virtual.server.content.VSyncRecord.SyncRecordKey.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SyncRecordKey createFromParcel(Parcel parcel) {
                return new SyncRecordKey(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SyncRecordKey[] newArray(int i5) {
                return new SyncRecordKey[i5];
            }
        };
        Account account;
        String authority;

        SyncRecordKey(Account account, String str) {
            this.account = account;
            this.authority = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SyncRecordKey syncRecordKey = (SyncRecordKey) obj;
            Account account = this.account;
            if (account == null ? syncRecordKey.account != null : !account.equals(syncRecordKey.account)) {
                return false;
            }
            String str = this.authority;
            String str2 = syncRecordKey.authority;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeParcelable(this.account, i5);
            parcel.writeString(this.authority);
        }

        SyncRecordKey(Parcel parcel) {
            this.account = (Account) parcel.readParcelable(Account.class.getClassLoader());
            this.authority = parcel.readString();
        }
    }
}

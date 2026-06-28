package android.content;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SyncStatusInfo implements Parcelable {
    public static final Parcelable.Creator<SyncStatusInfo> CREATOR = new Parcelable.Creator<SyncStatusInfo>() { // from class: android.content.SyncStatusInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncStatusInfo createFromParcel(Parcel parcel) {
            return new SyncStatusInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SyncStatusInfo[] newArray(int i5) {
            return new SyncStatusInfo[i5];
        }
    };
    private static final String TAG = "Sync";
    static final int VERSION = 2;
    public final int authorityId;
    public long initialFailureTime;
    public boolean initialize;
    public String lastFailureMesg;
    public int lastFailureSource;
    public long lastFailureTime;
    public int lastSuccessSource;
    public long lastSuccessTime;
    public int numSourceLocal;
    public int numSourcePeriodic;
    public int numSourcePoll;
    public int numSourceServer;
    public int numSourceUser;
    public int numSyncs;
    public boolean pending;
    private ArrayList<Long> periodicSyncTimes;
    public long totalElapsedTime;

    public SyncStatusInfo(int i5) {
        this.authorityId = i5;
    }

    private void ensurePeriodicSyncTimeSize(int i5) {
        if (this.periodicSyncTimes == null) {
            this.periodicSyncTimes = new ArrayList<>(0);
        }
        int i6 = i5 + 1;
        if (this.periodicSyncTimes.size() < i6) {
            for (int size = this.periodicSyncTimes.size(); size < i6; size++) {
                this.periodicSyncTimes.add(0L);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLastFailureMesgAsInt(int i5) {
        return 0;
    }

    public long getPeriodicSyncTime(int i5) {
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList != null && i5 < arrayList.size()) {
            return this.periodicSyncTimes.get(i5).longValue();
        }
        return 0L;
    }

    public void removePeriodicSyncTime(int i5) {
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList != null && i5 < arrayList.size()) {
            this.periodicSyncTimes.remove(i5);
        }
    }

    public void setPeriodicSyncTime(int i5, long j5) {
        ensurePeriodicSyncTimeSize(i5);
        this.periodicSyncTimes.set(i5, Long.valueOf(j5));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(2);
        parcel.writeInt(this.authorityId);
        parcel.writeLong(this.totalElapsedTime);
        parcel.writeInt(this.numSyncs);
        parcel.writeInt(this.numSourcePoll);
        parcel.writeInt(this.numSourceServer);
        parcel.writeInt(this.numSourceLocal);
        parcel.writeInt(this.numSourceUser);
        parcel.writeLong(this.lastSuccessTime);
        parcel.writeInt(this.lastSuccessSource);
        parcel.writeLong(this.lastFailureTime);
        parcel.writeInt(this.lastFailureSource);
        parcel.writeString(this.lastFailureMesg);
        parcel.writeLong(this.initialFailureTime);
        parcel.writeInt(this.pending ? 1 : 0);
        parcel.writeInt(this.initialize ? 1 : 0);
        ArrayList<Long> arrayList = this.periodicSyncTimes;
        if (arrayList != null) {
            parcel.writeInt(arrayList.size());
            Iterator<Long> it = this.periodicSyncTimes.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
            return;
        }
        parcel.writeInt(-1);
    }

    public SyncStatusInfo(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 2 && readInt != 1) {
            Log.w("SyncStatusInfo", "Unknown version: " + readInt);
        }
        this.authorityId = parcel.readInt();
        this.totalElapsedTime = parcel.readLong();
        this.numSyncs = parcel.readInt();
        this.numSourcePoll = parcel.readInt();
        this.numSourceServer = parcel.readInt();
        this.numSourceLocal = parcel.readInt();
        this.numSourceUser = parcel.readInt();
        this.lastSuccessTime = parcel.readLong();
        this.lastSuccessSource = parcel.readInt();
        this.lastFailureTime = parcel.readLong();
        this.lastFailureSource = parcel.readInt();
        this.lastFailureMesg = parcel.readString();
        this.initialFailureTime = parcel.readLong();
        this.pending = parcel.readInt() != 0;
        this.initialize = parcel.readInt() != 0;
        if (readInt == 1) {
            this.periodicSyncTimes = null;
            return;
        }
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            this.periodicSyncTimes = null;
            return;
        }
        this.periodicSyncTimes = new ArrayList<>();
        for (int i5 = 0; i5 < readInt2; i5++) {
            this.periodicSyncTimes.add(Long.valueOf(parcel.readLong()));
        }
    }

    public SyncStatusInfo(SyncStatusInfo syncStatusInfo) {
        this.authorityId = syncStatusInfo.authorityId;
        this.totalElapsedTime = syncStatusInfo.totalElapsedTime;
        this.numSyncs = syncStatusInfo.numSyncs;
        this.numSourcePoll = syncStatusInfo.numSourcePoll;
        this.numSourceServer = syncStatusInfo.numSourceServer;
        this.numSourceLocal = syncStatusInfo.numSourceLocal;
        this.numSourceUser = syncStatusInfo.numSourceUser;
        this.numSourcePeriodic = syncStatusInfo.numSourcePeriodic;
        this.lastSuccessTime = syncStatusInfo.lastSuccessTime;
        this.lastSuccessSource = syncStatusInfo.lastSuccessSource;
        this.lastFailureTime = syncStatusInfo.lastFailureTime;
        this.lastFailureSource = syncStatusInfo.lastFailureSource;
        this.lastFailureMesg = syncStatusInfo.lastFailureMesg;
        this.initialFailureTime = syncStatusInfo.initialFailureTime;
        this.pending = syncStatusInfo.pending;
        this.initialize = syncStatusInfo.initialize;
        if (syncStatusInfo.periodicSyncTimes != null) {
            this.periodicSyncTimes = new ArrayList<>(syncStatusInfo.periodicSyncTimes);
        }
    }
}

package com.lody.virtual.remote;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.lody.virtual.helper.compat.PendingIntentCompat;

/* loaded from: classes3.dex */
public class IntentSenderData implements Parcelable {
    public static final Parcelable.Creator<IntentSenderData> CREATOR = new Parcelable.Creator<IntentSenderData>() { // from class: com.lody.virtual.remote.IntentSenderData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderData createFromParcel(Parcel parcel) {
            return new IntentSenderData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IntentSenderData[] newArray(int i5) {
            return new IntentSenderData[i5];
        }
    };
    public String targetPkg;
    public IBinder token;
    public int type;
    public int userId;

    public IntentSenderData(String str, IBinder iBinder, int i5, int i6) {
        this.targetPkg = str;
        this.token = iBinder;
        this.type = i5;
        this.userId = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PendingIntent getPendingIntent() {
        return PendingIntentCompat.readPendingIntent(this.token);
    }

    public void update(IntentSenderData intentSenderData) {
        this.targetPkg = intentSenderData.targetPkg;
        this.type = intentSenderData.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.targetPkg);
        parcel.writeStrongBinder(this.token);
        parcel.writeInt(this.type);
        parcel.writeInt(this.userId);
    }

    protected IntentSenderData(Parcel parcel) {
        this.targetPkg = parcel.readString();
        this.token = parcel.readStrongBinder();
        this.type = parcel.readInt();
        this.userId = parcel.readInt();
    }
}

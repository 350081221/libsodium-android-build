package com.lody.virtual.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class ClientConfig implements Parcelable {
    public static final Parcelable.Creator<ClientConfig> CREATOR = new Parcelable.Creator<ClientConfig>() { // from class: com.lody.virtual.remote.ClientConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ClientConfig createFromParcel(Parcel parcel) {
            return new ClientConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ClientConfig[] newArray(int i5) {
            return new ClientConfig[i5];
        }
    };
    public boolean isExt;
    public String packageName;
    public String processName;
    public IBinder token;
    public int vpid;
    public int vuid;

    public ClientConfig() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.isExt ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.vpid);
        parcel.writeInt(this.vuid);
        parcel.writeString(this.processName);
        parcel.writeString(this.packageName);
        parcel.writeStrongBinder(this.token);
    }

    protected ClientConfig(Parcel parcel) {
        this.isExt = parcel.readByte() != 0;
        this.vpid = parcel.readInt();
        this.vuid = parcel.readInt();
        this.processName = parcel.readString();
        this.packageName = parcel.readString();
        this.token = parcel.readStrongBinder();
    }
}

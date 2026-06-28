package com.tencent.mmkv;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ParcelableMMKV implements Parcelable {
    public static final Parcelable.Creator<ParcelableMMKV> CREATOR = new Parcelable.Creator<ParcelableMMKV>() { // from class: com.tencent.mmkv.ParcelableMMKV.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableMMKV createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                return null;
            }
            return new ParcelableMMKV(readString, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), readString2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableMMKV[] newArray(int i5) {
            return new ParcelableMMKV[i5];
        }
    };
    private int ashmemFD;
    private int ashmemMetaFD;
    private String cryptKey;
    private final String mmapID;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    public MMKV toMMKV() {
        int i5;
        int i6 = this.ashmemFD;
        if (i6 >= 0 && (i5 = this.ashmemMetaFD) >= 0) {
            return MMKV.mmkvWithAshmemFD(this.mmapID, i6, i5, this.cryptKey);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        try {
            parcel.writeString(this.mmapID);
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(this.ashmemFD);
            ParcelFileDescriptor fromFd2 = ParcelFileDescriptor.fromFd(this.ashmemMetaFD);
            int i6 = i5 | 1;
            fromFd.writeToParcel(parcel, i6);
            fromFd2.writeToParcel(parcel, i6);
            String str = this.cryptKey;
            if (str != null) {
                parcel.writeString(str);
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public ParcelableMMKV(MMKV mmkv) {
        this.ashmemFD = -1;
        this.ashmemMetaFD = -1;
        this.cryptKey = null;
        this.mmapID = mmkv.mmapID();
        this.ashmemFD = mmkv.ashmemFD();
        this.ashmemMetaFD = mmkv.ashmemMetaFD();
        this.cryptKey = mmkv.cryptKey();
    }

    private ParcelableMMKV(String str, int i5, int i6, String str2) {
        this.mmapID = str;
        this.ashmemFD = i5;
        this.ashmemMetaFD = i6;
        this.cryptKey = str2;
    }
}

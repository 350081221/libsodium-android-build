package com.huawei.agconnect.datastore.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;

/* loaded from: classes3.dex */
class ParcelableSerializer {
    private static final String TAG = "ParcelableSerializer";

    ParcelableSerializer() {
    }

    private static <T extends Parcelable> T deserializeFromBytes(byte[] bArr, Parcelable.Creator<T> creator) {
        if (creator == null || bArr.length == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Parcelable> T deserializeFromString(String str, Parcelable.Creator<T> creator) {
        try {
            return (T) deserializeFromBytes(Base64.decode(str, 0), creator);
        } catch (IllegalArgumentException unused) {
            Log.e(TAG, "Base64 decode error");
            return null;
        }
    }

    private static <T extends Parcelable> byte[] serializeToBytes(T t5) {
        Parcel obtain = Parcel.obtain();
        t5.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Parcelable> String serializeToString(T t5) {
        return Base64.encodeToString(serializeToBytes(t5), 0);
    }
}

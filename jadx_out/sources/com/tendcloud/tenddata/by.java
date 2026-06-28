package com.tendcloud.tenddata;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
interface by extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements by {
        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) {
            Bundle bundle;
            boolean z4;
            if (i5 == 1) {
                h.iForInternal("transact first");
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                int readInt = parcel.readInt();
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                callback(readInt, readLong, z4, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            } else {
                if (i5 != 2) {
                    h.iForInternal("transact !2");
                    if (i5 != 1598968902) {
                        h.iForInternal("transact !transaction");
                        return super.onTransact(i5, parcel, parcel2, i6);
                    }
                    parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    return true;
                }
                h.iForInternal("transact else");
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                callback(readInt2, bundle);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void callback(int i5, long j5, boolean z4, float f5, double d5, String str);

    void callback(int i5, Bundle bundle);
}

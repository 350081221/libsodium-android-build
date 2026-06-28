package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IAIDLCallback extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAIDLCallback {
        private static final String DESCRIPTOR = "com.huawei.hms.core.aidl.IAIDLCallback";
        static final int TRANSACTION_call = 1;

        /* loaded from: classes3.dex */
        private static class a implements IAIDLCallback {

            /* renamed from: b, reason: collision with root package name */
            public static IAIDLCallback f8370b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f8371a;

            a(IBinder iBinder) {
                this.f8371a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8371a;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAIDLCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAIDLCallback)) {
                return (IAIDLCallback) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static IAIDLCallback getDefaultImpl() {
            return a.f8370b;
        }

        public static boolean setDefaultImpl(IAIDLCallback iAIDLCallback) {
            if (a.f8370b == null && iAIDLCallback != null) {
                a.f8370b = iAIDLCallback;
                return true;
            }
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            DataBuffer dataBuffer;
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                dataBuffer = DataBuffer.CREATOR.createFromParcel(parcel);
            } else {
                dataBuffer = null;
            }
            call(dataBuffer);
            return true;
        }
    }

    void call(DataBuffer dataBuffer) throws RemoteException;
}

package com.huawei.hms.core.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.core.aidl.IAIDLCallback;

/* loaded from: classes3.dex */
public interface IAIDLInvoke extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAIDLInvoke {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class a implements IAIDLInvoke {

            /* renamed from: b, reason: collision with root package name */
            public static IAIDLInvoke f8372b;

            /* renamed from: a, reason: collision with root package name */
            private IBinder f8373a;

            a(IBinder iBinder) {
                this.f8373a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8373a;
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (dataBuffer != null) {
                        obtain.writeInt(1);
                        dataBuffer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iAIDLCallback != null) {
                        iBinder = iAIDLCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f8373a.transact(2, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().asyncCall(dataBuffer, iAIDLCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.huawei.hms.core.aidl.IAIDLInvoke
            public void syncCall(DataBuffer dataBuffer) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.hms.core.aidl.IAIDLInvoke");
                    if (dataBuffer != null) {
                        obtain.writeInt(1);
                        dataBuffer.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f8373a.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().syncCall(dataBuffer);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.core.aidl.IAIDLInvoke");
        }

        public static IAIDLInvoke asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAIDLInvoke)) {
                return (IAIDLInvoke) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static IAIDLInvoke getDefaultImpl() {
            return a.f8372b;
        }

        public static boolean setDefaultImpl(IAIDLInvoke iAIDLInvoke) {
            if (a.f8372b == null && iAIDLInvoke != null) {
                a.f8372b = iAIDLInvoke;
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
            DataBuffer dataBuffer = null;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 1598968902) {
                        return super.onTransact(i5, parcel, parcel2, i6);
                    }
                    parcel2.writeString("com.huawei.hms.core.aidl.IAIDLInvoke");
                    return true;
                }
                parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
                if (parcel.readInt() != 0) {
                    dataBuffer = DataBuffer.CREATOR.createFromParcel(parcel);
                }
                asyncCall(dataBuffer, IAIDLCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            parcel.enforceInterface("com.huawei.hms.core.aidl.IAIDLInvoke");
            if (parcel.readInt() != 0) {
                dataBuffer = DataBuffer.CREATOR.createFromParcel(parcel);
            }
            syncCall(dataBuffer);
            parcel2.writeNoException();
            return true;
        }
    }

    void asyncCall(DataBuffer dataBuffer, IAIDLCallback iAIDLCallback) throws RemoteException;

    void syncCall(DataBuffer dataBuffer) throws RemoteException;
}

package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IProcessObserver extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IProcessObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IProcessObserver
        public void onProcessCreated(String str, String str2) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IProcessObserver
        public void onProcessDied(String str, String str2) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IProcessObserver {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IProcessObserver";
        static final int TRANSACTION_onProcessCreated = 1;
        static final int TRANSACTION_onProcessDied = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IProcessObserver {
            public static IProcessObserver sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IProcessObserver
            public void onProcessCreated(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onProcessCreated(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IProcessObserver
            public void onProcessDied(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onProcessDied(str, str2);
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
            attachInterface(this, DESCRIPTOR);
        }

        public static IProcessObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IProcessObserver)) {
                return (IProcessObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IProcessObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IProcessObserver iProcessObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iProcessObserver != null) {
                    Proxy.sDefaultImpl = iProcessObserver;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 1598968902) {
                        return super.onTransact(i5, parcel, parcel2, i6);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onProcessDied(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onProcessCreated(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onProcessCreated(String str, String str2) throws RemoteException;

    void onProcessDied(String str, String str2) throws RemoteException;
}

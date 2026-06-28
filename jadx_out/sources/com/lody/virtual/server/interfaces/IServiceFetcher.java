package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IServiceFetcher extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IServiceFetcher {
        @Override // com.lody.virtual.server.interfaces.IServiceFetcher
        public void addService(String str, IBinder iBinder) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IServiceFetcher
        public IBinder getService(String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IServiceFetcher
        public void removeService(String str) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IServiceFetcher {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IServiceFetcher";
        static final int TRANSACTION_addService = 2;
        static final int TRANSACTION_getService = 1;
        static final int TRANSACTION_removeService = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IServiceFetcher {
            public static IServiceFetcher sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.interfaces.IServiceFetcher
            public void addService(String str, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addService(str, iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IServiceFetcher
            public IBinder getService(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getService(str);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IServiceFetcher
            public void removeService(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().removeService(str);
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

        public static IServiceFetcher asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IServiceFetcher)) {
                return (IServiceFetcher) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IServiceFetcher getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IServiceFetcher iServiceFetcher) {
            if (Proxy.sDefaultImpl == null) {
                if (iServiceFetcher != null) {
                    Proxy.sDefaultImpl = iServiceFetcher;
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
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString(DESCRIPTOR);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    removeService(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                addService(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            IBinder service = getService(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(service);
            return true;
        }
    }

    void addService(String str, IBinder iBinder) throws RemoteException;

    IBinder getService(String str) throws RemoteException;

    void removeService(String str) throws RemoteException;
}

package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IVirtualStorageService extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IVirtualStorageService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
        public String getVirtualStorage(String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
        public boolean isVirtualStorageEnable(String str, int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
        public void setVirtualStorage(String str, int i5, String str2) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
        public void setVirtualStorageState(String str, int i5, boolean z4) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IVirtualStorageService {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IVirtualStorageService";
        static final int TRANSACTION_getVirtualStorage = 2;
        static final int TRANSACTION_isVirtualStorageEnable = 4;
        static final int TRANSACTION_setVirtualStorage = 1;
        static final int TRANSACTION_setVirtualStorageState = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IVirtualStorageService {
            public static IVirtualStorageService sDefaultImpl;
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

            @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
            public String getVirtualStorage(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVirtualStorage(str, i5);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
            public boolean isVirtualStorageEnable(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVirtualStorageEnable(str, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z4 = true;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
            public void setVirtualStorage(String str, int i5, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setVirtualStorage(str, i5, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualStorageService
            public void setVirtualStorageState(String str, int i5, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setVirtualStorageState(str, i5, z4);
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

        public static IVirtualStorageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IVirtualStorageService)) {
                return (IVirtualStorageService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IVirtualStorageService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IVirtualStorageService iVirtualStorageService) {
            if (Proxy.sDefaultImpl == null) {
                if (iVirtualStorageService != null) {
                    Proxy.sDefaultImpl = iVirtualStorageService;
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
            boolean z4;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 1598968902) {
                                return super.onTransact(i5, parcel, parcel2, i6);
                            }
                            parcel2.writeString(DESCRIPTOR);
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isVirtualStorageEnable = isVirtualStorageEnable(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isVirtualStorageEnable ? 1 : 0);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    setVirtualStorageState(readString, readInt, z4);
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                String virtualStorage = getVirtualStorage(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(virtualStorage);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            setVirtualStorage(parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    String getVirtualStorage(String str, int i5) throws RemoteException;

    boolean isVirtualStorageEnable(String str, int i5) throws RemoteException;

    void setVirtualStorage(String str, int i5, String str2) throws RemoteException;

    void setVirtualStorageState(String str, int i5, boolean z4) throws RemoteException;
}

package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IPackageObserver extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IPackageObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IPackageObserver
        public void onPackageInstalled(String str) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IPackageObserver
        public void onPackageInstalledAsUser(int i5, String str) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IPackageObserver
        public void onPackageUninstalled(String str) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IPackageObserver
        public void onPackageUninstalledAsUser(int i5, String str) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IPackageObserver {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IPackageObserver";
        static final int TRANSACTION_onPackageInstalled = 1;
        static final int TRANSACTION_onPackageInstalledAsUser = 3;
        static final int TRANSACTION_onPackageUninstalled = 2;
        static final int TRANSACTION_onPackageUninstalledAsUser = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IPackageObserver {
            public static IPackageObserver sDefaultImpl;
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

            @Override // com.lody.virtual.server.interfaces.IPackageObserver
            public void onPackageInstalled(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onPackageInstalled(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IPackageObserver
            public void onPackageInstalledAsUser(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onPackageInstalledAsUser(i5, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IPackageObserver
            public void onPackageUninstalled(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onPackageUninstalled(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IPackageObserver
            public void onPackageUninstalledAsUser(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onPackageUninstalledAsUser(i5, str);
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

        public static IPackageObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPackageObserver)) {
                return (IPackageObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IPackageObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPackageObserver iPackageObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iPackageObserver != null) {
                    Proxy.sDefaultImpl = iPackageObserver;
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
                        if (i5 != 4) {
                            if (i5 != 1598968902) {
                                return super.onTransact(i5, parcel, parcel2, i6);
                            }
                            parcel2.writeString(DESCRIPTOR);
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        onPackageUninstalledAsUser(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    onPackageInstalledAsUser(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onPackageUninstalled(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onPackageInstalled(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onPackageInstalled(String str) throws RemoteException;

    void onPackageInstalledAsUser(int i5, String str) throws RemoteException;

    void onPackageUninstalled(String str) throws RemoteException;

    void onPackageUninstalledAsUser(int i5, String str) throws RemoteException;
}

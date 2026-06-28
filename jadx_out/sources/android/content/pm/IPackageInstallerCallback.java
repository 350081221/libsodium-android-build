package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IPackageInstallerCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IPackageInstallerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageInstallerCallback
        public void onSessionActiveChanged(int i5, boolean z4) throws RemoteException {
        }

        @Override // android.content.pm.IPackageInstallerCallback
        public void onSessionBadgingChanged(int i5) throws RemoteException {
        }

        @Override // android.content.pm.IPackageInstallerCallback
        public void onSessionCreated(int i5) throws RemoteException {
        }

        @Override // android.content.pm.IPackageInstallerCallback
        public void onSessionFinished(int i5, boolean z4) throws RemoteException {
        }

        @Override // android.content.pm.IPackageInstallerCallback
        public void onSessionProgressChanged(int i5, float f5) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageInstallerCallback {
        private static final String DESCRIPTOR = "android.content.pm.IPackageInstallerCallback";
        static final int TRANSACTION_onSessionActiveChanged = 3;
        static final int TRANSACTION_onSessionBadgingChanged = 2;
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionFinished = 5;
        static final int TRANSACTION_onSessionProgressChanged = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageInstallerCallback {
            public static IPackageInstallerCallback sDefaultImpl;
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

            @Override // android.content.pm.IPackageInstallerCallback
            public void onSessionActiveChanged(int i5, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSessionActiveChanged(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.pm.IPackageInstallerCallback
            public void onSessionBadgingChanged(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSessionBadgingChanged(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.pm.IPackageInstallerCallback
            public void onSessionCreated(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSessionCreated(i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.pm.IPackageInstallerCallback
            public void onSessionFinished(int i5, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSessionFinished(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.content.pm.IPackageInstallerCallback
            public void onSessionProgressChanged(int i5, float f5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeFloat(f5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onSessionProgressChanged(i5, f5);
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

        public static IPackageInstallerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPackageInstallerCallback)) {
                return (IPackageInstallerCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IPackageInstallerCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPackageInstallerCallback iPackageInstallerCallback) {
            if (Proxy.sDefaultImpl == null) {
                if (iPackageInstallerCallback != null) {
                    Proxy.sDefaultImpl = iPackageInstallerCallback;
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
                    boolean z4 = false;
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                if (i5 != 1598968902) {
                                    return super.onTransact(i5, parcel, parcel2, i6);
                                }
                                parcel2.writeString(DESCRIPTOR);
                                return true;
                            }
                            parcel.enforceInterface(DESCRIPTOR);
                            int readInt = parcel.readInt();
                            if (parcel.readInt() != 0) {
                                z4 = true;
                            }
                            onSessionFinished(readInt, z4);
                            parcel2.writeNoException();
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        onSessionProgressChanged(parcel.readInt(), parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    onSessionActiveChanged(readInt2, z4);
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onSessionBadgingChanged(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onSessionCreated(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onSessionActiveChanged(int i5, boolean z4) throws RemoteException;

    void onSessionBadgingChanged(int i5) throws RemoteException;

    void onSessionCreated(int i5) throws RemoteException;

    void onSessionFinished(int i5, boolean z4) throws RemoteException;

    void onSessionProgressChanged(int i5, float f5) throws RemoteException;
}

package com.lody.virtual.server.app;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IAppInstallerSession extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IAppInstallerSession {
        @Override // com.lody.virtual.server.app.IAppInstallerSession
        public void addPackage(Uri uri) throws RemoteException {
        }

        @Override // com.lody.virtual.server.app.IAppInstallerSession
        public void addSplit(Uri uri) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.app.IAppInstallerSession
        public void cancel() throws RemoteException {
        }

        @Override // com.lody.virtual.server.app.IAppInstallerSession
        public void commit(IntentSender intentSender) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAppInstallerSession {
        private static final String DESCRIPTOR = "com.lody.virtual.server.app.IAppInstallerSession";
        static final int TRANSACTION_addPackage = 1;
        static final int TRANSACTION_addSplit = 2;
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_commit = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IAppInstallerSession {
            public static IAppInstallerSession sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.app.IAppInstallerSession
            public void addPackage(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addPackage(uri);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.app.IAppInstallerSession
            public void addSplit(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addSplit(uri);
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

            @Override // com.lody.virtual.server.app.IAppInstallerSession
            public void cancel() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancel();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.app.IAppInstallerSession
            public void commit(IntentSender intentSender) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intentSender != null) {
                        obtain.writeInt(1);
                        intentSender.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().commit(intentSender);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAppInstallerSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppInstallerSession)) {
                return (IAppInstallerSession) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IAppInstallerSession getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAppInstallerSession iAppInstallerSession) {
            if (Proxy.sDefaultImpl == null) {
                if (iAppInstallerSession != null) {
                    Proxy.sDefaultImpl = iAppInstallerSession;
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
            Uri uri = null;
            IntentSender intentSender = null;
            Uri uri2 = null;
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
                        cancel();
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    if (parcel.readInt() != 0) {
                        intentSender = (IntentSender) IntentSender.CREATOR.createFromParcel(parcel);
                    }
                    commit(intentSender);
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                }
                addSplit(uri2);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
            }
            addPackage(uri);
            parcel2.writeNoException();
            return true;
        }
    }

    void addPackage(Uri uri) throws RemoteException;

    void addSplit(Uri uri) throws RemoteException;

    void cancel() throws RemoteException;

    void commit(IntentSender intentSender) throws RemoteException;
}

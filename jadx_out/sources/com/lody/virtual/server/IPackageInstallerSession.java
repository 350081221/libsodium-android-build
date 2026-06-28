package com.lody.virtual.server;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IPackageInstallerSession extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IPackageInstallerSession {
        @Override // com.lody.virtual.server.IPackageInstallerSession
        public void abandon() throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public void addClientProgress(float f5) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public void close() throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public void commit(IntentSender intentSender) throws RemoteException {
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public String[] getNames() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public ParcelFileDescriptor openRead(String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public ParcelFileDescriptor openWrite(String str, long j5, long j6) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.IPackageInstallerSession
        public void setClientProgress(float f5) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IPackageInstallerSession {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IPackageInstallerSession";
        static final int TRANSACTION_abandon = 8;
        static final int TRANSACTION_addClientProgress = 2;
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_commit = 7;
        static final int TRANSACTION_getNames = 3;
        static final int TRANSACTION_openRead = 5;
        static final int TRANSACTION_openWrite = 4;
        static final int TRANSACTION_setClientProgress = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IPackageInstallerSession {
            public static IPackageInstallerSession sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public void abandon() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().abandon();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public void addClientProgress(float f5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f5);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addClientProgress(f5);
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

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public void close() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().close();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
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
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public String[] getNames() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNames();
                    }
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public ParcelFileDescriptor openRead(String str) throws RemoteException {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openRead(str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelFileDescriptor = null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public ParcelFileDescriptor openWrite(String str, long j5, long j6) throws RemoteException {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j5);
                    obtain.writeLong(j6);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openWrite(str, j5, j6);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelFileDescriptor = null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.IPackageInstallerSession
            public void setClientProgress(float f5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setClientProgress(f5);
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

        public static IPackageInstallerSession asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPackageInstallerSession)) {
                return (IPackageInstallerSession) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IPackageInstallerSession getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPackageInstallerSession iPackageInstallerSession) {
            if (Proxy.sDefaultImpl == null) {
                if (iPackageInstallerSession != null) {
                    Proxy.sDefaultImpl = iPackageInstallerSession;
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
            IntentSender intentSender;
            if (i5 != 1598968902) {
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        setClientProgress(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        addClientProgress(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        String[] names = getNames();
                        parcel2.writeNoException();
                        parcel2.writeStringArray(names);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        ParcelFileDescriptor openWrite = openWrite(parcel.readString(), parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        if (openWrite != null) {
                            parcel2.writeInt(1);
                            openWrite.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        ParcelFileDescriptor openRead = openRead(parcel.readString());
                        parcel2.writeNoException();
                        if (openRead != null) {
                            parcel2.writeInt(1);
                            openRead.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        close();
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            intentSender = (IntentSender) IntentSender.CREATOR.createFromParcel(parcel);
                        } else {
                            intentSender = null;
                        }
                        commit(intentSender);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        abandon();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    void abandon() throws RemoteException;

    void addClientProgress(float f5) throws RemoteException;

    void close() throws RemoteException;

    void commit(IntentSender intentSender) throws RemoteException;

    String[] getNames() throws RemoteException;

    ParcelFileDescriptor openRead(String str) throws RemoteException;

    ParcelFileDescriptor openWrite(String str, long j5, long j6) throws RemoteException;

    void setClientProgress(float f5) throws RemoteException;
}

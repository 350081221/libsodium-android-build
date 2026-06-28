package com.lody.virtual.server.fs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.lody.virtual.remote.FileInfo;

/* loaded from: classes3.dex */
public interface IFileTransfer extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IFileTransfer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.fs.IFileTransfer
        public FileInfo[] listFiles(String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.fs.IFileTransfer
        public ParcelFileDescriptor openFile(String str) throws RemoteException {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IFileTransfer {
        private static final String DESCRIPTOR = "com.lody.virtual.server.fs.IFileTransfer";
        static final int TRANSACTION_listFiles = 1;
        static final int TRANSACTION_openFile = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IFileTransfer {
            public static IFileTransfer sDefaultImpl;
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

            @Override // com.lody.virtual.server.fs.IFileTransfer
            public FileInfo[] listFiles(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().listFiles(str);
                    }
                    obtain2.readException();
                    return (FileInfo[]) obtain2.createTypedArray(FileInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.fs.IFileTransfer
            public ParcelFileDescriptor openFile(String str) throws RemoteException {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().openFile(str);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IFileTransfer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFileTransfer)) {
                return (IFileTransfer) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IFileTransfer getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IFileTransfer iFileTransfer) {
            if (Proxy.sDefaultImpl == null) {
                if (iFileTransfer != null) {
                    Proxy.sDefaultImpl = iFileTransfer;
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
                ParcelFileDescriptor openFile = openFile(parcel.readString());
                parcel2.writeNoException();
                if (openFile != null) {
                    parcel2.writeInt(1);
                    openFile.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            FileInfo[] listFiles = listFiles(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeTypedArray(listFiles, 1);
            return true;
        }
    }

    FileInfo[] listFiles(String str) throws RemoteException;

    ParcelFileDescriptor openFile(String str) throws RemoteException;
}

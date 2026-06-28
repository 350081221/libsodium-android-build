package com.lody.virtual.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IRequestPermissionsResult extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IRequestPermissionsResult {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.IRequestPermissionsResult
        public boolean onResult(int i5, String[] strArr, int[] iArr) throws RemoteException {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IRequestPermissionsResult {
        private static final String DESCRIPTOR = "com.lody.virtual.server.IRequestPermissionsResult";
        static final int TRANSACTION_onResult = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IRequestPermissionsResult {
            public static IRequestPermissionsResult sDefaultImpl;
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

            @Override // com.lody.virtual.server.IRequestPermissionsResult
            public boolean onResult(int i5, String[] strArr, int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStringArray(strArr);
                    obtain.writeIntArray(iArr);
                    boolean z4 = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onResult(i5, strArr, iArr);
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRequestPermissionsResult asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRequestPermissionsResult)) {
                return (IRequestPermissionsResult) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IRequestPermissionsResult getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRequestPermissionsResult iRequestPermissionsResult) {
            if (Proxy.sDefaultImpl == null) {
                if (iRequestPermissionsResult != null) {
                    Proxy.sDefaultImpl = iRequestPermissionsResult;
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
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            boolean onResult = onResult(parcel.readInt(), parcel.createStringArray(), parcel.createIntArray());
            parcel2.writeNoException();
            parcel2.writeInt(onResult ? 1 : 0);
            return true;
        }
    }

    boolean onResult(int i5, String[] strArr, int[] iArr) throws RemoteException;
}

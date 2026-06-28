package com.lody.virtual.server.interfaces;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface IIntentFilterObserver extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IIntentFilterObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
        public Intent filter(Intent intent) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
        public IBinder getCallBack() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
        public void setCallBack(IBinder iBinder) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IIntentFilterObserver {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IIntentFilterObserver";
        static final int TRANSACTION_filter = 1;
        static final int TRANSACTION_getCallBack = 3;
        static final int TRANSACTION_setCallBack = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IIntentFilterObserver {
            public static IIntentFilterObserver sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
            public Intent filter(Intent intent) throws RemoteException {
                Intent intent2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().filter(intent);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        intent2 = (Intent) Intent.CREATOR.createFromParcel(obtain2);
                    } else {
                        intent2 = null;
                    }
                    return intent2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
            public IBinder getCallBack() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallBack();
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IIntentFilterObserver
            public void setCallBack(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setCallBack(iBinder);
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

        public static IIntentFilterObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIntentFilterObserver)) {
                return (IIntentFilterObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IIntentFilterObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IIntentFilterObserver iIntentFilterObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iIntentFilterObserver != null) {
                    Proxy.sDefaultImpl = iIntentFilterObserver;
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
            Intent intent;
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
                    IBinder callBack = getCallBack();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(callBack);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                setCallBack(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            } else {
                intent = null;
            }
            Intent filter = filter(intent);
            parcel2.writeNoException();
            if (filter != null) {
                parcel2.writeInt(1);
                filter.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    Intent filter(Intent intent) throws RemoteException;

    IBinder getCallBack() throws RemoteException;

    void setCallBack(IBinder iBinder) throws RemoteException;
}

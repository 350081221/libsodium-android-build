package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IPackageDataObserver extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IPackageDataObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.content.pm.IPackageDataObserver
        public void onRemoveCompleted(String str, boolean z4) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageDataObserver {
        private static final String DESCRIPTOR = "android.content.pm.IPackageDataObserver";
        static final int TRANSACTION_onRemoveCompleted = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IPackageDataObserver {
            public static IPackageDataObserver sDefaultImpl;
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

            @Override // android.content.pm.IPackageDataObserver
            public void onRemoveCompleted(String str, boolean z4) throws RemoteException {
                int i5;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (z4) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onRemoveCompleted(str, z4);
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

        public static IPackageDataObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IPackageDataObserver)) {
                return (IPackageDataObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IPackageDataObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IPackageDataObserver iPackageDataObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iPackageDataObserver != null) {
                    Proxy.sDefaultImpl = iPackageDataObserver;
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
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            onRemoveCompleted(readString, z4);
            parcel2.writeNoException();
            return true;
        }
    }

    void onRemoveCompleted(String str, boolean z4) throws RemoteException;
}

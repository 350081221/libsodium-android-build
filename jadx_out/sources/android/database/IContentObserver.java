package android.database;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IContentObserver extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IContentObserver {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.database.IContentObserver
        public void onChange(boolean z4, Uri uri, int i5) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IContentObserver {
        private static final String DESCRIPTOR = "android.database.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IContentObserver {
            public static IContentObserver sDefaultImpl;
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

            @Override // android.database.IContentObserver
            public void onChange(boolean z4, Uri uri, int i5) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onChange(z4, uri, i5);
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

        public static IContentObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IContentObserver)) {
                return (IContentObserver) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IContentObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IContentObserver iContentObserver) {
            if (Proxy.sDefaultImpl == null) {
                if (iContentObserver != null) {
                    Proxy.sDefaultImpl = iContentObserver;
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
            Uri uri;
            if (i5 != 1) {
                if (i5 != 1598968902) {
                    return super.onTransact(i5, parcel, parcel2, i6);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
            } else {
                uri = null;
            }
            onChange(z4, uri, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onChange(boolean z4, Uri uri, int i5) throws RemoteException;
}

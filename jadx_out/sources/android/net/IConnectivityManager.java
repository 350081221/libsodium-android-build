package android.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IConnectivityManager extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IConnectivityManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public LinkProperties getActiveLinkProperties() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getActiveNetworkInfo() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getActiveNetworkInfoForUid(int i5, boolean z4) throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo[] getAllNetworkInfo() throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public LinkProperties getLinkProperties(int i5) throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getNetworkInfo(int i5) throws RemoteException {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public boolean isActiveNetworkMetered() throws RemoteException {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean requestRouteToHostAddress(int i5, int i6) throws RemoteException {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IConnectivityManager {
        private static final String DESCRIPTOR = "android.net.IConnectivityManager";
        static final int TRANSACTION_getActiveLinkProperties = 7;
        static final int TRANSACTION_getActiveNetworkInfo = 1;
        static final int TRANSACTION_getActiveNetworkInfoForUid = 2;
        static final int TRANSACTION_getAllNetworkInfo = 4;
        static final int TRANSACTION_getLinkProperties = 8;
        static final int TRANSACTION_getNetworkInfo = 3;
        static final int TRANSACTION_isActiveNetworkMetered = 5;
        static final int TRANSACTION_requestRouteToHostAddress = 6;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IConnectivityManager {
            public static IConnectivityManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.net.IConnectivityManager
            public LinkProperties getActiveLinkProperties() throws RemoteException {
                LinkProperties linkProperties;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActiveLinkProperties();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        linkProperties = (LinkProperties) LinkProperties.CREATOR.createFromParcel(obtain2);
                    } else {
                        linkProperties = null;
                    }
                    return linkProperties;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getActiveNetworkInfo() throws RemoteException {
                NetworkInfo networkInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActiveNetworkInfo();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        networkInfo = (NetworkInfo) NetworkInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        networkInfo = null;
                    }
                    return networkInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getActiveNetworkInfoForUid(int i5, boolean z4) throws RemoteException {
                int i6;
                NetworkInfo networkInfo;
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
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActiveNetworkInfoForUid(i5, z4);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        networkInfo = (NetworkInfo) NetworkInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        networkInfo = null;
                    }
                    return networkInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo[] getAllNetworkInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllNetworkInfo();
                    }
                    obtain2.readException();
                    return (NetworkInfo[]) obtain2.createTypedArray(NetworkInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.net.IConnectivityManager
            public LinkProperties getLinkProperties(int i5) throws RemoteException {
                LinkProperties linkProperties;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLinkProperties(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        linkProperties = (LinkProperties) LinkProperties.CREATOR.createFromParcel(obtain2);
                    } else {
                        linkProperties = null;
                    }
                    return linkProperties;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getNetworkInfo(int i5) throws RemoteException {
                NetworkInfo networkInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNetworkInfo(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        networkInfo = (NetworkInfo) NetworkInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        networkInfo = null;
                    }
                    return networkInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean isActiveNetworkMetered() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isActiveNetworkMetered();
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

            @Override // android.net.IConnectivityManager
            public boolean requestRouteToHostAddress(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    boolean z4 = false;
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().requestRouteToHostAddress(i5, i6);
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

        public static IConnectivityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IConnectivityManager)) {
                return (IConnectivityManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IConnectivityManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IConnectivityManager iConnectivityManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iConnectivityManager != null) {
                    Proxy.sDefaultImpl = iConnectivityManager;
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
            if (i5 != 1598968902) {
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
                        parcel2.writeNoException();
                        if (activeNetworkInfo != null) {
                            parcel2.writeInt(1);
                            activeNetworkInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        NetworkInfo activeNetworkInfoForUid = getActiveNetworkInfoForUid(readInt, z4);
                        parcel2.writeNoException();
                        if (activeNetworkInfoForUid != null) {
                            parcel2.writeInt(1);
                            activeNetworkInfoForUid.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        NetworkInfo networkInfo = getNetworkInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (networkInfo != null) {
                            parcel2.writeInt(1);
                            networkInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        NetworkInfo[] allNetworkInfo = getAllNetworkInfo();
                        parcel2.writeNoException();
                        parcel2.writeTypedArray(allNetworkInfo, 1);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isActiveNetworkMetered = isActiveNetworkMetered();
                        parcel2.writeNoException();
                        parcel2.writeInt(isActiveNetworkMetered ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean requestRouteToHostAddress = requestRouteToHostAddress(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(requestRouteToHostAddress ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        LinkProperties activeLinkProperties = getActiveLinkProperties();
                        parcel2.writeNoException();
                        if (activeLinkProperties != null) {
                            parcel2.writeInt(1);
                            activeLinkProperties.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        LinkProperties linkProperties = getLinkProperties(parcel.readInt());
                        parcel2.writeNoException();
                        if (linkProperties != null) {
                            parcel2.writeInt(1);
                            linkProperties.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    LinkProperties getActiveLinkProperties() throws RemoteException;

    NetworkInfo getActiveNetworkInfo() throws RemoteException;

    NetworkInfo getActiveNetworkInfoForUid(int i5, boolean z4) throws RemoteException;

    NetworkInfo[] getAllNetworkInfo() throws RemoteException;

    LinkProperties getLinkProperties(int i5) throws RemoteException;

    NetworkInfo getNetworkInfo(int i5) throws RemoteException;

    boolean isActiveNetworkMetered() throws RemoteException;

    boolean requestRouteToHostAddress(int i5, int i6) throws RemoteException;
}

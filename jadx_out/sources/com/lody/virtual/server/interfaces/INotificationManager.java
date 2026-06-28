package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface INotificationManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements INotificationManager {
        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public void addNotification(int i5, String str, String str2, int i6) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public boolean areNotificationsEnabledForPackage(String str, int i5) throws RemoteException {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public void cancelAllNotification(String str, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public int dealNotificationId(int i5, String str, String str2, int i6) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public String dealNotificationTag(int i5, String str, String str2, int i6) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.INotificationManager
        public void setNotificationsEnabledForPackage(String str, boolean z4, int i5) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements INotificationManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.INotificationManager";
        static final int TRANSACTION_addNotification = 5;
        static final int TRANSACTION_areNotificationsEnabledForPackage = 3;
        static final int TRANSACTION_cancelAllNotification = 6;
        static final int TRANSACTION_dealNotificationId = 1;
        static final int TRANSACTION_dealNotificationTag = 2;
        static final int TRANSACTION_setNotificationsEnabledForPackage = 4;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements INotificationManager {
            public static INotificationManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public void addNotification(int i5, String str, String str2, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addNotification(i5, str, str2, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public boolean areNotificationsEnabledForPackage(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().areNotificationsEnabledForPackage(str, i5);
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

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public void cancelAllNotification(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelAllNotification(str, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public int dealNotificationId(int i5, String str, String str2, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dealNotificationId(i5, str, str2, i6);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public String dealNotificationTag(int i5, String str, String str2, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().dealNotificationTag(i5, str, str2, i6);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.INotificationManager
            public void setNotificationsEnabledForPackage(String str, boolean z4, int i5) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setNotificationsEnabledForPackage(str, z4, i5);
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

        public static INotificationManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof INotificationManager)) {
                return (INotificationManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static INotificationManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(INotificationManager iNotificationManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iNotificationManager != null) {
                    Proxy.sDefaultImpl = iNotificationManager;
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
                        int dealNotificationId = dealNotificationId(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(dealNotificationId);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        String dealNotificationTag = dealNotificationTag(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(dealNotificationTag);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean areNotificationsEnabledForPackage = areNotificationsEnabledForPackage(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(areNotificationsEnabledForPackage ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        setNotificationsEnabledForPackage(readString, z4, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        addNotification(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        cancelAllNotification(parcel.readString(), parcel.readInt());
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

    void addNotification(int i5, String str, String str2, int i6) throws RemoteException;

    boolean areNotificationsEnabledForPackage(String str, int i5) throws RemoteException;

    void cancelAllNotification(String str, int i5) throws RemoteException;

    int dealNotificationId(int i5, String str, String str2, int i6) throws RemoteException;

    String dealNotificationTag(int i5, String str, String str2, int i6) throws RemoteException;

    void setNotificationsEnabledForPackage(String str, boolean z4, int i5) throws RemoteException;
}

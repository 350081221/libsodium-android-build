package com.lody.virtual.server.interfaces;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.os.VUserInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface IUserManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IUserManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public VUserInfo createUser(String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public int getUserHandle(int i5) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public Bitmap getUserIcon(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public VUserInfo getUserInfo(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public int getUserSerialNumber(int i5) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public List<VUserInfo> getUsers(boolean z4) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public boolean isGuestEnabled() throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public boolean removeUser(int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public void setGuestEnabled(boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public void setUserIcon(int i5, Bitmap bitmap) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public void setUserName(int i5, String str) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IUserManager
        public void wipeUser(int i5) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IUserManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IUserManager";
        static final int TRANSACTION_createUser = 1;
        static final int TRANSACTION_getUserHandle = 12;
        static final int TRANSACTION_getUserIcon = 5;
        static final int TRANSACTION_getUserInfo = 7;
        static final int TRANSACTION_getUserSerialNumber = 11;
        static final int TRANSACTION_getUsers = 6;
        static final int TRANSACTION_isGuestEnabled = 9;
        static final int TRANSACTION_removeUser = 2;
        static final int TRANSACTION_setGuestEnabled = 8;
        static final int TRANSACTION_setUserIcon = 4;
        static final int TRANSACTION_setUserName = 3;
        static final int TRANSACTION_wipeUser = 10;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IUserManager {
            public static IUserManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public VUserInfo createUser(String str, int i5) throws RemoteException {
                VUserInfo vUserInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createUser(str, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vUserInfo = VUserInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        vUserInfo = null;
                    }
                    return vUserInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public int getUserHandle(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUserHandle(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public Bitmap getUserIcon(int i5) throws RemoteException {
                Bitmap bitmap;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUserIcon(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bitmap = (Bitmap) Bitmap.CREATOR.createFromParcel(obtain2);
                    } else {
                        bitmap = null;
                    }
                    return bitmap;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public VUserInfo getUserInfo(int i5) throws RemoteException {
                VUserInfo vUserInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUserInfo(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vUserInfo = VUserInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        vUserInfo = null;
                    }
                    return vUserInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public int getUserSerialNumber(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUserSerialNumber(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public List<VUserInfo> getUsers(boolean z4) throws RemoteException {
                int i5;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z4) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUsers(z4);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(VUserInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public boolean isGuestEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isGuestEnabled();
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

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public boolean removeUser(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeUser(i5);
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

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public void setGuestEnabled(boolean z4) throws RemoteException {
                int i5;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z4) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setGuestEnabled(z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public void setUserIcon(int i5, Bitmap bitmap) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (bitmap != null) {
                        obtain.writeInt(1);
                        bitmap.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserIcon(i5, bitmap);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public void setUserName(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setUserName(i5, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IUserManager
            public void wipeUser(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().wipeUser(i5);
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

        public static IUserManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IUserManager)) {
                return (IUserManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IUserManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IUserManager iUserManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iUserManager != null) {
                    Proxy.sDefaultImpl = iUserManager;
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
            Bitmap bitmap;
            if (i5 != 1598968902) {
                boolean z4 = false;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        VUserInfo createUser = createUser(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (createUser != null) {
                            parcel2.writeInt(1);
                            createUser.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean removeUser = removeUser(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeUser ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        setUserName(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            bitmap = (Bitmap) Bitmap.CREATOR.createFromParcel(parcel);
                        } else {
                            bitmap = null;
                        }
                        setUserIcon(readInt, bitmap);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        Bitmap userIcon = getUserIcon(parcel.readInt());
                        parcel2.writeNoException();
                        if (userIcon != null) {
                            parcel2.writeInt(1);
                            userIcon.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        List<VUserInfo> users = getUsers(z4);
                        parcel2.writeNoException();
                        parcel2.writeTypedList(users);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        VUserInfo userInfo = getUserInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (userInfo != null) {
                            parcel2.writeInt(1);
                            userInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        setGuestEnabled(z4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isGuestEnabled = isGuestEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isGuestEnabled ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        wipeUser(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        int userSerialNumber = getUserSerialNumber(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(userSerialNumber);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int userHandle = getUserHandle(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(userHandle);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    VUserInfo createUser(String str, int i5) throws RemoteException;

    int getUserHandle(int i5) throws RemoteException;

    Bitmap getUserIcon(int i5) throws RemoteException;

    VUserInfo getUserInfo(int i5) throws RemoteException;

    int getUserSerialNumber(int i5) throws RemoteException;

    List<VUserInfo> getUsers(boolean z4) throws RemoteException;

    boolean isGuestEnabled() throws RemoteException;

    boolean removeUser(int i5) throws RemoteException;

    void setGuestEnabled(boolean z4) throws RemoteException;

    void setUserIcon(int i5, Bitmap bitmap) throws RemoteException;

    void setUserName(int i5, String str) throws RemoteException;

    void wipeUser(int i5) throws RemoteException;
}

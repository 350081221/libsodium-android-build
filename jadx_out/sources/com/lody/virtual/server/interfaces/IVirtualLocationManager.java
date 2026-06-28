package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.vloc.VCell;
import com.lody.virtual.remote.vloc.VLocation;
import java.util.List;

/* loaded from: classes3.dex */
public interface IVirtualLocationManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IVirtualLocationManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public List<VCell> getAllCell(int i5, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public VCell getCell(int i5, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public VLocation getGlobalLocation() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public VLocation getLocation(int i5, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public int getMode(int i5, String str) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public List<VCell> getNeighboringCell(int i5, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setAllCell(int i5, String str, List<VCell> list) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setCell(int i5, String str, VCell vCell) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setGlobalAllCell(List<VCell> list) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setGlobalCell(VCell vCell) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setGlobalLocation(VLocation vLocation) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setGlobalNeighboringCell(List<VCell> list) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setLocation(int i5, String str, VLocation vLocation) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setMode(int i5, String str, int i6) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
        public void setNeighboringCell(int i5, String str, List<VCell> list) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IVirtualLocationManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IVirtualLocationManager";
        static final int TRANSACTION_getAllCell = 10;
        static final int TRANSACTION_getCell = 9;
        static final int TRANSACTION_getGlobalLocation = 15;
        static final int TRANSACTION_getLocation = 13;
        static final int TRANSACTION_getMode = 1;
        static final int TRANSACTION_getNeighboringCell = 11;
        static final int TRANSACTION_setAllCell = 4;
        static final int TRANSACTION_setCell = 3;
        static final int TRANSACTION_setGlobalAllCell = 7;
        static final int TRANSACTION_setGlobalCell = 6;
        static final int TRANSACTION_setGlobalLocation = 14;
        static final int TRANSACTION_setGlobalNeighboringCell = 8;
        static final int TRANSACTION_setLocation = 12;
        static final int TRANSACTION_setMode = 2;
        static final int TRANSACTION_setNeighboringCell = 5;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IVirtualLocationManager {
            public static IVirtualLocationManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public List<VCell> getAllCell(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAllCell(i5, str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(VCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public VCell getCell(int i5, String str) throws RemoteException {
                VCell vCell;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCell(i5, str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vCell = VCell.CREATOR.createFromParcel(obtain2);
                    } else {
                        vCell = null;
                    }
                    return vCell;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public VLocation getGlobalLocation() throws RemoteException {
                VLocation vLocation;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getGlobalLocation();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vLocation = VLocation.CREATOR.createFromParcel(obtain2);
                    } else {
                        vLocation = null;
                    }
                    return vLocation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public VLocation getLocation(int i5, String str) throws RemoteException {
                VLocation vLocation;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getLocation(i5, str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vLocation = VLocation.CREATOR.createFromParcel(obtain2);
                    } else {
                        vLocation = null;
                    }
                    return vLocation;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public int getMode(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMode(i5, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public List<VCell> getNeighboringCell(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNeighboringCell(i5, str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(VCell.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setAllCell(int i5, String str, List<VCell> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeTypedList(list);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setAllCell(i5, str, list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setCell(int i5, String str, VCell vCell) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (vCell != null) {
                        obtain.writeInt(1);
                        vCell.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setCell(i5, str, vCell);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setGlobalAllCell(List<VCell> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setGlobalAllCell(list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setGlobalCell(VCell vCell) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (vCell != null) {
                        obtain.writeInt(1);
                        vCell.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setGlobalCell(vCell);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setGlobalLocation(VLocation vLocation) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (vLocation != null) {
                        obtain.writeInt(1);
                        vLocation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setGlobalLocation(vLocation);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setGlobalNeighboringCell(List<VCell> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setGlobalNeighboringCell(list);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setLocation(int i5, String str, VLocation vLocation) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (vLocation != null) {
                        obtain.writeInt(1);
                        vLocation.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setLocation(i5, str, vLocation);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setMode(int i5, String str, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setMode(i5, str, i6);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IVirtualLocationManager
            public void setNeighboringCell(int i5, String str, List<VCell> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    obtain.writeTypedList(list);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setNeighboringCell(i5, str, list);
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

        public static IVirtualLocationManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IVirtualLocationManager)) {
                return (IVirtualLocationManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IVirtualLocationManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IVirtualLocationManager iVirtualLocationManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iVirtualLocationManager != null) {
                    Proxy.sDefaultImpl = iVirtualLocationManager;
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
            if (i5 != 1598968902) {
                VCell vCell = null;
                VLocation vLocation = null;
                VLocation vLocation2 = null;
                VCell vCell2 = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int mode = getMode(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mode);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        setMode(parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            vCell = VCell.CREATOR.createFromParcel(parcel);
                        }
                        setCell(readInt, readString, vCell);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        setAllCell(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(VCell.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        setNeighboringCell(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(VCell.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            vCell2 = VCell.CREATOR.createFromParcel(parcel);
                        }
                        setGlobalCell(vCell2);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        setGlobalAllCell(parcel.createTypedArrayList(VCell.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        setGlobalNeighboringCell(parcel.createTypedArrayList(VCell.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        VCell cell = getCell(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        if (cell != null) {
                            parcel2.writeInt(1);
                            cell.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<VCell> allCell = getAllCell(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(allCell);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<VCell> neighboringCell = getNeighboringCell(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(neighboringCell);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            vLocation2 = VLocation.CREATOR.createFromParcel(parcel);
                        }
                        setLocation(readInt2, readString2, vLocation2);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        VLocation location = getLocation(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        if (location != null) {
                            parcel2.writeInt(1);
                            location.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            vLocation = VLocation.CREATOR.createFromParcel(parcel);
                        }
                        setGlobalLocation(vLocation);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        VLocation globalLocation = getGlobalLocation();
                        parcel2.writeNoException();
                        if (globalLocation != null) {
                            parcel2.writeInt(1);
                            globalLocation.writeToParcel(parcel2, 1);
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

    List<VCell> getAllCell(int i5, String str) throws RemoteException;

    VCell getCell(int i5, String str) throws RemoteException;

    VLocation getGlobalLocation() throws RemoteException;

    VLocation getLocation(int i5, String str) throws RemoteException;

    int getMode(int i5, String str) throws RemoteException;

    List<VCell> getNeighboringCell(int i5, String str) throws RemoteException;

    void setAllCell(int i5, String str, List<VCell> list) throws RemoteException;

    void setCell(int i5, String str, VCell vCell) throws RemoteException;

    void setGlobalAllCell(List<VCell> list) throws RemoteException;

    void setGlobalCell(VCell vCell) throws RemoteException;

    void setGlobalLocation(VLocation vLocation) throws RemoteException;

    void setGlobalNeighboringCell(List<VCell> list) throws RemoteException;

    void setLocation(int i5, String str, VLocation vLocation) throws RemoteException;

    void setMode(int i5, String str, int i6) throws RemoteException;

    void setNeighboringCell(int i5, String str, List<VCell> list) throws RemoteException;
}

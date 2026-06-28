package com.lody.virtual.server.interfaces;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.VDeviceConfig;

/* loaded from: classes3.dex */
public interface IDeviceManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IDeviceManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IDeviceManager
        public VDeviceConfig getDeviceConfig(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IDeviceManager
        public boolean isEnable(int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IDeviceManager
        public void setEnable(int i5, boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IDeviceManager
        public void updateDeviceConfig(int i5, VDeviceConfig vDeviceConfig) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IDeviceManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IDeviceManager";
        static final int TRANSACTION_getDeviceConfig = 1;
        static final int TRANSACTION_isEnable = 3;
        static final int TRANSACTION_setEnable = 4;
        static final int TRANSACTION_updateDeviceConfig = 2;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IDeviceManager {
            public static IDeviceManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IDeviceManager
            public VDeviceConfig getDeviceConfig(int i5) throws RemoteException {
                VDeviceConfig vDeviceConfig;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDeviceConfig(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vDeviceConfig = VDeviceConfig.CREATOR.createFromParcel(obtain2);
                    } else {
                        vDeviceConfig = null;
                    }
                    return vDeviceConfig;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IDeviceManager
            public boolean isEnable(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isEnable(i5);
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

            @Override // com.lody.virtual.server.interfaces.IDeviceManager
            public void setEnable(int i5, boolean z4) throws RemoteException {
                int i6;
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
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setEnable(i5, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IDeviceManager
            public void updateDeviceConfig(int i5, VDeviceConfig vDeviceConfig) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (vDeviceConfig != null) {
                        obtain.writeInt(1);
                        vDeviceConfig.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().updateDeviceConfig(i5, vDeviceConfig);
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

        public static IDeviceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDeviceManager)) {
                return (IDeviceManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IDeviceManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IDeviceManager iDeviceManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iDeviceManager != null) {
                    Proxy.sDefaultImpl = iDeviceManager;
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
            VDeviceConfig vDeviceConfig;
            boolean z4 = false;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 1598968902) {
                                return super.onTransact(i5, parcel, parcel2, i6);
                            }
                            parcel2.writeString(DESCRIPTOR);
                            return true;
                        }
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        setEnable(readInt, z4);
                        parcel2.writeNoException();
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isEnable = isEnable(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(isEnable ? 1 : 0);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    vDeviceConfig = VDeviceConfig.CREATOR.createFromParcel(parcel);
                } else {
                    vDeviceConfig = null;
                }
                updateDeviceConfig(readInt2, vDeviceConfig);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            VDeviceConfig deviceConfig = getDeviceConfig(parcel.readInt());
            parcel2.writeNoException();
            if (deviceConfig != null) {
                parcel2.writeInt(1);
                deviceConfig.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }
    }

    VDeviceConfig getDeviceConfig(int i5) throws RemoteException;

    boolean isEnable(int i5) throws RemoteException;

    void setEnable(int i5, boolean z4) throws RemoteException;

    void updateDeviceConfig(int i5, VDeviceConfig vDeviceConfig) throws RemoteException;
}

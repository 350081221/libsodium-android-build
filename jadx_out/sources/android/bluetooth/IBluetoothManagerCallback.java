package android.bluetooth;

import android.bluetooth.IBluetooth;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IBluetoothManagerCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IBluetoothManagerCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.bluetooth.IBluetoothManagerCallback
        public void onBluetoothServiceDown() throws RemoteException {
        }

        @Override // android.bluetooth.IBluetoothManagerCallback
        public void onBluetoothServiceUp(IBluetooth iBluetooth) throws RemoteException {
        }

        @Override // android.bluetooth.IBluetoothManagerCallback
        public void onBrEdrDown() throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IBluetoothManagerCallback {
        private static final String DESCRIPTOR = "android.bluetooth.IBluetoothManagerCallback";
        static final int TRANSACTION_onBluetoothServiceDown = 2;
        static final int TRANSACTION_onBluetoothServiceUp = 1;
        static final int TRANSACTION_onBrEdrDown = 3;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IBluetoothManagerCallback {
            public static IBluetoothManagerCallback sDefaultImpl;
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

            @Override // android.bluetooth.IBluetoothManagerCallback
            public void onBluetoothServiceDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onBluetoothServiceDown();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetoothManagerCallback
            public void onBluetoothServiceUp(IBluetooth iBluetooth) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iBluetooth != null) {
                        iBinder = iBluetooth.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(1, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onBluetoothServiceUp(iBluetooth);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetoothManagerCallback
            public void onBrEdrDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onBrEdrDown();
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IBluetoothManagerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBluetoothManagerCallback)) {
                return (IBluetoothManagerCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IBluetoothManagerCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBluetoothManagerCallback iBluetoothManagerCallback) {
            if (Proxy.sDefaultImpl == null) {
                if (iBluetoothManagerCallback != null) {
                    Proxy.sDefaultImpl = iBluetoothManagerCallback;
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
                    if (i5 != 3) {
                        if (i5 != 1598968902) {
                            return super.onTransact(i5, parcel, parcel2, i6);
                        }
                        parcel2.writeString(DESCRIPTOR);
                        return true;
                    }
                    parcel.enforceInterface(DESCRIPTOR);
                    onBrEdrDown();
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                onBluetoothServiceDown();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onBluetoothServiceUp(IBluetooth.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }
    }

    void onBluetoothServiceDown() throws RemoteException;

    void onBluetoothServiceUp(IBluetooth iBluetooth) throws RemoteException;

    void onBrEdrDown() throws RemoteException;
}

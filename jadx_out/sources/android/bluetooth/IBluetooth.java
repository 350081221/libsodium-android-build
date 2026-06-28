package android.bluetooth;

import android.bluetooth.IBluetoothCallback;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelUuid;
import android.os.RemoteException;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public interface IBluetooth extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IBluetooth {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean cancelBondProcess(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean cancelDiscovery() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean configHciSnoopLog(boolean z4) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public ParcelFileDescriptor connectSocket(BluetoothDevice bluetoothDevice, int i5, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean createBond(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public ParcelFileDescriptor createSocketChannel(int i5, String str, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean disable() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean enable() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean enableNoAutoConnect() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean factoryReset() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean fetchRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public void getActivityEnergyInfoFromController() throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public int getAdapterConnectionState() throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public String getAddress() throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getBondState(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public BluetoothDevice[] getBondedDevices() throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public int getDiscoverableTimeout() throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public int getMessageAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public String getName() throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getPhonebookAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public int getProfileConnectionState(int i5) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public String getRemoteAlias(BluetoothDevice bluetoothDevice) throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getRemoteClass(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public String getRemoteName(BluetoothDevice bluetoothDevice) throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getRemoteType(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public ParcelUuid[] getRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public int getScanMode() throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public int getSimAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public int getState() throws RemoteException {
            return 0;
        }

        @Override // android.bluetooth.IBluetooth
        public ParcelUuid[] getUuids() throws RemoteException {
            return null;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isActivityAndEnergyReportingSupported() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isDiscovering() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isEnabled() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isMultiAdvertisementSupported() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isOffloadedFilteringSupported() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isOffloadedScanBatchingSupported() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean isPeripheralModeSupported() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public void onBrEdrDown() throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public void onLeServiceUp() throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public void registerCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public boolean removeBond(BluetoothDevice bluetoothDevice) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public void requestActivityInfo(ResultReceiver resultReceiver) throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public boolean sdpSearch(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public void sendConnectionStateChange(BluetoothDevice bluetoothDevice, int i5, int i6, int i7) throws RemoteException {
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setDiscoverableTimeout(int i5) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setMessageAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setName(String str) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setPairingConfirmation(BluetoothDevice bluetoothDevice, boolean z4) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setPasskey(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setPhonebookAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setPin(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setRemoteAlias(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setScanMode(int i5, int i6) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean setSimAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public boolean startDiscovery() throws RemoteException {
            return false;
        }

        @Override // android.bluetooth.IBluetooth
        public void unregisterCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IBluetooth {
        private static final String DESCRIPTOR = "android.bluetooth.IBluetooth";
        static final int TRANSACTION_cancelBondProcess = 21;
        static final int TRANSACTION_cancelDiscovery = 15;
        static final int TRANSACTION_configHciSnoopLog = 47;
        static final int TRANSACTION_connectSocket = 45;
        static final int TRANSACTION_createBond = 20;
        static final int TRANSACTION_createSocketChannel = 46;
        static final int TRANSACTION_disable = 5;
        static final int TRANSACTION_enable = 3;
        static final int TRANSACTION_enableNoAutoConnect = 4;
        static final int TRANSACTION_factoryReset = 48;
        static final int TRANSACTION_fetchRemoteUuids = 31;
        static final int TRANSACTION_getActivityEnergyInfoFromController = 54;
        static final int TRANSACTION_getAdapterConnectionState = 17;
        static final int TRANSACTION_getAddress = 6;
        static final int TRANSACTION_getBondState = 23;
        static final int TRANSACTION_getBondedDevices = 19;
        static final int TRANSACTION_getConnectionState = 24;
        static final int TRANSACTION_getDiscoverableTimeout = 12;
        static final int TRANSACTION_getMessageAccessPermission = 38;
        static final int TRANSACTION_getName = 9;
        static final int TRANSACTION_getPhonebookAccessPermission = 36;
        static final int TRANSACTION_getProfileConnectionState = 18;
        static final int TRANSACTION_getRemoteAlias = 27;
        static final int TRANSACTION_getRemoteClass = 29;
        static final int TRANSACTION_getRemoteName = 25;
        static final int TRANSACTION_getRemoteType = 26;
        static final int TRANSACTION_getRemoteUuids = 30;
        static final int TRANSACTION_getScanMode = 10;
        static final int TRANSACTION_getSimAccessPermission = 40;
        static final int TRANSACTION_getState = 2;
        static final int TRANSACTION_getUuids = 7;
        static final int TRANSACTION_isActivityAndEnergyReportingSupported = 53;
        static final int TRANSACTION_isDiscovering = 16;
        static final int TRANSACTION_isEnabled = 1;
        static final int TRANSACTION_isMultiAdvertisementSupported = 49;
        static final int TRANSACTION_isOffloadedFilteringSupported = 51;
        static final int TRANSACTION_isOffloadedScanBatchingSupported = 52;
        static final int TRANSACTION_isPeripheralModeSupported = 50;
        static final int TRANSACTION_onBrEdrDown = 57;
        static final int TRANSACTION_onLeServiceUp = 56;
        static final int TRANSACTION_registerCallback = 43;
        static final int TRANSACTION_removeBond = 22;
        static final int TRANSACTION_requestActivityInfo = 55;
        static final int TRANSACTION_sdpSearch = 32;
        static final int TRANSACTION_sendConnectionStateChange = 42;
        static final int TRANSACTION_setDiscoverableTimeout = 13;
        static final int TRANSACTION_setMessageAccessPermission = 39;
        static final int TRANSACTION_setName = 8;
        static final int TRANSACTION_setPairingConfirmation = 35;
        static final int TRANSACTION_setPasskey = 34;
        static final int TRANSACTION_setPhonebookAccessPermission = 37;
        static final int TRANSACTION_setPin = 33;
        static final int TRANSACTION_setRemoteAlias = 28;
        static final int TRANSACTION_setScanMode = 11;
        static final int TRANSACTION_setSimAccessPermission = 41;
        static final int TRANSACTION_startDiscovery = 14;
        static final int TRANSACTION_unregisterCallback = 44;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IBluetooth {
            public static IBluetooth sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.bluetooth.IBluetooth
            public boolean cancelBondProcess(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cancelBondProcess(bluetoothDevice);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean cancelDiscovery() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cancelDiscovery();
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

            @Override // android.bluetooth.IBluetooth
            public boolean configHciSnoopLog(boolean z4) throws RemoteException {
                int i5;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z5 = true;
                    if (z4) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(47, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().configHciSnoopLog(z4);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z5 = false;
                    }
                    return z5;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public ParcelFileDescriptor connectSocket(BluetoothDevice bluetoothDevice, int i5, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    if (!this.mRemote.transact(45, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectSocket(bluetoothDevice, i5, parcelUuid, i6, i7);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelFileDescriptor = null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean createBond(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createBond(bluetoothDevice, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public ParcelFileDescriptor createSocketChannel(int i5, String str, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException {
                ParcelFileDescriptor parcelFileDescriptor;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    if (!this.mRemote.transact(46, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createSocketChannel(i5, str, parcelUuid, i6, i7);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelFileDescriptor = null;
                    }
                    return parcelFileDescriptor;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean disable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disable();
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

            @Override // android.bluetooth.IBluetooth
            public boolean enable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enable();
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

            @Override // android.bluetooth.IBluetooth
            public boolean enableNoAutoConnect() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().enableNoAutoConnect();
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

            @Override // android.bluetooth.IBluetooth
            public boolean factoryReset() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(48, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().factoryReset();
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

            @Override // android.bluetooth.IBluetooth
            public boolean fetchRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().fetchRemoteUuids(bluetoothDevice);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public void getActivityEnergyInfoFromController() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(54, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().getActivityEnergyInfoFromController();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getAdapterConnectionState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAdapterConnectionState();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public String getAddress() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAddress();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getBondState(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBondState(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public BluetoothDevice[] getBondedDevices() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getBondedDevices();
                    }
                    obtain2.readException();
                    return (BluetoothDevice[]) obtain2.createTypedArray(BluetoothDevice.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectionState(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getDiscoverableTimeout() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDiscoverableTimeout();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.bluetooth.IBluetooth
            public int getMessageAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMessageAccessPermission(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public String getName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getName();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getPhonebookAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPhonebookAccessPermission(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getProfileConnectionState(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProfileConnectionState(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public String getRemoteAlias(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRemoteAlias(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getRemoteClass(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRemoteClass(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public String getRemoteName(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRemoteName(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getRemoteType(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRemoteType(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public ParcelUuid[] getRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRemoteUuids(bluetoothDevice);
                    }
                    obtain2.readException();
                    return (ParcelUuid[]) obtain2.createTypedArray(ParcelUuid.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getScanMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getScanMode();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getSimAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSimAccessPermission(bluetoothDevice);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public int getState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getState();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public ParcelUuid[] getUuids() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUuids();
                    }
                    obtain2.readException();
                    return (ParcelUuid[]) obtain2.createTypedArray(ParcelUuid.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean isActivityAndEnergyReportingSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(53, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isActivityAndEnergyReportingSupported();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isDiscovering() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDiscovering();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isEnabled() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isEnabled();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isMultiAdvertisementSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(49, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isMultiAdvertisementSupported();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isOffloadedFilteringSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(51, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isOffloadedFilteringSupported();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isOffloadedScanBatchingSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(52, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isOffloadedScanBatchingSupported();
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

            @Override // android.bluetooth.IBluetooth
            public boolean isPeripheralModeSupported() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(50, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPeripheralModeSupported();
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

            @Override // android.bluetooth.IBluetooth
            public void onBrEdrDown() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(57, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onBrEdrDown();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public void onLeServiceUp() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(56, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onLeServiceUp();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public void registerCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iBluetoothCallback != null) {
                        iBinder = iBluetoothCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerCallback(iBluetoothCallback);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean removeBond(BluetoothDevice bluetoothDevice) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeBond(bluetoothDevice);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public void requestActivityInfo(ResultReceiver resultReceiver) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (resultReceiver != null) {
                        obtain.writeInt(1);
                        resultReceiver.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(55, obtain, null, 1) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().requestActivityInfo(resultReceiver);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean sdpSearch(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (parcelUuid != null) {
                        obtain.writeInt(1);
                        parcelUuid.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().sdpSearch(bluetoothDevice, parcelUuid);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public void sendConnectionStateChange(BluetoothDevice bluetoothDevice, int i5, int i6, int i7) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    if (!this.mRemote.transact(42, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().sendConnectionStateChange(bluetoothDevice, i5, i6, i7);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setDiscoverableTimeout(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setDiscoverableTimeout(i5);
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

            @Override // android.bluetooth.IBluetooth
            public boolean setMessageAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setMessageAccessPermission(bluetoothDevice, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setName(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setName(str);
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

            @Override // android.bluetooth.IBluetooth
            public boolean setPairingConfirmation(BluetoothDevice bluetoothDevice, boolean z4) throws RemoteException {
                int i5;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z5 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z4) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPairingConfirmation(bluetoothDevice, z4);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z5 = false;
                    }
                    return z5;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setPasskey(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z5 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i5);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPasskey(bluetoothDevice, z4, i5, bArr);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z5 = false;
                    }
                    return z5;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setPhonebookAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPhonebookAccessPermission(bluetoothDevice, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setPin(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z5 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    obtain.writeInt(i5);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPin(bluetoothDevice, z4, i5, bArr);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z5 = false;
                    }
                    return z5;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setRemoteAlias(BluetoothDevice bluetoothDevice, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setRemoteAlias(bluetoothDevice, str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean setScanMode(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    boolean z4 = false;
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setScanMode(i5, i6);
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

            @Override // android.bluetooth.IBluetooth
            public boolean setSimAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSimAccessPermission(bluetoothDevice, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z4 = false;
                    }
                    return z4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.bluetooth.IBluetooth
            public boolean startDiscovery() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startDiscovery();
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

            @Override // android.bluetooth.IBluetooth
            public void unregisterCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iBluetoothCallback != null) {
                        iBinder = iBluetoothCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterCallback(iBluetoothCallback);
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

        public static IBluetooth asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IBluetooth)) {
                return (IBluetooth) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IBluetooth getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IBluetooth iBluetooth) {
            if (Proxy.sDefaultImpl == null) {
                if (iBluetooth != null) {
                    Proxy.sDefaultImpl = iBluetooth;
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
            BluetoothDevice bluetoothDevice;
            BluetoothDevice bluetoothDevice2;
            if (i5 != 1598968902) {
                boolean z4 = false;
                BluetoothDevice bluetoothDevice3 = null;
                ResultReceiver resultReceiver = null;
                ParcelUuid parcelUuid = null;
                ParcelUuid parcelUuid2 = null;
                BluetoothDevice bluetoothDevice4 = null;
                BluetoothDevice bluetoothDevice5 = null;
                BluetoothDevice bluetoothDevice6 = null;
                BluetoothDevice bluetoothDevice7 = null;
                BluetoothDevice bluetoothDevice8 = null;
                BluetoothDevice bluetoothDevice9 = null;
                BluetoothDevice bluetoothDevice10 = null;
                BluetoothDevice bluetoothDevice11 = null;
                BluetoothDevice bluetoothDevice12 = null;
                BluetoothDevice bluetoothDevice13 = null;
                ParcelUuid parcelUuid3 = null;
                BluetoothDevice bluetoothDevice14 = null;
                BluetoothDevice bluetoothDevice15 = null;
                BluetoothDevice bluetoothDevice16 = null;
                BluetoothDevice bluetoothDevice17 = null;
                BluetoothDevice bluetoothDevice18 = null;
                BluetoothDevice bluetoothDevice19 = null;
                BluetoothDevice bluetoothDevice20 = null;
                BluetoothDevice bluetoothDevice21 = null;
                BluetoothDevice bluetoothDevice22 = null;
                BluetoothDevice bluetoothDevice23 = null;
                BluetoothDevice bluetoothDevice24 = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isEnabled = isEnabled();
                        parcel2.writeNoException();
                        parcel2.writeInt(isEnabled ? 1 : 0);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int state = getState();
                        parcel2.writeNoException();
                        parcel2.writeInt(state);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean enable = enable();
                        parcel2.writeNoException();
                        parcel2.writeInt(enable ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean enableNoAutoConnect = enableNoAutoConnect();
                        parcel2.writeNoException();
                        parcel2.writeInt(enableNoAutoConnect ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean disable = disable();
                        parcel2.writeNoException();
                        parcel2.writeInt(disable ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        String address = getAddress();
                        parcel2.writeNoException();
                        parcel2.writeString(address);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        ParcelUuid[] uuids = getUuids();
                        parcel2.writeNoException();
                        parcel2.writeTypedArray(uuids, 1);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean name = setName(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(name ? 1 : 0);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        String name2 = getName();
                        parcel2.writeNoException();
                        parcel2.writeString(name2);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        int scanMode = getScanMode();
                        parcel2.writeNoException();
                        parcel2.writeInt(scanMode);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean scanMode2 = setScanMode(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(scanMode2 ? 1 : 0);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        int discoverableTimeout = getDiscoverableTimeout();
                        parcel2.writeNoException();
                        parcel2.writeInt(discoverableTimeout);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean discoverableTimeout2 = setDiscoverableTimeout(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(discoverableTimeout2 ? 1 : 0);
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean startDiscovery = startDiscovery();
                        parcel2.writeNoException();
                        parcel2.writeInt(startDiscovery ? 1 : 0);
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean cancelDiscovery = cancelDiscovery();
                        parcel2.writeNoException();
                        parcel2.writeInt(cancelDiscovery ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isDiscovering = isDiscovering();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDiscovering ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        int adapterConnectionState = getAdapterConnectionState();
                        parcel2.writeNoException();
                        parcel2.writeInt(adapterConnectionState);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        int profileConnectionState = getProfileConnectionState(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(profileConnectionState);
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        BluetoothDevice[] bondedDevices = getBondedDevices();
                        parcel2.writeNoException();
                        parcel2.writeTypedArray(bondedDevices, 1);
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice3 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean createBond = createBond(bluetoothDevice3, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(createBond ? 1 : 0);
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice24 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean cancelBondProcess = cancelBondProcess(bluetoothDevice24);
                        parcel2.writeNoException();
                        parcel2.writeInt(cancelBondProcess ? 1 : 0);
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice23 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean removeBond = removeBond(bluetoothDevice23);
                        parcel2.writeNoException();
                        parcel2.writeInt(removeBond ? 1 : 0);
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice22 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int bondState = getBondState(bluetoothDevice22);
                        parcel2.writeNoException();
                        parcel2.writeInt(bondState);
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice21 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int connectionState = getConnectionState(bluetoothDevice21);
                        parcel2.writeNoException();
                        parcel2.writeInt(connectionState);
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice20 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        String remoteName = getRemoteName(bluetoothDevice20);
                        parcel2.writeNoException();
                        parcel2.writeString(remoteName);
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice19 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int remoteType = getRemoteType(bluetoothDevice19);
                        parcel2.writeNoException();
                        parcel2.writeInt(remoteType);
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice18 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        String remoteAlias = getRemoteAlias(bluetoothDevice18);
                        parcel2.writeNoException();
                        parcel2.writeString(remoteAlias);
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice17 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean remoteAlias2 = setRemoteAlias(bluetoothDevice17, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(remoteAlias2 ? 1 : 0);
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice16 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int remoteClass = getRemoteClass(bluetoothDevice16);
                        parcel2.writeNoException();
                        parcel2.writeInt(remoteClass);
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice15 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        ParcelUuid[] remoteUuids = getRemoteUuids(bluetoothDevice15);
                        parcel2.writeNoException();
                        parcel2.writeTypedArray(remoteUuids, 1);
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice14 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean fetchRemoteUuids = fetchRemoteUuids(bluetoothDevice14);
                        parcel2.writeNoException();
                        parcel2.writeInt(fetchRemoteUuids ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        } else {
                            bluetoothDevice = null;
                        }
                        if (parcel.readInt() != 0) {
                            parcelUuid3 = (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel);
                        }
                        boolean sdpSearch = sdpSearch(bluetoothDevice, parcelUuid3);
                        parcel2.writeNoException();
                        parcel2.writeInt(sdpSearch ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice13 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean pin = setPin(bluetoothDevice13, z4, parcel.readInt(), parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(pin ? 1 : 0);
                        return true;
                    case 34:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice12 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean passkey = setPasskey(bluetoothDevice12, z4, parcel.readInt(), parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeInt(passkey ? 1 : 0);
                        return true;
                    case 35:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice11 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean pairingConfirmation = setPairingConfirmation(bluetoothDevice11, z4);
                        parcel2.writeNoException();
                        parcel2.writeInt(pairingConfirmation ? 1 : 0);
                        return true;
                    case 36:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice10 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int phonebookAccessPermission = getPhonebookAccessPermission(bluetoothDevice10);
                        parcel2.writeNoException();
                        parcel2.writeInt(phonebookAccessPermission);
                        return true;
                    case 37:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice9 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean phonebookAccessPermission2 = setPhonebookAccessPermission(bluetoothDevice9, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(phonebookAccessPermission2 ? 1 : 0);
                        return true;
                    case 38:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice8 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int messageAccessPermission = getMessageAccessPermission(bluetoothDevice8);
                        parcel2.writeNoException();
                        parcel2.writeInt(messageAccessPermission);
                        return true;
                    case 39:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice7 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean messageAccessPermission2 = setMessageAccessPermission(bluetoothDevice7, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(messageAccessPermission2 ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice6 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        int simAccessPermission = getSimAccessPermission(bluetoothDevice6);
                        parcel2.writeNoException();
                        parcel2.writeInt(simAccessPermission);
                        return true;
                    case 41:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice5 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        boolean simAccessPermission2 = setSimAccessPermission(bluetoothDevice5, parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(simAccessPermission2 ? 1 : 0);
                        return true;
                    case 42:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice4 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        }
                        sendConnectionStateChange(bluetoothDevice4, parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface(DESCRIPTOR);
                        registerCallback(IBluetoothCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface(DESCRIPTOR);
                        unregisterCallback(IBluetoothCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            bluetoothDevice2 = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                        } else {
                            bluetoothDevice2 = null;
                        }
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            parcelUuid2 = (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel);
                        }
                        ParcelFileDescriptor connectSocket = connectSocket(bluetoothDevice2, readInt, parcelUuid2, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (connectSocket != null) {
                            parcel2.writeInt(1);
                            connectSocket.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 46:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            parcelUuid = (ParcelUuid) ParcelUuid.CREATOR.createFromParcel(parcel);
                        }
                        ParcelFileDescriptor createSocketChannel = createSocketChannel(readInt2, readString, parcelUuid, parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (createSocketChannel != null) {
                            parcel2.writeInt(1);
                            createSocketChannel.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 47:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean configHciSnoopLog = configHciSnoopLog(z4);
                        parcel2.writeNoException();
                        parcel2.writeInt(configHciSnoopLog ? 1 : 0);
                        return true;
                    case 48:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean factoryReset = factoryReset();
                        parcel2.writeNoException();
                        parcel2.writeInt(factoryReset ? 1 : 0);
                        return true;
                    case 49:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isMultiAdvertisementSupported = isMultiAdvertisementSupported();
                        parcel2.writeNoException();
                        parcel2.writeInt(isMultiAdvertisementSupported ? 1 : 0);
                        return true;
                    case 50:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isPeripheralModeSupported = isPeripheralModeSupported();
                        parcel2.writeNoException();
                        parcel2.writeInt(isPeripheralModeSupported ? 1 : 0);
                        return true;
                    case 51:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isOffloadedFilteringSupported = isOffloadedFilteringSupported();
                        parcel2.writeNoException();
                        parcel2.writeInt(isOffloadedFilteringSupported ? 1 : 0);
                        return true;
                    case 52:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isOffloadedScanBatchingSupported = isOffloadedScanBatchingSupported();
                        parcel2.writeNoException();
                        parcel2.writeInt(isOffloadedScanBatchingSupported ? 1 : 0);
                        return true;
                    case 53:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isActivityAndEnergyReportingSupported = isActivityAndEnergyReportingSupported();
                        parcel2.writeNoException();
                        parcel2.writeInt(isActivityAndEnergyReportingSupported ? 1 : 0);
                        return true;
                    case 54:
                        parcel.enforceInterface(DESCRIPTOR);
                        getActivityEnergyInfoFromController();
                        parcel2.writeNoException();
                        return true;
                    case 55:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            resultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                        }
                        requestActivityInfo(resultReceiver);
                        return true;
                    case 56:
                        parcel.enforceInterface(DESCRIPTOR);
                        onLeServiceUp();
                        parcel2.writeNoException();
                        return true;
                    case 57:
                        parcel.enforceInterface(DESCRIPTOR);
                        onBrEdrDown();
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

    boolean cancelBondProcess(BluetoothDevice bluetoothDevice) throws RemoteException;

    boolean cancelDiscovery() throws RemoteException;

    boolean configHciSnoopLog(boolean z4) throws RemoteException;

    ParcelFileDescriptor connectSocket(BluetoothDevice bluetoothDevice, int i5, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException;

    boolean createBond(BluetoothDevice bluetoothDevice, int i5) throws RemoteException;

    ParcelFileDescriptor createSocketChannel(int i5, String str, ParcelUuid parcelUuid, int i6, int i7) throws RemoteException;

    boolean disable() throws RemoteException;

    boolean enable() throws RemoteException;

    boolean enableNoAutoConnect() throws RemoteException;

    boolean factoryReset() throws RemoteException;

    boolean fetchRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException;

    void getActivityEnergyInfoFromController() throws RemoteException;

    int getAdapterConnectionState() throws RemoteException;

    String getAddress() throws RemoteException;

    int getBondState(BluetoothDevice bluetoothDevice) throws RemoteException;

    BluetoothDevice[] getBondedDevices() throws RemoteException;

    int getConnectionState(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getDiscoverableTimeout() throws RemoteException;

    int getMessageAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException;

    String getName() throws RemoteException;

    int getPhonebookAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getProfileConnectionState(int i5) throws RemoteException;

    String getRemoteAlias(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getRemoteClass(BluetoothDevice bluetoothDevice) throws RemoteException;

    String getRemoteName(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getRemoteType(BluetoothDevice bluetoothDevice) throws RemoteException;

    ParcelUuid[] getRemoteUuids(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getScanMode() throws RemoteException;

    int getSimAccessPermission(BluetoothDevice bluetoothDevice) throws RemoteException;

    int getState() throws RemoteException;

    ParcelUuid[] getUuids() throws RemoteException;

    boolean isActivityAndEnergyReportingSupported() throws RemoteException;

    boolean isDiscovering() throws RemoteException;

    boolean isEnabled() throws RemoteException;

    boolean isMultiAdvertisementSupported() throws RemoteException;

    boolean isOffloadedFilteringSupported() throws RemoteException;

    boolean isOffloadedScanBatchingSupported() throws RemoteException;

    boolean isPeripheralModeSupported() throws RemoteException;

    void onBrEdrDown() throws RemoteException;

    void onLeServiceUp() throws RemoteException;

    void registerCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException;

    boolean removeBond(BluetoothDevice bluetoothDevice) throws RemoteException;

    void requestActivityInfo(ResultReceiver resultReceiver) throws RemoteException;

    boolean sdpSearch(BluetoothDevice bluetoothDevice, ParcelUuid parcelUuid) throws RemoteException;

    void sendConnectionStateChange(BluetoothDevice bluetoothDevice, int i5, int i6, int i7) throws RemoteException;

    boolean setDiscoverableTimeout(int i5) throws RemoteException;

    boolean setMessageAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException;

    boolean setName(String str) throws RemoteException;

    boolean setPairingConfirmation(BluetoothDevice bluetoothDevice, boolean z4) throws RemoteException;

    boolean setPasskey(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException;

    boolean setPhonebookAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException;

    boolean setPin(BluetoothDevice bluetoothDevice, boolean z4, int i5, byte[] bArr) throws RemoteException;

    boolean setRemoteAlias(BluetoothDevice bluetoothDevice, String str) throws RemoteException;

    boolean setScanMode(int i5, int i6) throws RemoteException;

    boolean setSimAccessPermission(BluetoothDevice bluetoothDevice, int i5) throws RemoteException;

    boolean startDiscovery() throws RemoteException;

    void unregisterCallback(IBluetoothCallback iBluetoothCallback) throws RemoteException;
}

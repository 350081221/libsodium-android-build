package com.android.internal.widget;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.security.keystore.recovery.KeyChainSnapshot;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface ILockSettings extends IInterface {

    /* loaded from: classes2.dex */
    public static class Default implements ILockSettings {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public String generateKey(String str) throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public String generateKeyWithMetadata(String str, byte[] bArr) throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public List<String> getAliases() throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public KeyChainSnapshot getKeyChainSnapshot() throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public int[] getRecoverySecretTypes() throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public Map getRecoveryStatus() throws RemoteException {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public void initRecoveryServiceWithSigFile(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setRecoverySecretTypes(int[] iArr) throws RemoteException {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setServerParams(byte[] bArr) throws RemoteException {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setSnapshotCreatedPendingIntent(PendingIntent pendingIntent) throws RemoteException {
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements ILockSettings {
        private static final String DESCRIPTOR = "com.android.internal.widget.ILockSettings";
        static final int TRANSACTION_generateKey = 3;
        static final int TRANSACTION_generateKeyWithMetadata = 4;
        static final int TRANSACTION_getAliases = 5;
        static final int TRANSACTION_getKeyChainSnapshot = 6;
        static final int TRANSACTION_getRecoverySecretTypes = 2;
        static final int TRANSACTION_getRecoveryStatus = 7;
        static final int TRANSACTION_initRecoveryServiceWithSigFile = 8;
        static final int TRANSACTION_setRecoverySecretTypes = 1;
        static final int TRANSACTION_setServerParams = 9;
        static final int TRANSACTION_setSnapshotCreatedPendingIntent = 10;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes2.dex */
        public static class Proxy implements ILockSettings {
            public static ILockSettings sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.android.internal.widget.ILockSettings
            public String generateKey(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateKey(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public String generateKeyWithMetadata(String str, byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().generateKeyWithMetadata(str, bArr);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public List<String> getAliases() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAliases();
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.android.internal.widget.ILockSettings
            public KeyChainSnapshot getKeyChainSnapshot() throws RemoteException {
                KeyChainSnapshot keyChainSnapshot;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getKeyChainSnapshot();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        keyChainSnapshot = KeyChainSnapshot.CREATOR.createFromParcel(obtain2);
                    } else {
                        keyChainSnapshot = null;
                    }
                    return keyChainSnapshot;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public int[] getRecoverySecretTypes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRecoverySecretTypes();
                    }
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public Map getRecoveryStatus() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRecoveryStatus();
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public void initRecoveryServiceWithSigFile(String str, byte[] bArr, byte[] bArr2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeByteArray(bArr);
                    obtain.writeByteArray(bArr2);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().initRecoveryServiceWithSigFile(str, bArr, bArr2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public void setRecoverySecretTypes(int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeIntArray(iArr);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setRecoverySecretTypes(iArr);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public void setServerParams(byte[] bArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeByteArray(bArr);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setServerParams(bArr);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.android.internal.widget.ILockSettings
            public void setSnapshotCreatedPendingIntent(PendingIntent pendingIntent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setSnapshotCreatedPendingIntent(pendingIntent);
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

        public static ILockSettings asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ILockSettings)) {
                return (ILockSettings) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static ILockSettings getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ILockSettings iLockSettings) {
            if (Proxy.sDefaultImpl == null) {
                if (iLockSettings != null) {
                    Proxy.sDefaultImpl = iLockSettings;
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
            PendingIntent pendingIntent;
            if (i5 != 1598968902) {
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        setRecoverySecretTypes(parcel.createIntArray());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        int[] recoverySecretTypes = getRecoverySecretTypes();
                        parcel2.writeNoException();
                        parcel2.writeIntArray(recoverySecretTypes);
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        String generateKey = generateKey(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(generateKey);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        String generateKeyWithMetadata = generateKeyWithMetadata(parcel.readString(), parcel.createByteArray());
                        parcel2.writeNoException();
                        parcel2.writeString(generateKeyWithMetadata);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<String> aliases = getAliases();
                        parcel2.writeNoException();
                        parcel2.writeStringList(aliases);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        KeyChainSnapshot keyChainSnapshot = getKeyChainSnapshot();
                        parcel2.writeNoException();
                        if (keyChainSnapshot != null) {
                            parcel2.writeInt(1);
                            keyChainSnapshot.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        Map recoveryStatus = getRecoveryStatus();
                        parcel2.writeNoException();
                        parcel2.writeMap(recoveryStatus);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        initRecoveryServiceWithSigFile(parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        setServerParams(parcel.createByteArray());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel);
                        } else {
                            pendingIntent = null;
                        }
                        setSnapshotCreatedPendingIntent(pendingIntent);
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

    String generateKey(String str) throws RemoteException;

    String generateKeyWithMetadata(String str, byte[] bArr) throws RemoteException;

    List<String> getAliases() throws RemoteException;

    KeyChainSnapshot getKeyChainSnapshot() throws RemoteException;

    int[] getRecoverySecretTypes() throws RemoteException;

    Map getRecoveryStatus() throws RemoteException;

    void initRecoveryServiceWithSigFile(String str, byte[] bArr, byte[] bArr2) throws RemoteException;

    void setRecoverySecretTypes(int[] iArr) throws RemoteException;

    void setServerParams(byte[] bArr) throws RemoteException;

    void setSnapshotCreatedPendingIntent(PendingIntent pendingIntent) throws RemoteException;
}

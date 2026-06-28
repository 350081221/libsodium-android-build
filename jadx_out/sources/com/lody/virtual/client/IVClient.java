package com.lody.virtual.client;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public interface IVClient extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IVClient {
        @Override // com.lody.virtual.client.IVClient
        public IBinder acquireProviderClient(ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public IBinder createProxyService(ComponentName componentName, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public void finishActivity(IBinder iBinder) throws RemoteException {
        }

        @Override // com.lody.virtual.client.IVClient
        public boolean finishReceiver(IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.client.IVClient
        public IBinder getAppThread() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public String getDebugInfo() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public List<ActivityManager.RunningServiceInfo> getServices() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public IBinder getToken() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.client.IVClient
        public boolean isAppRunning() throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.client.IVClient
        public void scheduleNewIntent(String str, IBinder iBinder, Intent intent) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IVClient {
        private static final String DESCRIPTOR = "com.lody.virtual.client.IVClient";
        static final int TRANSACTION_acquireProviderClient = 4;
        static final int TRANSACTION_createProxyService = 3;
        static final int TRANSACTION_finishActivity = 2;
        static final int TRANSACTION_finishReceiver = 9;
        static final int TRANSACTION_getAppThread = 5;
        static final int TRANSACTION_getDebugInfo = 8;
        static final int TRANSACTION_getServices = 10;
        static final int TRANSACTION_getToken = 6;
        static final int TRANSACTION_isAppRunning = 7;
        static final int TRANSACTION_scheduleNewIntent = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IVClient {
            public static IVClient sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.client.IVClient
            public IBinder acquireProviderClient(ProviderInfo providerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().acquireProviderClient(providerInfo);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.client.IVClient
            public IBinder createProxyService(ComponentName componentName, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().createProxyService(componentName, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.client.IVClient
            public void finishActivity(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().finishActivity(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.client.IVClient
            public boolean finishReceiver(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().finishReceiver(iBinder);
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

            @Override // com.lody.virtual.client.IVClient
            public IBinder getAppThread() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppThread();
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.client.IVClient
            public String getDebugInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDebugInfo();
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

            @Override // com.lody.virtual.client.IVClient
            public List<ActivityManager.RunningServiceInfo> getServices() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServices();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RunningServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.client.IVClient
            public IBinder getToken() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getToken();
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.client.IVClient
            public boolean isAppRunning() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppRunning();
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

            @Override // com.lody.virtual.client.IVClient
            public void scheduleNewIntent(String str, IBinder iBinder, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().scheduleNewIntent(str, iBinder, intent);
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

        public static IVClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IVClient)) {
                return (IVClient) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IVClient getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IVClient iVClient) {
            if (Proxy.sDefaultImpl == null) {
                if (iVClient != null) {
                    Proxy.sDefaultImpl = iVClient;
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
                Intent intent = null;
                ProviderInfo providerInfo = null;
                ComponentName componentName = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (parcel.readInt() != 0) {
                            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        }
                        scheduleNewIntent(readString, readStrongBinder, intent);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        finishActivity(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            componentName = (ComponentName) ComponentName.CREATOR.createFromParcel(parcel);
                        }
                        IBinder createProxyService = createProxyService(componentName, parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(createProxyService);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            providerInfo = (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcel);
                        }
                        IBinder acquireProviderClient = acquireProviderClient(providerInfo);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(acquireProviderClient);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder appThread = getAppThread();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(appThread);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        IBinder token = getToken();
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(token);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppRunning = isAppRunning();
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppRunning ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        String debugInfo = getDebugInfo();
                        parcel2.writeNoException();
                        parcel2.writeString(debugInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean finishReceiver = finishReceiver(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(finishReceiver ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RunningServiceInfo> services = getServices();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(services);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    IBinder acquireProviderClient(ProviderInfo providerInfo) throws RemoteException;

    IBinder createProxyService(ComponentName componentName, IBinder iBinder) throws RemoteException;

    void finishActivity(IBinder iBinder) throws RemoteException;

    boolean finishReceiver(IBinder iBinder) throws RemoteException;

    IBinder getAppThread() throws RemoteException;

    String getDebugInfo() throws RemoteException;

    List<ActivityManager.RunningServiceInfo> getServices() throws RemoteException;

    IBinder getToken() throws RemoteException;

    boolean isAppRunning() throws RemoteException;

    void scheduleNewIntent(String str, IBinder iBinder, Intent intent) throws RemoteException;
}

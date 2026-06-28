package com.lody.virtual.server.interfaces;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.InstalledAppInfo;
import com.lody.virtual.remote.VAppInstallerParams;
import com.lody.virtual.remote.VAppInstallerResult;
import com.lody.virtual.server.interfaces.IPackageObserver;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAppManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IAppManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean cleanPackageData(String str, int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public int getInstalledAppCount() throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public InstalledAppInfo getInstalledAppInfo(String str, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public List<InstalledAppInfo> getInstalledApps(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public List<InstalledAppInfo> getInstalledAppsAsUser(int i5, int i6) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public List<String> getInstalledSplitNames(String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public int[] getPackageInstalledUsers(String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public int getUidForSharedUser(String str) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public VAppInstallerResult installPackage(Uri uri, VAppInstallerParams vAppInstallerParams) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean installPackageAsUser(int i5, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean isAppInstalled(String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean isAppInstalledAsUser(int i5, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean isPackageLaunched(int i5, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean isRunInExtProcess(String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public void registerObserver(IPackageObserver iPackageObserver) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public void scanApps() throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public void setPackageHidden(int i5, String str, boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean uninstallPackage(String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public boolean uninstallPackageAsUser(String str, int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IAppManager
        public void unregisterObserver(IPackageObserver iPackageObserver) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IAppManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IAppManager";
        static final int TRANSACTION_cleanPackageData = 20;
        static final int TRANSACTION_getInstalledAppCount = 14;
        static final int TRANSACTION_getInstalledAppInfo = 4;
        static final int TRANSACTION_getInstalledApps = 11;
        static final int TRANSACTION_getInstalledAppsAsUser = 12;
        static final int TRANSACTION_getInstalledSplitNames = 13;
        static final int TRANSACTION_getPackageInstalledUsers = 1;
        static final int TRANSACTION_getUidForSharedUser = 3;
        static final int TRANSACTION_installPackage = 5;
        static final int TRANSACTION_installPackageAsUser = 8;
        static final int TRANSACTION_isAppInstalled = 15;
        static final int TRANSACTION_isAppInstalledAsUser = 16;
        static final int TRANSACTION_isPackageLaunched = 6;
        static final int TRANSACTION_isRunInExtProcess = 19;
        static final int TRANSACTION_registerObserver = 17;
        static final int TRANSACTION_scanApps = 2;
        static final int TRANSACTION_setPackageHidden = 7;
        static final int TRANSACTION_uninstallPackage = 10;
        static final int TRANSACTION_uninstallPackageAsUser = 9;
        static final int TRANSACTION_unregisterObserver = 18;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IAppManager {
            public static IAppManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean cleanPackageData(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cleanPackageData(str, i5);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public int getInstalledAppCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstalledAppCount();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public InstalledAppInfo getInstalledAppInfo(String str, int i5) throws RemoteException {
                InstalledAppInfo installedAppInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstalledAppInfo(str, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        installedAppInfo = InstalledAppInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        installedAppInfo = null;
                    }
                    return installedAppInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public List<InstalledAppInfo> getInstalledApps(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstalledApps(i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledAppInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public List<InstalledAppInfo> getInstalledAppsAsUser(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstalledAppsAsUser(i5, i6);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(InstalledAppInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public List<String> getInstalledSplitNames(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInstalledSplitNames(str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public int[] getPackageInstalledUsers(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPackageInstalledUsers(str);
                    }
                    obtain2.readException();
                    return obtain2.createIntArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public int getUidForSharedUser(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUidForSharedUser(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public VAppInstallerResult installPackage(Uri uri, VAppInstallerParams vAppInstallerParams) throws RemoteException {
                VAppInstallerResult vAppInstallerResult;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (vAppInstallerParams != null) {
                        obtain.writeInt(1);
                        vAppInstallerParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().installPackage(uri, vAppInstallerParams);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vAppInstallerResult = VAppInstallerResult.CREATOR.createFromParcel(obtain2);
                    } else {
                        vAppInstallerResult = null;
                    }
                    return vAppInstallerResult;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean installPackageAsUser(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().installPackageAsUser(i5, str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean isAppInstalled(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppInstalled(str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean isAppInstalledAsUser(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppInstalledAsUser(i5, str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean isPackageLaunched(int i5, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPackageLaunched(i5, str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean isRunInExtProcess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isRunInExtProcess(str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public void registerObserver(IPackageObserver iPackageObserver) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPackageObserver != null) {
                        iBinder = iPackageObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerObserver(iPackageObserver);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public void scanApps() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().scanApps();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public void setPackageHidden(int i5, String str, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeString(str);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setPackageHidden(i5, str, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean uninstallPackage(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().uninstallPackage(str);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public boolean uninstallPackageAsUser(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().uninstallPackageAsUser(str, i5);
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

            @Override // com.lody.virtual.server.interfaces.IAppManager
            public void unregisterObserver(IPackageObserver iPackageObserver) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iPackageObserver != null) {
                        iBinder = iPackageObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterObserver(iPackageObserver);
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

        public static IAppManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppManager)) {
                return (IAppManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IAppManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAppManager iAppManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iAppManager != null) {
                    Proxy.sDefaultImpl = iAppManager;
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
            Uri uri;
            if (i5 != 1598968902) {
                boolean z4 = false;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int[] packageInstalledUsers = getPackageInstalledUsers(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeIntArray(packageInstalledUsers);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        scanApps();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int uidForSharedUser = getUidForSharedUser(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(uidForSharedUser);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        InstalledAppInfo installedAppInfo = getInstalledAppInfo(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (installedAppInfo != null) {
                            parcel2.writeInt(1);
                            installedAppInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        VAppInstallerParams vAppInstallerParams = null;
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            vAppInstallerParams = VAppInstallerParams.CREATOR.createFromParcel(parcel);
                        }
                        VAppInstallerResult installPackage = installPackage(uri, vAppInstallerParams);
                        parcel2.writeNoException();
                        if (installPackage != null) {
                            parcel2.writeInt(1);
                            installPackage.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isPackageLaunched = isPackageLaunched(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isPackageLaunched ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt = parcel.readInt();
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        setPackageHidden(readInt, readString, z4);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean installPackageAsUser = installPackageAsUser(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(installPackageAsUser ? 1 : 0);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean uninstallPackageAsUser = uninstallPackageAsUser(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(uninstallPackageAsUser ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean uninstallPackage = uninstallPackage(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(uninstallPackage ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<InstalledAppInfo> installedApps = getInstalledApps(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(installedApps);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<InstalledAppInfo> installedAppsAsUser = getInstalledAppsAsUser(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(installedAppsAsUser);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<String> installedSplitNames = getInstalledSplitNames(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStringList(installedSplitNames);
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        int installedAppCount = getInstalledAppCount();
                        parcel2.writeNoException();
                        parcel2.writeInt(installedAppCount);
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppInstalled = isAppInstalled(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppInstalled ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppInstalledAsUser = isAppInstalledAsUser(parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppInstalledAsUser ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        registerObserver(IPackageObserver.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        unregisterObserver(IPackageObserver.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isRunInExtProcess = isRunInExtProcess(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isRunInExtProcess ? 1 : 0);
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean cleanPackageData = cleanPackageData(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(cleanPackageData ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i5, parcel, parcel2, i6);
                }
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }

    boolean cleanPackageData(String str, int i5) throws RemoteException;

    int getInstalledAppCount() throws RemoteException;

    InstalledAppInfo getInstalledAppInfo(String str, int i5) throws RemoteException;

    List<InstalledAppInfo> getInstalledApps(int i5) throws RemoteException;

    List<InstalledAppInfo> getInstalledAppsAsUser(int i5, int i6) throws RemoteException;

    List<String> getInstalledSplitNames(String str) throws RemoteException;

    int[] getPackageInstalledUsers(String str) throws RemoteException;

    int getUidForSharedUser(String str) throws RemoteException;

    VAppInstallerResult installPackage(Uri uri, VAppInstallerParams vAppInstallerParams) throws RemoteException;

    boolean installPackageAsUser(int i5, String str) throws RemoteException;

    boolean isAppInstalled(String str) throws RemoteException;

    boolean isAppInstalledAsUser(int i5, String str) throws RemoteException;

    boolean isPackageLaunched(int i5, String str) throws RemoteException;

    boolean isRunInExtProcess(String str) throws RemoteException;

    void registerObserver(IPackageObserver iPackageObserver) throws RemoteException;

    void scanApps() throws RemoteException;

    void setPackageHidden(int i5, String str, boolean z4) throws RemoteException;

    boolean uninstallPackage(String str) throws RemoteException;

    boolean uninstallPackageAsUser(String str, int i5) throws RemoteException;

    void unregisterObserver(IPackageObserver iPackageObserver) throws RemoteException;
}

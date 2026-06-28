package com.lody.virtual;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public interface IExtHelperInterface extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IExtHelperInterface {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public void cleanPackageData(int[] iArr, String str) throws RemoteException {
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public void forceStop(int[] iArr) throws RemoteException {
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i5, int i6) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public List<ActivityManager.RunningTaskInfo> getRunningTasks(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public boolean isExternalStorageManager() throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public void startActivity(Intent intent, Bundle bundle) throws RemoteException {
        }

        @Override // com.lody.virtual.IExtHelperInterface
        public int syncPackages() throws RemoteException {
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IExtHelperInterface {
        private static final String DESCRIPTOR = "com.lody.virtual.IExtHelperInterface";
        static final int TRANSACTION_cleanPackageData = 2;
        static final int TRANSACTION_forceStop = 3;
        static final int TRANSACTION_getRecentTasks = 5;
        static final int TRANSACTION_getRunningAppProcesses = 6;
        static final int TRANSACTION_getRunningTasks = 4;
        static final int TRANSACTION_isExternalStorageManager = 7;
        static final int TRANSACTION_startActivity = 8;
        static final int TRANSACTION_syncPackages = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IExtHelperInterface {
            public static IExtHelperInterface sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public void cleanPackageData(int[] iArr, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeIntArray(iArr);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cleanPackageData(iArr, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public void forceStop(int[] iArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeIntArray(iArr);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().forceStop(iArr);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i5, int i6) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRecentTasks(i5, i6);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RecentTaskInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRunningAppProcesses();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public List<ActivityManager.RunningTaskInfo> getRunningTasks(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRunningTasks(i5);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ActivityManager.RunningTaskInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public boolean isExternalStorageManager() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isExternalStorageManager();
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

            @Override // com.lody.virtual.IExtHelperInterface
            public void startActivity(Intent intent, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().startActivity(intent, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.IExtHelperInterface
            public int syncPackages() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().syncPackages();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IExtHelperInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IExtHelperInterface)) {
                return (IExtHelperInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IExtHelperInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IExtHelperInterface iExtHelperInterface) {
            if (Proxy.sDefaultImpl == null) {
                if (iExtHelperInterface != null) {
                    Proxy.sDefaultImpl = iExtHelperInterface;
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
            Intent intent;
            if (i5 != 1598968902) {
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        int syncPackages = syncPackages();
                        parcel2.writeNoException();
                        parcel2.writeInt(syncPackages);
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        cleanPackageData(parcel.createIntArray(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        forceStop(parcel.createIntArray());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(runningTasks);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RecentTaskInfo> recentTasks = getRecentTasks(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(recentTasks);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = getRunningAppProcesses();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(runningAppProcesses);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isExternalStorageManager = isExternalStorageManager();
                        parcel2.writeNoException();
                        parcel2.writeInt(isExternalStorageManager ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        Bundle bundle = null;
                        if (parcel.readInt() != 0) {
                            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        } else {
                            intent = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        startActivity(intent, bundle);
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

    void cleanPackageData(int[] iArr, String str) throws RemoteException;

    void forceStop(int[] iArr) throws RemoteException;

    List<ActivityManager.RecentTaskInfo> getRecentTasks(int i5, int i6) throws RemoteException;

    List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException;

    List<ActivityManager.RunningTaskInfo> getRunningTasks(int i5) throws RemoteException;

    boolean isExternalStorageManager() throws RemoteException;

    void startActivity(Intent intent, Bundle bundle) throws RemoteException;

    int syncPackages() throws RemoteException;
}

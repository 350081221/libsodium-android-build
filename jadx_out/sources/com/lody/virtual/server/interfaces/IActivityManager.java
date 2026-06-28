package com.lody.virtual.server.interfaces;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.lody.virtual.remote.AppTaskInfo;
import com.lody.virtual.remote.BadgerInfo;
import com.lody.virtual.remote.ClientConfig;
import com.lody.virtual.remote.IntentSenderData;
import com.lody.virtual.remote.VParceledListSlice;
import java.util.List;

/* loaded from: classes3.dex */
public interface IActivityManager extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IActivityManager {
        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public IBinder acquireProviderClient(int i5, ProviderInfo providerInfo) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void addOrUpdateIntentSender(IntentSenderData intentSenderData, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void appDoneExecuting(String str, int i5) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean broadcastFinish(IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int checkPermission(boolean z4, String str, int i5, int i6, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void dump() throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean finishActivityAffinity(int i5, IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public ComponentName getActivityClassForToken(int i5, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int getAppPid(String str, int i5, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public String getAppProcessName(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public ComponentName getCallingActivity(int i5, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public String getCallingPackage(int i5, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int getFreeStubCount() throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public String getInitialPackage(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public IntentSenderData getIntentSender(IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public String getPackageForToken(int i5, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public ClientConfig getProcessConfig(String str, String str2, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public List<String> getProcessPkgList(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public VParceledListSlice getServices(String str, int i5, int i6, int i7) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public String getSettingsProvider(int i5, int i6, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int getSystemPid() throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int getSystemUid() throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public AppTaskInfo getTaskInfo(int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int getUidByPid(int i5) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void handleDownloadCompleteIntent(Intent intent) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public ClientConfig initProcess(String str, String str2, int i5) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean isAppInactive(String str, int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean isAppPid(int i5) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean isAppProcess(String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean isAppRunning(String str, int i5, boolean z4) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void killAllApps() throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void killAppByPkg(String str, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void killApplicationProcess(String str, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void notifyBadgerChange(BadgerInfo badgerInfo) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void onActivityCreated(IBinder iBinder, IBinder iBinder2, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public boolean onActivityDestroyed(int i5, IBinder iBinder) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void onActivityFinish(int i5, IBinder iBinder) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void onActivityResumed(int i5, IBinder iBinder) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void processRestarted(String str, String str2, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void removeIntentSender(IBinder iBinder) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void setAppInactive(String str, boolean z4, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public void setSettingsProvider(int i5, int i6, String str, String str2) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int startActivities(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, String str, int i5) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int startActivity(Intent intent, ActivityInfo activityInfo, IBinder iBinder, Bundle bundle, String str, int i5, String str2, int i6) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IActivityManager
        public int startActivityFromHistory(Intent intent) throws RemoteException {
            return 0;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IActivityManager {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IActivityManager";
        static final int TRANSACTION_acquireProviderClient = 31;
        static final int TRANSACTION_addOrUpdateIntentSender = 33;
        static final int TRANSACTION_appDoneExecuting = 2;
        static final int TRANSACTION_broadcastFinish = 32;
        static final int TRANSACTION_checkPermission = 4;
        static final int TRANSACTION_dump = 16;
        static final int TRANSACTION_finishActivityAffinity = 21;
        static final int TRANSACTION_getActivityClassForToken = 26;
        static final int TRANSACTION_getAppPid = 42;
        static final int TRANSACTION_getAppProcessName = 11;
        static final int TRANSACTION_getCallingActivity = 28;
        static final int TRANSACTION_getCallingPackage = 27;
        static final int TRANSACTION_getFreeStubCount = 3;
        static final int TRANSACTION_getInitialPackage = 17;
        static final int TRANSACTION_getIntentSender = 35;
        static final int TRANSACTION_getPackageForToken = 30;
        static final int TRANSACTION_getProcessConfig = 45;
        static final int TRANSACTION_getProcessPkgList = 12;
        static final int TRANSACTION_getServices = 40;
        static final int TRANSACTION_getSettingsProvider = 44;
        static final int TRANSACTION_getSystemPid = 5;
        static final int TRANSACTION_getSystemUid = 6;
        static final int TRANSACTION_getTaskInfo = 29;
        static final int TRANSACTION_getUidByPid = 7;
        static final int TRANSACTION_handleDownloadCompleteIntent = 41;
        static final int TRANSACTION_initProcess = 1;
        static final int TRANSACTION_isAppInactive = 39;
        static final int TRANSACTION_isAppPid = 10;
        static final int TRANSACTION_isAppProcess = 8;
        static final int TRANSACTION_isAppRunning = 9;
        static final int TRANSACTION_killAllApps = 13;
        static final int TRANSACTION_killAppByPkg = 14;
        static final int TRANSACTION_killApplicationProcess = 15;
        static final int TRANSACTION_notifyBadgerChange = 37;
        static final int TRANSACTION_onActivityCreated = 22;
        static final int TRANSACTION_onActivityDestroyed = 24;
        static final int TRANSACTION_onActivityFinish = 25;
        static final int TRANSACTION_onActivityResumed = 23;
        static final int TRANSACTION_processRestarted = 36;
        static final int TRANSACTION_removeIntentSender = 34;
        static final int TRANSACTION_setAppInactive = 38;
        static final int TRANSACTION_setSettingsProvider = 43;
        static final int TRANSACTION_startActivities = 18;
        static final int TRANSACTION_startActivity = 19;
        static final int TRANSACTION_startActivityFromHistory = 20;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IActivityManager {
            public static IActivityManager sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public IBinder acquireProviderClient(int i5, ProviderInfo providerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (providerInfo != null) {
                        obtain.writeInt(1);
                        providerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().acquireProviderClient(i5, providerInfo);
                    }
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void addOrUpdateIntentSender(IntentSenderData intentSenderData, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intentSenderData != null) {
                        obtain.writeInt(1);
                        intentSenderData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addOrUpdateIntentSender(intentSenderData, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void appDoneExecuting(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().appDoneExecuting(str, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean broadcastFinish(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().broadcastFinish(iBinder);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int checkPermission(boolean z4, String str, int i5, int i6, String str2) throws RemoteException {
                int i7;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z4) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    obtain.writeInt(i7);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkPermission(z4, str, i5, i6, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void dump() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().dump();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean finishActivityAffinity(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().finishActivityAffinity(i5, iBinder);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public ComponentName getActivityClassForToken(int i5, IBinder iBinder) throws RemoteException {
                ComponentName componentName;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getActivityClassForToken(i5, iBinder);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        componentName = (ComponentName) ComponentName.CREATOR.createFromParcel(obtain2);
                    } else {
                        componentName = null;
                    }
                    return componentName;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int getAppPid(String str, int i5, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(42, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppPid(str, i5, str2);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public String getAppProcessName(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAppProcessName(i5);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public ComponentName getCallingActivity(int i5, IBinder iBinder) throws RemoteException {
                ComponentName componentName;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallingActivity(i5, iBinder);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        componentName = (ComponentName) ComponentName.CREATOR.createFromParcel(obtain2);
                    } else {
                        componentName = null;
                    }
                    return componentName;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public String getCallingPackage(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCallingPackage(i5, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int getFreeStubCount() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getFreeStubCount();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public String getInitialPackage(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInitialPackage(i5);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public IntentSenderData getIntentSender(IBinder iBinder) throws RemoteException {
                IntentSenderData intentSenderData;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(35, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIntentSender(iBinder);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        intentSenderData = IntentSenderData.CREATOR.createFromParcel(obtain2);
                    } else {
                        intentSenderData = null;
                    }
                    return intentSenderData;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public String getPackageForToken(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPackageForToken(i5, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public ClientConfig getProcessConfig(String str, String str2, int i5) throws RemoteException {
                ClientConfig clientConfig;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(45, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProcessConfig(str, str2, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        clientConfig = ClientConfig.CREATOR.createFromParcel(obtain2);
                    } else {
                        clientConfig = null;
                    }
                    return clientConfig;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public List<String> getProcessPkgList(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProcessPkgList(i5);
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public VParceledListSlice getServices(String str, int i5, int i6, int i7) throws RemoteException {
                VParceledListSlice vParceledListSlice;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeInt(i7);
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getServices(str, i5, i6, i7);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        vParceledListSlice = VParceledListSlice.CREATOR.createFromParcel(obtain2);
                    } else {
                        vParceledListSlice = null;
                    }
                    return vParceledListSlice;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public String getSettingsProvider(int i5, int i6, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeString(str);
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSettingsProvider(i5, i6, str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int getSystemPid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSystemPid();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int getSystemUid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSystemUid();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public AppTaskInfo getTaskInfo(int i5) throws RemoteException {
                AppTaskInfo appTaskInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getTaskInfo(i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        appTaskInfo = AppTaskInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        appTaskInfo = null;
                    }
                    return appTaskInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int getUidByPid(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUidByPid(i5);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void handleDownloadCompleteIntent(Intent intent) throws RemoteException {
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
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().handleDownloadCompleteIntent(intent);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public ClientConfig initProcess(String str, String str2, int i5) throws RemoteException {
                ClientConfig clientConfig;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().initProcess(str, str2, i5);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        clientConfig = ClientConfig.CREATOR.createFromParcel(obtain2);
                    } else {
                        clientConfig = null;
                    }
                    return clientConfig;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean isAppInactive(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppInactive(str, i5);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean isAppPid(int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    boolean z4 = false;
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppPid(i5);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean isAppProcess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z4 = false;
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppProcess(str);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean isAppRunning(String str, int i5, boolean z4) throws RemoteException {
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    boolean z5 = true;
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAppRunning(str, i5, z4);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void killAllApps() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().killAllApps();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void killAppByPkg(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().killAppByPkg(str, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void killApplicationProcess(String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().killApplicationProcess(str, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void notifyBadgerChange(BadgerInfo badgerInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (badgerInfo != null) {
                        obtain.writeInt(1);
                        badgerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(37, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notifyBadgerChange(badgerInfo);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void onActivityCreated(IBinder iBinder, IBinder iBinder2, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeStrongBinder(iBinder2);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onActivityCreated(iBinder, iBinder2, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public boolean onActivityDestroyed(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    boolean z4 = false;
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onActivityDestroyed(i5, iBinder);
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

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void onActivityFinish(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onActivityFinish(i5, iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void onActivityResumed(int i5, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onActivityResumed(i5, iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void processRestarted(String str, String str2, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().processRestarted(str, str2, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void removeIntentSender(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().removeIntentSender(iBinder);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void setAppInactive(String str, boolean z4, int i5) throws RemoteException {
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
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setAppInactive(str, z4, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public void setSettingsProvider(int i5, int i6, String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    obtain.writeInt(i6);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(43, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setSettingsProvider(i5, i6, str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int startActivities(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedArray(intentArr, 0);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    try {
                        if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                            int startActivities = Stub.getDefaultImpl().startActivities(intentArr, strArr, iBinder, bundle, str, i5);
                            obtain2.recycle();
                            obtain.recycle();
                            return startActivities;
                        }
                        obtain2.readException();
                        int readInt = obtain2.readInt();
                        obtain2.recycle();
                        obtain.recycle();
                        return readInt;
                    } catch (Throwable th) {
                        th = th;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int startActivity(Intent intent, ActivityInfo activityInfo, IBinder iBinder, Bundle bundle, String str, int i5, String str2, int i6) throws RemoteException {
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
                    if (activityInfo != null) {
                        obtain.writeInt(1);
                        activityInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    obtain.writeString(str2);
                    obtain.writeInt(i6);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        int startActivity = Stub.getDefaultImpl().startActivity(intent, activityInfo, iBinder, bundle, str, i5, str2, i6);
                        obtain2.recycle();
                        obtain.recycle();
                        return startActivity;
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.lody.virtual.server.interfaces.IActivityManager
            public int startActivityFromHistory(Intent intent) throws RemoteException {
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
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startActivityFromHistory(intent);
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

        public static IActivityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IActivityManager)) {
                return (IActivityManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IActivityManager getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IActivityManager iActivityManager) {
            if (Proxy.sDefaultImpl == null) {
                if (iActivityManager != null) {
                    Proxy.sDefaultImpl = iActivityManager;
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
            Intent intent;
            ActivityInfo activityInfo;
            if (i5 != 1598968902) {
                Bundle bundle = null;
                Intent intent2 = null;
                BadgerInfo badgerInfo = null;
                IntentSenderData intentSenderData = null;
                ProviderInfo providerInfo = null;
                Intent intent3 = null;
                Bundle bundle2 = null;
                boolean z5 = false;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        ClientConfig initProcess = initProcess(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (initProcess != null) {
                            parcel2.writeInt(1);
                            initProcess.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        appDoneExecuting(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        int freeStubCount = getFreeStubCount();
                        parcel2.writeNoException();
                        parcel2.writeInt(freeStubCount);
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int checkPermission = checkPermission(z4, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(checkPermission);
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        int systemPid = getSystemPid();
                        parcel2.writeNoException();
                        parcel2.writeInt(systemPid);
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        int systemUid = getSystemUid();
                        parcel2.writeNoException();
                        parcel2.writeInt(systemUid);
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        int uidByPid = getUidByPid(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(uidByPid);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppProcess = isAppProcess(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppProcess ? 1 : 0);
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString = parcel.readString();
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        boolean isAppRunning = isAppRunning(readString, readInt, z5);
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppRunning ? 1 : 0);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppPid = isAppPid(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppPid ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        String appProcessName = getAppProcessName(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(appProcessName);
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<String> processPkgList = getProcessPkgList(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeStringList(processPkgList);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        killAllApps();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        killAppByPkg(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        killApplicationProcess(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        dump();
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        String initialPackage = getInitialPackage(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(initialPackage);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        Intent[] intentArr = (Intent[]) parcel.createTypedArray(Intent.CREATOR);
                        String[] createStringArray = parcel.createStringArray();
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        int startActivities = startActivities(intentArr, createStringArray, readStrongBinder, bundle, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivities);
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        } else {
                            intent = null;
                        }
                        if (parcel.readInt() != 0) {
                            activityInfo = (ActivityInfo) ActivityInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            activityInfo = null;
                        }
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        int startActivity = startActivity(intent, activityInfo, readStrongBinder2, bundle2, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivity);
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            intent3 = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        }
                        int startActivityFromHistory = startActivityFromHistory(intent3);
                        parcel2.writeNoException();
                        parcel2.writeInt(startActivityFromHistory);
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean finishActivityAffinity = finishActivityAffinity(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(finishActivityAffinity ? 1 : 0);
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityCreated(parcel.readStrongBinder(), parcel.readStrongBinder(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityResumed(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean onActivityDestroyed = onActivityDestroyed(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(onActivityDestroyed ? 1 : 0);
                        return true;
                    case 25:
                        parcel.enforceInterface(DESCRIPTOR);
                        onActivityFinish(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface(DESCRIPTOR);
                        ComponentName activityClassForToken = getActivityClassForToken(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        if (activityClassForToken != null) {
                            parcel2.writeInt(1);
                            activityClassForToken.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 27:
                        parcel.enforceInterface(DESCRIPTOR);
                        String callingPackage = getCallingPackage(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeString(callingPackage);
                        return true;
                    case 28:
                        parcel.enforceInterface(DESCRIPTOR);
                        ComponentName callingActivity = getCallingActivity(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        if (callingActivity != null) {
                            parcel2.writeInt(1);
                            callingActivity.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface(DESCRIPTOR);
                        AppTaskInfo taskInfo = getTaskInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (taskInfo != null) {
                            parcel2.writeInt(1);
                            taskInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface(DESCRIPTOR);
                        String packageForToken = getPackageForToken(parcel.readInt(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeString(packageForToken);
                        return true;
                    case 31:
                        parcel.enforceInterface(DESCRIPTOR);
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            providerInfo = (ProviderInfo) ProviderInfo.CREATOR.createFromParcel(parcel);
                        }
                        IBinder acquireProviderClient = acquireProviderClient(readInt2, providerInfo);
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(acquireProviderClient);
                        return true;
                    case 32:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean broadcastFinish = broadcastFinish(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeInt(broadcastFinish ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            intentSenderData = IntentSenderData.CREATOR.createFromParcel(parcel);
                        }
                        addOrUpdateIntentSender(intentSenderData, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface(DESCRIPTOR);
                        removeIntentSender(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface(DESCRIPTOR);
                        IntentSenderData intentSender = getIntentSender(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        if (intentSender != null) {
                            parcel2.writeInt(1);
                            intentSender.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 36:
                        parcel.enforceInterface(DESCRIPTOR);
                        processRestarted(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            badgerInfo = BadgerInfo.CREATOR.createFromParcel(parcel);
                        }
                        notifyBadgerChange(badgerInfo);
                        parcel2.writeNoException();
                        return true;
                    case 38:
                        parcel.enforceInterface(DESCRIPTOR);
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        setAppInactive(readString2, z5, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 39:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean isAppInactive = isAppInactive(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isAppInactive ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface(DESCRIPTOR);
                        VParceledListSlice services = getServices(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (services != null) {
                            parcel2.writeInt(1);
                            services.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 41:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            intent2 = (Intent) Intent.CREATOR.createFromParcel(parcel);
                        }
                        handleDownloadCompleteIntent(intent2);
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface(DESCRIPTOR);
                        int appPid = getAppPid(parcel.readString(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(appPid);
                        return true;
                    case 43:
                        parcel.enforceInterface(DESCRIPTOR);
                        setSettingsProvider(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface(DESCRIPTOR);
                        String settingsProvider = getSettingsProvider(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(settingsProvider);
                        return true;
                    case 45:
                        parcel.enforceInterface(DESCRIPTOR);
                        ClientConfig processConfig = getProcessConfig(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        if (processConfig != null) {
                            parcel2.writeInt(1);
                            processConfig.writeToParcel(parcel2, 1);
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

    IBinder acquireProviderClient(int i5, ProviderInfo providerInfo) throws RemoteException;

    void addOrUpdateIntentSender(IntentSenderData intentSenderData, int i5) throws RemoteException;

    void appDoneExecuting(String str, int i5) throws RemoteException;

    boolean broadcastFinish(IBinder iBinder) throws RemoteException;

    int checkPermission(boolean z4, String str, int i5, int i6, String str2) throws RemoteException;

    void dump() throws RemoteException;

    boolean finishActivityAffinity(int i5, IBinder iBinder) throws RemoteException;

    ComponentName getActivityClassForToken(int i5, IBinder iBinder) throws RemoteException;

    int getAppPid(String str, int i5, String str2) throws RemoteException;

    String getAppProcessName(int i5) throws RemoteException;

    ComponentName getCallingActivity(int i5, IBinder iBinder) throws RemoteException;

    String getCallingPackage(int i5, IBinder iBinder) throws RemoteException;

    int getFreeStubCount() throws RemoteException;

    String getInitialPackage(int i5) throws RemoteException;

    IntentSenderData getIntentSender(IBinder iBinder) throws RemoteException;

    String getPackageForToken(int i5, IBinder iBinder) throws RemoteException;

    ClientConfig getProcessConfig(String str, String str2, int i5) throws RemoteException;

    List<String> getProcessPkgList(int i5) throws RemoteException;

    VParceledListSlice getServices(String str, int i5, int i6, int i7) throws RemoteException;

    String getSettingsProvider(int i5, int i6, String str) throws RemoteException;

    int getSystemPid() throws RemoteException;

    int getSystemUid() throws RemoteException;

    AppTaskInfo getTaskInfo(int i5) throws RemoteException;

    int getUidByPid(int i5) throws RemoteException;

    void handleDownloadCompleteIntent(Intent intent) throws RemoteException;

    ClientConfig initProcess(String str, String str2, int i5) throws RemoteException;

    boolean isAppInactive(String str, int i5) throws RemoteException;

    boolean isAppPid(int i5) throws RemoteException;

    boolean isAppProcess(String str) throws RemoteException;

    boolean isAppRunning(String str, int i5, boolean z4) throws RemoteException;

    void killAllApps() throws RemoteException;

    void killAppByPkg(String str, int i5) throws RemoteException;

    void killApplicationProcess(String str, int i5) throws RemoteException;

    void notifyBadgerChange(BadgerInfo badgerInfo) throws RemoteException;

    void onActivityCreated(IBinder iBinder, IBinder iBinder2, int i5) throws RemoteException;

    boolean onActivityDestroyed(int i5, IBinder iBinder) throws RemoteException;

    void onActivityFinish(int i5, IBinder iBinder) throws RemoteException;

    void onActivityResumed(int i5, IBinder iBinder) throws RemoteException;

    void processRestarted(String str, String str2, int i5) throws RemoteException;

    void removeIntentSender(IBinder iBinder) throws RemoteException;

    void setAppInactive(String str, boolean z4, int i5) throws RemoteException;

    void setSettingsProvider(int i5, int i6, String str, String str2) throws RemoteException;

    int startActivities(Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle, String str, int i5) throws RemoteException;

    int startActivity(Intent intent, ActivityInfo activityInfo, IBinder iBinder, Bundle bundle, String str, int i5, String str2, int i6) throws RemoteException;

    int startActivityFromHistory(Intent intent) throws RemoteException;
}

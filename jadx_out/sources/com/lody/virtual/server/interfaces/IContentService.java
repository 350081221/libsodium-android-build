package com.lody.virtual.server.interfaces;

import android.accounts.Account;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncAdapterType;
import android.content.SyncInfo;
import android.content.SyncRequest;
import android.content.SyncStatusInfo;
import android.database.IContentObserver;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public interface IContentService extends IInterface {

    /* loaded from: classes3.dex */
    public static class Default implements IContentService {
        @Override // com.lody.virtual.server.interfaces.IContentService
        public void addPeriodicSync(Account account, String str, Bundle bundle, long j5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void cancelSync(Account account, String str) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public List<SyncInfo> getCurrentSyncs() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public int getIsSyncable(Account account, String str) throws RemoteException {
            return 0;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public boolean getMasterSyncAutomatically() throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public List<PeriodicSync> getPeriodicSyncs(Account account, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public SyncAdapterType[] getSyncAdapterTypes() throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public boolean getSyncAutomatically(Account account, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public SyncStatusInfo getSyncStatus(Account account, String str) throws RemoteException {
            return null;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public boolean isSyncActive(Account account, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public boolean isSyncPending(Account account, String str) throws RemoteException {
            return false;
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void removePeriodicSync(Account account, String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void requestSync(Account account, String str, Bundle bundle) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void setIsSyncable(Account account, String str, int i5) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void setMasterSyncAutomatically(boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void setSyncAutomatically(Account account, String str, boolean z4) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void sync(SyncRequest syncRequest) throws RemoteException {
        }

        @Override // com.lody.virtual.server.interfaces.IContentService
        public void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException {
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IContentService {
        private static final String DESCRIPTOR = "com.lody.virtual.server.interfaces.IContentService";
        static final int TRANSACTION_addPeriodicSync = 10;
        static final int TRANSACTION_addStatusChangeListener = 21;
        static final int TRANSACTION_cancelSync = 6;
        static final int TRANSACTION_getCurrentSyncs = 17;
        static final int TRANSACTION_getIsSyncable = 12;
        static final int TRANSACTION_getMasterSyncAutomatically = 15;
        static final int TRANSACTION_getPeriodicSyncs = 9;
        static final int TRANSACTION_getSyncAdapterTypes = 18;
        static final int TRANSACTION_getSyncAutomatically = 7;
        static final int TRANSACTION_getSyncStatus = 19;
        static final int TRANSACTION_isSyncActive = 16;
        static final int TRANSACTION_isSyncPending = 20;
        static final int TRANSACTION_notifyChange = 3;
        static final int TRANSACTION_registerContentObserver = 2;
        static final int TRANSACTION_removePeriodicSync = 11;
        static final int TRANSACTION_removeStatusChangeListener = 22;
        static final int TRANSACTION_requestSync = 4;
        static final int TRANSACTION_setIsSyncable = 13;
        static final int TRANSACTION_setMasterSyncAutomatically = 14;
        static final int TRANSACTION_setSyncAutomatically = 8;
        static final int TRANSACTION_sync = 5;
        static final int TRANSACTION_unregisterContentObserver = 1;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public static class Proxy implements IContentService {
            public static IContentService sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void addPeriodicSync(Account account, String str, Bundle bundle, long j5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeLong(j5);
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addPeriodicSync(account, str, bundle, j5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i5);
                    if (iSyncStatusObserver != null) {
                        iBinder = iSyncStatusObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().addStatusChangeListener(i5, iSyncStatusObserver);
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

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void cancelSync(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().cancelSync(account, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public List<SyncInfo> getCurrentSyncs() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentSyncs();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(SyncInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public int getIsSyncable(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getIsSyncable(account, str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public boolean getMasterSyncAutomatically() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = false;
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMasterSyncAutomatically();
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

            @Override // com.lody.virtual.server.interfaces.IContentService
            public List<PeriodicSync> getPeriodicSyncs(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPeriodicSyncs(account, str);
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(PeriodicSync.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public SyncAdapterType[] getSyncAdapterTypes() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSyncAdapterTypes();
                    }
                    obtain2.readException();
                    return (SyncAdapterType[]) obtain2.createTypedArray(SyncAdapterType.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public boolean getSyncAutomatically(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSyncAutomatically(account, str);
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

            @Override // com.lody.virtual.server.interfaces.IContentService
            public SyncStatusInfo getSyncStatus(Account account, String str) throws RemoteException {
                SyncStatusInfo syncStatusInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(19, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSyncStatus(account, str);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        syncStatusInfo = SyncStatusInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        syncStatusInfo = null;
                    }
                    return syncStatusInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public boolean isSyncActive(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSyncActive(account, str);
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

            @Override // com.lody.virtual.server.interfaces.IContentService
            public boolean isSyncPending(Account account, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z4 = true;
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isSyncPending(account, str);
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

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i5) throws RemoteException {
                IBinder iBinder;
                int i6;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i7 = 1;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (iContentObserver != null) {
                        iBinder = iContentObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (z4) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (!z5) {
                        i7 = 0;
                    }
                    obtain.writeInt(i7);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().notifyChange(uri, iContentObserver, z4, z5, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i5) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i6 = 1;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!z4) {
                        i6 = 0;
                    }
                    obtain.writeInt(i6);
                    if (iContentObserver != null) {
                        iBinder = iContentObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().registerContentObserver(uri, z4, iContentObserver, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void removePeriodicSync(Account account, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().removePeriodicSync(account, str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iSyncStatusObserver != null) {
                        iBinder = iSyncStatusObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().removeStatusChangeListener(iSyncStatusObserver);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void requestSync(Account account, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().requestSync(account, str, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void setIsSyncable(Account account, String str, int i5) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setIsSyncable(account, str, i5);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void setMasterSyncAutomatically(boolean z4) throws RemoteException {
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
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setMasterSyncAutomatically(z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void setSyncAutomatically(Account account, String str, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    int i5 = 1;
                    if (account != null) {
                        obtain.writeInt(1);
                        account.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    if (!z4) {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setSyncAutomatically(account, str, z4);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void sync(SyncRequest syncRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (syncRequest != null) {
                        obtain.writeInt(1);
                        syncRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().sync(syncRequest);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.lody.virtual.server.interfaces.IContentService
            public void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (iContentObserver != null) {
                        iBinder = iContentObserver.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().unregisterContentObserver(iContentObserver);
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

        public static IContentService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IContentService)) {
                return (IContentService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public static IContentService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IContentService iContentService) {
            if (Proxy.sDefaultImpl == null) {
                if (iContentService != null) {
                    Proxy.sDefaultImpl = iContentService;
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
            boolean z5;
            Account account;
            Account account2;
            Account account3;
            if (i5 != 1598968902) {
                boolean z6 = false;
                Uri uri = null;
                Account account4 = null;
                Account account5 = null;
                Account account6 = null;
                Account account7 = null;
                Account account8 = null;
                Bundle bundle = null;
                Bundle bundle2 = null;
                Account account9 = null;
                Account account10 = null;
                Account account11 = null;
                Account account12 = null;
                SyncRequest syncRequest = null;
                Bundle bundle3 = null;
                Uri uri2 = null;
                switch (i5) {
                    case 1:
                        parcel.enforceInterface(DESCRIPTOR);
                        unregisterContentObserver(IContentObserver.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        registerContentObserver(uri, z6, IContentObserver.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        }
                        Uri uri3 = uri2;
                        IContentObserver asInterface = IContentObserver.Stub.asInterface(parcel.readStrongBinder());
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        notifyChange(uri3, asInterface, z4, z5, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account = null;
                        }
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        requestSync(account, readString, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            syncRequest = (SyncRequest) SyncRequest.CREATOR.createFromParcel(parcel);
                        }
                        sync(syncRequest);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account12 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        cancelSync(account12, parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account11 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        boolean syncAutomatically = getSyncAutomatically(account11, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(syncAutomatically ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account10 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        setSyncAutomatically(account10, readString2, z6);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account9 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        List<PeriodicSync> periodicSyncs = getPeriodicSyncs(account9, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(periodicSyncs);
                        return true;
                    case 10:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account2 = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account2 = null;
                        }
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        addPeriodicSync(account2, readString3, bundle2, parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account3 = (Account) Account.CREATOR.createFromParcel(parcel);
                        } else {
                            account3 = null;
                        }
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        removePeriodicSync(account3, readString4, bundle);
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account8 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        int isSyncable = getIsSyncable(account8, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isSyncable);
                        return true;
                    case 13:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account7 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        setIsSyncable(account7, parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            z6 = true;
                        }
                        setMasterSyncAutomatically(z6);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(DESCRIPTOR);
                        boolean masterSyncAutomatically = getMasterSyncAutomatically();
                        parcel2.writeNoException();
                        parcel2.writeInt(masterSyncAutomatically ? 1 : 0);
                        return true;
                    case 16:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account6 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        boolean isSyncActive = isSyncActive(account6, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isSyncActive ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface(DESCRIPTOR);
                        List<SyncInfo> currentSyncs = getCurrentSyncs();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(currentSyncs);
                        return true;
                    case 18:
                        parcel.enforceInterface(DESCRIPTOR);
                        SyncAdapterType[] syncAdapterTypes = getSyncAdapterTypes();
                        parcel2.writeNoException();
                        parcel2.writeTypedArray(syncAdapterTypes, 1);
                        return true;
                    case 19:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account5 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        SyncStatusInfo syncStatus = getSyncStatus(account5, parcel.readString());
                        parcel2.writeNoException();
                        if (syncStatus != null) {
                            parcel2.writeInt(1);
                            syncStatus.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 20:
                        parcel.enforceInterface(DESCRIPTOR);
                        if (parcel.readInt() != 0) {
                            account4 = (Account) Account.CREATOR.createFromParcel(parcel);
                        }
                        boolean isSyncPending = isSyncPending(account4, parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isSyncPending ? 1 : 0);
                        return true;
                    case 21:
                        parcel.enforceInterface(DESCRIPTOR);
                        addStatusChangeListener(parcel.readInt(), ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(DESCRIPTOR);
                        removeStatusChangeListener(ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder()));
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

    void addPeriodicSync(Account account, String str, Bundle bundle, long j5) throws RemoteException;

    void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) throws RemoteException;

    void cancelSync(Account account, String str) throws RemoteException;

    List<SyncInfo> getCurrentSyncs() throws RemoteException;

    int getIsSyncable(Account account, String str) throws RemoteException;

    boolean getMasterSyncAutomatically() throws RemoteException;

    List<PeriodicSync> getPeriodicSyncs(Account account, String str) throws RemoteException;

    SyncAdapterType[] getSyncAdapterTypes() throws RemoteException;

    boolean getSyncAutomatically(Account account, String str) throws RemoteException;

    SyncStatusInfo getSyncStatus(Account account, String str) throws RemoteException;

    boolean isSyncActive(Account account, String str) throws RemoteException;

    boolean isSyncPending(Account account, String str) throws RemoteException;

    void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i5) throws RemoteException;

    void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i5) throws RemoteException;

    void removePeriodicSync(Account account, String str, Bundle bundle) throws RemoteException;

    void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) throws RemoteException;

    void requestSync(Account account, String str, Bundle bundle) throws RemoteException;

    void setIsSyncable(Account account, String str, int i5) throws RemoteException;

    void setMasterSyncAutomatically(boolean z4) throws RemoteException;

    void setSyncAutomatically(Account account, String str, boolean z4) throws RemoteException;

    void sync(SyncRequest syncRequest) throws RemoteException;

    void unregisterContentObserver(IContentObserver iContentObserver) throws RemoteException;
}

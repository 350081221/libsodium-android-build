package com.lody.virtual.server.content;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncAdapterType;
import android.content.SyncInfo;
import android.content.SyncRequest;
import android.content.SyncStatusInfo;
import android.database.IContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.os.VBinder;
import com.lody.virtual.os.VUserHandle;
import com.lody.virtual.server.interfaces.IContentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class VContentService extends IContentService.Stub {
    private static final String TAG = "ContentService";
    private static final VContentService sInstance = new VContentService();
    private final ObserverNode mRootNode = new ObserverNode("");
    private SyncManager mSyncManager = null;
    private final Object mSyncManagerLock = new Object();
    private Context mContext = VirtualCore.get().getContext();

    /* loaded from: classes3.dex */
    public static final class ObserverCall {
        final ObserverNode mNode;
        final IContentObserver mObserver;
        final boolean mSelfChange;

        ObserverCall(ObserverNode observerNode, IContentObserver iContentObserver, boolean z4) {
            this.mNode = observerNode;
            this.mObserver = iContentObserver;
            this.mSelfChange = z4;
        }
    }

    /* loaded from: classes3.dex */
    public static final class ObserverNode {
        public static final int DELETE_TYPE = 2;
        public static final int INSERT_TYPE = 0;
        public static final int UPDATE_TYPE = 1;
        private String mName;
        private ArrayList<ObserverNode> mChildren = new ArrayList<>();
        private ArrayList<ObserverEntry> mObservers = new ArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes3.dex */
        public class ObserverEntry implements IBinder.DeathRecipient {
            public final boolean notifyForDescendants;
            public final IContentObserver observer;
            private final Object observersLock;
            public final int pid;
            public final int uid;
            private final int userHandle;

            public ObserverEntry(IContentObserver iContentObserver, boolean z4, Object obj, int i5, int i6, int i7) {
                this.observersLock = obj;
                this.observer = iContentObserver;
                this.uid = i5;
                this.pid = i6;
                this.userHandle = i7;
                this.notifyForDescendants = z4;
                try {
                    iContentObserver.asBinder().linkToDeath(this, 0);
                } catch (RemoteException unused) {
                    binderDied();
                }
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                synchronized (this.observersLock) {
                    ObserverNode.this.removeObserverLocked(this.observer);
                }
            }
        }

        public ObserverNode(String str) {
            this.mName = str;
        }

        private void collectMyObserversLocked(boolean z4, IContentObserver iContentObserver, boolean z5, int i5, ArrayList<ObserverCall> arrayList) {
            IBinder asBinder;
            boolean z6;
            int size = this.mObservers.size();
            if (iContentObserver == null) {
                asBinder = null;
            } else {
                asBinder = iContentObserver.asBinder();
            }
            for (int i6 = 0; i6 < size; i6++) {
                ObserverEntry observerEntry = this.mObservers.get(i6);
                if (observerEntry.observer.asBinder() == asBinder) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((!z6 || z5) && ((i5 == -1 || observerEntry.userHandle == -1 || i5 == observerEntry.userHandle) && (z4 || observerEntry.notifyForDescendants))) {
                    arrayList.add(new ObserverCall(this, observerEntry.observer, z6));
                }
            }
        }

        private int countUriSegments(Uri uri) {
            if (uri == null) {
                return 0;
            }
            return uri.getPathSegments().size() + 1;
        }

        private String getUriSegment(Uri uri, int i5) {
            if (uri != null) {
                if (i5 == 0) {
                    return uri.getAuthority();
                }
                return uri.getPathSegments().get(i5 - 1);
            }
            return null;
        }

        public void addObserverLocked(Uri uri, IContentObserver iContentObserver, boolean z4, Object obj, int i5, int i6, int i7) {
            addObserverLocked(uri, 0, iContentObserver, z4, obj, i5, i6, i7);
        }

        public void collectObserversLocked(Uri uri, int i5, IContentObserver iContentObserver, boolean z4, int i6, ArrayList<ObserverCall> arrayList) {
            String str;
            if (i5 >= countUriSegments(uri)) {
                collectMyObserversLocked(true, iContentObserver, z4, i6, arrayList);
                str = null;
            } else {
                String uriSegment = getUriSegment(uri, i5);
                collectMyObserversLocked(false, iContentObserver, z4, i6, arrayList);
                str = uriSegment;
            }
            int size = this.mChildren.size();
            for (int i7 = 0; i7 < size; i7++) {
                ObserverNode observerNode = this.mChildren.get(i7);
                if (str == null || observerNode.mName.equals(str)) {
                    observerNode.collectObserversLocked(uri, i5 + 1, iContentObserver, z4, i6, arrayList);
                    if (str != null) {
                        return;
                    }
                }
            }
        }

        public boolean removeObserverLocked(IContentObserver iContentObserver) {
            int size = this.mChildren.size();
            int i5 = 0;
            while (i5 < size) {
                if (this.mChildren.get(i5).removeObserverLocked(iContentObserver)) {
                    this.mChildren.remove(i5);
                    i5--;
                    size--;
                }
                i5++;
            }
            IBinder asBinder = iContentObserver.asBinder();
            int size2 = this.mObservers.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    break;
                }
                ObserverEntry observerEntry = this.mObservers.get(i6);
                if (observerEntry.observer.asBinder() == asBinder) {
                    this.mObservers.remove(i6);
                    asBinder.unlinkToDeath(observerEntry, 0);
                    break;
                }
                i6++;
            }
            if (this.mChildren.size() != 0 || this.mObservers.size() != 0) {
                return false;
            }
            return true;
        }

        private void addObserverLocked(Uri uri, int i5, IContentObserver iContentObserver, boolean z4, Object obj, int i6, int i7, int i8) {
            if (i5 == countUriSegments(uri)) {
                this.mObservers.add(new ObserverEntry(iContentObserver, z4, obj, i6, i7, i8));
                return;
            }
            String uriSegment = getUriSegment(uri, i5);
            if (uriSegment != null) {
                int size = this.mChildren.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ObserverNode observerNode = this.mChildren.get(i9);
                    if (observerNode.mName.equals(uriSegment)) {
                        observerNode.addObserverLocked(uri, i5 + 1, iContentObserver, z4, obj, i6, i7, i8);
                        return;
                    }
                }
                ObserverNode observerNode2 = new ObserverNode(uriSegment);
                this.mChildren.add(observerNode2);
                observerNode2.addObserverLocked(uri, i5 + 1, iContentObserver, z4, obj, i6, i7, i8);
                return;
            }
            throw new IllegalArgumentException("Invalid Uri (" + uri + ") used for observer");
        }
    }

    private VContentService() {
    }

    public static VContentService get() {
        return sInstance;
    }

    private SyncManager getSyncManager() {
        SyncManager syncManager;
        synchronized (this.mSyncManagerLock) {
            try {
                if (this.mSyncManager == null) {
                    this.mSyncManager = new SyncManager(this.mContext);
                }
            } catch (SQLiteException e5) {
                Log.e(TAG, "Can't create SyncManager", e5);
            }
            syncManager = this.mSyncManager;
        }
        return syncManager;
    }

    public static void systemReady() {
        get().getSyncManager();
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void addPeriodicSync(Account account, String str, Bundle bundle, long j5) {
        if (account != null) {
            if (!TextUtils.isEmpty(str)) {
                int callingUserId = VUserHandle.getCallingUserId();
                if (j5 < 60) {
                    VLog.w(TAG, "Requested poll frequency of " + j5 + " seconds being rounded up to 60 seconds.", new Object[0]);
                    j5 = 60L;
                }
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    PeriodicSync periodicSync = new PeriodicSync(account, str, bundle, j5);
                    mirror.android.content.PeriodicSync.flexTime.set(periodicSync, SyncStorageEngine.calculateDefaultFlexTime(j5));
                    getSyncManager().getSyncStorageEngine().addPeriodicSync(periodicSync, callingUserId);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new IllegalArgumentException("Authority must not be empty.");
        }
        throw new IllegalArgumentException("Account must not be null");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null && iSyncStatusObserver != null) {
                syncManager.getSyncStorageEngine().addStatusChangeListener(i5, iSyncStatusObserver);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void cancelSync(Account account, String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("Authority must be non-empty");
        }
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                syncManager.clearScheduledSyncOperations(account, callingUserId, str);
                syncManager.cancelActiveSync(account, callingUserId, str);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public List<SyncInfo> getCurrentSyncs() {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            List<VSyncInfo> currentSyncsCopy = getSyncManager().getSyncStorageEngine().getCurrentSyncsCopy(callingUserId);
            ArrayList arrayList = new ArrayList(currentSyncsCopy.size());
            Iterator<VSyncInfo> it = currentSyncsCopy.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toSyncInfo());
            }
            return arrayList;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public int getIsSyncable(Account account, String str) {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                return syncManager.getIsSyncable(account, callingUserId, str);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return -1;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public boolean getMasterSyncAutomatically() {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                return syncManager.getSyncStorageEngine().getMasterSyncAutomatically(callingUserId);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return false;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public List<PeriodicSync> getPeriodicSyncs(Account account, String str) {
        if (account != null) {
            if (!TextUtils.isEmpty(str)) {
                int callingUserId = VUserHandle.getCallingUserId();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    return getSyncManager().getSyncStorageEngine().getPeriodicSyncs(account, callingUserId, str);
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new IllegalArgumentException("Authority must not be empty");
        }
        throw new IllegalArgumentException("Account must not be null");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public SyncAdapterType[] getSyncAdapterTypes() {
        VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return getSyncManager().getSyncAdapterTypes();
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public boolean getSyncAutomatically(Account account, String str) {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                return syncManager.getSyncStorageEngine().getSyncAutomatically(account, callingUserId, str);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return false;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public SyncStatusInfo getSyncStatus(Account account, String str) {
        if (!TextUtils.isEmpty(str)) {
            int callingUserId = VUserHandle.getCallingUserId();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SyncManager syncManager = getSyncManager();
                if (syncManager != null) {
                    return syncManager.getSyncStorageEngine().getStatusByAccountAndAuthority(account, callingUserId, str);
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return null;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("Authority must not be empty");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public boolean isSyncActive(Account account, String str) {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                return syncManager.getSyncStorageEngine().isSyncActive(account, callingUserId, str);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return false;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public boolean isSyncPending(Account account, String str) {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                return syncManager.getSyncStorageEngine().isSyncPending(account, callingUserId, str);
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return false;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5, int i5) {
        SyncManager syncManager;
        int i6 = 2;
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "Notifying update of " + uri + " for user " + i5 + " from observer " + iContentObserver + ", syncToNetwork " + z5);
        }
        int callingUid = VBinder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList<ObserverCall> arrayList = new ArrayList<>();
            try {
                synchronized (this.mRootNode) {
                    try {
                        this.mRootNode.collectObserversLocked(uri, 0, iContentObserver, z4, i5, arrayList);
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            ObserverCall observerCall = arrayList.get(i7);
                            try {
                                observerCall.mObserver.onChange(observerCall.mSelfChange, uri, i5);
                                if (Log.isLoggable(TAG, i6)) {
                                    Log.v(TAG, "Notified " + observerCall.mObserver + " of update at " + uri);
                                }
                            } catch (RemoteException unused) {
                                synchronized (this.mRootNode) {
                                    Log.w(TAG, "Found dead observer, removing");
                                    IBinder asBinder = observerCall.mObserver.asBinder();
                                    ArrayList arrayList2 = observerCall.mNode.mObservers;
                                    int size2 = arrayList2.size();
                                    int i8 = 0;
                                    while (i8 < size2) {
                                        if (((ObserverNode.ObserverEntry) arrayList2.get(i8)).observer.asBinder() == asBinder) {
                                            arrayList2.remove(i8);
                                            i8--;
                                            size2--;
                                        }
                                        i8++;
                                    }
                                }
                            }
                            i7++;
                            i6 = 2;
                        }
                        if (z5 && (syncManager = getSyncManager()) != null) {
                            syncManager.scheduleLocalSync(null, i5, callingUid, uri.getAuthority());
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService.Stub, android.os.Binder
    public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
        try {
            return super.onTransact(i5, parcel, parcel2, i6);
        } catch (RuntimeException e5) {
            if (!(e5 instanceof SecurityException)) {
                e5.printStackTrace();
            }
            throw e5;
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver, int i5) {
        if (iContentObserver != null && uri != null) {
            synchronized (this.mRootNode) {
                ObserverNode observerNode = this.mRootNode;
                observerNode.addObserverLocked(uri, iContentObserver, z4, observerNode, VBinder.getCallingUid(), VBinder.getCallingPid(), i5);
            }
            return;
        }
        throw new IllegalArgumentException("You must pass a valid uri and observer");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void removePeriodicSync(Account account, String str, Bundle bundle) {
        if (account != null) {
            if (!TextUtils.isEmpty(str)) {
                int callingUserId = VUserHandle.getCallingUserId();
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    getSyncManager().getSyncStorageEngine().removePeriodicSync(new PeriodicSync(account, str, bundle, 0L), callingUserId);
                    return;
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            throw new IllegalArgumentException("Authority must not be empty");
        }
        throw new IllegalArgumentException("Account must not be null");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null && iSyncStatusObserver != null) {
                syncManager.getSyncStorageEngine().removeStatusChangeListener(iSyncStatusObserver);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void requestSync(Account account, String str, Bundle bundle) {
        ContentResolver.validateSyncExtrasBundle(bundle);
        int callingUserId = VUserHandle.getCallingUserId();
        int callingUid = VBinder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                syncManager.scheduleSync(account, callingUserId, callingUid, str, bundle, 0L, 0L, false);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void setIsSyncable(Account account, String str, int i5) {
        if (!TextUtils.isEmpty(str)) {
            int callingUserId = VUserHandle.getCallingUserId();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SyncManager syncManager = getSyncManager();
                if (syncManager != null) {
                    syncManager.getSyncStorageEngine().setIsSyncable(account, callingUserId, str, i5);
                }
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("Authority must not be empty");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void setMasterSyncAutomatically(boolean z4) {
        int callingUserId = VUserHandle.getCallingUserId();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                syncManager.getSyncStorageEngine().setMasterSyncAutomatically(z4, callingUserId);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void setSyncAutomatically(Account account, String str, boolean z4) {
        if (!TextUtils.isEmpty(str)) {
            int callingUserId = VUserHandle.getCallingUserId();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SyncManager syncManager = getSyncManager();
                if (syncManager != null) {
                    syncManager.getSyncStorageEngine().setSyncAutomatically(account, callingUserId, str, z4);
                }
                return;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        throw new IllegalArgumentException("Authority must be non-empty");
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void sync(SyncRequest syncRequest) {
        Bundle bundle = mirror.android.content.SyncRequest.mExtras.get(syncRequest);
        long j5 = mirror.android.content.SyncRequest.mSyncFlexTimeSecs.get(syncRequest);
        long j6 = mirror.android.content.SyncRequest.mSyncRunTimeSecs.get(syncRequest);
        int callingUserId = VUserHandle.getCallingUserId();
        int callingUid = VBinder.getCallingUid();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            SyncManager syncManager = getSyncManager();
            if (syncManager != null) {
                Account account = mirror.android.content.SyncRequest.mAccountToSync.get(syncRequest);
                String str = mirror.android.content.SyncRequest.mAuthority.get(syncRequest);
                if (mirror.android.content.SyncRequest.mIsPeriodic.get(syncRequest)) {
                    long j7 = 60;
                    if (j6 < 60) {
                        VLog.w(TAG, "Requested poll frequency of " + j6 + " seconds being rounded up to 60 seconds.", new Object[0]);
                    } else {
                        j7 = j6;
                    }
                    PeriodicSync periodicSync = new PeriodicSync(account, str, bundle, j7);
                    mirror.android.content.PeriodicSync.flexTime.set(periodicSync, j5);
                    getSyncManager().getSyncStorageEngine().addPeriodicSync(periodicSync, callingUserId);
                } else {
                    syncManager.scheduleSync(account, callingUserId, callingUid, str, bundle, j5 * 1000, 1000 * j6, false);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // com.lody.virtual.server.interfaces.IContentService
    public void unregisterContentObserver(IContentObserver iContentObserver) {
        if (iContentObserver != null) {
            synchronized (this.mRootNode) {
                this.mRootNode.removeObserverLocked(iContentObserver);
            }
            return;
        }
        throw new IllegalArgumentException("You must pass a valid observer");
    }

    public void registerContentObserver(Uri uri, boolean z4, IContentObserver iContentObserver) {
        registerContentObserver(uri, z4, iContentObserver, VUserHandle.getCallingUserId());
    }

    public void notifyChange(Uri uri, IContentObserver iContentObserver, boolean z4, boolean z5) {
        notifyChange(uri, iContentObserver, z4, z5, VUserHandle.getCallingUserId());
    }
}

package com.lody.virtual.server.content;

import android.accounts.Account;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.lody.virtual.server.content.SyncAdaptersCache;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class SyncQueue {
    private static final String TAG = "SyncManager";
    private final HashMap<String, SyncOperation> mOperationsMap = new HashMap<>();
    private final SyncAdaptersCache mSyncAdapters;
    private final SyncStorageEngine mSyncStorageEngine;

    public SyncQueue(SyncStorageEngine syncStorageEngine, SyncAdaptersCache syncAdaptersCache) {
        this.mSyncStorageEngine = syncStorageEngine;
        this.mSyncAdapters = syncAdaptersCache;
    }

    public boolean add(SyncOperation syncOperation) {
        return add(syncOperation, null);
    }

    public void addPendingOperations(int i5) {
        long j5;
        Iterator<SyncStorageEngine.PendingOperation> it = this.mSyncStorageEngine.getPendingOperations().iterator();
        while (it.hasNext()) {
            SyncStorageEngine.PendingOperation next = it.next();
            int i6 = next.userId;
            if (i6 == i5) {
                Pair<Long, Long> backoff = this.mSyncStorageEngine.getBackoff(next.account, i6, next.authority);
                SyncAdaptersCache.SyncAdapterInfo serviceInfo = this.mSyncAdapters.getServiceInfo(next.account, next.authority);
                if (serviceInfo == null) {
                    Log.w(TAG, "Missing sync adapter info for authority " + next.authority + ", userId " + next.userId);
                } else {
                    Account account = next.account;
                    int i7 = next.userId;
                    int i8 = next.reason;
                    int i9 = next.syncSource;
                    String str = next.authority;
                    Bundle bundle = next.extras;
                    if (backoff != null) {
                        j5 = ((Long) backoff.first).longValue();
                    } else {
                        j5 = 0;
                    }
                    SyncOperation syncOperation = new SyncOperation(account, i7, i8, i9, str, bundle, 0L, 0L, j5, this.mSyncStorageEngine.getDelayUntilTime(next.account, next.userId, next.authority), serviceInfo.type.allowParallelSyncs());
                    syncOperation.expedited = next.expedited;
                    syncOperation.pendingOperation = next;
                    add(syncOperation, next);
                }
            }
        }
    }

    public Collection<SyncOperation> getOperations() {
        return this.mOperationsMap.values();
    }

    public void onBackoffChanged(Account account, int i5, String str, long j5) {
        for (SyncOperation syncOperation : this.mOperationsMap.values()) {
            if (syncOperation.account.equals(account) && syncOperation.authority.equals(str) && syncOperation.userId == i5) {
                syncOperation.backoff = Long.valueOf(j5);
                syncOperation.updateEffectiveRunTime();
            }
        }
    }

    public void onDelayUntilTimeChanged(Account account, String str, long j5) {
        for (SyncOperation syncOperation : this.mOperationsMap.values()) {
            if (syncOperation.account.equals(account) && syncOperation.authority.equals(str)) {
                syncOperation.delayUntil = j5;
                syncOperation.updateEffectiveRunTime();
            }
        }
    }

    public void remove(SyncOperation syncOperation) {
        SyncOperation remove = this.mOperationsMap.remove(syncOperation.key);
        if (remove == null || this.mSyncStorageEngine.deleteFromPending(remove.pendingOperation)) {
            return;
        }
        String str = "unable to find pending row for " + remove;
        Log.e(TAG, str, new IllegalStateException(str));
    }

    public void removeUser(int i5) {
        ArrayList arrayList = new ArrayList();
        for (SyncOperation syncOperation : this.mOperationsMap.values()) {
            if (syncOperation.userId == i5) {
                arrayList.add(syncOperation);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            remove((SyncOperation) it.next());
        }
    }

    private boolean add(SyncOperation syncOperation, SyncStorageEngine.PendingOperation pendingOperation) {
        String str = syncOperation.key;
        SyncOperation syncOperation2 = this.mOperationsMap.get(str);
        if (syncOperation2 != null) {
            if (syncOperation.compareTo(syncOperation2) > 0) {
                return false;
            }
            syncOperation2.expedited = syncOperation.expedited;
            syncOperation2.latestRunTime = Math.min(syncOperation2.latestRunTime, syncOperation.latestRunTime);
            syncOperation2.flexTime = syncOperation.flexTime;
            return true;
        }
        syncOperation.pendingOperation = pendingOperation;
        if (pendingOperation == null) {
            SyncStorageEngine.PendingOperation insertIntoPending = this.mSyncStorageEngine.insertIntoPending(new SyncStorageEngine.PendingOperation(syncOperation.account, syncOperation.userId, syncOperation.reason, syncOperation.syncSource, syncOperation.authority, syncOperation.extras, syncOperation.expedited));
            if (insertIntoPending != null) {
                syncOperation.pendingOperation = insertIntoPending;
            } else {
                throw new IllegalStateException("error adding pending sync operation " + syncOperation);
            }
        }
        this.mOperationsMap.put(str, syncOperation);
        return true;
    }

    public void remove(Account account, int i5, String str) {
        Iterator<Map.Entry<String, SyncOperation>> it = this.mOperationsMap.entrySet().iterator();
        while (it.hasNext()) {
            SyncOperation value = it.next().getValue();
            if (account == null || value.account.equals(account)) {
                if (str == null || value.authority.equals(str)) {
                    if (i5 == value.userId) {
                        it.remove();
                        if (!this.mSyncStorageEngine.deleteFromPending(value.pendingOperation)) {
                            String str2 = "unable to find pending row for " + value;
                            Log.e(TAG, str2, new IllegalStateException(str2));
                        }
                    }
                }
            }
        }
    }
}

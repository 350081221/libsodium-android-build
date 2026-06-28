package com.lody.virtual.server.content;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ISyncAdapter;
import android.content.ISyncContext;
import android.content.ISyncStatusObserver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.PeriodicSync;
import android.content.ServiceConnection;
import android.content.SyncAdapterType;
import android.content.SyncResult;
import android.content.SyncStats;
import android.content.SyncStatusInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.compat.ContentResolverCompat;
import com.lody.virtual.os.BackgroundThread;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.lody.virtual.server.accounts.AccountAndUser;
import com.lody.virtual.server.accounts.VAccountManagerService;
import com.lody.virtual.server.content.SyncAdaptersCache;
import com.lody.virtual.server.content.SyncStorageEngine;
import com.tendcloud.tenddata.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class SyncManager {
    private static final String ACTION_SYNC_ALARM = "android.content.syncmanager.SYNC_ALARM";
    private static final long DEFAULT_MAX_SYNC_RETRY_TIME_IN_SECONDS = 3600;
    private static final int DELAY_RETRY_SYNC_IN_PROGRESS_IN_SECONDS = 10;
    private static final String HANDLE_SYNC_ALARM_WAKE_LOCK = "SyncManagerHandleSyncAlarm";
    private static final int INITIALIZATION_UNBIND_DELAY_MS = 5000;
    private static final AccountAndUser[] INITIAL_ACCOUNTS_ARRAY = new AccountAndUser[0];
    private static final long INITIAL_SYNC_RETRY_TIME_IN_MS = 30000;
    private static final long LOCAL_SYNC_DELAY = 30000;
    private static final int MAX_SIMULTANEOUS_INITIALIZATION_SYNCS = 5;
    private static final int MAX_SIMULTANEOUS_REGULAR_SYNCS = 2;
    private static final long MAX_TIME_PER_SYNC = 300000;
    private static final long SYNC_ALARM_TIMEOUT_MAX = 7200000;
    private static final long SYNC_ALARM_TIMEOUT_MIN = 30000;
    private static final String SYNC_LOOP_WAKE_LOCK = "SyncLoopWakeLock";
    private static final long SYNC_NOTIFICATION_DELAY = 30000;
    private static final String SYNC_WAKE_LOCK_PREFIX = "*sync*";
    private static final String TAG = "SyncManager";
    private ConnectivityManager mConnManagerDoNotUseDirectly;
    private Context mContext;
    private final PowerManager mPowerManager;
    protected SyncAdaptersCache mSyncAdapters;
    private final PendingIntent mSyncAlarmIntent;
    private final SyncHandler mSyncHandler;
    private final SyncQueue mSyncQueue;
    private int mSyncRandomOffsetMillis;
    private SyncStorageEngine mSyncStorageEngine;
    private final VUserManager mUserManager;
    private volatile AccountAndUser[] mRunningAccounts = INITIAL_ACCOUNTS_ARRAY;
    private volatile boolean mDataConnectionIsConnected = false;
    private volatile boolean mStorageIsLow = false;
    private AlarmManager mAlarmService = null;
    protected final ArrayList<ActiveSyncContext> mActiveSyncContexts = new ArrayList<>();
    private BroadcastReceiver mStorageIntentReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.DEVICE_STORAGE_LOW".equals(action)) {
                Log.v(SyncManager.TAG, "Internal storage is low.");
                SyncManager.this.mStorageIsLow = true;
                SyncManager.this.cancelActiveSync(null, -1, null);
            } else if ("android.intent.action.DEVICE_STORAGE_OK".equals(action)) {
                Log.v(SyncManager.TAG, "Internal storage is ok.");
                SyncManager.this.mStorageIsLow = false;
                SyncManager.this.sendCheckAlarmsMessage();
            }
        }
    };
    private BroadcastReceiver mBootCompletedReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncManager.this.mSyncHandler.onBootCompleted();
        }
    };
    private BroadcastReceiver mBackgroundDataSettingChanged = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (SyncManager.this.getConnectivityManager().getBackgroundDataSetting()) {
                SyncManager.this.scheduleSync(null, -1, -1, null, new Bundle(), 0L, 0L, false);
            }
        }
    };
    private BroadcastReceiver mAccountsUpdatedReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncManager.this.updateRunningAccounts();
            SyncManager.this.scheduleSync(null, -1, -2, null, null, 0L, 0L, false);
        }
    };
    private BroadcastReceiver mConnectivityIntentReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z4 = SyncManager.this.mDataConnectionIsConnected;
            SyncManager syncManager = SyncManager.this;
            syncManager.mDataConnectionIsConnected = syncManager.readDataConnectionState();
            if (SyncManager.this.mDataConnectionIsConnected) {
                if (!z4) {
                    Log.v(SyncManager.TAG, "Reconnection detected: clearing all backoffs");
                    synchronized (SyncManager.this.mSyncQueue) {
                        SyncManager.this.mSyncStorageEngine.clearAllBackoffsLocked(SyncManager.this.mSyncQueue);
                    }
                }
                SyncManager.this.sendCheckAlarmsMessage();
            }
        }
    };
    private BroadcastReceiver mShutdownIntentReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.6
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.w(SyncManager.TAG, "Writing sync state before shutdown...");
            SyncManager.this.getSyncStorageEngine().writeAllState();
        }
    };
    private BroadcastReceiver mUserIntentReceiver = new BroadcastReceiver() { // from class: com.lody.virtual.server.content.SyncManager.7
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra(Constants.EXTRA_USER_HANDLE, -10000);
            if (intExtra == -10000) {
                return;
            }
            if (Constants.ACTION_USER_REMOVED.equals(action)) {
                SyncManager.this.onUserRemoved(intExtra);
            } else if (Constants.ACTION_USER_ADDED.equals(action)) {
                SyncManager.this.onUserStarting(intExtra);
            } else if (Constants.ACTION_USER_REMOVED.equals(action)) {
                SyncManager.this.onUserStopping(intExtra);
            }
        }
    };
    private volatile boolean mBootCompleted = false;

    /* loaded from: classes3.dex */
    class ServiceConnectionData {
        public final ActiveSyncContext activeSyncContext;
        public final ISyncAdapter syncAdapter;

        ServiceConnectionData(ActiveSyncContext activeSyncContext, ISyncAdapter iSyncAdapter) {
            this.activeSyncContext = activeSyncContext;
            this.syncAdapter = iSyncAdapter;
        }
    }

    /* loaded from: classes3.dex */
    class SyncAlarmIntentReceiver extends BroadcastReceiver {
        SyncAlarmIntentReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncManager.this.sendSyncAlarmMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class SyncHandler extends Handler {
        private static final int MESSAGE_CANCEL = 6;
        private static final int MESSAGE_CHECK_ALARMS = 3;
        private static final int MESSAGE_SERVICE_CONNECTED = 4;
        private static final int MESSAGE_SERVICE_DISCONNECTED = 5;
        private static final int MESSAGE_SYNC_ALARM = 2;
        private static final int MESSAGE_SYNC_FINISHED = 1;
        private Long mAlarmScheduleTime;
        private List<Message> mBootQueue;
        public final SyncNotificationInfo mSyncNotificationInfo;
        public final SyncTimeTracker mSyncTimeTracker;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class SyncNotificationInfo {
            public boolean isActive = false;
            public Long startTime = null;

            SyncNotificationInfo() {
            }

            public void toString(StringBuilder sb) {
                sb.append("isActive ");
                sb.append(this.isActive);
                sb.append(", startTime ");
                sb.append(this.startTime);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                toString(sb);
                return sb.toString();
            }
        }

        public SyncHandler(Looper looper) {
            super(looper);
            this.mSyncNotificationInfo = new SyncNotificationInfo();
            this.mAlarmScheduleTime = null;
            this.mSyncTimeTracker = new SyncTimeTracker();
            this.mBootQueue = new ArrayList();
        }

        private void cancelActiveSyncLocked(Account account, int i5, String str) {
            Iterator it = new ArrayList(SyncManager.this.mActiveSyncContexts).iterator();
            while (it.hasNext()) {
                ActiveSyncContext activeSyncContext = (ActiveSyncContext) it.next();
                if (activeSyncContext != null && (account == null || account.equals(activeSyncContext.mSyncOperation.account))) {
                    if (str == null || str.equals(activeSyncContext.mSyncOperation.authority)) {
                        if (i5 == -1 || i5 == activeSyncContext.mSyncOperation.userId) {
                            runSyncFinishedOrCanceledLocked(null, activeSyncContext);
                        }
                    }
                }
            }
        }

        private void closeActiveSyncContext(ActiveSyncContext activeSyncContext) {
            activeSyncContext.close();
            SyncManager.this.mActiveSyncContexts.remove(activeSyncContext);
            SyncManager.this.mSyncStorageEngine.removeActiveSync(activeSyncContext.mSyncInfo, activeSyncContext.mSyncOperation.userId);
        }

        private boolean dispatchSyncOperation(SyncOperation syncOperation) {
            Log.v(SyncManager.TAG, "dispatchSyncOperation: we are going to sync " + syncOperation);
            Log.v(SyncManager.TAG, "num active syncs: " + SyncManager.this.mActiveSyncContexts.size());
            Iterator<ActiveSyncContext> it = SyncManager.this.mActiveSyncContexts.iterator();
            while (it.hasNext()) {
                Log.v(SyncManager.TAG, it.next().toString());
            }
            SyncAdaptersCache.SyncAdapterInfo serviceInfo = SyncManager.this.mSyncAdapters.getServiceInfo(syncOperation.account, syncOperation.authority);
            if (serviceInfo == null) {
                Log.d(SyncManager.TAG, "can't find a sync adapter for " + syncOperation.authority + ", removing settings for it");
                SyncManager.this.mSyncStorageEngine.removeAuthority(syncOperation.account, syncOperation.userId, syncOperation.authority);
                return false;
            }
            ActiveSyncContext activeSyncContext = new ActiveSyncContext(syncOperation, insertStartSyncEvent(syncOperation));
            activeSyncContext.mSyncInfo = SyncManager.this.mSyncStorageEngine.addActiveSync(activeSyncContext);
            SyncManager.this.mActiveSyncContexts.add(activeSyncContext);
            Log.v(SyncManager.TAG, "dispatchSyncOperation: starting " + activeSyncContext);
            if (!activeSyncContext.bindToSyncAdapter(serviceInfo, syncOperation.userId)) {
                Log.e(SyncManager.TAG, "Bind attempt failed to " + serviceInfo);
                closeActiveSyncContext(activeSyncContext);
                return false;
            }
            return true;
        }

        private void manageSyncAlarmLocked(long j5, long j6) {
            long j7;
            boolean z4;
            boolean z5;
            if (!SyncManager.this.mDataConnectionIsConnected || SyncManager.this.mStorageIsLow) {
                return;
            }
            if (!SyncManager.this.mSyncHandler.mSyncNotificationInfo.isActive && SyncManager.this.mSyncHandler.mSyncNotificationInfo.startTime != null) {
                j7 = SyncManager.this.mSyncHandler.mSyncNotificationInfo.startTime.longValue() + SyncManager.SYNC_NOTIFICATION_DELAY;
            } else {
                j7 = Long.MAX_VALUE;
            }
            Iterator<ActiveSyncContext> it = SyncManager.this.mActiveSyncContexts.iterator();
            long j8 = Long.MAX_VALUE;
            while (it.hasNext()) {
                long j9 = it.next().mTimeoutStartTime + SyncManager.MAX_TIME_PER_SYNC;
                Log.v(SyncManager.TAG, "manageSyncAlarm: active sync, mTimeoutStartTime + MAX is " + j9);
                if (j8 > j9) {
                    j8 = j9;
                }
            }
            Log.v(SyncManager.TAG, "manageSyncAlarm: notificationTime is " + j7);
            Log.v(SyncManager.TAG, "manageSyncAlarm: earliestTimeoutTime is " + j8);
            Log.v(SyncManager.TAG, "manageSyncAlarm: nextPeriodicEventElapsedTime is " + j5);
            Log.v(SyncManager.TAG, "manageSyncAlarm: nextPendingEventElapsedTime is " + j6);
            long min = Math.min(Math.min(Math.min(j7, j8), j5), j6);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = ab.aa + elapsedRealtime;
            if (min < j10) {
                Log.v(SyncManager.TAG, "manageSyncAlarm: the alarmTime is too small, " + min + ", setting to " + j10);
                min = j10;
            } else {
                long j11 = SyncManager.SYNC_ALARM_TIMEOUT_MAX + elapsedRealtime;
                if (min > j11) {
                    Log.v(SyncManager.TAG, "manageSyncAlarm: the alarmTime is too large, " + min + ", setting to " + j10);
                    min = j11;
                }
            }
            Long l5 = this.mAlarmScheduleTime;
            boolean z6 = true;
            boolean z7 = false;
            if (l5 != null && elapsedRealtime < l5.longValue()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (min != Long.MAX_VALUE) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (z4 && min >= this.mAlarmScheduleTime.longValue()) {
                    z6 = false;
                }
            } else {
                z6 = false;
                z7 = z4;
            }
            SyncManager.this.ensureAlarmService();
            if (z6) {
                Log.v(SyncManager.TAG, "requesting that the alarm manager wake us up at elapsed time " + min + ", now is " + elapsedRealtime + ", " + ((min - elapsedRealtime) / 1000) + " secs from now");
                this.mAlarmScheduleTime = Long.valueOf(min);
                SyncManager.this.mAlarmService.setExact(2, min, SyncManager.this.mSyncAlarmIntent);
                return;
            }
            if (z7) {
                this.mAlarmScheduleTime = null;
                SyncManager.this.mAlarmService.cancel(SyncManager.this.mSyncAlarmIntent);
            }
        }

        private void manageSyncNotificationLocked() {
            boolean z4;
            boolean z5;
            boolean z6;
            if (SyncManager.this.mActiveSyncContexts.isEmpty()) {
                SyncNotificationInfo syncNotificationInfo = this.mSyncNotificationInfo;
                syncNotificationInfo.startTime = null;
                z6 = syncNotificationInfo.isActive;
                z5 = false;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                SyncNotificationInfo syncNotificationInfo2 = this.mSyncNotificationInfo;
                if (syncNotificationInfo2.startTime == null) {
                    syncNotificationInfo2.startTime = Long.valueOf(elapsedRealtime);
                }
                SyncNotificationInfo syncNotificationInfo3 = this.mSyncNotificationInfo;
                if (!syncNotificationInfo3.isActive) {
                    if (elapsedRealtime > syncNotificationInfo3.startTime.longValue() + SyncManager.SYNC_NOTIFICATION_DELAY) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        Iterator<ActiveSyncContext> it = SyncManager.this.mActiveSyncContexts.iterator();
                        while (it.hasNext()) {
                            if (it.next().mSyncOperation.extras.getBoolean(TTDownloadField.TT_FORCE, false)) {
                            }
                        }
                    }
                    z5 = true;
                    z6 = false;
                    break;
                }
                z6 = false;
                z5 = false;
            }
            if (z6 && !z5) {
                sendSyncStateIntent();
                this.mSyncNotificationInfo.isActive = false;
            }
            if (z5) {
                sendSyncStateIntent();
                this.mSyncNotificationInfo.isActive = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
        
            if (r2.mStartTime > r3.mStartTime) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0332  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0340  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private long maybeStartNextSyncLocked() {
            /*
                Method dump skipped, instructions count: 873
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncManager.SyncHandler.maybeStartNextSyncLocked():long");
        }

        private void runBoundToSyncAdapter(ActiveSyncContext activeSyncContext, ISyncAdapter iSyncAdapter) {
            activeSyncContext.mSyncAdapter = iSyncAdapter;
            SyncOperation syncOperation = activeSyncContext.mSyncOperation;
            try {
                activeSyncContext.mIsLinkedToDeath = true;
                iSyncAdapter.asBinder().linkToDeath(activeSyncContext, 0);
                iSyncAdapter.startSync(activeSyncContext, syncOperation.authority, syncOperation.account, syncOperation.extras);
            } catch (RemoteException e5) {
                Log.d(SyncManager.TAG, "maybeStartNextSync: caught a RemoteException, rescheduling", e5);
                closeActiveSyncContext(activeSyncContext);
                SyncManager.this.increaseBackoffSetting(syncOperation);
                SyncManager.this.scheduleSyncOperation(new SyncOperation(syncOperation));
            } catch (RuntimeException e6) {
                closeActiveSyncContext(activeSyncContext);
                Log.e(SyncManager.TAG, "Caught RuntimeException while starting the sync " + syncOperation, e6);
            }
        }

        private void runSyncFinishedOrCanceledLocked(SyncResult syncResult, ActiveSyncContext activeSyncContext) {
            String str;
            if (activeSyncContext.mIsLinkedToDeath) {
                activeSyncContext.mSyncAdapter.asBinder().unlinkToDeath(activeSyncContext, 0);
                activeSyncContext.mIsLinkedToDeath = false;
            }
            closeActiveSyncContext(activeSyncContext);
            SyncOperation syncOperation = activeSyncContext.mSyncOperation;
            long elapsedRealtime = SystemClock.elapsedRealtime() - activeSyncContext.mStartTime;
            if (syncResult != null) {
                Log.v(SyncManager.TAG, "runSyncFinishedOrCanceled [finished]: " + syncOperation + ", result " + syncResult);
                if (!syncResult.hasError()) {
                    SyncManager.this.clearBackoffSetting(syncOperation);
                    str = SyncStorageEngine.MESG_SUCCESS;
                } else {
                    Log.d(SyncManager.TAG, "failed sync operation " + syncOperation + ", " + syncResult);
                    if (!syncResult.syncAlreadyInProgress) {
                        SyncManager.this.increaseBackoffSetting(syncOperation);
                    }
                    SyncManager.this.maybeRescheduleSync(syncResult, syncOperation);
                    str = ContentResolverCompat.syncErrorToString(syncResultToErrorNumber(syncResult));
                }
                SyncManager.this.setDelayUntilTime(syncOperation, syncResult.delayUntil);
            } else {
                Log.v(SyncManager.TAG, "runSyncFinishedOrCanceled [canceled]: " + syncOperation);
                ISyncAdapter iSyncAdapter = activeSyncContext.mSyncAdapter;
                if (iSyncAdapter != null) {
                    try {
                        iSyncAdapter.cancelSync(activeSyncContext);
                    } catch (RemoteException unused) {
                    }
                }
                str = SyncStorageEngine.MESG_CANCELED;
            }
            stopSyncEvent(activeSyncContext.mHistoryRowId, syncOperation, str, 0, 0, elapsedRealtime);
            if (syncResult != null && syncResult.fullSyncRequested) {
                SyncManager.this.scheduleSyncOperation(new SyncOperation(syncOperation.account, syncOperation.userId, syncOperation.reason, syncOperation.syncSource, syncOperation.authority, new Bundle(), 0L, 0L, syncOperation.backoff.longValue(), syncOperation.delayUntil, syncOperation.allowParallelSyncs));
            }
        }

        private long scheduleReadyPeriodicSyncs() {
            long j5;
            long j6;
            AccountAndUser[] accountAndUserArr;
            String str;
            long j7;
            long j8;
            Iterator<Pair<SyncStorageEngine.AuthorityInfo, SyncStatusInfo>> it;
            long j9;
            AccountAndUser[] accountAndUserArr2;
            SyncStatusInfo syncStatusInfo;
            long j10;
            int i5;
            boolean z4;
            String str2;
            long j11;
            long j12;
            int i6;
            long j13;
            long j14;
            long j15;
            SyncHandler syncHandler = this;
            String str3 = SyncManager.TAG;
            Log.v(SyncManager.TAG, "scheduleReadyPeriodicSyncs");
            long j16 = Long.MAX_VALUE;
            if (!SyncManager.this.getConnectivityManager().getBackgroundDataSetting()) {
                return Long.MAX_VALUE;
            }
            AccountAndUser[] accountAndUserArr3 = SyncManager.this.mRunningAccounts;
            long currentTimeMillis = System.currentTimeMillis();
            long j17 = 0;
            if (0 < currentTimeMillis - SyncManager.this.mSyncRandomOffsetMillis) {
                j5 = currentTimeMillis - SyncManager.this.mSyncRandomOffsetMillis;
            } else {
                j5 = 0;
            }
            Iterator<Pair<SyncStorageEngine.AuthorityInfo, SyncStatusInfo>> it2 = SyncManager.this.mSyncStorageEngine.getCopyOfAllAuthoritiesWithSyncStatus().iterator();
            long j18 = Long.MAX_VALUE;
            while (it2.hasNext()) {
                Pair<SyncStorageEngine.AuthorityInfo, SyncStatusInfo> next = it2.next();
                SyncStorageEngine.AuthorityInfo authorityInfo = (SyncStorageEngine.AuthorityInfo) next.first;
                SyncStatusInfo syncStatusInfo2 = (SyncStatusInfo) next.second;
                if (TextUtils.isEmpty(authorityInfo.authority)) {
                    Log.e(str3, "Got an empty provider string. Skipping: " + authorityInfo);
                    accountAndUserArr = accountAndUserArr3;
                    str = str3;
                    j7 = currentTimeMillis;
                    j8 = j5;
                    j9 = j17;
                    it = it2;
                } else if (SyncManager.this.containsAccountAndUser(accountAndUserArr3, authorityInfo.account, authorityInfo.userId) && SyncManager.this.mSyncStorageEngine.getMasterSyncAutomatically(authorityInfo.userId) && SyncManager.this.mSyncStorageEngine.getSyncAutomatically(authorityInfo.account, authorityInfo.userId, authorityInfo.authority) && SyncManager.this.getIsSyncable(authorityInfo.account, authorityInfo.userId, authorityInfo.authority) != 0) {
                    int size = authorityInfo.periodicSyncs.size();
                    int i7 = 0;
                    while (i7 < size) {
                        PeriodicSync periodicSync = authorityInfo.periodicSyncs.get(i7);
                        Bundle bundle = periodicSync.extras;
                        Iterator<Pair<SyncStorageEngine.AuthorityInfo, SyncStatusInfo>> it3 = it2;
                        long j19 = j18;
                        long j20 = periodicSync.period * 1000;
                        long j21 = mirror.android.content.PeriodicSync.flexTime.get(periodicSync);
                        int i8 = size;
                        long j22 = j21 * 1000;
                        if (j20 <= 0) {
                            accountAndUserArr2 = accountAndUserArr3;
                            str2 = str3;
                            j12 = currentTimeMillis;
                            j11 = j5;
                            i6 = i7;
                            i5 = i8;
                            syncStatusInfo = syncStatusInfo2;
                        } else {
                            accountAndUserArr2 = accountAndUserArr3;
                            long periodicSyncTime = syncStatusInfo2.getPeriodicSyncTime(i7);
                            syncStatusInfo = syncStatusInfo2;
                            long j23 = j20 - (j5 % j20);
                            long j24 = j5;
                            long j25 = currentTimeMillis - periodicSyncTime;
                            if (j23 <= j22 && j25 > j20 - j22) {
                                j10 = currentTimeMillis;
                                i5 = i8;
                                z4 = true;
                            } else {
                                j10 = currentTimeMillis;
                                i5 = i8;
                                z4 = false;
                            }
                            Log.v(str3, "sync: " + i7 + " for " + authorityInfo.authority + ". period: " + j20 + " flex: " + j22 + " remaining: " + j23 + " time_since_last: " + j25 + " last poll absol: " + periodicSyncTime + " shifted now: " + j24 + " run_early: " + z4);
                            if (!z4 && j23 != j20 && periodicSyncTime <= j10 && j25 < j20) {
                                str2 = str3;
                                j11 = j24;
                                i6 = i7;
                                j12 = j10;
                                j14 = j23;
                            } else {
                                Pair<Long, Long> backoff = SyncManager.this.mSyncStorageEngine.getBackoff(authorityInfo.account, authorityInfo.userId, authorityInfo.authority);
                                SyncAdaptersCache.SyncAdapterInfo serviceInfo = SyncManager.this.mSyncAdapters.getServiceInfo(authorityInfo.account, authorityInfo.authority);
                                if (serviceInfo == null) {
                                    str2 = str3;
                                    j11 = j24;
                                    i6 = i7;
                                    j12 = j10;
                                } else {
                                    str2 = str3;
                                    j11 = j24;
                                    j12 = j10;
                                    SyncManager.this.mSyncStorageEngine.setPeriodicSyncTime(authorityInfo.ident, authorityInfo.periodicSyncs.get(i7), j12);
                                    SyncManager syncManager = SyncManager.this;
                                    Account account = authorityInfo.account;
                                    int i9 = authorityInfo.userId;
                                    i6 = i7;
                                    String str4 = authorityInfo.authority;
                                    if (backoff != null) {
                                        j13 = ((Long) backoff.first).longValue();
                                    } else {
                                        j13 = 0;
                                    }
                                    j14 = j23;
                                    syncManager.scheduleSyncOperation(new SyncOperation(account, i9, -4, 4, str4, bundle, 0L, 0L, j13, SyncManager.this.mSyncStorageEngine.getDelayUntilTime(authorityInfo.account, authorityInfo.userId, authorityInfo.authority), serviceInfo.type.allowParallelSyncs()));
                                }
                            }
                            if (z4) {
                                j15 = j12 + j20 + j14;
                            } else {
                                j15 = j12 + j14;
                            }
                            if (j15 < j19) {
                                j18 = j15;
                                i7 = i6 + 1;
                                currentTimeMillis = j12;
                                it2 = it3;
                                accountAndUserArr3 = accountAndUserArr2;
                                syncStatusInfo2 = syncStatusInfo;
                                str3 = str2;
                                size = i5;
                                j5 = j11;
                            }
                        }
                        j18 = j19;
                        i7 = i6 + 1;
                        currentTimeMillis = j12;
                        it2 = it3;
                        accountAndUserArr3 = accountAndUserArr2;
                        syncStatusInfo2 = syncStatusInfo;
                        str3 = str2;
                        size = i5;
                        j5 = j11;
                    }
                    syncHandler = this;
                    j17 = 0;
                    j16 = Long.MAX_VALUE;
                } else {
                    accountAndUserArr = accountAndUserArr3;
                    str = str3;
                    j7 = currentTimeMillis;
                    j8 = j5;
                    it = it2;
                    j9 = 0;
                }
                syncHandler = this;
                currentTimeMillis = j7;
                j17 = j9;
                it2 = it;
                accountAndUserArr3 = accountAndUserArr;
                str3 = str;
                j5 = j8;
                j16 = Long.MAX_VALUE;
            }
            long j26 = j16;
            long j27 = currentTimeMillis;
            long j28 = j17;
            if (j18 == j26) {
                return j26;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j18 < j27) {
                j6 = j28;
            } else {
                j6 = j18 - j27;
            }
            return elapsedRealtime + j6;
        }

        private void sendSyncStateIntent() {
        }

        private int syncResultToErrorNumber(SyncResult syncResult) {
            if (syncResult.syncAlreadyInProgress) {
                return 1;
            }
            SyncStats syncStats = syncResult.stats;
            if (syncStats.numAuthExceptions > 0) {
                return 2;
            }
            if (syncStats.numIoExceptions > 0) {
                return 3;
            }
            if (syncStats.numParseExceptions > 0) {
                return 4;
            }
            if (syncStats.numConflictDetectedExceptions > 0) {
                return 5;
            }
            if (syncResult.tooManyDeletions) {
                return 6;
            }
            if (syncResult.tooManyRetries) {
                return 7;
            }
            if (syncResult.databaseError) {
                return 8;
            }
            throw new IllegalStateException("we are not in an error state, " + syncResult);
        }

        private boolean tryEnqueueMessageUntilReadyToRun(Message message) {
            synchronized (this) {
                if (!SyncManager.this.mBootCompleted) {
                    this.mBootQueue.add(Message.obtain(message));
                    return true;
                }
                return false;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long j5;
            if (tryEnqueueMessageUntilReadyToRun(message)) {
                return;
            }
            long j6 = Long.MAX_VALUE;
            try {
                SyncManager syncManager = SyncManager.this;
                syncManager.mDataConnectionIsConnected = syncManager.readDataConnectionState();
                j5 = scheduleReadyPeriodicSyncs();
            } catch (Throwable th) {
                th = th;
                j5 = Long.MAX_VALUE;
            }
            try {
                switch (message.what) {
                    case 1:
                        Log.v(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_SYNC_FINISHED");
                        SyncHandlerMessagePayload syncHandlerMessagePayload = (SyncHandlerMessagePayload) message.obj;
                        if (!SyncManager.this.isSyncStillActive(syncHandlerMessagePayload.activeSyncContext)) {
                            Log.d(SyncManager.TAG, "handleSyncHandlerMessage: dropping since the sync is no longer active: " + syncHandlerMessagePayload.activeSyncContext);
                            break;
                        } else {
                            runSyncFinishedOrCanceledLocked(syncHandlerMessagePayload.syncResult, syncHandlerMessagePayload.activeSyncContext);
                            j6 = maybeStartNextSyncLocked();
                            break;
                        }
                    case 2:
                        Log.v(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_SYNC_ALARM");
                        this.mAlarmScheduleTime = null;
                        j6 = maybeStartNextSyncLocked();
                        break;
                    case 3:
                        Log.v(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_CHECK_ALARMS");
                        j6 = maybeStartNextSyncLocked();
                        break;
                    case 4:
                        ServiceConnectionData serviceConnectionData = (ServiceConnectionData) message.obj;
                        Log.d(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_SERVICE_CONNECTED: " + serviceConnectionData.activeSyncContext);
                        if (SyncManager.this.isSyncStillActive(serviceConnectionData.activeSyncContext)) {
                            runBoundToSyncAdapter(serviceConnectionData.activeSyncContext, serviceConnectionData.syncAdapter);
                            break;
                        }
                        break;
                    case 5:
                        ActiveSyncContext activeSyncContext = ((ServiceConnectionData) message.obj).activeSyncContext;
                        Log.d(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_SERVICE_DISCONNECTED: " + activeSyncContext);
                        if (SyncManager.this.isSyncStillActive(activeSyncContext)) {
                            ISyncAdapter iSyncAdapter = activeSyncContext.mSyncAdapter;
                            if (iSyncAdapter != null) {
                                try {
                                    iSyncAdapter.cancelSync(activeSyncContext);
                                } catch (RemoteException unused) {
                                }
                            }
                            SyncResult syncResult = new SyncResult();
                            syncResult.stats.numIoExceptions++;
                            runSyncFinishedOrCanceledLocked(syncResult, activeSyncContext);
                            j6 = maybeStartNextSyncLocked();
                            break;
                        }
                        break;
                    case 6:
                        Pair pair = (Pair) message.obj;
                        Log.d(SyncManager.TAG, "handleSyncHandlerMessage: MESSAGE_SERVICE_CANCEL: " + pair.first + ", " + ((String) pair.second));
                        cancelActiveSyncLocked((Account) pair.first, message.arg1, (String) pair.second);
                        j6 = maybeStartNextSyncLocked();
                        break;
                }
                manageSyncNotificationLocked();
                manageSyncAlarmLocked(j5, j6);
                this.mSyncTimeTracker.update();
            } catch (Throwable th2) {
                th = th2;
                manageSyncNotificationLocked();
                manageSyncAlarmLocked(j5, Long.MAX_VALUE);
                this.mSyncTimeTracker.update();
                throw th;
            }
        }

        public long insertStartSyncEvent(SyncOperation syncOperation) {
            int i5 = syncOperation.syncSource;
            return SyncManager.this.mSyncStorageEngine.insertStartSyncEvent(syncOperation.account, syncOperation.userId, syncOperation.reason, syncOperation.authority, System.currentTimeMillis(), i5, syncOperation.isInitialization(), syncOperation.extras);
        }

        public void onBootCompleted() {
            Log.v(SyncManager.TAG, "Boot completed, clearing boot queue.");
            SyncManager.this.doDatabaseCleanup();
            synchronized (this) {
                Iterator<Message> it = this.mBootQueue.iterator();
                while (it.hasNext()) {
                    sendMessage(it.next());
                }
                this.mBootQueue = null;
                SyncManager.this.mBootCompleted = true;
            }
        }

        public void stopSyncEvent(long j5, SyncOperation syncOperation, String str, int i5, int i6, long j6) {
            SyncManager.this.mSyncStorageEngine.stopSyncEvent(j5, j6, str, i6, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class SyncHandlerMessagePayload {
        public final ActiveSyncContext activeSyncContext;
        public final SyncResult syncResult;

        SyncHandlerMessagePayload(ActiveSyncContext activeSyncContext, SyncResult syncResult) {
            this.activeSyncContext = activeSyncContext;
            this.syncResult = syncResult;
        }
    }

    /* loaded from: classes3.dex */
    private class SyncTimeTracker {
        boolean mLastWasSyncing;
        private long mTimeSpentSyncing;
        long mWhenSyncStarted;

        private SyncTimeTracker() {
            this.mLastWasSyncing = false;
            this.mWhenSyncStarted = 0L;
        }

        public synchronized long timeSpentSyncing() {
            if (!this.mLastWasSyncing) {
                return this.mTimeSpentSyncing;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            return this.mTimeSpentSyncing + (elapsedRealtime - this.mWhenSyncStarted);
        }

        public synchronized void update() {
            boolean z4;
            if (!SyncManager.this.mActiveSyncContexts.isEmpty()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 == this.mLastWasSyncing) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z4) {
                this.mWhenSyncStarted = elapsedRealtime;
            } else {
                this.mTimeSpentSyncing += elapsedRealtime - this.mWhenSyncStarted;
            }
            this.mLastWasSyncing = z4;
        }
    }

    public SyncManager(Context context) {
        int i5;
        this.mContext = context;
        SyncStorageEngine.init(context);
        SyncStorageEngine singleton = SyncStorageEngine.getSingleton();
        this.mSyncStorageEngine = singleton;
        singleton.setOnSyncRequestListener(new SyncStorageEngine.OnSyncRequestListener() { // from class: com.lody.virtual.server.content.SyncManager.8
            @Override // com.lody.virtual.server.content.SyncStorageEngine.OnSyncRequestListener
            public void onSyncRequest(Account account, int i6, int i7, String str, Bundle bundle) {
                SyncManager.this.scheduleSync(account, i6, i7, str, bundle, 0L, 0L, false);
            }
        });
        SyncAdaptersCache syncAdaptersCache = new SyncAdaptersCache(this.mContext);
        this.mSyncAdapters = syncAdaptersCache;
        syncAdaptersCache.refreshServiceCache(null);
        this.mSyncQueue = new SyncQueue(this.mSyncStorageEngine, this.mSyncAdapters);
        this.mSyncHandler = new SyncHandler(BackgroundThread.get().getLooper());
        if (BuildCompat.isS()) {
            i5 = 67108864;
        } else {
            i5 = 0;
        }
        this.mSyncAlarmIntent = PendingIntent.getBroadcast(this.mContext, 0, new Intent(ACTION_SYNC_ALARM), i5);
        context.registerReceiver(this.mConnectivityIntentReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        context.registerReceiver(this.mBootCompletedReceiver, new IntentFilter("android.intent.action.BOOT_COMPLETED"));
        context.registerReceiver(this.mBackgroundDataSettingChanged, new IntentFilter("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED"));
        IntentFilter intentFilter = new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        context.registerReceiver(this.mStorageIntentReceiver, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.ACTION_SHUTDOWN");
        intentFilter2.setPriority(100);
        context.registerReceiver(this.mShutdownIntentReceiver, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction(Constants.ACTION_USER_REMOVED);
        intentFilter3.addAction(Constants.ACTION_USER_ADDED);
        intentFilter3.addAction(Constants.ACTION_USER_REMOVED);
        if (Build.VERSION.SDK_INT >= 33) {
            this.mContext.registerReceiver(this.mUserIntentReceiver, intentFilter3, 2);
        } else {
            this.mContext.registerReceiver(this.mUserIntentReceiver, intentFilter3);
        }
        context.registerReceiver(new SyncAlarmIntentReceiver(), new IntentFilter(ACTION_SYNC_ALARM));
        this.mPowerManager = (PowerManager) context.getSystemService("power");
        this.mUserManager = VUserManager.get();
        this.mSyncStorageEngine.addStatusChangeListener(1, new ISyncStatusObserver.Stub() { // from class: com.lody.virtual.server.content.SyncManager.9
            @Override // android.content.ISyncStatusObserver
            public void onStatusChanged(int i6) {
                SyncManager.this.sendCheckAlarmsMessage();
            }
        });
        this.mSyncRandomOffsetMillis = this.mSyncStorageEngine.getSyncRandomOffset() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackoffSetting(SyncOperation syncOperation) {
        this.mSyncStorageEngine.setBackoff(syncOperation.account, syncOperation.userId, syncOperation.authority, -1L, -1L);
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.onBackoffChanged(syncOperation.account, syncOperation.userId, syncOperation.authority, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean containsAccountAndUser(AccountAndUser[] accountAndUserArr, Account account, int i5) {
        for (AccountAndUser accountAndUser : accountAndUserArr) {
            if (accountAndUser.userId == i5 && accountAndUser.account.equals(account)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doDatabaseCleanup() {
        for (VUserInfo vUserInfo : this.mUserManager.getUsers(true)) {
            if (!vUserInfo.partial) {
                this.mSyncStorageEngine.doDatabaseCleanup(VAccountManagerService.get().getAccounts(vUserInfo.id, null), vUserInfo.id);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureAlarmService() {
        if (this.mAlarmService == null) {
            this.mAlarmService = (AlarmManager) this.mContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        }
    }

    static String formatTime(long j5) {
        Time time = new Time();
        time.set(j5);
        return time.format("%Y-%m-%d %H:%M:%S");
    }

    private List<VUserInfo> getAllUsers() {
        return this.mUserManager.getUsers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConnectivityManager getConnectivityManager() {
        ConnectivityManager connectivityManager;
        synchronized (this) {
            if (this.mConnManagerDoNotUseDirectly == null) {
                this.mConnManagerDoNotUseDirectly = (ConnectivityManager) this.mContext.getSystemService("connectivity");
            }
            connectivityManager = this.mConnManagerDoNotUseDirectly;
        }
        return connectivityManager;
    }

    private String getLastFailureMessage(int i5) {
        switch (i5) {
            case 1:
                return "sync already in progress";
            case 2:
                return "authentication error";
            case 3:
                return "I/O error";
            case 4:
                return "parse error";
            case 5:
                return "conflict error";
            case 6:
                return "too many deletions error";
            case 7:
                return "too many retries error";
            case 8:
                return "internal error";
            default:
                return "unknown";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void increaseBackoffSetting(SyncOperation syncOperation) {
        long j5;
        long j6;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Pair<Long, Long> backoff = this.mSyncStorageEngine.getBackoff(syncOperation.account, syncOperation.userId, syncOperation.authority);
        if (backoff != null) {
            if (elapsedRealtime < ((Long) backoff.first).longValue()) {
                Log.v(TAG, "Still in backoff, do not increase it. Remaining: " + ((((Long) backoff.first).longValue() - elapsedRealtime) / 1000) + " seconds.");
                return;
            }
            j5 = ((Long) backoff.second).longValue() * 2;
        } else {
            j5 = -1;
        }
        if (j5 <= 0) {
            j5 = jitterize(ab.aa, 33000L);
        }
        if (j5 > OpenStreetMapTileProviderConstants.ONE_HOUR) {
            j6 = 3600000;
        } else {
            j6 = j5;
        }
        long j7 = elapsedRealtime + j6;
        this.mSyncStorageEngine.setBackoff(syncOperation.account, syncOperation.userId, syncOperation.authority, j7, j6);
        syncOperation.backoff = Long.valueOf(j7);
        syncOperation.updateEffectiveRunTime();
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.onBackoffChanged(syncOperation.account, syncOperation.userId, syncOperation.authority, j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSyncStillActive(ActiveSyncContext activeSyncContext) {
        Iterator<ActiveSyncContext> it = this.mActiveSyncContexts.iterator();
        while (it.hasNext()) {
            if (it.next() == activeSyncContext) {
                return true;
            }
        }
        return false;
    }

    private long jitterize(long j5, long j6) {
        Random random = new Random(SystemClock.elapsedRealtime());
        if (j6 - j5 <= 2147483647L) {
            return j5 + random.nextInt((int) r6);
        }
        throw new IllegalArgumentException("the difference between the maxValue and the minValue must be less than 2147483647");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserRemoved(int i5) {
        updateRunningAccounts();
        this.mSyncStorageEngine.doDatabaseCleanup(new Account[0], i5);
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.removeUser(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserStarting(int i5) {
        this.mSyncAdapters.refreshServiceCache(null);
        updateRunningAccounts();
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.addPendingOperations(i5);
        }
        for (Account account : VAccountManagerService.get().getAccounts(i5, null)) {
            scheduleSync(account, i5, -8, null, null, 0L, 0L, true);
        }
        sendCheckAlarmsMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUserStopping(int i5) {
        updateRunningAccounts();
        cancelActiveSync(null, i5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean readDataConnectionState() {
        NetworkInfo activeNetworkInfo = getConnectivityManager().getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    private void sendCancelSyncsMessage(Account account, int i5, String str) {
        Log.v(TAG, "sending MESSAGE_CANCEL");
        Message obtainMessage = this.mSyncHandler.obtainMessage();
        obtainMessage.what = 6;
        obtainMessage.obj = Pair.create(account, str);
        obtainMessage.arg1 = i5;
        this.mSyncHandler.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCheckAlarmsMessage() {
        Log.v(TAG, "sending MESSAGE_CHECK_ALARMS");
        this.mSyncHandler.removeMessages(3);
        this.mSyncHandler.sendEmptyMessage(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSyncAlarmMessage() {
        Log.v(TAG, "sending MESSAGE_SYNC_ALARM");
        this.mSyncHandler.sendEmptyMessage(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSyncFinishedOrCanceledMessage(ActiveSyncContext activeSyncContext, SyncResult syncResult) {
        Log.v(TAG, "sending MESSAGE_SYNC_FINISHED");
        Message obtainMessage = this.mSyncHandler.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = new SyncHandlerMessagePayload(activeSyncContext, syncResult);
        this.mSyncHandler.sendMessage(obtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelayUntilTime(SyncOperation syncOperation, long j5) {
        long j6;
        long j7 = j5 * 1000;
        long currentTimeMillis = System.currentTimeMillis();
        if (j7 > currentTimeMillis) {
            j6 = SystemClock.elapsedRealtime() + (j7 - currentTimeMillis);
        } else {
            j6 = 0;
        }
        this.mSyncStorageEngine.setDelayUntilTime(syncOperation.account, syncOperation.userId, syncOperation.authority, j6);
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.onDelayUntilTimeChanged(syncOperation.account, syncOperation.authority, j6);
        }
    }

    public void cancelActiveSync(Account account, int i5, String str) {
        sendCancelSyncsMessage(account, i5, str);
    }

    public void clearScheduledSyncOperations(Account account, int i5, String str) {
        synchronized (this.mSyncQueue) {
            this.mSyncQueue.remove(account, i5, str);
        }
        this.mSyncStorageEngine.setBackoff(account, i5, str, -1L, -1L);
    }

    public int getIsSyncable(Account account, int i5, String str) {
        int isSyncable = this.mSyncStorageEngine.getIsSyncable(account, i5, str);
        VUserInfo userInfo = VUserManager.get().getUserInfo(i5);
        if (userInfo != null && userInfo.isRestricted()) {
            if (this.mSyncAdapters.getServiceInfo(account, str) == null) {
                return isSyncable;
            }
            return 0;
        }
        return isSyncable;
    }

    public SyncAdapterType[] getSyncAdapterTypes() {
        Collection<SyncAdaptersCache.SyncAdapterInfo> allServices = this.mSyncAdapters.getAllServices();
        SyncAdapterType[] syncAdapterTypeArr = new SyncAdapterType[allServices.size()];
        Iterator<SyncAdaptersCache.SyncAdapterInfo> it = allServices.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            syncAdapterTypeArr[i5] = it.next().type;
            i5++;
        }
        return syncAdapterTypeArr;
    }

    public SyncStorageEngine getSyncStorageEngine() {
        return this.mSyncStorageEngine;
    }

    void maybeRescheduleSync(SyncResult syncResult, SyncOperation syncOperation) {
        Log.d(TAG, "encountered error(s) during the sync: " + syncResult + ", " + syncOperation);
        SyncOperation syncOperation2 = new SyncOperation(syncOperation);
        if (syncOperation2.extras.getBoolean("ignore_backoff", false)) {
            syncOperation2.extras.remove("ignore_backoff");
        }
        if (syncOperation2.extras.getBoolean("do_not_retry", false)) {
            Log.d(TAG, "not retrying sync operation because SYNC_EXTRAS_DO_NOT_RETRY was specified " + syncOperation2);
            return;
        }
        if (syncOperation2.extras.getBoolean("upload", false) && !syncResult.syncAlreadyInProgress) {
            syncOperation2.extras.remove("upload");
            Log.d(TAG, "retrying sync operation as a two-way sync because an upload-only sync encountered an error: " + syncOperation2);
            scheduleSyncOperation(syncOperation2);
            return;
        }
        if (syncResult.tooManyRetries) {
            Log.d(TAG, "not retrying sync operation because it retried too many times: " + syncOperation2);
            return;
        }
        if (syncResult.madeSomeProgress()) {
            Log.d(TAG, "retrying sync operation because even though it had an error it achieved some success");
            scheduleSyncOperation(syncOperation2);
            return;
        }
        if (syncResult.syncAlreadyInProgress) {
            Log.d(TAG, "retrying sync operation that failed because there was already a sync in progress: " + syncOperation2);
            scheduleSyncOperation(new SyncOperation(syncOperation2.account, syncOperation2.userId, syncOperation2.reason, syncOperation2.syncSource, syncOperation2.authority, syncOperation2.extras, 10000L, syncOperation2.flexTime, syncOperation2.backoff.longValue(), syncOperation2.delayUntil, syncOperation2.allowParallelSyncs));
            return;
        }
        if (syncResult.hasSoftError()) {
            Log.d(TAG, "retrying sync operation because it encountered a soft error: " + syncOperation2);
            scheduleSyncOperation(syncOperation2);
            return;
        }
        Log.d(TAG, "not retrying sync operation because the error is a hard error: " + syncOperation2);
    }

    public void scheduleLocalSync(Account account, int i5, int i6, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("upload", true);
        long j5 = LOCAL_SYNC_DELAY;
        scheduleSync(account, i5, i6, str, bundle, j5, j5 * 2, false);
    }

    public void scheduleSync(Account account, int i5, int i6, String str, Bundle bundle, long j5, long j6, boolean z4) {
        boolean z5;
        Bundle bundle2;
        long j7;
        AccountAndUser[] accountAndUserArr;
        int i7;
        int i8;
        Iterator it;
        int i9;
        boolean z6;
        long j8;
        Bundle bundle3;
        int i10;
        String str2;
        AccountAndUser accountAndUser;
        int i11;
        long j9;
        int i12;
        int i13;
        String str3;
        String str4 = str;
        if (this.mBootCompleted && !getConnectivityManager().getBackgroundDataSetting()) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String str5 = "one-time sync for: " + account + " " + bundle2.toString() + " " + str4;
        String str6 = TAG;
        Log.d(TAG, str5);
        if (Boolean.valueOf(bundle2.getBoolean("expedited", false)).booleanValue()) {
            j7 = -1;
        } else {
            j7 = j6;
        }
        if (account != null && i5 != -1) {
            accountAndUserArr = new AccountAndUser[]{new AccountAndUser(account, i5)};
        } else {
            accountAndUserArr = this.mRunningAccounts;
            if (accountAndUserArr.length == 0) {
                Log.v(TAG, "scheduleSync: no accounts configured, dropping");
                return;
            }
        }
        AccountAndUser[] accountAndUserArr2 = accountAndUserArr;
        boolean z7 = bundle2.getBoolean("upload", false);
        boolean z8 = bundle2.getBoolean(TTDownloadField.TT_FORCE, false);
        if (z8) {
            bundle2.putBoolean("ignore_backoff", true);
            bundle2.putBoolean("ignore_settings", true);
        }
        boolean z9 = bundle2.getBoolean("ignore_settings", false);
        if (z7) {
            i7 = 1;
        } else {
            if (z8) {
                i8 = 3;
            } else if (str4 == null) {
                i8 = 2;
            } else {
                i7 = 0;
            }
            i7 = i8;
        }
        int length = accountAndUserArr2.length;
        int i14 = 0;
        while (i14 < length) {
            AccountAndUser accountAndUser2 = accountAndUserArr2[i14];
            HashSet hashSet = new HashSet();
            Iterator<SyncAdaptersCache.SyncAdapterInfo> it2 = this.mSyncAdapters.getAllServices().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().type.authority);
            }
            if (str4 != null) {
                boolean contains = hashSet.contains(str4);
                hashSet.clear();
                if (contains) {
                    hashSet.add(str4);
                }
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                String str7 = (String) it3.next();
                AccountAndUser[] accountAndUserArr3 = accountAndUserArr2;
                int isSyncable = getIsSyncable(accountAndUser2.account, accountAndUser2.userId, str7);
                if (isSyncable == 0) {
                    accountAndUserArr2 = accountAndUserArr3;
                } else {
                    SyncAdaptersCache.SyncAdapterInfo serviceInfo = this.mSyncAdapters.getServiceInfo(accountAndUser2.account, str7);
                    if (serviceInfo == null) {
                        accountAndUserArr2 = accountAndUserArr3;
                    } else {
                        boolean allowParallelSyncs = serviceInfo.type.allowParallelSyncs();
                        boolean isAlwaysSyncable = serviceInfo.type.isAlwaysSyncable();
                        if (isSyncable < 0 && isAlwaysSyncable) {
                            it = it3;
                            i9 = i14;
                            this.mSyncStorageEngine.setIsSyncable(accountAndUser2.account, accountAndUser2.userId, str7, 1);
                            isSyncable = 1;
                        } else {
                            it = it3;
                            i9 = i14;
                        }
                        if ((!z4 || isSyncable < 0) && (serviceInfo.type.supportsUploading() || !z7)) {
                            if (isSyncable >= 0 && !z9 && (!z5 || !this.mSyncStorageEngine.getMasterSyncAutomatically(accountAndUser2.userId) || !this.mSyncStorageEngine.getSyncAutomatically(accountAndUser2.account, accountAndUser2.userId, str7))) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z6) {
                                Log.d(str6, "scheduleSync: sync of " + accountAndUser2 + ", " + str7 + " is not allowed, dropping request");
                            } else {
                                Pair<Long, Long> backoff = this.mSyncStorageEngine.getBackoff(accountAndUser2.account, accountAndUser2.userId, str7);
                                boolean z10 = z5;
                                long delayUntilTime = this.mSyncStorageEngine.getDelayUntilTime(accountAndUser2.account, accountAndUser2.userId, str7);
                                if (backoff != null) {
                                    j8 = ((Long) backoff.first).longValue();
                                } else {
                                    j8 = 0;
                                }
                                long j10 = j8;
                                boolean z11 = z7;
                                if (isSyncable < 0) {
                                    Bundle bundle4 = new Bundle();
                                    i10 = length;
                                    bundle3 = bundle2;
                                    bundle4.putBoolean("initialize", true);
                                    Log.v(str6, "schedule initialisation Sync:, delay until " + delayUntilTime + ", run by 0, source " + i7 + ", account " + accountAndUser2 + ", authority " + str7 + ", extras " + bundle4);
                                    str2 = str6;
                                    scheduleSyncOperation(new SyncOperation(accountAndUser2.account, accountAndUser2.userId, i6, i7, str7, bundle4, 0L, 0L, j10, delayUntilTime, allowParallelSyncs));
                                } else {
                                    bundle3 = bundle2;
                                    i10 = length;
                                    str2 = str6;
                                }
                                if (!z4) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("scheduleSync: delay until ");
                                    sb.append(delayUntilTime);
                                    sb.append(" run by ");
                                    sb.append(j7);
                                    sb.append(" flex ");
                                    sb.append(j5);
                                    sb.append(", source ");
                                    sb.append(i7);
                                    sb.append(", account ");
                                    sb.append(accountAndUser2);
                                    sb.append(", authority ");
                                    sb.append(str7);
                                    sb.append(", extras ");
                                    bundle2 = bundle3;
                                    sb.append(bundle2);
                                    str3 = str2;
                                    Log.v(str3, sb.toString());
                                    accountAndUser = accountAndUser2;
                                    i12 = i9;
                                    i13 = i10;
                                    i11 = i7;
                                    j9 = j7;
                                    scheduleSyncOperation(new SyncOperation(accountAndUser2.account, accountAndUser2.userId, i6, i7, str7, bundle2, j9, j5, j10, delayUntilTime, allowParallelSyncs));
                                } else {
                                    accountAndUser = accountAndUser2;
                                    i11 = i7;
                                    j9 = j7;
                                    i12 = i9;
                                    i13 = i10;
                                    str3 = str2;
                                    bundle2 = bundle3;
                                }
                                accountAndUserArr2 = accountAndUserArr3;
                                it3 = it;
                                str6 = str3;
                                i14 = i12;
                                accountAndUser2 = accountAndUser;
                                length = i13;
                                i7 = i11;
                                j7 = j9;
                                z5 = z10;
                                z7 = z11;
                            }
                        }
                        accountAndUserArr2 = accountAndUserArr3;
                        it3 = it;
                        i14 = i9;
                    }
                }
            }
            i14++;
            str4 = str;
            z5 = z5;
            z7 = z7;
        }
    }

    public void scheduleSyncOperation(SyncOperation syncOperation) {
        boolean add;
        synchronized (this.mSyncQueue) {
            add = this.mSyncQueue.add(syncOperation);
        }
        if (add) {
            Log.v(TAG, "scheduleSyncOperation: enqueued " + syncOperation);
            sendCheckAlarmsMessage();
            return;
        }
        Log.v(TAG, "scheduleSyncOperation: dropping duplicate sync operation " + syncOperation);
    }

    public void updateRunningAccounts() {
        this.mRunningAccounts = VAccountManagerService.get().getAllAccounts();
        if (this.mBootCompleted) {
            doDatabaseCleanup();
        }
        Iterator<ActiveSyncContext> it = this.mActiveSyncContexts.iterator();
        while (it.hasNext()) {
            ActiveSyncContext next = it.next();
            AccountAndUser[] accountAndUserArr = this.mRunningAccounts;
            SyncOperation syncOperation = next.mSyncOperation;
            if (!containsAccountAndUser(accountAndUserArr, syncOperation.account, syncOperation.userId)) {
                Log.d(TAG, "canceling sync since the account is no longer running");
                sendSyncFinishedOrCanceledMessage(next, null);
            }
        }
        sendCheckAlarmsMessage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class ActiveSyncContext extends ISyncContext.Stub implements ServiceConnection, IBinder.DeathRecipient {
        boolean mBound;
        final long mHistoryRowId;
        final long mStartTime;
        VSyncInfo mSyncInfo;
        final SyncOperation mSyncOperation;
        long mTimeoutStartTime;
        boolean mIsLinkedToDeath = false;
        ISyncAdapter mSyncAdapter = null;

        public ActiveSyncContext(SyncOperation syncOperation, long j5) {
            this.mSyncOperation = syncOperation;
            this.mHistoryRowId = j5;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mStartTime = elapsedRealtime;
            this.mTimeoutStartTime = elapsedRealtime;
        }

        boolean bindToSyncAdapter(SyncAdaptersCache.SyncAdapterInfo syncAdapterInfo, int i5) {
            Log.d(SyncManager.TAG, "bindToSyncAdapter: " + syncAdapterInfo.serviceInfo + ", connection " + this);
            Intent intent = new Intent();
            intent.setAction("android.content.SyncAdapter");
            intent.setComponent(syncAdapterInfo.componentName);
            this.mBound = true;
            boolean bindService = VActivityManager.get().bindService(SyncManager.this.mContext, intent, this, 21, this.mSyncOperation.userId);
            if (!bindService) {
                this.mBound = false;
            }
            return bindService;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            SyncManager.this.sendSyncFinishedOrCanceledMessage(this, null);
        }

        protected void close() {
            Log.d(SyncManager.TAG, "unBindFromSyncAdapter: connection " + this);
            if (this.mBound) {
                this.mBound = false;
                VActivityManager.get().unbindService(SyncManager.this.mContext, this);
            }
        }

        @Override // android.content.ISyncContext
        public void onFinished(SyncResult syncResult) {
            Log.v(SyncManager.TAG, "onFinished: " + this);
            SyncManager.this.sendSyncFinishedOrCanceledMessage(this, syncResult);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Message obtainMessage = SyncManager.this.mSyncHandler.obtainMessage();
            obtainMessage.what = 4;
            obtainMessage.obj = new ServiceConnectionData(this, ISyncAdapter.Stub.asInterface(iBinder));
            SyncManager.this.mSyncHandler.sendMessage(obtainMessage);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Message obtainMessage = SyncManager.this.mSyncHandler.obtainMessage();
            obtainMessage.what = 5;
            obtainMessage.obj = new ServiceConnectionData(this, null);
            SyncManager.this.mSyncHandler.sendMessage(obtainMessage);
        }

        @Override // android.content.ISyncContext
        public void sendHeartbeat() {
        }

        public void toString(StringBuilder sb) {
            sb.append("startTime ");
            sb.append(this.mStartTime);
            sb.append(", mTimeoutStartTime ");
            sb.append(this.mTimeoutStartTime);
            sb.append(", mHistoryRowId ");
            sb.append(this.mHistoryRowId);
            sb.append(", syncOperation ");
            sb.append(this.mSyncOperation);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            toString(sb);
            return sb.toString();
        }
    }
}

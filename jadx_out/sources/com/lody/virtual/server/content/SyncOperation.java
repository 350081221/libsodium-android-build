package com.lody.virtual.server.content;

import a1.i;
import android.accounts.Account;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.ContainerUtils;
import com.lody.virtual.helper.compat.ContentResolverCompat;
import com.lody.virtual.server.content.SyncStorageEngine;

/* loaded from: classes3.dex */
public class SyncOperation implements Comparable {
    public static final int REASON_ACCOUNTS_UPDATED = -2;
    public static final int REASON_BACKGROUND_DATA_SETTINGS_CHANGED = -1;
    public static final int REASON_IS_SYNCABLE = -5;
    public static final int REASON_MASTER_SYNC_AUTO = -7;
    private static String[] REASON_NAMES = {"DataSettingsChanged", "AccountsUpdated", "ServiceChanged", "Periodic", "IsSyncable", "AutoSync", "MasterSyncAuto", "UserStart"};
    public static final int REASON_PERIODIC = -4;
    public static final int REASON_SERVICE_CHANGED = -3;
    public static final int REASON_SYNC_AUTO = -6;
    public static final int REASON_USER_START = -8;
    public final Account account;
    public final boolean allowParallelSyncs;
    public final String authority;
    public Long backoff;
    public long delayUntil;
    public long effectiveRunTime;
    public boolean expedited;
    public Bundle extras;
    public long flexTime;
    public final String key;
    public long latestRunTime;
    public SyncStorageEngine.PendingOperation pendingOperation;
    public final int reason;
    public final ComponentName service;
    public int syncSource;
    public final int userId;

    public SyncOperation(Account account, int i5, int i6, int i7, String str, Bundle bundle, long j5, long j6, long j7, long j8, boolean z4) {
        this.service = null;
        this.account = account;
        this.authority = str;
        this.userId = i5;
        this.reason = i6;
        this.syncSource = i7;
        this.allowParallelSyncs = z4;
        Bundle bundle2 = new Bundle(bundle);
        this.extras = bundle2;
        cleanBundle(bundle2);
        this.delayUntil = j8;
        this.backoff = Long.valueOf(j7);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j5 >= 0 && !isExpedited()) {
            this.expedited = false;
            this.latestRunTime = elapsedRealtime + j5;
            this.flexTime = j6;
        } else {
            this.expedited = true;
            this.latestRunTime = elapsedRealtime;
            this.flexTime = 0L;
        }
        updateEffectiveRunTime();
        this.key = toKey();
    }

    private void cleanBundle(Bundle bundle) {
        removeFalseExtra(bundle, "upload");
        removeFalseExtra(bundle, TTDownloadField.TT_FORCE);
        removeFalseExtra(bundle, "ignore_settings");
        removeFalseExtra(bundle, "ignore_backoff");
        removeFalseExtra(bundle, "do_not_retry");
        removeFalseExtra(bundle, "discard_deletions");
        removeFalseExtra(bundle, "expedited");
        removeFalseExtra(bundle, "deletions_override");
        removeFalseExtra(bundle, ContentResolverCompat.SYNC_EXTRAS_DISALLOW_METERED);
        bundle.remove(ContentResolverCompat.SYNC_EXTRAS_EXPECTED_UPLOAD);
        bundle.remove(ContentResolverCompat.SYNC_EXTRAS_EXPECTED_DOWNLOAD);
    }

    public static void extrasToStringBuilder(Bundle bundle, StringBuilder sb) {
        sb.append("[");
        for (String str : bundle.keySet()) {
            sb.append(str);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(bundle.get(str));
            sb.append(" ");
        }
        sb.append("]");
    }

    public static String reasonToString(PackageManager packageManager, int i5) {
        if (i5 >= 0) {
            if (packageManager != null) {
                String[] packagesForUid = packageManager.getPackagesForUid(i5);
                if (packagesForUid != null && packagesForUid.length == 1) {
                    return packagesForUid[0];
                }
                String nameForUid = packageManager.getNameForUid(i5);
                if (nameForUid != null) {
                    return nameForUid;
                }
                return String.valueOf(i5);
            }
            return String.valueOf(i5);
        }
        int i6 = (-i5) - 1;
        String[] strArr = REASON_NAMES;
        if (i6 >= strArr.length) {
            return String.valueOf(i5);
        }
        return strArr[i6];
    }

    private void removeFalseExtra(Bundle bundle, String str) {
        if (!bundle.getBoolean(str, false)) {
            bundle.remove(str);
        }
    }

    private String toKey() {
        StringBuilder sb = new StringBuilder();
        if (this.service == null) {
            sb.append("authority: ");
            sb.append(this.authority);
            sb.append(" account {name=" + this.account.name + ", user=" + this.userId + ", type=" + this.account.type + i.f138d);
        } else {
            sb.append("service {package=");
            sb.append(this.service.getPackageName());
            sb.append(" user=");
            sb.append(this.userId);
            sb.append(", class=");
            sb.append(this.service.getClassName());
            sb.append(i.f138d);
        }
        sb.append(" extras: ");
        extrasToStringBuilder(this.extras, sb);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        SyncOperation syncOperation = (SyncOperation) obj;
        boolean z4 = this.expedited;
        if (z4 != syncOperation.expedited) {
            if (!z4) {
                return 1;
            }
            return -1;
        }
        long max = Math.max(this.effectiveRunTime - this.flexTime, 0L);
        long max2 = Math.max(syncOperation.effectiveRunTime - syncOperation.flexTime, 0L);
        if (max < max2) {
            return -1;
        }
        if (max2 < max) {
            return 1;
        }
        return 0;
    }

    public String dump(PackageManager packageManager, boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.account.name);
        sb.append(" u");
        sb.append(this.userId);
        sb.append(" (");
        sb.append(this.account.type);
        sb.append(")");
        sb.append(", ");
        sb.append(this.authority);
        sb.append(", ");
        sb.append(SyncStorageEngine.SOURCES[this.syncSource]);
        sb.append(", latestRunTime ");
        sb.append(this.latestRunTime);
        if (this.expedited) {
            sb.append(", EXPEDITED");
        }
        sb.append(", reason: ");
        sb.append(reasonToString(packageManager, this.reason));
        if (!z4 && !this.extras.keySet().isEmpty()) {
            sb.append("\n    ");
            extrasToStringBuilder(this.extras, sb);
        }
        return sb.toString();
    }

    public boolean ignoreBackoff() {
        return this.extras.getBoolean("ignore_backoff", false);
    }

    public boolean isExpedited() {
        return this.extras.getBoolean("expedited", false) || this.expedited;
    }

    public boolean isInitialization() {
        return this.extras.getBoolean("initialize", false);
    }

    public boolean isMeteredDisallowed() {
        return this.extras.getBoolean(ContentResolverCompat.SYNC_EXTRAS_DISALLOW_METERED, false);
    }

    public String toString() {
        return dump(null, true);
    }

    public void updateEffectiveRunTime() {
        long max;
        if (ignoreBackoff()) {
            max = this.latestRunTime;
        } else {
            max = Math.max(Math.max(this.latestRunTime, this.delayUntil), this.backoff.longValue());
        }
        this.effectiveRunTime = max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SyncOperation(SyncOperation syncOperation) {
        this.service = syncOperation.service;
        this.account = syncOperation.account;
        this.authority = syncOperation.authority;
        this.userId = syncOperation.userId;
        this.reason = syncOperation.reason;
        this.syncSource = syncOperation.syncSource;
        this.extras = new Bundle(syncOperation.extras);
        this.expedited = syncOperation.expedited;
        this.latestRunTime = SystemClock.elapsedRealtime();
        this.flexTime = 0L;
        this.backoff = syncOperation.backoff;
        this.allowParallelSyncs = syncOperation.allowParallelSyncs;
        updateEffectiveRunTime();
        this.key = toKey();
    }
}

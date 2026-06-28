package com.huawei.hms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.database.APIEvent;
import com.huawei.hms.analytics.framework.SyncManager;
import com.huawei.hms.analytics.type.HALogConfig;
import com.huawei.hms.analytics.type.ReportPolicy;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class HiAnalyticsInstance {
    private static boolean ikl;
    private static bi klm;
    private static HiAnalyticsInstance lmn;

    private HiAnalyticsInstance() {
    }

    private static hij ikl(Context context, String str) {
        return new hij(context, new klm(!GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str), str), "_openness_config_tag", str, SyncManager.TaskNames.INIT_TASK_OPENNESS);
    }

    private static bi klm(Context context, String str) {
        Context applicationContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        cc lmn2 = cd.lmn("HiAnalyticsInstance#getInstance(Context)");
        try {
            try {
                ghi ghiVar = (ghi) fgh.lmn().lmn("_openness_config_tag");
                if (ghiVar == null) {
                    fgh.lmn();
                    fgh.klm(context);
                    ghiVar = new ghi(applicationContext);
                    fgh.lmn().lmn("_openness_config_tag", ghiVar);
                    lmn(context, str, ghiVar);
                    fgh.lmn();
                    fgh.lmn(applicationContext, ghiVar);
                    fgh.lmn();
                    fgh.lmn(applicationContext);
                }
                lmn2.lmn = "0";
                ikl = true;
                return ghiVar;
            } finally {
                cd.lmn(lmn2);
            }
        } catch (bc.lmn e5) {
            HiLog.e("HiAnalyticsCreation", HiLog.ErrorCode.SE001, "DBException");
            lmn2.klm = "SE-001:002";
            di.lmn(e5);
            try {
                HMSBIInitializer.getInstance(applicationContext).initBI();
                APIEvent klm2 = cd.klm(lmn2);
                HiAnalyticsUtil.getInstance().onNewEvent(applicationContext, klm2.getCode(), klm2.toMap());
            } catch (Exception | NoClassDefFoundError unused) {
                HiLog.w("APIEvtRecordHolder", "init hms BISDK failed");
            }
            return null;
        } catch (Throwable th) {
            lmn2.klm = "SE-001:003";
            di.lmn(th);
            HiLog.e("HiAnalyticsCreation", HiLog.ErrorCode.SE001, "Exception " + th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized HiAnalyticsInstance lmn() {
        synchronized (HiAnalyticsInstance.class) {
            klm = null;
            ikl = false;
            ba.lmn("_openness_config_tag", Boolean.FALSE);
            HiAnalyticsInstance hiAnalyticsInstance = lmn;
            if (hiAnalyticsInstance != null) {
                return hiAnalyticsInstance;
            }
            HiAnalyticsInstance hiAnalyticsInstance2 = new HiAnalyticsInstance();
            lmn = hiAnalyticsInstance2;
            return hiAnalyticsInstance2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized HiAnalyticsInstance lmn(Context context) {
        HiAnalyticsInstance lmn2;
        synchronized (HiAnalyticsInstance.class) {
            lmn2 = lmn(context, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        }
        return lmn2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.huawei.hms.analytics.HiAnalyticsInstance lmn(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.Class<com.huawei.hms.analytics.HiAnalyticsInstance> r0 = com.huawei.hms.analytics.HiAnalyticsInstance.class
            monitor-enter(r0)
            com.huawei.hms.analytics.dq r1 = com.huawei.hms.analytics.dq.lmn()     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.lmn(r4)     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto L87
            com.huawei.hms.analytics.HiAnalyticsInstance r1 = com.huawei.hms.analytics.HiAnalyticsInstance.lmn     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L30
            com.huawei.hms.analytics.HiAnalyticsInstance r1 = new com.huawei.hms.analytics.HiAnalyticsInstance     // Catch: java.lang.Throwable -> L96
            r1.<init>()     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.HiAnalyticsInstance.lmn = r1     // Catch: java.lang.Throwable -> L96
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L96
            android.os.Looper r2 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L96
            if (r1 == r2) goto L2d
            java.lang.String r1 = "HiAnalyticsCreation"
            java.lang.String r2 = "IE-001"
            java.lang.String r3 = "init must be called in the main thread"
            com.huawei.hms.analytics.core.log.HiLog.e(r1, r2, r3)     // Catch: java.lang.Throwable -> L96
            r1 = 0
            goto L2e
        L2d:
            r1 = 1
        L2e:
            if (r1 == 0) goto L87
        L30:
            if (r4 != 0) goto L43
            java.lang.String r4 = "HiAnalyticsCreation"
            java.lang.String r5 = "PE-001"
            java.lang.String r1 = "context is null, failed to initialize the Analytics Kit."
            com.huawei.hms.analytics.core.log.HiLog.e(r4, r5, r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = "_openness_config_tag"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.ba.lmn(r4, r5)     // Catch: java.lang.Throwable -> L96
            goto L87
        L43:
            boolean r1 = com.huawei.hms.analytics.HiAnalyticsInstance.ikl     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L4e
            com.huawei.hms.analytics.bi r4 = klm(r4, r5)     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.HiAnalyticsInstance.klm = r4     // Catch: java.lang.Throwable -> L96
            goto L87
        L4e:
            boolean r4 = com.huawei.hms.analytics.ba.lmn()     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L64
            com.huawei.hms.analytics.ar r4 = com.huawei.hms.analytics.ar.lmn()     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.at r4 = r4.lmn     // Catch: java.lang.Throwable -> L96
            android.content.Context r4 = r4.ghi     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.bi r1 = com.huawei.hms.analytics.HiAnalyticsInstance.klm     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.ghi r1 = (com.huawei.hms.analytics.ghi) r1     // Catch: java.lang.Throwable -> L96
            lmn(r4, r5, r1)     // Catch: java.lang.Throwable -> L96
            goto L87
        L64:
            boolean r4 = com.huawei.hms.analytics.ba.lmn()     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L87
            com.huawei.hms.analytics.fgh.lmn()     // Catch: java.lang.Throwable -> L96
            java.lang.String r4 = "_openness_config_tag"
            boolean r4 = com.huawei.hms.analytics.fgh.lmn(r5, r4)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L87
            com.huawei.hms.analytics.ar r4 = com.huawei.hms.analytics.ar.lmn()     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.at r4 = r4.lmn     // Catch: java.lang.Throwable -> L96
            android.content.Context r4 = r4.ghi     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.hij r4 = ikl(r4, r5)     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.fgh.lmn()     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.fgh.lmn(r4)     // Catch: java.lang.Throwable -> L96
        L87:
            com.huawei.hms.analytics.HiAnalyticsInstance r4 = com.huawei.hms.analytics.HiAnalyticsInstance.lmn     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto L94
            com.huawei.hms.analytics.HiAnalyticsInstance r4 = new com.huawei.hms.analytics.HiAnalyticsInstance     // Catch: java.lang.Throwable -> L96
            r4.<init>()     // Catch: java.lang.Throwable -> L96
            com.huawei.hms.analytics.HiAnalyticsInstance.lmn = r4     // Catch: java.lang.Throwable -> L96
            monitor-exit(r0)
            return r4
        L94:
            monitor-exit(r0)
            return r4
        L96:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.HiAnalyticsInstance.lmn(android.content.Context, java.lang.String):com.huawei.hms.analytics.HiAnalyticsInstance");
    }

    private static void lmn(Context context, String str, ghi ghiVar) {
        hij ikl2 = ikl(context, str);
        ikl2.lmn = new ikl(ghiVar);
        ikl2.klm = cd.lmn("HiAnalyticsInstance#initTask");
        fgh.lmn();
        fgh.lmn(ikl2);
    }

    public void addDefaultEventParams(Bundle bundle) {
        if (klm != null) {
            final Bundle lmn2 = dd.lmn(bundle);
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.22
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(lmn2);
                    }
                }
            });
        }
    }

    public void clearCachedData() {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.12
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ghi();
                    }
                }
            });
        }
    }

    public Task<String> getAAID() {
        if (klm == null) {
            return null;
        }
        if (ba.lmn()) {
            return klm.fgh();
        }
        try {
            SyncManager.getInstance().await(SyncManager.TaskNames.INIT_TASK_OPENNESS, 150L);
            return klm.fgh();
        } catch (InterruptedException unused) {
            HiLog.w("HiAnalyticsCreation", "getAAID Interrupted Exception");
            return null;
        }
    }

    public Map<String, String> getUserProfiles(boolean z4) {
        if (klm != null) {
            if (ba.lmn()) {
                return klm.lmn(z4);
            }
            try {
                SyncManager.getInstance().await(SyncManager.TaskNames.INIT_TASK_OPENNESS, 150L);
                return klm.lmn(z4);
            } catch (InterruptedException unused) {
                HiLog.w("HiAnalyticsCreation", "getAAID Interrupted Exception");
            }
        }
        return new HashMap();
    }

    public boolean isRestrictionEnabled() {
        if (klm != null) {
            return ba.lmn() ? klm.ijk() : ba.ijk();
        }
        return false;
    }

    public boolean isRestrictionShared() {
        if (klm == null) {
            return true;
        }
        if (ba.lmn()) {
            return klm.hij();
        }
        try {
            SyncManager.getInstance().await(SyncManager.TaskNames.INIT_TASK_OPENNESS, 150L);
            return klm.hij();
        } catch (InterruptedException unused) {
            HiLog.w("HiAnalyticsCreation", "isRestrictionShared Interrupted Exception");
            return true;
        }
    }

    public void onEvent(final String str, Bundle bundle) {
        if (klm != null) {
            final Bundle lmn2 = dd.lmn(bundle);
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.6
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(str, lmn2);
                    }
                }
            });
        }
    }

    public void onNewIntent(final Intent intent) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.18
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(intent);
                    }
                }
            });
        }
    }

    public void pageEnd(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.25
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ghi(str);
                    }
                }
            });
        }
    }

    public void pageStart(final String str, final String str2) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.24
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.klm(str, str2);
                    }
                }
            });
        }
    }

    @Deprecated
    public void regHmsSvcEvent() {
    }

    public void setAnalyticsEnabled(final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.19
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ghi(z4);
                    }
                }
            });
        }
    }

    @Deprecated
    public void setAutoCollectionEnabled(boolean z4) {
    }

    public void setChannel(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.15
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.def(str);
                    }
                }
            });
        }
    }

    public void setCollectAdsIdEnabled(final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ikl(z4);
                    }
                }
            });
        }
    }

    @Deprecated
    public void setCurrentActivity(final Activity activity, final String str, final String str2) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.14
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(activity, str, str2);
                    }
                }
            });
        }
    }

    public void setCustomReferrer(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.cde(str);
                    }
                }
            });
        }
    }

    public void setMinActivitySessions(final long j5) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.20
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ikl(j5);
                    }
                }
            });
        }
    }

    public void setPropertyCollection(final String str, final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.17
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(str, z4);
                    }
                }
            });
        }
    }

    public void setPushToken(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.efg(str);
                    }
                }
            });
        }
    }

    public void setPushTokenCollectionEnabled(final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.16
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.fgh(z4);
                    }
                }
            });
        }
    }

    public void setReportPolicies(Set<ReportPolicy> set) {
        if (klm != null) {
            final HashSet hashSet = new HashSet(set);
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(hashSet);
                    }
                }
            });
        }
    }

    public void setRestrictionEnabled(final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.hij(z4);
                    }
                }
            });
        }
    }

    public void setRestrictionShared(final boolean z4) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ijk(z4);
                    }
                }
            });
        }
    }

    public void setSessionDuration(final long j5) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.21
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ijk(j5);
                    }
                }
            });
        }
    }

    public void setUserId(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.fgh(str);
                    }
                }
            });
        }
    }

    public void setUserProfile(final String str, final String str2) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.23
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(str, str2);
                    }
                }
            });
        }
    }

    public void setWXAppId(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.13
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.hij(str);
                    }
                }
            });
        }
    }

    public void setWXOpenId(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ijk(str);
                    }
                }
            });
        }
    }

    public void setWXUnionId(final String str) {
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.10
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.ikl(str);
                    }
                }
            });
        }
    }

    @Deprecated
    public void unRegHmsSvcEvent() {
    }

    public void writeLog(HALogConfig hALogConfig, final String str) {
        if (hALogConfig == null) {
            HiLog.w("HiAnalyticsCreation", "log config is null");
            return;
        }
        final HALogConfig hALogConfig2 = new HALogConfig(hALogConfig);
        if (klm != null) {
            cx.lmn().lmn(new Runnable() { // from class: com.huawei.hms.analytics.HiAnalyticsInstance.7
                @Override // java.lang.Runnable
                public final void run() {
                    if (ba.lmn()) {
                        HiAnalyticsInstance.klm.lmn(hALogConfig2, str);
                    }
                }
            });
        }
    }
}

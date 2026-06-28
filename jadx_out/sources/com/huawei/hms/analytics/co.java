package com.huawei.hms.analytics;

import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.database.LogConfig;
import com.huawei.hms.analytics.database.LogConfigDao;
import com.huawei.hms.analytics.database.LogEvent;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;
import com.huawei.hms.analytics.type.HALogConfig;
import com.huawei.hms.analytics.type.HAParamType;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class co implements Runnable {
    private be hij;
    private final String ijk;
    private final String klm;
    private final HALogConfig lmn;
    private final String ikl = String.valueOf(System.currentTimeMillis());
    private final bu ghi = new bu();

    public co(HALogConfig hALogConfig, String str, String str2) {
        this.lmn = hALogConfig;
        this.klm = str2;
        this.ijk = str;
    }

    private long lmn(LogConfig logConfig) {
        long lmn;
        String str;
        JSONObject lmn2 = dd.lmn(this.lmn.getTags());
        if (logConfig != null) {
            logConfig.setLogTags(lmn2 != null ? lmn2.toString() : "");
            this.hij.klm(logConfig);
            lmn = logConfig.getId().longValue();
            str = "update indexId: ";
        } else {
            LogConfig logConfig2 = new LogConfig();
            logConfig2.setLogTags(lmn2 != null ? lmn2.toString() : "");
            logConfig2.setLogGroupId(this.lmn.getLogGroupId());
            logConfig2.setLogStreamId(this.lmn.getLogStreamId());
            logConfig2.setRegion(this.lmn.getRegion());
            logConfig2.setProjectId(this.lmn.getProjectId());
            lmn = this.hij.lmn(logConfig2);
            str = "insert indexId: ";
        }
        HiLog.d("LogEvtRecord", str.concat(String.valueOf(lmn)));
        return lmn;
    }

    private void lmn(Long l5) {
        LogEvent logEvent = new LogEvent();
        logEvent.setConfigId(l5);
        logEvent.setEvtTime(this.ikl);
        try {
            logEvent.setContent(new JSONObject().put(HAParamType.CONTENT, this.klm).toString());
        } catch (JSONException unused) {
            HiLog.w("LogEvtRecord", "setContent json exception");
        }
        logEvent.setEventId(this.ijk);
        this.hij.lmn(logEvent);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            be lmn = be.lmn();
            this.hij = lmn;
            LogConfig u4 = lmn.lmn.lmn.queryBuilder().M(LogConfigDao.Properties.klm.b(this.lmn.getRegion()), new org.greenrobot.greendao.query.m[0]).M(LogConfigDao.Properties.ikl.b(this.lmn.getProjectId()), new org.greenrobot.greendao.query.m[0]).M(LogConfigDao.Properties.ijk.b(this.lmn.getLogGroupId()), new org.greenrobot.greendao.query.m[0]).M(LogConfigDao.Properties.hij.b(this.lmn.getLogStreamId()), new org.greenrobot.greendao.query.m[0]).e().l().u();
            if (this.ghi.decide(IStoragePolicy.PolicyType.STORAGELENGTH, "ha_levt.db") || this.hij.klm() > 5000) {
                HiLog.w("LogEvtRecord", "log db file reach max limited size,clear it");
                this.hij.ikl();
                lmn(Long.valueOf(lmn(u4)));
                return;
            }
            lmn(Long.valueOf(lmn(u4)));
            long klm = this.hij.klm();
            HiLog.d("LogEvtRecord", "count: ".concat(String.valueOf(klm)));
            if (this.ghi.decide(IStoragePolicy.PolicyType.STORAGESIZE, klm) && this.ghi.decide(IStoragePolicy.PolicyType.NETWORK, "")) {
                at atVar = ar.lmn().lmn;
                long j5 = atVar.f8150l;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - j5 <= com.tendcloud.tenddata.ab.aa) {
                    HiLog.w("LogEvtRecord", "log autoReport timeout. interval < 30s ");
                    return;
                }
                bh lmn2 = fgh.lmn().lmn("_openness_config_tag");
                if (lmn2 != null) {
                    lmn2.klm();
                    atVar.f8150l = currentTimeMillis;
                }
            }
        } catch (bc.lmn unused) {
            HiLog.e("LogEvtRecord", "log db init failed");
        }
    }
}

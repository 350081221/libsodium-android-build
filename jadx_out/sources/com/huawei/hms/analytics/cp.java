package com.huawei.hms.analytics;

import android.text.TextUtils;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.database.LogConfig;
import com.huawei.hms.analytics.database.LogEvent;
import com.huawei.hms.analytics.database.LogEventDao;
import com.huawei.hms.analytics.df;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cp implements Runnable {
    private final boolean hij;
    private final String ijk;
    private int ikl;
    private be klm;
    private cn lmn;

    public cp(String str, boolean z4) {
        this.ijk = str;
        this.hij = z4;
    }

    private void lmn() {
        String str;
        if (this.lmn.lmn()) {
            try {
                new cq(this.lmn, this.ijk, this.hij).lmn();
                return;
            } catch (Exception unused) {
                str = "event model json error";
            }
        } else {
            str = "cache log event is error";
        }
        HiLog.e("LgEvtReport", str);
        this.klm.lmn(this.lmn.klm);
        this.lmn.ijk();
    }

    private boolean lmn(LogConfig logConfig, List<LogEvent> list) {
        List<LogEvent> subList;
        int i5;
        cn cnVar;
        try {
            int i6 = this.ikl;
            subList = i6 > 0 ? list.subList(i6, list.size()) : list;
            i5 = this.ikl;
            cnVar = this.lmn;
        } catch (IllegalArgumentException | JSONException e5) {
            HiLog.w("LgEvtReport", "construct Event JsonArray exception." + e5.getMessage());
            this.klm.lmn.klm.deleteInTx(list);
        }
        if (logConfig == null) {
            throw new IllegalArgumentException("log config is null");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("projectId", logConfig.getProjectId());
        jSONObject.put("groupId", logConfig.getLogGroupId());
        jSONObject.put("streamId", logConfig.getLogStreamId());
        jSONObject.put("tags", TextUtils.isEmpty(logConfig.getLogTags()) ? new JSONObject() : new JSONObject(logConfig.getLogTags()));
        if (!cnVar.ijk.contains(logConfig.getId())) {
            cnVar.ijk.add(logConfig.getId());
        }
        JSONArray jSONArray = new JSONArray();
        int lmn = cnVar.lmn(jSONArray, subList);
        cnVar.ikl = lmn == subList.size();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("events_common", jSONObject);
        jSONObject2.put(com.umeng.analytics.pro.d.ax, jSONArray);
        cnVar.lmn.put(jSONObject2);
        int i7 = i5 + lmn;
        this.ikl = i7;
        return i7 < list.size();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (new bu().lmn(this.ijk)) {
            try {
                be lmn = be.lmn();
                this.klm = lmn;
                List<LogConfig> loadAll = lmn.lmn.lmn.loadAll();
                if (loadAll == null || loadAll.size() == 0) {
                    HiLog.w("LgEvtReport", "No have log events in cache");
                    if (this.klm.klm() > 0) {
                        this.klm.ikl();
                        return;
                    }
                    return;
                }
                this.lmn = new cn(loadAll.size());
                Collections.sort(loadAll, new df.klm());
                for (LogConfig logConfig : loadAll) {
                    List<LogEvent> n5 = this.klm.lmn.klm.queryBuilder().M(LogEventDao.Properties.ikl.b(logConfig.getId()), new org.greenrobot.greendao.query.m[0]).e().l().n();
                    if (n5 == null || n5.size() == 0) {
                        this.klm.lmn.lmn.delete(logConfig);
                        cn cnVar = this.lmn;
                        cnVar.ghi--;
                    } else {
                        this.ikl = 0;
                        if (TextUtils.isEmpty(this.lmn.fgh)) {
                            this.lmn.fgh = logConfig.getRegion();
                        }
                        while (true) {
                            if (!this.lmn.fgh.equals(logConfig.getRegion()) || lmn(logConfig, n5)) {
                                lmn();
                                this.lmn.fgh = logConfig.getRegion();
                            }
                        }
                    }
                }
                lmn();
            } catch (bc.lmn unused) {
                HiLog.e("LgEvtReport", "log db init failed");
            }
        }
    }
}

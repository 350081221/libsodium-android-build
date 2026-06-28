package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.database.APIEvent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class cd {
    public static APIEvent klm(cc ccVar) {
        return new APIEvent("rpt_api_dist", String.valueOf(System.currentTimeMillis()), "0", ccVar.ikl, ccVar.lmn, ccVar.klm, ccVar.ijk, "1", String.valueOf(ccVar.lmn()));
    }

    public static synchronized cc lmn(String str) {
        cc ccVar;
        synchronized (cd.class) {
            ccVar = new cc();
            ccVar.ikl = str;
        }
        return ccVar;
    }

    public static synchronized void lmn(cc ccVar) {
        synchronized (cd.class) {
            if (!ar.lmn().lmn.fgh) {
                HiLog.w("APIEvtRecordHolder", "The Analytics Kit is disabled, don't record");
                return;
            }
            if (ccVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(klm(ccVar));
                try {
                    cx.klm().lmn(new cg(arrayList));
                } catch (Exception unused) {
                    HiLog.e("APIEvtRecordHolder", "HMSBIInitializer init failed");
                } catch (NoClassDefFoundError unused2) {
                    HiLog.e("APIEvtRecordHolder", HiLog.ErrorCode.IE004, "HMSBIInitializer init failed,Missing hms sdk");
                }
            }
        }
    }

    public static void lmn(Map<String, Integer> map, String str, long j5, int i5) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("APIEvtRecordHolder", "The Analytics Kit is disabled, don't record");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            arrayList.add(new APIEvent("rpt_api_dist", String.valueOf(System.currentTimeMillis()), "1", str, i5 == 200 ? "0" : "1", String.valueOf(i5), entry.getKey(), String.valueOf(entry.getValue()), String.valueOf(j5)));
        }
        try {
            cx.klm().lmn(new cg(arrayList));
        } catch (Exception unused) {
            HiLog.e("APIEvtRecordHolder", "HMSBIInitializer init failed!");
        } catch (NoClassDefFoundError unused2) {
            HiLog.e("APIEvtRecordHolder", HiLog.ErrorCode.IE004, "HMSBIInitializer init failed,Missing hms sdk!");
        }
    }
}

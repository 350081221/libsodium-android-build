package com.huawei.hms.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteFullException;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.database.APIEvent;
import java.util.List;

/* loaded from: classes3.dex */
public final class cg implements Runnable {
    private bc ikl;
    private List<APIEvent> klm;
    private Context lmn;

    public cg(List<APIEvent> list) {
        Context context = ar.lmn().lmn.ghi;
        this.lmn = context;
        this.klm = list;
        this.ikl = bc.lmn(context);
        ce.lmn(this.lmn);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        List<APIEvent> list = this.klm;
        if (list == null || list.size() == 0) {
            HiLog.w("EventApiUsageRecordMission", "apiEvents is empty, no data save");
            return;
        }
        long klm = dl.klm(this.lmn, "latest_upload_time", "apiUsageUploadKey");
        long currentTimeMillis = System.currentTimeMillis();
        if (klm == -1) {
            dl.lmn(this.lmn, "latest_upload_time", "apiUsageUploadKey", currentTimeMillis);
        } else if (currentTimeMillis - klm > 86400000) {
            HiLog.i("EventApiUsageRecordMission", "api usage cycle is exceeded the threshold.");
            dl.lmn(this.lmn, "latest_upload_time", "apiUsageUploadKey", currentTimeMillis);
            z4 = true;
            if (!z4 || this.klm.size() > 20) {
                HiLog.i("EventApiUsageRecordMission", "auto report api data for bi");
                List<APIEvent> ijk = this.ikl.ijk();
                this.ikl.klm();
                this.klm.addAll(ijk);
                ce.lmn(this.lmn).lmn(this.klm);
            }
            List<APIEvent> ijk2 = this.ikl.ijk();
            if (ijk2.size() + this.klm.size() > 20) {
                HiLog.i("EventApiUsageRecordMission", "auto report api data for bi");
                this.klm.addAll(ijk2);
                this.ikl.klm();
                ce.lmn(this.lmn).lmn(ijk2);
                return;
            }
            bc bcVar = this.ikl;
            try {
                bcVar.lmn.getAPIEventDao().insertInTx(this.klm);
                return;
            } catch (SQLiteFullException e5) {
                HiLog.w("DBCommander", "SQLite full exception");
                bcVar.lmn.getAPIEventDao().deleteAll();
                di.lmn(e5);
                return;
            }
        }
        z4 = false;
        if (z4) {
        }
        HiLog.i("EventApiUsageRecordMission", "auto report api data for bi");
        List<APIEvent> ijk3 = this.ikl.ijk();
        this.ikl.klm();
        this.klm.addAll(ijk3);
        ce.lmn(this.lmn).lmn(this.klm);
    }
}

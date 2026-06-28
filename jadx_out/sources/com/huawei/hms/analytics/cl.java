package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class cl implements ICallback {
    public boolean lmn = false;
    private boolean ikl = false;
    public boolean klm = true;

    private static void klm(List<String> list) {
        Context context = ar.lmn().lmn.ghi;
        try {
            JSONArray jSONArray = new JSONArray(dl.klm(context, "global_v2", "camp_evt", ""));
            JSONArray jSONArray2 = new JSONArray();
            int length = jSONArray.length();
            if (length == 0) {
                return;
            }
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                if (!list.contains(jSONObject.getString("f")) && !dc.klm(jSONObject.getString(com.umeng.analytics.pro.bi.aL))) {
                    jSONArray2.put(jSONArray.getJSONObject(i5));
                }
            }
            if (jSONArray2.length() == 0) {
                dl.lmn(ar.lmn().lmn.ghi, "global_v2", "camp_evt");
            } else if (jSONArray2.length() != length) {
                dl.lmn(context, "global_v2", "camp_evt", jSONArray2.toString());
            }
        } catch (JSONException unused) {
            dl.lmn(ar.lmn().lmn.ghi, "global_v2", "camp_evt");
        }
    }

    private static List<String> lmn(List<Event> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Event> it = list.iterator();
        while (it.hasNext()) {
            String pushEvtFlag = it.next().getPushEvtFlag();
            if (!TextUtils.isEmpty(pushEvtFlag)) {
                arrayList.add(pushEvtFlag);
            }
        }
        return arrayList;
    }

    private void lmn(int i5, int i6, List<Event> list) {
        if (this.lmn) {
            klm(lmn(list));
        }
        if (i5 == 200 || i6 == -2) {
            return;
        }
        if (!isStopEvent() || list.size() != 1 || !isNeedStorage()) {
            if (this.lmn) {
                fgh.lmn().lmn(list.get(0).getServiceTag()).klm(list);
            }
        } else {
            JSONObject json = list.get(0).toJson();
            if (json == null) {
                return;
            }
            dl.lmn(ar.lmn().lmn.ghi, "stop_v2_1", "stop_event", json.toString());
        }
    }

    @Override // com.huawei.hms.analytics.framework.config.ICallback
    public final boolean isAAIDChanged(String str, boolean z4) {
        if (!"_openness_config_tag".equals(str) || !cy.lmn().klm(ar.lmn().lmn.ghi)) {
            return false;
        }
        ar.lmn().lmn.f8154p = false;
        HiLog.i("ReportRingback", "aaid is changed,then reset");
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            bh lmn = fgh.lmn().lmn(str);
            if (!(lmn instanceof ijk)) {
                return true;
            }
            ((ijk) lmn).klm(z4);
            return true;
        } catch (Exception e5) {
            HiLog.w("ReportRingback", "reset analytics exception: " + e5.getMessage());
            return true;
        }
    }

    @Override // com.huawei.hms.analytics.framework.config.ICallback
    public final boolean isNeedStorage() {
        return this.klm;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICallback
    public final boolean isStopEvent() {
        return this.ikl;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICallback
    public final void onResult(int i5, long j5, int i6, List<Event> list) {
        HiLog.i("ReportRingback", "report callback");
        if (dg.ghi(ar.lmn().lmn.ghi)) {
            HiLog.i("ReportRingback", "do not enable APIEvt in debug model");
            return;
        }
        if (list == null || list.size() == 0) {
            return;
        }
        if (i5 == -1) {
            lmn(i5, i6, list);
            return;
        }
        if (i5 == 200) {
            try {
                bo.lmn();
                if (bo.ikl() && bc.lmn(ar.lmn().lmn.ghi).ikl().size() == 0) {
                    bo.lmn().ijk();
                }
            } catch (bc.lmn unused) {
                HiLog.w("ReportRingback", "checkLocalKeyRefresh, DBException, init DB error");
            }
        }
        lmn(i5, i6, list);
        long currentTimeMillis = System.currentTimeMillis() - j5;
        HashMap hashMap = new HashMap();
        Iterator<Event> it = list.iterator();
        while (it.hasNext()) {
            String evtId = it.next().getEvtId();
            Integer num = (Integer) hashMap.get(evtId);
            int i7 = 1;
            if (num != null) {
                i7 = 1 + num.intValue();
            }
            hashMap.put(evtId, Integer.valueOf(i7));
        }
        cd.lmn(hashMap, "ITransportHandler#execute()", currentTimeMillis, i5);
    }

    @Override // com.huawei.hms.analytics.framework.config.ICallback
    public final void setStopEventReport(boolean z4) {
        this.ikl = z4;
    }
}

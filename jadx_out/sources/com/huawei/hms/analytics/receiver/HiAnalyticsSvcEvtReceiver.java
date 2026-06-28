package com.huawei.hms.analytics.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.ar;
import com.huawei.hms.analytics.ba;
import com.huawei.hms.analytics.bh;
import com.huawei.hms.analytics.bw;
import com.huawei.hms.analytics.cc;
import com.huawei.hms.analytics.cd;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.di;
import com.huawei.hms.analytics.dj;
import com.huawei.hms.analytics.dq;
import com.huawei.hms.analytics.fgh;
import com.huawei.hms.analytics.type.HAParamType;
import com.umeng.analytics.pro.bi;

/* loaded from: classes3.dex */
public class HiAnalyticsSvcEvtReceiver extends BroadcastReceiver {
    private static boolean lmn(Intent intent) {
        if (intent == null) {
            HiLog.w("HiAnalyticsSvcEvtAccepter", "intent is null");
            return true;
        }
        if (intent instanceof SafeIntent) {
            HiLog.i("HiAnalyticsSvcEvtAccepter", "safe intent");
            return ((SafeIntent) intent).lmn();
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        HiLog.i("HiAnalyticsSvcEvtAccepter", "onReceive is running");
        try {
            boolean z4 = true;
            if (dq.lmn().lmn(context)) {
                if (!ar.lmn().lmn.fgh) {
                    str = "isAnalyticsEnabled is false";
                } else if (!ba.lmn()) {
                    str = "openness init failed";
                } else if (lmn(intent)) {
                    str = "hasIntentBomb";
                } else {
                    z4 = false;
                }
                HiLog.w("HiAnalyticsSvcEvtAccepter", str);
            }
            if (z4) {
                return;
            }
            if (context == null || intent == null) {
                HiLog.e("SvcEvtReceiverHolder", "context or intent is null");
                return;
            }
            if (ar.lmn().lmn.ghi == null) {
                HiLog.w("SvcEvtReceiverHolder", "Check whether the SDK is initialized.");
                return;
            }
            SafeIntent safeIntent = new SafeIntent(intent);
            bw bwVar = new bw(safeIntent.getExtras());
            if (!"com.huawei.hms.analytics.pps.event".equals(safeIntent.getAction())) {
                HiLog.w("SvcEvtReceiverHolder", "onReceive : event is not ads");
                return;
            }
            HiLog.i("SvcEvtReceiverHolder", "onReceive : event is ads");
            bw bwVar2 = new bw(bwVar.lmn("event_detail"));
            String klm = bwVar2.klm("event_type");
            if (TextUtils.isEmpty(klm) || (!"$RequestAd".equals(klm) && !"$DisplayAd".equals(klm) && !"$ClickAd".equals(klm) && !"$ObtainAdAward".equals(klm))) {
                klm = "";
            }
            String klm2 = bwVar2.klm(bi.f12269o);
            cc lmn = cd.lmn("SvcEvtReceiverHandler#handlerADSEvt(Bundle)");
            if (!TextUtils.isEmpty(klm) && !TextUtils.isEmpty(klm2)) {
                if (!klm2.equals(ar.lmn().lmn.ghi.getPackageName())) {
                    HiLog.w("SvcEvtReceiverHolder", "3rd package names are not equal");
                    lmn.ijk = klm;
                    cd.lmn(lmn);
                    return;
                }
                Bundle bundle = new Bundle();
                String klm3 = bwVar2.klm("slot_id");
                String klm4 = bwVar2.klm("activity_name");
                String klm5 = bwVar2.klm("sub_type");
                if (TextUtils.isEmpty(klm3)) {
                    klm3 = "";
                }
                bundle.putString(HAParamType.MATERIALSLOT, klm3);
                if (TextUtils.isEmpty(klm4)) {
                    klm4 = "";
                }
                bundle.putString("$CurActivityName", klm4);
                bundle.putString("$EvtType", "Supplier");
                bundle.putString("$AdReqType", TextUtils.isEmpty(klm5) ? "" : klm5);
                HiLog.i("SvcEvtReceiverHolder", "start onEvent");
                bh lmn2 = fgh.lmn().lmn("_openness_config_tag");
                if (lmn2 != null) {
                    lmn2.lmn(klm, new dj(klm, bundle), System.currentTimeMillis());
                }
                lmn.ijk = klm;
                lmn.lmn = "0";
                cd.lmn(lmn);
                return;
            }
            HiLog.w("SvcEvtReceiverHolder", "event_type or package_name is empty");
            lmn.ijk = klm;
            cd.lmn(lmn);
        } catch (Throwable th) {
            HiLog.w("HiAnalyticsSvcEvtAccepter", "SvcEvtReceiver onReceive error." + th.getMessage());
            di.lmn(th);
        }
    }
}

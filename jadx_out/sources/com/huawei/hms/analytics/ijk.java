package com.huawei.hms.analytics;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.analytics.av;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.bcd;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.framework.HAFrameworkInstance;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.config.RomAttributeCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ijk implements bh {
    protected final ICollectorConfig ghi;
    public String hij;
    public Context ijk;
    bj ikl;
    protected HAFrameworkInstance.Builder klm;
    protected HAFrameworkInstance lmn;

    /* loaded from: classes3.dex */
    public class lmn {
        public lmn() {
        }

        public final void lmn() {
            ijk.this.lmn.clearCacheData("oper");
            ijk.this.ikl();
            cy.lmn().ikl(ijk.this.ijk);
            try {
                cy.lmn();
                cy.ijk();
            } catch (Exception unused) {
                HiLog.e("createInstance", "bindService error");
            }
            ar.lmn().ikl().ghi();
            ar.lmn().klm().ghi();
            at atVar = ar.lmn().lmn;
            atVar.bcd = "";
            atVar.f8143e = "";
            atVar.f8142d = "";
            atVar.cde = "";
            atVar.f8145g = "";
            atVar.f8159u = "";
            atVar.f8158t = "";
            atVar.f8157s = "";
            atVar.f8153o = "";
            atVar.f8154p = false;
            atVar.f8160v = "";
            atVar.f8161w = 0L;
            atVar.f8155q = 0L;
            dl.lmn(ijk.this.ijk, "global_v2", "push_token", "ab_info", "w_app_id", "api_channel", "camp_info", "is_new_user", "sig_flg", "is_cs_refr_run");
            ijk.this.lmn.setNeedRefreshSession(true);
            bcd lmn = bcd.lmn();
            lmn.lmn.clear();
            lmn.ikl.lmn();
            bcd.lmn lmnVar = lmn.ijk;
            if (lmnVar != null) {
                lmnVar.lmn();
            }
            lmn.ghi = 0L;
            lmn.hij = null;
            lmn.cde.clear();
            lmn.bcd.clear();
            ijk.this.hij("clearCachedData");
        }
    }

    public ijk(Context context, String str) {
        this.ijk = context;
        ar.lmn().lmn.ghi = context;
        this.hij = str;
        this.ikl = bj.lmn(context);
        bq bqVar = new bq(str);
        this.ghi = bqVar;
        HAFrameworkInstance.Builder builder = new HAFrameworkInstance.Builder();
        this.klm = builder;
        builder.setStorageHandler(bd.lmn(context)).setStoragePolicy(new bu(str)).setCollectorConfig(bqVar).setMandatoryParameters(new bt());
    }

    private av fgh(String str) {
        av avVar = ar.lmn().lmn.f8156r;
        long currentTimeMillis = System.currentTimeMillis();
        if (avVar == null) {
            avVar = ca.lmn(this.ijk);
            if (avVar == null) {
                ca.klm(this.ijk, str, currentTimeMillis);
                return null;
            }
            ar.lmn().lmn.f8156r = avVar;
        }
        if (!avVar.lmn(str)) {
            return null;
        }
        ca.klm(this.ijk, str, currentTimeMillis);
        return avVar;
    }

    private boolean ghi(String str) {
        String lmn2 = ar.lmn().lmn.f8152n.lmn(this.hij);
        if (("_openness_config_tag".equals(this.hij) || "AGC_TAG".equals(this.hij)) && "CN".equals(lmn2)) {
            return lmn(str, lmn2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hij(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        dl.lmn(this.ijk, "global_v2", "firstRunTime", String.valueOf(currentTimeMillis));
        Bundle bundle = new Bundle();
        bundle.putString("$StartType", "");
        bundle.putString("$OccurredType", str);
        ikl("$LaunchApp", new dj("$LaunchApp", bundle), System.currentTimeMillis());
        bundle.clear();
        bundle.putString("$StartType", "");
        bundle.putString("$OccurredType", str);
        bundle.putString("$InstallChannel", "");
        ikl("$AppFirstOpen", new dj("$AppFirstOpen", bundle), currentTimeMillis);
    }

    private static boolean ijk(String str) {
        if (ba.lmn(str)) {
            return true;
        }
        HiLog.e("createInstance", "Stop report! Instance init failed: ".concat(String.valueOf(str)));
        return false;
    }

    private void ikl(String str, dj djVar, long j5) {
        lmn(str, djVar.lmn, j5);
        if (dg.ghi(this.ijk)) {
            this.lmn.onStreamEvent("oper", djVar.ikl, new cl(), j5);
        } else {
            if (!ghi(str)) {
                this.lmn.onEventRecord("oper", djVar.ikl, j5);
                return;
            }
            cl clVar = new cl();
            clVar.lmn = true;
            this.lmn.onStreamEvent("oper", djVar.ikl, clVar, j5);
        }
    }

    private void ikl(List<JSONObject> list) {
        this.lmn.onEvent("oper", list, new cl());
    }

    private static boolean ikl(String str) {
        String str2;
        String str3;
        if (str.length() > 256) {
            str2 = HiLog.ErrorCode.PE002;
            str3 = " Length of eventId exceeds the limit. Max Length is 256.";
        } else {
            if (dc.lmn("eventId", str, am.klm)) {
                return true;
            }
            str2 = HiLog.ErrorCode.PE006;
            str3 = " eventId pattern error";
        }
        HiLog.w("instanceimpl", str2, str3);
        return false;
    }

    private boolean klm(String str, dj djVar) {
        String str2;
        String str3;
        String str4;
        if ("_openness_config_tag".equals(this.hij)) {
            if (!ikl(str)) {
                return true;
            }
        } else if (str.length() > 256) {
            str2 = HiLog.ErrorCode.PE002;
            str3 = " Length of eventId exceeds the limit. Max Length is 256.";
            str4 = "instanceimpl";
            HiLog.w(str4, str2, str3);
            return true;
        }
        if (djVar.klm(djVar.klm)) {
            return false;
        }
        str2 = HiLog.ErrorCode.PE006;
        str3 = "bundle params is invalid.";
        str4 = "createInstance";
        HiLog.w(str4, str2, str3);
        return true;
    }

    private static boolean lmn(long j5, List<av.ikl> list) {
        if (list == null) {
            return false;
        }
        for (av.ikl iklVar : list) {
            if (iklVar != null && j5 > iklVar.lmn.longValue() && j5 < iklVar.klm.longValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean lmn(String str, String str2) {
        av fgh = fgh(str2);
        if (fgh == null || !fgh.ghi) {
            return false;
        }
        List<av.klm> list = fgh.klm;
        if (list == null) {
            HiLog.d("createInstance", "camp stream evts is empty");
            return false;
        }
        for (av.klm klmVar : list) {
            if (str.equals(klmVar.lmn)) {
                if (lmn(System.currentTimeMillis(), klmVar.klm)) {
                    return true;
                }
            }
        }
        return false;
    }

    final void ikl() {
        if (dl.lmn(this.ijk, "global_v2", "is_log")) {
            try {
                be.lmn().ikl();
            } catch (bc.lmn unused) {
                HiLog.e("createInstance", "log db init failed");
            }
        }
    }

    @Override // com.huawei.hms.analytics.bh
    public final void klm() {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("createInstance", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
        } else if (ijk(this.hij) && dl.lmn(this.ijk, "global_v2", "is_log")) {
            cx.ijk().lmn(new cp(ar.lmn().lmn.f8152n.ghi, false));
        }
    }

    @Override // com.huawei.hms.analytics.bh
    public final void klm(long j5) {
        this.lmn.onBackground(j5);
    }

    @Override // com.huawei.hms.analytics.bh
    public final void klm(String str) {
        if (ar.lmn().lmn.fgh) {
            this.lmn.onReport(str, "oper", new cl());
            return;
        }
        HiLog.w("createInstance", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
        try {
            bd.lmn(this.ijk).deleteByTag(this.hij);
        } catch (bc.lmn unused) {
            HiLog.e("createInstance", "delete db exception");
        }
        if (ar.lmn().lmn.f8139a != null) {
            ar.lmn().lmn.f8139a.lmn();
        }
    }

    public final void klm(String str, dj djVar, long j5) {
        bj.klm().lmn(this.hij, "oper", str, djVar.lmn);
        bj.lmn().lmn(str, djVar.lmn);
        cl clVar = new cl();
        clVar.lmn = true;
        this.lmn.onStreamEvent("oper", djVar.ikl, clVar, j5);
    }

    @Override // com.huawei.hms.analytics.bh
    public final void klm(List<Event> list) {
        this.lmn.onEvent(list, new cl());
    }

    public final void klm(boolean z4) {
        ar.lmn().lmn.f8161w = 0L;
        this.lmn.clearCacheData("oper");
        ikl();
        dl.lmn(this.ijk, "global_v2", "is_new_user");
        this.lmn.setNeedRefreshSession(true);
        if (z4) {
            hij("aaidReset");
        }
        try {
            cy.lmn();
            cy.ijk();
        } catch (Exception unused) {
            HiLog.e("createInstance", "bindService error");
        }
    }

    public Map<String, String> lmn(boolean z4) {
        Map<String, String> hashMap = new HashMap<>();
        try {
            if (z4) {
                RomAttributeCollector romAttribute = this.ghi.getRomAttribute("oper");
                if (romAttribute != null) {
                    hashMap = dd.lmn(romAttribute.doCollector());
                }
            } else {
                hashMap = dd.klm(ar.lmn().klm().klm());
            }
        } catch (Throwable th) {
            HiLog.w("createInstance", "get rom attribute exception");
            di.lmn(th);
        }
        return hashMap;
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn() {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("createInstance", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
        } else if (ijk(this.hij)) {
            this.lmn.onReport("oper", new cl());
        }
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(long j5) {
        this.lmn.onForeground(j5);
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("createInstance", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
        } else if (ijk(this.hij) && dl.lmn(this.ijk, "global_v2", "is_log")) {
            cx.ijk().lmn(new cp(str, true));
        }
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(String str, Bundle bundle, long j5) {
        if (dg.ghi(this.ijk)) {
            bj.klm().lmn(this.hij, "oper", str, bundle, j5);
        } else {
            bj.klm().lmn(this.hij, "oper", str, bundle);
        }
        bj.lmn().lmn(str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        com.huawei.hms.analytics.core.log.HiLog.w("ABTskIdHolder", "Duplicate AB attributes exist in the cache.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r8 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lmn(java.lang.String r13, com.huawei.hms.analytics.dj r14) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.ijk.lmn(java.lang.String, com.huawei.hms.analytics.dj):void");
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(String str, dj djVar, long j5) {
        if (dg.ghi(this.ijk)) {
            bj.klm().lmn(this.hij, "oper", str, djVar.lmn, j5);
            bj.lmn().lmn(str, djVar.lmn);
            this.lmn.onStreamEvent("oper", djVar.ikl, new cl(), j5);
            return;
        }
        bj.klm().lmn(this.hij, "oper", str, djVar.lmn);
        bj.lmn().lmn(str, djVar.lmn);
        if (!ghi(str)) {
            this.lmn.onEvent("oper", djVar.ikl, new cl(), j5);
            return;
        }
        cl clVar = new cl();
        clVar.lmn = true;
        this.lmn.onStreamEvent("oper", djVar.ikl, clVar, j5);
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(String str, List<JSONObject> list) {
        if (ghi(str)) {
            lmn(list);
        } else {
            ikl(list);
        }
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(String str, Map<String, dj> map) {
        Set<Map.Entry<String, dj>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, dj> entry : entrySet) {
            String key = entry.getKey();
            dj value = entry.getValue();
            bj.klm().lmn(this.hij, "oper", key, value.lmn);
            bj.lmn().lmn(key, value.lmn);
            arrayList.addAll(value.ikl);
        }
        this.lmn.onReport(str, "oper", arrayList, new cl());
    }

    @Override // com.huawei.hms.analytics.bh
    public final void lmn(List<JSONObject> list) {
        this.lmn.onStreamEvent("oper", list, new cl());
    }
}

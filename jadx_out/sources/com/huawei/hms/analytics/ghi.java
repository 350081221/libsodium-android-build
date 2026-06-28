package com.huawei.hms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.analytics.bcd;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.g;
import com.huawei.hms.analytics.ijk;
import com.huawei.hms.analytics.type.HALogConfig;
import com.huawei.hms.analytics.type.HAParamType;
import com.huawei.hms.analytics.type.ReportPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ghi extends ijk implements bi {
    private g fgh;

    public ghi(Context context) {
        super(context, "_openness_config_tag");
        this.lmn = this.klm.build(this.hij);
    }

    private void def(boolean z4) {
        if ("CN".equals(ar.lmn().lmn.f8152n.lmn(this.hij))) {
            ar.lmn().lmn.def = z4;
            dl.lmn(this.ijk, "global_v2", "is_restriction_shared", z4);
        }
    }

    private void efg() {
        if (this.fgh == null) {
            this.fgh = new g(this.ijk);
        }
        try {
            this.fgh.lmn.lmn().h(new g.lmn()).k(new g.klm());
        } catch (Exception unused) {
            HiLog.w("instanceimpl", "observableManager Exception");
        }
    }

    private void efg(boolean z4) {
        dl.lmn(this.ijk, "stop_v2_1", "stop_event");
        dj djVar = new dj("$StopAnalyticsCollection", new Bundle());
        cl clVar = new cl();
        clVar.setStopEventReport(true);
        clVar.klm = z4;
        this.lmn.onStreamEvent("oper", djVar.ikl, clVar);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void cde(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setCustomReferrer");
        if (!dc.lmn(str, 256)) {
            HiLog.w("instanceimpl", "Custom referrer check failed");
            cd.lmn(lmn);
        } else {
            new cs(this).lmn(new cr(str));
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void def(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setChannel(String))");
        at atVar = ar.lmn().lmn;
        if (!TextUtils.isEmpty(atVar.ijk)) {
            HiLog.w("instanceimpl", "channel already exists in manifest file");
            cd.lmn(lmn);
        } else {
            if (!TextUtils.isEmpty(atVar.lmn())) {
                HiLog.w("instanceimpl", "duplicate set,channel already exists");
                cd.lmn(lmn);
                return;
            }
            String lmn2 = dg.lmn(str);
            if (!TextUtils.isEmpty(lmn2)) {
                dl.lmn(this.ijk, "global_v2", "api_channel", lmn2);
                atVar.f8160v = lmn2;
                lmn.lmn = "0";
            }
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void efg(String str) {
        cc lmn = cd.lmn("HiAnalyticsInstance#setPushToken(String)");
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        if (!ar.lmn().lmn.f8162x) {
            HiLog.w("instanceimpl", "push token switch is disabled");
            cd.lmn(lmn);
            return;
        }
        if (!dc.lmn(str, 256)) {
            HiLog.w("instanceimpl", "push token check failed");
            cd.lmn(lmn);
            return;
        }
        String str2 = ar.lmn().lmn.f8153o;
        if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
            ar.lmn().lmn.f8154p = false;
        }
        ar.lmn().lmn.f8153o = str;
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final Task<String> fgh() {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return null;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#getAAID()");
        try {
            Task<String> ikl = cy.lmn().ikl();
            lmn.lmn = "0";
            return ikl;
        } finally {
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void fgh(String str) {
        String str2;
        String str3;
        String str4;
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setUserId(String)");
        Context context = this.ijk;
        if (str == null) {
            dr.lmn(context, 0);
        } else {
            if (str.isEmpty()) {
                str2 = HiLog.ErrorCode.PE001;
                str3 = "UserId is empty";
            } else {
                if (str.length() <= 256) {
                    dr.lmn(context, 1);
                    str4 = ar.lmn().lmn.bcd;
                    if (!TextUtils.isEmpty(str4) && !str4.equals(str)) {
                        this.lmn.setNeedRefreshSession(true);
                    }
                    ar.lmn().lmn.bcd = str;
                    lmn.lmn = "0";
                    cd.lmn(lmn);
                }
                str2 = HiLog.ErrorCode.PE002;
                str3 = "Length of userId exceeds the limit";
            }
            HiLog.w("UserIdHandler", str2, str3);
        }
        str = "";
        str4 = ar.lmn().lmn.bcd;
        if (!TextUtils.isEmpty(str4)) {
            this.lmn.setNeedRefreshSession(true);
        }
        ar.lmn().lmn.bcd = str;
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void fgh(boolean z4) {
        cc lmn = cd.lmn("HiAnalyticsInstance#setPushTokenCollectionEnabled(boolean))");
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        at atVar = ar.lmn().lmn;
        if (!"CN".equals(atVar.f8152n.lmn(this.hij))) {
            HiLog.w("instanceimpl", "only available in China region");
            cd.lmn(lmn);
        } else {
            dl.lmn(this.ijk, "global_v2", "push_token_collection_enable", z4);
            atVar.f8162x = z4;
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ghi() {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#clearCachedData()");
        try {
            new ijk.lmn().lmn();
            lmn.lmn = "0";
        } catch (Exception e5) {
            HiLog.w("instanceimpl", "reset analytics exception: " + e5.getMessage());
        }
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ghi(String str) {
        String str2;
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#pageEnd(String)");
        if (!dc.lmn(str, 256)) {
            HiLog.w("instanceimpl", "pageEnd: pageName check failed");
            cd.lmn(lmn);
            return;
        }
        bcd lmn2 = bcd.lmn();
        long currentTimeMillis = System.currentTimeMillis();
        HiLog.d("ActivityStatCommander", "onPageExit " + str + " with time: " + currentTimeMillis);
        bcd.lmn lmnVar = lmn2.lmn.get(str);
        if (lmnVar == null) {
            str2 = "onPageEnter should be invoked first.";
        } else {
            long j5 = lmnVar.ijk;
            long j6 = 0;
            if (j5 != 0) {
                lmn2.hij = lmnVar;
                lmn2.ghi = currentTimeMillis;
                Bundle bundle = new Bundle();
                bundle.putString("$CurActivityName", lmnVar.lmn);
                bundle.putString("$CurActivityClass", lmnVar.klm);
                bundle.putString("$CurActivityId", lmnVar.ikl);
                bundle.putString("$PrePageId", lmn2.bcd.getString("$PrevActivityClass", ""));
                bundle.putString("$CurrPageId", lmnVar.klm);
                HiLog.d("ActivityStatCommander", "onPageExit duration cal: 1. " + currentTimeMillis + " 2. " + j5);
                bundle.putString(HAParamType.DURATION, String.valueOf(Math.min(currentTimeMillis - j5, 604800000L)));
                HiLog.i("ActivityStatCommander", "onPageExit: send ScreenExit event...");
                lmn2.def.lmn("$ExitScreen", new dj("$ExitScreen", bundle), currentTimeMillis);
                if (lmn2.ijk.lmn.equals(str)) {
                    if (lmn2.lmn.size() > 1) {
                        for (Map.Entry<String, bcd.lmn> entry : lmn2.lmn.entrySet()) {
                            String key = entry.getKey();
                            bcd.lmn lmnVar2 = lmn2.lmn.get(key);
                            if (!str.equals(key) && lmnVar2 != null) {
                                long j7 = lmnVar2.ijk;
                                if (j7 > j6) {
                                    lmn2.ijk = lmn2.lmn.get(entry.getKey());
                                    j6 = j7;
                                }
                            }
                        }
                    } else {
                        lmn2.ijk = null;
                    }
                }
                lmn2.lmn.remove(str);
                lmn.lmn = "0";
                cd.lmn(lmn);
            }
            str2 = "timestamp is 0.";
        }
        HiLog.w("ActivityStatCommander", str2);
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r8 == false) goto L12;
     */
    @Override // com.huawei.hms.analytics.bi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ghi(boolean r8) {
        /*
            r7 = this;
            com.huawei.hms.analytics.ar r0 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r0 = r0.lmn
            boolean r0 = r0.fgh
            java.lang.String r1 = "instanceimpl"
            if (r0 != r8) goto L1a
            java.lang.String r0 = "The collection status is the same. isEnableAnalytics: "
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r0.concat(r8)
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r8)
            return
        L1a:
            java.lang.String r0 = "HiAnalyticsInstance#setAnalyticsEnabled(boolean)"
            com.huawei.hms.analytics.cc r0 = com.huawei.hms.analytics.cd.lmn(r0)
            com.huawei.hms.analytics.ar r2 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r2 = r2.lmn
            r2.fgh = r8
            android.content.Context r2 = r7.ijk
            java.lang.String r3 = "is_analytics_enabled"
            java.lang.String r4 = "global_v2"
            com.huawei.hms.analytics.dl.lmn(r2, r4, r3, r8)
            android.content.Context r2 = r7.ijk
            java.lang.String r3 = "is_restriction_enabled"
            boolean r2 = com.huawei.hms.analytics.dl.lmn(r2, r4, r3)
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L6f
            if (r8 != 0) goto L5d
            com.huawei.hms.analytics.ar r2 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r2 = r2.lmn
            boolean r2 = r2.efg
            if (r2 != 0) goto L5d
            com.huawei.hms.analytics.ar r2 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r2 = r2.lmn
            r2.efg = r6
            android.content.Context r2 = r7.ijk
            com.huawei.hms.analytics.dl.lmn(r2, r4, r3, r6)
        L56:
            r7.efg(r5)
            r7.def(r6)
            goto L7c
        L5d:
            if (r8 != 0) goto L7c
            com.huawei.hms.analytics.ar r2 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r2 = r2.lmn
            boolean r2 = r2.efg
            if (r2 == 0) goto L7c
            java.lang.String r2 = "The stop event has been reported."
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r2)
            goto L7c
        L6f:
            com.huawei.hms.analytics.ar r2 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r2 = r2.lmn
            r3 = r8 ^ 1
            r2.efg = r3
            if (r8 != 0) goto L7c
            goto L56
        L7c:
            r7.efg()
            java.lang.String r2 = "0"
            r0.lmn = r2
            com.huawei.hms.analytics.cd.lmn(r0)
            java.lang.String r0 = "The collection status is the differ. isEnableAnalytics: "
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r0 = r0.concat(r2)
            com.huawei.hms.analytics.core.log.HiLog.i(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "analyticsEnabled"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.put(r1, r8)
            com.huawei.hms.analytics.bk r8 = com.huawei.hms.analytics.bj.lmn()
            r8.lmn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.ghi.ghi(boolean):void");
    }

    @Override // com.huawei.hms.analytics.bi
    public final void hij(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        if (!"CN".equals(ar.lmn().lmn.f8152n.lmn(this.hij))) {
            HiLog.w("instanceimpl", "Region is not CN. This api does not take effect");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setWXAppId");
        if (!dc.lmn(str, 256)) {
            ar.lmn().lmn.f8159u = "";
            dl.lmn(this.ijk, "global_v2", "w_app_id", "");
            cd.lmn(lmn);
        } else {
            ar.lmn().lmn.f8159u = str;
            dl.lmn(this.ijk, "global_v2", "w_app_id", str);
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void hij(boolean z4) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        boolean z5 = ar.lmn().lmn.efg;
        ar.lmn().lmn.efg = z4;
        dl.lmn(this.ijk, "global_v2", "is_restriction_enabled", z4);
        if (z4 == z5) {
            HiLog.w("instanceimpl", "The enabled status is the same. isRestriction: ".concat(String.valueOf(z4)));
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setRestrictionEnabled(boolean)");
        if (z4) {
            efg(true);
            def(z4);
        }
        efg();
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final boolean hij() {
        cc lmn = cd.lmn("HiAnalyticsInstance#isRestrictionShared");
        try {
            at atVar = ar.lmn().lmn;
            if ("CN".equals(atVar.f8152n.lmn(this.hij))) {
                return atVar.def;
            }
            HiLog.w("instanceimpl", "Region is not CN. This api does not take effect");
            lmn.lmn = "0";
            cd.lmn(lmn);
            return true;
        } finally {
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ijk(long j5) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setSessionDuration(long)");
        this.lmn.setSessionTimeoutDuration(dc.lmn("sessionDuration", j5));
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ijk(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        if (!"CN".equals(ar.lmn().lmn.f8152n.lmn(this.hij))) {
            HiLog.w("instanceimpl", "Region is not CN. This api does not take effect");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setWXOpenId");
        if (!dc.lmn(str, 256)) {
            ar.lmn().lmn.f8158t = "";
            cd.lmn(lmn);
        } else {
            ar.lmn().lmn.f8158t = str;
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ijk(boolean z4) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setRestrictionShared");
        try {
            at atVar = ar.lmn().lmn;
            if (!"CN".equals(atVar.f8152n.lmn(this.hij))) {
                HiLog.w("instanceimpl", "Region is not CN. This api does not take effect");
                return;
            }
            if (atVar.efg) {
                HiLog.w("instanceimpl", "Restriction enabled, setRestrictionShared failed");
            } else {
                if (z4 == atVar.def) {
                    HiLog.w("instanceimpl", "The enabled status is the same.");
                    return;
                }
                atVar.def = z4;
                efg();
                dl.lmn(this.ijk, "global_v2", "is_restriction_shared", z4);
            }
        } finally {
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final boolean ijk() {
        cc lmn = cd.lmn("HiAnalyticsInstance#isRestrictionEnabled");
        lmn.lmn = "0";
        cd.lmn(lmn);
        return ar.lmn().lmn.efg;
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ikl(long j5) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setMinActivitySessions(long)");
        this.lmn.setMinSessionDuration(dc.lmn("minActivitySessions", j5));
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ikl(String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        if (!"CN".equals(ar.lmn().lmn.f8152n.lmn(this.hij))) {
            HiLog.w("instanceimpl", "Region is not CN. This api does not take effect");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setWXUnionId");
        if (!dc.lmn(str, 256)) {
            ar.lmn().lmn.f8157s = "";
            cd.lmn(lmn);
        } else {
            ar.lmn().lmn.f8157s = str;
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void ikl(boolean z4) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setCollectAdsIdEnabled");
        if (ar.lmn().lmn.f8149k != z4) {
            ar.lmn().lmn.f8149k = z4;
            dl.lmn(this.ijk, "global_v2", "is_enabled_adsid", z4);
        }
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void klm(String str, String str2) {
        bcd.lmn lmnVar;
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#pageStart(String,String)");
        if (!dc.lmn(str, 256) || !dc.lmn(str2, 256)) {
            HiLog.w("instanceimpl", "pageStart: pageName or pageClassOverride check failed");
            cd.lmn(lmn);
            return;
        }
        if (bcd.lmn().ikl.lmn.equals(str)) {
            HiLog.w("instanceimpl", "pageStart: pageName cannot be equals to previous pageName");
            cd.lmn(lmn);
            return;
        }
        bcd lmn2 = bcd.lmn();
        Bundle bundle = new Bundle();
        long currentTimeMillis = System.currentTimeMillis();
        HiLog.d("ActivityStatCommander", "onScreenEnter with time: ".concat(String.valueOf(currentTimeMillis)));
        bcd.lmn lmnVar2 = new bcd.lmn(str, str2, "", currentTimeMillis);
        lmn2.lmn.put(str, lmnVar2);
        HiLog.d("ActivityStatCommander", "onPageEnterSend");
        bcd.lmn lmnVar3 = lmn2.ijk;
        if (lmnVar3 == null) {
            bundle.putString("$PrevActivityName", lmn2.ikl.lmn);
            bundle.putString("$PrevActivityClass", lmn2.ikl.klm);
            bundle.putString("$PrevActivityId", lmn2.ikl.ikl);
            lmn2.bcd.putString("$PrevActivityClass", lmn2.ikl.klm);
            lmnVar = lmn2.ikl;
        } else {
            bundle.putString("$PrevActivityName", lmnVar3.lmn);
            bundle.putString("$PrevActivityClass", lmn2.ijk.klm);
            bundle.putString("$PrevActivityId", lmn2.ijk.ikl);
            lmn2.bcd.putString("$PrevActivityClass", lmn2.ijk.klm);
            lmnVar = lmn2.ijk;
        }
        bundle.putString("$PrePageId", lmnVar.klm);
        bundle.putString("$CurActivityName", lmnVar2.lmn);
        bundle.putString("$CurActivityClass", lmnVar2.klm);
        bundle.putString("$CurActivityId", lmnVar2.ikl);
        lmn2.bcd.putString("$CurActivityClass", lmnVar2.klm);
        bundle.putString("$CurrPageId", lmnVar2.klm);
        lmn2.ijk = lmnVar2;
        lmn2.def.lmn("$EnterScreen", new dj("$EnterScreen", bundle), currentTimeMillis);
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.ijk, com.huawei.hms.analytics.bi
    public final Map<String, String> lmn(boolean z4) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return new HashMap();
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#getUserProfiles(boolean)");
        Map<String, String> lmn2 = super.lmn(z4);
        try {
            if (lmn2 == null) {
                return new HashMap();
            }
            lmn.lmn = "0";
            if ("_openness_config_tag".equals(this.hij)) {
                cd.lmn(lmn);
            }
            return lmn2;
        } finally {
            if ("_openness_config_tag".equals(this.hij)) {
                cd.lmn(lmn);
            }
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(Activity activity, String str, String str2) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setCurrentActivity(Activity,String,String))");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (activity != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = activity.getClass().getCanonicalName();
                }
                String str3 = str2;
                if (dc.lmn(str, 256)) {
                    if (dc.lmn(str3, 256)) {
                        bcd.lmn().lmn(currentTimeMillis);
                        Bundle bundle = new Bundle();
                        bcd lmn2 = bcd.lmn();
                        HiLog.d("ActivityStatCommander", "onScreenEnter with time: ".concat(String.valueOf(currentTimeMillis)));
                        lmn2.lmn(new bcd.lmn(str, str3, String.valueOf(activity.getTaskId()), currentTimeMillis), bundle, currentTimeMillis);
                        lmn.lmn = "0";
                        return;
                    }
                    return;
                }
                return;
            }
            HiLog.w("instanceimpl", HiLog.ErrorCode.PE001, " activity is null,or screenName is null");
        } finally {
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(Intent intent) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#onNewIntent");
        if (intent == null) {
            HiLog.w("instanceimpl", "new intent is null");
            cd.lmn(lmn);
        } else {
            f.lmn(this.ijk, new bw(intent.getExtras()));
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(Bundle bundle) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#addDefaultEventParameters(Bundle)");
        try {
            ar.lmn().ikl().lmn(bundle);
            lmn.lmn = "0";
            cd.lmn(lmn);
        } catch (Exception unused) {
            cd.lmn(lmn);
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(HALogConfig hALogConfig, String str) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#writeLog");
        String region = hALogConfig.getRegion();
        String projectId = hALogConfig.getProjectId();
        String logGroupId = hALogConfig.getLogGroupId();
        String logStreamId = hALogConfig.getLogStreamId();
        if (!dc.lmn(region, 128) || !dc.lmn(projectId, 128) || !dc.lmn(logGroupId, 128) || !dc.lmn(logStreamId, 128)) {
            HiLog.e("instanceimpl", "The logConfigure parameter is invalid.");
            cd.lmn(lmn);
            return;
        }
        if (!dc.lmn(str, 4096)) {
            str = str.substring(0, 4096);
        }
        hALogConfig.setTags(dc.lmn(hALogConfig.getTags()));
        cx.ijk().lmn(new co(hALogConfig, "$WriteLog", str));
        Context context = this.ijk;
        if (!dl.lmn(context, "global_v2", "is_log")) {
            dl.lmn(context, "global_v2", "is_log", true);
        }
        lmn.lmn = "0";
        cd.lmn(lmn);
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(String str, Bundle bundle) {
        boolean equals;
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#onEvent(String,Bundle)");
        try {
            if (TextUtils.isEmpty(str)) {
                HiLog.w("instanceimpl", HiLog.ErrorCode.PE001, " eventId is empty");
                if ("_openness_config_tag".equals(this.hij)) {
                    lmn.ijk = "";
                    cd.lmn(lmn);
                    return;
                }
                return;
            }
            if (dc.lmn(str, an.lmn)) {
                HiLog.e("instanceimpl", HiLog.ErrorCode.PE004, str + " is reserved.");
                if (equals) {
                    return;
                } else {
                    return;
                }
            }
            if (dc.lmn(str, bundle)) {
                if ("_openness_config_tag".equals(this.hij)) {
                    lmn.ijk = str;
                    cd.lmn(lmn);
                    return;
                }
                return;
            }
            dj djVar = new dj(str, true);
            String ikl = ar.lmn().ikl().ikl();
            if (!TextUtils.isEmpty(ikl)) {
                try {
                    djVar.ijk = new JSONObject(ikl);
                } catch (JSONException unused) {
                    HiLog.w("P_CEvtHandler", "defEvtJson exception");
                }
            }
            if (bundle == null) {
                HiLog.w("instanceimpl", "bundle is null");
                bundle = new Bundle();
            }
            djVar.ikl(bundle);
            lmn(str, djVar);
            lmn.lmn = "0";
            if ("_openness_config_tag".equals(this.hij)) {
                lmn.ijk = str;
                cd.lmn(lmn);
            }
        } finally {
            if ("_openness_config_tag".equals(this.hij)) {
                lmn.ijk = str;
                cd.lmn(lmn);
            }
        }
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(String str, String str2) {
        if (!ar.lmn().lmn.fgh) {
            HiLog.w("instanceimpl", HiLog.ErrorCode.IE006, "The Analytics Kit is disabled");
            return;
        }
        cc lmn = cd.lmn("HiAnalyticsInstance#setUserProfile(String,String)");
        if (!dc.lmn(str, str2)) {
            HiLog.w("instanceimpl", "userProperties check failed");
            cd.lmn(lmn);
        } else {
            try {
                ar.lmn().klm().lmn(str, (Object) str2);
            } catch (JSONException unused) {
                HiLog.e("instanceimpl", "add userProper json exception");
            }
            lmn.lmn = "0";
            cd.lmn(lmn);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r6 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        if (r1.contains(r2) == false) goto L18;
     */
    @Override // com.huawei.hms.analytics.bi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lmn(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            com.huawei.hms.analytics.ar r0 = com.huawei.hms.analytics.ar.lmn()
            com.huawei.hms.analytics.at r0 = r0.lmn
            boolean r0 = r0.fgh
            java.lang.String r1 = "instanceimpl"
            if (r0 != 0) goto L14
            java.lang.String r5 = "IE-006"
            java.lang.String r6 = "The Analytics Kit is disabled"
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r5, r6)
            return
        L14:
            java.lang.String r0 = "HiAnalyticsInstance#setPropertyCollection"
            com.huawei.hms.analytics.cc r0 = com.huawei.hms.analytics.cd.lmn(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L29
            java.lang.String r5 = "property is empty"
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r5)
            com.huawei.hms.analytics.cd.lmn(r0)
            return
        L29:
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r2 = r5.toUpperCase(r2)
            java.util.List<java.lang.String> r3 = com.huawei.hms.analytics.an.ikl
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L44
            java.lang.String r6 = "set property collection failed: "
            java.lang.String r5 = r6.concat(r5)
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r5)
            com.huawei.hms.analytics.cd.lmn(r0)
            return
        L44:
            android.content.Context r5 = r4.ijk
            java.util.List r1 = com.huawei.hms.analytics.dh.lmn(r5)
            if (r1 != 0) goto L57
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r6 != 0) goto L64
        L53:
            r1.add(r2)
            goto L64
        L57:
            if (r6 == 0) goto L5d
            r1.remove(r2)
            goto L64
        L5d:
            boolean r6 = r1.contains(r2)
            if (r6 != 0) goto L64
            goto L53
        L64:
            int r6 = r1.size()
            if (r6 != 0) goto L70
            java.lang.String r6 = ""
        L6c:
            com.huawei.hms.analytics.dh.lmn(r5, r6)
            goto L9d
        L70:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L79:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r6.append(r2)
            java.lang.String r2 = "|"
            r6.append(r2)
            goto L79
        L8e:
            int r1 = r6.length()
            int r1 = r1 + (-1)
            java.lang.StringBuilder r6 = r6.deleteCharAt(r1)
            java.lang.String r6 = r6.toString()
            goto L6c
        L9d:
            java.lang.String r5 = "0"
            r0.lmn = r5
            com.huawei.hms.analytics.cd.lmn(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.ghi.lmn(java.lang.String, boolean):void");
    }

    @Override // com.huawei.hms.analytics.bi
    public final void lmn(Set<ReportPolicy> set) {
        cc lmn = cd.lmn("HiAnalyticsInstance#setReportPolicies(Set<ReportPolicy>)");
        try {
            bp.lmn().lmn(set);
            lmn.lmn = "0";
        } catch (Exception unused) {
            HiLog.e("instanceimpl", "decide policy exception");
        } finally {
            cd.lmn(lmn);
        }
    }
}

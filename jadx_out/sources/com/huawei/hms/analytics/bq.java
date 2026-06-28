package com.huawei.hms.analytics;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.framework.config.DeviceAttributeCollector;
import com.huawei.hms.analytics.framework.config.EvtHeaderAttributeCollector;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.config.RomAttributeCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bq implements ICollectorConfig {
    private String ijk;
    private at ikl = ar.lmn().lmn;
    private bv klm;
    private String lmn;

    public bq(String str) {
        this.lmn = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if ("true".equals(r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean ikl() {
        /*
            r5 = this;
            com.huawei.hms.analytics.at r0 = r5.ikl
            boolean r1 = r0.def
            r2 = 1
            if (r1 == 0) goto L8
            return r2
        L8:
            com.huawei.hms.analytics.def r0 = r0.f8140b
            java.lang.String r1 = "OpennessCollectSettings"
            r3 = 0
            if (r0 == 0) goto L28
            java.lang.String r0 = r0.lmn()     // Catch: java.lang.Exception -> L25
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L25
            if (r4 != 0) goto L22
            java.lang.String r4 = "true"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L25
            if (r0 != 0) goto L22
            goto L23
        L22:
            r2 = r3
        L23:
            r3 = r2
            goto L2d
        L25:
            java.lang.String r0 = "syncDataSharingStatus error"
            goto L2a
        L28:
            java.lang.String r0 = "IHiAnalyticsService is null"
        L2a:
            com.huawei.hms.analytics.core.log.HiLog.w(r1, r0)
        L2d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.bq.ikl():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: JSONException -> 0x005d, TRY_LEAVE, TryCatch #0 {JSONException -> 0x005d, blocks: (B:6:0x0016, B:9:0x0022, B:11:0x002b, B:15:0x0056, B:19:0x003d, B:22:0x004e), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<org.json.JSONObject> klm() {
        /*
            r9 = this;
            com.huawei.hms.analytics.at r0 = r9.ikl
            android.content.Context r0 = r0.ghi
            java.lang.String r1 = "camp_evt"
            java.lang.String r2 = ""
            java.lang.String r3 = "global_v2"
            java.lang.String r0 = com.huawei.hms.analytics.dl.klm(r0, r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L16
            return r2
        L16:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L5d
            r1.<init>(r0)     // Catch: org.json.JSONException -> L5d
            int r0 = r1.length()     // Catch: org.json.JSONException -> L5d
            if (r0 != 0) goto L22
            return r2
        L22:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: org.json.JSONException -> L5d
            r3.<init>()     // Catch: org.json.JSONException -> L5d
            r4 = 0
            r5 = r4
        L29:
            if (r5 >= r0) goto L5c
            org.json.JSONObject r6 = r1.getJSONObject(r5)     // Catch: org.json.JSONException -> L5d
            java.lang.String r7 = "t"
            java.lang.Object r7 = r6.remove(r7)     // Catch: org.json.JSONException -> L5d
            boolean r7 = com.huawei.hms.analytics.dc.klm(r7)     // Catch: org.json.JSONException -> L5d
            if (r7 == 0) goto L3d
        L3b:
            r6 = r2
            goto L54
        L3d:
            com.huawei.hms.analytics.dj r7 = new com.huawei.hms.analytics.dj     // Catch: org.json.JSONException -> L5d
            java.lang.String r8 = "$CampaignPushClick"
            r7.<init>(r8, r6)     // Catch: org.json.JSONException -> L5d
            java.util.ArrayList<org.json.JSONObject> r6 = r7.ikl     // Catch: org.json.JSONException -> L5d
            int r7 = r6.size()     // Catch: org.json.JSONException -> L5d
            r8 = 1
            if (r7 == r8) goto L4e
            goto L3b
        L4e:
            java.lang.Object r6 = r6.get(r4)     // Catch: org.json.JSONException -> L5d
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: org.json.JSONException -> L5d
        L54:
            if (r6 == 0) goto L59
            r3.add(r6)     // Catch: org.json.JSONException -> L5d
        L59:
            int r5 = r5 + 1
            goto L29
        L5c:
            return r3
        L5d:
            java.lang.String r0 = "OpennessCollectSettings"
            java.lang.String r1 = "Camp event is error from sp"
            com.huawei.hms.analytics.core.log.HiLog.w(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.bq.klm():java.util.List");
    }

    private JSONArray klm(String str) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(str);
            int length = jSONArray2.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i5);
                if (dc.klm(jSONObject.getString(com.umeng.analytics.pro.bi.aL))) {
                    HiLog.i("OpennessCollectSettings", "CampInfo has expired");
                } else {
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() < length) {
                dl.lmn(this.ikl.ghi, "global_v2", "camp_info", jSONArray.toString());
            }
            return jSONArray;
        } catch (JSONException unused) {
            dl.lmn(this.ikl.ghi, "global_v2", "camp_info");
            return null;
        }
    }

    private int lmn(String str) {
        int klm = dl.klm(this.ikl.ghi, "global_v2", "is_new_user", -1);
        if (klm == 0) {
            return klm;
        }
        try {
            if (!dc.lmn(Long.parseLong(str), System.currentTimeMillis())) {
                return 1;
            }
            dl.lmn(this.ikl.ghi, "global_v2", "is_new_user", 0);
            return 0;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private String lmn() {
        JSONArray klm;
        String klm2 = dl.klm(this.ikl.ghi, "global_v2", "camp_info", "");
        if (TextUtils.isEmpty(klm2) || (klm = klm(klm2)) == null) {
            return "";
        }
        int length = klm.length();
        for (int i5 = 0; i5 < length; i5++) {
            try {
                klm.getJSONObject(i5).remove(com.umeng.analytics.pro.bi.aL);
            } catch (JSONException unused) {
                return "";
            }
        }
        return klm.toString();
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final String getAppId() {
        return this.ikl.f8152n.klm;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final String[] getCollectUrls(String str, String str2) {
        ay ayVar = this.ikl.f8152n;
        if (TextUtils.isEmpty(str2)) {
            str2 = this.ikl.f8152n.ghi;
        }
        return (String[]) ayVar.lmn.get(str2).clone();
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final List<JSONObject> getCustomEventJson(long j5) {
        Bundle lmn;
        dj djVar;
        ArrayList<JSONObject> arrayList = null;
        if (!"_openness_config_tag".equals(this.lmn)) {
            return null;
        }
        if ("CN".equals(this.ikl.f8152n.lmn(this.lmn)) && !dg.ghi(this.ikl.ghi)) {
            if (!ar.lmn().lmn.f8154p) {
                if (this.ikl.f8162x) {
                    cj cjVar = new cj(this.lmn);
                    az lmn2 = cj.lmn();
                    if (lmn2 == null) {
                        HiLog.i("pshTken", "The manufacturer does not support push token collection");
                        lmn = null;
                    } else {
                        lmn = lmn2.lmn(lmn2.lmn());
                    }
                    if (lmn == null) {
                        HiLog.i("pshTken", "all push token is empty");
                        djVar = null;
                    } else {
                        djVar = new dj("$AppPushToken", lmn);
                    }
                    if (djVar != null) {
                        ar.lmn().lmn.f8154p = true;
                        bh bhVar = cjVar.lmn;
                        if (bhVar != null) {
                            bhVar.lmn("$AppPushToken", djVar.lmn, j5);
                        }
                        arrayList = djVar.ikl;
                    }
                } else {
                    HiLog.i("OpennessCollectSettings", "it is not allowed to collect push token");
                }
            }
            List<JSONObject> klm = klm();
            if (klm == null) {
                return arrayList;
            }
            if (arrayList == null) {
                return klm;
            }
            arrayList.addAll(klm);
        }
        return arrayList;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final DeviceAttributeCollector getDeviceAttribute(String str) {
        br brVar = new br();
        brVar.lmn = cy.lmn().klm();
        at atVar = this.ikl;
        brVar.klm = atVar.f8146h;
        brVar.hij = atVar.f8147i;
        brVar.ikl = atVar.bcd;
        if (("_openness_config_tag".equals(this.lmn) || "AGC_TAG".equals(this.lmn)) && "CN".equals(this.ijk)) {
            at atVar2 = this.ikl;
            brVar.ghi = atVar2.f8157s;
            brVar.fgh = atVar2.f8158t;
        }
        brVar.ijk = ar.lmn().klm().ikl();
        return brVar;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final EvtHeaderAttributeCollector getEvtCustomHeader(String str, JSONObject jSONObject) {
        return new bs(jSONObject, this.ijk, this.lmn);
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final Map<String, String> getHttpHeader(String str) {
        HashMap hashMap = new HashMap();
        if (dg.ghi(this.ikl.ghi)) {
            hashMap.put("x-hasdk-realtime", "true");
        }
        hashMap.put("x-hasdk-productid", this.ikl.f8152n.ikl);
        hashMap.put("x-hasdk-resourceid", this.ikl.f8152n.ijk);
        hashMap.put("x-hasdk-token", this.ikl.hij);
        hashMap.put("x-hasdk-clientid", this.ikl.f8152n.fgh);
        Map<String, String> map = ar.lmn().lmn(this.lmn).klm;
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final String getRegion() {
        return TextUtils.isEmpty(this.ikl.f8152n.lmn(this.lmn)) ? this.ikl.f8152n.ghi : this.ikl.f8152n.lmn(this.lmn);
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final RomAttributeCollector getRomAttribute(String str) {
        if (this.klm == null) {
            this.klm = new bv();
            at atVar = this.ikl;
            String str2 = atVar.lmn;
            if (TextUtils.isEmpty(str2)) {
                str2 = dg.klm();
                atVar.lmn = str2;
            }
            String str3 = Build.MANUFACTURER;
            if (str3 == null) {
                str3 = "unknown";
            }
            Point def = dg.def(atVar.ghi);
            int i5 = def.y;
            int i6 = def.x;
            bv bvVar = this.klm;
            bvVar.f8165b = str3;
            bvVar.f8166c = i5;
            bvVar.f8167d = i6;
            bvVar.lmn = dg.ikl();
            bv bvVar2 = this.klm;
            bvVar2.hij = atVar.klm;
            bvVar2.klm = str2;
            bvVar2.def = "hianalytics";
            bvVar2.cde = "Android";
            bvVar2.ghi = "6.7.0.300";
            String str4 = Build.MODEL;
            bvVar2.ikl = str4 != null ? str4 : "unknown";
            bvVar2.bcd = dg.fgh();
            this.klm.abc = dg.ijk();
            this.klm.ijk = atVar.ghi.getPackageName();
            this.klm.f8168e = ("HUAWEI".equals(str3) || "HONOR".equals(str3)) ? dg.lmn(atVar.ghi) : dg.klm(atVar.ghi);
        }
        String efg = dg.efg(this.ikl.ghi);
        String klm = dg.klm(this.ikl.ghi, this.ijk);
        bv bvVar3 = this.klm;
        at atVar2 = this.ikl;
        bvVar3.f8169f = atVar2.efg;
        bvVar3.f8164a = efg;
        bvVar3.fgh = klm;
        bvVar3.f8171h = atVar2.f8145g;
        bvVar3.f8172i = atVar2.f8148j;
        bvVar3.f8182s = dg.c(atVar2.ghi);
        if ("CN".equals(this.ijk)) {
            this.klm.f8170g = Boolean.valueOf(ikl());
        } else {
            this.klm.f8170g = null;
        }
        Context context = this.ikl.ghi;
        if (context != null) {
            this.klm.f8173j = dg.a(context);
            this.klm.f8174k = dg.hij();
            this.klm.f8175l = dg.ghi();
            ActivityManager activityManager = (ActivityManager) this.ikl.ghi.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                this.klm.f8176m = dg.lmn(memoryInfo.totalMem);
                this.klm.f8177n = dg.lmn(memoryInfo.availMem);
            }
            this.klm.f8178o = dg.bcd(this.ikl.ghi);
            this.klm.f8179p = dg.abc(this.ikl.ghi);
            this.klm.f8180q = dg.b(this.ikl.ghi);
        }
        String klm2 = dl.klm(this.ikl.ghi, "global_v2", "firstRunTime", "");
        bv bvVar4 = this.klm;
        bvVar4.f8181r = klm2;
        bvVar4.B = dl.klm(this.ikl.ghi, "global_v2", "sig_flg", 0);
        this.klm.f8189z = lmn(klm2);
        this.klm.A = dg.fgh(this.ikl.ghi);
        this.klm.f8183t = dg.d(this.ikl.ghi);
        String str5 = this.ikl.ijk;
        if (TextUtils.isEmpty(str5)) {
            this.klm.efg = this.ikl.lmn();
        } else {
            this.klm.efg = str5;
        }
        if ("CN".equals(this.ijk)) {
            this.klm.f8184u = Integer.valueOf(dg.e(this.ikl.ghi));
            this.klm.f8187x = Boolean.valueOf(dg.h(this.ikl.ghi));
            this.klm.f8186w = Boolean.valueOf(dg.g(this.ikl.ghi));
            this.klm.f8185v = Integer.valueOf(dg.f(this.ikl.ghi));
            this.klm.f8188y = lmn();
        } else {
            bv bvVar5 = this.klm;
            bvVar5.f8184u = null;
            bvVar5.f8187x = null;
            bvVar5.f8186w = null;
            bvVar5.f8185v = null;
            bvVar5.f8188y = null;
        }
        return this.klm;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final Event getSpecialEvent(String str) {
        if (!"_openness_config_tag".equals(this.lmn)) {
            return null;
        }
        String klm = dl.klm(this.ikl.ghi, "stop_v2_1", "stop_event", "");
        if (TextUtils.isEmpty(klm)) {
            return null;
        }
        try {
            dl.lmn(this.ikl.ghi, "stop_v2_1", new String[0]);
            JSONObject jSONObject = new JSONObject(klm);
            Event event = new Event();
            event.formJson(jSONObject);
            return event;
        } catch (JSONException unused) {
            HiLog.w("OpennessCollectSettings", "event form json exception");
            return null;
        }
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final void handlerThrowable(Throwable th) {
        di.lmn(th);
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final boolean isDebugModel() {
        return dg.ghi(this.ikl.ghi);
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final boolean isEnableSession(String str) {
        return true;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final void serviceListener(boolean z4, String str) {
        if ("_openness_config_tag".equals(this.lmn)) {
            k kVar = ar.lmn().lmn.f8139a;
            if (kVar == null) {
                k kVar2 = new k(fgh.lmn().lmn(this.lmn));
                ar.lmn().lmn.f8139a = kVar2;
                kVar = kVar2;
            }
            if (z4) {
                kVar.lmn();
            }
            kVar.lmn(str);
        }
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final void setRegion(String str) {
        this.ijk = str;
    }

    @Override // com.huawei.hms.analytics.framework.config.ICollectorConfig
    public final void syncOaid() {
        af.lmn(this.ikl.ghi, this.ijk);
    }
}

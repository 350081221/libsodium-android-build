package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.core.a.a;
import com.efs.sdk.base.core.util.d;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.umeng.umcrash.UMCrash;
import i0.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class GlobalInfo {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f6547a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, Object obj) {
        if (obj != null) {
            this.f6547a.put(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b(String str, Object obj) {
        Object obj2 = this.f6547a.get(str);
        return (obj2 != null || this.f6547a.containsKey(str)) ? obj2 : obj;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap hashMap = new HashMap(this.f6547a);
        a.a();
        hashMap.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        hashMap.put("w_tm", Long.valueOf(a.b() / 1000));
        return hashMap;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection put = kVSection.put("type", str).put("appid", this.f6547a.get("appid")).put("wid", this.f6547a.get("wid")).put("pid", this.f6547a.get("pid")).put("pkg", this.f6547a.get("pkg")).put("ver", this.f6547a.get("ver")).put("vcode", this.f6547a.get("vcode")).put("ps", this.f6547a.get("ps")).put("stime", this.f6547a.get("stime"));
        a.a();
        KVSection put2 = put.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        put2.put("w_tm", Long.valueOf(a.b() / 1000)).put(HiAnalyticsConstant.BI_KEY_SDK_VER, this.f6547a.get(HiAnalyticsConstant.BI_KEY_SDK_VER));
        String valueOf = String.valueOf(b("uid", ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put("uid", valueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection("device_info");
        kVSection2.put("lang", this.f6547a.get("lang")).put("brand", this.f6547a.get("brand")).put("model", this.f6547a.get("model")).put("build_model", this.f6547a.get("build_model")).put("rom", this.f6547a.get("rom")).put(com.umeng.ccg.a.f12839r, this.f6547a.get(com.umeng.ccg.a.f12839r)).put("dsp_h", this.f6547a.get("dsp_h")).put("dsp_w", this.f6547a.get("dsp_w")).put("tzone", this.f6547a.get("tzone")).put(b.f16155k, this.f6547a.get(b.f16155k)).put("fr", this.f6547a.get("fr"));
        try {
            if (this.f6547a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f6547a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f6547a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f6547a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f6547a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f6547a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String valueOf = String.valueOf(b("wid", ""));
        if (TextUtils.isEmpty(valueOf)) {
            String a5 = d.a(context);
            a("wid", a5);
            return a5;
        }
        return valueOf;
    }
}

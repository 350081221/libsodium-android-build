package com.tendcloud.tenddata;

import android.os.Environment;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class db extends cy {
    public db() {
        a("manufacture", k.f());
        a("brand", k.g());
        a("model", k.h());
        a("dummy0", l.a("dummy0"));
        JSONArray jSONArray = new JSONArray();
        for (String str : k.p()) {
            jSONArray.put(str);
        }
        a("cpuInfo", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (int i5 : k.t()) {
            jSONArray2.put(i5);
        }
        a("memoryInfo", jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (int i6 : k.s()) {
            jSONArray3.put(i6);
        }
        a("sdCardInfo", jSONArray3);
        k.a(ab.f11351g, this.f11648b);
        k.b(ab.f11351g, this.f11648b);
        a("totalDiskSpace", Integer.valueOf(a()));
        a("support", k.h(ab.f11351g));
        a(com.umeng.analytics.pro.bi.f12277w, k.q());
        a("nfcHce", k.b(ab.f11351g));
    }

    public static int a() {
        try {
            int[] u4 = k.u();
            if (u4 == null) {
                return 0;
            }
            if (!Environment.isExternalStorageEmulated()) {
                return u4[0] + u4[2];
            }
            return u4[0];
        } catch (Throwable unused) {
            return 0;
        }
    }

    public void setSlots(int i5) {
        a("slots", Integer.valueOf(i5));
    }
}

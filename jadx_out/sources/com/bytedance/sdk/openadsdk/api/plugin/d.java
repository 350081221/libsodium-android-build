package com.bytedance.sdk.openadsdk.api.plugin;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f4851a;

    /* renamed from: b, reason: collision with root package name */
    private long f4852b;

    /* renamed from: c, reason: collision with root package name */
    private long f4853c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f4854d = new HashMap();

    private d(String str, long j5) {
        this.f4851a = str;
        this.f4852b = j5;
        this.f4853c = j5;
    }

    public static d a(String str) {
        return new d(str, SystemClock.elapsedRealtime());
    }

    public long b(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4853c;
        this.f4853c = SystemClock.elapsedRealtime();
        this.f4854d.put(str, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public long a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f4852b;
        this.f4854d.put(this.f4851a, Long.valueOf(elapsedRealtime));
        return elapsedRealtime;
    }

    public void a(JSONObject jSONObject, long j5) {
        if (jSONObject == null) {
            return;
        }
        for (Map.Entry<String, Long> entry : this.f4854d.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value.longValue() > j5) {
                try {
                    jSONObject.put(key, value);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public long b() {
        return this.f4852b;
    }
}

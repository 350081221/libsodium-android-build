package com.ss.android.downloadlib.addownload.b;

import com.ss.android.downloadlib.g.m;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f9623a;

    /* renamed from: b, reason: collision with root package name */
    public long f9624b;

    /* renamed from: c, reason: collision with root package name */
    public long f9625c;

    /* renamed from: d, reason: collision with root package name */
    public String f9626d;

    /* renamed from: e, reason: collision with root package name */
    public String f9627e;

    /* renamed from: f, reason: collision with root package name */
    public String f9628f;

    /* renamed from: g, reason: collision with root package name */
    public String f9629g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f9630h;

    public a() {
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDownloadId", this.f9623a);
            jSONObject.put("mAdId", this.f9624b);
            jSONObject.put("mExtValue", this.f9625c);
            jSONObject.put("mPackageName", this.f9626d);
            jSONObject.put("mAppName", this.f9627e);
            jSONObject.put("mLogExtra", this.f9628f);
            jSONObject.put("mFileName", this.f9629g);
            jSONObject.put("mTimeStamp", this.f9630h);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    public a(long j5, long j6, long j7, String str, String str2, String str3, String str4) {
        this.f9623a = j5;
        this.f9624b = j6;
        this.f9625c = j7;
        this.f9626d = str;
        this.f9627e = str2;
        this.f9628f = str3;
        this.f9629g = str4;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        try {
            aVar.f9623a = m.a(jSONObject, "mDownloadId");
            aVar.f9624b = m.a(jSONObject, "mAdId");
            aVar.f9625c = m.a(jSONObject, "mExtValue");
            aVar.f9626d = jSONObject.optString("mPackageName");
            aVar.f9627e = jSONObject.optString("mAppName");
            aVar.f9628f = jSONObject.optString("mLogExtra");
            aVar.f9629g = jSONObject.optString("mFileName");
            aVar.f9630h = m.a(jSONObject, "mTimeStamp");
            return aVar;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}

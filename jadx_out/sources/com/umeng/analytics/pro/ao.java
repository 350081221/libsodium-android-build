package com.umeng.analytics.pro;

import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12166a = "https://ucc.umeng.com/v2/inn/fetch";

    /* renamed from: b, reason: collision with root package name */
    private String f12167b;

    /* renamed from: c, reason: collision with root package name */
    private String f12168c;

    /* renamed from: d, reason: collision with root package name */
    private String f12169d;

    public ao(String str, JSONObject jSONObject, String str2) {
        this.f12167b = str;
        this.f12168c = jSONObject.toString();
        this.f12169d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] a5 = am.a(this.f12167b, this.f12168c);
            if (a5 != null) {
                JSONObject jSONObject2 = new JSONObject(new String(a5));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sourceIucc", this.f12169d);
                    jSONObject3.put("config", jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused2) {
        }
        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 102, com.umeng.ccg.d.a(), jSONObject);
    }
}

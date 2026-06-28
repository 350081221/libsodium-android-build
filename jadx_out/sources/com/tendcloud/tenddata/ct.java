package com.tendcloud.tenddata;

import com.lody.virtual.client.ipc.ServiceManagerNative;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ct extends cy {

    /* renamed from: a, reason: collision with root package name */
    static ct f11637a;

    private ct() {
    }

    public static synchronized ct a() {
        ct ctVar;
        synchronized (ct.class) {
            if (f11637a == null) {
                f11637a = new ct();
            }
            ctVar = f11637a;
        }
        return ctVar;
    }

    @Override // com.tendcloud.tenddata.cy
    public Object b() {
        String m5;
        try {
            if (!f11637a.f11648b.has(ServiceManagerNative.ACCOUNT) && (m5 = i.m()) != null) {
                f11637a.a(ServiceManagerNative.ACCOUNT, (Object) new JSONObject(m5));
            }
        } catch (Throwable unused) {
        }
        return super.b();
    }

    public void setCurrentPageName(String str) {
        a("page", str);
    }

    public void setDeepLink(String str) {
        try {
            a("deeplink", str);
        } catch (Throwable unused) {
        }
    }

    public void setProfile(JSONObject jSONObject) {
        a(ServiceManagerNative.ACCOUNT, (Object) jSONObject);
    }

    public void setSessionId(String str) {
        a("sessionId", str);
    }

    public void setSessionStartTime(long j5) {
        a("sessionStartTime", Long.valueOf(j5));
    }

    public void setSubprofile(JSONObject jSONObject) {
        a("subaccount", (Object) jSONObject);
    }
}

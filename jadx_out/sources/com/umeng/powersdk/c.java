package com.umeng.powersdk;

import android.app.Activity;
import android.os.BatteryManager;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    int f13589a;

    /* renamed from: b, reason: collision with root package name */
    int f13590b;

    /* renamed from: c, reason: collision with root package name */
    int f13591c;

    /* renamed from: d, reason: collision with root package name */
    WeakReference<Activity> f13592d;

    /* renamed from: e, reason: collision with root package name */
    boolean f13593e;

    /* renamed from: f, reason: collision with root package name */
    int f13594f;

    /* renamed from: g, reason: collision with root package name */
    boolean f13595g;

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f13605a = new c(0);
    }

    private c() {
        this.f13589a = 1;
        this.f13590b = 0;
        this.f13591c = 0;
        this.f13593e = true;
    }

    /* synthetic */ c(byte b5) {
        this();
    }

    final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            BatteryManager batteryManager = (BatteryManager) PowerManager.getApplicationContext().getSystemService("batterymanager");
            if (batteryManager != null) {
                float longProperty = (float) batteryManager.getLongProperty(2);
                if (longProperty >= 10000.0f || longProperty <= -10000.0f) {
                    longProperty /= 1000.0f;
                }
                jSONObject.put("ci", Math.abs(longProperty));
            }
        } catch (Throwable unused) {
        }
        try {
            com.umeng.powersdk.a a5 = b.a(PowerManager.getApplicationContext()).a();
            jSONObject.put("le", a5.f13581a);
            jSONObject.put("vo", a5.f13582b);
            jSONObject.put("te", a5.f13583c);
            jSONObject.put("st", a5.f13584d);
            jSONObject.put("ch", a5.f13585e);
            jSONObject.put("ts", a5.f13586f);
            try {
                long longValue = ((Long) GlobalInfoManager.getInstance().getGlobalInfo().getGlobalInfoMap().get("stime")).longValue();
                if (longValue > 0) {
                    jSONObject.put("ptime", System.currentTimeMillis() - longValue);
                }
            } catch (Throwable unused2) {
            }
            WeakReference<Activity> weakReference = this.f13592d;
            if (weakReference != null) {
                jSONObject.put("c_act", weakReference.get().getClass().getName());
            }
        } catch (Throwable unused3) {
        }
        return jSONObject;
    }
}

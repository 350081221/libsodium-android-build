package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class an implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12163a = "https://aspect-upush.umeng.com/occa/v1/event/report";

    /* renamed from: b, reason: collision with root package name */
    private String f12164b;

    /* renamed from: c, reason: collision with root package name */
    private String f12165c;

    public an(String str, JSONObject jSONObject) {
        this.f12164b = str;
        this.f12165c = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!TextUtils.isEmpty(this.f12165c)) {
                am.b(this.f12164b, this.f12165c.getBytes());
            }
        } catch (Throwable unused) {
        }
    }
}

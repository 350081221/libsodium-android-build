package com.ss.android.downloadlib.e;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.appdownloader.f.f;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements com.ss.android.download.api.b.a {

    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f10044a = new c();
    }

    public static c a() {
        return a.f10044a;
    }

    public void b(String str) {
        b(true, str);
    }

    @Override // com.ss.android.download.api.b.a
    public void a(Throwable th, String str) {
        a(true, th, str);
    }

    public void b(boolean z4, String str) {
        if (b()) {
            return;
        }
        if (z4) {
            b(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "msg", str);
        m.a(jSONObject, "stack", a(new Throwable()));
        k.i().a("service_ttdownloader", 3, jSONObject);
    }

    public void a(boolean z4, Throwable th, String str) {
        if (b()) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        if (z4) {
            b(th);
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            str = th.getMessage();
        }
        m.a(jSONObject, "msg", str);
        m.a(jSONObject, "stack", Log.getStackTraceString(th));
        k.i().a("service_ttdownloader", 1, jSONObject);
    }

    private void b(Throwable th) {
        if (f.b(k.a())) {
            throw new com.ss.android.downloadlib.e.a(th);
        }
    }

    private boolean b() {
        return k.j().optInt("enable_monitor", 1) != 1;
    }

    public void a(String str) {
        a(true, str);
    }

    public void a(boolean z4, String str) {
        if (b()) {
            return;
        }
        if (z4) {
            b(new RuntimeException(str));
        }
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "msg", str);
        m.a(jSONObject, "stack", a(new Throwable()));
        k.i().a("service_ttdownloader", 2, jSONObject);
    }

    public static String a(Throwable th) {
        try {
            return Log.getStackTraceString(th);
        } catch (Exception unused) {
            return null;
        }
    }
}

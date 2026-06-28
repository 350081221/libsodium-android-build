package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.tendcloud.tenddata.ab;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static h0 f8551b;

    /* renamed from: a, reason: collision with root package name */
    public Context f8552a;

    static {
        new HashMap();
    }

    public static h0 a() {
        return b();
    }

    public static synchronized h0 b() {
        h0 h0Var;
        synchronized (h0.class) {
            if (f8551b == null) {
                f8551b = new h0();
            }
            h0Var = f8551b;
        }
        return h0Var;
    }

    public void a(Context context) {
        this.f8552a = context;
        b(context);
        i.c().b().h(f.a());
    }

    public void a(String str, int i5) {
        if (this.f8552a == null) {
            y.e("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            y.c("hmsSdk", "onReport: Before calling runtaskhandler()");
            a(str, u0.a(i5), b.g());
        }
    }

    public void a(String str, int i5, String str2, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        if (2 == i5) {
            currentTimeMillis = u0.a("yyyy-MM-dd", currentTimeMillis);
        }
        o0.c().a(new j0(str2, jSONObject, str, u0.a(i5), currentTimeMillis));
    }

    public void a(String str, String str2) {
        if (!c.a(str, str2)) {
            y.c("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long j5 = c.j(str, str2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j5 <= ab.aa) {
            y.f("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        y.a("hmsSdk", "begin to call onReport!");
        c.a(str, str2, currentTimeMillis);
        a(str, str2, b.g());
    }

    public void a(String str, String str2, String str3) {
        Context context = this.f8552a;
        if (context == null) {
            y.e("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String a5 = h.a(context);
        if (c.e(str, str2) && !"WIFI".equals(a5)) {
            y.c("hmsSdk", "strNetworkType is :" + a5);
            return;
        }
        if (TextUtils.isEmpty(a5) || "2G".equals(a5)) {
            y.e("hmsSdk", "The network is bad.");
        } else {
            o0.c().a(new k0(str, str2, str3));
        }
    }

    public final void b(Context context) {
        String str;
        String d5 = f.d(context);
        b.a(d5);
        if (w0.b().a()) {
            String a5 = g0.a(context, "global_v2", "app_ver", "");
            g0.b(context, "global_v2", "app_ver", d5);
            b.b(a5);
            if (!TextUtils.isEmpty(a5)) {
                if (a5.equals(d5)) {
                    return;
                }
                y.c("hmsSdk", "the appVers are different!");
                a().a("", "alltype", a5);
                return;
            }
            str = "app ver is first save!";
        } else {
            str = "userManager.isUserUnlocked() == false";
        }
        y.c("hmsSdk", str);
    }
}

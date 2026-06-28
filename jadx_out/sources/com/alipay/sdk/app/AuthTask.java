package com.alipay.sdk.app;

import a1.h;
import a1.l;
import a1.n;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import m0.a;
import y0.a;

/* loaded from: classes2.dex */
public class AuthTask {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2955c = h.class;

    /* renamed from: a, reason: collision with root package name */
    public Activity f2956a;

    /* renamed from: b, reason: collision with root package name */
    public d1.a f2957b;

    /* loaded from: classes2.dex */
    public class a implements h.f {
        public a() {
        }

        @Override // a1.h.f
        public void a() {
            AuthTask.this.c();
        }

        @Override // a1.h.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f2956a = activity;
        y0.b.e().b(this.f2956a);
        this.f2957b = new d1.a(activity, d1.a.f15862k);
    }

    private String b(y0.a aVar, w0.b bVar) {
        String[] g5 = bVar.g();
        Bundle bundle = new Bundle();
        bundle.putString("url", g5[0]);
        Intent intent = new Intent(this.f2956a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        a.C0667a.c(aVar, intent);
        this.f2956a.startActivity(intent);
        Object obj = f2955c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return g0.b.a();
            }
        }
        String g6 = g0.b.g();
        if (TextUtils.isEmpty(g6)) {
            return g0.b.a();
        }
        return g6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        d1.a aVar = this.f2957b;
        if (aVar != null) {
            aVar.c();
        }
    }

    private h.f d() {
        return new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String e(android.app.Activity r4, java.lang.String r5, y0.a r6) {
        /*
            r3 = this;
            r3.f()
            r0 = 0
            u0.a r1 = new u0.a     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            s0.b r4 = r1.i(r6, r4, r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            org.json.JSONObject r4 = r4.c()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "form"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r5 = "onload"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.util.List r4 = w0.b.a(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.c()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r5 = 0
        L25:
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r5 >= r1) goto L4a
            java.lang.Object r1 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            w0.b r1 = (w0.b) r1     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            w0.a r1 = r1.b()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            w0.a r2 = w0.a.WapPay     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            if (r1 != r2) goto L47
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            w0.b r4 = (w0.b) r4     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            java.lang.String r4 = r3.b(r6, r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L57
            r3.c()
            return r4
        L47:
            int r5 = r5 + 1
            goto L25
        L4a:
            r3.c()
            goto L6b
        L4e:
            r4 = move-exception
            java.lang.String r5 = "biz"
            java.lang.String r1 = "H5AuthDataAnalysisError"
            i0.a.e(r6, r5, r1, r4)     // Catch: java.lang.Throwable -> L86
            goto L68
        L57:
            r4 = move-exception
            g0.c r5 = g0.c.NETWORK_ERROR     // Catch: java.lang.Throwable -> L86
            int r5 = r5.b()     // Catch: java.lang.Throwable -> L86
            g0.c r5 = g0.c.b(r5)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "net"
            i0.a.g(r6, r0, r4)     // Catch: java.lang.Throwable -> L86
            r0 = r5
        L68:
            r3.c()
        L6b:
            if (r0 != 0) goto L77
            g0.c r4 = g0.c.FAILED
            int r4 = r4.b()
            g0.c r0 = g0.c.b(r4)
        L77:
            int r4 = r0.b()
            java.lang.String r5 = r0.a()
            java.lang.String r6 = ""
            java.lang.String r4 = g0.b.b(r4, r5, r6)
            return r4
        L86:
            r4 = move-exception
            r3.c()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.e(android.app.Activity, java.lang.String, y0.a):java.lang.String");
    }

    private void f() {
        d1.a aVar = this.f2957b;
        if (aVar != null) {
            aVar.j();
        }
    }

    public synchronized String auth(String str, boolean z4) {
        return innerAuth(new y0.a(this.f2956a, str, i0.b.f16161n), str, z4);
    }

    public synchronized Map<String, String> authV2(String str, boolean z4) {
        y0.a aVar;
        aVar = new y0.a(this.f2956a, str, "authV2");
        return l.d(aVar, innerAuth(aVar, str, z4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x006c, code lost:
    
        if (m0.a.J().z() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.lang.String innerAuth(y0.a r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AuthTask.innerAuth(y0.a, java.lang.String, boolean):java.lang.String");
    }

    private String a(Activity activity, String str, y0.a aVar) {
        String b5 = aVar.b(str);
        List<a.b> t5 = m0.a.J().t();
        if (!m0.a.J().f20771g || t5 == null) {
            t5 = g0.a.f16089d;
        }
        if (n.y(aVar, this.f2956a, t5, true)) {
            h hVar = new h(activity, aVar, d());
            String g5 = hVar.g(b5, false);
            hVar.i();
            if (!TextUtils.equals(g5, h.f116i) && !TextUtils.equals(g5, h.f117j)) {
                return TextUtils.isEmpty(g5) ? g0.b.a() : g5;
            }
            i0.a.c(aVar, i0.b.f16157l, i0.b.f16153i0);
            return e(activity, b5, aVar);
        }
        i0.a.c(aVar, i0.b.f16157l, i0.b.f16154j0);
        return e(activity, b5, aVar);
    }
}

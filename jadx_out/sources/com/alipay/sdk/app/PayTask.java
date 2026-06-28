package com.alipay.sdk.app;

import a1.e;
import a1.h;
import a1.i;
import a1.l;
import a1.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.PayResultActivity;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m0.a;
import org.json.JSONObject;
import u0.f;
import y0.a;

/* loaded from: classes2.dex */
public class PayTask {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f2980h = h.class;

    /* renamed from: i, reason: collision with root package name */
    public static long f2981i;

    /* renamed from: a, reason: collision with root package name */
    public Activity f2982a;

    /* renamed from: b, reason: collision with root package name */
    public d1.a f2983b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2984c = "wappaygw.alipay.com/service/rest.htm";

    /* renamed from: d, reason: collision with root package name */
    public final String f2985d = "mclient.alipay.com/service/rest.htm";

    /* renamed from: e, reason: collision with root package name */
    public final String f2986e = "mclient.alipay.com/home/exterfaceAssign.htm";

    /* renamed from: f, reason: collision with root package name */
    public final String f2987f = "mclient.alipay.com/cashier/mobilepay.htm";

    /* renamed from: g, reason: collision with root package name */
    public Map<String, c> f2988g = new HashMap();

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2989a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f2990b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H5PayCallback f2991c;

        public a(String str, boolean z4, H5PayCallback h5PayCallback) {
            this.f2989a = str;
            this.f2990b = z4;
            this.f2991c = h5PayCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.a h5Pay = PayTask.this.h5Pay(new y0.a(PayTask.this.f2982a, this.f2989a, "payInterceptorWithUrl"), this.f2989a, this.f2990b);
            e.i(k0.a.A, "inc finished: " + h5Pay.a());
            this.f2991c.onPayResult(h5Pay);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements h.f {
        public b() {
        }

        @Override // a1.h.f
        public void a() {
            PayTask.this.dismissLoading();
        }

        @Override // a1.h.f
        public void b() {
        }
    }

    public PayTask(Activity activity) {
        this.f2982a = activity;
        y0.b.e().b(this.f2982a);
        this.f2983b = new d1.a(activity, d1.a.f15861j);
    }

    private String b(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf(i.f138d));
    }

    private String c(String str, Map<String, String> map) throws UnsupportedEncodingException {
        String e5;
        boolean equals = "9000".equals(map.get(l.f146a));
        String str2 = map.get("result");
        c remove = this.f2988g.remove(str);
        if (map.containsKey("callBackUrl")) {
            return map.get("callBackUrl");
        }
        if (str2.length() > 15) {
            String a5 = a(n.l("&callBackUrl=\"", "\"", str2), n.l("&call_back_url=\"", "\"", str2), n.l(k0.a.f19014u, "\"", str2), URLDecoder.decode(n.l(k0.a.f19015v, "&", str2), "utf-8"), URLDecoder.decode(n.l("&callBackUrl=", "&", str2), "utf-8"), n.l("call_back_url=\"", "\"", str2));
            if (!TextUtils.isEmpty(a5)) {
                return a5;
            }
        }
        if (remove != null) {
            if (equals) {
                e5 = remove.c();
            } else {
                e5 = remove.e();
            }
            if (!TextUtils.isEmpty(e5)) {
                return e5;
            }
        }
        if (remove != null) {
            return m0.a.J().y();
        }
        return "";
    }

    private String d(String str, y0.a aVar) {
        String b5 = aVar.b(str);
        if (b5.contains("paymethod=\"expressGateway\"")) {
            return e(aVar, b5);
        }
        List<a.b> t5 = m0.a.J().t();
        if (!m0.a.J().f20771g || t5 == null) {
            t5 = g0.a.f16089d;
        }
        if (n.y(aVar, this.f2982a, t5, true)) {
            h hVar = new h(this.f2982a, aVar, a());
            e.i(k0.a.A, "pay inner started: " + b5);
            String g5 = hVar.g(b5, false);
            if (!TextUtils.isEmpty(g5)) {
                if (g5.contains("resultStatus={" + g0.c.ACTIVITY_NOT_START_EXIT.b() + i.f138d)) {
                    n.u("alipaySdk", k0.b.f19036q, this.f2982a, aVar);
                    g5 = hVar.g(b5, true);
                }
            }
            e.i(k0.a.A, "pay inner raw result: " + g5);
            hVar.i();
            boolean D = m0.a.J().D();
            if (!TextUtils.equals(g5, h.f116i) && !TextUtils.equals(g5, h.f117j) && (!D || !aVar.s())) {
                if (TextUtils.isEmpty(g5)) {
                    return g0.b.a();
                }
                if (g5.contains(PayResultActivity.f2968b)) {
                    i0.a.c(aVar, i0.b.f16157l, i0.b.f16156k0);
                    return a(aVar, b5, t5, g5, this.f2982a);
                }
                return g5;
            }
            i0.a.c(aVar, i0.b.f16157l, i0.b.f16153i0);
            return e(aVar, b5);
        }
        i0.a.c(aVar, i0.b.f16157l, i0.b.f16154j0);
        return e(aVar, b5);
    }

    private String e(y0.a aVar, String str) {
        showLoading();
        g0.c cVar = null;
        try {
            try {
                try {
                    JSONObject c5 = new f().i(aVar, this.f2982a.getApplicationContext(), str).c();
                    String optString = c5.optString("end_code", null);
                    List<w0.b> a5 = w0.b.a(c5.optJSONObject(k0.c.f19039c).optJSONObject(k0.c.f19040d));
                    for (int i5 = 0; i5 < a5.size(); i5++) {
                        if (a5.get(i5).b() == w0.a.Update) {
                            w0.b.c(a5.get(i5));
                        }
                    }
                    i(aVar, c5);
                    dismissLoading();
                    i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
                    for (int i6 = 0; i6 < a5.size(); i6++) {
                        w0.b bVar = a5.get(i6);
                        if (bVar.b() == w0.a.WapPay) {
                            String g5 = g(aVar, bVar);
                            dismissLoading();
                            i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
                            return g5;
                        }
                        if (bVar.b() == w0.a.OpenWeb) {
                            String h5 = h(aVar, bVar, optString);
                            dismissLoading();
                            i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
                            return h5;
                        }
                    }
                    dismissLoading();
                    i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
                } catch (IOException e5) {
                    g0.c b5 = g0.c.b(g0.c.NETWORK_ERROR.b());
                    i0.a.g(aVar, i0.b.f16155k, e5);
                    dismissLoading();
                    i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
                    cVar = b5;
                }
            } catch (Throwable th) {
                e.d(th);
                i0.a.e(aVar, i0.b.f16157l, i0.b.B, th);
                dismissLoading();
                i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
            }
            if (cVar == null) {
                cVar = g0.c.b(g0.c.FAILED.b());
            }
            return g0.b.b(cVar.b(), cVar.a(), "");
        } catch (Throwable th2) {
            dismissLoading();
            i0.a.b(this.f2982a, aVar, str, aVar.f22662d);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        if (m0.a.J().z() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016e, code lost:
    
        dismissLoading();
        i0.a.h(r6.f2982a.getApplicationContext(), r7, r8, r7.f22662d);
        a1.e.i(k0.a.A, "pay returning: " + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0161, code lost:
    
        m0.a.J().h(r7, r6.f2982a.getApplicationContext(), false, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015f, code lost:
    
        if (m0.a.J().z() != false) goto L36;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.lang.String f(y0.a r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.f(y0.a, java.lang.String, boolean):java.lang.String");
    }

    public static synchronized boolean fetchSdkConfig(Context context) {
        synchronized (PayTask.class) {
            try {
                y0.b.e().b(context);
                long elapsedRealtime = SystemClock.elapsedRealtime() / 1000;
                if (elapsedRealtime - f2981i < m0.a.J().n()) {
                    return false;
                }
                f2981i = elapsedRealtime;
                m0.a.J().h(y0.a.w(), context.getApplicationContext(), false, 4);
                return true;
            } catch (Exception e5) {
                e.d(e5);
                return false;
            }
        }
    }

    private String g(y0.a aVar, w0.b bVar) {
        String[] g5 = bVar.g();
        Intent intent = new Intent(this.f2982a, (Class<?>) H5PayActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("url", g5[0]);
        if (g5.length == 2) {
            bundle.putString("cookie", g5[1]);
        }
        intent.putExtras(bundle);
        a.C0667a.c(aVar, intent);
        this.f2982a.startActivity(intent);
        Object obj = f2980h;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e5) {
                e.d(e5);
                return g0.b.a();
            }
        }
        String g6 = g0.b.g();
        if (TextUtils.isEmpty(g6)) {
            return g0.b.a();
        }
        return g6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        r0 = r6.g();
        r11 = g0.b.b(java.lang.Integer.valueOf(r0[1]).intValue(), r0[0], a1.n.V(r10, r0[2]));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String h(y0.a r10, w0.b r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.h(y0.a, w0.b, java.lang.String):java.lang.String");
    }

    private void i(y0.a aVar, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("tid");
            String optString2 = jSONObject.optString(z0.a.f22712j);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                z0.a.a(y0.b.e().c()).c(optString, optString2);
            }
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.P, th);
        }
    }

    private boolean j(boolean z4, boolean z5, String str, StringBuilder sb, Map<String, String> map, String... strArr) {
        String str2;
        int length = strArr.length;
        int i5 = 0;
        while (true) {
            if (i5 < length) {
                String str3 = strArr[i5];
                if (TextUtils.isEmpty(map.get(str3))) {
                    i5++;
                } else {
                    str2 = map.get(str3);
                    break;
                }
            } else {
                str2 = "";
                break;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            if (z5) {
                return false;
            }
            return true;
        }
        if (z4) {
            sb.append("&");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
            return true;
        }
        sb.append(str);
        sb.append("=\"");
        sb.append(str2);
        sb.append("\"");
        return true;
    }

    public void dismissLoading() {
        d1.a aVar = this.f2983b;
        if (aVar != null) {
            aVar.c();
            this.f2983b = null;
        }
    }

    public synchronized String fetchOrderInfoFromH5PayUrl(String str) {
        String str2;
        String str3;
        String str4;
        try {
            if (!TextUtils.isEmpty(str)) {
                String trim = str.trim();
                if (trim.startsWith("https://wappaygw.alipay.com/service/rest.htm") || trim.startsWith("http://wappaygw.alipay.com/service/rest.htm")) {
                    String trim2 = trim.replaceFirst("(http|https)://wappaygw.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim2)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.l("<request_token>", "</request_token>", n.H(trim2).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f2982a) + "\"";
                    }
                }
                if (trim.startsWith("https://mclient.alipay.com/service/rest.htm") || trim.startsWith("http://mclient.alipay.com/service/rest.htm")) {
                    String trim3 = trim.replaceFirst("(http|https)://mclient.alipay.com/service/rest.htm\\?", "").trim();
                    if (!TextUtils.isEmpty(trim3)) {
                        return "_input_charset=\"utf-8\"&ordertoken=\"" + n.l("<request_token>", "</request_token>", n.H(trim3).get("req_data")) + "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"" + a(this.f2982a) + "\"";
                    }
                }
                if ((trim.startsWith("https://mclient.alipay.com/home/exterfaceAssign.htm") || trim.startsWith("http://mclient.alipay.com/home/exterfaceAssign.htm")) && ((trim.contains("alipay.wap.create.direct.pay.by.user") || trim.contains("create_forex_trade_wap")) && !TextUtils.isEmpty(trim.replaceFirst("(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?", "").trim()))) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("url", str);
                    jSONObject.put("bizcontext", a(this.f2982a));
                    return y0.a.C + jSONObject.toString();
                }
                a aVar = null;
                if (Pattern.compile("^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)").matcher(str).find()) {
                    String l5 = n.l("?", "", str);
                    if (!TextUtils.isEmpty(l5)) {
                        Map<String, String> H = n.H(l5);
                        StringBuilder sb = new StringBuilder();
                        if (j(false, true, i0.b.B0, sb, H, i0.b.B0, "alipay_trade_no")) {
                            j(true, false, "pay_phase_id", sb, H, "payPhaseId", "pay_phase_id", "out_relation_id");
                            sb.append("&biz_sub_type=\"TRADE\"");
                            sb.append("&biz_type=\"trade\"");
                            String str5 = H.get("app_name");
                            if (TextUtils.isEmpty(str5) && !TextUtils.isEmpty(H.get("cid"))) {
                                str5 = "ali1688";
                            } else if (TextUtils.isEmpty(str5) && (!TextUtils.isEmpty(H.get("sid")) || !TextUtils.isEmpty(H.get("s_id")))) {
                                str5 = "tb";
                            }
                            sb.append("&app_name=\"" + str5 + "\"");
                            if (!j(true, true, "extern_token", sb, H, "extern_token", "cid", "sid", "s_id")) {
                                return "";
                            }
                            j(true, false, "appenv", sb, H, "appenv");
                            sb.append("&pay_channel_id=\"alipay_sdk\"");
                            c cVar = new c(this, aVar);
                            cVar.d(H.get("return_url"));
                            cVar.f(H.get("show_url"));
                            cVar.b(H.get("pay_order_id"));
                            String str6 = sb.toString() + "&bizcontext=\"" + a(this.f2982a) + "\"";
                            this.f2988g.put(str6, cVar);
                            return str6;
                        }
                    }
                }
                if (!trim.startsWith("https://mclient.alipay.com/cashier/mobilepay.htm") && !trim.startsWith("http://mclient.alipay.com/cashier/mobilepay.htm") && (!com.alipay.sdk.app.a.d() || !trim.contains("mobileclientgw.alipaydev.com/cashier/mobilepay.htm"))) {
                    if (m0.a.J().q() && Pattern.compile("^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?").matcher(trim).find()) {
                        Uri parse = Uri.parse(trim);
                        String queryParameter = parse.getQueryParameter("return_url");
                        String queryParameter2 = parse.getQueryParameter("show_url");
                        String queryParameter3 = parse.getQueryParameter("pay_order_id");
                        String a5 = a(parse.getQueryParameter("trade_nos"), parse.getQueryParameter("alipay_trade_no"));
                        String a6 = a(parse.getQueryParameter("payPhaseId"), parse.getQueryParameter("pay_phase_id"), parse.getQueryParameter("out_relation_id"));
                        String[] strArr = new String[4];
                        strArr[0] = parse.getQueryParameter("app_name");
                        if (!TextUtils.isEmpty(parse.getQueryParameter("cid"))) {
                            str2 = "ali1688";
                        } else {
                            str2 = "";
                        }
                        strArr[1] = str2;
                        if (!TextUtils.isEmpty(parse.getQueryParameter("sid"))) {
                            str3 = "tb";
                        } else {
                            str3 = "";
                        }
                        strArr[2] = str3;
                        if (!TextUtils.isEmpty(parse.getQueryParameter("s_id"))) {
                            str4 = "tb";
                        } else {
                            str4 = "";
                        }
                        strArr[3] = str4;
                        String a7 = a(strArr);
                        String a8 = a(parse.getQueryParameter("extern_token"), parse.getQueryParameter("cid"), parse.getQueryParameter("sid"), parse.getQueryParameter("s_id"));
                        String a9 = a(parse.getQueryParameter("appenv"));
                        if (!TextUtils.isEmpty(a5) && !TextUtils.isEmpty(a7) && !TextUtils.isEmpty(a8)) {
                            String format = String.format("trade_no=\"%s\"&pay_phase_id=\"%s\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\"%s\"&extern_token=\"%s\"&appenv=\"%s\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\"%s\"", a5, a6, a7, a8, a9, a(this.f2982a));
                            c cVar2 = new c(this, null);
                            cVar2.d(queryParameter);
                            cVar2.f(queryParameter2);
                            cVar2.b(queryParameter3);
                            cVar2.h(a5);
                            this.f2988g.put(format, cVar2);
                            return format;
                        }
                    }
                }
                String a10 = a(this.f2982a);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", trim);
                jSONObject2.put("bizcontext", a10);
                return String.format("new_external_info==%s", jSONObject2.toString());
            }
        } catch (Throwable th) {
            e.d(th);
        }
        return "";
    }

    public synchronized String fetchTradeToken() {
        return i.b(new y0.a(this.f2982a, "", "fetchTradeToken"), this.f2982a.getApplicationContext());
    }

    public String getVersion() {
        return "15.8.17";
    }

    public synchronized h1.a h5Pay(y0.a aVar, String str, boolean z4) {
        h1.a aVar2;
        aVar2 = new h1.a();
        try {
            String[] split = f(aVar, str, z4).split(i.f136b);
            HashMap hashMap = new HashMap();
            for (String str2 : split) {
                int indexOf = str2.indexOf("={");
                if (indexOf >= 0) {
                    String substring = str2.substring(0, indexOf);
                    hashMap.put(substring, b(str2, substring));
                }
            }
            if (hashMap.containsKey(l.f146a)) {
                aVar2.c(hashMap.get(l.f146a));
            }
            aVar2.d(c(str, hashMap));
            if (TextUtils.isEmpty(aVar2.b())) {
                i0.a.i(aVar, i0.b.f16157l, i0.b.f16162n0, "");
            }
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.f16164o0, th);
            e.d(th);
        }
        return aVar2;
    }

    public synchronized String pay(String str, boolean z4) {
        if (a1.b.a()) {
            return g0.b.e();
        }
        return f(new y0.a(this.f2982a, str, "pay"), str, z4);
    }

    public synchronized boolean payInterceptorWithUrl(String str, boolean z4, H5PayCallback h5PayCallback) {
        String fetchOrderInfoFromH5PayUrl;
        fetchOrderInfoFromH5PayUrl = fetchOrderInfoFromH5PayUrl(str);
        if (!TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl)) {
            e.i(k0.a.A, "intercepted: " + fetchOrderInfoFromH5PayUrl);
            new Thread(new a(fetchOrderInfoFromH5PayUrl, z4, h5PayCallback)).start();
        }
        return !TextUtils.isEmpty(fetchOrderInfoFromH5PayUrl);
    }

    public synchronized Map<String, String> payV2(String str, boolean z4) {
        String f5;
        y0.a aVar;
        if (a1.b.a()) {
            f5 = g0.b.e();
            aVar = null;
        } else {
            y0.a aVar2 = new y0.a(this.f2982a, str, "payV2");
            f5 = f(aVar2, str, z4);
            aVar = aVar2;
        }
        return l.d(aVar, f5);
    }

    public void showLoading() {
        d1.a aVar = this.f2983b;
        if (aVar != null) {
            aVar.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:9:0x001e, B:11:0x0045, B:13:0x0052, B:14:0x0057), top: B:8:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "sc"
            java.lang.String r1 = ""
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Exception -> L18
            r3 = 0
            android.content.pm.PackageInfo r6 = r2.getPackageInfo(r6, r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r2 = r6.versionName     // Catch: java.lang.Exception -> L18
            java.lang.String r6 = r6.packageName     // Catch: java.lang.Exception -> L16
            goto L1e
        L16:
            r6 = move-exception
            goto L1a
        L18:
            r6 = move-exception
            r2 = r1
        L1a:
            a1.e.d(r6)
            r6 = r1
        L1e:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "appkey"
            java.lang.String r5 = "2014052600006128"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "ty"
            java.lang.String r5 = "and_lite"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "sv"
            java.lang.String r5 = "h.a.3.8.17"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "an"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "av"
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "sdk_start_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5c
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L5c
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != 0) goto L57
            java.lang.String r6 = "h5tonative"
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L5c
        L57:
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L5c
            return r6
        L5c:
            r6 = move-exception
            a1.e.d(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.PayTask.a(android.content.Context):java.lang.String");
    }

    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public String f2994a;

        /* renamed from: b, reason: collision with root package name */
        public String f2995b;

        /* renamed from: c, reason: collision with root package name */
        public String f2996c;

        /* renamed from: d, reason: collision with root package name */
        public String f2997d;

        public c() {
            this.f2994a = "";
            this.f2995b = "";
            this.f2996c = "";
            this.f2997d = "";
        }

        public String a() {
            return this.f2996c;
        }

        public void b(String str) {
            this.f2996c = str;
        }

        public String c() {
            return this.f2994a;
        }

        public void d(String str) {
            this.f2994a = str;
        }

        public String e() {
            return this.f2995b;
        }

        public void f(String str) {
            this.f2995b = str;
        }

        public String g() {
            return this.f2997d;
        }

        public void h(String str) {
            this.f2997d = str;
        }

        public /* synthetic */ c(PayTask payTask, a aVar) {
            this();
        }
    }

    public static final String a(String... strArr) {
        if (strArr == null) {
            return "";
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    private h.f a() {
        return new b();
    }

    public static String a(y0.a aVar, String str, List<a.b> list, String str2, Activity activity) {
        n.c f5 = n.f(aVar, activity, list);
        if (f5 == null || f5.b(aVar) || f5.a() || !TextUtils.equals(f5.f163a.packageName, "hk.alipay.wallet")) {
            return str2;
        }
        e.g(k0.a.A, "PayTask not_login");
        String valueOf = String.valueOf(str.hashCode());
        Object obj = new Object();
        HashMap<String, Object> hashMap = PayResultActivity.f2969c;
        hashMap.put(valueOf, obj);
        Intent intent = new Intent(activity, (Class<?>) PayResultActivity.class);
        intent.putExtra(PayResultActivity.f2972f, str);
        intent.putExtra(PayResultActivity.f2973g, activity.getPackageName());
        intent.putExtra(PayResultActivity.f2971e, valueOf);
        a.C0667a.c(aVar, intent);
        activity.startActivity(intent);
        synchronized (hashMap.get(valueOf)) {
            try {
                e.g(k0.a.A, "PayTask wait");
                hashMap.get(valueOf).wait();
            } catch (InterruptedException unused) {
                e.g(k0.a.A, "PayTask interrupted");
                return g0.b.a();
            }
        }
        String str3 = PayResultActivity.b.f2979b;
        e.g(k0.a.A, "PayTask ret: " + str3);
        return str3;
    }
}

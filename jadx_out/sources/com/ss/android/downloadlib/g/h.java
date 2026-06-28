package com.ss.android.downloadlib.g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.download.api.config.r;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadlib.activity.JumpKllkActivity;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.umeng.analytics.pro.bi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10090a = "h";

    private static void c(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.a(context, str, eVar.f9658a);
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
            b(eVar, jSONObject, 14, 11, "market://details?id=" + str);
        }
    }

    private static com.ss.android.downloadlib.addownload.b.g d(@NonNull Context context, @NonNull String str) {
        try {
            Uri parse = Uri.parse("https://www.samsungapps.com/appquery/appDetail.as?appId=" + str);
            Intent intent = new Intent();
            intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
            intent.setData(parse);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.b.g(5);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.b.g(6, 14);
        }
    }

    private static void e(final Context context, final com.ss.android.downloadlib.addownload.b.e eVar, final String str) {
        com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.g.h.5
            @Override // java.lang.Runnable
            public void run() {
                com.ss.android.downloadlib.b.a.a(h.a(context, Uri.parse("market://details?id=" + str)), eVar, true);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject j5 = com.ss.android.downloadlib.addownload.k.j();
                    Thread.sleep(j5.optInt("m2_delay_millis", 1000));
                    com.ss.android.downloadlib.a.a.a.a().a(context, true);
                    com.ss.android.downloadlib.a.a.b bVar = new com.ss.android.downloadlib.a.a.b();
                    bVar.f9556a = 1;
                    bVar.f9557b = 0;
                    String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("v"), j5.optString(bi.aE));
                    bVar.f9558c = String.format(a5, str);
                    com.ss.android.downloadlib.a.a.a.a().a(bVar, (com.ss.android.downloadlib.a.a.d) null);
                    com.ss.android.downloadlib.a.a.a.a().b();
                    h.b(eVar, jSONObject, -1, 2, String.format(a5, str));
                } catch (Throwable th) {
                    th.printStackTrace();
                    h.b(eVar, jSONObject, 1, 2, "market://details?id=" + str);
                }
            }
        });
    }

    private static void f(final Context context, final com.ss.android.downloadlib.addownload.b.e eVar, final String str) {
        com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.g.h.6
            @Override // java.lang.Runnable
            public void run() {
                JSONObject j5 = com.ss.android.downloadlib.addownload.k.j();
                final JSONObject jSONObject = new JSONObject();
                try {
                    String optString = j5.optString(bi.aE);
                    String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("bw"), optString);
                    String a6 = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("bx"), optString);
                    String a7 = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("by"), optString);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme("https").authority(a5).appendPath(a6).appendQueryParameter(a7, str);
                    com.ss.android.downloadlib.addownload.k.e().a(HttpGet.METHOD_NAME, builder.build().toString(), null, new r() { // from class: com.ss.android.downloadlib.g.h.6.1
                        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
                        @Override // com.ss.android.download.api.config.r
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void a(java.lang.String r5) {
                            /*
                                r4 = this;
                                boolean r0 = android.text.TextUtils.isEmpty(r5)
                                r1 = 1
                                if (r0 != 0) goto L28
                                java.lang.String r5 = com.ss.android.downloadlib.g.h.a(r5)
                                boolean r0 = android.text.TextUtils.isEmpty(r5)
                                if (r0 != 0) goto L28
                                java.lang.String r5 = com.ss.android.downloadlib.g.h.b(r5)
                                boolean r0 = android.text.TextUtils.isEmpty(r5)
                                if (r0 != 0) goto L28
                                com.ss.android.downloadlib.g.h$6 r0 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                android.content.Context r2 = r2
                                com.ss.android.downloadlib.addownload.b.e r3 = r3
                                java.lang.String r0 = r1
                                com.ss.android.downloadlib.g.h.a(r2, r3, r0, r5)
                                r5 = r1
                                goto L29
                            L28:
                                r5 = 0
                            L29:
                                if (r5 != 0) goto L73
                                com.ss.android.downloadlib.g.h$6 r5 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                android.content.Context r5 = r2
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r2 = "market://details?id="
                                r0.append(r2)
                                com.ss.android.downloadlib.g.h$6 r3 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                java.lang.String r3 = r1
                                r0.append(r3)
                                java.lang.String r0 = r0.toString()
                                android.net.Uri r0 = android.net.Uri.parse(r0)
                                com.ss.android.downloadlib.addownload.b.g r5 = com.ss.android.downloadlib.g.h.a(r5, r0)
                                com.ss.android.downloadlib.g.h$6 r0 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                com.ss.android.downloadlib.addownload.b.e r0 = r3
                                com.ss.android.downloadlib.b.a.a(r5, r0, r1)
                                com.ss.android.downloadlib.g.h$6 r5 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                com.ss.android.downloadlib.addownload.b.e r5 = r3
                                org.json.JSONObject r0 = r2
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                r1.append(r2)
                                com.ss.android.downloadlib.g.h$6 r2 = com.ss.android.downloadlib.g.h.AnonymousClass6.this
                                java.lang.String r2 = r1
                                r1.append(r2)
                                java.lang.String r1 = r1.toString()
                                r2 = 10
                                r3 = 9
                                com.ss.android.downloadlib.g.h.a(r5, r0, r2, r3, r1)
                            L73:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.g.h.AnonymousClass6.AnonymousClass1.a(java.lang.String):void");
                        }

                        @Override // com.ss.android.download.api.config.r
                        public void a(Throwable th) {
                            com.ss.android.downloadlib.b.a.a(h.a(context, Uri.parse("market://details?id=" + str)), eVar, true);
                            m.a(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                            h.b(eVar, jSONObject, 11, 9, "market://details?id=" + str);
                        }
                    });
                } catch (Exception e5) {
                    e5.printStackTrace();
                    h.b(eVar, jSONObject, 4, 9, "market://details?id=" + str);
                }
            }
        });
    }

    private static void g(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.a(str, eVar.f9658a);
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
            b(eVar, jSONObject, 13, 10, "market://details?id=" + str);
        }
    }

    private static void h(final Context context, final com.ss.android.downloadlib.addownload.b.e eVar, final String str) {
        com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.g.h.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject j5 = com.ss.android.downloadlib.addownload.k.j();
                String optString = j5.optString(bi.aE);
                final JSONObject jSONObject = new JSONObject();
                String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("x"), optString);
                JSONObject jSONObject2 = new JSONObject();
                m.a(jSONObject2, bi.aL, "v");
                m.a(jSONObject2, bi.aA, str);
                byte[] bytes = jSONObject2.toString().getBytes();
                com.ss.android.downloadlib.addownload.k.e().a(a5, com.ss.android.downloadlib.addownload.k.s().a(bytes, bytes.length), "application/octet-stream;tt-data=a", 0, new r() { // from class: com.ss.android.downloadlib.g.h.7.1
                    @Override // com.ss.android.download.api.config.r
                    public void a(String str2) {
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        h.b(context, str, str2, eVar, jSONObject);
                    }

                    @Override // com.ss.android.download.api.config.r
                    public void a(Throwable th) {
                        com.ss.android.downloadlib.b.a.a(h.a(context, Uri.parse("market://details?id=" + str)), eVar, true);
                        m.a(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                        h.b(eVar, jSONObject, 7, 5, "market://details?id=" + str);
                    }
                });
            }
        });
    }

    private static void i(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.a(str, eVar.f9658a, "need_comment");
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
            b(eVar, jSONObject, 9, 8, "market://details?id=" + str);
        }
    }

    private static com.ss.android.downloadlib.addownload.b.g b(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        Intent intent = new Intent(context, (Class<?>) JumpKllkActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(bi.aA, str);
        intent.putExtra("id", eVar.f9658a);
        intent.putExtra("start_only_for_android", true);
        JSONObject jSONObject = new JSONObject();
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.b.g(7, "am_kllk2");
        } catch (Throwable unused) {
            b(eVar, jSONObject, 1, 3, "market://details?id=" + str);
            return a(context, Uri.parse("market://details?id=" + str));
        }
    }

    public static com.ss.android.downloadlib.addownload.b.g a(Context context, Uri uri) {
        Intent intent;
        if (!com.ss.android.socialbase.appdownloader.f.e.c() && (context == null || uri == null || !"market".equals(uri.getScheme()))) {
            return new com.ss.android.downloadlib.addownload.b.g(6, 12);
        }
        try {
            String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
            if (com.ss.android.socialbase.appdownloader.f.e.q() && (TextUtils.isEmpty(j5) || !m.e(context, j5))) {
                j5 = "com.huawei.appmarket";
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.scheme("market");
                intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            } else {
                intent = new Intent("android.intent.action.VIEW", uri);
            }
            if (!m.a(context, intent)) {
                return new com.ss.android.downloadlib.addownload.b.g(6, 13);
            }
            if (m.e(context, j5) && !com.ss.android.socialbase.appdownloader.f.e.g()) {
                intent.setPackage(j5);
            }
            if (com.ss.android.socialbase.downloader.g.a.c().a("fix_jump_market")) {
                intent.addFlags(335544320);
            } else if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (com.ss.android.socialbase.downloader.g.a.c().b("test_jump_market_failed") == 1) {
                com.ss.android.downloadlib.e.c.a().a(false, "jump market error");
                return new com.ss.android.downloadlib.addownload.b.g(6, 25);
            }
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.b.g(5);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.b.g(6, 14);
        }
    }

    public static boolean c(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
        if (m.e(com.ss.android.downloadlib.addownload.k.a(), j5)) {
            intent.setPackage(j5);
        }
        if (!m.a(com.ss.android.downloadlib.addownload.k.a(), intent)) {
            return false;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "start HM2");
            return false;
        }
    }

    private static com.ss.android.downloadlib.addownload.b.g d(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        Intent intent = new Intent(context, (Class<?>) JumpKllkActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("dl", true);
        intent.putExtra(bi.aA, str);
        intent.putExtra("id", eVar.f9658a);
        if (Build.VERSION.SDK_INT >= 29) {
            intent.putExtra("bk", "com.heytap.browser");
        } else if (m.e(context, "com.android.browser")) {
            intent.putExtra("bk", "com.android.browser");
        } else if (m.e(context, "com.coloros.browser")) {
            intent.putExtra("bk", "com.coloros.browser");
        } else {
            return a(context, Uri.parse("market://details?id=" + str));
        }
        intent.putExtra("start_only_for_android", true);
        JSONObject jSONObject = new JSONObject();
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.b.g(7, "am_kllk3");
        } catch (Throwable unused) {
            b(eVar, jSONObject, 1, 3, "market://details?id=" + str);
            return a(context, Uri.parse("market://details?id=" + str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, String str2, @NonNull com.ss.android.downloadlib.addownload.b.e eVar, @NonNull JSONObject jSONObject) {
        m.a(jSONObject, "ttdownloader_type", (Object) 5);
        try {
            String a5 = com.ss.android.socialbase.appdownloader.f.c.a(new JSONObject(str2).optString(bi.ay));
            if (!TextUtils.isEmpty(a5)) {
                TTDelegateActivity.a(str, eVar.f9658a, a5, jSONObject);
            } else {
                com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
                b(eVar, jSONObject, 5, 5, "market://details?id=" + str);
            }
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
            b(eVar, jSONObject, 6, 5, "market://details?id=" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            intent.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL, str);
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean b(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
        if (m.e(com.ss.android.downloadlib.addownload.k.a(), j5)) {
            intent.setPackage(j5);
        }
        if (!m.a(com.ss.android.downloadlib.addownload.k.a(), intent)) {
            return false;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "start HM1");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        Matcher matcher = Pattern.compile("<input[\\s\\S]*>\\n").matcher(str);
        String group = matcher.find() ? matcher.group() : "";
        if (!group.equals(null) && group.length() > 0) {
            for (String str2 : group.split("\\n")) {
                if (str2.startsWith("<input")) {
                    for (String str3 : str2.split("\\s")) {
                        if (str3.startsWith(t0.b.f22420d)) {
                            return str3.substring(7, str3.length() - 1);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static com.ss.android.downloadlib.addownload.b.g a(final Context context, Uri uri, com.ss.android.downloadlib.addownload.b.e eVar) {
        com.ss.android.downloadad.api.a.b bVar;
        if (context != null && com.ss.android.downloadlib.b.j.a(uri)) {
            try {
                final Intent intent = new Intent("android.intent.action.VIEW", uri);
                if (!m.a(context, intent)) {
                    return new com.ss.android.downloadlib.addownload.b.g(6, 13);
                }
                String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
                if (m.e(context, j5)) {
                    intent.setPackage(j5);
                }
                intent.addFlags(335544320);
                if (com.ss.android.socialbase.downloader.g.a.c().b("test_jump_market_failed") == 1 && "local_test".equals(com.ss.android.downloadlib.addownload.k.k().f9433c)) {
                    com.ss.android.downloadlib.e.c.a().a(false, "jump market error");
                    return new com.ss.android.downloadlib.addownload.b.g(6, 25);
                }
                intent.putExtra("start_only_for_android", true);
                long optLong = com.ss.android.downloadlib.addownload.k.j().optLong("market_jump_delay", 1000L);
                if (optLong > 0 && eVar != null && (bVar = eVar.f9662e) != null && !bVar.ae()) {
                    com.ss.android.downloadlib.g.a().b().post(new Runnable() { // from class: com.ss.android.downloadlib.g.h.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.ss.android.downloadlib.addownload.k.d().a(8, com.ss.android.downloadlib.addownload.k.a(), null, "浏览器跳转失败，正在前往应用商店", null, 0);
                        }
                    });
                }
                com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.g.h.2
                    @Override // java.lang.Runnable
                    public void run() {
                        context.startActivity(intent);
                    }
                }, optLong);
                return new com.ss.android.downloadlib.addownload.b.g(5);
            } catch (Exception unused) {
                return new com.ss.android.downloadlib.addownload.b.g(6, 14);
            }
        }
        return new com.ss.android.downloadlib.addownload.b.g(6, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 0) {
            return pathSegments.get(pathSegments.size() - 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.ss.android.downloadlib.addownload.b.e eVar, JSONObject jSONObject, int i5, int i6, String str) {
        m.a(jSONObject, "error_code", Integer.valueOf(i5));
        m.a(jSONObject, "ttdownloader_type", Integer.valueOf(i6));
        m.a(jSONObject, "rmu", str);
        m.a(jSONObject, com.ss.android.socialbase.appdownloader.f.e.j(), Integer.valueOf(m.b(com.ss.android.downloadlib.addownload.k.a(), com.ss.android.socialbase.appdownloader.f.e.j())));
        com.ss.android.downloadlib.d.a.a().b("am_result", jSONObject, eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.b.g b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.b.g(4, 11);
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        Intent g5 = m.g(context, str);
        if (g5 == null) {
            return new com.ss.android.downloadlib.addownload.b.g(4, 22);
        }
        g5.putExtra("start_only_for_android", true);
        try {
            context.startActivity(g5);
            return new com.ss.android.downloadlib.addownload.b.g(3);
        } catch (Exception unused) {
            return new com.ss.android.downloadlib.addownload.b.g(4, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.b.g b(String str, com.ss.android.downloadad.api.a.a aVar) {
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.b.g(2, 21);
        }
        Context a5 = com.ss.android.downloadlib.addownload.k.a();
        String packageName = aVar.u().getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            intent = null;
        } else {
            l.a().a(f10090a, "tryOpenByUrl", "获取到跳转中转Activity的intent");
            intent = a(a5, aVar, packageName, 2, str);
            if (intent != null) {
                com.ss.android.downloadlib.addownload.b.g a6 = a(a5, intent, aVar, true, str);
                if (a6.a() == 1) {
                    return a6;
                }
            }
        }
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        intent.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL, str);
        intent.putExtra("start_only_for_android", true);
        if (com.ss.android.socialbase.downloader.g.a.c().a("fix_app_link_flag")) {
            intent.addFlags(67108864);
        }
        return a(a5, intent, aVar, false, str);
    }

    public static com.ss.android.downloadlib.addownload.b.g a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (com.ss.android.socialbase.appdownloader.f.e.g() && m.e(context, "com.sec.android.app.samsungapps")) {
                return d(context, str);
            }
            return a(context, com.ss.android.download.api.c.a.a(str));
        }
        return new com.ss.android.downloadlib.addownload.b.g(6, 11);
    }

    public static com.ss.android.downloadlib.addownload.b.g a(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (com.ss.android.socialbase.appdownloader.f.e.g() && m.e(context, "com.sec.android.app.samsungapps")) {
                return d(context, str);
            }
            if (eVar.f9659b.isAd() && eVar.f9661d.enableAM()) {
                JSONArray optJSONArray = com.ss.android.downloadlib.addownload.k.j().optJSONArray("am_plans");
                if (com.ss.android.socialbase.appdownloader.f.e.e() && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_3")) {
                    return b(context, eVar, str);
                }
                if (com.ss.android.socialbase.appdownloader.f.e.f() && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_2")) {
                    e(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_m2");
                }
                if (com.ss.android.socialbase.appdownloader.f.e.d() && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_5")) {
                    h(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_v1");
                }
                if (com.ss.android.socialbase.appdownloader.f.e.e() && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_7")) {
                    DownloadController downloadController = eVar.f9661d;
                    if ((downloadController instanceof AdDownloadController) && ((AdDownloadController) downloadController).enableOppoAutoDownload()) {
                        return d(context, eVar, str);
                    }
                }
                if (com.ss.android.socialbase.appdownloader.f.e.d() && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_8") && m.a(m.c(context, "com.bbk.appstore"), "8.7.2.0") >= 0) {
                    i(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_v2");
                }
                if ((com.ss.android.socialbase.appdownloader.f.e.a() || com.ss.android.socialbase.appdownloader.f.e.b()) && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_9")) {
                    f(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_hr");
                }
                if ((com.ss.android.socialbase.appdownloader.f.e.a() || com.ss.android.socialbase.appdownloader.f.e.b()) && com.ss.android.socialbase.appdownloader.f.a.a(optJSONArray, "am_10")) {
                    g(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_hr2");
                }
                DownloadController downloadController2 = eVar.f9661d;
                if ((downloadController2 instanceof AdDownloadController) && ((AdDownloadController) downloadController2).enableOppoAutoDownload() && ((AdDownloadController) eVar.f9661d).getDownloadMarketInterceptor() != null && eVar.f9659b.getDownloadSettings().optInt("is_use_obm_convert", 0) == 1) {
                    c(context, eVar, str);
                    return new com.ss.android.downloadlib.addownload.b.g(7, "am_kllk4");
                }
                return a(context, Uri.parse("market://details?id=" + str));
            }
            return a(context, Uri.parse("market://details?id=" + str));
        }
        return new com.ss.android.downloadlib.addownload.b.g(6, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, @NonNull com.ss.android.downloadlib.addownload.b.e eVar, @NonNull String str, @NonNull String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            TTDelegateActivity.b(str, eVar.f9658a, str2);
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(context, Uri.parse("market://details?id=" + str)), eVar, true);
            b(eVar, jSONObject, 12, 9, "market://details?id=" + str);
        }
    }

    public static void b(@NonNull Activity activity, String str, long j5, String str2) {
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        JSONObject jSONObject = new JSONObject();
        JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
        String optString = j6.optString(bi.aE);
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bz"), optString);
        String a6 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("ca"), optString);
        String a7 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("cb"), optString);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("hiapplink").authority("com.huawei.appmarket");
        if (!TextUtils.isEmpty(a5)) {
            builder.appendQueryParameter(a5, str2);
        }
        if (!TextUtils.isEmpty(a6) && !TextUtils.isEmpty(a7)) {
            builder.appendQueryParameter(a6, a7);
        }
        if (b(activity, builder.build())) {
            b(e5, jSONObject, -1, 9, "market://details?id=" + str);
            com.ss.android.downloadlib.b.a.a("am_hr", jSONObject, e5, true);
            return;
        }
        b(e5, jSONObject, 2, 9, "market://details?id=" + str);
        com.ss.android.downloadlib.b.a.a(a((Context) activity, Uri.parse("market://details?id=" + str)), e5, true);
    }

    public static void b(@NonNull Activity activity, String str, long j5) {
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        JSONObject jSONObject = new JSONObject();
        boolean enableOppoAutoDownload = ((AdDownloadController) e5.f9661d).enableOppoAutoDownload();
        HashMap hashMap = new HashMap();
        hashMap.put("is_button", Boolean.valueOf(enableOppoAutoDownload));
        m.a(jSONObject, "is_button", Boolean.valueOf(enableOppoAutoDownload));
        Map<String, Object> interceptObmMarket = ((AdDownloadController) e5.f9661d).getDownloadMarketInterceptor().interceptObmMarket(hashMap);
        if (interceptObmMarket != null && interceptObmMarket.get("convert_result") != null && Boolean.parseBoolean(interceptObmMarket.get("convert_result").toString())) {
            b(e5, jSONObject, -1, 11, "market://details?id=" + str);
            com.ss.android.downloadlib.b.a.a("am_kllk4", jSONObject, e5, true);
            return;
        }
        b(e5, jSONObject, 15, 11, "market://details?id=" + str);
        com.ss.android.downloadlib.b.a.a(a((Context) activity, Uri.parse("market://details?id=" + str)), e5, true);
    }

    public static boolean a(Context context, com.ss.android.downloadlib.addownload.b.e eVar, String str, JSONObject jSONObject, boolean z4, int i5) {
        m.a(jSONObject, "download_scene", Integer.valueOf(eVar.t()));
        com.ss.android.downloadlib.d.a.a().b("market_click_open", jSONObject, eVar);
        com.ss.android.downloadlib.addownload.b.g a5 = a(context, Uri.parse(str));
        String a6 = m.a(a5.c(), "open_market");
        int a7 = a5.a();
        if (a7 == 5) {
            com.ss.android.downloadlib.b.a.a(a6, jSONObject, eVar, true);
        } else {
            if (a7 == 6) {
                m.a(jSONObject, "error_code", Integer.valueOf(a5.b()));
                m.a(jSONObject, "download_scene", Integer.valueOf(eVar.t()));
                com.ss.android.downloadlib.d.a.a().b("market_open_failed", jSONObject, eVar);
                return false;
            }
            if (a7 != 7) {
                return false;
            }
        }
        if (z4) {
            com.ss.android.downloadlib.d.a.a().a(eVar.f9658a, i5);
        }
        return true;
    }

    public static void a(Context context, String str, long j5, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        try {
            JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
            String optString = j6.optString(bi.aE);
            String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("aa"), optString);
            String a6 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("ac"), optString);
            String a7 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("af"), optString);
            boolean a8 = com.ss.android.socialbase.appdownloader.f.a.a(j6, context, a6);
            StringBuilder sb = new StringBuilder(String.format(a5, str, a7, a6));
            Intent intent = new Intent("android.intent.action.VIEW");
            String j7 = com.ss.android.socialbase.appdownloader.f.e.j();
            if (m.e(context, j7)) {
                intent.setPackage(j7);
            }
            if (z4) {
                sb.append(com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("ae"), optString));
            } else {
                intent.addFlags(335544320);
            }
            m.a(jSONObject, "mf", Boolean.valueOf(a8));
            m.a(jSONObject, "if", Boolean.valueOf(z4));
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("start_only_for_android", true);
            context.startActivity(intent);
            com.ss.android.downloadlib.b.a.a("am_kllk2", jSONObject, e5, true);
            if (a8) {
                b(e5, jSONObject, -1, 3, sb.toString());
            } else {
                b(e5, jSONObject, 3, 3, sb.toString());
            }
        } catch (Exception unused) {
            com.ss.android.downloadlib.b.a.a(a(com.ss.android.downloadlib.addownload.k.a(), Uri.parse("market://details?id=" + str)), e5, true);
            b(e5, jSONObject, 2, 3, "market://details?id=" + str);
        }
    }

    public static void a(final Context context, String str, long j5, String str2, boolean z4) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        try {
            JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
            String optString = j6.optString(bi.aE);
            String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("br"), optString);
            String a6 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bs_1"), optString);
            String a7 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bs_2"), optString);
            String a8 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bs_3"), optString);
            String a9 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bt"), optString);
            String a10 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bu"), optString);
            StringBuilder sb = new StringBuilder(String.format("https://", new Object[0]));
            sb.append(a5);
            sb.append(a6);
            sb.append(a7);
            sb.append(a8);
            sb.append(a9);
            sb.append(a10);
            final Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(str2);
            if (z4) {
                sb.append("pkg=" + str);
                sb.append("&dl=true");
            } else {
                intent.addFlags(335544320);
            }
            m.a(jSONObject, "dl", Boolean.valueOf(z4));
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("start_only_for_android", true);
            long optLong = com.ss.android.downloadlib.addownload.k.j().optLong("oppo_browser_jump_delay", 1000L);
            if (optLong > 0) {
                com.ss.android.downloadlib.g.a().b().post(new Runnable() { // from class: com.ss.android.downloadlib.g.h.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.ss.android.downloadlib.addownload.k.d().a(12, com.ss.android.downloadlib.addownload.k.a(), null, "正在前往浏览器下载", null, 0);
                    }
                });
            }
            com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.g.h.4
                @Override // java.lang.Runnable
                public void run() {
                    context.startActivity(intent);
                }
            }, optLong);
            com.ss.android.downloadad.api.a.b bVar = e5.f9662e;
            if (bVar != null) {
                bVar.v(true);
            }
            com.ss.android.downloadlib.b.a.a("am_kllk3", jSONObject, e5, true);
            b(e5, jSONObject, -1, 7, sb.toString());
        } catch (Exception unused) {
            com.ss.android.downloadad.api.a.b bVar2 = e5.f9662e;
            if (bVar2 != null) {
                bVar2.v(false);
            }
            com.ss.android.downloadlib.b.a.a(a(com.ss.android.downloadlib.addownload.k.a(), Uri.parse("market://details?id=" + str), e5), e5, true);
            b(e5, jSONObject, 2, 7, "market://details?id=" + str);
        }
    }

    private static boolean a(@NonNull Activity activity, @NonNull String str, @NonNull HashMap<String, String> hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        intent.putExtra("start_only_for_android", true);
        intent.putExtra("param", hashMap);
        String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
        if (m.e(com.ss.android.downloadlib.addownload.k.a(), j5)) {
            intent.setPackage(j5);
        }
        if (!m.a(com.ss.android.downloadlib.addownload.k.a(), intent)) {
            return false;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "start v1");
            return false;
        }
    }

    public static void a(@NonNull Activity activity, String str, long j5, String str2, String str3) {
        JSONObject jSONObject;
        int i5;
        try {
            jSONObject = new JSONObject(str3);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        try {
            JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
            boolean a5 = com.ss.android.socialbase.appdownloader.f.a.a(j6, activity, com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bg"), j6.optString(bi.aE)));
            HashMap<String, String> b5 = m.b(new JSONObject(str2));
            if (a5 && !b5.isEmpty() && a(activity, str, b5)) {
                b(e5, jSONObject, -1, 5, "market://details?id=" + str);
                com.ss.android.downloadlib.b.a.a("am_v1", jSONObject, e5, true);
                return;
            }
            if (a5) {
                i5 = b5.isEmpty() ? 1 : 2;
            } else {
                i5 = 3;
            }
            b(e5, jSONObject, i5, 5, "market://details?id=" + str);
            com.ss.android.downloadlib.b.a.a(a((Context) activity, Uri.parse("market://details?id=" + str)), e5, true);
        } catch (Exception unused2) {
            com.ss.android.downloadlib.b.a.a(a(com.ss.android.downloadlib.addownload.k.a(), Uri.parse("market://details?id=" + str)), e5, true);
            b(e5, jSONObject, 4, 5, "market://details?id=" + str);
        }
    }

    public static void a(@NonNull Activity activity, String str, long j5, String str2) {
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        JSONObject jSONObject = new JSONObject();
        JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("bv"), j6.optString(bi.aE));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("market").authority(BaseConstants.MARKET_URI_AUTHORITY_DETAIL).appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(a5)) {
            builder.appendQueryParameter(a5, str2);
        }
        if (a(activity, builder.build())) {
            b(e5, jSONObject, -1, 8, "market://details?id=" + str);
            com.ss.android.downloadlib.b.a.a("am_v2", jSONObject, e5, true);
            return;
        }
        b(e5, jSONObject, 2, 8, "market://details?id=" + str);
        com.ss.android.downloadlib.b.a.a(a((Context) activity, Uri.parse("market://details?id=" + str)), e5, true);
    }

    public static boolean a(@NonNull Activity activity, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.putExtra("start_only_for_android", true);
        String j5 = com.ss.android.socialbase.appdownloader.f.e.j();
        if (m.e(com.ss.android.downloadlib.addownload.k.a(), j5)) {
            intent.setPackage(j5);
        }
        if (!m.a(com.ss.android.downloadlib.addownload.k.a(), intent)) {
            return false;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "start v2");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.b.g a(Context context, String str, com.ss.android.downloadad.api.a.a aVar) {
        Intent a5 = a(context, aVar, str, 1, (String) null);
        if (a5 != null) {
            l.a().a(f10090a, "tryOpenByPackage", "成功构造了跳转中转Activity的intent");
            com.ss.android.downloadlib.addownload.b.g a6 = a(a5, true, context, str, aVar);
            if (a6.a() == 3) {
                return a6;
            }
        }
        Intent g5 = m.g(context, str);
        if (g5 == null) {
            return new com.ss.android.downloadlib.addownload.b.g(4, 22);
        }
        return a(g5, false, context, str, aVar);
    }

    private static com.ss.android.downloadlib.addownload.b.g a(Intent intent, boolean z4, Context context, String str, com.ss.android.downloadad.api.a.a aVar) {
        if (Build.VERSION.SDK_INT >= 26 && com.ss.android.downloadlib.addownload.k.j().optInt("open_package_mode") == 1 && com.ss.android.downloadlib.addownload.k.m() != null && com.ss.android.downloadlib.addownload.k.m().a() && aVar.q() && !z4) {
            TTDelegateActivity.b(str, aVar);
            return new com.ss.android.downloadlib.addownload.b.g(3);
        }
        intent.putExtra("start_only_for_android", true);
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.b.g(3);
        } catch (Exception e5) {
            if (z4) {
                l.a().b(f10090a, "realTryOpenByPackage", "调起中转Activity出现异常，可能是没接转化SDK，回退普通调起" + e5.getMessage());
                return new com.ss.android.downloadlib.addownload.b.g(8, 23);
            }
            l.a().b(f10090a, "realTryOpenByPackage", "包名调起失败了，抛出异常" + e5.getMessage());
            return new com.ss.android.downloadlib.addownload.b.g(4, 23);
        }
    }

    static com.ss.android.downloadlib.addownload.b.g a(String str, com.ss.android.downloadad.api.a.a aVar) {
        return a(com.ss.android.downloadlib.addownload.k.a(), str, aVar);
    }

    private static com.ss.android.downloadlib.addownload.b.g a(Context context, Intent intent, com.ss.android.downloadad.api.a.a aVar, boolean z4, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.k.a();
        }
        if (m.b(context, intent)) {
            if (com.ss.android.downloadlib.addownload.k.j().optInt("open_url_mode") == 0 && com.ss.android.downloadlib.addownload.k.m() != null && com.ss.android.downloadlib.addownload.k.m().a() && Build.VERSION.SDK_INT >= 26 && aVar.q() && !z4) {
                TTDelegateActivity.a(str, aVar);
                return new com.ss.android.downloadlib.addownload.b.g(1);
            }
            try {
                context.startActivity(intent);
                return new com.ss.android.downloadlib.addownload.b.g(1);
            } catch (Exception e5) {
                if (z4) {
                    l.a().b(f10090a, "realTryOpenByUrl", "商店直投注入clickId优化url调起场景，抛出异常，没接转化SDK，回退普通调起" + e5.getMessage());
                    return new com.ss.android.downloadlib.addownload.b.g(9);
                }
                l.a().b(f10090a, "realTryOpenByUrl", "url调起失败了，抛出异常" + e5.getMessage());
                return new com.ss.android.downloadlib.addownload.b.g(2);
            }
        }
        return new com.ss.android.downloadlib.addownload.b.g(2, 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.b.g a(@NonNull com.ss.android.downloadad.api.a.b bVar, String str, String str2) {
        com.ss.android.downloadlib.addownload.b.g b5 = b(str, bVar);
        return (com.ss.android.downloadlib.b.f.a(bVar) && b5.a() == 2) ? a(str2, bVar) : b5;
    }

    public static void a(@NonNull Activity activity, String str, long j5) {
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        JSONObject jSONObject = new JSONObject();
        JSONObject j6 = com.ss.android.downloadlib.addownload.k.j();
        String optString = j6.optString(bi.aE);
        String a5 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString("ca"), optString);
        String a6 = com.ss.android.socialbase.appdownloader.f.c.a(j6.optString(com.umeng.ccg.a.f12822a), optString);
        StringBuilder sb = new StringBuilder("market://details?id=");
        if (!TextUtils.isEmpty(a5) && !TextUtils.isEmpty(a6)) {
            sb.append(str);
            sb.append("&");
            sb.append(a5);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(a6);
        }
        if (c(activity, Uri.parse(sb.toString()))) {
            b(e5, jSONObject, -1, 10, "market://details?id=" + str);
            com.ss.android.downloadlib.b.a.a("am_hr2", jSONObject, e5, true);
            return;
        }
        b(e5, jSONObject, 2, 10, "market://details?id=" + str);
        com.ss.android.downloadlib.b.a.a(a((Context) activity, Uri.parse("market://details?id=" + str)), e5, true);
    }

    private static Intent a(Context context, com.ss.android.downloadad.api.a.a aVar, String str, int i5, String str2) {
        if (!aVar.c() || aVar.w() == null || aVar.w().getDownloadMode() != 2 || aVar.u() == null || e.a(aVar).a("app_link_market_open_add_info", 0) != 1) {
            return null;
        }
        String c5 = com.ss.android.downloadlib.addownload.i.c(aVar.u());
        String d5 = com.ss.android.downloadlib.addownload.i.d(aVar.u());
        Intent intent = new Intent();
        intent.setClassName(str, AdBaseConstants.MARKET_OPEN_BRIDGE_ACTIVITY);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        if (TextUtils.isEmpty(c5) || resolveActivity == null) {
            return null;
        }
        intent.putExtra(AdBaseConstants.MARKET_OPEN_CLICK_ID, c5);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        if (!TextUtils.isEmpty(d5)) {
            intent.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_EXTRA, d5);
        }
        if (i5 == 2 && !TextUtils.isEmpty(str2)) {
            intent.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL, str2);
        }
        return intent;
    }
}

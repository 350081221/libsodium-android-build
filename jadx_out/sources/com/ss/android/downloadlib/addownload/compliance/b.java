package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.r;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.c;
import com.ss.android.downloadlib.g.m;
import com.umeng.analytics.pro.bi;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private SoftReference<Activity> f9730a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static b f9739a = new b();
    }

    public void b(long j5) {
        com.ss.android.downloadlib.addownload.e a5 = com.ss.android.downloadlib.g.a().a(com.ss.android.downloadlib.addownload.b.f.a().e(j5).f9659b.getDownloadUrl());
        if (a5 != null) {
            a5.a(true, true);
        } else {
            g.a(11, j5);
            com.ss.android.downloadlib.e.c.a().b("startDownload handler null");
        }
    }

    private b() {
    }

    public static b a() {
        return a.f9739a;
    }

    public void a(long j5) {
        TTDelegateActivity.a(j5);
    }

    public boolean a(DownloadModel downloadModel) {
        if (!downloadModel.isAd() || k.j().optInt("ad_lp_show_app_dialog") == 0) {
            return false;
        }
        String webUrl = downloadModel.getDeepLink() == null ? null : downloadModel.getDeepLink().getWebUrl();
        return (TextUtils.isEmpty(webUrl) || Pattern.compile(k.j().optString("ad_allow_web_url_regex", ".+(www.chengzijianzhan.com|www.toutiaopage.com/tetris/page|ad.toutiao.com/tetris/page).+")).matcher(webUrl).matches()) ? false : true;
    }

    public Activity b() {
        Activity activity = this.f9730a.get();
        this.f9730a = null;
        return activity;
    }

    public boolean a(@NonNull com.ss.android.downloadlib.addownload.b.e eVar) {
        long j5;
        long j6;
        if (!TextUtils.isEmpty(eVar.f9659b.getLogExtra())) {
            try {
                j5 = m.a(new JSONObject(eVar.f9659b.getLogExtra()), "convert_id");
            } catch (Exception e5) {
                e5.printStackTrace();
                j5 = 0;
            }
            if (j5 <= 0) {
                g.a(3, eVar);
            }
            j6 = j5;
        } else {
            g.a(9, eVar);
            com.ss.android.downloadlib.e.c.a().a("requestAppInfo getLogExtra null");
            j6 = 0;
        }
        final long j7 = eVar.f9658a;
        com.ss.android.downloadlib.addownload.b.b a5 = c.a().a(j6, j7);
        if (a5 != null) {
            d.a().a(a5.a(), j7, a5.f9634d);
            a(a5.a());
            g.a("lp_app_dialog_try_show", eVar);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if (j6 > 0) {
            sb.append("convert_id=");
            sb.append(j6);
        }
        if (!TextUtils.isEmpty(eVar.f9659b.getPackageName())) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append("package_name=");
            sb.append(eVar.f9659b.getPackageName());
        }
        if (sb.length() <= 0) {
            g.a(6, eVar);
            return false;
        }
        final long j8 = j6;
        com.ss.android.downloadlib.g.c.a((c.a<String, R>) new c.a<String, Boolean>() { // from class: com.ss.android.downloadlib.addownload.compliance.b.2
            @Override // com.ss.android.downloadlib.g.c.a
            public Boolean a(String str) {
                final boolean[] zArr = {false};
                k.e().a(HttpGet.METHOD_NAME, str, new HashMap(), new r() { // from class: com.ss.android.downloadlib.addownload.compliance.b.2.1
                    @Override // com.ss.android.download.api.config.r
                    public void a(String str2) {
                        boolean[] zArr2 = zArr;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        zArr2[0] = b.this.a(j8, j7, str2);
                    }

                    @Override // com.ss.android.download.api.config.r
                    public void a(Throwable th) {
                        g.a(2, j7);
                        zArr[0] = false;
                    }
                });
                return Boolean.valueOf(zArr[0]);
            }
        }, "https://apps.oceanengine.com/customer/api/app/pkg_info?" + sb.toString()).a(new c.a<Boolean, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.b.1
            @Override // com.ss.android.downloadlib.g.c.a
            public Object a(Boolean bool) {
                if (bool.booleanValue()) {
                    b.this.a(com.ss.android.downloadlib.addownload.b.b.a(j8, j7));
                    g.b("lp_app_dialog_try_show", j7);
                    return null;
                }
                b.this.b(j7);
                return null;
            }
        }).a();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j5, long j6, String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("package");
            if (optJSONObject != null && optJSONObject.length() != 0) {
                com.ss.android.downloadlib.addownload.b.b bVar = new com.ss.android.downloadlib.addownload.b.b();
                bVar.f9631a = j5;
                bVar.f9632b = j6;
                bVar.f9634d = optJSONObject.optString("icon_url");
                bVar.f9635e = optJSONObject.optString("app_name");
                bVar.f9633c = optJSONObject.optString(bi.f12269o);
                bVar.f9636f = optJSONObject.optString("version_name");
                bVar.f9637g = optJSONObject.optString("developer_name");
                bVar.f9639i = optJSONObject.optString("policy_url");
                JSONArray optJSONArray = optJSONObject.optJSONArray("permissions");
                if (optJSONArray != null) {
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        JSONObject jSONObject = (JSONObject) optJSONArray.get(i5);
                        bVar.f9638h.add(new Pair<>(jSONObject.optString("permission_name"), jSONObject.optString("permission_desc")));
                    }
                }
                c.a().a(bVar);
                d.a().a(bVar.a(), j6, bVar.f9634d);
                return true;
            }
            g.a(7, j6);
            return false;
        } catch (Exception e5) {
            com.ss.android.downloadlib.e.c.a().a(e5, "AdLpComplianceManager parseResponse");
            g.a(7, j6);
            return false;
        }
    }

    public void a(Activity activity) {
        this.f9730a = new SoftReference<>(activity);
    }
}

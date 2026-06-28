package com.ss.android.downloadlib.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.s;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.DeepLink;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.l;
import com.ss.android.downloadlib.g.m;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9968a = "a";

    public static boolean a(@NonNull com.ss.android.downloadlib.addownload.b.e eVar) {
        boolean z4;
        DeepLink deepLink = eVar.f9659b.getDeepLink();
        String openUrl = deepLink == null ? null : deepLink.getOpenUrl();
        JSONObject a5 = com.ss.android.downloadlib.g.f.a(new JSONObject(), eVar);
        m.a(a5, "applink_source", "click_by_sdk");
        com.ss.android.downloadlib.d.a.a().b("applink_click", a5, eVar);
        com.ss.android.downloadlib.addownload.b.g a6 = com.ss.android.downloadlib.g.i.a(openUrl, eVar);
        if (a6.a() == 2) {
            if (!TextUtils.isEmpty(openUrl)) {
                b("by_url", a6, a5, eVar);
            }
            a6 = com.ss.android.downloadlib.g.i.a(k.a(), eVar.f9659b.getPackageName(), eVar);
        }
        boolean z5 = false;
        if (a(eVar.f9658a) && k.j().optInt("link_ad_click_event") == 1) {
            DownloadModel downloadModel = eVar.f9659b;
            if (downloadModel instanceof AdDownloadModel) {
                ((AdDownloadModel) downloadModel).setFunnelType(4);
            }
            com.ss.android.downloadlib.d.a.a().a(eVar.f9658a, 0);
            z4 = true;
        } else {
            z4 = false;
        }
        int a7 = a6.a();
        if (a7 == 1) {
            b("by_url", a5, eVar);
        } else if (a7 == 3) {
            a("by_package", a5, eVar);
        } else {
            if (a7 != 4) {
                com.ss.android.downloadlib.e.c.a().b("AppLinkClick default");
            } else {
                a("by_package", a6, a5, eVar);
            }
            if (z5 && !z4 && ((com.ss.android.downloadlib.d.c.a().b() && !com.ss.android.downloadlib.d.c.a().b(eVar.f9658a, eVar.f9659b.getLogExtra())) || com.ss.android.downloadlib.d.c.a().c())) {
                com.ss.android.downloadlib.d.a.a().a(eVar.f9658a, 2);
            }
            return z5;
        }
        z5 = true;
        if (z5) {
            com.ss.android.downloadlib.d.a.a().a(eVar.f9658a, 2);
        }
        return z5;
    }

    public static void b(com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return;
        }
        String f5 = com.ss.android.socialbase.downloader.g.a.c().b("app_link_opt") == 1 ? bVar.f() : null;
        JSONObject a5 = com.ss.android.downloadlib.g.f.a(new JSONObject(), bVar);
        m.a(a5, "applink_source", "dialog_click_by_sdk");
        com.ss.android.downloadlib.d.a.a().b("applink_click", a5, bVar);
        com.ss.android.downloadlib.addownload.b.g a6 = com.ss.android.downloadlib.g.i.a(f5, bVar);
        if (a6.a() == 2) {
            if (!TextUtils.isEmpty(f5)) {
                b("dialog_by_url", a6, a5, bVar);
            }
            a6 = com.ss.android.downloadlib.g.i.a(k.a(), bVar.e(), bVar);
        }
        int a7 = a6.a();
        if (a7 == 1) {
            b("dialog_by_url", a5, bVar);
            return;
        }
        if (a7 == 3) {
            a("dialog_by_package", a5, bVar);
        } else if (a7 != 4) {
            com.ss.android.downloadlib.e.c.a().b("AppLinkClickDialog default");
        } else {
            a("dialog_by_package", a6, a5, bVar);
        }
    }

    public static void b(String str, @NonNull final JSONObject jSONObject, @NonNull final com.ss.android.downloadad.api.a.a aVar) {
        m.a(jSONObject, "applink_source", str);
        m.a(jSONObject, "download_scene", Integer.valueOf(aVar.t()));
        com.ss.android.downloadlib.d.a.a().b("deeplink_url_open", jSONObject, aVar);
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1721882089:
                if (str.equals("auto_by_url")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1374618233:
                if (str.equals("by_url")) {
                    c5 = 1;
                    break;
                }
                break;
            case -129544387:
                if (str.equals("notify_by_url")) {
                    c5 = 2;
                    break;
                }
                break;
            case 829750366:
                if (str.equals("dialog_by_url")) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 3:
                if ((k.j().optInt("check_applink_mode") & 1) != 0) {
                    m.a(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                    e.a().a(new d() { // from class: com.ss.android.downloadlib.b.a.2
                        @Override // com.ss.android.downloadlib.b.d
                        public void a(boolean z4) {
                            String str2;
                            com.ss.android.downloadlib.d.a a5 = com.ss.android.downloadlib.d.a.a();
                            if (z4) {
                                str2 = "deeplink_success";
                            } else {
                                str2 = "deeplink_failed";
                            }
                            a5.b(str2, jSONObject, aVar);
                            if (z4) {
                                k.v().a(k.a(), aVar.u(), aVar.w(), aVar.v(), aVar.e(), 0);
                            }
                        }
                    });
                    return;
                } else {
                    k.c().a(k.a(), aVar.u(), aVar.w(), aVar.v(), aVar.e(), str);
                    return;
                }
            default:
                return;
        }
    }

    public static void a(@NonNull com.ss.android.downloadad.api.a.b bVar) {
        String f5 = bVar.f();
        JSONObject a5 = com.ss.android.downloadlib.g.f.a(new JSONObject(), bVar);
        m.a(a5, "applink_source", "notify_click_by_sdk");
        com.ss.android.downloadlib.d.a.a().b("applink_click", a5, bVar);
        com.ss.android.downloadlib.addownload.b.g a6 = com.ss.android.downloadlib.g.i.a(f5, bVar);
        if (a6.a() == 2) {
            if (!TextUtils.isEmpty(f5)) {
                b("notify_by_url", a6, a5, bVar);
            }
            a6 = com.ss.android.downloadlib.g.i.a(k.a(), bVar.e(), bVar);
        }
        int a7 = a6.a();
        if (a7 == 1) {
            b("notify_by_url", a5, bVar);
            return;
        }
        if (a7 == 3) {
            a("notify_by_package", a5, bVar);
        } else if (a7 != 4) {
            com.ss.android.downloadlib.e.c.a().b("AppLinkClickNotification default");
        } else {
            a("notify_by_package", a6, a5, bVar);
        }
    }

    public static void b(String str, @NonNull com.ss.android.downloadlib.addownload.b.g gVar, @NonNull JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.a.a aVar) {
        m.a(jSONObject, "applink_source", str);
        m.a(jSONObject, "error_code", Integer.valueOf(gVar.b()));
        m.a(jSONObject, "download_scene", Integer.valueOf(aVar.t()));
        com.ss.android.downloadlib.d.a.a().b("deeplink_url_open_fail", jSONObject, aVar);
    }

    public static boolean a(String str, @NonNull com.ss.android.downloadad.api.a.b bVar) {
        if (!com.ss.android.downloadlib.addownload.i.b(bVar.O())) {
            return false;
        }
        if (TextUtils.isEmpty(bVar.f()) && TextUtils.isEmpty(str)) {
            return false;
        }
        com.ss.android.socialbase.downloader.notification.b.a().f(bVar.s());
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.g.f.a(jSONObject, bVar);
        m.a(jSONObject, "applink_source", "auto_click");
        com.ss.android.downloadlib.d.a.a().b("applink_click", bVar);
        com.ss.android.downloadlib.addownload.b.g a5 = com.ss.android.downloadlib.g.i.a(bVar, bVar.f(), bVar.e());
        int a6 = a5.a();
        if (a6 == 1) {
            b("auto_by_url", jSONObject, bVar);
            return true;
        }
        if (a6 == 2) {
            b("auto_by_url", a5, jSONObject, bVar);
            return false;
        }
        if (a6 == 3) {
            a("auto_by_package", jSONObject, bVar);
            return true;
        }
        if (a6 != 4) {
            return false;
        }
        a("auto_by_package", a5, jSONObject, bVar);
        return false;
    }

    public static void a(String str, @NonNull final JSONObject jSONObject, @NonNull final com.ss.android.downloadad.api.a.a aVar) {
        m.a(jSONObject, "applink_source", str);
        m.a(jSONObject, "download_scene", Integer.valueOf(aVar.t()));
        com.ss.android.downloadlib.d.a.a().b("deeplink_app_open", jSONObject, aVar);
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1282070764:
                if (str.equals("notify_by_package")) {
                    c5 = 0;
                    break;
                }
                break;
            case -441514770:
                if (str.equals("auto_by_package")) {
                    c5 = 1;
                    break;
                }
                break;
            case -185950114:
                if (str.equals("by_package")) {
                    c5 = 2;
                    break;
                }
                break;
            case 368401333:
                if (str.equals("dialog_by_package")) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 3:
                if ((k.j().optInt("check_applink_mode") & 1) != 0) {
                    m.a(jSONObject, "check_applink_result_by_sdk", (Object) 1);
                    e.a().a(new d() { // from class: com.ss.android.downloadlib.b.a.1
                        @Override // com.ss.android.downloadlib.b.d
                        public void a(boolean z4) {
                            String str2;
                            com.ss.android.downloadlib.d.a a5 = com.ss.android.downloadlib.d.a.a();
                            if (z4) {
                                str2 = "deeplink_success";
                            } else {
                                str2 = "deeplink_failed";
                            }
                            a5.b(str2, jSONObject, aVar);
                            if (z4) {
                                k.v().a(k.a(), aVar.u(), aVar.w(), aVar.v(), aVar.e(), 0);
                            }
                        }
                    });
                    return;
                } else {
                    k.c().a(k.a(), aVar.u(), aVar.w(), aVar.v(), aVar.e(), str);
                    return;
                }
            default:
                return;
        }
    }

    public static void a(String str, @NonNull com.ss.android.downloadlib.addownload.b.g gVar, @NonNull JSONObject jSONObject, @NonNull com.ss.android.downloadad.api.a.a aVar) {
        m.a(jSONObject, "applink_source", str);
        m.a(jSONObject, "error_code", Integer.valueOf(gVar.b()));
        m.a(jSONObject, "download_scene", Integer.valueOf(aVar.t()));
        com.ss.android.downloadlib.d.a.a().b("deeplink_app_open_fail", jSONObject, aVar);
    }

    public static boolean a(@NonNull com.ss.android.downloadlib.addownload.b.e eVar, int i5) {
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "download_scene", Integer.valueOf(eVar.t()));
        com.ss.android.downloadlib.d.a.a().b("market_click_open", jSONObject, eVar);
        com.ss.android.downloadlib.addownload.b.g a5 = com.ss.android.downloadlib.g.i.a(k.a(), eVar, eVar.f9659b.getPackageName());
        String a6 = m.a(a5.c(), "open_market");
        int a7 = a5.a();
        if (a7 == 5) {
            a(a6, jSONObject, eVar, true);
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
        com.ss.android.downloadlib.d.a.a().a(eVar.f9658a, i5);
        return true;
    }

    public static void a(final String str, @Nullable final JSONObject jSONObject, final com.ss.android.downloadlib.addownload.b.e eVar, boolean z4) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e5) {
                com.ss.android.downloadlib.e.c.a().a(e5, "onMarketSuccess");
                return;
            }
        }
        m.a(jSONObject, "applink_source", str);
        m.a(jSONObject, "download_scene", Integer.valueOf(eVar.t()));
        if (z4) {
            com.ss.android.downloadlib.d.a.a().b("market_open_success", jSONObject, eVar);
        }
        if ((k.j().optInt("check_applink_mode") & 4) != 0) {
            e.a().b(new d() { // from class: com.ss.android.downloadlib.b.a.3
                @Override // com.ss.android.downloadlib.b.d
                public void a(boolean z5) {
                    String str2;
                    if (!z5 && !"open_market".equals(str)) {
                        a.a(com.ss.android.downloadlib.g.i.a(k.a(), Uri.parse("market://details?id=" + eVar.e())), eVar, false);
                    }
                    com.ss.android.downloadlib.d.a a5 = com.ss.android.downloadlib.d.a.a();
                    if (z5) {
                        str2 = "market_delay_success";
                    } else {
                        str2 = "market_delay_failed";
                    }
                    a5.a(str2, jSONObject, eVar);
                    if (z5) {
                        s v4 = k.v();
                        Context a6 = k.a();
                        com.ss.android.downloadlib.addownload.b.e eVar2 = eVar;
                        DownloadModel downloadModel = eVar2.f9659b;
                        v4.a(a6, downloadModel, eVar2.f9661d, eVar2.f9660c, downloadModel.getPackageName(), 2);
                    }
                }
            });
        } else {
            com.ss.android.download.api.config.c c5 = k.c();
            Context a5 = k.a();
            DownloadModel downloadModel = eVar.f9659b;
            c5.a(a5, downloadModel, eVar.f9661d, eVar.f9660c, downloadModel.getPackageName(), str);
        }
        com.ss.android.downloadad.api.a.b a6 = com.ss.android.downloadlib.addownload.b.f.a().a(eVar.f9659b.getPackageName());
        if (a6 != null) {
            l.a().a(f9968a, "onMarketSuccess", "商店场景,缓存中已有NativeDownloadModel记录,进行复用");
        } else {
            l.a().a(f9968a, "onMarketSuccess", "商店场景,缓存中没有相应的NativeDownloadModel,需要新建");
            a6 = new com.ss.android.downloadad.api.a.b(eVar.f9659b, eVar.f9660c, eVar.f9661d);
        }
        a6.e(2);
        a6.f(System.currentTimeMillis());
        a6.h(4);
        a6.i(2);
        com.ss.android.downloadlib.addownload.b.f.a().a(a6);
        l.a().a(f9968a, "onMarketSuccess", "检测到跳商店成功事件,准备开始检测安装行为");
        com.ss.android.downloadlib.h.a().a(eVar, a6);
    }

    public static void a(com.ss.android.downloadlib.addownload.b.g gVar, com.ss.android.downloadlib.addownload.b.e eVar, boolean z4) {
        String a5 = m.a(gVar.c(), "open_market");
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "ttdownloader_type", "backup");
        int a6 = gVar.a();
        if (a6 == 5) {
            a(a5, jSONObject, eVar, z4);
        } else {
            if (a6 != 6) {
                return;
            }
            m.a(jSONObject, "error_code", Integer.valueOf(gVar.b()));
            m.a(jSONObject, "download_scene", Integer.valueOf(eVar.t()));
            com.ss.android.downloadlib.d.a.a().b("market_open_failed", jSONObject, eVar);
        }
    }

    public static boolean a(long j5) {
        return com.ss.android.downloadlib.addownload.b.f.a().d(j5) == null;
    }
}

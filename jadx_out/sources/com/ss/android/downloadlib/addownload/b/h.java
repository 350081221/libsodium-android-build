package com.ss.android.downloadlib.addownload.b;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h f9673a;

    private h() {
    }

    public static h a() {
        if (f9673a == null) {
            synchronized (d.class) {
                if (f9673a == null) {
                    f9673a = new h();
                }
            }
        }
        return f9673a;
    }

    public void a(int i5, int i6, com.ss.android.downloadad.api.a.b bVar) {
        if (bVar == null) {
            return;
        }
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(bVar.s());
        if (a5.a("report_api_hijack", 0) == 0) {
            return;
        }
        int i7 = i6 - i5;
        if (i5 <= 0 || i7 <= a5.a("check_api_hijack_version_code_diff", 500)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version_code_diff", i7);
            jSONObject.put("installed_version_code", i6);
            jSONObject.put("hijack_type", 1);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().b("api_hijack", jSONObject, bVar);
    }
}

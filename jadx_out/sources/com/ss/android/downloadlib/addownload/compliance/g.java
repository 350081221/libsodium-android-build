package com.ss.android.downloadlib.addownload.compliance;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g {
    public static void a(String str, long j5) {
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        if (e5.x()) {
            return;
        }
        e5.f9660c.setRefer(str);
        com.ss.android.downloadlib.d.a.a().b("lp_app_dialog_click", e5);
    }

    public static void b(String str, long j5) {
        a(str, null, j5);
    }

    public static void a(String str, JSONObject jSONObject, long j5) {
        com.ss.android.downloadlib.d.a.a().b(str, jSONObject, com.ss.android.downloadlib.addownload.b.f.a().e(j5));
    }

    public static void a(String str, com.ss.android.downloadlib.addownload.b.e eVar) {
        com.ss.android.downloadlib.d.a.a().b(str, eVar);
    }

    public static void a(int i5, com.ss.android.downloadlib.addownload.b.e eVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i5));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().b("lp_compliance_error", jSONObject, eVar);
    }

    public static void a(int i5, long j5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("error_code", Integer.valueOf(i5));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().b("lp_compliance_error", jSONObject, com.ss.android.downloadlib.addownload.b.f.a().e(j5));
    }
}

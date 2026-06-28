package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class k0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f8603a = b.i();

    /* renamed from: b, reason: collision with root package name */
    public String f8604b;

    /* renamed from: c, reason: collision with root package name */
    public String f8605c;

    /* renamed from: d, reason: collision with root package name */
    public String f8606d;

    public k0(String str, String str2, String str3) {
        this.f8604b = str;
        this.f8605c = str2;
        this.f8606d = str3;
    }

    public final void a(String str, List<q> list) {
        Pair<String, String> a5 = u0.a(str);
        new t(list, (String) a5.first, (String) a5.second, this.f8606d).a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, List<q>> a5;
        y.c("hmsSdk", "eventReportTask is running");
        boolean a6 = q0.a(this.f8603a);
        if (a6) {
            y.c("hmsSdk", "workKey is refresh,begin report all data");
            this.f8605c = "alltype";
        }
        try {
            try {
                a5 = w.a(this.f8603a, this.f8604b, this.f8605c);
            } catch (IllegalArgumentException e5) {
                y.e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e5.getMessage());
                if ("alltype".equals(this.f8605c)) {
                    g0.a(this.f8603a, "stat_v2_1", new String[0]);
                    g0.a(this.f8603a, "cached_v2_1", new String[0]);
                } else {
                    String a7 = u0.a(this.f8604b, this.f8605c);
                    g0.a(this.f8603a, "stat_v2_1", a7);
                    g0.a(this.f8603a, "cached_v2_1", a7);
                }
            } catch (Exception e6) {
                y.e("hmsSdk", "readEventRecords handData Exception:" + e6.getMessage());
                if ("alltype".equals(this.f8605c)) {
                    g0.a(this.f8603a, "stat_v2_1", new String[0]);
                    g0.a(this.f8603a, "cached_v2_1", new String[0]);
                } else {
                    String a8 = u0.a(this.f8604b, this.f8605c);
                    g0.a(this.f8603a, "stat_v2_1", a8);
                    g0.a(this.f8603a, "cached_v2_1", a8);
                }
            }
            if (a5.size() == 0) {
                y.b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f8604b, this.f8605c);
                if ("alltype".equals(this.f8605c)) {
                    g0.a(this.f8603a, "stat_v2_1", new String[0]);
                    g0.a(this.f8603a, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String a9 = u0.a(this.f8604b, this.f8605c);
                    g0.a(this.f8603a, "stat_v2_1", a9);
                    g0.a(this.f8603a, "cached_v2_1", a9);
                    return;
                }
            }
            for (Map.Entry<String, List<q>> entry : a5.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            if ("alltype".equals(this.f8605c)) {
                g0.a(this.f8603a, "stat_v2_1", new String[0]);
                g0.a(this.f8603a, "cached_v2_1", new String[0]);
            } else {
                String a10 = u0.a(this.f8604b, this.f8605c);
                g0.a(this.f8603a, "stat_v2_1", a10);
                g0.a(this.f8603a, "cached_v2_1", a10);
            }
            if (a6) {
                y.c("hmsSdk", "refresh local key");
                d0.f().b();
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f8605c)) {
                g0.a(this.f8603a, "stat_v2_1", new String[0]);
                g0.a(this.f8603a, "cached_v2_1", new String[0]);
            } else {
                String a11 = u0.a(this.f8604b, this.f8605c);
                g0.a(this.f8603a, "stat_v2_1", a11);
                g0.a(this.f8603a, "cached_v2_1", a11);
            }
            throw th;
        }
    }
}

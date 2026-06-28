package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.h;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f8408f = "a";

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, Map<String, String>>> f8409a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Long> f8410b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    private final c f8411c;

    /* renamed from: d, reason: collision with root package name */
    private final c f8412d;

    /* renamed from: e, reason: collision with root package name */
    private final h f8413e;

    public a(c cVar, c cVar2, h hVar) {
        this.f8412d = cVar2;
        this.f8411c = cVar;
        this.f8413e = hVar;
        hVar.a(this);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l5 = this.f8410b.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l5)) {
            bVar.a(2);
            return;
        }
        if (e.a(l5, 300000L)) {
            this.f8413e.a(new com.huawei.hms.framework.network.grs.g.k.c(grsBaseInfo, context), null, str, this.f8412d);
        }
        bVar.a(1);
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f8410b.get(str), 300000L)) {
            this.f8413e.a(new com.huawei.hms.framework.network.grs.g.k.c(grsBaseInfo, context), null, null, this.f8412d);
        }
    }

    public c a() {
        return this.f8411c;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        Map<String, Map<String, String>> map = this.f8409a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        a(grsBaseInfo, bVar, context, str);
        return map.get(str);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f8411c.b(grsParasKey + CrashHianalyticsData.TIME, "0");
        this.f8410b.remove(grsParasKey + CrashHianalyticsData.TIME);
        this.f8409a.remove(grsParasKey);
        this.f8413e.a(grsParasKey);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.k.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f8408f, "update cache from server failed");
            return;
        }
        if (cVar.d().size() != 0) {
            this.f8411c.b("geoipCountryCode", dVar.j());
            this.f8411c.b("geoipCountryCodetime", dVar.a());
            return;
        }
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        if (dVar.m()) {
            this.f8409a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.f8411c.a(grsParasKey, "")));
        } else {
            this.f8411c.b(grsParasKey, dVar.j());
            this.f8409a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
        }
        if (!TextUtils.isEmpty(dVar.e())) {
            this.f8411c.b(grsParasKey + "ETag", dVar.e());
        }
        this.f8411c.b(grsParasKey + CrashHianalyticsData.TIME, dVar.a());
        this.f8410b.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
    }

    public h b() {
        return this.f8413e;
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a5 = this.f8411c.a(grsParasKey, "");
        String a6 = this.f8411c.a(grsParasKey + CrashHianalyticsData.TIME, "0");
        long j5 = 0;
        if (!TextUtils.isEmpty(a6) && a6.matches("\\d+")) {
            try {
                j5 = Long.parseLong(a6);
            } catch (NumberFormatException e5) {
                Logger.w(f8408f, "convert urlParamKey from String to Long catch NumberFormatException.", e5);
            }
        }
        this.f8409a.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a5));
        this.f8410b.put(grsParasKey, Long.valueOf(j5));
        a(grsBaseInfo, grsParasKey, context);
    }

    public c c() {
        return this.f8412d;
    }
}

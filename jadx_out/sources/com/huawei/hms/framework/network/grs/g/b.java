package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8442a;

    /* renamed from: b, reason: collision with root package name */
    private final GrsBaseInfo f8443b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f8444c;

    public b(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo) {
        this.f8442a = context;
        this.f8443b = grsBaseInfo;
        this.f8444c = aVar;
    }

    public String a(boolean z4) {
        String str;
        String str2 = com.huawei.hms.framework.network.grs.a.a(this.f8444c.a().a("geoipCountryCode", ""), "geoip.countrycode").get(org.slf4j.a.f22214f0);
        Logger.i("GeoipCountry", "geoIpCountry is: " + str2);
        String a5 = this.f8444c.a().a("geoipCountryCodetime", "0");
        long j5 = 0;
        if (!TextUtils.isEmpty(a5) && a5.matches("\\d+")) {
            try {
                j5 = Long.parseLong(a5);
            } catch (NumberFormatException e5) {
                Logger.w("GeoipCountry", "convert urlParamKey from String to Long catch NumberFormatException.", e5);
            }
        }
        if (TextUtils.isEmpty(str2) || com.huawei.hms.framework.network.grs.h.e.a(Long.valueOf(j5))) {
            com.huawei.hms.framework.network.grs.g.k.c cVar = new com.huawei.hms.framework.network.grs.g.k.c(this.f8443b, this.f8442a);
            cVar.a("geoip.countrycode");
            com.huawei.hms.framework.network.grs.e.c c5 = this.f8444c.c();
            if (c5 != null) {
                try {
                    str = i.a(c5.a("services", ""), cVar.c());
                } catch (JSONException e6) {
                    Logger.w("GeoipCountry", "getGeoipCountry merge services occure jsonException. %s", StringUtils.anonymizeMessage(e6.getMessage()));
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    c5.b("services", str);
                }
            }
            if (z4) {
                d a6 = this.f8444c.b().a(cVar, "geoip.countrycode", c5);
                if (a6 != null) {
                    str2 = com.huawei.hms.framework.network.grs.a.a(a6.j(), "geoip.countrycode").get(org.slf4j.a.f22214f0);
                }
                Logger.i("GeoipCountry", "sync request to query geoip.countrycode is:" + str2);
            } else {
                Logger.i("GeoipCountry", "async request to query geoip.countrycode");
                this.f8444c.b().a(cVar, null, "geoip.countrycode", c5);
            }
        }
        return str2;
    }
}

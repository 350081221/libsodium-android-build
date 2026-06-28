package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.h;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f8374e = "a";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f8375a;

    /* renamed from: b, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f8376b;

    /* renamed from: c, reason: collision with root package name */
    private h f8377c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f8378d;

    /* renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0165a implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f8379a;

        /* renamed from: b, reason: collision with root package name */
        Map<String, String> f8380b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f8381c;

        /* renamed from: d, reason: collision with root package name */
        Context f8382d;

        /* renamed from: e, reason: collision with root package name */
        GrsBaseInfo f8383e;

        /* renamed from: f, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f8384f;

        C0165a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f8379a = str;
            this.f8380b = map;
            this.f8381c = iQueryUrlsCallBack;
            this.f8382d = context;
            this.f8383e = grsBaseInfo;
            this.f8384f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.f8380b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f8374e, "get expired cache localUrls");
                this.f8381c.onCallBackSuccess(this.f8380b);
            } else {
                if (this.f8380b != null) {
                    this.f8381c.onCallBackFail(-3);
                    return;
                }
                Logger.i(a.f8374e, "access local config for return a domain.");
                this.f8381c.onCallBackSuccess(com.huawei.hms.framework.network.grs.f.b.a(this.f8382d.getPackageName(), this.f8383e).a(this.f8382d, this.f8384f, this.f8383e, this.f8379a, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            Map<String, String> a5 = a.a(dVar.j(), this.f8379a);
            if (a5.isEmpty()) {
                Map<String, String> map = this.f8380b;
                if (map != null && !map.isEmpty()) {
                    Logger.i(a.f8374e, "get expired cache localUrls");
                    this.f8381c.onCallBackSuccess(this.f8380b);
                    return;
                } else if (this.f8380b != null) {
                    this.f8381c.onCallBackFail(-5);
                    return;
                } else {
                    Logger.i(a.f8374e, "access local config for return a domain.");
                    a5 = com.huawei.hms.framework.network.grs.f.b.a(this.f8382d.getPackageName(), this.f8383e).a(this.f8382d, this.f8384f, this.f8383e, this.f8379a, true);
                }
            } else {
                Logger.i(a.f8374e, "get url is from remote server");
            }
            this.f8381c.onCallBackSuccess(a5);
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements com.huawei.hms.framework.network.grs.b {

        /* renamed from: a, reason: collision with root package name */
        String f8385a;

        /* renamed from: b, reason: collision with root package name */
        String f8386b;

        /* renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f8387c;

        /* renamed from: d, reason: collision with root package name */
        String f8388d;

        /* renamed from: e, reason: collision with root package name */
        Context f8389e;

        /* renamed from: f, reason: collision with root package name */
        GrsBaseInfo f8390f;

        /* renamed from: g, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f8391g;

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f8385a = str;
            this.f8386b = str2;
            this.f8387c = iQueryUrlCallBack;
            this.f8388d = str3;
            this.f8389e = context;
            this.f8390f = grsBaseInfo;
            this.f8391g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.f8388d)) {
                Logger.i(a.f8374e, "get expired cache localUrl");
                this.f8387c.onCallBackSuccess(this.f8388d);
            } else {
                if (!TextUtils.isEmpty(this.f8388d)) {
                    this.f8387c.onCallBackFail(-3);
                    return;
                }
                Logger.i(a.f8374e, "access local config for return a domain.");
                this.f8387c.onCallBackSuccess(com.huawei.hms.framework.network.grs.f.b.a(this.f8389e.getPackageName(), this.f8390f).a(this.f8389e, this.f8391g, this.f8390f, this.f8385a, this.f8386b, true));
            }
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            String a5;
            IQueryUrlCallBack iQueryUrlCallBack;
            Map<String, String> a6 = a.a(dVar.j(), this.f8385a);
            if (a6.containsKey(this.f8386b)) {
                Logger.i(a.f8374e, "get url is from remote server");
                iQueryUrlCallBack = this.f8387c;
                a5 = a6.get(this.f8386b);
            } else if (!TextUtils.isEmpty(this.f8388d)) {
                Logger.i(a.f8374e, "get expired cache localUrl");
                this.f8387c.onCallBackSuccess(this.f8388d);
                return;
            } else if (!TextUtils.isEmpty(this.f8388d)) {
                this.f8387c.onCallBackFail(-5);
                return;
            } else {
                Logger.i(a.f8374e, "access local config for return a domain.");
                a5 = com.huawei.hms.framework.network.grs.f.b.a(this.f8389e.getPackageName(), this.f8390f).a(this.f8389e, this.f8391g, this.f8390f, this.f8385a, this.f8386b, true);
                iQueryUrlCallBack = this.f8387c;
            }
            iQueryUrlCallBack.onCallBackSuccess(a5);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, h hVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.f8375a = grsBaseInfo;
        this.f8376b = aVar;
        this.f8377c = hVar;
        this.f8378d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z4) {
        return new CountryCodeBean(context, z4);
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f8374e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e5) {
            Logger.w(f8374e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e5.getMessage()));
            return concurrentHashMap;
        }
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> a5 = this.f8376b.a(this.f8375a, str, bVar, context);
        if (a5 == null || a5.isEmpty()) {
            Map<String, String> a6 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), this.f8375a).a(context, this.f8376b, this.f8375a, str, false);
            return a6 != null ? a6 : new HashMap();
        }
        com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
        return a5;
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f8374e, "isSpExpire jsonValue from server is null.");
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f8374e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return hashMap;
            }
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.get(next).toString());
            }
            return hashMap;
        } catch (JSONException e5) {
            Logger.w(f8374e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e5.getMessage()));
            return hashMap;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String obj = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(obj)) {
                    concurrentHashMap.put(next, obj);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e5) {
            Logger.w(f8374e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e5.getMessage()));
            return concurrentHashMap;
        }
    }

    public String a(Context context, String str) {
        com.huawei.hms.framework.network.grs.g.d a5 = this.f8377c.a(new com.huawei.hms.framework.network.grs.g.k.c(this.f8375a, context), str, this.f8378d);
        return a5 == null ? "" : a5.m() ? this.f8376b.a().a(this.f8375a.getGrsParasKey(true, true, context), "") : a5.j();
    }

    public String a(String str, String str2, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(str3)) {
            Logger.i(f8374e, "get unexpired cache localUrl: %s", StringUtils.anonymizeMessage(str3));
            com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
            return str3;
        }
        String str4 = a(a(context, str), str).get(str2);
        if (!TextUtils.isEmpty(str4)) {
            Logger.i(f8374e, "get url is from remote server");
            com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
            return str4;
        }
        if (TextUtils.isEmpty(str3)) {
            Logger.i(f8374e, "access local config for return a domain.");
            str3 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), this.f8375a).a(context, this.f8376b, this.f8375a, str, str2, true);
        } else {
            Logger.i(f8374e, "get expired cache localUrl");
        }
        Logger.i(f8374e, "synGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
        return str3;
    }

    public Map<String, String> a(String str, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a5 = a(str, bVar, context);
        if (bVar.a() && !a5.isEmpty()) {
            Logger.i(f8374e, "get unexpired cache localUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a5).toString()));
            com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
            return a5;
        }
        Map<String, String> a6 = a(a(context, str), str);
        if (!a6.isEmpty()) {
            Logger.i(f8374e, "get url is from remote server");
            com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
            return a6;
        }
        if (a5.isEmpty()) {
            Logger.i(f8374e, "access local config for return a domain.");
            a5 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName(), this.f8375a).a(context, this.f8376b, this.f8375a, str, true);
        } else {
            Logger.i(f8374e, "get expired cache localUrls");
        }
        String str2 = f8374e;
        Object[] objArr = new Object[1];
        objArr[0] = StringUtils.anonymizeMessage(a5 != null ? new JSONObject(a5).toString() : "");
        Logger.i(str2, "synGetGrsUrls: %s", objArr);
        return a5;
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> a5 = a(str, bVar, context);
        if (!bVar.a()) {
            this.f8377c.a(new com.huawei.hms.framework.network.grs.g.k.c(this.f8375a, context), new C0165a(str, a5, iQueryUrlsCallBack, context, this.f8375a, this.f8376b), str, this.f8378d);
            return;
        }
        String str2 = f8374e;
        Logger.i(str2, "get unexpired cache localUrls");
        if (a5.isEmpty()) {
            iQueryUrlsCallBack.onCallBackFail(-5);
            return;
        }
        com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
        Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(a5).toString()));
        iQueryUrlsCallBack.onCallBackSuccess(a5);
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f8377c.a(new com.huawei.hms.framework.network.grs.g.k.c(this.f8375a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f8375a, this.f8376b), str, this.f8378d);
            return;
        }
        String str4 = f8374e;
        Logger.i(str4, "get unexpired cache localUrl");
        if (TextUtils.isEmpty(str3)) {
            iQueryUrlCallBack.onCallBackFail(-5);
            return;
        }
        com.huawei.hms.framework.network.grs.f.b.a(context, this.f8375a);
        Logger.i(str4, "ayncGetGrsUrl: %s", StringUtils.anonymizeMessage(str3));
        iQueryUrlCallBack.onCallBackSuccess(str3);
    }
}

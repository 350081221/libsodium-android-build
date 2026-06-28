package com.tendcloud.tenddata;

import androidx.autofill.HintConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class be {

    /* renamed from: a, reason: collision with root package name */
    private static volatile be f11475a;

    /* renamed from: b, reason: collision with root package name */
    private static String f11476b;

    /* renamed from: c, reason: collision with root package name */
    private static String f11477c;

    /* renamed from: d, reason: collision with root package name */
    private static String f11478d;

    /* renamed from: e, reason: collision with root package name */
    private static String f11479e;

    /* renamed from: f, reason: collision with root package name */
    private static String f11480f;

    /* renamed from: g, reason: collision with root package name */
    private static String f11481g;

    /* renamed from: h, reason: collision with root package name */
    private static String f11482h;

    /* renamed from: i, reason: collision with root package name */
    private static String f11483i;

    /* renamed from: j, reason: collision with root package name */
    private static String f11484j;

    /* renamed from: k, reason: collision with root package name */
    private static String f11485k;

    /* renamed from: l, reason: collision with root package name */
    private static String f11486l;

    /* renamed from: m, reason: collision with root package name */
    private static String f11487m;

    /* renamed from: n, reason: collision with root package name */
    private static String f11488n;

    /* renamed from: o, reason: collision with root package name */
    private static String f11489o;

    /* renamed from: p, reason: collision with root package name */
    private static String f11490p;

    /* renamed from: q, reason: collision with root package name */
    private static String f11491q;

    /* renamed from: r, reason: collision with root package name */
    private static String f11492r;

    /* renamed from: t, reason: collision with root package name */
    private static String f11493t;

    /* renamed from: z, reason: collision with root package name */
    private static JSONObject f11494z;

    /* renamed from: s, reason: collision with root package name */
    private String f11495s;

    /* renamed from: v, reason: collision with root package name */
    private String f11497v;

    /* renamed from: w, reason: collision with root package name */
    private int f11498w;

    /* renamed from: x, reason: collision with root package name */
    private String f11499x;

    /* renamed from: y, reason: collision with root package name */
    private JSONObject f11500y;

    /* renamed from: u, reason: collision with root package name */
    private a f11496u = a.UNKNOWN;
    private Map<String, Object> A = new TreeMap();

    /* loaded from: classes3.dex */
    public enum a {
        MALE,
        FEMALE,
        UNKNOWN
    }

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
        f11476b = ServiceManagerNative.ACCOUNT;
        f11477c = "accountId";
        f11478d = "name";
        f11479e = HintConstants.AUTOFILL_HINT_GENDER;
        f11480f = "age";
        f11481g = "type";
        f11482h = "accountCus";
        f11483i = "property1";
        f11484j = "property2";
        f11485k = "property3";
        f11486l = "property4";
        f11487m = "property5";
        f11488n = "property6";
        f11489o = "property7";
        f11490p = "property8";
        f11491q = "property9";
        f11492r = "property10";
        f11493t = "default";
    }

    private be() {
    }

    private boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void b(Object obj, Object obj2, Object obj3, com.tendcloud.tenddata.a aVar) {
        try {
            c();
            Map<String, Object> b5 = b();
            b5.putAll((Map) obj);
            JSONObject jSONObject = new JSONObject(b5);
            i.setUniversalProfileInfo(jSONObject.toString());
            ct.a().setProfile(jSONObject);
            a(obj3, obj2, obj, aVar);
        } catch (Throwable unused) {
        }
    }

    private void c() {
        try {
            String m5 = i.m();
            if (m5 != null) {
                JSONObject jSONObject = new JSONObject(m5);
                if (jSONObject.has(f11477c)) {
                    String string = jSONObject.getString(f11477c);
                    this.f11495s = string;
                    this.A.put(f11477c, string);
                }
                if (jSONObject.has(f11478d)) {
                    Map<String, Object> map = this.A;
                    String str = f11478d;
                    map.put(str, jSONObject.getString(str));
                }
                if (jSONObject.has(f11481g)) {
                    Map<String, Object> map2 = this.A;
                    String str2 = f11481g;
                    map2.put(str2, Integer.valueOf(jSONObject.getInt(str2)));
                }
                if (jSONObject.has(f11479e)) {
                    Map<String, Object> map3 = this.A;
                    String str3 = f11479e;
                    map3.put(str3, Integer.valueOf(jSONObject.getInt(str3)));
                }
                if (jSONObject.has(f11480f)) {
                    Map<String, Object> map4 = this.A;
                    String str4 = f11480f;
                    map4.put(str4, Integer.valueOf(jSONObject.getInt(str4)));
                }
                if (jSONObject.has(f11483i)) {
                    Map<String, Object> map5 = this.A;
                    String str5 = f11483i;
                    map5.put(str5, jSONObject.get(str5));
                }
                if (jSONObject.has(f11484j)) {
                    Map<String, Object> map6 = this.A;
                    String str6 = f11484j;
                    map6.put(str6, jSONObject.get(str6));
                }
                if (jSONObject.has(f11485k)) {
                    Map<String, Object> map7 = this.A;
                    String str7 = f11485k;
                    map7.put(str7, jSONObject.get(str7));
                }
                if (jSONObject.has(f11486l)) {
                    Map<String, Object> map8 = this.A;
                    String str8 = f11486l;
                    map8.put(str8, jSONObject.get(str8));
                }
                if (jSONObject.has(f11487m)) {
                    Map<String, Object> map9 = this.A;
                    String str9 = f11487m;
                    map9.put(str9, jSONObject.get(str9));
                }
                if (jSONObject.has(f11488n)) {
                    Map<String, Object> map10 = this.A;
                    String str10 = f11488n;
                    map10.put(str10, jSONObject.get(str10));
                }
                if (jSONObject.has(f11489o)) {
                    Map<String, Object> map11 = this.A;
                    String str11 = f11489o;
                    map11.put(str11, jSONObject.get(str11));
                }
                if (jSONObject.has(f11490p)) {
                    Map<String, Object> map12 = this.A;
                    String str12 = f11490p;
                    map12.put(str12, jSONObject.get(str12));
                }
                if (jSONObject.has(f11491q)) {
                    Map<String, Object> map13 = this.A;
                    String str13 = f11491q;
                    map13.put(str13, jSONObject.get(str13));
                }
                if (jSONObject.has(f11492r)) {
                    Map<String, Object> map14 = this.A;
                    String str14 = f11492r;
                    map14.put(str14, jSONObject.get(str14));
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void d() {
        try {
            Map<String, Object> f5 = f();
            zz.a aVar = new zz.a();
            aVar.paraMap.put("apiType", 9);
            aVar.paraMap.put(ClientCookie.DOMAIN_ATTR, f11476b);
            aVar.paraMap.put("action", "update");
            aVar.paraMap.put("data", f5);
            zz.c().obtainMessage(102, aVar).sendToTarget();
            ct.a().setProfile(new JSONObject(f5));
        } catch (Throwable unused) {
        }
    }

    private static void e() {
        i.setLastRoleName(f11493t);
        i.b(f11493t, f11494z.toString());
    }

    private Map<String, Object> f() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put(f11477c, this.f11495s);
            int i5 = this.f11498w;
            if (i5 != 0) {
                treeMap.put(f11480f, Integer.valueOf(i5));
            }
            if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(this.f11496u.name())) {
                treeMap.put(f11479e, this.f11496u.name());
            }
            String str = this.f11497v;
            if (str != null) {
                treeMap.put(f11478d, str);
            }
            String str2 = this.f11499x;
            if (str2 != null) {
                treeMap.put(f11481g, str2);
            }
            JSONObject jSONObject = this.f11500y;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", this.f11500y);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    private static Map<String, Object> g() {
        TreeMap treeMap = new TreeMap();
        try {
            treeMap.put("name", f11493t);
            JSONObject jSONObject = f11494z;
            if (jSONObject != null && jSONObject.length() > 0) {
                treeMap.put("custom", f11494z);
            }
        } catch (Throwable unused) {
        }
        return treeMap;
    }

    private static void h() {
        try {
            ct.a().setSubprofile(new JSONObject(g()));
            b(null);
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventAccount(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap != null && Integer.parseInt(String.valueOf(hashMap.get("apiType"))) == 9) {
                    aVar.paraMap.get(ServiceManagerNative.ACCOUNT);
                    com.tendcloud.tenddata.a aVar2 = (com.tendcloud.tenddata.a) aVar.paraMap.get("service");
                    Object obj = aVar.paraMap.get("data");
                    Object obj2 = aVar.paraMap.get(ClientCookie.DOMAIN_ATTR);
                    Object obj3 = aVar.paraMap.get("action");
                    Object obj4 = aVar.paraMap.get("immediate");
                    if (obj3 != null) {
                        if (!obj3.equals("login") && !obj3.equals("register")) {
                            if (obj3.equals("roleCreate")) {
                                a(String.valueOf(aVar.paraMap.get("parameter")), aVar2);
                                return;
                            } else if (obj3.equals("update")) {
                                b(obj, obj3, obj2, aVar2);
                                return;
                            }
                        }
                        a(String.valueOf(aVar.paraMap.get("accountId")), obj, obj3, obj2, aVar.paraMap.get("invitationCode"), aVar.paraMap.get("eventValue"), aVar2);
                        return;
                    }
                    if (obj3 != null) {
                        a(obj2, obj3, obj, aVar2);
                        if (a(obj4)) {
                            a(aVar2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setAccountType(String str) {
        try {
            String str2 = this.f11499x;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f11499x = str;
                d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setAge(int i5) {
        try {
            if (this.f11498w != i5) {
                this.f11498w = i5;
                d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setGender(a aVar) {
        try {
            if (this.f11496u != aVar) {
                this.f11496u = aVar;
                d();
            }
        } catch (Throwable unused) {
        }
    }

    public void setName(String str) {
        try {
            String str2 = this.f11497v;
            if (str2 == null || !str2.equalsIgnoreCase(str)) {
                this.f11497v = str;
                d();
            }
        } catch (Throwable unused) {
        }
    }

    private void a(com.tendcloud.tenddata.a aVar) {
        try {
            bu buVar = new bu();
            buVar.f11567b = bu.a.IMMEDIATELY;
            buVar.f11566a = aVar;
            z.a().post(buVar);
        } catch (Throwable unused) {
        }
    }

    protected static void a(Object obj, Object obj2, Object obj3, com.tendcloud.tenddata.a aVar) {
        a(obj, obj2, obj3, null, aVar);
    }

    protected static void a(Object obj, Object obj2, Object obj3, Object obj4, com.tendcloud.tenddata.a aVar) {
        if (aVar == null || obj == null || obj2 == null || !(obj instanceof String) || !(obj2 instanceof String)) {
            return;
        }
        bv bvVar = new bv();
        bvVar.f11569b = String.valueOf(obj);
        bvVar.f11570c = String.valueOf(obj2);
        if (obj3 != null && (obj3 instanceof Map)) {
            Map<String, Object> map = (Map) obj3;
            if (obj4 != null) {
                map.put("eventValue", obj4);
            }
            bvVar.f11571d = map;
        }
        bvVar.f11568a = aVar;
        z.a().post(bvVar);
    }

    private Map<String, Object> b() {
        try {
            String str = this.f11495s;
            if (str != null) {
                this.A.put(f11477c, str);
            }
        } catch (Throwable unused) {
        }
        return this.A;
    }

    public synchronized void b(String str, String str2) {
        if (this.f11500y == null) {
            this.f11500y = new JSONObject();
        }
        try {
            this.f11500y.put(str, str2);
            d();
        } catch (Throwable unused) {
        }
    }

    public synchronized void b(String str, int i5) {
        if (this.f11500y == null) {
            this.f11500y = new JSONObject();
        }
        try {
            this.f11500y.put(str, i5);
            d();
        } catch (Throwable unused) {
        }
    }

    private void a(String str, Object obj, Object obj2, Object obj3, Object obj4, com.tendcloud.tenddata.a aVar) {
        a(str, obj, obj2, obj3, obj4, null, aVar);
    }

    private void a(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, com.tendcloud.tenddata.a aVar) {
        try {
            c();
            String str2 = this.f11495s;
            if (str2 != null && !str2.equals(str)) {
                this.A.clear();
            }
            this.f11495s = str;
            TreeMap treeMap = new TreeMap();
            treeMap.put(f11477c, this.f11495s);
            treeMap.putAll((Map) obj);
            if (obj4 != null) {
                treeMap.put("invitationCode", String.valueOf(obj4));
            }
            this.A.putAll(treeMap);
            JSONObject jSONObject = new JSONObject(this.A);
            i.setUniversalProfileInfo(jSONObject.toString());
            ct.a().setProfile(jSONObject);
            a(obj3, obj2, treeMap, obj5, aVar);
        } catch (Throwable unused) {
        }
    }

    private static void b(com.tendcloud.tenddata.a aVar) {
        try {
            Map<String, Object> g5 = g();
            ct.a().setSubprofile(new JSONObject(g5));
            a(f11476b, "roleUpdate", g5, aVar);
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            this.f11495s = str;
            String a5 = i.a(str);
            if (a5 != null) {
                JSONObject jSONObject = new JSONObject(a5);
                if (jSONObject.has(f11478d)) {
                    this.f11497v = jSONObject.getString(f11478d);
                }
                if (jSONObject.has(f11479e)) {
                    this.f11496u = a.valueOf(jSONObject.getString(f11479e));
                }
                if (jSONObject.has(f11480f)) {
                    this.f11498w = jSONObject.getInt(f11480f);
                }
                if (jSONObject.has(f11481g)) {
                    this.f11499x = jSONObject.getString(f11481g);
                }
                if (jSONObject.has(f11482h)) {
                    this.f11500y = jSONObject.getJSONObject(f11482h);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void a(String str, com.tendcloud.tenddata.a aVar) {
        synchronized (be.class) {
            try {
                f11494z = new JSONObject();
                f11493t = str;
                Map<String, Object> g5 = g();
                a(f11476b, "roleCreate", g5, aVar);
                ct.a().setSubprofile(new JSONObject(g5));
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void a(String str, String str2) {
        if (f11494z == null) {
            f11494z = new JSONObject();
        }
        try {
            f11494z.put(str, str2);
            e();
            h();
        } catch (Throwable unused) {
        }
    }

    public synchronized void a(String str, int i5) {
        if (f11494z == null) {
            f11494z = new JSONObject();
        }
        try {
            f11494z.put(str, i5);
            e();
            h();
        } catch (Throwable unused) {
        }
    }

    public static be a() {
        if (f11475a == null) {
            synchronized (be.class) {
                if (f11475a == null) {
                    f11475a = new be();
                }
            }
        }
        return f11475a;
    }
}

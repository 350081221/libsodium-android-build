package org.osmdroid.tileprovider.tilesource.bing;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: j, reason: collision with root package name */
    private static final String f21764j = "imageWidth";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21765k = "imageHeight";

    /* renamed from: l, reason: collision with root package name */
    private static final String f21766l = "imageUrl";

    /* renamed from: m, reason: collision with root package name */
    private static final String f21767m = "imageUrlSubdomains";

    /* renamed from: n, reason: collision with root package name */
    private static final String f21768n = "ZoomMin";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21769o = "ZoomMax";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21770p = "copyright";

    /* renamed from: d, reason: collision with root package name */
    public String f21774d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f21775e;

    /* renamed from: a, reason: collision with root package name */
    public String f21771a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f21772b = 256;

    /* renamed from: c, reason: collision with root package name */
    public int f21773c = 256;

    /* renamed from: f, reason: collision with root package name */
    public int f21776f = 22;

    /* renamed from: g, reason: collision with root package name */
    public int f21777g = 1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21778h = false;

    /* renamed from: i, reason: collision with root package name */
    private int f21779i = 0;

    public static c a() {
        return new c();
    }

    public static c b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        c cVar = new c();
        if (jSONObject != null) {
            cVar.f21771a = jSONObject2.getString(f21770p);
            if (jSONObject.has(f21765k)) {
                cVar.f21772b = jSONObject.getInt(f21765k);
            }
            if (jSONObject.has(f21764j)) {
                cVar.f21773c = jSONObject.getInt(f21764j);
            }
            if (jSONObject.has(f21768n)) {
                cVar.f21777g = jSONObject.getInt(f21768n);
            }
            if (jSONObject.has(f21769o)) {
                cVar.f21776f = jSONObject.getInt(f21769o);
            }
            String string = jSONObject.getString(f21766l);
            cVar.f21774d = string;
            if (string != null && string.matches(".*?\\{.*?\\}.*?")) {
                cVar.f21774d = cVar.f21774d.replaceAll("\\{.*?\\}", "%s");
            }
            JSONArray jSONArray = jSONObject.getJSONArray(f21767m);
            if (jSONArray != null && jSONArray.length() >= 1) {
                cVar.f21775e = new String[jSONArray.length()];
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    cVar.f21775e[i5] = jSONArray.getString(i5);
                }
            }
            cVar.f21778h = true;
            return cVar;
        }
        throw new Exception("JSON to parse is null");
    }

    public synchronized String c() {
        String[] strArr = this.f21775e;
        if (strArr != null && strArr.length > 0) {
            int i5 = this.f21779i;
            String str = strArr[i5];
            if (i5 < strArr.length - 1) {
                this.f21779i = i5 + 1;
            } else {
                this.f21779i = 0;
            }
            return str;
        }
        return null;
    }
}

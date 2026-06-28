package com.bytedance.tools.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private String f6294a;

    /* renamed from: b, reason: collision with root package name */
    private String f6295b;

    /* renamed from: c, reason: collision with root package name */
    private String f6296c;

    /* renamed from: d, reason: collision with root package name */
    private List<c> f6297d;

    public b(String str, String str2) {
        this.f6294a = "";
        this.f6295b = str;
        this.f6296c = str2;
    }

    public String a() {
        return this.f6295b;
    }

    public boolean b(b bVar) {
        String str;
        if (bVar == null || (str = this.f6295b) == null) {
            return false;
        }
        return str.equals(bVar.a());
    }

    public String c() {
        return this.f6294a;
    }

    public String d() {
        return this.f6296c;
    }

    public List<c> e() {
        return this.f6297d;
    }

    public String f() {
        return String.format("%s(%s)", c(), a());
    }

    public b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f6294a = jSONObject.optString("preview_type");
            this.f6295b = jSONObject.optString("preview_aid");
            this.f6297d = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("preview_cids");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return;
            }
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                this.f6297d.add(new c(optJSONArray.optJSONObject(i5)));
            }
        }
    }
}

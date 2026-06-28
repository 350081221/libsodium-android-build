package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class at {

    /* renamed from: a, reason: collision with root package name */
    public k f8139a;
    public boolean abc;

    /* renamed from: b, reason: collision with root package name */
    public def f8140b;
    public String cde;
    public Context ghi;

    /* renamed from: h, reason: collision with root package name */
    public String f8146h;
    public String hij;

    /* renamed from: i, reason: collision with root package name */
    public String f8147i;
    public String ijk;
    public String ikl;

    /* renamed from: j, reason: collision with root package name */
    public String f8148j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8149k;
    public String klm;

    /* renamed from: l, reason: collision with root package name */
    public long f8150l;
    public String lmn;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8151m;

    /* renamed from: n, reason: collision with root package name */
    public ay f8152n;

    /* renamed from: o, reason: collision with root package name */
    public String f8153o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8154p;

    /* renamed from: q, reason: collision with root package name */
    public long f8155q;

    /* renamed from: r, reason: collision with root package name */
    public av f8156r;

    /* renamed from: w, reason: collision with root package name */
    public long f8161w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8162x;
    public boolean fgh = true;
    public boolean efg = false;
    public boolean def = false;
    public String bcd = "";

    /* renamed from: c, reason: collision with root package name */
    public long f8141c = 30;

    /* renamed from: d, reason: collision with root package name */
    public String f8142d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f8143e = "";

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f8144f = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    private Map<String, String> f8163y = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public String f8145g = "";

    /* renamed from: s, reason: collision with root package name */
    public String f8157s = "";

    /* renamed from: t, reason: collision with root package name */
    public String f8158t = "";

    /* renamed from: u, reason: collision with root package name */
    public String f8159u = "";

    /* renamed from: v, reason: collision with root package name */
    public String f8160v = "";

    public final void klm(String str, String str2) {
        this.f8163y.put(str, str2);
    }

    public final String lmn() {
        return TextUtils.isEmpty(this.f8160v) ? "" : this.f8160v;
    }

    public final String lmn(String str) {
        return this.f8163y.get(str);
    }

    public final void lmn(String str, String str2) {
        this.f8144f.put(str, str2);
    }
}

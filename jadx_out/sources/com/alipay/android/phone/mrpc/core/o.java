package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes2.dex */
public final class o extends t {

    /* renamed from: b, reason: collision with root package name */
    public String f2740b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2741c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2745g;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Header> f2743e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public Map<String, String> f2744f = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public String f2742d = URLEncodedUtils.CONTENT_TYPE;

    public o(String str) {
        this.f2740b = str;
    }

    public final String a() {
        return this.f2740b;
    }

    public final void a(String str) {
        this.f2742d = str;
    }

    public final void a(String str, String str2) {
        if (this.f2744f == null) {
            this.f2744f = new HashMap();
        }
        this.f2744f.put(str, str2);
    }

    public final void a(Header header) {
        this.f2743e.add(header);
    }

    public final void a(boolean z4) {
        this.f2745g = z4;
    }

    public final void a(byte[] bArr) {
        this.f2741c = bArr;
    }

    public final String b(String str) {
        Map<String, String> map = this.f2744f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final byte[] b() {
        return this.f2741c;
    }

    public final String c() {
        return this.f2742d;
    }

    public final ArrayList<Header> d() {
        return this.f2743e;
    }

    public final boolean e() {
        return this.f2745g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f2741c;
        if (bArr == null) {
            if (oVar.f2741c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f2741c)) {
            return false;
        }
        String str = this.f2740b;
        String str2 = oVar.f2740b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f2744f;
        int hashCode = ((map == null || !map.containsKey("id")) ? 1 : this.f2744f.get("id").hashCode() + 31) * 31;
        String str = this.f2740b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f2740b, this.f2743e);
    }
}

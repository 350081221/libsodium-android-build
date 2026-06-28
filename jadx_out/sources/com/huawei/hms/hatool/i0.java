package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class i0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8559a;

    /* renamed from: b, reason: collision with root package name */
    public String f8560b;

    /* renamed from: c, reason: collision with root package name */
    public String f8561c;

    /* renamed from: d, reason: collision with root package name */
    public String f8562d;

    /* renamed from: e, reason: collision with root package name */
    public String f8563e;

    /* renamed from: f, reason: collision with root package name */
    public List<q> f8564f;

    public i0(byte[] bArr, String str, String str2, String str3, String str4, List<q> list) {
        this.f8559a = (byte[]) bArr.clone();
        this.f8560b = str;
        this.f8561c = str2;
        this.f8563e = str3;
        this.f8562d = str4;
        this.f8564f = list;
    }

    public final b0 a(Map<String, String> map) {
        return a0.a(this.f8560b, this.f8559a, map);
    }

    public final Map<String, String> a() {
        return d1.b(this.f8561c, this.f8563e, this.f8562d);
    }

    public final void b() {
        o0.c().a(new l0(this.f8564f, this.f8561c, this.f8562d, this.f8563e));
    }

    @Override // java.lang.Runnable
    public void run() {
        y.c("hmsSdk", "send data running");
        int b5 = a(a()).b();
        if (b5 != 200) {
            b();
            return;
        }
        y.b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f8562d, this.f8563e, this.f8561c, Integer.valueOf(b5));
    }
}

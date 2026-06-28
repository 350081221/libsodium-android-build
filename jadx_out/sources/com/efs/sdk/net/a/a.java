package com.efs.sdk.net.a;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f6777c;

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, c> f6778a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, d> f6779b;

    private a() {
        b();
    }

    public static a a() {
        if (f6777c == null) {
            f6777c = new a();
        }
        return f6777c;
    }

    private void b() {
        if (this.f6778a == null) {
            this.f6778a = new HashMap<>();
        }
        this.f6778a.clear();
    }

    public final d c(String str) {
        if (this.f6779b == null) {
            this.f6779b = new HashMap<>();
        }
        if (this.f6779b.containsKey(str)) {
            return this.f6779b.get(str);
        }
        d dVar = new d();
        dVar.A = str;
        dVar.D = System.currentTimeMillis();
        this.f6779b.put(str, dVar);
        return dVar;
    }

    public final void d(String str) {
        HashMap<String, d> hashMap = this.f6779b;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f6779b.remove(str);
        }
    }

    public final c a(String str) {
        if (this.f6778a == null) {
            b();
        }
        c cVar = this.f6778a.get(str);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        cVar2.f6801a = str;
        cVar2.f6802b = System.currentTimeMillis();
        this.f6778a.put(str, cVar2);
        return cVar2;
    }

    public final void b(String str) {
        HashMap<String, c> hashMap = this.f6778a;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return;
        }
        this.f6778a.remove(str);
    }
}

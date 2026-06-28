package com.huawei.hms.hatool;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static x f8690b = new x();

    /* renamed from: a, reason: collision with root package name */
    public a f8691a = new a();

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f8692a;

        /* renamed from: b, reason: collision with root package name */
        public String f8693b;

        /* renamed from: c, reason: collision with root package name */
        public long f8694c = 0;

        public a() {
        }

        public void a(long j5) {
            x.this.f8691a.f8694c = j5;
        }

        public void a(String str) {
            x.this.f8691a.f8693b = str;
        }

        public void b(String str) {
            x.this.f8691a.f8692a = str;
        }
    }

    public static x d() {
        return f8690b;
    }

    public String a() {
        return this.f8691a.f8693b;
    }

    public void a(String str, String str2) {
        long b5 = b();
        String b6 = r0.b(str, str2);
        if (b6 == null || b6.isEmpty()) {
            y.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b5 == 0) {
            b5 = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - b5 <= 43200000) {
            return;
        }
        String e5 = f2.b.e(16);
        String a5 = e.a(b6, e5);
        this.f8691a.a(b5);
        this.f8691a.b(e5);
        this.f8691a.a(a5);
    }

    public long b() {
        return this.f8691a.f8694c;
    }

    public String c() {
        return this.f8691a.f8692a;
    }
}

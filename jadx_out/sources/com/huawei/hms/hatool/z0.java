package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.UUID;

/* loaded from: classes3.dex */
public class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static z0 f8706b;

    /* renamed from: a, reason: collision with root package name */
    public Context f8707a;

    /* loaded from: classes3.dex */
    public static class a extends a1 {

        /* renamed from: a, reason: collision with root package name */
        public String f8708a;

        /* renamed from: b, reason: collision with root package name */
        public String f8709b;

        public a(String str, String str2) {
            this.f8708a = str;
            this.f8709b = str2;
        }

        @Override // com.huawei.hms.hatool.a1
        public String a() {
            return com.huawei.hms.hatool.a.d(this.f8708a, this.f8709b);
        }

        @Override // com.huawei.hms.hatool.a1
        public String a(String str) {
            return b2.d.b(str);
        }

        @Override // com.huawei.hms.hatool.a1
        public String b() {
            return com.huawei.hms.hatool.a.g(this.f8708a, this.f8709b);
        }

        @Override // com.huawei.hms.hatool.a1
        public String c() {
            return com.huawei.hms.hatool.a.j(this.f8708a, this.f8709b);
        }

        @Override // com.huawei.hms.hatool.a1
        public int d() {
            return (com.huawei.hms.hatool.a.k(this.f8708a, this.f8709b) ? 4 : 0) | 0 | (com.huawei.hms.hatool.a.e(this.f8708a, this.f8709b) ? 2 : 0) | (com.huawei.hms.hatool.a.h(this.f8708a, this.f8709b) ? 1 : 0);
        }
    }

    public static z0 a() {
        z0 z0Var;
        synchronized (z0.class) {
            if (f8706b == null) {
                f8706b = new z0();
            }
            z0Var = f8706b;
        }
        return z0Var;
    }

    public String a(String str, String str2) {
        return g.a(this.f8707a, str, str2);
    }

    public String a(boolean z4) {
        if (!z4) {
            return "";
        }
        String e5 = b.e();
        if (TextUtils.isEmpty(e5)) {
            e5 = g0.a(this.f8707a, "global_v2", "uuid", "");
            if (TextUtils.isEmpty(e5)) {
                e5 = UUID.randomUUID().toString().replace("-", "");
                g0.b(this.f8707a, "global_v2", "uuid", e5);
            }
            b.h(e5);
        }
        return e5;
    }

    public void a(Context context) {
        if (this.f8707a == null) {
            this.f8707a = context;
        }
    }

    public String b(String str, String str2) {
        return g.b(this.f8707a, str, str2);
    }

    public x0 c(String str, String str2) {
        return new a(str, str2).a(this.f8707a);
    }

    public String d(String str, String str2) {
        return c1.b(str, str2);
    }

    public Pair<String, String> e(String str, String str2) {
        if (!com.huawei.hms.hatool.a.f(str, str2)) {
            return new Pair<>("", "");
        }
        String p5 = i.c().b().p();
        String q5 = i.c().b().q();
        if (!TextUtils.isEmpty(p5) && !TextUtils.isEmpty(q5)) {
            return new Pair<>(p5, q5);
        }
        Pair<String, String> e5 = b1.e(this.f8707a);
        i.c().b().k((String) e5.first);
        i.c().b().l((String) e5.second);
        return e5;
    }

    public String f(String str, String str2) {
        return c1.a(str, str2);
    }
}

package com.uyumao;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.bi;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f13688a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13689b;

    /* renamed from: c, reason: collision with root package name */
    public final a f13690c = new a(this, "AZX");

    public o(Context context) {
        this.f13689b = context.getApplicationContext();
    }

    public void a(long j5) {
        this.f13690c.b("smart_" + bi.aX, j5);
        this.f13690c.b("smart_ts", System.currentTimeMillis());
    }

    public final boolean a(String str) {
        long a5 = this.f13690c.a(str + bi.aX, 0L);
        if (a5 <= 0) {
            return true;
        }
        a aVar = this.f13690c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("ts");
        return Math.abs(System.currentTimeMillis() - aVar.a(sb.toString(), 0L)) / 1000 >= a5;
    }

    public long a() {
        return this.f13690c.a("smart_lc", 0L);
    }

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13691a;

        public a(o oVar, String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str + "_";
            }
            this.f13691a = str;
        }

        public final void a(String str, String str2) {
            try {
                if (n.c(e.f13663a)) {
                    m a5 = m.a();
                    a5.getClass();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    a5.f13683b.edit().putString(str, str2).apply();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        public void b(String str, long j5) {
            a(this.f13691a + str, String.valueOf(j5));
        }

        public long a(String str, long j5) {
            String str2 = this.f13691a + str;
            String valueOf = String.valueOf(j5);
            try {
                if (n.c(e.f13663a)) {
                    valueOf = m.a().f13683b.getString(str2, valueOf);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                return Long.parseLong(valueOf);
            } catch (Exception unused) {
                return j5;
            }
        }
    }
}

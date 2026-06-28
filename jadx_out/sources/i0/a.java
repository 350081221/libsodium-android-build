package i0;

import a1.j;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0448a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16138a = "RecordPref";

        /* renamed from: b, reason: collision with root package name */
        public static final String f16139b = "alipay_cashier_statistic_record";

        public static synchronized int a(Context context, String str) {
            synchronized (C0448a.class) {
                a1.e.g(f16138a, "stat remove " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    C0449a b5 = b(context);
                    if (b5.f16140a.isEmpty()) {
                        return 0;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, String> entry : b5.f16140a.entrySet()) {
                            if (str.equals(entry.getValue())) {
                                arrayList.add(entry.getKey());
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b5.f16140a.remove((String) it.next());
                        }
                        d(context, b5);
                        return arrayList.size();
                    } catch (Throwable th) {
                        a1.e.d(th);
                        int size = b5.f16140a.size();
                        d(context, new C0449a());
                        return size;
                    }
                }
                return 0;
            }
        }

        public static synchronized C0449a b(Context context) {
            synchronized (C0448a.class) {
                try {
                    String b5 = j.b(null, context, f16139b, null);
                    if (TextUtils.isEmpty(b5)) {
                        return new C0449a();
                    }
                    return new C0449a(b5);
                } catch (Throwable th) {
                    a1.e.d(th);
                    return new C0449a();
                }
            }
        }

        public static synchronized String c(Context context, String str, String str2) {
            synchronized (C0448a.class) {
                a1.e.g(f16138a, "stat append " + str2 + " , " + str);
                if (context != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = UUID.randomUUID().toString();
                    }
                    C0449a b5 = b(context);
                    if (b5.f16140a.size() > 20) {
                        b5.f16140a.clear();
                    }
                    b5.f16140a.put(str2, str);
                    d(context, b5);
                    return str2;
                }
                return null;
            }
        }

        public static synchronized void d(Context context, C0449a c0449a) {
            synchronized (C0448a.class) {
                if (c0449a == null) {
                    try {
                        c0449a = new C0449a();
                    } catch (Throwable th) {
                        a1.e.d(th);
                    }
                }
                j.e(null, context, f16139b, c0449a.a());
            }
        }

        public static synchronized String e(Context context) {
            synchronized (C0448a.class) {
                a1.e.g(f16138a, "stat peek");
                if (context == null) {
                    return null;
                }
                C0449a b5 = b(context);
                if (b5.f16140a.isEmpty()) {
                    return null;
                }
                try {
                    return b5.f16140a.entrySet().iterator().next().getValue();
                } catch (Throwable th) {
                    a1.e.d(th);
                    return null;
                }
            }
        }

        /* renamed from: i0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0449a {

            /* renamed from: a, reason: collision with root package name */
            public final LinkedHashMap<String, String> f16140a = new LinkedHashMap<>();

            public C0449a() {
            }

            public String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.f16140a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    a1.e.d(th);
                    return new JSONArray().toString();
                }
            }

            public C0449a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i5);
                        this.f16140a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    a1.e.d(th);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: i0.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class RunnableC0450a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f16141a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Context f16142b;

            public RunnableC0450a(String str, Context context) {
                this.f16141a = str;
                this.f16142b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(this.f16141a) && !b.e(this.f16142b, this.f16141a)) {
                    return;
                }
                for (int i5 = 0; i5 < 4; i5++) {
                    String e5 = C0448a.e(this.f16142b);
                    if (TextUtils.isEmpty(e5) || !b.e(this.f16142b, e5)) {
                        return;
                    }
                }
            }
        }

        public static synchronized void a(Context context) {
            synchronized (b.class) {
                c(context, null, null);
            }
        }

        public static synchronized void b(Context context, i0.b bVar, String str, String str2) {
            synchronized (b.class) {
                if (context != null && bVar != null && str != null) {
                    c(context, bVar.e(str), str2);
                }
            }
        }

        public static synchronized void c(Context context, String str, String str2) {
            synchronized (b.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    C0448a.c(context, str, str2);
                }
                new Thread(new RunnableC0450a(str, context)).start();
            }
        }

        public static synchronized boolean e(Context context, String str) {
            s0.e eVar;
            synchronized (b.class) {
                a1.e.g(k0.a.A, "stat sub " + str);
                if (m0.a.J().o()) {
                    eVar = new u0.d();
                } else {
                    eVar = new u0.e();
                }
                try {
                    if (eVar.i(null, context, str) == null) {
                        return false;
                    }
                    C0448a.a(context, str);
                    return true;
                } catch (Throwable th) {
                    a1.e.d(th);
                    return false;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16143a = "alipay_cashier_ap_seq_v";

        public static synchronized long a(Context context) {
            long a5;
            synchronized (c.class) {
                a5 = d.a(context, f16143a);
            }
            return a5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        /* JADX WARN: Can't wrap try/catch for region: R(9:3|4|5|(5:7|8|9|10|11)|17|8|9|10|11) */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static synchronized long a(android.content.Context r6, java.lang.String r7) {
            /*
                java.lang.Class<i0.a$d> r0 = i0.a.d.class
                monitor-enter(r0)
                r1 = 0
                java.lang.String r2 = a1.j.b(r1, r6, r7, r1)     // Catch: java.lang.Throwable -> L13
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L13
                if (r3 != 0) goto L13
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L13
                goto L15
            L13:
                r2 = 0
            L15:
                r4 = 1
                long r2 = r2 + r4
                java.lang.String r4 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L1f
                a1.j.e(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> L1f
            L1f:
                monitor-exit(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.a.d.a(android.content.Context, java.lang.String):long");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final String f16144a = "alipay_cashier_statistic_v";

        public static synchronized long a(Context context) {
            long a5;
            synchronized (e.class) {
                a5 = d.a(context, f16144a);
            }
            return a5;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            b.a(context);
        }
    }

    public static synchronized void b(Context context, y0.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context != null && aVar != null) {
                try {
                    C0448a.c(context, aVar.f22670l.e(str), str2);
                } catch (Throwable th) {
                    a1.e.d(th);
                }
            }
        }
    }

    public static void c(y0.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.f22670l.g(str, str2);
    }

    public static void d(y0.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f22670l.h(str, str2, str3);
    }

    public static void e(y0.a aVar, String str, String str2, Throwable th) {
        if (aVar == null) {
            return;
        }
        aVar.f22670l.i(str, str2, th);
    }

    public static void f(y0.a aVar, String str, String str2, Throwable th, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f22670l.j(str, str2, th, str3);
    }

    public static void g(y0.a aVar, String str, Throwable th) {
        if (aVar == null || th == null) {
            return;
        }
        aVar.f22670l.i(str, th.getClass().getSimpleName(), th);
    }

    public static synchronized void h(Context context, y0.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context != null && aVar != null) {
                b.b(context, aVar.f22670l, str, str2);
            }
        }
    }

    public static void i(y0.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.f22670l.n(str, str2, str3);
    }
}

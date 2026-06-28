package z0;

import a1.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final String f22709g = "alipay_tid_storage";

    /* renamed from: h, reason: collision with root package name */
    public static final String f22710h = "tidinfo";

    /* renamed from: i, reason: collision with root package name */
    public static final String f22711i = "tid";

    /* renamed from: j, reason: collision with root package name */
    public static final String f22712j = "client_key";

    /* renamed from: k, reason: collision with root package name */
    public static final String f22713k = "timestamp";

    /* renamed from: l, reason: collision with root package name */
    public static final String f22714l = "vimei";

    /* renamed from: m, reason: collision with root package name */
    public static final String f22715m = "vimsi";

    /* renamed from: n, reason: collision with root package name */
    public static Context f22716n;

    /* renamed from: o, reason: collision with root package name */
    public static a f22717o;

    /* renamed from: a, reason: collision with root package name */
    public String f22718a;

    /* renamed from: b, reason: collision with root package name */
    public String f22719b;

    /* renamed from: c, reason: collision with root package name */
    public long f22720c;

    /* renamed from: d, reason: collision with root package name */
    public String f22721d;

    /* renamed from: e, reason: collision with root package name */
    public String f22722e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22723f = false;

    /* renamed from: z0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0668a {
        public static String a() {
            String str;
            try {
                str = a.f22716n.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                e.d(th);
                str = "";
            }
            return (str + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z4) {
            if (a.f22716n == null) {
                return null;
            }
            String string = a.f22716n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z4) {
                string = o0.e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    e.g(k0.a.A, "tid_str: pref failed");
                }
            }
            e.g(k0.a.A, "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3) {
            d(str, str2, str3, true);
        }

        public static void d(String str, String str2, String str3, boolean z4) {
            if (a.f22716n == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.f22716n.getSharedPreferences(str, 0);
            if (z4) {
                String a5 = a();
                String c5 = o0.e.c(a5, str3, str3);
                if (TextUtils.isEmpty(c5)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, a5);
                }
                str3 = c5;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static boolean e(String str, String str2) {
            if (a.f22716n == null) {
                return false;
            }
            return a.f22716n.getSharedPreferences(str, 0).contains(str2);
        }

        public static void f(String str, String str2) {
            if (a.f22716n == null) {
                return;
            }
            a.f22716n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        public static boolean g(String str, String str2) {
            if (a.f22716n == null) {
                return false;
            }
            return a.f22716n.getSharedPreferences(str, 0).contains(str2);
        }

        public static String h(String str, String str2) {
            return b(str, str2, true);
        }
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f22717o == null) {
                f22717o = new a();
            }
            if (f22716n == null) {
                f22717o.g(context);
            }
            aVar = f22717o;
        }
        return aVar;
    }

    private void d(String str, String str2, String str3, String str4, Long l5) {
        if (e(str, str2, str3, str4)) {
            return;
        }
        this.f22718a = str;
        this.f22719b = str2;
        this.f22721d = str3;
        this.f22722e = str4;
        if (l5 == null) {
            this.f22720c = System.currentTimeMillis();
        } else {
            this.f22720c = l5.longValue();
        }
        s();
    }

    private boolean e(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            return false;
        }
        return true;
    }

    private void g(Context context) {
        if (context != null) {
            f22716n = context.getApplicationContext();
        }
        if (this.f22723f) {
            return;
        }
        this.f22723f = true;
        q();
    }

    private String p() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            java.lang.String r3 = "alipay_tid_storage"
            java.lang.String r4 = "tidinfo"
            r5 = 1
            java.lang.String r3 = z0.a.C0668a.b(r3, r4, r5)     // Catch: java.lang.Exception -> L57
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L57
            if (r4 != 0) goto L53
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L57
            r4.<init>(r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r3 = "tid"
            java.lang.String r3 = r4.optString(r3, r0)     // Catch: java.lang.Exception -> L57
            java.lang.String r5 = "client_key"
            java.lang.String r5 = r4.optString(r5, r0)     // Catch: java.lang.Exception -> L50
            java.lang.String r6 = "timestamp"
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L4d
            long r6 = r4.optLong(r6, r7)     // Catch: java.lang.Exception -> L4d
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L4d
            java.lang.String r6 = "vimei"
            java.lang.String r6 = r4.optString(r6, r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r7 = "vimsi"
            java.lang.String r2 = r4.optString(r7, r0)     // Catch: java.lang.Exception -> L4b
            goto L5e
        L4b:
            r0 = move-exception
            goto L5b
        L4d:
            r0 = move-exception
            r6 = r2
            goto L5b
        L50:
            r0 = move-exception
            r5 = r2
            goto L5a
        L53:
            r0 = r2
            r5 = r0
            r6 = r5
            goto L60
        L57:
            r0 = move-exception
            r3 = r2
            r5 = r3
        L5a:
            r6 = r5
        L5b:
            a1.e.d(r0)
        L5e:
            r0 = r2
            r2 = r3
        L60:
            java.lang.String r3 = "mspl"
            java.lang.String r4 = "tid_str: load"
            a1.e.g(r3, r4)
            boolean r3 = r9.e(r2, r5, r6, r0)
            if (r3 == 0) goto L72
            r9.r()
            goto L80
        L72:
            r9.f22718a = r2
            r9.f22719b = r5
            long r1 = r1.longValue()
            r9.f22720c = r1
            r9.f22721d = r6
            r9.f22722e = r0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.a.q():void");
    }

    private void r() {
        this.f22718a = "";
        this.f22719b = f();
        this.f22720c = System.currentTimeMillis();
        this.f22721d = p();
        this.f22722e = p();
        C0668a.f(f22709g, f22710h);
    }

    private void s() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f22718a);
            jSONObject.put(f22712j, this.f22719b);
            jSONObject.put("timestamp", this.f22720c);
            jSONObject.put(f22714l, this.f22721d);
            jSONObject.put(f22715m, this.f22722e);
            C0668a.d(f22709g, f22710h, jSONObject.toString(), true);
        } catch (Exception e5) {
            e.d(e5);
        }
    }

    private void t() {
    }

    public void b() {
        e.g(k0.a.A, "tid_str: del");
        r();
    }

    public void c(String str, String str2) {
        e.g(k0.a.A, "tid_str: save");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f22718a = str;
            this.f22719b = str2;
            this.f22720c = System.currentTimeMillis();
            s();
            t();
        }
    }

    public String f() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
            return hexString.substring(hexString.length() - 10);
        }
        return hexString;
    }

    public String h() {
        return this.f22719b;
    }

    public String i() {
        return this.f22718a;
    }

    public Long j() {
        return Long.valueOf(this.f22720c);
    }

    public String k() {
        return this.f22721d;
    }

    public String l() {
        return this.f22722e;
    }

    public boolean m() {
        return n();
    }

    public boolean n() {
        if (!TextUtils.isEmpty(this.f22718a) && !TextUtils.isEmpty(this.f22719b) && !TextUtils.isEmpty(this.f22721d) && !TextUtils.isEmpty(this.f22722e)) {
            return false;
        }
        return true;
    }
}

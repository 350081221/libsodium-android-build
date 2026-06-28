package m0;

import a1.c;
import a1.i;
import a1.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Random;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f20799d = "virtualImeiAndImsi";

    /* renamed from: e, reason: collision with root package name */
    public static final String f20800e = "virtual_imei";

    /* renamed from: f, reason: collision with root package name */
    public static final String f20801f = "virtual_imsi";

    /* renamed from: g, reason: collision with root package name */
    public static volatile b f20802g;

    /* renamed from: a, reason: collision with root package name */
    public String f20803a;

    /* renamed from: b, reason: collision with root package name */
    public String f20804b = "sdk-and-lite";

    /* renamed from: c, reason: collision with root package name */
    public String f20805c;

    public b() {
        String a5 = g0.a.a();
        if (!g0.a.c()) {
            this.f20804b += '_' + a5;
        }
    }

    public static String b(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static synchronized void d(String str) {
        synchronized (b.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(y0.b.e().c()).edit().putString(k0.b.f19028i, str).apply();
            k0.a.f18999f = str;
        }
    }

    public static String e(Context context) {
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder();
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                sb.append("(");
                sb.append(packageName);
                sb.append(i.f136b);
                sb.append(packageInfo.versionCode);
                sb.append(")");
                return sb.toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static synchronized b f() {
        b bVar;
        synchronized (b.class) {
            if (f20802g == null) {
                f20802g = new b();
            }
            bVar = f20802g;
        }
        return bVar;
    }

    public static String g() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String h() {
        return "-1;-1";
    }

    public static String i() {
        return "1";
    }

    public static String j() {
        String d5;
        Context c5 = y0.b.e().c();
        SharedPreferences sharedPreferences = c5.getSharedPreferences(f20799d, 0);
        String string = sharedPreferences.getString(f20800e, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(z0.a.a(c5).i())) {
                d5 = g();
            } else {
                d5 = c.c(c5).d();
            }
            String str = d5;
            sharedPreferences.edit().putString(f20800e, str).apply();
            return str;
        }
        return string;
    }

    public static String k() {
        String e5;
        Context c5 = y0.b.e().c();
        SharedPreferences sharedPreferences = c5.getSharedPreferences(f20799d, 0);
        String string = sharedPreferences.getString(f20801f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(z0.a.a(c5).i())) {
                String d5 = y0.b.e().d();
                if (!TextUtils.isEmpty(d5) && d5.length() >= 18) {
                    e5 = d5.substring(3, 18);
                } else {
                    e5 = g();
                }
            } else {
                e5 = c.c(c5).e();
            }
            String str = e5;
            sharedPreferences.edit().putString(f20801f, str).apply();
            return str;
        }
        return string;
    }

    public static String l() {
        return "00";
    }

    public static String m() {
        return "-1";
    }

    public String a() {
        return this.f20805c;
    }

    public String c(y0.a aVar, z0.a aVar2, boolean z4) {
        Context c5 = y0.b.e().c();
        c c6 = c.c(c5);
        if (TextUtils.isEmpty(this.f20803a)) {
            this.f20803a = "Msp/15.8.17 (" + n.W() + i.f136b + n.T() + i.f136b + n.L(c5) + i.f136b + n.U(c5) + i.f136b + n.X(c5) + i.f136b + b(c5);
        }
        String b5 = c.g(c5).b();
        String E = n.E(c5);
        String i5 = i();
        String e5 = c6.e();
        String d5 = c6.d();
        String k5 = k();
        String j5 = j();
        if (aVar2 != null) {
            this.f20805c = aVar2.h();
        }
        String replace = Build.MANUFACTURER.replace(i.f136b, " ");
        String replace2 = Build.MODEL.replace(i.f136b, " ");
        boolean f5 = y0.b.f();
        String h5 = c6.h();
        String m5 = m();
        String l5 = l();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20803a);
        sb.append(i.f136b);
        sb.append(b5);
        sb.append(i.f136b);
        sb.append(E);
        sb.append(i.f136b);
        sb.append(i5);
        sb.append(i.f136b);
        sb.append(e5);
        sb.append(i.f136b);
        sb.append(d5);
        sb.append(i.f136b);
        sb.append(this.f20805c);
        sb.append(i.f136b);
        sb.append(replace);
        sb.append(i.f136b);
        sb.append(replace2);
        sb.append(i.f136b);
        sb.append(f5);
        sb.append(i.f136b);
        sb.append(h5);
        sb.append(i.f136b);
        sb.append(h());
        sb.append(i.f136b);
        sb.append(this.f20804b);
        sb.append(i.f136b);
        sb.append(k5);
        sb.append(i.f136b);
        sb.append(j5);
        sb.append(i.f136b);
        sb.append(m5);
        sb.append(i.f136b);
        sb.append(l5);
        if (aVar2 != null) {
            String b6 = c1.b.b(aVar, c5, z0.a.a(c5).i(), c1.b.d(aVar, c5));
            if (!TextUtils.isEmpty(b6)) {
                sb.append(";;;");
                sb.append(b6);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

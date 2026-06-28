package a1;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static String f142a;

    public static String a(Context context) {
        String str;
        if (TextUtils.isEmpty(f142a)) {
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                e.d(th);
                str = "";
            }
            f142a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f142a;
    }

    public static synchronized String b(y0.a aVar, Context context, String str, String str2) {
        String str3;
        synchronized (j.class) {
            str3 = null;
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                if (!TextUtils.isEmpty(string)) {
                    str3 = o0.e.a(a(context), string, str);
                }
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                    i0.a.i(aVar, i0.b.f16159m, i0.b.F, String.format("%s,%s", str, string));
                }
            } catch (Exception e5) {
                e.d(e5);
            }
        }
        return str3;
    }

    public static synchronized boolean c(Context context, String str) {
        boolean z4;
        synchronized (j.class) {
            try {
                z4 = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
            } catch (Throwable th) {
                e.d(th);
                z4 = false;
            }
        }
        return z4;
    }

    public static synchronized void d(Context context, String str) {
        synchronized (j.class) {
            try {
                PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
            } catch (Throwable th) {
                e.d(th);
            }
        }
    }

    public static synchronized void e(y0.a aVar, Context context, String str, String str2) {
        synchronized (j.class) {
            try {
                String c5 = o0.e.c(a(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(c5)) {
                    i0.a.i(aVar, i0.b.f16159m, i0.b.G, String.format("%s,%s", str, str2));
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, c5).apply();
            } catch (Throwable th) {
                e.d(th);
            }
        }
    }
}

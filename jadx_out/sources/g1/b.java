package g1;

import a1.e;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import org.json.JSONObject;
import u0.c;

/* loaded from: classes2.dex */
public class b {
    public static a a(Context context, z0.a aVar) {
        if (aVar != null && !aVar.n()) {
            return new a(aVar.i(), aVar.h(), aVar.j().longValue());
        }
        return null;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        y0.b.e().b(context);
    }

    public static a c(Context context) throws Exception {
        try {
            s0.b h5 = new c().h(y0.a.w(), context);
            if (h5 != null) {
                JSONObject jSONObject = new JSONObject(h5.a());
                z0.a a5 = z0.a.a(context);
                String optString = jSONObject.optString("tid");
                String string = jSONObject.getString(z0.a.f22712j);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(string)) {
                    a5.c(optString, string);
                }
                return a(context, a5);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void d(Context context) {
        z0.a.a(context).b();
    }

    public static String e(Context context) {
        b(context);
        return a1.c.c(context).d();
    }

    public static String f(Context context) {
        b(context);
        return a1.c.c(context).e();
    }

    public static synchronized String g(Context context) {
        String a5;
        synchronized (b.class) {
            a k5 = k(context);
            if (a.d(k5)) {
                a5 = "";
            } else {
                a5 = k5.a();
            }
        }
        return a5;
    }

    public static String h(Context context) {
        b(context);
        m0.b.f();
        return m0.b.j();
    }

    public static String i(Context context) {
        b(context);
        m0.b.f();
        return m0.b.k();
    }

    public static a j(Context context) {
        z0.a a5 = z0.a.a(context);
        if (a5.m()) {
            return null;
        }
        return new a(a5.i(), a5.h(), a5.j().longValue());
    }

    public static synchronized a k(Context context) {
        synchronized (b.class) {
            e.g(k0.a.A, "load_create_tid");
            b(context);
            a l5 = l(context);
            if (a.d(l5)) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return null;
                }
                try {
                    l5 = c(context);
                } catch (Throwable unused) {
                }
            }
            return l5;
        }
    }

    public static a l(Context context) {
        b(context);
        a a5 = a(context, z0.a.a(context));
        if (a5 == null) {
            e.g(k0.a.A, "load_tid null");
        }
        return a5;
    }

    public static boolean m(Context context) throws Exception {
        a aVar;
        e.g(k0.a.A, "reset_tid");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            b(context);
            d(context);
            try {
                aVar = c(context);
            } catch (Throwable unused) {
                aVar = null;
            }
            if (a.d(aVar)) {
                return false;
            }
            return true;
        }
        throw new Exception("Must be called on worker thread");
    }
}
